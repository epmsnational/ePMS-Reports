/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.Tblbaselinetests;
import com.vmmc.entities.Tblmedication;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblpatientspriorexposure;
import com.vmmc.entities.Tblpatientsproblems;
import com.vmmc.entities.Tblproblems;
import com.vmmc.entities.Tblreferralsto;
import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.TblvisitsId;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtSetupArtRegimensImpl;
import com.vmmc.services.OIArtVisitableImpl;
import com.vmmc.services.OIArtiable;
import com.vmmc.services.OIArtiableImpl;
import com.vmmc.services.PatientModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author systems_developer
 */
public class ArtVisitClientCard extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        {

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

        String patientString = request.getQueryString().replace("%", " ");
        String[] arr = patientString.split("&");
        String visdate = arr[0];
        String patientId = arr[1];

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date visitdate = null;
        try {
            visitdate = sdf.parse(visdate);
        } catch (ParseException ex) {
            Logger.getLogger(ArtVisitClientCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        String opdNum = request.getQueryString();
        if (opdNum == null) {
            opdNum = (String) request.getAttribute("opdNum");
        }

        CompletedARTClientAll client = new CompletedARTClientAll(patientId, visitdate);
        OIArtVisitableImpl artp = new OIArtVisitableImpl();
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();
        Patient p = pat.getOIArtPatient(patientId);
        PatientModel pm = new PatientModel();
        

        OIArtVisitableImpl visimpl = new OIArtVisitableImpl();
        OIArtSetupArtRegimensImpl regim = new OIArtSetupArtRegimensImpl();
       
        int patArvCode = visimpl.getPatientSingleVisit(patientId, visitdate).getArvcode();
        Tblsetuparvfixeddosecombinations patientRegimen = regim.getPatienArvRegimen(patArvCode);
        
        String descr = patientRegimen.getArvdescription();
        String nameCode = patientRegimen.getV2code();
        
        List<Tblvisits> vislist = client.getVisits();
        if (vislist.size() > 0) {
            for (Tblvisits v : vislist) {
                if (v.getId().getVisitDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                    pm.setOiartvisit(v);
                }
            }
        }
        Patient patient = p;
        pm.setPatient(patient);
        // Tblvisits visits = client.getVisits().size() > 0 ? client.getVisits().get(0) : null;
        

        List<Tblstatus> statuslist = client.getStatus();
        if (statuslist.size() > 0) {
            for (Tblstatus s : statuslist) {
                if (s.getId().getStatusDate() != null) {
                    if (s.getId().getStatusDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        pm.setOiartstatus(s);
                    }
                }
            }
        }

//        Tblstatus status = client.getStatus().size() > 0 ? client.getStatus().get(0) : null;
//        pm.setOiartstatus(status);
//        Tbltests tests = client.getTests().size() > 0 ? client.getTests().get(0) : null;
//        pm.setOiartcurrenttests(tests);
        /*
        
        
         */
        List<Tbltests> testlist = client.getTests();
        if (testlist.size() > 0) {
            List<Tbltests> tests = new ArrayList();
            for (Tbltests s : testlist) {
                if (s.getTestDate() != null) {
                    if (s.getTestDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        tests.add(s);
                    }
                }
            }
            pm.setOiarttestslist(tests);
        }

        List<Tblreferralsto> refslist = client.getReferredto();
        if (refslist.size() > 0) {
            for (Tblreferralsto s : refslist) {
                if (s.getId().getVisitDate() != null) {
                    if (s.getId().getVisitDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        pm.setOiartreferals(s);
                    }
                }
            }
        }

        //Tblproblems prob = client.getProblems().size() > 0 ? client.getProblems().get(0) : null;
        // pm.setOiartproblems(prob);
        List<Tblproblems> problist = client.getProblems();
        if (problist.size() > 0) {
            for (Tblproblems s : problist) {
                if (s.getId().getVisitDate() != null) {
                    if (s.getId().getVisitDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        pm.setOiartproblems(s);
                    }
                }
            }
        }
        Tblpatientsproblems pprob = client.getPatientsproblems().size() > 0 ? client.getPatientsproblems().get(0) : null;
        pm.setOiartpatientsproblems(pprob);

        Tblpatientspriorexposure pexp = client.getPriorexposure().size() > 0 ? client.getPriorexposure().get(0) : null;
        pm.setOiartpriorexposure(pexp);

        Tblpatients artpatient = client.getPatients().size() > 0 ? client.getPatients().get(0) : null;
        pm.setOiartpatient(artpatient);

        // Tblmedication med = client.getMedication().size() > 0 ? client.getMedication().get(0) : null;
        //pm.setOiartmedications(med);
        List<Tblmedication> medlist = client.getMedication();
        if (medlist.size() > 0) {
            for (Tblmedication med : medlist) {
                if (med.getId().getVisitDate() != null) {
                    if (med.getId().getVisitDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        pm.setOiartmedications(med);
                    }
                }
            }
        }

        // Tblappointments appoint = client.getAppointments().size() > 0 ? client.getAppointments().get(0) : null;
        // pm.setOiartappointments(appoint);
        List<Tblappointments> appointlist = client.getAppointments();
        if (appointlist.size() > 0) {
            for (Tblappointments appoint : appointlist) {
                if (appoint.getDateAppointmentGiven() != null) {
                    if (appoint.getDateAppointmentGiven().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        pm.setOiartappointments(appoint);
                    }
                }
            }
        }
        List<Tblbaselinetests> basetestlist = client.getBaselinetests().size() > 0 ? client.getBaselinetests() : null;
        pm.setOiartbaselinetestslist(basetestlist);

//         Tblfamilyinfo fam = client.getFamilyinfo().size() > 0 ? Tblfamilyinfo().get(0) : null;
//        pm.setOiartfmed);
//        
//        Tblpregnancies preg = client.getPregnancies().size() > 0 ? client.getPregnancies().get(0) : null;
//        pm.setOiartp(preg);
        request.setAttribute("pmodel", pm);
        request.setAttribute("description", descr);
        request.setAttribute("regimen", nameCode);

        client.setP(p);

        //request.getSession().setAttribute("pvisit", pvisit);newArtPatientCard
        request.getSession().setAttribute("client", client);
//        request.getRequestDispatcher("art/ArtPatientVisitCard.jsp").forward(request, response);
        request.getRequestDispatcher("art/newArtPatientCard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
