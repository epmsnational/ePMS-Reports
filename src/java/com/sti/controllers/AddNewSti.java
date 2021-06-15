package com.sti.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.HtsEntrypoint;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Sti;
import com.vmmc.entities.StiSetuppurposeofsyphilis;
import com.vmmc.services.CompletedStiClientAll;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.SetupServiceImpl;
import com.vmmc.services.StiSetuppurposeofsyphilisableImpl;
import com.vmmc.services.StiTestableImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
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
import com.vmmc.entities.StiDrugs;
import com.vmmc.entities.StiExaminations;
import com.vmmc.entities.StiHistory;
import com.vmmc.entities.StiInfectiontype;
import com.vmmc.entities.StiSetupsyndrome;
import com.vmmc.entities.StiSexualactivity;
import com.vmmc.entities.StiSymptoms;
import com.vmmc.entities.StiTreament;
import com.vmmc.entities.Vmmcservicetype;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.StiTreatableImpl;
import java.util.ArrayList;

/**
 *
 * @author leon-mbano
 */
public class AddNewSti extends HttpServlet {

    static SetupServiceImpl setup = new SetupServiceImpl();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        
        Patient p = null;
        Sti s = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p = tempClient == null ? (Patient) session.getAttribute("patient") : new StiTestableImpl().getPatient(tempClient);

        float age = 0;

        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        p.setAge(age);
        String stiNum = p.getStiId();

        StiSetuppurposeofsyphilisableImpl tt = new StiSetuppurposeofsyphilisableImpl();
        List<StiSetuppurposeofsyphilis> lstStiTestpurposes = tt.getAllStiSetupPurpose();

        ///
        List<StiInfectiontype> lstfemaleinfections = setup.getSTIAdultFemaleInfections();
        request.setAttribute("femaleinfections", lstfemaleinfections);

        List<StiInfectiontype> lstmaleinfections = setup.getSTIAdultMaleInfections();
        request.setAttribute("maleinfections", lstmaleinfections);

        List<StiInfectiontype> lstmaleInfantsinfections = setup.getSTIMaleInfantsInfections();
        request.setAttribute("maleInfantsinfections", lstmaleInfantsinfections);

        List<StiInfectiontype> lstfemaleinfantsinfections = setup.getSTIfemaleInfantsInfections();
        request.setAttribute("femaleinfantsinfections", lstfemaleinfantsinfections);

        List<StiInfectiontype> lstallinfantsinfections = setup.getSTIAllInfantsInfections();
        request.setAttribute("allinfantsinfections", lstallinfantsinfections);

        List<StiInfectiontype> lstallinfections = setup.getSTIAllInfections();
        request.setAttribute("allinfections", lstallinfections);

        ///
        List<HtsEntrypoint> lstHtsEntrypoint = setup.getHtsEntrypoints();
        request.setAttribute("htcentrypoint", lstHtsEntrypoint);

        List<StiHistory> lstHistory = setup.getSTIHistory();
        request.setAttribute("stihistory", lstHistory);

        List<StiHistory> lstPreTreatmentHistory = setup.getSTIPreviousTreatmentHistory();
        request.setAttribute("stiprevtreathistory", lstPreTreatmentHistory);

        List<StiHistory> lstDrugAllegHistory = setup.getSTIDrugAllegiesHistory();
        request.setAttribute("stidrugalleghistory", lstDrugAllegHistory);

        List<StiExaminations> lstexaminations = setup.getSTIExaminations1();
        request.setAttribute("stigeneralexaminations", lstexaminations);

        List<StiExaminations> lstmaleexams = setup.getSTIExaminations2();
        request.setAttribute("stimaleexaminations", lstmaleexams);

        List<StiExaminations> lstfemaleexams = setup.getSTIExaminations3();
        request.setAttribute("stifemaleexaminations", lstfemaleexams);

        List<StiSetupsyndrome> lststifsyndromes = setup.getSTIFSyndromes();
        request.setAttribute("stifsyndromes", lststifsyndromes);

        List<StiSetupsyndrome> lststimsyndromes = setup.getSTIMSyndromes();
        request.setAttribute("stimsyndromes", lststimsyndromes);

        List<StiSymptoms> lstfsymptoms = setup.getSTIFemaleSymptoms();
        request.setAttribute("stifsymptoms", lstfsymptoms);

        List<StiSymptoms> lstmsymptoms = setup.getSTIMaleSymptoms();
        request.setAttribute("stimsymptoms", lstmsymptoms);

        List<StiSexualactivity> lstsexualactivity = setup.getSTISexualactivity();
        request.setAttribute("sexualactivity", lstsexualactivity);

        List<Vmmcservicetype> lstservicetype = setup.getVmmcServiceTypes();
        request.setAttribute("vmmcServices", lstservicetype);

        List<StiDrugs> lstUITreatment = setup.getSTIUItreatments();
        request.setAttribute("UITreatment", lstUITreatment);

        List<StiDrugs> lstVITreatment = setup.getSTIVItreatments();
        request.setAttribute("VITreatment", lstVITreatment);

        List<StiDrugs> lstSITreatment = setup.getSTISItreatments();
        request.setAttribute("SITreatment", lstSITreatment);

        List<StiDrugs> lstPIDTreatment = setup.getSTIPIDtreatments();
        request.setAttribute("PIDTreatment", lstPIDTreatment);

        List<StiDrugs> lstCITreatment = setup.getSTICItreatments();
        request.setAttribute("CITreatment", lstCITreatment);

        List<StiDrugs> lstARITreatment = setup.getSTIARItreatments();
        request.setAttribute("ARITreatment", lstARITreatment);

        List<StiDrugs> lstGITreatment = setup.getSTIGItreatments();
        request.setAttribute("GITreatment", lstGITreatment);

        List<StiDrugs> lstPFITreatment = setup.getSTIPFItreatments();
        request.setAttribute("PFITreatment", lstPFITreatment);

        List<StiDrugs> lstESITreatment = setup.getSTIESItreatments();
        request.setAttribute("ESITreatment", lstESITreatment);

        List<StiDrugs> lstAGWTreatment = setup.getSTIAGWtreatments();
        request.setAttribute("AGWTreatment", lstAGWTreatment);

        List<StiDrugs> lstSPITreatment = setup.getSTISPItreatments();
        request.setAttribute("SPITreatment", lstSPITreatment);

        List<StiDrugs> lstIITreatment = setup.getSTIIItreatments();
        request.setAttribute("IITreatment", lstIITreatment);

        //STI female entrypoints list
        List<HtsEntrypoint> lstSTIFEntrypoint = setup.getSTIFEntrypoints();
        request.setAttribute("stifentrypoint", lstSTIFEntrypoint);

//        //STI male entrypoints list
        List<HtsEntrypoint> lstSTIMEntrypoint = setup.getSTIMEntrypoints();
        request.setAttribute("stimentrypoint", lstSTIMEntrypoint);

        // List<StiSetuppurposeofsyphilis> lstStiTestpurposes = setup.getStiSetuppurposeofsyphilis();
        request.setAttribute("stitestpurposes", lstStiTestpurposes);
        session.setAttribute("patient", p);
        session.setAttribute("stiNum", stiNum);

        RequestDispatcher disp = request.getRequestDispatcher("sti/newSTI.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Patient p = (Patient) request.getSession().getAttribute("patient");

        //creating STI Number using system
//        Facilityconfig fc = new FacilityConfigServiceImpl().getFacilityConfig(1);
//        StiSqnumber sqn = new StiSqnumber();
//        StiSeqNumberImpl sqnservive = new StiSeqNumberImpl();
//        sqn = sqnservive.findByID(1);
//        String stinumberStub = fc.getProvinceId() + "-" + fc.getDistrictId() + "-" + fc.getFacilityId();
//        // String locationForHts = null;
//        String locationFoSti = null;
//        String currentyear = null;
//        int yearvaluestored;
//        try {
//            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//            Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
//            java.util.Date timeStamp = format.parse(currentTimestamp.toString());
//
//            currentyear = currentTimestamp.toString().substring(0, 4);
//            yearvaluestored = sqn.getYear();
//
//            //////
//            if (yearvaluestored != Integer.parseInt(currentyear)) {
//                int newyear = Integer.parseInt(currentyear);
//                int serialnum = 1;
//                locationFoSti = stinumberStub + "-"
//                        + newyear + "-" + "S" + "-" + serialnum;
//                sqn.setYear(newyear);
//                sqn.setSqnumber(2);
//                sqnservive.edidSeqnumber(sqn);
//            } else {
//                locationFoSti = stinumberStub + "-"
//                        + currentyear + "-" + "S" + "-" + sqn.getSqnumber();
//                sqn.setSqnumber(sqn.getSqnumber() + 1);
//
//                sqnservive.edidSeqnumber(sqn);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //System generated STI number
        //String stiNo =locationFoSti;
        // Step one 
        String stiNo = request.getParameter("txtStiNo");
        String StiRegDate = request.getParameter("txtStiRegDate");
//        String StiEntryPoint = request.getParameter("txtStiEntryPoint");
        String StiFEntryPoint = request.getParameter("txtStiFEntryPoint");
        String StiMEntryPoint = request.getParameter("txtStiMEntryPoint");
        // Step six 
        // syphilis screening 
        String StiEpisode = request.getParameter("txtStiEpisode");
        String TestedForSyphilis = request.getParameter("txtTestedForSyphilis");
        String PurposeOfSyphilisTesting = request.getParameter("txtPurposeOfSyphilisTesting");
        String SyphilisTestResults = request.getParameter("txtGenSyphilisTestResults");

        /// syphilis in ANC
        String AncBookingTime = request.getParameter("txtAncBookingTime");
        String AncTestedForSyphilis = request.getParameter("txtAncTestedForSyphilis");
        String AncSyphilisTestResults = request.getParameter("txtAncSyphilisTestResults");
        String AncSyphilisTreated = request.getParameter("txtAncSyphilisTreated");
        ///
        String DeliveryOutcome = request.getParameter("txtDeliveryOutcome");
        String DateOfDelivery = request.getParameter("txtDateOfDelivery");
        String AncSyphilisDuringPregnantTreated = request.getParameter("txtAncSyphilisDuringPregnantTreated");
        String AncSyphilisTestDuringPregnantResults = request.getParameter("txtAncSyphilisTestDuringPregnantResults");
        String AncDateSyphillisTestedDuringPregnancy = request.getParameter("txtAncDateSyphillisTestedDuringPregnancy");
        String AncSyphillisTestedDuringPregnancy = request.getParameter("txtAncSyphillisTestedDuringPregnancy");

        //// STI treatment in ANC
        String AncVITreatment = request.getParameter("txtAncVITreatment");
        String AncVIDose = request.getParameter("txtAncVIDose");
        String AncVIDuration = request.getParameter("txtAncVIDuration");
        String AncPIDTreatment = request.getParameter("txtAncPIDTreatment");
        String AncPIDDose = request.getParameter("txtAncPIDDose");
        String AncPIDDuration = request.getParameter("txtAncPIDDuration");
        String AncCITreatment = request.getParameter("txtAncCITreatment");
        String AncCIDose = request.getParameter("txtAncCIDose");
        String AncCIDuration = request.getParameter("txtAncCIDuration");
        String AncARITreatment = request.getParameter("txtAncARITreatment");
        String AncARIDose = request.getParameter("txtAncARIDose");
        String AncARIDuration = request.getParameter("txtAncARIDuration");
        String AncGITreatment = request.getParameter("txtAncGITreatment");
        String AncGIDose = request.getParameter("txtAncGIDose");
        String AncGIDuration = request.getParameter("txtAncGIDuration");
        String AncESITreatment = request.getParameter("txtAncESITreatment");
        String AncESIDose = request.getParameter("txtAncESIDose");
        String AncESIDuration = request.getParameter("txtAncESIDuration");
        String AncAGWTreatment = request.getParameter("txtAncAGWTreatment");
        String AncAGWDose = request.getParameter("txtAncAGWDose");
        String AncAGWDuration = request.getParameter("txtAncAGWDuration");
        String AncSPITreatment = request.getParameter("txtAncSPITreatment");
        String AncSPIDose = request.getParameter("txtAncSPIDose");
        String AncSPIDuration = request.getParameter("txtAncSPIDuration");
        String AncIITreatment = request.getParameter("txtAncIITreatment");
        String AncIIDose = request.getParameter("txtAncIIDose");
        String AncIIDuration = request.getParameter("txtAncIIDuration");
        String AncOtherTreatment = request.getParameter("txtAncOtherTreatment");
        String AncOtherDose = request.getParameter("txtAncOtherDose");
        String AncOtherDuration = request.getParameter("txtAncOtherDuration");
        String specifyOtherExam = request.getParameter("txtSpecifyOtherExam");
        String specifyHistory = request.getParameter("txtSpecifyHistory");

        // need to be checked Dose,Frequence,Duration
        String TestedForHiv = request.getParameter("txtTestedForHiv");
        String HivTestResult = request.getParameter("txtHivTestResult");
        String StiContactSlipIssue = request.getParameter("txtStiContactSlipIssue");
        String StiContactSlipReceived = request.getParameter("txtStiContactSlipReceived");
        String CondomInfoGiven = request.getParameter("txtCondomInfoGiven");
        String CondomIssued = request.getParameter("txtCondomIssued");
        String TestedHIVBefore = request.getParameter("txtTestedHIVBefore");
        String HIVTestedBeforeResult = request.getParameter("txtHIVTestedBeforeResult");
        String Comment = request.getParameter("txtComment");
        ///step 7 treatment table
        String UITreatment = request.getParameter("txtUITreatment");
        String UIDose = request.getParameter("txtUIDose");
        String UIDuration = request.getParameter("txtUIDuration");
        String VITreatment = request.getParameter("txtVITreatment");
        String VIDose = request.getParameter("txtVIDose");
        String VIDuration = request.getParameter("txtVIDuration");
        String SITreatment = request.getParameter("txtSITreatment");
        String SIDose = request.getParameter("txtSIDose");
        String SIDuration = request.getParameter("txtSIDuration");
        String PIDTreatment = request.getParameter("txtPIDTreatment");
        String PIDDose = request.getParameter("txtPIDDose");
        String PIDDuration = request.getParameter("txtPIDDuration");
        String CITreatment = request.getParameter("txtCITreatment");
        String CIDose = request.getParameter("txtCIDose");
        String CIDuration = request.getParameter("txtCIDuration");
        String ARITreatment = request.getParameter("txtARITreatment");
        String ARIDose = request.getParameter("txtARIDose");
        String ARIDuration = request.getParameter("txtARIDuration");
        String GITreatment = request.getParameter("txtGITreatment");
        String GIDose = request.getParameter("txtGIDose");
        String GIDuration = request.getParameter("txtGIDuration");
        String PFITreatment = request.getParameter("txtPFITreatment");
        String PFIDose = request.getParameter("txtPFIDose");
        String PFIDuration = request.getParameter("txtPFIDuration");
        String ESITreatment = request.getParameter("txtESITreatment");
        String ESIDose = request.getParameter("txtESIDose");
        String ESIDuration = request.getParameter("txtESIDuration");
        String AGWTreatment = request.getParameter("txtAGWTreatment");
        String AGWDose = request.getParameter("txtAGWDose");
        String AGWDuration = request.getParameter("txtAGWDuration");
        String SPITreatment = request.getParameter("txtSPITreatment");
        String SPIDose = request.getParameter("txtSPIDose");
        String SPIDuration = request.getParameter("txtSPIDuration");
        String IITreatment = request.getParameter("txtIITreatment");
        String IIDose = request.getParameter("txtIIDose");
        String IIDuration = request.getParameter("txtIIDuration");
        String OtherTreatment = request.getParameter("txtOtherTreatment");
        String OtherDose = request.getParameter("txtOtherDose");
        String OtherDuration = request.getParameter("txtOtherDuration");

        /// Dealing with data from checkboxes
        String recenthistry = null;
        String previousHistory = null;
        String drugalleghistory = null;
        String generalExamination = null;
        String examination = null;
        String sexualactivityhistory = null;
        String symptoms = null;
        String syndrome = null;
        String femaleinfection = null;
        String maleinfection = null;
        String maleInfantsinfection = null;
        String femaleinfantsinfection = null;
        String allinfection = null;

/// Step 2
        String[] msymptomValues = request.getParameterValues("ckmsymptom");
        if (msymptomValues != null) {
            for (String g : msymptomValues) {
                symptoms = "#" + g;

            }
        }
        String[] fsymptomValues = request.getParameterValues("ckfsymptom");
        if (fsymptomValues != null) {
            for (String g : fsymptomValues) {
                symptoms = "#" + g;

            }
        }
        String[] generalHistoryValues = request.getParameterValues("chkHistory");
        if (generalHistoryValues != null) {
            for (String g : generalHistoryValues) {
                recenthistry = "#" + g;

            }
        }
        String[] generalPreviousHistoryValues = request.getParameterValues("chkPrevhistory");
        if (generalPreviousHistoryValues != null) {
            for (String g : generalPreviousHistoryValues) {
                previousHistory = "#" + g;
            }
        }
        String[] generalDrugallhistoryValues = request.getParameterValues("chkDrugallhistory");
        if (generalDrugallhistoryValues != null) {
            for (String g : generalDrugallhistoryValues) {
                drugalleghistory = "#" + g;
            }
        }

        ///// end step 2
        // Step 3 
        String[] generalsexualactivityValues = request.getParameterValues("cksexualactivity");
        if (generalsexualactivityValues != null) {
            for (String g : generalsexualactivityValues) {
                sexualactivityhistory = "#" + g;
            }
        }

        String[] generalgenexamValues = request.getParameterValues("ckgenexam");
        if (generalgenexamValues != null) {
            for (String g : generalgenexamValues) {
                generalExamination = "#" + g;
            }
        }
        String[] generalmexamValues = request.getParameterValues("ckmexam");
        if (generalmexamValues != null) {
            for (String g : generalmexamValues) {
                examination = "#" + g;
            }
        }

        String[] generalfexamValues = request.getParameterValues("ckfexam");
        if (generalfexamValues != null) {
            for (String g : generalfexamValues) {
                examination = "#" + g;
            }
        }

        //// end of step 3
        /// Step 4
        String[] femaleinfectionValue = request.getParameterValues("ckfemaleinfection");
        if (femaleinfectionValue != null) {
            for (String g : femaleinfectionValue) {
                femaleinfection = "#" + g;
            }
        }

        String[] msyndromeValues = request.getParameterValues("ckmsyndrome");
        if (msyndromeValues != null) {
            for (String g : msyndromeValues) {
                syndrome = "#" + g;

            }
        }

        String[] fsyndromeValues = request.getParameterValues("ckfsyndrome");
        if (fsyndromeValues != null) {
            for (String g : fsyndromeValues) {
                syndrome = "#" + g;

            }
        }

        String[] maleinfectionValue = request.getParameterValues("ckmaleinfection");
        if (maleinfectionValue != null) {
            for (String g : maleinfectionValue) {
                maleinfection = "#" + g;
            }
        }

        String[] maleInfantsinfectionValue = request.getParameterValues("ckmaleInfantsinfection");

        if (maleInfantsinfectionValue != null) {
            for (String g : maleInfantsinfectionValue) {
                maleInfantsinfection = "#" + g;
            }
        }
        String[] femaleinfantsinfectionValue = request.getParameterValues("ckfemaleinfantsinfection");
        if (femaleinfantsinfectionValue != null) {
            for (String g : femaleinfantsinfectionValue) {
                femaleinfantsinfection = "#" + g;
            }
        }

        String[] allinfectionValue = request.getParameterValues("ckallinfection");
        if (allinfectionValue != null) {
            for (String g : allinfectionValue) {
                allinfection = "#" + g;
            }
        }

        /// End of step 4
        // changing the date from string to date format
        Date dtsti = null;
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            dtsti = StiRegDate.length() > 0 ? df.parse(StiRegDate.replace('-', '/')) : null;
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        /// DateOfDelivery
        Date dateOfDelivery = null;

        try {
            dateOfDelivery = DateOfDelivery.length() > 0 ? df.parse(DateOfDelivery.replace('-', '/')) : null;
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        //// AncDateSyphillisTestedDuringPregnancy
        Date ancdatesyphillistestesduringpregnancy = null;
        try {
            ancdatesyphillistestesduringpregnancy = AncDateSyphillisTestedDuringPregnancy.length() > 0 ? df.parse(AncDateSyphillisTestedDuringPregnancy.replace('-', '/')) : null;
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        String infection = femaleinfection + "#" + maleinfection + "#" + maleInfantsinfection + "#" + femaleinfantsinfection + "#" + allinfection;
        //////
//         List<String> infections = new ArrayList();
//        
//        if (!femaleinfection.isEmpty()) {
//            infections.add(femaleinfection);
//        }
//        if (!maleinfection.isEmpty()) {
//            infections.add(maleinfection);
//        }
//        if (!maleInfantsinfection.isEmpty()) {
//            infections.add(maleInfantsinfection);
//        }
//        if (!femaleinfantsinfection.isEmpty()) {
//            infections.add(femaleinfantsinfection);
//        }
//        if (!allinfection.isEmpty()) {
//            infections.add(allinfection);
//        }
//        
//        String infection = null;
//        
//        for (String i : infections) {
//            infection = infection + "#" + i;
//        }
        //////
        List<String> doses = new ArrayList();

        if (!IIDose.isEmpty()) {
            doses.add(IIDose);
        }
        if (!SPIDose.isEmpty()) {
            doses.add(SPIDose);
        }
        if (!AGWDose.isEmpty()) {
            doses.add(AGWDose);
        }
        if (!ESIDose.isEmpty()) {
            doses.add(ESIDose);
        }
        if (!PFIDose.isEmpty()) {
            doses.add(PFIDose);
        }
        if (!GIDose.isEmpty()) {
            doses.add(GIDose);
        }
        if (!ARIDose.isEmpty()) {
            doses.add(ARIDose);
        }
        if (!CIDose.isEmpty()) {
            doses.add(CIDose);
        }
        if (!PIDDose.isEmpty()) {
            doses.add(PIDDose);
        }
        if (!SIDose.isEmpty()) {
            doses.add(SIDose);
        }
        if (!VIDose.isEmpty()) {
            doses.add(VIDose);
        }
        if (!UIDose.isEmpty()) {
            doses.add(UIDose);
        }
        if (!OtherDose.isEmpty()) {
            doses.add(OtherDose);
        }
        String dose = null;

        for (String i : doses) {
            dose = dose + "#" + i;
        }

//        String dose = IIDose + "#" + SPIDose + "#" + AGWDose + "#" + ESIDose + "#" + PFIDose + "#" + GIDose + "#" + ARIDose + "#"
//                + CIDose + "#" + PIDDose + "#" + SIDose + "#" + VIDose + "#" + UIDose;
//
        List<String> durations = new ArrayList();

        if (!IIDuration.isEmpty()) {
            durations.add(IIDuration);
        }
        if (!SPIDuration.isEmpty()) {
            durations.add(SPIDuration);
        }
        if (!AGWDuration.isEmpty()) {
            durations.add(AGWDuration);
        }
        if (!ESIDuration.isEmpty()) {
            durations.add(ESIDuration);
        }
        if (!PFIDuration.isEmpty()) {
            durations.add(PFIDuration);
        }
        if (!GIDuration.isEmpty()) {
            durations.add(GIDuration);
        }
        if (!ARIDuration.isEmpty()) {
            durations.add(ARIDuration);
        }
        if (!CIDuration.isEmpty()) {
            durations.add(CIDuration);
        }
        if (!PIDDuration.isEmpty()) {
            durations.add(PIDDuration);
        }
        if (!SIDuration.isEmpty()) {
            durations.add(SIDuration);
        }
        if (!VIDuration.isEmpty()) {
            durations.add(VIDuration);
        }
        if (!UIDuration.isEmpty()) {
            durations.add(VIDuration);
        }
        if (!OtherDuration.isEmpty()) {
            durations.add(OtherDuration);
        }
        String duration = null;
        for (String i : durations) {
            duration = duration + "#" + i;
        }

//        String duration = IIDuration + "#" + SPIDuration + "#" + AGWDuration + "#" + ESIDuration
//                + "#" + PFIDuration + "#" + GIDuration + "#" + ARIDuration + "#" + CIDuration + "#" + PIDDuration  + "#" + SIDuration + "#"
//                + VIDuration + "#" + UIDuration;
        List<String> treatments = new ArrayList();

        if (!IITreatment.isEmpty()) {
            treatments.add(IITreatment);
        }
        if (!SPITreatment.isEmpty()) {
            treatments.add(SPITreatment);
        }
        if (!AGWTreatment.isEmpty()) {
            treatments.add(AGWTreatment);
        }
        if (!ESITreatment.isEmpty()) {
            treatments.add(ESITreatment);
        }
        if (!PFITreatment.isEmpty()) {
            treatments.add(PFITreatment);
        }
        if (!GITreatment.isEmpty()) {
            treatments.add(GITreatment);
        }
        if (!ARITreatment.isEmpty()) {
            treatments.add(ARITreatment);
        }

        if (!CITreatment.isEmpty()) {
            treatments.add(CITreatment);
        }
        if (!PIDTreatment.isEmpty()) {
            treatments.add(PIDTreatment);
        }
        if (!SITreatment.isEmpty()) {
            treatments.add(SITreatment);
        }
        if (!VITreatment.isEmpty()) {
            treatments.add(VITreatment);
        }
        if (!UITreatment.isEmpty()) {
            treatments.add(UITreatment);
        }
        if (!OtherTreatment.isEmpty()) {
            treatments.add(OtherTreatment);
        }

        String treatment = null;
        for (String i : treatments) {
            treatment = treatment + "#" + i;
        }

//        String treatment = IITreatment + "#" + SPITreatment + "#" + AGWTreatment + "#" + ESITreatment
//                + "#" + PFITreatment + "#" + GITreatment + "#" + ARITreatment + "#" + CITreatment + "#" + PIDTreatment + "#" + SITreatment + "#"
//                + VITreatment + "#" + UITreatment;
        List<String> anctreatments = new ArrayList();

        if (!AncVITreatment.isEmpty()) {
            anctreatments.add(AncVITreatment);
        }
        if (!AncPIDTreatment.isEmpty()) {
            anctreatments.add(AncPIDTreatment);
        }
        if (!AncCITreatment.isEmpty()) {
            anctreatments.add(AncCITreatment);
        }
        if (!AncARITreatment.isEmpty()) {
            anctreatments.add(AncARITreatment);
        }
        if (!AncGITreatment.isEmpty()) {
            anctreatments.add(AncGITreatment);
        }

        if (!AncESITreatment.isEmpty()) {
            anctreatments.add(AncESITreatment);
        }
        if (!AncAGWTreatment.isEmpty()) {
            anctreatments.add(AncAGWTreatment);
        }
        if (!AncSPITreatment.isEmpty()) {
            anctreatments.add(AncSPITreatment);
        }
        if (!AncIITreatment.isEmpty()) {
            anctreatments.add(AncIITreatment);
        }
        if (!AncOtherTreatment.isEmpty()) {
            anctreatments.add(AncOtherTreatment);

        }

        String anctreatment = null;
        for (String i : anctreatments) {
            anctreatment = anctreatment + "#" + i;
        }
//        String ancdose = AncVITreatment + "#" + AncPIDTreatment + "#" + AncCITreatment + "#" + AncARITreatment + "#" + AncGITreatment + "#"
//                + AncESITreatment + "#" + AncAGWTreatment + "#" + AncSPITreatment + "#" + AncIITreatment + "#" + AncOtherTreatment;

        List<String> ancdurations = new ArrayList();

        if (!AncVIDuration.isEmpty()) {
            ancdurations.add(AncVIDuration);
        }
        if (!AncPIDDuration.isEmpty()) {
            ancdurations.add(AncPIDDuration);
        }
        if (!AncCIDuration.isEmpty()) {
            ancdurations.add(AncCIDuration);
        }
        if (!AncARIDuration.isEmpty()) {
            ancdurations.add(AncARIDuration);
        }
        if (!AncGIDuration.isEmpty()) {
            ancdurations.add(AncGIDuration);
        }

        if (!AncESIDuration.isEmpty()) {
            ancdurations.add(AncESIDuration);
        }
        if (!AncAGWDuration.isEmpty()) {
            ancdurations.add(AncAGWDuration);
        }
        if (!AncSPIDuration.isEmpty()) {
            ancdurations.add(AncSPIDuration);
        }
        if (!AncIIDuration.isEmpty()) {
            ancdurations.add(AncIIDuration);
        }
        if (!AncOtherDuration.isEmpty()) {
            ancdurations.add(AncOtherDuration);
        }

        String ancduration = null;
        for (String i : ancdurations) {
            ancduration = ancduration + "#" + i;
        }
//        String ancduration = AncVIDuration + "#" + AncPIDDuration + "#" + AncCIDuration + "#" + AncARIDuration + "#" + AncGIDuration + "#"
//                + AncESIDuration + "#" + AncAGWDuration + "#" + AncSPIDuration + "#" + AncIIDuration + "#" + AncOtherDuration;

        List<String> ancdoses = new ArrayList();

        if (!AncVIDose.isEmpty()) {
            ancdoses.add(AncVIDose);
        }
        if (!AncPIDDose.isEmpty()) {
            ancdoses.add(AncPIDDose);
        }
        if (!AncCIDose.isEmpty()) {
            ancdoses.add(AncCIDose);
        }
        if (!AncARIDose.isEmpty()) {
            ancdoses.add(AncARIDose);
        }
        if (!AncGIDose.isEmpty()) {
            ancdoses.add(AncGIDose);
        }

        if (!AncESIDose.isEmpty()) {
            ancdoses.add(AncESIDose);
        }
        if (!AncAGWDose.isEmpty()) {
            ancdoses.add(AncAGWDose);
        }
        if (!AncSPIDose.isEmpty()) {
            ancdoses.add(AncSPIDose);
        }
        if (!AncIIDose.isEmpty()) {
            ancdoses.add(AncIIDose);
        }
        if (!AncOtherDose.isEmpty()) {
            ancdoses.add(AncOtherDose);
        }

        String ancdose = null;
        for (String i : ancdoses) {
            ancdose = ancdose + "#" + i;
        }
//        String  = AncVIDose + "#" + AncPIDDose + "#" + AncCIDose + "#" + AncARIDose + "#" + AncGIDose + "#"
//                + AncESIDose + "#" + AncAGWDose + "#" + AncSPIDose + "#" + AncIIDose + "#" + AncOtherDose;

        /// Ading sit details to sti_table
        StiTestableImpl stiImp = new StiTestableImpl();
        Sti sti = new Sti();
        sti.setOpdnumber(p.getOpdnumber());
        sti.setStinumber(stiNo);
        sti.setDateOfRegistration(dtsti);
        // sti.setEntryPoint(StiEntryPoint);
        sti.setEntryPoint(StiMEntryPoint);
        sti.setEntryPoint(StiFEntryPoint);
        sti.setAncTestedForSyphilis(AncTestedForSyphilis);
        sti.setAncSyphilisResult(AncSyphilisTestResults);
        sti.setAncSyphilisTreated(AncSyphilisTreated);
        ///
        sti.setDeliveryOutcome(DeliveryOutcome);
        sti.setAncDeliveryDate(dateOfDelivery);
        sti.setAncSyphTreatedBefore(AncSyphilisDuringPregnantTreated);
        sti.setAncDateTestedSyphDuriPreg(ancdatesyphillistestesduringpregnancy);
        sti.setAncTestedDuringPregnancy(AncSyphillisTestedDuringPregnancy);
        sti.setAncSyphTestedBeforeResult(AncSyphilisTestDuringPregnantResults);

        sti.setAncBookingTime(AncBookingTime);
        sti.setStiInfectionType(infection);
        sti.setStisyndrome(syndrome);

        sti.setTreatment(treatment);
        sti.setPurposeOfSyphilisTesting(PurposeOfSyphilisTesting);
        sti.setEpisode(StiEpisode);
        sti.setTestedForSyphilis(TestedForSyphilis);
        sti.setHivTestResult(HivTestResult);
        sti.setSyphilisResult(SyphilisTestResults);
        sti.setSyphilisTestResult(SyphilisTestResults);
        sti.setSyphilisTreated(AncSyphilisTreated);
        sti.setDeliveryOutcome(DeliveryOutcome);
        sti.setAncBookingTime(AncBookingTime);
        sti.setTestedForHiv(TestedForHiv);
        sti.setHivTestResult(HivTestResult);
        sti.setStiContactSlipIssued(StiContactSlipIssue);
        sti.setStiContactSlipReceived(StiContactSlipReceived);
        sti.setCondomInformationGiven(CondomInfoGiven);
        sti.setCondomsIssued(CondomIssued);
        sti.setHivtestedBefore(TestedHIVBefore);
        sti.setHivtestedBeforeResult(HIVTestedBeforeResult);
        sti.setComments(Comment);
        sti.setSexualHistory(specifyHistory + recenthistry + previousHistory + drugalleghistory + sexualactivityhistory);
        sti.setComplaints(symptoms);
        sti.setExaminations(generalExamination + examination + specifyOtherExam);
        stiImp.AddStiTest(sti);

        if (AncTestedForSyphilis.isEmpty()) {
            //// Adding General sti patient treament details to sti_treatment table
            StiTreatableImpl stitreamentIpm = new StiTreatableImpl();
            StiTreament stitreatement = new StiTreament();
            stitreatement.setStiNumber(stiNo);
            stitreatement.setTreatmentdate(dtsti);
            stitreatement.setDose(dose);
            stitreatement.setTypeofsti(infection);
            stitreatement.setComment(treatment);
            stitreatement.setDuration(duration);
            stitreamentIpm.AddStiTreament(stitreatement);
        } else {
            //// Adding General sti patient treament details to sti_treatment table
            StiTreatableImpl ancstitreamentIpm = new StiTreatableImpl();
            StiTreament ancstitreatement = new StiTreament();
            ancstitreatement.setStiNumber(stiNo);
            ancstitreatement.setTreatmentdate(dtsti);
            ancstitreatement.setDose(ancdose);
            ancstitreatement.setTypeofsti(infection);
            ancstitreatement.setComment(treatment);
            ancstitreatement.setDuration(ancduration);
            ancstitreamentIpm.AddStiTreament(ancstitreatement);
        }
        CompletedStiClientAll cptsticlient = new CompletedStiClientAll(stiNo) {
        };
        //also add patient

        p.setStiId(stiNo);
        cptsticlient.setP(p);
        CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
        //edit patient table and update the htsId number
        circumImpl.editSTI(p);

        session.setAttribute("cptsticlient", cptsticlient);
       // session.setAttribute("MotherOPDNumber", MotherOPDNumber);

        //MotherOPDNumber  
        if (AncBookingTime.equals("first anc booking") || AncBookingTime.equals("third trimester") || AncSyphilisTestResults.equals("neg")) {
            response.sendRedirect("AllSTIClients");
        } else if (AncSyphilisTreated.equals("No") && AncSyphilisTestResults.equals("pos")) {
            response.sendRedirect("STIcSExposedInfant");
        } else if (AncSyphilisTreated.isEmpty() && AncSyphilisTestResults.isEmpty()) {
            response.sendRedirect("AllSTIClients");
        } else if (!AncSyphilisTreated.isEmpty() || AncSyphilisTreated != " " && !AncSyphilisTestResults.isEmpty() || AncSyphilisTestResults != " ") {
            //else  if (!AncSyphilisTreated.isEmpty() && !AncSyphilisTestResults.isEmpty()) {
            long probablecase;
            probablecase = (dateOfDelivery.getTime() - ancdatesyphillistestesduringpregnancy.getTime()) / 86400000;
            if (probablecase <= 30) {
                if (AncSyphilisTreated.equals("Yes") && AncSyphilisTestResults.equals("pos")) {
                    response.sendRedirect("STIcSExposedInfant");
                }
            } else if (probablecase > 30) {
                if (AncSyphilisTreated.equals("Yes") && AncSyphilisTestResults.equals("pos")) {
                    response.sendRedirect("AllSTIClients");
                }
            }

        } else if (DeliveryOutcome.equals("still birth")) {
            response.sendRedirect("STIcSExposedInfant");
        } else {
            response.sendRedirect("AllSTIClients");
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
