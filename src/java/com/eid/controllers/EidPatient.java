/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eid.controllers;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.CbsSetupentrypoints;
import com.vmmc.entities.CbsSetupserviceaccess;
import com.vmmc.entities.CbsSetuptestkittypes;
import com.vmmc.entities.CbsTests;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Htc;
import com.vmmc.entities.HtcHivresult;
import com.vmmc.entities.HtcSetuphtcapproach;
import com.vmmc.entities.HtcSetuphtcmodel;
import com.vmmc.entities.HtcTestreason;
import com.vmmc.entities.Patient;
import com.vmmc.entities.SetupreferredTo;
import com.vmmc.entities.Setupreferredfrom;
import com.vmmc.services.CbsSetupServiceImpl;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedHtsClientAll;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.HtcHivresultServiceImpl;
import com.vmmc.services.HtsablePatientImpl;
import com.vmmc.services.SetupServiceImpl;
import com.vmmc.services.cbsTestsImpl;
import com.vmmc.services.cbsablePatientImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trevor
 */
@WebServlet(name = "EidPatient", urlPatterns = {"/EidPatient"})
public class EidPatient extends HttpServlet {

    static CbsSetupServiceImpl cbssetup = new CbsSetupServiceImpl();

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
            out.println("<title>Servlet EidPatient</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EidPatient at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<CbsSetupentrypoints> entrypointslist = cbssetup.getCBSEntryPoints();
        request.setAttribute("entrypoints", entrypointslist);

        List<CbsSetupserviceaccess> hivserviceaccesslist = cbssetup.getCBSServiceAccessesHIV();
        request.setAttribute("hivserviceaccess", hivserviceaccesslist);

        List<CbsSetupserviceaccess> syphilisserviceaccesslist = cbssetup.getCBSServiceAccessesSyphilis();
        request.setAttribute("syphilisserviceaccess", syphilisserviceaccesslist);

        List<CbsSetupserviceaccess> arvtherapyserviceaccesslist = cbssetup.getCBSServiceAccessesARVTherapy();
        request.setAttribute("arvtherapyserviceaccess", arvtherapyserviceaccesslist);

        List<CbsSetuptestkittypes> hivtestlist = cbssetup.getCBSHIVTestTypes();
        request.setAttribute("hivtesttypes", hivtestlist);

        List<CbsSetuptestkittypes> adultsyphilistestlist = cbssetup.getCBSSyphilisTestTypes2();
        request.setAttribute("adultsyphilistesttypes", adultsyphilistestlist);

        List<CbsSetuptestkittypes> paedsyphilistestlist = cbssetup.getCBSSyphilisTestTypes();
        request.setAttribute("paedssyphilistesttypes", paedsyphilistestlist);

        Patient p = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p = tempClient == null ? (Patient) session.getAttribute("patient") : new cbsablePatientImpl().getPatient(tempClient);

        float age = 0;

        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        p.setAge(age);
        session.setAttribute("patient", p);

        RequestDispatcher disp = request.getRequestDispatcher("eid/newEidPatient.jsp");
        disp.forward(request, response);
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
        HttpSession session = request.getSession();
        //take patient from session
        Patient p = (Patient) request.getSession().getAttribute("patient");

        //Step 1:
        String cbshtcnumber = request.getParameter("txtCBSHtcNo");
        String cbsDateFormCompleted = request.getParameter("txtCBSDateComplete");
        String cbsMemberReporting = request.getParameter("txtCBSMemberReporting");
        String cbsStaffTele = request.getParameter("txtCBSStaffTelephone");
        String cbsReporterEmail = request.getParameter("txtCBSReporterEmail");
        String cbsHtsModel = request.getParameter("txtCBSHtsModel");
        String cbsEntryPoint = request.getParameter("txtCBSEntryPoint");

        //Step 2:
        String cbsSurname = request.getParameter("txtCBSSurname");
        String cbsMaidenName = request.getParameter("txtCBSMaidenName");
        String cbsName = request.getParameter("txtCBSName");
        String cbsMiddleName = request.getParameter("txtMiddleName");
        String cbsNatId = request.getParameter("txtCBSNatId");
        String cbsDob = request.getParameter("txtCBSDob");
        String cbsGender = request.getParameter("txtCBSGender");
        String cbsEmploymentStat = request.getParameter("txtcbsemploymentstatus");
        String cbsReligion = request.getParameter("txtcbsReligion");
        String cbsMarital = request.getParameter("txtcbsMarital");
        String cbsAddress = request.getParameter("txtCBSAddress");
        String cbsDistrict = request.getParameter("txtCBSDistrict");
        String cbsNationality = request.getParameter("txtCBSNationality");
        String cbsPregStatus = request.getParameter("txtCBSPregnantStatus");
        String cbsBreastFeeding = request.getParameter("txtCBSBreastfeeding");
        String cbsDeceased = request.getParameter("txtCBSDeceased");
        String cbsDateOfDeath = request.getParameter("txtCBSDateOfDeath");
        String cbsCauseOfDeath = request.getParameter("txtCauseOfDeath");
        String cbsDeathRelated = request.getParameter("txtDeathHIVRelated");

        //Step 3:
        String cbsIycf = request.getParameter("txtCBSIycf");
        String cbsInfantFeeding = request.getParameter("txtCBSInfantFeeding");
        String cbsAge = request.getParameter("txtCBSAge");
        String cbsDateSpecimenCollected = request.getParameter("txtCBSDateSpecimenCollected");
        String cbsResult = request.getParameter("txtCBSResult");
        String cbsResultDate = request.getParameter("txtCBSResultDate");
        String cbsAge2 = request.getParameter("txtCBSAge2");
        String cbsDateSpecimenCollected2 = request.getParameter("txtCBSDateSpecimenCollected2");
        String cbsResult2 = request.getParameter("txtCBSResult2");
        String cbsResultDate2 = request.getParameter("txtCBSResultDate2");
        String cbsDateSpecimenCollected3 = request.getParameter("txtCBSDateSpecimenCollected3");
        String cbsResult3 = request.getParameter("txtCBSResult3");
        String cbsResultDate3 = request.getParameter("txtCBSResultDate3");

        String cbsHIVTestTypes1 = request.getParameter("txtHIVTestTypes1");
        String cbsType1DateCollected = request.getParameter("txtCBSType1DateCollected");
        String cbsType1Result = request.getParameter("txtCBSType1Result");
        String cbsType1ResultDate = request.getParameter("txtCBSType1ResultDate");
        String cbsHIVTestTypes2 = request.getParameter("txtHIVTestTypes2");
        String cbsType2DateCollected = request.getParameter("txtCBSType2DateCollected");
        String cbsType2Result = request.getParameter("txtCBSType2Result");
        String cbsType2ResultDate = request.getParameter("txtCBSType2ResultDate");
        String cbsHIVTestTypes3 = request.getParameter("txtHIVTestTypes3");
        String cbsType3DateCollected = request.getParameter("txtCBSType3DateCollected");
        String cbsType3Result = request.getParameter("txtCBSType3Result");
        String cbsType3ResultDate = request.getParameter("txtCBSType3ResultDate");

        /// Step 4:
        String cbsSyphilisTestTypes1 = request.getParameter("txtSyphilisTestTypes1");
        String cbsSyphilisDateCollected1 = request.getParameter("txtCBSSyphilisDateCollected1");
        String cbsSyphilisResult1 = request.getParameter("txtCBSSyphilisResult1");
        String cbsSyphilisResultDate1 = request.getParameter("txtCBSSyphilisResultDate1");
        String cbsSyphilisTestTypes2 = request.getParameter("txtSyphilisTestTypes2");
        String cbsSyphilisDateCollected2 = request.getParameter("txtCBSSyphilisDateCollected2");
        String cbsSyphilisResult2 = request.getParameter("txtCBSSyphilisResult2");
        String cbsSyphilisResultDate2 = request.getParameter("txtCBSSyphilisResultDate2");

        //Step 5:
        String cbsANCServices = request.getParameter("txtCbsANCServices");
        String cbsSyphilis = request.getParameter("txtCbsSyphilis");
        String cbsSiteOfDelivery = request.getParameter("txtCbsSiteOfDelivery");
        String cbsMotherDiagnosedHIV = request.getParameter("txtCbsMotherDiagnosedHIV");
        String cbsHIVGestation = request.getParameter("txtCbsHIVGestation");
        String cbsHIVDelivery = request.getParameter("txtCbsHIVDelivery");
        String cbsMotherDiagnosedSyphilis = request.getParameter("txtMotherDiagnosedSyphilis");
        String cbsSyphilisDelivery = request.getParameter("txtCbsSyphilisDelivery");
        String cbsSyphilisGestation = request.getParameter("txtCbsSyphilisGestation");
        String cbsMotherARVTherapy = request.getParameter("txtMotherARVTherapy");
        String cbsARVTherapyGestation = request.getParameter("txtCbsARVTherapyGestation");
        String cbsARVTherapyDelivery = request.getParameter("txtCbsARVTherapyDelivery");

        //Step 6:
        String cbsInfantrisk6wks = request.getParameter("infantrisk6wks");
        String cbsInfantriskBFeeding = request.getParameter("infantriskBFeeding");
        String cbsInfantriskTested6wks = request.getParameter("infantriskTested6wks");
        String cbsInfantriskTested9mnths = request.getParameter("infantriskTested9mnths");
        String cbsInfantriskGravidity = request.getParameter("infantriskGravidity");
        String cbsInfantriskSexualAbuse = request.getParameter("infantriskSexualAbuse");
        String cbsInfantriskSexualDebutMale = request.getParameter("infantriskSexualDebutMale");
        String cbsInfantriskSexualDebutFemale = request.getParameter("infantriskSexualDebutFemale");

        //Dates
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp cbsDateFormCompleted1 = null;
        Timestamp cbsDob1 = null;
        Timestamp cbsDateOfDeath1 = null;

        try {

            Date parsedFormCompleted = formatter.parse(cbsDateFormCompleted + " 00:00:00");
            cbsDateFormCompleted1 = new java.sql.Timestamp(parsedFormCompleted.getTime());
            Date parsedcbsDob = formatter.parse(cbsDob + " 00:00:00");
            cbsDob1 = new java.sql.Timestamp(parsedcbsDob.getTime());
            Date parsedcbsDateOfDeath = formatter.parse(cbsDateOfDeath + " 00:00:00");
            cbsDateOfDeath1 = new java.sql.Timestamp(parsedcbsDateOfDeath.getTime());

        } catch (Exception pw) {
            pw.printStackTrace();
        }

        //// mold notification from above data
        cbsablePatientImpl cbsdb = new cbsablePatientImpl();
        Cbs cb = new Cbs();

        //Step 1:
        cb.setDateFormCompleted(cbsDateFormCompleted1);
//        cb.setHtsModel(cbsHtsModel);
        cb.setStaffMemberEntering(cbsMemberReporting);
        cb.setStaffMemberEmail(cbsReporterEmail);
        cb.setStaffMemberTelephone(cbsStaffTele);
//        cb.setPointOfEntry(cbsEntryPoint);
        cb.setHtcnumber(cbshtcnumber);

        //Step 2:
        cb.setSurname(cbsSurname);
        cb.setFirstname(cbsName);
        cb.setNationalId(cbsNatId);
        cb.setDateOfBirth(cbsDob1);
//        cb.setEmploymentStatus(cbsEmploymentStat);
        cb.setSex(cbsGender);
        cb.setAddress(cbsAddress);
        cb.setReligion(cbsReligion);
        cb.setMaritalStatus(cbsMarital);
        cb.setDistrictOfResidence(cbsDistrict);
        cb.setNationality(cbsNationality);
        cb.setIsPregnant(cbsPregStatus);
//        cb.setIsDeceasedAtNotification(cbsDeceased);
//        cb.setIsDeceasedCauseOfDeath(cbsCauseOfDeath);
        cb.setIsBreadfeeding(cbsBreastFeeding);
//        cb.setIsDeceasedDateOfDeath(cbsDateOfDeath1);
//        cb.setIsDeceasedHivrelatedDeath(cbsDeathRelated);

        //step 3 and 4 goes to table cbstests except those below
        //step 3
 //       cb.setIsIycf(cbsIycf);
        cb.setIsBreadfeeding(cbsInfantFeeding);

        //step5
 //       cb.setAncServiceReceivedByMother(cbsANCServices);
//        cb.setMotherDiagnosedHiv(cbsMotherDiagnosedHIV);
//        cb.setMotherDiagnosedHivwksDel(cbsHIVDelivery);
//        cb.setMotherDiagnosedHivwksGest(cbsHIVGestation);
//        cb.setMotherDiagnosedSyphilis(cbsMotherDiagnosedSyphilis);
//        cb.setMotherDiagnosedSyphilisWksDel(cbsSyphilisDelivery);
//        cb.setMotherDiagnosedSyphilisWksGest(cbsSyphilisGestation);
//        cb.setMotherInitiatedArvtherapy(cbsMotherARVTherapy);
//        cb.setMotherInitiatedArvTherapyDel(cbsARVTherapyDelivery);
//        cb.setMotherInitiatedArvTherapyGest(cbsARVTherapyGestation);
//        cb.setTreatmentForSyphilis(cbsSyphilis);
        cb.setSiteOfDelivery(cbsSiteOfDelivery);

        //step 6
//        cb.setInfantProphlaxis6wks(cbsInfantrisk6wks);
//        cb.setInfantProphlaxisBreastfeeding(cbsInfantriskBFeeding);
//        cb.setInfantTested6wks(cbsInfantriskTested6wks);
//        cb.setInfantTested9mnths(cbsInfantriskTested9mnths);
        cb.setGavidityOfMother(cbsInfantriskGravidity);
        cb.setSuspVictSexualAbuse(cbsInfantriskSexualAbuse);
        cb.setEarlySexDebutMale(cbsInfantriskSexualDebutMale);
        cb.setEarlySexDebutFemale(cbsInfantriskSexualDebutFemale);
        //  cb.setDateEnteredEpms(cbsDateOfDeath1);

        //add to database cbs
        cbsdb.add(cb);

        //moulding items for cbstests table
        Timestamp cbsDateSpecimenCollected1 = null;
        Timestamp cbsResultDate1 = null;
        Timestamp cbsDateSpecimenCollected2_1 = null;
        Timestamp cbsResultDate2_1 = null;
        Timestamp cbsDateSpecimenCollected3_1 = null;
        Timestamp cbsResultDate3_1 = null;

        Timestamp cbsType1DateCollected1 = null;
        Timestamp cbsType1ResultDate1 = null;
        Timestamp cbsType2DateCollected1 = null;
        Timestamp cbsType2ResultDate1 = null;
        Timestamp cbsType3DateCollected1 = null;
        Timestamp cbsType3ResultDate1 = null;

        //step 4
        Timestamp cbsSyphilisDateCollected1_1 = null;
        Timestamp cbsSyphilisResultDate1_1 = null;
        Timestamp cbsSyphilisDateCollected2_1 = null;
        Timestamp cbsSyphilisResultDate2_1 = null;

        try {
            Date parsedcbsDateSpecimenCollected = formatter.parse(cbsDateSpecimenCollected + " 00:00:00");
            cbsDateSpecimenCollected1 = new java.sql.Timestamp(parsedcbsDateSpecimenCollected.getTime());

            Date parsedcbsResultDate = formatter.parse(cbsResultDate + " 00:00:00");
            cbsResultDate1 = new java.sql.Timestamp(parsedcbsResultDate.getTime());

            Date parsedcbsDateSpecimenCollected2 = formatter.parse(cbsDateSpecimenCollected2 + " 00:00:00");
            cbsDateSpecimenCollected2_1 = new java.sql.Timestamp(parsedcbsDateSpecimenCollected2.getTime());
            Date parsedcbsResultDate2 = formatter.parse(cbsResultDate2 + " 00:00:00");
            cbsResultDate2_1 = new java.sql.Timestamp(parsedcbsResultDate2.getTime());
            Date parsedcbsDateSpecimenCollected3 = formatter.parse(cbsDateSpecimenCollected3 + " 00:00:00");
            cbsDateSpecimenCollected3_1 = new java.sql.Timestamp(parsedcbsDateSpecimenCollected3.getTime());
            Date parsedcbsResultDate3 = formatter.parse(cbsResultDate3 + " 00:00:00");
            cbsResultDate3_1 = new java.sql.Timestamp(parsedcbsResultDate3.getTime());
            Date parsedcbsType1DateCollected = formatter.parse(cbsType1DateCollected + " 00:00:00");
            cbsType1DateCollected1 = new java.sql.Timestamp(parsedcbsType1DateCollected.getTime());
            Date parsedcbsType1ResultDate = formatter.parse(cbsType1ResultDate + " 00:00:00");
            cbsType1ResultDate1 = new java.sql.Timestamp(parsedcbsType1ResultDate.getTime());
            Date parsedcbsType2DateCollected = formatter.parse(cbsType2DateCollected + " 00:00:00");
            cbsType2DateCollected1 = new java.sql.Timestamp(parsedcbsType2DateCollected.getTime());
            Date parsedcbsType2ResultDate = formatter.parse(cbsType2ResultDate + " 00:00:00");
            cbsType2ResultDate1 = new java.sql.Timestamp(parsedcbsType2ResultDate.getTime());
            Date PcbsType3DateCollected = formatter.parse(cbsType3DateCollected + " 00:00:00");
            cbsType3DateCollected1 = new java.sql.Timestamp(PcbsType3DateCollected.getTime());
            Date PcbsType3ResultDate = formatter.parse(cbsType3ResultDate + " 00:00:00");
            cbsType3ResultDate1 = new java.sql.Timestamp(PcbsType3ResultDate.getTime());

            //step 4 
            Date PcbsSyphilisDateCollected1 = formatter.parse(cbsSyphilisDateCollected1 + " 00:00:00");
            cbsSyphilisDateCollected1_1 = new java.sql.Timestamp(PcbsSyphilisDateCollected1.getTime());
            Date PcbsSyphilisResultDate1 = formatter.parse(cbsSyphilisResultDate1 + " 00:00:00");
            cbsSyphilisResultDate1_1 = new java.sql.Timestamp(PcbsSyphilisResultDate1.getTime());
            Date PcbsSyphilisDateCollected2 = formatter.parse(cbsSyphilisDateCollected2 + " 00:00:00");
            cbsSyphilisDateCollected2_1 = new java.sql.Timestamp(PcbsSyphilisDateCollected2.getTime());
            Date PcbsSyphilisResultDate2 = formatter.parse(cbsSyphilisResultDate2 + " 00:00:00");
            cbsSyphilisResultDate2_1 = new java.sql.Timestamp(PcbsSyphilisResultDate2.getTime());
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        cbsTestsImpl ctiDB = new cbsTestsImpl();
        //1st Infant PCR
        CbsTests ct1stPCR = new CbsTests();

        ct1stPCR.setHtcnumber(cbshtcnumber);
//        ct1stPCR.setNationalId(cbsNatId);
        //ct1stPCR.setOpdnumber(opdnumber);
        String pcr1 = "1st PCR";
//        ct1stPCR.setTestType(pcr1);
//        ct1stPCR.setDateSpecimenCollected(cbsDateSpecimenCollected1);
//        ct1stPCR.setTestResult(cbsResult);
//        ct1stPCR.setResultDate(cbsResultDate1);
        ctiDB.addCbsTests(ct1stPCR);

        //2nd Infant PCR
        CbsTests ct2ndPCR = new CbsTests();
        ct2ndPCR.setHtcnumber(cbshtcnumber);
//        ct2ndPCR.setNationalId(cbsNatId);
        //ct2ndPCR.setOpdnumber(opdnumber);
        String pcr2 = "2nd PCR";
//        ct2ndPCR.setTestType(pcr2);
//        ct2ndPCR.setDateSpecimenCollected(cbsDateSpecimenCollected2_1);
//        ct2ndPCR.setTestResult(cbsResult2);
//        ct2ndPCR.setResultDate(cbsResultDate2_1);
        ctiDB.addCbsTests(ct2ndPCR);

        //HIV rapid after 6 weeks
        CbsTests ctRap = new CbsTests();
        ctRap.setHtcnumber(cbshtcnumber);
//        ctRap.setNationalId(cbsNatId);
        //ct2ndPCR.setOpdnumber(opdnumber);
        String rapid6 = "Rapid after 6 weeks";
//        ctRap.setTestType(rapid6);
//        ctRap.setDateSpecimenCollected(cbsDateSpecimenCollected3_1);
//        ctRap.setTestResult(cbsResult3);
//        ctRap.setResultDate(cbsResultDate3_1);
        ctiDB.addCbsTests(ctRap);

        //2-14 years HIV Rapid 1
        CbsTests ctRapT1 = new CbsTests();
        ctRapT1.setHtcnumber(cbshtcnumber);
//        ctRapT1.setNationalId(cbsNatId);
        //ct2ndPCR.setOpdnumber(opdnumber);       
//        ctRapT1.setTestType(cbsHIVTestTypes1);
//        ctRapT1.setDateSpecimenCollected(cbsType1DateCollected1);
//        ctRapT1.setTestResult(cbsType1Result);
//        ctRapT1.setResultDate(cbsType1ResultDate1);
        ctiDB.addCbsTests(ctRapT1);

        //2-14 years HIV rapid 2
        CbsTests ctRapT2 = new CbsTests();
        ctRapT2.setHtcnumber(cbshtcnumber);
//        ctRapT2.setNationalId(cbsNatId);
        //ct2ndPCR.setOpdnumber(opdnumber);       
//        ctRapT2.setTestType(cbsHIVTestTypes2);
//        ctRapT2.setDateSpecimenCollected(cbsType2DateCollected1);
//        ctRapT2.setTestResult(cbsType2Result);
//        ctRapT2.setResultDate(cbsType2ResultDate1);
        ctiDB.addCbsTests(ctRapT2);

        //2-14 years HIV rapid 3
        CbsTests ctRapT3 = new CbsTests();
        ctRapT3.setHtcnumber(cbshtcnumber);
//        ctRapT3.setNationalId(cbsNatId);
        //ct2ndPCR.setOpdnumber(opdnumber);       
//        ctRapT3.setTestType(cbsHIVTestTypes3);
//        ctRapT3.setDateSpecimenCollected(cbsType3DateCollected1);
//        ctRapT3.setTestResult(cbsType3Result);
//        ctRapT3.setResultDate(cbsType3ResultDate1);
        ctiDB.addCbsTests(ctRapT3);

        //HIV Syphilis Duo
        CbsTests ctHSD = new CbsTests();
        ctHSD.setHtcnumber(cbshtcnumber);
//        ctHSD.setNationalId(cbsNatId);
        //ctHSD.setOpdnumber(opdnumber);       
//        ctHSD.setTestType(cbsSyphilisTestTypes1);
//        ctHSD.setDateSpecimenCollected(cbsSyphilisDateCollected1_1);
//        ctHSD.setTestResult(cbsSyphilisResult1);
//        ctHSD.setResultDate(cbsSyphilisResultDate1_1);
        ctiDB.addCbsTests(ctHSD);

        //HIV Conjenital Syphilis
        CbsTests ctHCS = new CbsTests();
        ctHCS.setHtcnumber(cbshtcnumber);
//        ctHCS.setNationalId(cbsNatId);
        //ctHCS.setOpdnumber(opdnumber);       
//        ctHCS.setTestType(cbsSyphilisTestTypes2);
//        ctHCS.setDateSpecimenCollected(cbsSyphilisDateCollected2_1);
//        ctHCS.setTestResult(cbsSyphilisResult2);
//        ctHCS.setResultDate(cbsSyphilisResultDate2_1);

        ctiDB.addCbsTests(ctHCS);

        //dispatch to dashboard
        if ((!cbsResult.equals("Positive")) || (!cbsResult2.equals("Positive")) || (!cbsResult3.equals("Positive"))) {
            response.sendRedirect("Notification");
        } //        AllHtsServ serv = new AllHtsServ();
        //        serv.doGet(request, response);
        else {
            response.sendRedirect("AllHtsServ");
        }

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
