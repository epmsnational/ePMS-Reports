/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblpatients;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
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
@WebServlet(name = "ARTPatientDetails", urlPatterns = {"/ARTPatientDetails"})
public class ARTPatientDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ARTPatientDetails</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ARTPatientDetails at " + request.getContextPath() + "</h1>");
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
        
        String[] temp = request.getQueryString().split("&");
        String artNo = temp[0];
        String opdNum = temp[1];
        CompletedARTClientAll cptdARTClient = new CompletedARTClientAll(artNo);
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        PatientModel pm = new PatientModel();
        pm.setPatient(cgp.getP());
        
        Tblpatients artpatient = cptdARTClient.getPatients().size() > 0 ? cptdARTClient.getPatients().get(0) : null; //1.
        pm.setOiartpatient(artpatient);
        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("art/AllOIARTEdit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
