/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.controllers.csNotification;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.StiCsexposeinfant;
import com.vmmc.services.CompleteCSInfant;
import com.vmmc.services.CompletedCSExposedInfant;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import com.vmmc.services.StiCsexposeinfantableImpl;
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
@WebServlet(name = "syphilisExposedPatientCard", urlPatterns = {"/syphilisExposedPatientCard"})
public class syphilisExposedPatientCard extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet syphilisExposedPatientCard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet syphilisExposedPatientCard at " + request.getContextPath() + "</h1>");
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
       String infantId = temp[0];
      // String opdNum= temp[1];
        CompletedCSExposedInfant cptdVmmcClient = new CompletedCSExposedInfant(infantId);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteCSInfant cgpt = new CompleteCSInfant(infantId);
        PatientModel pm = new PatientModel();
        // PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
       // pm.setAddress(add);
        pm.setExposeinfant(cgpt.getP());

         pm.setExposeinfant(cgpt.getP());
        StiCsexposeinfantableImpl test = new StiCsexposeinfantableImpl();
        StiCsexposeinfant stiexposedinf=test.getCSCase(infantId);
        
       
      
        
        //request.setAttribute("htsPurpose",htsPurpose);
        request.setAttribute("stiexposedinf", stiexposedinf);
      
      
        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("stics/syphilisExposedPatientCard.jsp").forward(request, response);
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
