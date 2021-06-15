/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.cbsablePatientImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author System Devoloper
 */
@WebServlet(name = "ProgReferred", urlPatterns = {"/ProgReferred"})
public class ProgReferred extends HttpServlet {

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

        String tempClient = request.getQueryString();
        String[] arr = tempClient.split("&");
        String prog = arr[0].split("=")[1].trim();
        String opdNum = arr[1].split("=")[1].trim();
        RequestDispatcher disp = null;

        switch (prog) {

            case "ART":
//                Patient artpatient = new CircumcisablePatientImpl().getPatient(opdNum);
//                request.getSession().setAttribute("patient", artpatient);
                if (canAdvanceOI(opdNum, request)) {
                    request.setAttribute("opdNum", opdNum);
                    //new VmmcPatient().doGet(request, response);  
                    response.sendRedirect("ARTPatientManual");
                } else {
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                }
                break;
            case "VMMC":
                if (canAdvance(opdNum, request)) {
                    request.setAttribute("opdNum", opdNum);
                    //new VmmcPatient().doGet(request, response);  
                    response.sendRedirect("VmmcPatient");
                } else {
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
                }
                break;
            case "HTS":
                Patient patient = new CircumcisablePatientImpl().getPatient(opdNum);
                request.getSession().setAttribute("patient", patient);
                request.setAttribute("opdNum", opdNum);
                // new HtsPatient().doGet(request, response);  
                response.sendRedirect("HtsPatient");
                break;
            case "STI":
                Patient stipatient = new CircumcisablePatientImpl().getPatient(opdNum);
                request.getSession().setAttribute("patient", stipatient);
                request.setAttribute("opdNum", opdNum);
                // new HtsPatient().doGet(request, response);  
                response.sendRedirect("AddNewSti");
                break;
            ///STIcSExposedInfant
            case "EI":
                Patient patientEI = new CircumcisablePatientImpl().getPatient(opdNum);
                request.getSession().setAttribute("patient", patientEI);
                request.setAttribute("opdNum", opdNum);
                // new HtsPatient().doGet(request, response);  
                response.sendRedirect("ExposedInfantPatient");
                break;
            //
            case "EID":

                if (canAdvanceEID(opdNum, request)) {
                    request.setAttribute("opdNum", opdNum);

                    response.sendRedirect("EidPatient");
                } else {
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                }
                break;

            case "CS":
                //Patient patientCBS = new CircumcisablePatientImpl().getPatient(opdNum);
                if (canAdvanceCS(opdNum, request)) {
                    request.setAttribute("opdNum", opdNum);
                    response.sendRedirect("STICS");
                    //response.sendRedirect("STIcSExposedInfant");
                } else {
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                }
                break;

            case "CBS":
                if (canAdvanceCBS(opdNum, request)) {
                    Patient patientCBS = new CircumcisablePatientImpl().getPatient(opdNum);
                    request.getSession().setAttribute("patient", patientCBS);
                    request.setAttribute("opdNum", opdNum);
                    response.sendRedirect("NotificationAdults");
                } else {
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                }
                break;
            case "CBSCIF":
                if (canAdvanceCBS(opdNum, request)) {
                    Patient patientCBSCIF = new CircumcisablePatientImpl().getPatient(opdNum);
                    request.getSession().setAttribute("patient", patientCBSCIF);
                    request.setAttribute("opdNum", opdNum);

                    response.sendRedirect("DirectInfants");
                } else {
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                }
                break;

            case "TT":

                response.sendRedirect("AllClients");
                break;

        }

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

    private boolean canAdvance(String opdNum, HttpServletRequest request) {
        boolean retVal = true;
        Patient patient = new CircumcisablePatientImpl().getPatient(opdNum);
        if (patient.getSex().equalsIgnoreCase("Female")) {
            request.setAttribute("errorvmmc", "f");
            retVal = false;
        }
        if (patient.getVmmcId() != null) {
            request.setAttribute("errorvmmc", "exist");
            retVal = false;
        }

        //put the patient in session however
        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);
        return retVal;
    }

    private boolean canAdvanceOI(String opdNum, HttpServletRequest request) {
        boolean retVal = true;
        Patient patient = new CircumcisablePatientImpl().getPatient(opdNum);

        if (patient.getPatientId() != null) {
            request.setAttribute("errorvmmc", "existOI");
            retVal = false;
        }
        //put the patient in session however
        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);
        return retVal;
    }

    private boolean canAdvanceCBS(String opdNum, HttpServletRequest request) {
        boolean retVal = true;
        Patient patient = new CircumcisablePatientImpl().getPatient(opdNum);
        int cbspat = new cbsablePatientImpl().existsDirect(opdNum);

        if (cbspat != 0) {
            request.setAttribute("errorvmmc", "existCBS");
            retVal = false;
        }
        //put the patient in session however
        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);
        return retVal;
    }

    private boolean canAdvanceEID(String opdNum, HttpServletRequest request) {
        boolean retVal = true;
        float x = 2.0f;

        float age = 0;

        Patient patient = new CircumcisablePatientImpl().getPatient(opdNum);

        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(patient.getDob().toString());
        Date date = patient.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        patient.setAge(age);

        if (patient.getAge() >= 2) {
            request.setAttribute("errorvmmc", "gothroughHTS");
            retVal = false;
        }
        //put the patient in session however
        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);
        return retVal;
    }

    private boolean canAdvanceCS(String opdNum, HttpServletRequest request) {
        boolean retVal = true;
        float x = 2.0f;

        float age = 0;

        Patient patient = new CircumcisablePatientImpl().getPatient(opdNum);

        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(patient.getDob().toString());
        Date date = patient.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        patient.setAge(age);

        if (patient.getAge() >= 2) {
            request.setAttribute("errorvmmc", "gothroughHTS");
            retVal = false;
        }
        //put the patient in session however
        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);
        return retVal;
    }
}
