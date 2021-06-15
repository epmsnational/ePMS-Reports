/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblbaselinetests;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblpatientspriorexposure;
import com.vmmc.entities.TblpatientspriorexposureId;
import com.vmmc.entities.Tblpatientsproblems;
import com.vmmc.entities.TblpatientsproblemsId;
import com.vmmc.entities.Tblsetuphivtestreasons;
import com.vmmc.entities.Tblsetuporphanstatus;
import com.vmmc.entities.Tblsetupproblems;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtBaseLineTestsImpl;
import com.vmmc.services.OIArtPatientPriorExposurableImpl;
import com.vmmc.services.OIArtPatientProblemableImpl;
import com.vmmc.services.OIArtiableImpl;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author systems_developer
 */
public class ARTPatientManual extends HttpServlet {

    static SetupServiceImpl setup = new SetupServiceImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();

        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facilie = data.getFacilityId();
        Facilities config = facility.getFacilityName(province, district, facilie);
        request.setAttribute("facilityName", config.getFacilityName());

        Date dateY = new Date();

        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String Year = yearFormat.format(dateY);
        String provie = String.valueOf(province);

        String prov = "0" + provie;
        String facili, distr;
        String dist = data.getDistrictId();

        if (facilie.length() < 2) {
            facili = "0" + facilie;
        } else {
            facili = facilie;
        }

        if (dist.length() < 2) {
            distr = "0" + dist;
        } else {
            distr = dist;
        }

        String facID = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "A";
        request.setAttribute("facilityID", facID);

        String facIDE = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "E";
        request.setAttribute("facilityIDE", facIDE);

        String facIDV = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "V";
        request.setAttribute("facilityIDV", facIDV);

        String facIDP = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "P";
        request.setAttribute("facilityIDP", facIDP);

        String facIDS = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "S";
        request.setAttribute("facilityIDS", facIDS);

        String facIDT = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "T";
        request.setAttribute("facilityIDT", facIDT);

        String facIDM = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "M";
        request.setAttribute("facilityIDM", facIDM);

        String facIDO = prov + "-" + distr + "-" + facili + "-" + Year + "-" + "O";
        request.setAttribute("facilityIDO", facIDO);

        List<Tblsetuphivtestreasons> hivtestreasonslist = setup.getHivTestReasons();
        request.setAttribute("hivtestreasons", hivtestreasonslist);

        List<Tblsetupproblems> pastmedicalhistorylist = setup.getPastMedicalHistory();
        request.setAttribute("pastmedicalhistories", pastmedicalhistorylist);

        List<Tblsetupproblems> symptomsatenrolmentlist = setup.getSymptomsAtEnrolment();
        request.setAttribute("enrolmentsymptoms", symptomsatenrolmentlist);

        List<Tblsetupproblems> signsatenrolmentlist = setup.getSignsAtEnrolment();
        request.setAttribute("enrolmentsigns", signsatenrolmentlist);

        List<Tblsetupproblems> examinationslist = setup.getExaminations();
        request.setAttribute("examinations", examinationslist);

        List<Tblsetuporphanstatus> ophanstatuselist = setup.getOIOphanstatus();
        request.setAttribute("ophanstatuses", ophanstatuselist);

        List<Facilities> failitylist = setup.getFacilityTypes();
        request.setAttribute("failitylist", failitylist);
//  

        Patient p = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p = (Patient) (tempClient == null ? (Patient) session.getAttribute("patient") : new OIArtiableImpl().getPatient(tempClient));

        float age = 0;

        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        p.setAge(age);
        // String oinumber = (String)request.getAttribute("oinumber");
        session.setAttribute("patient", p);
        RequestDispatcher disp = request.getRequestDispatcher("art/newPageManual.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        Patient p = (Patient) session.getAttribute("patient");

        String facilityID = request.getParameter("txtFacARTNum");  //// TI for tranfer in and NC for new clients
        String sequentialID = request.getParameter("txtsequentialnum");
        String newClientID = facilityID + "-" + sequentialID;
        ///// Additional data point 
        String transferInId = request.getParameter("rdIsOINew");  //// TI for tranfer in and NC for new clients
        String ReferredFromNotes = request.getParameter("txtOIRereralFacilityName");
        String ReferredFromID = request.getParameter("txtOIRereralFacilityCode");
        String FileRef = request.getParameter("txtOICohort");

        ////// binding newArt.jsp values to variables
        String patientId = request.getParameter("txtARTNum");
        String ophanStatus = request.getParameter("slctOrphan");

        String RespirationRate = request.getParameter("txtOIRespirationRate");
        String Pulse = request.getParameter("txtOIPulse");
        String Temperature = request.getParameter("txtOITemperature");
        String BloodPressure = request.getParameter("txtOIBloodPressure");
        String Height = request.getParameter("txtOIHeight");
        String Weight = request.getParameter("txtOIWeight");

        String CDCountResult = request.getParameter("txtOICDCountResult");
        String SpecifyAllegies = request.getParameter("txtOISpecifyAllegies");
        String TBCategory = request.getParameter("rdOITBCategory");
        String CurrentTBTherapy = request.getParameter("rdOICurrentTBTherapy");
        String Fluconazole = request.getParameter("rdOIFluconazole");
        String FluconazoleYesDose = request.getParameter("txtOIFluconazoleYesDose");
        String FluconazoleYesDateStarted = request.getParameter("txtOIFluconazoleYesDateStarted");
        String FluconazoleYesDateCompleted = request.getParameter("txtOIFluconazoleYesDateCompleted");
        String Cotrimoxazole = request.getParameter("rdOICotrimoxazole");
        String CotrimoxazoleYesDose = request.getParameter("txtOICotrimoxazoleYesDose");
        String CotrimoxazoleYesDateStarted = request.getParameter("txtOICotrimoxazoleYesDateStarted");
        String CotrimoxazoleYesDateCompleted = request.getParameter("txtOICotrimoxazoleYesDateCompleted");
        String PMTCTExp = request.getParameter("rdOIPMTCTExp");
        String PMTCTExpYesDose = request.getParameter("txtOIPMTCTExpYesDose");
        String PMTCTExpYesDateStarted = request.getParameter("txtOIPMTCTExpYesDateStarted");
        String PMTCTExpYesDateCompleted = request.getParameter("txtOIPMTCTExpYesDateCompleted");
        String ARVExp = request.getParameter("rdOIARVExp");
        String NVP = request.getParameter("chksNVP");
        String AZT = request.getParameter("chkAZT");
        String c3TC = request.getParameter("chk3TC");
        String ARVExpDateStarted = request.getParameter("txtOIARVExpDateStarted");
        String ARVExpDateCompleted = request.getParameter("txtOIARVExpDateCompleted");
        String DrugHistory = request.getParameter("rdOIDrugHistory");
        String DrugHistoryYesDateStarted = request.getParameter("txtOIDrugHistoryYesDateStarted");
        String DrugHistoryYesDateCompleted = request.getParameter("txtOIDrugHistoryYesDateCompleted");
        String DrugAllegies = request.getParameter("rdOIDrugAllegies");
        String otherAllegies = request.getParameter("txtOISpecifyAllegies");
        String otherspecify = request.getParameter("rdOtherSpecify");
/// txtOISpecifyAllegies
        String SpecifyExaminations = request.getParameter("txtOISpecifyExaminations");

        String dateOfEnrolment = request.getParameter("txtDateEnrolled");
        //
        String personaltracingName = request.getParameter("txtOIPersonalTracingFullname");
        String pdate = request.getParameter("txtOIPersonalTracingDate");
        String indextestingName = request.getParameter("txtOIIndexTestingFullname");
        String itdate = request.getParameter("txtOIIndexTestingdate");
        String disclosure = request.getParameter("rdIsOIDisclosed");
        String disclosureRelation = request.getParameter("txtOIStatusDisclosureRelation");
        String disclosureWhom = request.getParameter("txtOIStatusDisclosureFullname");
        String dWDate = request.getParameter("txtOIFinalDisclosureDate");
        String nonDisclosureReason = request.getParameter("txtOINoneDisclosureReason");

        String sequentialE = request.getParameter("txtOIEIDNumber");
        String idE = request.getParameter("txtFacEIDNum");
        String EIDNumber = idE + "-" + sequentialE;
        String sequentialH = request.getParameter("txtOIHTSNumber");
        String idH = request.getParameter("txtFacEIDNum");
        String HTSNumber = idH + "-" + sequentialH;
        String sequentialP = request.getParameter("txtOIPMTCTNumber");
        String idP = request.getParameter("txtFacPMTCTNum");
        String PMTCTNumber = idP + "-" + sequentialP;
        String sequentialS = request.getParameter("txtOISTINumber");
        String idS = request.getParameter("txtFacSTINum");
        String STINumber = idS + "-" + sequentialS;
        String sequentialT = request.getParameter("txtOITBNumber");
        String idT = request.getParameter("txtFacTBNum");
        String TBNumber = idT + "-" + sequentialT;
        String sequentialM = request.getParameter("txtOIVMMCNumber");
        String idM = request.getParameter("txtFacVMMCNum");
        String VMMCNumber = idM + "-" + sequentialM;
        String sequentialO = request.getParameter("txtOIOtherProgNum");
        String idO = request.getParameter("txtFacOTHNum");
        String OtherProgNum = idO + "-" + sequentialO;

        String DateFCHIVPos = request.getParameter("txtOIDateFirstConfirmedHIVPos");
        String Institution = request.getParameter("txtOIInstitution");
        String TestUsed = request.getParameter("rdOITestUsed");
        //String IsOnART = request.getParameter("slcOIIsOnART");
        String RetestedForARTInitiation = request.getParameter("slcOIRetestedForARTInitiation");
        String VLResult = request.getParameter("txtOIVLResult");
        String CreatinineResult = request.getParameter("txtOICreatinineResult");
        String WBCResult = request.getParameter("txtOIWBCResult");
        String ALTResult = request.getParameter("txtOIALTResult");
        String HBResult = request.getParameter("txtOIHBResult");
        String CDPercResult = request.getParameter("txtOICDPercResult");
        String SpecifyOtherReasonsTest = request.getParameter("txtOISpecifyOtherReasonsTest");
        String ReasonsTest = request.getParameter("chkOIReasonsTest");
        String HRTDate = request.getParameter("txtOIHIVRetestDate");
        String VlTestDate = request.getParameter("txtOIVLDate");
        String CreatinineTestDate = request.getParameter("txtOICreatinineDate");
        String WBCTestDate = request.getParameter("txtOIWBCDate");
        String ALTTestDate = request.getParameter("txtOIALTDate");
        String HBTestDate = request.getParameter("txtOIHBDate");
        String CDPercTestDate = request.getParameter("txtOICDPercDate");
        String CDCountTestDate = request.getParameter("txtOICDCountDate");
        //
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp enrolmentDate = null;
        /// tblpatient

        try {

            Date parsedenrolmentDate = formatter.parse(dateOfEnrolment + " 00:00:00");
            enrolmentDate = new java.sql.Timestamp(parsedenrolmentDate.getTime());

        } catch (Exception pe) {
            pe.printStackTrace();
        }

        OIArtiableImpl patientImp = new OIArtiableImpl();

        Tblpatients patient = new Tblpatients();

        /// tblpatient
        Timestamp personaltracingDate = null;
        Timestamp indexTestingDate = null;
        Timestamp DisclosureWhomDate = null;
        Timestamp DateFirstConfirmedHIVPos = null;
        Timestamp HIVRetestDate = null;

        try {

            //// tblpatients
            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedPTDate = formatter.parse(pdate + " 00:00:00");
            personaltracingDate = new java.sql.Timestamp(parsedPTDate.getTime());
            Date parsedITDate = formatter.parse(itdate + " 00:00:00");
            indexTestingDate = new java.sql.Timestamp(parsedITDate.getTime());
            Date parsedDWDate = formatter.parse(dWDate + " 00:00:00");
            DisclosureWhomDate = new java.sql.Timestamp(parsedDWDate.getTime());
            Date parsedFCDate = formatter.parse(DateFCHIVPos + " 00:00:00");
            DateFirstConfirmedHIVPos = new java.sql.Timestamp(parsedFCDate.getTime());
            Date parsedHRTDate = formatter.parse(HRTDate + " 00:00:00");
            HIVRetestDate = new java.sql.Timestamp(parsedHRTDate.getTime());

        } catch (Exception pe) {
            pe.printStackTrace();
        }
        //step one
        if (transferInId.equalsIgnoreCase("NC")) {
            patient.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            patient.setPatientId(patientId);
        }
        patient.setDateOfEnrolment(enrolmentDate);
        patient.setOrphanStatusId(ophanStatus);
        patient.setOpdnumber(p.getOpdnumber());

        //step two
        patient.setPersonalTracingName(personaltracingName);
        patient.setPersonalTracingDate(personaltracingDate);

        patient.setIndexCaseName(indextestingName);
        patient.setIndexCaseDate(indexTestingDate);

        patient.setIsDisclosureHiv(disclosure);
        patient.setDisclosureYesWhom(disclosureWhom);
        patient.setDisclosureYesRelation(disclosureRelation);
        patient.setDisclosureYesDate(DisclosureWhomDate);
        patient.setDisclosureNoReason(nonDisclosureReason);

        patient.setFirstName(p.getFirstName());
        patient.setSurName(p.getLastName());

        patient.setDateOfBirth(p.getDob());
        patient.setDateOfEnrolment(enrolmentDate);
        patient.setNationalId(p.getNationalId());

        //step three
        patient.setFileRef(FileRef);
        patient.setTransferInId(transferInId);
        if (!transferInId.isEmpty()) {
            if (transferInId.equalsIgnoreCase("NC")) {
                if (!EIDNumber.equalsIgnoreCase("")) {
                    patient.setReferredFromId(EIDNumber);
                } else if (!HTSNumber.equalsIgnoreCase("")) {
                    patient.setReferredFromId(HTSNumber);
                } else if (!PMTCTNumber.equalsIgnoreCase("")) {
                    patient.setReferredFromId(PMTCTNumber);
                } else if (!STINumber.equalsIgnoreCase("")) {
                    patient.setReferredFromId(STINumber);
                } else if (!TBNumber.equalsIgnoreCase("")) {
                    patient.setReferredFromId(TBNumber);
                } else if (!VMMCNumber.equalsIgnoreCase("")) {
                    patient.setReferredFromId(VMMCNumber);
                } else if (!OtherProgNum.equalsIgnoreCase("")) {
                    patient.setReferredFromId(OtherProgNum);
                } else {
                    patient.setReferredFromId(null);
                }
            } else if (transferInId.equalsIgnoreCase("TI")) {
                patient.setReferredFromId(ReferredFromID);
                patient.setReferredFromNotes(ReferredFromNotes);

            }
        } else {
            patient.setReferredFromId(null);
        }

        //step four
        patient.setDateConfirmedHivpositive(DateFirstConfirmedHIVPos);
        patient.setHivtestLocationCode(Institution);
        patient.setHivtestTypeId(TestUsed);

        // patient.setReferredFromNotes(ReasonsTest); //// to add notes section
        // patient.setTransferInId(TestUsed);
        String SpecifyHIVTestReason = request.getParameter("txtOISpecifyOtherReasonsTest");
        String[] HIVTestReason = request.getParameterValues("chkOIReasonsTest");

        if (HIVTestReason != null) {

            for (String g : HIVTestReason) {
                patient.setHivtestReasonId(g);

            }
        }

        patient.setIsRetestForHivinitiation(RetestedForARTInitiation);
        patient.setIsRetestForHivinitiationDate(HIVRetestDate);

        patientImp.AddArtPatient(patient);
        //patient.setDrugAllergies(DrugAllegies); 
        //step five
        OIArtPatientProblemableImpl oiartProbImpl = new OIArtPatientProblemableImpl();

        String[] examinations = request.getParameterValues("chkOIExaminations");
        if (examinations != null) {
            for (String g : examinations) {
                Tblpatientsproblems patientproblems = new Tblpatientsproblems();
                TblpatientsproblemsId pid = new TblpatientsproblemsId();
                ///patientproblems.setPatientId(patientId);
                //patientproblems.setProblemAcronym(g);
                if (transferInId.equalsIgnoreCase("NC")) {
                    pid.setPatientId(newClientID);
                } else if (transferInId.equalsIgnoreCase("TI")) {
                    pid.setPatientId(patientId);
                }
                pid.setProblemAcronym(g);
                patientproblems.setId(pid);
                //patientproblems.setNotes(c3TC);
                oiartProbImpl.addPatientsProblems(patientproblems);

            }
        }

        String SpecifyOISymptomsAtEnrolment = request.getParameter("txtSpecifyOISymptomsAtEnrolment");
        String[] SymptomsAtEnrolment = request.getParameterValues("chkOISymptomsAtEnrolment");

        if (SymptomsAtEnrolment != null) {
            for (String g : SymptomsAtEnrolment) {
                Tblpatientsproblems patientproblems = new Tblpatientsproblems();
                TblpatientsproblemsId pid = new TblpatientsproblemsId();
                //patientproblems.setPatientId(patientId);
                //patientproblems.setProblemAcronym(g);
                if (transferInId.equalsIgnoreCase("NC")) {
                    pid.setPatientId(newClientID);
                } else if (transferInId.equalsIgnoreCase("TI")) {
                    pid.setPatientId(patientId);
                }
                pid.setProblemAcronym(g);
                patientproblems.setId(pid);
                //patientproblems.setNotes(c3TC);
                oiartProbImpl.addPatientsProblems(patientproblems);

            }
        }

        String[] SignAtEnrolment = request.getParameterValues("chkOISignsAtEnrolment");

        String SpecifyOISignAtEnrolment = request.getParameter("txtSpecifyOISignAtEnrolment");

        if (SignAtEnrolment != null) {
            for (String g : SignAtEnrolment) {

                Tblpatientsproblems patientproblems = new Tblpatientsproblems();
                TblpatientsproblemsId pid = new TblpatientsproblemsId();
                if (transferInId.equalsIgnoreCase("NC")) {
                    pid.setPatientId(newClientID);
                } else if (transferInId.equalsIgnoreCase("TI")) {
                    pid.setPatientId(patientId);
                }
                pid.setProblemAcronym(g);
                //patientproblems.setPatientId(patientId);
                //patientproblems.setProblemAcronym(g);
                patientproblems.setId(pid);
                //patientproblems.setNotes(c3TC);
                oiartProbImpl.addPatientsProblems(patientproblems);

            }
        }
        String[] PastMedicalHistory = request.getParameterValues("chkOIPastmedicalHistory");

        String SpecifyPastMedical = request.getParameter("txtOISpecifyPastMedical");
        if (PastMedicalHistory != null) {
            for (String g : PastMedicalHistory) {
                Tblpatientsproblems patientproblems = new Tblpatientsproblems();
                TblpatientsproblemsId pid = new TblpatientsproblemsId();
                //patientproblems.setPatientId(patientId);
                //patientproblems.setProblemAcronym(g);
                if (transferInId.equalsIgnoreCase("NC")) {
                    pid.setPatientId(newClientID);
                } else if (transferInId.equalsIgnoreCase("TI")) {
                    pid.setPatientId(patientId);
                }
                pid.setProblemAcronym(g);
                patientproblems.setId(pid);
                //patientproblems.setNotes(c3TC);
                oiartProbImpl.addPatientsProblems(patientproblems);

            }
        }

        // Prior Exposure 
        OIArtPatientPriorExposurableImpl priorExposureImpl = new OIArtPatientPriorExposurableImpl();

        // if(!DrugAllegies.equalsIgnoreCase("No")){
        Tblpatientspriorexposure arvexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId arvexposureid = new TblpatientspriorexposureId();
        //// Proir exposure 
        Timestamp PMTCTExpYesDateStartedf = null;
        Timestamp PMTCTExpYesDateCompletedf = null;
        Timestamp ARVExpDateStartedf = null;
        Timestamp ARVExpDateCompletedf = null;
        Timestamp CotrimoxazoleYesDateStartedf = null;
        Timestamp FluconazoleYesDateStartedf = null;
        Timestamp FluconazoleYesDateCompletedf = null;
        Timestamp DrugHistoryYesDateStartedf = null;
        Timestamp DrugHistoryYesDateCompletedf = null;

        try {

            /// prior Exposure
            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedDatec = formatter.parse(ARVExpDateStarted + " 00:00:00");
            ARVExpDateStartedf = new java.sql.Timestamp(parsedDatec.getTime());
            Date parsedDatei = formatter.parse(DrugHistoryYesDateStarted + " 00:00:00");
            DrugHistoryYesDateStartedf = new java.sql.Timestamp(parsedDatei.getTime());
            Date parsedDatej = formatter.parse(DrugHistoryYesDateCompleted + " 00:00:00");
            DrugHistoryYesDateCompletedf = new java.sql.Timestamp(parsedDatej.getTime());
            Date parsedDateh = formatter.parse(FluconazoleYesDateStarted + " 00:00:00");
            FluconazoleYesDateStartedf = new java.sql.Timestamp(parsedDateh.getTime());
            Date parsedDateg = formatter.parse(FluconazoleYesDateCompleted + " 00:00:00");
            FluconazoleYesDateCompletedf = new java.sql.Timestamp(parsedDateg.getTime());
            Date parsedDated = formatter.parse(ARVExpDateCompleted + " 00:00:00");
            ARVExpDateCompletedf = new java.sql.Timestamp(parsedDated.getTime());
            Date parsedDatef = formatter.parse(CotrimoxazoleYesDateStarted + " 00:00:00");
            CotrimoxazoleYesDateStartedf = new java.sql.Timestamp(parsedDatef.getTime());
            Date parsedDatee = formatter.parse(CotrimoxazoleYesDateStarted + " 00:00:00");
            CotrimoxazoleYesDateStartedf = new java.sql.Timestamp(parsedDatee.getTime());
            Date parsedDateb = formatter.parse(PMTCTExpYesDateCompleted + " 00:00:00");
            PMTCTExpYesDateCompletedf = new java.sql.Timestamp(parsedDateb.getTime());
            Date parsedDatea = formatter.parse(PMTCTExpYesDateStarted + " 00:00:00");
            PMTCTExpYesDateStartedf = new java.sql.Timestamp(parsedDatea.getTime());
            //// tblpatients

        } catch (Exception pe) {
            pe.printStackTrace();
        }
        if (transferInId.equalsIgnoreCase("NC")) {
            arvexposureid.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            arvexposureid.setPatientId(patientId);
        }
        arvexposureid.setDrugTypeId(ARVExp);
        arvexposure.setId(arvexposureid);
        arvexposure.setNotes(NVP);
        arvexposure.setNotes(AZT);
        arvexposure.setNotes(c3TC);
        arvexposure.setDateStarted(ARVExpDateStartedf);
        arvexposure.setDateLastTakenOrCompleted(ARVExpDateCompletedf);
        priorExposureImpl.addPatientsPriorExposures(arvexposure);

        Tblpatientspriorexposure pmtctexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId pmtctexposureid = new TblpatientspriorexposureId();
        if (transferInId.equalsIgnoreCase("NC")) {
            pmtctexposureid.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            pmtctexposureid.setPatientId(patientId);
        }
        pmtctexposureid.setDrugTypeId(PMTCTExp);
        pmtctexposure.setId(pmtctexposureid);
        //pmtctexposure.setRegimenCode(Integer.MIN_VALUE);
        pmtctexposure.setDateStarted(PMTCTExpYesDateStartedf);
        pmtctexposure.setDateLastTakenOrCompleted(PMTCTExpYesDateCompletedf);
        pmtctexposure.setNotes(PMTCTExpYesDose);
        priorExposureImpl.addPatientsPriorExposures(pmtctexposure);

        Tblpatientspriorexposure cotriexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId cotriexposureid = new TblpatientspriorexposureId();
        if (transferInId.equalsIgnoreCase("NC")) {
            cotriexposureid.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            cotriexposureid.setPatientId(patientId);
        }
        cotriexposureid.setDrugTypeId(Cotrimoxazole);
        cotriexposure.setId(cotriexposureid);
        //cotriexposure.setRegimenCode(Integer.MIN_VALUE);
        cotriexposure.setDateStarted(CotrimoxazoleYesDateStartedf);
        ///cotriexposure.setDateLastTakenOrCompleted(dateLastTakenOrCompleted);
        cotriexposure.setNotes(CotrimoxazoleYesDose);
        priorExposureImpl.addPatientsPriorExposures(cotriexposure);

        Tblpatientspriorexposure flzexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId flzexposureid = new TblpatientspriorexposureId();
        if (transferInId.equalsIgnoreCase("NC")) {
            flzexposureid.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            flzexposureid.setPatientId(patientId);
        }
        flzexposureid.setDrugTypeId(Fluconazole);
        flzexposure.setId(flzexposureid);
        //flzexposure.setRegimenCode(Integer.MIN_VALUE);
        flzexposure.setDateStarted(FluconazoleYesDateStartedf);
        flzexposure.setDateLastTakenOrCompleted(FluconazoleYesDateCompletedf);
        flzexposure.setNotes(FluconazoleYesDose);
        priorExposureImpl.addPatientsPriorExposures(flzexposure);

        Tblpatientspriorexposure tbtherapy = new Tblpatientspriorexposure();
        TblpatientspriorexposureId tbTherapyid = new TblpatientspriorexposureId();
        if (transferInId.equalsIgnoreCase("NC")) {
            tbTherapyid.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            tbTherapyid.setPatientId(patientId);
        }
        tbTherapyid.setDrugTypeId(CurrentTBTherapy);
        tbtherapy.setId(tbTherapyid);
        //flzexposure.setRegimenCode(Integer.MIN_VALUE);
        // flzexposure.setDateStarted(dateStarted);
        ///flzexposure.setDateLastTakenOrCompleted(dateLastTakenOrCompleted);
        tbtherapy.setNotes(TBCategory);
        priorExposureImpl.addPatientsPriorExposures(tbtherapy);

        Tblpatientspriorexposure otherexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId otherexposureid = new TblpatientspriorexposureId();
        if (transferInId.equalsIgnoreCase("NC")) {
            otherexposureid.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            otherexposureid.setPatientId(patientId);
        }
        otherexposureid.setDrugTypeId(otherspecify);
        otherexposure.setId(tbTherapyid);
        //flzexposure.setRegimenCode(Integer.MIN_VALUE);
        // flzexposure.setDateStarted(dateStarted);
        ///flzexposure.setDateLastTakenOrCompleted(dateLastTakenOrCompleted);
        otherexposure.setNotes(otherAllegies);
        priorExposureImpl.addPatientsPriorExposures(otherexposure);

        Timestamp VLDate = null;
        Timestamp CreatinineDate = null;
        Timestamp WBCDate = null;
        Timestamp ALTDate = null;
        Timestamp HBDate = null;
        Timestamp CDPercDate = null;
        Timestamp CDCountDate = null;

        try {

            //// baseline tests
            Date parsedVLDate = formatter.parse(VlTestDate + " 00:00:00");
            VLDate = new java.sql.Timestamp(parsedVLDate.getTime());
            Date parsedCreatinineDate = formatter.parse(CreatinineTestDate + " 00:00:00");
            CreatinineDate = new java.sql.Timestamp(parsedCreatinineDate.getTime());
            Date parsedWBCDate = formatter.parse(WBCTestDate + " 00:00:00");
            WBCDate = new java.sql.Timestamp(parsedWBCDate.getTime());
            Date parsedALTDate = formatter.parse(ALTTestDate + " 00:00:00");
            ALTDate = new java.sql.Timestamp(parsedALTDate.getTime());
            Date parsedHBDate = formatter.parse(HBTestDate + " 00:00:00");
            HBDate = new java.sql.Timestamp(parsedHBDate.getTime());
            Date parsedCDPercDate = formatter.parse(CDPercTestDate + " 00:00:00");
            CDPercDate = new java.sql.Timestamp(parsedCDPercDate.getTime());
            Date parsedCDCountDate = formatter.parse(CDCountTestDate + " 00:00:00");
            CDCountDate = new java.sql.Timestamp(parsedCDCountDate.getTime());
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        /// Alll baseline tests  are entered to their table 
        OIArtBaseLineTestsImpl baselineImpl = new OIArtBaseLineTestsImpl();
        Tblbaselinetests cd4test = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            cd4test.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            cd4test.setPatientId(patientId);
        }
        cd4test.setDateOfEnrolment(enrolmentDate);
        String cd4 = "CD4";
        cd4test.setTestTypeId(cd4);
        cd4test.setResultNumeric(CDCountResult);
        cd4test.setResultDate(CDCountDate);
        baselineImpl.addBaselineTests(cd4test);

        //cd4 percentage
        Tblbaselinetests cd4perc = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            cd4perc.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            cd4perc.setPatientId(patientId);
        }
        cd4perc.setDateOfEnrolment(enrolmentDate);
        String cdperc = "CD%";
        cd4perc.setTestTypeId(cdperc);
        cd4perc.setResultNumeric(CDPercResult);
        cd4perc.setResultDate(CDPercDate);
        baselineImpl.addBaselineTests(cd4perc);

        //hb 
        Tblbaselinetests hb = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            hb.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            hb.setPatientId(patientId);
        }
        hb.setDateOfEnrolment(enrolmentDate);
        String hbresult = "HBX";
        hb.setTestTypeId(hbresult);
        hb.setResultNumeric(HBResult);
        hb.setResultDate(HBDate);
        baselineImpl.addBaselineTests(hb);

        //ALT
        Tblbaselinetests alt = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            alt.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            alt.setPatientId(patientId);
        }
        alt.setDateOfEnrolment(enrolmentDate);
        String altresult = "ALT";
        alt.setTestTypeId(altresult);
        alt.setResultNumeric(ALTResult);
        alt.setResultDate(ALTDate);
        baselineImpl.addBaselineTests(alt);

        //WBC
        Tblbaselinetests wbc = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            wbc.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            wbc.setPatientId(patientId);
        }
        wbc.setDateOfEnrolment(enrolmentDate);
        String wbcresult = "WBC";
        wbc.setTestTypeId(wbcresult);
        wbc.setResultNumeric(WBCResult);
        wbc.setResultDate(WBCDate);
        baselineImpl.addBaselineTests(wbc);
        //Creatinine
        Tblbaselinetests creatinine = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            creatinine.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            creatinine.setPatientId(patientId);
        }
        creatinine.setDateOfEnrolment(enrolmentDate);
        String creatinineresult = "CRT";
        creatinine.setTestTypeId(creatinineresult);
        creatinine.setResultNumeric(CreatinineResult);
        creatinine.setResultDate(CreatinineDate);
        baselineImpl.addBaselineTests(creatinine);

        //Viral Load
        Tblbaselinetests vl = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            vl.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            vl.setPatientId(patientId);
        }
        vl.setDateOfEnrolment(enrolmentDate);
        String vlresult = "VRL";
        vl.setTestTypeId(vlresult);
        vl.setResultNumeric(VLResult);
        vl.setResultDate(VLDate);
        baselineImpl.addBaselineTests(vl);
        //weight
        Tblbaselinetests weight = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            weight.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            weight.setPatientId(patientId);
        }
        weight.setDateOfEnrolment(enrolmentDate);
        String weightresult = "WGT";
        weight.setTestTypeId(weightresult);
        weight.setResultNumeric(Weight);
        baselineImpl.addBaselineTests(weight);
        //height

        Tblbaselinetests height = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            height.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            height.setPatientId(patientId);
        }
        height.setDateOfEnrolment(enrolmentDate);
        String heightresult = "HGC";
        height.setTestTypeId(heightresult);
        height.setResultNumeric(Height);
        baselineImpl.addBaselineTests(height);

        //blood pressure        
        Tblbaselinetests bp = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            bp.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            bp.setPatientId(patientId);
        }
        bp.setDateOfEnrolment(enrolmentDate);
        String bpdresult = "BPD";
        bp.setTestTypeId(bpdresult);
        bp.setResultNumeric(BloodPressure);
        String bpsresult = "BPS";
        bp.setTestTypeId(bpsresult);
        bp.setResultNumeric(BloodPressure); // to split
        baselineImpl.addBaselineTests(bp);

        //temperature
        Tblbaselinetests temperature = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            temperature.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            temperature.setPatientId(patientId);
        }
        temperature.setDateOfEnrolment(enrolmentDate);
        String tempresult = "TMP";
        temperature.setTestTypeId(tempresult);
        temperature.setResultNumeric(Temperature);
        baselineImpl.addBaselineTests(temperature);

        //PULSE
        Tblbaselinetests pulse = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            pulse.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            pulse.setPatientId(patientId);
        }
        pulse.setDateOfEnrolment(enrolmentDate);
        String pulseresult = "PUL";
        pulse.setTestTypeId(pulseresult);
        pulse.setResultNumeric(Pulse);
        baselineImpl.addBaselineTests(pulse);

        //Respiration Rate
        Tblbaselinetests respRate = new Tblbaselinetests();
        if (transferInId.equalsIgnoreCase("NC")) {
            respRate.setPatientId(newClientID);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            respRate.setPatientId(patientId);
        }
        respRate.setDateOfEnrolment(enrolmentDate);
        String respRateResult = "RES";
        respRate.setTestTypeId(respRateResult);
        respRate.setResultNumeric(RespirationRate);
        baselineImpl.addBaselineTests(respRate);

        CompletedARTClientAll cptdOIARTClient;
        if (transferInId.equalsIgnoreCase("NC")) {
            cptdOIARTClient = new CompletedARTClientAll(newClientID);
            p.setPatientId(newClientID);
            p.setFileRef(FileRef);
            cptdOIARTClient.setP(p);

            CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
            circumImpl.editOIArt(p);
            circumImpl.editOIArtRef(p);

            session.setAttribute("cptdOIARTClient", cptdOIARTClient);
        } else if (transferInId.equalsIgnoreCase("TI")) {
            cptdOIARTClient = new CompletedARTClientAll(patientId);
            p.setPatientId(patientId);
            p.setFileRef(FileRef);
            cptdOIARTClient.setP(p);

            CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
            circumImpl.editOIArt(p);
            circumImpl.editOIArtRef(p);

            session.setAttribute("cptdOIARTClient", cptdOIARTClient);

        }

        if (transferInId.equalsIgnoreCase("NC")) {
            CompletedARTClientAll client = new CompletedARTClientAll(newClientID);
            CircumcisablePatientImpl OIARTpp = new CircumcisablePatientImpl();
            client.getVisits();
            Patient pp = OIARTpp.getOIArtPatient(newClientID);
            client.setP(pp);
            request.getSession().setAttribute("client", client);
            if (client != null) {
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
                disp.forward(request, response);
            } else {
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
                disp.forward(request, response);

            }
        } else if (transferInId.equalsIgnoreCase("TI")) {
            CompletedARTClientAll client = new CompletedARTClientAll(patientId);
            CircumcisablePatientImpl OIARTpp = new CircumcisablePatientImpl();
            client.getVisits();
            Patient pp = OIARTpp.getOIArtPatient(patientId);
            client.setP(pp);
            request.getSession().setAttribute("client", client);
            if (client != null) {
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
                disp.forward(request, response);
            } else {
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
                disp.forward(request, response);

            }
        }

        //response.sendRedirect("AllOIARTServ");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
