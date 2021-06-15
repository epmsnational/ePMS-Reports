/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Visitplans;
import com.vmmc.services.CompletedVmmcClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PlannableVisitImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author System Devoloper
 */
@WebServlet(name = "AdditionalVisit", urlPatterns = {"/AdditionalVisit"})
public class AdditionalVisit extends HttpServlet {

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
            out.println("<title>Servlet AdditionalVisit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdditionalVisit at " + request.getContextPath() + "</h1>");
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
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();
        
        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province,district,facili);
        request.setAttribute("facilityName",config.getFacilityName());
        //processRequest(request, response);
      request.getRequestDispatcher("vmmc/appointments.jsp").forward(request, response);
      
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
       String dateMade = request.getParameter("txtDateMade");
       String dateGiven = request.getParameter("txtDateGiven");
       String note = request.getParameter("notes");
       String authority = request.getParameter("authority");
       HttpSession session =request.getSession();
       CompletedVmmcClientAll completedClient = (CompletedVmmcClientAll) session.getAttribute("client");
       String vmmcId = completedClient.getP().getVmmcId();
       String opdNum=completedClient.getP().getOpdnumber();
       Date d1=null;
       try
       {
            Timestamp stamp = Timestamp.valueOf(dateMade+ " 00:00:00");
            d1=stamp;
            
           
       }
       catch(Exception er)
       {
            er.printStackTrace();
       }
        Visitplans vp = new  Visitplans(d1, authority, Boolean.FALSE, new Date(), dateMade, vmmcId, opdNum);
        PlannableVisitImpl pv = new PlannableVisitImpl();
        
        pv.add(vp);
        // add a visit plan to the client before putting it back to the session
        completedClient.getVisitPlans().add(vp);
        session.setAttribute("client",completedClient);
        
        //now dispatch to the visit plans
        RequestDispatcher disp = request.getRequestDispatcher("vmmc/visitplans.jsp");
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
