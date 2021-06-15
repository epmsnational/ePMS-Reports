/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.controllers.csNotification;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.StiCs;
import com.vmmc.services.CompleteCSNotification;
import com.vmmc.services.CompletedCSNotificationAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import com.vmmc.services.StiCSableImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohcc-ATP
 */
@WebServlet(name = "CSNotificationPatientCard", urlPatterns = {"/CSNotificationPatientCard"})
public class CSNotificationPatientCard extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CSNotificationPatientCard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CSNotificationPatientCard at " + request.getContextPath() + "</h1>");
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
       String stinumber = temp[0];
       //String stinumber= temp[1];
        CompletedCSNotificationAll cptdVmmcClient = new CompletedCSNotificationAll(stinumber);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteCSNotification cgpt = new CompleteCSNotification(stinumber);
        PatientModel pm = new PatientModel();
        // PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
       // pm.setAddress(add);
        pm.setStics(cgpt.getP());

         pm.setStics(cgpt.getP());
        StiCSableImpl test = new StiCSableImpl();
        StiCs stics=test.getCSCase(stinumber);
        
       
        request.setAttribute("stics", stics);
      
      
        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("stics/CSNotificationPatientCard.jsp").forward(request, response);
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
