/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.controllers;

import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientDiagnosis;
import com.vmmc.entities.VmmcCircumcisionmethod;
import com.vmmc.entities.VmmcCircumcisionreason;
import com.vmmc.entities.VmmcComplaints;
import com.vmmc.entities.VmmcGeneralcondition;
import com.vmmc.entities.VmmcGenitalexam;
import com.vmmc.entities.VmmcMedicalscreening;
import com.vmmc.entities.VmmcReferredfrom;
import com.vmmc.entities.VmmcService;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedVmmcClientAll;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Training3
 */
public class StiPatientCard_1 extends HttpServlet {

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
        
        String []temp=request.getQueryString().split("&");
       String vmmcNo = temp[0];
       String opdNum= temp[1];
        CompletedVmmcClientAll cptdVmmcClient = new CompletedVmmcClientAll(vmmcNo);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        PatientModel pm = new PatientModel();
         PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
        pm.setAddress(add);
       
        pm.setPatient(cgp.getP());
         
        VmmcMedicalscreening vms = cptdVmmcClient.getVms().size()>0? cptdVmmcClient.getVms().get(0):null; //1.
        pm.setVmmcMedScreening(vms);
         VmmcCircumcisionmethod vcm = cptdVmmcClient.getVcm().size()>0? cptdVmmcClient.getVcm().get(0):null; //1.
         pm.setVmmcCircumMethod(vcm);
         
        //pm.setVmmcComplaints(cptdVmmcClient.getVc());
        List<String> complaints = new ArrayList<>();
         Map<Integer,String> map3= setup.getComplainTypes(true);
        for(VmmcComplaints rf: cptdVmmcClient.getVc())
        {
           complaints.add(map3.get(rf.getComplaintTypeId()));
        }
        //pm.setVmmcService(cptdVmmcClient.getVs());
        List<String> services = new ArrayList<>();
         Map<Integer,String> map5= setup.getVmmcServiceTypes(true);
        for(VmmcService rf: cptdVmmcClient.getVs())
        {
           services.add(map5.get(rf.getVmmcserviceTypeId()));
        }
        
        
        
        //pm.setVmmcGeneralCondition(cptdVmmcClient.getVgc());
         List<String> generalconditions = new ArrayList<>();
         Map<Integer,String> map7= setup.getDiagnosisTypes(true);
        for(VmmcGeneralcondition rf: cptdVmmcClient.getVgc())
        {
           generalconditions.add(map7.get(rf.getGeneralConditionTypeId()));
        }
        
        
        //pm.setVmmcGenExam(cptdVmmcClient.getVge());
        List<String> genitalexam = new ArrayList<>();
         Map<Integer,String> map8= setup.getCircumcisionReasonTypes(true);
        for(VmmcGenitalexam rf: cptdVmmcClient.getVge())
        {
           genitalexam.add(map8.get(rf.getGenitalExamTypeId()));
        }
        
        
        
//        List<String> referredTempList= new ArrayList<>();
//        Map<Integer,String> map= mapReferredFrom();
//        for(VmmcReferredfrom rf: cptdVmmcClient.getVff())
//        {
//           referredTempList.add(map.get(rf.getReferredFromId()));
//        }
             
        
            
      
        //pm.setVmmcPatientDiagnosis(cptdVmmcClient.getPd());
         List<String> diagnosis = new ArrayList<>();
         Map<Integer,String> map6= setup.getDiagnosisTypes(true);
        for(PatientDiagnosis rf: cptdVmmcClient.getPd())
        {
           diagnosis.add(map6.get(rf.getDiagnosisTypeId()));
        }
        
        //pm.setVmmcCircumcisionReason(cptdVmmcClient.getVcr());
        List<String> reasons = new ArrayList<>();
         Map<Integer,String> map2= setup.getCircumcisionReasonTypes(true);
        for(VmmcCircumcisionreason rf: cptdVmmcClient.getVcr())
        {
           reasons.add(map2.get(rf.getCircumcisionReasonTypeId()));
        }
        request.setAttribute("genitalexam", genitalexam);
        request.setAttribute("generalconditions", generalconditions);
        request.setAttribute("diagnosis", diagnosis);
        request.setAttribute("services",services);
         request.setAttribute("reasons",reasons);
//        request.setAttribute("referredFrom",referredTempList);
        request.setAttribute("complaints", complaints);
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
