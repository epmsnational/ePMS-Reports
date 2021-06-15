/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chihw
 */
public class SetupFacility extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SetupFacility</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SetupFacility at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FacilityConfigServiceImpl service = new FacilityConfigServiceImpl();
        
        Facilityconfig siteCode = service.getFacilitySite();
        
        request.setAttribute("siteCode",siteCode);
        RequestDispatcher disp = request.getRequestDispatcher("useraccounts/facility.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String provinceCode = request.getParameter("provincecode");
        String districtCode = request.getParameter("districtcode");
        String facilityCode = request.getParameter("facilitycode");
        String facilityName = request.getParameter("facilityname");
        
        int province = Integer.valueOf(provinceCode);
        String fullCode = provinceCode + districtCode + facilityCode;
        String fullCodeDashed = provinceCode +"-"+ districtCode +"-"+ facilityCode;
        
        Facilities faciData = new Facilities();
        FacilityConfig facility = new FacilityConfig();
        
        faciData.setProvinceCode(province);
        faciData.setDistrictCode(districtCode);
        faciData.setFacilityCode(facilityCode);
        faciData.setFacilityName(facilityName);
        faciData.setFullFacilityCode(fullCode);
        faciData.setFullFacilityCodeDashes(fullCodeDashed);
        
        facility.add(faciData);
        
        response.sendRedirect("MainDashboard");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
