/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.controllers;


import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Sti;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedStiClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import com.vmmc.services.StiTestableImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Training3
 */
public class StiPatientCard extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StiPatientCard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StiPatientCard at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        
String []temp=request.getQueryString().split("&");
       String stiNo = temp[0];
       String opdNum= temp[1];
        CompletedStiClientAll cptdVmmcClient = new CompletedStiClientAll(stiNo);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgpt = new CompleteGenericPatient(opdNum);
        PatientModel pm = new PatientModel();
        // PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
       // pm.setAddress(add);
        pm.setPatient(cgpt.getP());

         pm.setPatient(cgpt.getP());
        StiTestableImpl test = new StiTestableImpl();
        Sti sti=test.getStiPatient(stiNo);
        
       
      
        
        //request.setAttribute("htsPurpose",htsPurpose);
        request.setAttribute("sti", sti);
        //put referal info in request
       // request.setAttribute("referredFrom", referredFrom);
       // request.setAttribute("htsModel", htsModel);
       // HtcHivresultServiceImpl results = new HtcHivresultServiceImpl();
      //  pm.setHtsResults(results.getHivTests(opdNum));
      
        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("sti/stiPatientCard.jsp").forward(request, response);

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
