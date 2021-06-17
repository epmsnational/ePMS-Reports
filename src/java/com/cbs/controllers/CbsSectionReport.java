/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbs.controllers;

import com.reports.controllers.GenerateCbsReport;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ignatious
 */
public class CbsSectionReport extends HttpServlet {

    GenerateCbsReport gen =new GenerateCbsReport();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CbsSectionReport</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CbsSectionReport at " + request.getContextPath() + "</h1>");
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
        
        request.getRequestDispatcher("reporsFilteringtJsps/reportArtCbs.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String relativeWebPath = "/WEB-INF/jasper/zimepms.jrxml";
        String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
//        File file = new File(absoluteDiskPath);
//        InputStream input = new FileInputStream(file);
        
        String Date = request.getParameter("txtRptStartDate");
        Date conv = dateConvertor(Date);
        
        int repo = gen.generateReport(conv,absoluteDiskPath);
        if(repo == 1){
            response.sendRedirect("CbsReportGeneration");
        }
    }
    
    public Date dateConvertor(String sDate) {
        Date dates;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp startDate = null;
        try {
            Date parsedFormCompleted = formatter.parse(sDate);
            startDate = new java.sql.Timestamp(parsedFormCompleted.getTime());

        } catch (Exception pw) {
            pw.printStackTrace();
        }
        dates = startDate;

        return dates;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
