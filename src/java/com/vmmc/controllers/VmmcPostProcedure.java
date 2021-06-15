/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import static com.vmmc.controllers.VmmcPatient.setup;
import com.vmmc.entities.Adverseeventtype;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Riskreductionplantype;
import com.vmmc.entities.Setupstaff;
import com.vmmc.entities.Visitplans;
import com.vmmc.entities.VmmcVisits;
import com.vmmc.services.CompletedVmmcClientAll;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.PlannableVisitImpl;
import com.vmmc.services.VmmcDateUtil;
import com.vmmc.services.VmmcVisitServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
@WebServlet(name = "VmmcPostProcedure", urlPatterns = {"/VmmcPostProcedure"})
public class VmmcPostProcedure extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VmmcPostProcedure</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VmmcPostProcedure at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Setupstaff> lstStaff = setup.getAllStaff();
        request.setAttribute("Setupstaff", lstStaff);
        
        List<Adverseeventtype> lstAdverseEventsType = setup.getAdverseEventTypes();
        request.setAttribute("Adverseeventtype", lstAdverseEventsType);        
        List<Riskreductionplantype> lstRiskreductionplantype = setup.getRiskReductionPlanTypes();
        request.setAttribute("Riskreductionplantype", lstRiskreductionplantype);
        //get completed client fro session and get the right visit fro the contained scheduled visits therein
         HttpSession session = request.getSession();
        CompletedVmmcClientAll completedClient = (CompletedVmmcClientAll) session.getAttribute("client");
        Visitplans plan= null;
        long planId=0;
         String temp = request.getQueryString();
         planId = Long.parseLong(temp);
        if(planId>0)
        {
            for(Visitplans v : completedClient.getVisitPlans())
            {
                if(v.getVpId()==planId)
                    plan=v;
            }
        }
        String checking= null;
       // Date checkDate = new Date();
        // Calendar cale = Calendar.getInstance();
           // DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            
            Timestamp tt = null;
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String parsedDate = formatter.format(plan.getVisitPlanDate());
                tt = Timestamp.valueOf(parsedDate);

            } catch (Exception pe) {
                pe.printStackTrace();
            }
            
             int num1=(int)EpmsDuration.getDays(tt);
//            try{
//                 cale.setTime(VmmcDateUtil.makeDate(d1));   
//                num1 = VmmcDateUtil.DateDiff(cale.getTime(), checkDate);
//                }
//            catch(Exception ee){}
            if(num1==0)
              checking="ontime";
            else if(num1>0)
                checking="late";
            else
                checking ="before";
         //put plan in session for use in doPost
         request.getSession().setAttribute("plan", plan);
        //request.setAttribute("plan", plan);
        request.setAttribute("checking", checking);
        //update the visit plan
       // PlannableVisitImpl pvi = new PlannableVisitImpl();
       //  plan.setIsDone(Boolean.TRUE);
        //pvi.edit(plan);
         RequestDispatcher disp;
            disp = request.getRequestDispatcher("/vmmc/vmmcPostProcedureVisit.jsp");
        disp.forward(request, response);         
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
 ///// Molding patient Visits
        Patient p = (Patient) session.getAttribute("patient");
        // processRequest(request, response);
        String vmmcNumber = request.getParameter("txtvmmcNum");
        String visitDate = request.getParameter("txtVisitDate");
        String visitinterval = request.getParameter("rdIsInterval");
        String nurseOrDoctor = request.getParameter("txtVisitStaff");
        String anyAverseevent = request.getParameter("rdIsAdverse");
        String averseEventCode = request.getParameter("txtAECode");
        String severinity = request.getParameter("rdIsSeverity");
       
        Visitplans plan = (Visitplans)request.getSession().getAttribute("plan");
        Date visitD = null;

        DateFormat vsd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            visitD = vsd.parse(visitDate+ " 00:00:00");
//   
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        
        //// Adding to database 
        
        VmmcVisitServiceImpl vmvsImpl = new VmmcVisitServiceImpl();
        VmmcVisits vmcvis = new VmmcVisits();
        
        vmcvis.setVisitDate(visitD);
        vmcvis.setAnyAdverseEvent(anyAverseevent);
        vmcvis.setSeverity(severinity);
        vmcvis.setVisitInterval(visitinterval);
        vmcvis.setVisitInterval(visitinterval);
        vmcvis.setIfYesAecode(averseEventCode);
        
        vmvsImpl.add(vmcvis);
        //update the visit plan
        
        PlannableVisitImpl pvi = new PlannableVisitImpl();
       
        if(plan!=null)
        {
             plan.setIsDone(Boolean.TRUE);
            pvi.edit(plan);
        }
        request.getSession().removeAttribute("plan");
        RequestDispatcher disp = request.getRequestDispatcher("/vmmc/visitplans.jsp");
        disp.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
