/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbs.controllers;
import com.vmmc.entities.Cbs;
import com.vmmc.entities.CbsTests;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.PatientAddress;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.cbsablePatientImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DevOOP
 */
@WebServlet(name = "CbsPatientCard", urlPatterns = {"/CbsPatientCard"})
public class CbsPatientCard extends HttpServlet {

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
            out.println("<title>Servlet CbsPatientCard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CbsPatientCard at " + request.getContextPath() + "</h1>");
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
        
       String temp=request.getQueryString();
       String opdNum= temp;
       CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
       PatientModel pm = new PatientModel();
       PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
       pm.setAddress(add);
       pm.setPatient(cgp.getP());
       cbsablePatientImpl cbs = new cbsablePatientImpl();
       Cbs cbss = cbs.getCbsPatient(opdNum); 
       CbsTests cbtest = cbs.getCbsTests(opdNum);
       pm.setCbsPatient(cgp.getCblist());
       
//       CbsTests cbsTests = cbs.getCbsTests(opdNum);
//       request.setAttribute("cbsTests",cbsTests);
       
       request.setAttribute("pmodel", pm);
       request.setAttribute("model", cbss);
       request.setAttribute("tmodel", cbtest);
       request.getRequestDispatcher("cbs/cbsPatientCard.jsp").forward(request, response);
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
        processRequest(request, response);
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
