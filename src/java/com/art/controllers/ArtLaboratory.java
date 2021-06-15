/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Laboratory;
import com.vmmc.entities.Patient;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.LaboratoryData;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chihw
 */
public class ArtLaboratory extends HttpServlet {

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
            out.println("<title>Servlet ArtLaboratory</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArtLaboratory at " + request.getContextPath() + "</h1>");
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
        
        String[] temp = request.getQueryString().split("&");
        String oinumber = temp[0];
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();

        Patient patient = pat.getOIArtPatient(oinumber);
        request.setAttribute("patient", patient);

        request.getRequestDispatcher("art/Laboratory.jsp").forward(request, response);
        
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
        String patientID = request.getParameter("Resultpatientid");
        String testType = request.getParameter("Resultteststype");
        String testDate = request.getParameter("testDate");
        String facilityReceivedDate = request.getParameter("facreceivedDate");
        String patientReceivedDate = request.getParameter("patreceivedDate");
        String result = request.getParameter("result");
        
        
        int resultFinal = Integer.valueOf(result);
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp testD = null;
        Timestamp facilityD = null;
        Timestamp patientD = null;

        try {

            Date parsedtestDate = formatter.parse(testDate + " 00:00:00");
            testD = new java.sql.Timestamp(parsedtestDate.getTime());
            
            Date parsedfacilityReceivedDate = formatter.parse(facilityReceivedDate + " 00:00:00");
            facilityD = new java.sql.Timestamp(parsedfacilityReceivedDate.getTime());
            
            Date parsepatientReceivedDate = formatter.parse(patientReceivedDate + " 00:00:00");
            patientD = new java.sql.Timestamp(parsepatientReceivedDate.getTime());

        } catch (Exception pw) {
            pw.printStackTrace();
        }
        
        Laboratory lab = new Laboratory();
        
        lab.setPatientId(patientID);
        lab.setPatientReceivedDate(patientD);
        lab.setReceivedDate(facilityD);
        lab.setTestDate(testD);
        lab.setTestType(testType);
        lab.setResult(resultFinal);
        
        LaboratoryData data = new LaboratoryData();
        data.add(lab);
        
        response.sendRedirect("AllOIARTServ");
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
