
package com.art.controllers;

import com.vmmc.entities.ArtSqnumber;
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
import com.vmmc.services.OiSequentialImpl;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.sql.Timestamp;
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
@WebServlet(name = "ARTPatient", urlPatterns = {"/ARTPatient"})
public class ARTPatient extends HttpServlet {

    static SetupServiceImpl setup = new SetupServiceImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();
        
        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province,district,facili);
        request.setAttribute("facilityName",config.getFacilityName());

//        //creating ART No
//        Facilityconfig fc = new FacilityConfigServiceImpl().getFacilityConfig(1);
//        ArtSqnumber sqn = new ArtSqnumber();
//        OiSequentialImpl sqnservive = new OiSequentialImpl();
//        sqn = sqnservive.findByID(1);
//        String oinumberStub = fc.getProvinceId() + "-" + fc.getDistrictId() + "-" + fc.getFacilityId();
//        // String locationForHts = null;
//        String locationForOinumber = null;
//        String currentyear = null;
//        int yearvaluestored;
//        try {
//            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//            Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
//            java.util.Date timeStamp = format.parse(currentTimestamp.toString());
//            
//            currentyear = currentTimestamp.toString().substring(0, 4);
//            yearvaluestored =sqn.getYear();
//            
//            //////
//            if (yearvaluestored != Integer.parseInt(currentyear)) {
//                int newyear = Integer.parseInt(currentyear);
//                sqn.setSqnumber(1);
//                locationForOinumber = oinumberStub + "-"
//                        + newyear + "-" + "A" + "-" + sqn.getSqnumber();
//                sqn.setYear(newyear);
//                sqnservive.edidSeqnumber(sqn);
//            } else {
//                locationForOinumber = oinumberStub + "-"
//                        + currentyear + "-" + "A" + "-" + sqn.getSqnumber();
//                sqn.setSqnumber(sqn.getSqnumber()+ 1);
//                
//               
//                sqnservive.edidSeqnumber(sqn);
//            }
//           
//        } catch (Exception e) {
//        }
//
//        request.setAttribute("oinumber ", locationForOinumber);
//        OIArtPatientProblemableImpl OIArtPP =new OIArtPatientProblemableImpl();
//        List<Tblpatientsproblems> patientsproblemsList = OIArtPP.getPatientsProblems();
//        request.setAttribute("patientproblems", patientsproblemsList);
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
//  

        Patient p = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p =  (Patient) (tempClient == null ? (Patient) session.getAttribute("patient") : new OIArtiableImpl().getPatient(tempClient));

        float age = 0;

        Calendar cal2 = Calendar.getInstance();
        
        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        p.setAge(age);
        String oiNum = p.getPatientId();
       // String oinumber = (String)request.getAttribute("oinumber");
        session.setAttribute("patient", p);
        session.setAttribute("oiNum ", oiNum);

        RequestDispatcher disp = request.getRequestDispatcher("art/newPage.jsp");
        disp.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        
        //creating ART No
        Facilityconfig fc = new FacilityConfigServiceImpl().getFacilityConfig(1);
        ArtSqnumber sqn = new ArtSqnumber();
        OiSequentialImpl sqnservive = new OiSequentialImpl();
        sqn = sqnservive.findByID(1);
        String oinumberStub = fc.getProvinceId() + "-" + fc.getDistrictId() + "-" + fc.getFacilityId();
        // String locationForHts = null;
        String locationForOinumber = null;
        String currentyear = null;
        int yearvaluestored;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            java.util.Date timeStamp = format.parse(currentTimestamp.toString());
            
            currentyear = currentTimestamp.toString().substring(0, 4);
            yearvaluestored =sqn.getYear();
            
            //////
            if (yearvaluestored != Integer.parseInt(currentyear)) {
                int newyear = Integer.parseInt(currentyear);
                int serialnum=1;
                locationForOinumber = oinumberStub + "-"
                        + newyear + "-" + "A" + "-" + serialnum;
                sqn.setYear(newyear);
                sqn.setSqnumber(2);
                sqnservive.edidSeqnumber(sqn);
            } else {
                locationForOinumber = oinumberStub + "-"
                        + currentyear + "-" + "A" + "-" + sqn.getSqnumber();
                sqn.setSqnumber(sqn.getSqnumber()+ 1);
                
               
                sqnservive.edidSeqnumber(sqn);
            }
           
        } catch (Exception e) {
        }

        //request.setAttribute("oinumber ", locationForOinumber);
        
        Patient p = (Patient) session.getAttribute("patient");

        ////// binding newArt.jsp values to variables
        String patientId = locationForOinumber;
        String patientIds = request.getParameter("txtARTNum");
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

        String EIDNumber = request.getParameter("txtOIEIDNumber");
        String HTSNumber = request.getParameter("txtOIHTSNumber");
        String PMTCTNumber = request.getParameter("txtOIPMTCTNumber");
        String STINumber = request.getParameter("txtOISTINumber");
        String TBNumber = request.getParameter("txtOITBNumber");
        String VMMCNumber = request.getParameter("txtOIVMMCNumber");
        String OtherProgNum = request.getParameter("txtOIOtherProgNum");

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
        patient.setDateOfEnrolment(enrolmentDate);
        patient.setOrphanStatusId(ophanStatus);
        patient.setPatientId(patientIds);
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
                pid.setPatientId(patientIds);
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
                pid.setPatientId(patientIds);
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
                pid.setPatientId(patientIds);
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
                pid.setPatientId(patientIds);
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
        arvexposureid.setPatientId(patientIds);
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
        pmtctexposureid.setPatientId(patientIds);
        pmtctexposureid.setDrugTypeId(PMTCTExp);
        pmtctexposure.setId(pmtctexposureid);
        //pmtctexposure.setRegimenCode(Integer.MIN_VALUE);
        pmtctexposure.setDateStarted(PMTCTExpYesDateStartedf);
        pmtctexposure.setDateLastTakenOrCompleted(PMTCTExpYesDateCompletedf);
        pmtctexposure.setNotes(PMTCTExpYesDose);
        priorExposureImpl.addPatientsPriorExposures(pmtctexposure);

        Tblpatientspriorexposure cotriexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId cotriexposureid = new TblpatientspriorexposureId();
        cotriexposureid.setPatientId(patientIds);
        cotriexposureid.setDrugTypeId(Cotrimoxazole);
        cotriexposure.setId(cotriexposureid);
        //cotriexposure.setRegimenCode(Integer.MIN_VALUE);
        cotriexposure.setDateStarted(CotrimoxazoleYesDateStartedf);
        ///cotriexposure.setDateLastTakenOrCompleted(dateLastTakenOrCompleted);
        cotriexposure.setNotes(CotrimoxazoleYesDose);
        priorExposureImpl.addPatientsPriorExposures(cotriexposure);

        Tblpatientspriorexposure flzexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId flzexposureid = new TblpatientspriorexposureId();
        flzexposureid.setPatientId(patientIds);
        flzexposureid.setDrugTypeId(Fluconazole);
        flzexposure.setId(flzexposureid);
        //flzexposure.setRegimenCode(Integer.MIN_VALUE);
        flzexposure.setDateStarted(FluconazoleYesDateStartedf);
        flzexposure.setDateLastTakenOrCompleted(FluconazoleYesDateCompletedf);
        flzexposure.setNotes(FluconazoleYesDose);
        priorExposureImpl.addPatientsPriorExposures(flzexposure);

        Tblpatientspriorexposure tbtherapy = new Tblpatientspriorexposure();
        TblpatientspriorexposureId tbTherapyid = new TblpatientspriorexposureId();
        tbTherapyid.setPatientId(patientIds);
        tbTherapyid.setDrugTypeId(CurrentTBTherapy);
        tbtherapy.setId(tbTherapyid);
        //flzexposure.setRegimenCode(Integer.MIN_VALUE);
        // flzexposure.setDateStarted(dateStarted);
        ///flzexposure.setDateLastTakenOrCompleted(dateLastTakenOrCompleted);
        tbtherapy.setNotes(TBCategory);
        priorExposureImpl.addPatientsPriorExposures(tbtherapy);

        Tblpatientspriorexposure otherexposure = new Tblpatientspriorexposure();
        TblpatientspriorexposureId otherexposureid = new TblpatientspriorexposureId();
        otherexposureid.setPatientId(patientIds);
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
        cd4test.setPatientId(patientIds);
        cd4test.setDateOfEnrolment(enrolmentDate);
        String cd4 = "CD4";
        cd4test.setTestTypeId(cd4);
        cd4test.setResultNumeric(CDCountResult);
        cd4test.setResultDate(CDCountDate);
        baselineImpl.addBaselineTests(cd4test);

        //cd4 percentage
        Tblbaselinetests cd4perc = new Tblbaselinetests();
        cd4perc.setPatientId(patientIds);
        cd4perc.setDateOfEnrolment(enrolmentDate);
        String cdperc = "CD%";
        cd4perc.setTestTypeId(cdperc);
        cd4perc.setResultNumeric(CDPercResult);
        cd4perc.setResultDate(CDPercDate);
        baselineImpl.addBaselineTests(cd4perc);

        //hb 
        Tblbaselinetests hb = new Tblbaselinetests();
        hb.setPatientId(patientIds);
        hb.setDateOfEnrolment(enrolmentDate);
        String hbresult = "HBX";
        hb.setTestTypeId(hbresult);
        hb.setResultNumeric(HBResult);
        hb.setResultDate(HBDate);
        baselineImpl.addBaselineTests(hb);

        //ALT
        Tblbaselinetests alt = new Tblbaselinetests();
        alt.setPatientId(patientIds);
        alt.setDateOfEnrolment(enrolmentDate);
        String altresult = "ALT";
        alt.setTestTypeId(altresult);
        alt.setResultNumeric(ALTResult);
        alt.setResultDate(ALTDate);
        baselineImpl.addBaselineTests(alt);

        //WBC
        Tblbaselinetests wbc = new Tblbaselinetests();
        wbc.setPatientId(patientIds);
        wbc.setDateOfEnrolment(enrolmentDate);
        String wbcresult = "WBC";
        wbc.setTestTypeId(wbcresult);
        wbc.setResultNumeric(WBCResult);
        wbc.setResultDate(WBCDate);
        baselineImpl.addBaselineTests(wbc);
        //Creatinine
        Tblbaselinetests creatinine = new Tblbaselinetests();
        creatinine.setPatientId(patientIds);
        creatinine.setDateOfEnrolment(enrolmentDate);
        String creatinineresult = "CRT";
        creatinine.setTestTypeId(creatinineresult);
        creatinine.setResultNumeric(CreatinineResult);
        creatinine.setResultDate(CreatinineDate);
        baselineImpl.addBaselineTests(creatinine);

        //Viral Load
        Tblbaselinetests vl = new Tblbaselinetests();
        vl.setPatientId(patientIds);
        vl.setDateOfEnrolment(enrolmentDate);
        String vlresult = "VRL";
        vl.setTestTypeId(vlresult);
        vl.setResultNumeric(VLResult);
        vl.setResultDate(VLDate);
        baselineImpl.addBaselineTests(vl);
        //weight
        Tblbaselinetests weight = new Tblbaselinetests();
        weight.setPatientId(patientIds);
        weight.setDateOfEnrolment(enrolmentDate);
        String weightresult = "WGT";
        weight.setTestTypeId(weightresult);
        weight.setResultNumeric(Weight);
        baselineImpl.addBaselineTests(weight);
        //height

        Tblbaselinetests height = new Tblbaselinetests();
        height.setPatientId(patientIds);
        height.setDateOfEnrolment(enrolmentDate);
        String heightresult = "HGC";
        height.setTestTypeId(heightresult);
        height.setResultNumeric(Height);
        baselineImpl.addBaselineTests(height);

        //blood pressure        
        Tblbaselinetests bp = new Tblbaselinetests();
        bp.setPatientId(patientIds);
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
        temperature.setPatientId(patientIds);
        temperature.setDateOfEnrolment(enrolmentDate);
        String tempresult = "TMP";
        temperature.setTestTypeId(tempresult);
        temperature.setResultNumeric(Temperature);
        baselineImpl.addBaselineTests(temperature);

        //PULSE
        Tblbaselinetests pulse = new Tblbaselinetests();
        pulse.setPatientId(patientIds);
        pulse.setDateOfEnrolment(enrolmentDate);
        String pulseresult = "PUL";
        pulse.setTestTypeId(pulseresult);
        pulse.setResultNumeric(Pulse);
        baselineImpl.addBaselineTests(pulse);

        //Respiration Rate
        Tblbaselinetests respRate = new Tblbaselinetests();
        respRate.setPatientId(patientIds);
        respRate.setDateOfEnrolment(enrolmentDate);
        String respRateResult = "RES";
        respRate.setTestTypeId(respRateResult);
        respRate.setResultNumeric(RespirationRate);
        baselineImpl.addBaselineTests(respRate);

        CompletedARTClientAll cptdOIARTClient = new CompletedARTClientAll(patientIds);

        //also add patient
        p.setPatientId(patientIds);
        cptdOIARTClient.setP(p);
        CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
        //editOIArt patient table and update the OIArt number in the demographic table
        circumImpl.editOIArt(p);

        session.setAttribute("cptdOIARTClient", cptdOIARTClient);
        //dispatch to dashboard
        response.sendRedirect("AllOIARTServ");
//        AllHtsServ serv = new AllHtsServ();
//        serv.doGet(request, response);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
