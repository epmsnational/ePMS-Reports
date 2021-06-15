/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Highviralload;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tbltests;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtTestsImpl;
import com.vmmc.services.highViralPatientImpl;
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
import java.text.SimpleDateFormat;

/**
 *
 * @author devoop
 */
@WebServlet(name = "ARTHighVRLForm", urlPatterns = {"/ARTHighVRLForm"})
public class ARTHighVRLForm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.import java.util.Date;
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
            out.println("<title>Servlet ARTHighVRLForm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ARTHighVRLForm at " + request.getContextPath() + "</h1>");
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
        String patientID = temp[0];
        String viralLoad = temp[1];
        
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();
        Patient patient = pat.getOIArtPatient(patientID);
        
        request.setAttribute("patientID", patient);
        request.setAttribute("viralLoad", viralLoad);
        // 
        RequestDispatcher disp = request.getRequestDispatcher("art/OIARTHighVRLRequestForm.jsp");
        disp.forward(request, response);

        
        
        processRequest(request, response);
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
        
        //Step 1: EAC
        String artnumber = request.getParameter("artNumber");
        String firstSession = request.getParameter("txtfirstSession");
        String repeatedVlDate = request.getParameter("repeatedVlDate");
        String assessmentDate = request.getParameter("assessmentDate");
        String counsellorName = request.getParameter("counsellorName");
        String firstSessionDate = request.getParameter("firstSessionDate");
        String firstSessionSummary = request.getParameter("firstSessionSummary");
        String arvIntake = request.getParameter("arvIntake");
        String secondSession = request.getParameter("secondSession");
        String secondSessionDate = request.getParameter("secondSessionDate");
        String arvIntake2 = request.getParameter("arvIntake2");
        String secondSessionSummary = request.getParameter("secondSessionSummary");
        String extraSession = request.getParameter("extraSession");
        String extraSessionDate = request.getParameter("extraSessionDate");
        String arvIntake3 = request.getParameter("arvIntake3");
        String extraSessionSummary = request.getParameter("extraSessionSummary");

        //Step 2: OUTCOME
        String viralLoadResult = request.getParameter("viralLoadResult");
        String arvRegimenValuation = request.getParameter("arvRegimenValuation");
        String nurseAssessmentDate = request.getParameter("nurseAssessmentDate");
        String nurseName = request.getParameter("nurseName");
       
        
        //Step 3: OUTCOME (Persistent higher Viral)
        String regimenValuation = request.getParameter("regimenValuation");
        String comments = request.getParameter("comments");
        String doctorName = request.getParameter("doctorName");
        String doctorDate = request.getParameter("doctorDate");
        
        
         //Dates
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp collectionRepeatedVLDate = null;
        Timestamp eacAssessmentDate = null;
        Timestamp firstSessionDay = null;
        Timestamp secondSessionDay = null;
        Timestamp extraSessionDay = null;
        Timestamp nurseAssessmentDay = null;
        Timestamp doctorAssessmentDay = null;

        try {
            Date repeatedDate = formatter.parse(repeatedVlDate + " 00:00:00");
            collectionRepeatedVLDate = new java.sql.Timestamp(repeatedDate.getTime());

            Date assessmentDate1 = formatter.parse(assessmentDate + " 00:00:00");
            eacAssessmentDate = new java.sql.Timestamp(assessmentDate1.getTime());
            
            Date firstSessionDate1 = formatter.parse(firstSessionDate + " 00:00:00");
            firstSessionDay = new java.sql.Timestamp(firstSessionDate1.getTime());
            
            Date secondSessionDate1 = formatter.parse(secondSessionDate + " 00:00:00");
            secondSessionDay = new java.sql.Timestamp(secondSessionDate1.getTime());
            
            Date extraSessionDate1 = formatter.parse(extraSessionDate + " 00:00:00");
            extraSessionDay = new java.sql.Timestamp(extraSessionDate1.getTime());
            
            Date nurseAssessmentDate1 = formatter.parse(nurseAssessmentDate + " 00:00:00");
            nurseAssessmentDay = new java.sql.Timestamp(nurseAssessmentDate1.getTime());
            
            Date doctorAssessmentDate1 = formatter.parse(doctorDate + " 00:00:00");
            doctorAssessmentDay = new java.sql.Timestamp(doctorAssessmentDate1.getTime());

        } catch (Exception pe) {
            pe.printStackTrace();
        }
        
        highViralPatientImpl viral = new highViralPatientImpl();
        Highviralload high = new Highviralload();
        
         //Step 1:
        high.setPatientId(artnumber);
        high.setFirstSession(firstSession);
        high.setRepeatedVlDate(collectionRepeatedVLDate);
        high.setAssessmentDate(eacAssessmentDate);
        high.setCounsellorName(counsellorName);
        high.setFirstSessionDate(firstSessionDay);
        high.setFirstSessionSummary(firstSessionSummary);
        high.setArvIntake(arvIntake);
        high.setSecondSession(secondSession);
        high.setSecondSessionDate(secondSessionDay);
        high.setArvIntake2(arvIntake2);
        high.setSecondSessionSummary(secondSessionSummary);
        high.setExtraSession(extraSession);
        high.setExtraSessionDate(extraSessionDay);
        high.setArvIntake3(arvIntake3);
        high.setExtraSessionSummary(extraSessionSummary);
        
        
        //Step 2:
        high.setViralLoadResult(viralLoadResult);
        high.setArvRegimenValuation(arvRegimenValuation);
        high.setNurseAssessmentDate(nurseAssessmentDay);
        high.setNurseName(nurseName);
       
        //Step 3:AllNotifications
        high.setRegimenValuation(regimenValuation);
        high.setComments(comments);
        high.setDoctorDate(doctorAssessmentDay);
        high.setDoctorName(doctorName);
        
        if(viral.add(high)== 1){
            Tbltests tests = new Tbltests();
        OIArtTestsImpl data = new OIArtTestsImpl();
        Tblpatients patId = new Tblpatients();
        patId.setPatientId(artnumber);
        
        float result = Integer.valueOf(viralLoadResult);
        
        tests.setTblpatients(patId);
        tests.setResultNumeric(result);
        tests.setTestTypeId("VRL");
        tests.setTestDate(collectionRepeatedVLDate);
        tests.setResultDate(collectionRepeatedVLDate);
        tests.setResultNotes(comments);
        
        data.AddArtTest(tests);
        }
        
        
         response.sendRedirect("ARTHighVRL");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
