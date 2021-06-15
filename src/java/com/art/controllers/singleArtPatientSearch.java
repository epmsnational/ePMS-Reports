/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ignatious
 */
public class singleArtPatientSearch extends HttpServlet {

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
            out.println("<title>Servlet singleArtPatientSearch</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet singleArtPatientSearch at " + request.getContextPath() + "</h1>");
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
        Facilities config = facility.getFacilityName(province, district, facili);
        request.setAttribute("facilityName", config.getFacilityName());

        RequestDispatcher disp = request.getRequestDispatcher("art/SearchError.jsp");
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
        String patientId = request.getParameter("txtARTNum");
        
        CircumcisablePatientImpl OIARTpp = new CircumcisablePatientImpl();
        
        List<Patient> pList = OIARTpp.getOIPatient(patientId);
        if(pList.size() > 0){
            Patient p = OIARTpp.getOIArtPatient(patientId);
            CompletedARTClientAll client = new CompletedARTClientAll(patientId);
            
            client.getVisits();
            
            client.setP(p);
            
            request.getSession().setAttribute("client",client);
            RequestDispatcher disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
                disp.forward(request, response);
            
        }
        else{
            response.sendRedirect("singleArtPatientSearch");
        }
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
