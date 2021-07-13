package com.art.controllers;

import com.vmmc.entities.Tblsetupartinitiationcategory;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Laboratory;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Setupstaff;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.TblappointmentsId;
import com.vmmc.entities.Tblmedication;
import com.vmmc.entities.TblmedicationId;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblproblems;
import com.vmmc.entities.TblproblemsId;
import com.vmmc.entities.Tblreferralsto;
import com.vmmc.entities.TblreferralstoId;
import com.vmmc.entities.Tblsetupadverseeventsstatus;
import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import com.vmmc.entities.Tblsetuparvreasoncodes;
import com.vmmc.entities.Tblsetuparvstatuscodes;
import com.vmmc.entities.Tblsetupcervicalcancertreatment;
import com.vmmc.entities.Tblsetupcryptococcalinvestigation;
import com.vmmc.entities.Tblsetupcryptococcalscreening;
import com.vmmc.entities.Tblsetupcryptococcaltreatment;
import com.vmmc.entities.Tblsetupdispensers;
import com.vmmc.entities.Tblsetupfamilyplanning;
import com.vmmc.entities.Tblsetupfunctionalstatus;
import com.vmmc.entities.Tblsetupiptreasoncodes;
import com.vmmc.entities.Tblsetupiptstatus;
import com.vmmc.entities.Tblsetuppregnancystatus;
import com.vmmc.entities.Tblsetupproblems;
import com.vmmc.entities.Tblsetupreferralsto;
import com.vmmc.entities.Tblsetupstaff;
import com.vmmc.entities.Tblsetupstatus;
import com.vmmc.entities.Tblsetuptbinvestigation;
import com.vmmc.entities.Tblsetuptbinvestigationresults;
import com.vmmc.entities.Tblsetuptbstatus;
import com.vmmc.entities.Tblsetuptpteligibility;
import com.vmmc.entities.Tblsetuptpttype;
import com.vmmc.entities.Tblsetupvisitstatus;
import com.vmmc.entities.Tblsetupvisittypes;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.TblstatusId;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.TblvisitsId;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.LaboratoryData;
import com.vmmc.services.OIArtAppointmentsImpl;
import com.vmmc.services.OIArtFollowUpStatusImpl;
import com.vmmc.services.OIArtMedicationImpl;
import com.vmmc.services.OIArtProblemableImpl;
import com.vmmc.services.OIArtReferredToImpl;
import com.vmmc.services.OIArtTestsImpl;
import com.vmmc.services.OIArtVisitableImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.print.attribute.standard.MediaSize.Other;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author leon-mbano
 */
@WebServlet(name = "OIARTVisitServ", urlPatterns = {"/OIARTVisitServ"})
public class OIARTVisitServ extends HttpServlet {

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
        Facilities config = facility.getFacilityName(province, district, facili);
        request.setAttribute("facilityName", config.getFacilityName());

        String[] temp = request.getQueryString().split("&");
        String oinumber = temp[0];
        String opdNum = temp[1];
        // CompletedARTClientAll cptdArtClient = new CompletedARTClientAll(oinumber);
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();

        //PatientModel pm = new PatientModel();
        Patient patient = pat.getOIArtPatient(oinumber);
        // cptdArtClient.setP(patient);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        request.setAttribute("patient", patient);

        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);

        List<Tblsetupvisittypes> visittypeslist = setup.getOIVisittypes();
        request.setAttribute("visittypes", visittypeslist);

        List<Tblsetupartinitiationcategory> artcategories = setup.getArtCategoryTypes();
        request.setAttribute("artcategories", artcategories);

        List<Tblsetupvisittypes> clinicalvisittypeslist = setup.getOICinicalVisittypes();
        request.setAttribute("clinicalvisittypeslist", clinicalvisittypeslist);

        List<Tblsetupvisittypes> refillvisittypeslist = setup.getOIRefillVisittypes();
        request.setAttribute("refillvisittypeslist", refillvisittypeslist);

        List<Tblsetuppregnancystatus> pregnancystatuslist = setup.getOIPregnancyStatus();
        request.setAttribute("pregnancystatus", pregnancystatuslist);

        List<Tblsetupfunctionalstatus> functionalstatuslist = setup.getOIFunctionalStatus();
        request.setAttribute("functionalstatus", functionalstatuslist);

        List<Tblsetupfamilyplanning> familyplanningstatuslist = setup.getOIFamilyPlanning();
        request.setAttribute("familyplanningstatus", familyplanningstatuslist);

        List<Tblsetuptbstatus> tbstatuslist = setup.getOITBScreening();
        request.setAttribute("tbstatus", tbstatuslist);

        List<Tblsetuptbinvestigationresults> tbinvestigationresultslist = setup.getOITBInvestigationResults();
        request.setAttribute("tbinvestigationresults", tbinvestigationresultslist);

        List<Tblsetuptbinvestigation> tbinvestigation = setup.getTbInvestigation();
        request.setAttribute("tbinvestigation", tbinvestigation);

        List<Tblsetupiptstatus> iptstatuslist = setup.getOIIPTStatus();
        request.setAttribute("iptstatus", iptstatuslist);

        List<Tblsetuptpteligibility> istpteligibility = setup.getTptEligibility();
        request.setAttribute("istpteligibility", istpteligibility);

        List<Tblsetupcryptococcaltreatment> cryptococcaltreatment = setup.getCryptococcalTreatment();
        request.setAttribute("cryptococcaltreatment", cryptococcaltreatment);

        List<Tblsetupcryptococcalinvestigation> cryptococcalinvestigation = setup.getCryptococcalInvestigation();
        request.setAttribute("cryptococcalinvestigation", cryptococcalinvestigation);

        List<Tblsetupcryptococcalscreening> cryptococcalscreening = setup.getCryptococcalScreening();
        request.setAttribute("cryptococcalscreening", cryptococcalscreening);

        List<Tblsetupcervicalcancertreatment> cervicalcancertreatment = setup.getCervicalCancerTreatment();
        request.setAttribute("cervicalcancertreatment", cervicalcancertreatment);

        List<Tblsetupproblems> problemslist = setup.getOIOpportunisticsInfect();
        request.setAttribute("opportunistic", problemslist);

        List<Tblsetuparvstatuscodes> arvstatuslist = setup.getOIARVStatus();
        request.setAttribute("arvstatus", arvstatuslist);

        List<Tblsetupadverseeventsstatus> adverseeventsstatuslist = setup.getOIAdverseEventsStatus();
        request.setAttribute("adverseeventsstatus", adverseeventsstatuslist);

        List<Tblsetupreferralsto> referredtolist = setup.getOIReferredTo();
        request.setAttribute("referredto", referredtolist);

        List<Tblsetuparvreasoncodes> arvreasoncodeslist = setup.getOIARVReason();
        request.setAttribute("arvreasoncodes", arvreasoncodeslist);

        List<Tblsetuparvreasoncodes> arvreasoncodeslist1 = setup.getOIARVReason1();
        request.setAttribute("arvreasoncodes1", arvreasoncodeslist1);

        List<Tblsetuparvreasoncodes> arvreasoncodeslist2 = setup.getOIARVReason2();
        request.setAttribute("arvreasoncodes2", arvreasoncodeslist2);

        List<Tblsetuparvreasoncodes> arvreasoncodeslist4 = setup.getOIARVReason4();
        request.setAttribute("arvreasoncodes4", arvreasoncodeslist4);
        List<Tblsetuparvfixeddosecombinations> arvfixeddosecombinationslist = setup.getOIARVRegimenCombinations();
        request.setAttribute("arvregimens", arvfixeddosecombinationslist);

        List<Tblsetupvisitstatus> visitstatuslist = setup.getOIVisitStatus();
        request.setAttribute("visitstatus", visitstatuslist);

        List<Setupstaff> staffpersonel = setup.getAllStaff();
        request.setAttribute("staffpersonel", staffpersonel);

        List<Tblsetupstatus> statuslist = setup.getOIFollowupStatus();
        request.setAttribute("followupstatus", statuslist);

        List<Tblsetupstaff> stafflist = setup.getOIClinicians();
        request.setAttribute("clinicians", stafflist);

        List<Tblsetupdispensers> dispenserslist = setup.getOIDispensers();
        request.setAttribute("dispensers", dispenserslist);

        List<Facilities> failitylist = setup.getFacilityTypes();
        request.setAttribute("failitylist", failitylist);

        OIArtVisitableImpl visimp = new OIArtVisitableImpl();

        List<Tblvisits> vislist = visimp.getPatientAllVisit(oinumber);
        if (!vislist.isEmpty()) {
            Tblvisits prevvis = vislist.get(0);
            request.setAttribute("prevvis", prevvis);
        }
        LaboratoryData lab = new LaboratoryData();

        List<Laboratory> vrl = lab.getLabVrl(oinumber);
        request.setAttribute("viralload", vrl);

        List<Laboratory> cdcount = lab.getLabCd4(oinumber);
        request.setAttribute("cdcount", cdcount);

        List<Laboratory> cdpercent = lab.getLabCd4P(oinumber);
        request.setAttribute("cdpercent", cdpercent);
        // request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("art/newOIARTVisit.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        Patient p = (Patient) session.getAttribute("patient"); // patient get from patient registration
        String patientId = p.getPatientId();
        Date regdate = p.getRegistrationDate();
        Date dobdate = p.getDob();
        String sex = p.getSex();
//String patientId = "07-06-05-2017-A-20702";
        /// Binding newOIARTVisit.jsp data values to variables
        //Step 1
        String DateOfReview = request.getParameter("txtOIDateOfReview");
        String VisitType = request.getParameter("slcOIVisitType");
        String clinicalVisitsModel = request.getParameter("slcOIClinicalVisitType");
        String refillVisitsModel = request.getParameter("slcOIRefillVisitType");
        String Weight1 = request.getParameter("txtOIWeight");
        float Weight = 0;
        if (Weight1 != null) {
            if (!Weight1.isEmpty()) {
                Weight = Weight1.length() == 0 ? 0 : Float.parseFloat(Weight1);
            }
        }

        String Height1 = request.getParameter("txtOIHeight");
        float Height = 0;
        if (Height1 != null) {
            if (!Height1.isEmpty()) {
                Height = Height1.length() == 0 ? 0 : Float.parseFloat(Height1);
            }
        }
        String PregnantStatus = request.getParameter("slcOIPregnantStatus");
        String LNMPDate = request.getParameter("txtOILNMPDate");
        String FirstANCDate = request.getParameter("txtOIFirstANCDate");
        String FunctionalStatus = request.getParameter("slcOIFunctionalStatus");
        String FamilyPlanningnStatus = request.getParameter("slcOIFamilyPlanningnStatus");
        String prevWHo = request.getParameter("txtPrevWHOStage");
        int prevWhoClinicalStage = 0;
        if (prevWHo != null || prevWHo != "") {
            if (!prevWHo.isEmpty()) {
                prevWhoClinicalStage = prevWHo.length() == 0 ? 0 : Integer.parseInt(prevWHo);
            }
        }

        // String oppotunisticInfection = request.getParameter("");
        String WhoClinicalStage1 = request.getParameter("slcOIWhoClinicalStage");
        int WhoClinicalStage = 0;
        if (WhoClinicalStage1 != null || WhoClinicalStage1 != "") {
            if (!WhoClinicalStage1.isEmpty()) {
                WhoClinicalStage = WhoClinicalStage1.length() == 0 ? 0 : Integer.parseInt(WhoClinicalStage1);
            }
        }

        if (WhoClinicalStage == 0) {
            WhoClinicalStage = prevWhoClinicalStage;
        }
        String TBScreening = request.getParameter("slcOITBScreening");
        String TBInvestigation = request.getParameter("slcOITBInvestigation");
        String TBInvestigationResult1 = request.getParameter("slcOITBInvestigationResult");
        int TBInvestigationResult = 0;
        if (TBInvestigationResult1 != null || TBInvestigationResult1 != "") {
            if (!TBInvestigationResult1.isEmpty()) {
                TBInvestigationResult = TBInvestigationResult1.length() == 0 ? 0 : Integer.parseInt(TBInvestigationResult1);
            }
        }
//String OIInfections = request.getParameter("slcOIOIInfections");
//step 2
        String CotriQuantiyDispensed1 = request.getParameter("txtOICotriQuantiyDispensed");
        int CotriQuantiyDispensed = 0;
        if (CotriQuantiyDispensed1 != null || CotriQuantiyDispensed1 != "") {
            if (!CotriQuantiyDispensed1.isEmpty()) {

                CotriQuantiyDispensed = Integer.parseInt(CotriQuantiyDispensed1);
            }
        }
        String CotriAdherence1 = request.getParameter("txtOICotriAdherence");
        int CotriAdherence = 0;
        if (CotriAdherence1 != null || CotriAdherence1 != "") {
            if (!CotriAdherence1.isEmpty()) {
                CotriAdherence = CotriAdherence1.length() == 0 ? 0 : Integer.parseInt(CotriAdherence1);
            }
        }

        String TPTEligibility = request.getParameter("slcOIIPTEligibility");
        String TPTStatus = request.getParameter("slcOIIPTStatus");

        String TPTQuantiyDispensed1 = request.getParameter("txtOIIPTQuantiyDispensed");
        int TPTQuantiyDispensed = 0;
        if (TPTQuantiyDispensed1 != null || !"".equals(TPTQuantiyDispensed1)) {
            if (!TPTQuantiyDispensed1.isEmpty()) {
                TPTQuantiyDispensed = TPTQuantiyDispensed1.length() == 0 ? 0 : Integer.parseInt(TPTQuantiyDispensed1);
            }
        }

        String IPTAdherence1 = request.getParameter("txtOIIPTAdherence");
        int IPTAdherence = 0;
        if (IPTAdherence1 != null || !"".equals(IPTAdherence1)) {
            if (!IPTAdherence1.isEmpty()) {
                IPTAdherence = IPTAdherence1.length() == 0 ? 0 : Integer.parseInt(IPTAdherence1);
            }
        }

        String cryptococcalscreening = request.getParameter("cryptococcalscreening");
        String cryptococcalinvestigation = request.getParameter("cryptococcalinvestigation");
        String cryptococcalinvestigationresult = request.getParameter("cryptococcalinvestigationresult");
        String cryptococcaltreatment = request.getParameter("cryptococcaltreatment");

        String ARVInitiationCategory = request.getParameter("artinitiationcategory");
        String ARVStatus1 = request.getParameter("slcOIARVStatus");

        int ARVStatus = 0;
        if (ARVStatus1 != null || ARVStatus1 != "") {
            if (!ARVStatus1.isEmpty()) {
                ARVStatus = ARVStatus1.length() == 0 ? 0 : Integer.parseInt(ARVStatus1);
            }
        }
        String AdverseEventStatus = request.getParameter("slcOIAdverseEventStatus");
        String ARVReason1 = request.getParameter("slcOIARVReason1");

        int ARVReason = 0;
        if (ARVReason1 != null || ARVReason1 != "") {
            if (!ARVReason1.isEmpty()) {
                ARVReason = ARVReason1.length() == 0 ? 0 : Integer.parseInt(ARVReason1);
            }
        }
        String ARVRegmenCombination1 = request.getParameter("slcOIARVRegmenCombination");
        int ARVRegmenCombination = 0;
        if (ARVRegmenCombination1 != null || ARVRegmenCombination1 != "") {
            if (!ARVRegmenCombination1.isEmpty()) {

                ARVRegmenCombination = ARVRegmenCombination1.length() == 0 ? 0 : Integer.parseInt(ARVRegmenCombination1);
            }
        }

        String ARVQuantityPrescribed1 = request.getParameter("txtOIARVQuantityPrescribed");
        int ARVQuantityPrescribed = 0;
        if (ARVQuantityPrescribed1 != null || ARVQuantityPrescribed1 != "") {
            if (!ARVQuantityPrescribed1.isEmpty()) {
                ARVQuantityPrescribed = ARVQuantityPrescribed1.length() == 0 ? 0 : Integer.parseInt(ARVQuantityPrescribed1);
            }
        }
        String ARVQuantityDispensed1 = request.getParameter("txtOIARVQuantityDispensed");
        int ARVQuantityDispensed = 0;
        if (ARVQuantityDispensed1 != null || ARVQuantityDispensed1 != "") {
            if (!ARVQuantityDispensed1.isEmpty()) {

                ARVQuantityDispensed = ARVQuantityDispensed1.length() == 0 ? 0 : Integer.parseInt(ARVQuantityDispensed1);

            }
        }

        String ARVAdherence1 = request.getParameter("txtOIARVAdherence");

        int ARVAdherence = 0;
        if (ARVAdherence1 != null || ARVAdherence1 != "") {
            if (!ARVAdherence1.isEmpty()) {
                ARVAdherence = ARVAdherence1.length() == 0 ? 0 : Integer.parseInt(ARVAdherence1);
            }
        }
        //step 3
        String CD4Count1 = request.getParameter("txtOICD4Count");
        String cdLaboratory = request.getParameter("labcdcount");
        String cdpLaboratory = request.getParameter("labcdpercent");

        float CD4Count = 0;
        if (CD4Count1 != null || CD4Count1 != "") {
            if (!CD4Count1.isEmpty()) {
                CD4Count = CD4Count1.length() == 0 ? 0 : Float.parseFloat(CD4Count1);
            }
        }
        String CD4TestDate = request.getParameter("txtOICD4TestDate");
        String cd4CollectDate = request.getParameter("txtOICD4DateRecievedByClient");
        String cd4FReceiveDate = request.getParameter("txtOICD4ReceivedAtFacility");

        String CDPercResult1 = request.getParameter("txtOICDPercResult");

        float CDPercResult = 0;
        if (CDPercResult1 != null || CDPercResult1 != "") {
            if (!CDPercResult1.isEmpty()) {
                CDPercResult = CD4Count1.length() == 0 ? 0 : Float.parseFloat(CDPercResult1);
            }
        }
        String CDPercResultTestDate = request.getParameter("txtOICDPercDate");

        String ViralLoad1 = request.getParameter("txtOIViralLoad");
        float ViralLoad = 0;
        if (ViralLoad1 != null || ViralLoad1 != "") {
            if (!ViralLoad1.isEmpty()) {
                ViralLoad = ViralLoad1.length() == 0 ? 0 : Float.parseFloat(ViralLoad1);
            }
        }

        String VLCollectionDate = request.getParameter("txtOIViralLoadTestDate");
        String VLDateReceivedFacility = request.getParameter("txtOIVLReceivedAtFacility");
        String VLDateClientReceivedResult = request.getParameter("txtOIVLDateRecievedByClient");
        String VlNotes = request.getParameter("txtOIVLNotes");
        String VLOption = request.getParameter("rdcaptureVLlab");
        String VLid = request.getParameter("labviralload");
        String VlTest = request.getParameter("chkvl");
        String CDCountTest = request.getParameter("chkcd4");
        String CDCountOption = request.getParameter("rdcaptureCDlab");
        String CDPTest = request.getParameter("chkcd4p");
        String CDPOption = request.getParameter("rdcaptureCDPlab");
        String CDPDateReceived = request.getParameter("txtOICDPercReceivedAtFacility");
        String CDPDateCollected = request.getParameter("txtOICDPercDateRecievedByClient");

        String ATL1 = request.getParameter("txtOIATL");

        float ATL = 0;
        if (ATL1 != null || ATL1 != "") {
            if (!ATL1.isEmpty()) {
                ATL = ATL1.length() == 0 ? 0 : Float.parseFloat(ATL1);
            }
        }
        String creatineDate = request.getParameter("txtOICreatinineDate");
        String Creatinine1 = request.getParameter("txtOICreatinine");
        float Creatinine = 0;
        if (Creatinine1 != null || Creatinine1 != "") {
            if (!Creatinine1.isEmpty()) {
                Creatinine = Creatinine1.length() == 0 ? 0 : Float.parseFloat(Creatinine1);
            }
        }

        String OtherDiagnosis1 = request.getParameter("txtOIOtherDiagnosis");
        float OtherDiagnosis = 0;
        if (OtherDiagnosis1 != null || OtherDiagnosis1 != "") {
            if (!OtherDiagnosis1.isEmpty()) {
                OtherDiagnosis = OtherDiagnosis1.length() == 0 ? 0 : Float.parseFloat(OtherDiagnosis1);
            }
        }
        
        //Step 4
        String txthpvresult = request.getParameter("txthpvresult");
        String txtviacresult = request.getParameter("txtviacresult");
        String txttreatment = request.getParameter("txttreatment");

        //step 5
        String TranferredTo = request.getParameter("slcOITransferredTo");
        String ReferredTo = request.getParameter("slcOIReferredTo");
        String NextReviwDate = request.getParameter("txtOINextReviwDate");
        String VisitStatus = request.getParameter("txtVisitStatus");

        String FollowUpStatus = request.getParameter("slcOIFollowUpStatus");
        String sClinician = request.getParameter("slcClinician");
        int Clinician = 0;
        if (!sClinician.isEmpty()) {
            Clinician = Integer.parseInt(sClinician);
        } else {
            Clinician = -1;
        }
        String sPharmacyDispenser = request.getParameter("slcPharmacyDispenser");
        int PharmacyDispenser = 0;
        if (!sPharmacyDispenser.isEmpty()) {
            PharmacyDispenser = Integer.parseInt(sPharmacyDispenser);
        } else {
            PharmacyDispenser = -1;
        }
        String notes = request.getParameter("txtOINotes");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        /// Appointments 
        Timestamp reviewDate = null;//DateOfReview

        Timestamp cd4percdate = null;

        try {
            Date parsedDate = formatter.parse(DateOfReview + " 00:00:00");
            reviewDate = new java.sql.Timestamp(parsedDate.getTime());
            if (!CDPercResultTestDate.isEmpty()) {
                Date cd4parsedDate = formatter.parse(CDPercResultTestDate + " 00:00:00");
                cd4percdate = new java.sql.Timestamp(cd4parsedDate.getTime());
            } else {
                cd4percdate = null;
            }

        } catch (Exception pe) {
            pe.printStackTrace();
        }

        //moulding data
        Tblvisits visit = new Tblvisits();
        //// visit table 

        Timestamp ANCFirstDate = null;//FirstANCDate
        Timestamp FLNMPDate = null;//LNMPDate

        try {
            if (FirstANCDate != "" || FirstANCDate != null) {
                if (!FirstANCDate.isEmpty()) {
                    Date parsedPTDate = formatter.parse(FirstANCDate + " 00:00:00");
                    ANCFirstDate = new java.sql.Timestamp(parsedPTDate.getTime());

                } else {
                    ANCFirstDate = null;
                }
            }
            if (LNMPDate != "" || LNMPDate != null) {
                if (!LNMPDate.isEmpty()) {
                    Date parsedITDate = formatter.parse(LNMPDate + " 00:00:00");
                    FLNMPDate = new java.sql.Timestamp(parsedITDate.getTime());
                } else {
                    LNMPDate = null;
                }
            }
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        String visitTypeCode = null;
        String funcstat = null;
        if (VisitType != null || VisitType != "") {
            if (VisitType.equalsIgnoreCase("CL")) {
                visitTypeCode = clinicalVisitsModel;
                funcstat = FunctionalStatus;
            } else if (VisitType.equalsIgnoreCase("RF")) {
                visitTypeCode = refillVisitsModel;
                funcstat = "N";
            } else {
                visitTypeCode = null;
            }
        }
        OIArtVisitableImpl vstDB = new OIArtVisitableImpl();
        TblvisitsId visitid = new TblvisitsId();

        visitid.setPatientId(patientId);

        visitid.setVisitDate(reviewDate);

        visit.setId(visitid);

        visit.setVisitType(VisitType);

        visit.setVisitTypeCode(visitTypeCode);

        visit.setNowPregnant(PregnantStatus);

        visit.setDateOfFirstAnc(ANCFirstDate); //ANCFirstDate

        visit.setLnmpdate(FLNMPDate);

        visit.setFamilyPlanningId(FamilyPlanningnStatus);

        visit.setFunctionalStatusCode(funcstat);

        visit.setWhostage(WhoClinicalStage); //parse

        visit.setTbstatusCode(TBScreening);

        visit.setTbinvestigation(TBInvestigation);

        visit.setTbinvestigationResults(TBInvestigationResult);//parse

        visit.setCryptococcalInvestigation(cryptococcalinvestigation);

        visit.setCryptococcalInvestigationResults(cryptococcalinvestigationresult);

        visit.setCryptococcalScreening(cryptococcalscreening);

        visit.setCryptococcalTreatment(cryptococcaltreatment);

        visit.setIsIpteligibility(TPTEligibility);

        visit.setIptstatusCode(TPTStatus);

        visit.setVisitStatusCode(VisitStatus);

        visit.setArvinitiationCategory(ARVInitiationCategory);

        visit.setArvstatusCode(ARVStatus);

        visit.setArvreasonCode(ARVReason);

        visit.setArvcode(ARVRegmenCombination);

        visit.setAdverseEventsStatusCode(AdverseEventStatus);
        
        visit.setCervicalCancerTreatment(txttreatment);
        
        visit.setHpvTestResult(txthpvresult);
        
        visit.setViacTestResult(txtviacresult);

        visit.setUserNumber(Clinician);

        visit.setDispenserId(PharmacyDispenser);
        visit.setNotes(notes);

        if (vstDB.AddArtVisit(visit) == 1) {
            OIArtReferredToImpl referalDB = new OIArtReferredToImpl();
            Tblreferralsto referal = new Tblreferralsto();
            TblreferralstoId referalid = new TblreferralstoId();
            // referals to 
            if (ReferredTo != null) {
                referalid.setPatientId(patientId);
                referalid.setReferralToCode(ReferredTo);
                referalid.setVisitDate(reviewDate);
                referal.setId(referalid);
                referalDB.addReferredTo(referal);
            } else {
                referalDB.addReferredTo(referal);
            }

            /// Appointments 
            Timestamp nextReviewDate = null;//NextReviwDate

            try {
                if (NextReviwDate != null) {

                    if (NextReviwDate != "") {
                        Date parsedHRTDate = formatter.parse(NextReviwDate + " 00:00:00");
                        nextReviewDate = new java.sql.Timestamp(parsedHRTDate.getTime());
                    } else {
                        nextReviewDate = null;
                    }
                }
            } catch (Exception pe) {
                pe.printStackTrace();
            }
            OIArtAppointmentsImpl appDB = new OIArtAppointmentsImpl();
            Tblappointments appointment = new Tblappointments();
            TblappointmentsId appointmentid = new TblappointmentsId();

            appointmentid.setPatientId(patientId);

            appointmentid.setDateOfAppointment(nextReviewDate);

            appointment.setId(appointmentid);

            appointment.setDateAppointmentGiven(reviewDate);

            appDB.AddArtAppointment(appointment);

            ///follow up status
            if (FollowUpStatus != null) {
                if (!FollowUpStatus.isEmpty()) {

                    if (!FollowUpStatus.equalsIgnoreCase("TO")) {
                        OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                        Tblstatus followupstatus = new Tblstatus();
                        TblstatusId followupstatusid = new TblstatusId();
                        followupstatusid.setPatientId(patientId);
                        followupstatusid.setStatusDate(reviewDate);
                        followupstatus.setId(followupstatusid);
                        followupstatus.setStatus(FollowUpStatus);
                        followupstatus.setTransferOutToWhere(TranferredTo);
                        followupstatusDB.AddArtFollowupstatus(followupstatus);
                    } else {
                        OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                        Tblstatus followupstatus = new Tblstatus();
                        TblstatusId followupstatusid = new TblstatusId();
                        followupstatusid.setPatientId(patientId);
                        followupstatusid.setStatusDate(reviewDate);
                        followupstatus.setId(followupstatusid);
                        followupstatus.setStatus(FollowUpStatus);
                        followupstatus.setTransferOutToWhere(TranferredTo);
                        followupstatusDB.AddArtFollowupstatus(followupstatus);
                    }
                }
            } else {

                String attending = "Attending this clinic";

                OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                Tblstatus followupstatus = new Tblstatus();
                TblstatusId followupstatusid = new TblstatusId();
                followupstatusid.setPatientId(patientId);
                followupstatusid.setStatusDate(reviewDate);
                followupstatus.setId(followupstatusid);
                followupstatus.setStatus(attending);
                followupstatusDB.AddArtFollowupstatus(followupstatus);

            }

            // add OI in problems table
            String[] OIInfections = request.getParameterValues("slcOIOIInfections");
            if (OIInfections
                    != null) {
                for (String g : OIInfections) {
                    Tblproblems prob = new Tblproblems();
                    TblproblemsId probid = new TblproblemsId();
                    OIArtProblemableImpl probDB = new OIArtProblemableImpl();
                    probid.setPatientId(patientId);
                    probid.setVisitDate(reviewDate);
                    probid.setProblemAcronym(g);
                    prob.setId(probid);
                    //  prob.setId(reviewDate);
                    probDB.addProblems(prob);

                }
            }

            ///Tests 
            Timestamp cretinedate = null; /// creatineDate
            Timestamp cdPCollectionDate = null;
            Timestamp cdPFReceivedDate = null;
            Timestamp FCD4TestDate = null;//CD4TestDate
            Timestamp cd4CollectionDate = null;
            Timestamp cd4FReceivedDate = null;
            Timestamp fVLColletionDate = null;//ViralLoadTestDate
            Timestamp fVLReceivedDate = null;
            Timestamp fVLGivenToClientDate = null;
            try {
                if (CDPDateReceived != null) {
                    if (CDPDateReceived != "") {
                        Date parsedCDPDateReceived = formatter.parse(CDPDateReceived + "00:00:00");
                        cdPFReceivedDate = new java.sql.Timestamp(parsedCDPDateReceived.getTime());
                    } else {
                        cdPFReceivedDate = null;
                    }
                }
                if (CDPDateCollected != null) {
                    if (CDPDateCollected != "") {
                        Date parsedCDPDateCollected = formatter.parse(CDPDateCollected + "00:00:00");
                        cdPCollectionDate = new java.sql.Timestamp(parsedCDPDateCollected.getTime());
                    } else {
                        cdPCollectionDate = null;
                    }
                }
                if (cd4FReceiveDate != null) {
                    if (cd4FReceiveDate != "") {
                        Date parsedcdcd4FReceiveDate = formatter.parse(cd4FReceiveDate + "00:00:00");
                        cd4FReceivedDate = new java.sql.Timestamp(parsedcdcd4FReceiveDate.getTime());
                    } else {
                        cd4FReceivedDate = null;
                    }
                }
                if (cd4CollectDate != null) {
                    if (cd4CollectDate != "") {
                        Date parsedcd4CollectDate = formatter.parse(cd4CollectDate + "00:00:00");
                        cd4CollectionDate = new java.sql.Timestamp(parsedcd4CollectDate.getTime());
                    } else {
                        cd4CollectionDate = null;
                    }
                }
                if (CD4TestDate != null) {
                    if (CD4TestDate != "") {
                        Date parsedDWDate = formatter.parse(CD4TestDate + "00:00:00");
                        FCD4TestDate = new java.sql.Timestamp(parsedDWDate.getTime());
                    } else {
                        FCD4TestDate = null;
                    }
                }
                if (VLCollectionDate != null) {
                    if (VLCollectionDate != "") {
                        Date parsedFCDate = formatter.parse(VLCollectionDate + "00:00:00");
                        fVLColletionDate = new java.sql.Timestamp(parsedFCDate.getTime());
                    } else {
                        fVLColletionDate = null;
                    }
                }
                if (VLDateReceivedFacility != null) {
                    if (VLDateReceivedFacility != "") {
                        Date parsedVlRececivedDate = formatter.parse(VLDateReceivedFacility + "00:00:00");
                        fVLReceivedDate = new java.sql.Timestamp(parsedVlRececivedDate.getTime());
                    } else {
                        fVLReceivedDate = null;
                    }
                }
                if (VLDateClientReceivedResult != null) {
                    if (VLDateClientReceivedResult != "") {
                        Date parsedVlgivenDate = formatter.parse(VLDateClientReceivedResult + "00:00:00");
                        fVLGivenToClientDate = new java.sql.Timestamp(parsedVlgivenDate.getTime());
                    } else {
                        fVLGivenToClientDate = null;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            //cd4 count 
            if (CDCountTest != null && CDCountTest.equalsIgnoreCase("Yes")) {
                Tblpatients artp = new Tblpatients();
                artp.setPatientId(patientId);
                Tbltests cd4test = new Tbltests();
                OIArtTestsImpl testDB = new OIArtTestsImpl();

                cd4test.setTblpatients(artp);
                if (CDCountOption.equalsIgnoreCase("CA")) {
                    if (CD4Count != 0) {
                        String cd4 = "CD4";

                        cd4test.setTestTypeId(cd4);
                        cd4test.setResultNumeric(CD4Count);
                        cd4test.setTestDate(FCD4TestDate);
                        cd4test.setRecievedDate(cd4CollectionDate);
                        cd4test.setResultDate(cd4FReceivedDate);

                        testDB.AddArtTest(cd4test);
                    }

                } else if (CDCountOption.equalsIgnoreCase("AU")) {
                    if (!cdLaboratory.isEmpty()) {
                        int cd4ID = Integer.valueOf(cdLaboratory);

                        LaboratoryData data = new LaboratoryData();
                        Laboratory lab = data.getDataTest(cd4ID);

                        artp.setPatientId(lab.getPatientId());

                        cd4test.setTblpatients(artp);
                        cd4test.setTestTypeId(lab.getTestType());
                        float vlres = lab.getResult();
                        cd4test.setResultNumeric(vlres);
                        cd4test.setTestTypeId(lab.getTestType());
                        cd4test.setResultDate(lab.getReceivedDate());
                        cd4test.setTestDate(lab.getTestDate());
                        cd4test.setRecievedDate(lab.getPatientReceivedDate());

                        testDB.AddArtTest(cd4test);
                    }

                }

            } //cd4 percentage 
            else if (CDPTest != null && CDPTest.equalsIgnoreCase("Yes")) {
                OIArtTestsImpl testDB = new OIArtTestsImpl();
                Tblpatients artp = new Tblpatients();
                artp.setPatientId(patientId);
                Tbltests cd4perc = new Tbltests();

                cd4perc.setTblpatients(artp);

                if (CDPOption.equalsIgnoreCase("CA")) {
                    if (CDPercResult != 0) {
                        cd4perc.setRecievedDate(cdPFReceivedDate);
                        String cdperc = "CD%";
                        cd4perc.setTestDate(cd4percdate);
                        cd4perc.setTestTypeId(cdperc);
                        cd4perc.setResultNumeric(CDPercResult);//parse
                        cd4perc.setResultDate(cdPCollectionDate);

                        testDB.AddArtTest(cd4perc);
                    }
                } else if (CDPOption.equalsIgnoreCase("AU")) {
                    if (!cdpLaboratory.isEmpty()) {
                        int cdpID = Integer.valueOf(cdpLaboratory);

                        LaboratoryData data = new LaboratoryData();
                        Laboratory lab = data.getDataTest(cdpID);

                        artp.setPatientId(lab.getPatientId());

                        cd4perc.setTblpatients(artp);
                        cd4perc.setTestTypeId(lab.getTestType());
                        float vlres = lab.getResult();
                        cd4perc.setResultNumeric(vlres);
                        cd4perc.setTestTypeId(lab.getTestType());
                        cd4perc.setResultDate(lab.getReceivedDate());
                        cd4perc.setTestDate(lab.getTestDate());
                        cd4perc.setRecievedDate(lab.getPatientReceivedDate());

                        testDB.AddArtTest(cd4perc);
                    }
                }
            } //Viral Load
            else if (VlTest != null && VlTest.equalsIgnoreCase("Yes")) {
                OIArtTestsImpl testDB = new OIArtTestsImpl();
                Tbltests vl = new Tbltests();
                Tblpatients artp = new Tblpatients();
                artp.setPatientId(patientId);
                if (VLOption.equalsIgnoreCase("CA")) {
                    if (ViralLoad != 0) {
                        vl.setTblpatients(artp);//session

                        String vlresult = "VRL";

                        vl.setTestTypeId(vlresult);
                        vl.setResultNumeric(ViralLoad);//parse
                        vl.setResultDate(fVLGivenToClientDate);
                        vl.setTestDate(fVLColletionDate); ///VLReceivedDate
                        vl.setRecievedDate(fVLReceivedDate);
                        vl.setResultNotes(VlNotes);

                        testDB.AddArtTest(vl);
                    }
                } else if (VLOption.equalsIgnoreCase("AU")) {
                    if (!VLid.isEmpty()) {
                        int vlID = Integer.valueOf(VLid);

                        LaboratoryData data = new LaboratoryData();
                        Laboratory lab = data.getDataTest(vlID);

                        artp.setPatientId(lab.getPatientId());

                        vl.setTblpatients(artp);
                        vl.setTestTypeId(lab.getTestType());
                        float vlres = lab.getResult();
                        vl.setResultNumeric(vlres);
                        vl.setTestTypeId(lab.getTestType());
                        vl.setResultDate(lab.getReceivedDate());
                        vl.setTestDate(lab.getTestDate());
                        vl.setRecievedDate(lab.getPatientReceivedDate());
                        vl.setResultNotes(VlNotes);

                        testDB.AddArtTest(vl);
                    }

                }

            } else if (Height != 0 || Weight != 0 || ATL != 0 || Creatinine != 0 || OtherDiagnosis != 0) {
                try {
                    if (creatineDate != null) {
                        if (creatineDate != "") {
                            Date parsedCretineDate = formatter.parse(creatineDate + "00:00:00");
                            cretinedate = new java.sql.Timestamp(parsedCretineDate.getTime());
                        } else {
                            cretinedate = null;
                        }
                    }

                } catch (Exception pe) {
                    pe.printStackTrace();
                }
                //height
                if (Height != 0) {
                    OIArtTestsImpl testDB = new OIArtTestsImpl();
                    Tblpatients artp = new Tblpatients();
                    artp.setPatientId(patientId);
                    Tbltests height = new Tbltests();

                    height.setTblpatients(artp);

                    String heightresult = "HGC";
                    height.setTestDate(reviewDate);
                    height.setRecievedDate(reviewDate);
                    height.setTestTypeId(heightresult);

                    height.setResultNumeric(Height); //parse

                    testDB.AddArtTest(height);
                }
                //weight 
                if (Weight != 0) {

                    OIArtTestsImpl testDB = new OIArtTestsImpl();
                    Tbltests weight = new Tbltests();

                    Tblpatients artp = new Tblpatients();
                    artp.setPatientId(patientId);
                    weight.setTblpatients(artp);

                    String weightresult = "WGT";

                    weight.setTestTypeId(weightresult);
                    weight.setTestDate(reviewDate);
                    weight.setRecievedDate(reviewDate);
                    weight.setResultNumeric(Weight);

                    testDB.AddArtTest(weight);
                }

                //ALT
                if (ATL != 0) {
                    OIArtTestsImpl testDB = new OIArtTestsImpl();
                    Tbltests alt = new Tbltests();
                    Tblpatients artp = new Tblpatients();
                    artp.setPatientId(patientId);
                    alt.setTblpatients(artp); //session

                    String altresult = "ALT";
                    alt.setTestDate(reviewDate);
                    alt.setRecievedDate(reviewDate);
                    alt.setTestTypeId(altresult);
                    alt.setResultNumeric(ATL); //parse

                    testDB.AddArtTest(alt);
                }
                //Creatinine 

                if (Creatinine != 0) {
                    OIArtTestsImpl testDB = new OIArtTestsImpl();
                    Tblpatients artp = new Tblpatients();
                    artp.setPatientId(patientId);
                    Tbltests creatinine = new Tbltests();

                    creatinine.setTblpatients(artp);

                    String creatinineresult = "CRT";

                    creatinine.setTestTypeId(creatinineresult);
                    creatinine.setTestDate(reviewDate);
                    creatinine.setRecievedDate(reviewDate);
                    creatinine.setResultNumeric(Creatinine);//parse
                    creatinine.setTestDate(cretinedate);

                    testDB.AddArtTest(creatinine);

                }

                //other     
                if (OtherDiagnosis != 0) {
                    OIArtTestsImpl testDB = new OIArtTestsImpl();
                    Tbltests other = new Tbltests();
                    Tblpatients artp = new Tblpatients();
                    artp.setPatientId(patientId);
                    other.setTblpatients(artp);

                    String otherresult = "OTH";
                    other.setTestDate(reviewDate);
                    other.setRecievedDate(reviewDate);
                    other.setTestTypeId(otherresult);
                    other.setResultNumeric(OtherDiagnosis); //parse 
                    testDB.AddArtTest(other);
                }
            } else {
                OIArtTestsImpl testDB = new OIArtTestsImpl();
                Tbltests tests = new Tbltests();
                testDB.AddArtTest(tests);
            }

            if (CotriQuantiyDispensed != 0 || TPTQuantiyDispensed != 0 || !cryptococcaltreatment.isEmpty() || ARVQuantityDispensed != 0) {
                OIArtMedicationImpl medDB = new OIArtMedicationImpl();

                // for cotrimoxazole
                if (CotriQuantiyDispensed != 0) {
                    Tblmedication cotmed = new Tblmedication();
                    TblmedicationId cotmedid = new TblmedicationId();

                    cotmedid.setPatientId(patientId);

                    cotmedid.setVisitDate(reviewDate);
                    String cotri = "COT";

                    cotmedid.setDrugTypeId(cotri);

                    cotmed.setId(cotmedid);

                    cotmed.setQuantityDisp(CotriQuantiyDispensed);

                    cotmed.setPercentAdherence(CotriAdherence);

                    medDB.AddArtMedication(cotmed);

                } /// FOR IPT  
                else if (TPTEligibility != null && TPTEligibility.equalsIgnoreCase("Y")) {
                    
                    String tptstatus = "";
                    if(TPTStatus.equalsIgnoreCase("II") || TPTStatus.equalsIgnoreCase("CT") || TPTStatus.equalsIgnoreCase("RI") || TPTStatus.equalsIgnoreCase("PB")){
                        tptstatus = "TPT";
                    }
                    else if(TPTStatus.equalsIgnoreCase("3I") || TPTStatus.equalsIgnoreCase("R3")){
                        tptstatus = "3HP";
                    }
                    
                    Tblmedication iptmed = new Tblmedication();
                    TblmedicationId iptmedid = new TblmedicationId();

                    if (TPTQuantiyDispensed != 0) {
                        iptmedid.setPatientId(patientId);

                        iptmedid.setVisitDate(reviewDate);

                        iptmedid.setDrugTypeId(tptstatus);

                        iptmed.setId(iptmedid);

                        iptmed.setQuantityDisp(TPTQuantiyDispensed);

                        iptmed.setPercentAdherence(IPTAdherence);

                        medDB.AddArtMedication(iptmed);
                    } else {
                        medDB.AddArtMedication(iptmed);
                    }
                } /// FOR IPT  
                else if (TPTEligibility != null && !TPTEligibility.equalsIgnoreCase("Y")) {
                    Tblmedication iptmed = new Tblmedication();
                    medDB.AddArtMedication(iptmed);
                } /// FOR fluconazole
                else if (!cryptococcaltreatment.isEmpty()) {

                    String treatment = "";

                    if (cryptococcaltreatment.equalsIgnoreCase("a")) {
                        treatment = "AFZ";
                    } else if (cryptococcaltreatment.equalsIgnoreCase("b")) {
                        treatment = "AFY";
                    } else if (cryptococcaltreatment.equalsIgnoreCase("c")) {
                        treatment = "FLU";
                    } else {
                        treatment = "OTH";
                    }

                    Tblmedication flzmed = new Tblmedication();
                    TblmedicationId flzmedid = new TblmedicationId();

                    flzmedid.setPatientId(patientId);

                    flzmedid.setVisitDate(reviewDate);

                    flzmedid.setDrugTypeId(treatment);

                    flzmed.setId(flzmedid);

                    medDB.AddArtMedication(flzmed);
                } /// FOR ARVS
                else if (ARVQuantityDispensed != 0) {
                    Tblmedication arvmed = new Tblmedication();
                    TblmedicationId arvmedid = new TblmedicationId();

                    arvmedid.setPatientId(patientId);

                    arvmedid.setVisitDate(reviewDate);
                    String arv = "ARV";

                    arvmedid.setDrugTypeId(arv);

                    arvmed.setId(arvmedid);

                    arvmed.setQuantityDisp(ARVQuantityDispensed);

                    arvmed.setQuantityPrescribed(ARVQuantityPrescribed);

                    arvmed.setPercentAdherence(ARVAdherence);

                    medDB.AddArtMedication(arvmed);
                } else {
                    Tblmedication med = new Tblmedication();
                    medDB.AddArtMedication(med);
                }
            } else {
                OIArtMedicationImpl medDB = new OIArtMedicationImpl();
                Tblmedication med = new Tblmedication();
                medDB.AddArtMedication(med);
            }

            response.sendRedirect("SingleArtClient");

        } else {
            request.setAttribute("artvisiterror", "visiterror");
            request.getRequestDispatcher("art/errors.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
