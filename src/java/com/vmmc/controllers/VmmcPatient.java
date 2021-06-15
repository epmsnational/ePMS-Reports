/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Circumcisionreasontype;
import com.vmmc.entities.Complainttype;
import com.vmmc.entities.Diagnosistype;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Generalconditiontype;
import com.vmmc.entities.Genitalexamtype;
import com.vmmc.entities.Patient;
import com.vmmc.entities.PatientDiagnosis;
import com.vmmc.entities.Setupreferredfrom;
import com.vmmc.entities.Vmmc;
import com.vmmc.entities.VmmcCircumcisionmethod;
import com.vmmc.entities.VmmcCircumcisionreason;
import com.vmmc.entities.VmmcComplaints;
import com.vmmc.entities.VmmcGeneralcondition;
import com.vmmc.entities.VmmcGenitalexam;
import com.vmmc.entities.VmmcMedicalscreening;
import com.vmmc.entities.VmmcReferredfrom;
import com.vmmc.entities.VmmcService;
import com.vmmc.entities.Vmmcservicetype;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedVmmcClientAll;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.IVmmcImpl;
import com.vmmc.services.SetupServiceImpl;
import com.vmmc.services.VmmcCircumcisionReasonServiceImpl;
import com.vmmc.services.VmmcCircumcisionmethodServiceImpl;
import com.vmmc.services.VmmcComplaintsServiceImpl;
import com.vmmc.services.VmmcDateUtil;
import com.vmmc.services.VmmcDiagonisedServiceImpl;
import com.vmmc.services.VmmcGeneralConditionServiceImpl;
import com.vmmc.services.VmmcGenitalexamServiceImpl;
import com.vmmc.services.VmmcMedicalScreeningServiceImpl;
import com.vmmc.services.VmmcReferredFromServiceImpl;
import com.vmmc.services.VmmcServiceServiceImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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
 * @author System Devoloper
 */
@WebServlet(name = "VmmcPatient", urlPatterns = {"/VmmcPatient"})
public class VmmcPatient extends HttpServlet {

    static SetupServiceImpl setup = new SetupServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Setupreferredfrom> lstReferredfrom = setup.getSetupReferredFroms();
        request.setAttribute("ReferredFroms", lstReferredfrom);

        List<Vmmcservicetype> lstservicetype = setup.getVmmcServiceTypes();
        request.setAttribute("vmmcServices", lstservicetype);

        List<Circumcisionreasontype> lstCircumReasonTypes = setup.getCircumcisionReasonTypes();
        request.setAttribute("CircumcisionReasons", lstCircumReasonTypes);

        //creating VMMC No
        Facilityconfig fc = new FacilityConfigServiceImpl().getFacilityConfig(1);

        String vmmcStub = fc.getProvinceId() + "-" + fc.getDistrictId() + "-" + fc.getFacilityId();
        String locationForVmmc = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            java.util.Date timeStamp = format.parse(currentTimestamp.toString());

            locationForVmmc = vmmcStub + "-" + currentTimestamp.toString().substring(0, 4);
            locationForVmmc += "-M" + currentTimestamp.toString().substring(4, currentTimestamp.toString().length()).replaceAll(":", "-");
            locationForVmmc = locationForVmmc.replace(" ", "-");
        } catch (Exception e) {
        }

        request.setAttribute("vmmcnum", locationForVmmc);
//       List<Circumcisionreasontype>lstCircumReasons= setup.getCircumcisionReasonTypes();
//        //List<Patient> pp = new CircumcisablePatientImpl().getAllPatients();
//        List<Circumcisionreasontype>lstCircumTypes = setup.getCircumcisionReasonTypes();
//        List<Adverseeventtype>lstAdverseeventtype = setup.getAdverseEventTypes();
//        request.setAttribute("lstCircumReasons", lstCircumReasons);
//         request.setAttribute("lstAdverseeventtype", lstAdverseeventtype);
//         
        List<Complainttype> lstComplaintype = setup.getComplainTypes();
        request.setAttribute("Complains", lstComplaintype);

        List<Diagnosistype> lstDiagnosistype = setup.getDiagnosisTypes();
        request.setAttribute("Diagnoses", lstDiagnosistype);
//        
//        List<Functionalstatustype>lstFunctionalstatustype = setup.getFunctionalStatusTypes();
//        request.setAttribute("lstFunctionalstatustype", lstFunctionalstatustype);
//        
        List<Generalconditiontype> lstGeneralconditiontype = setup.getGeneralConditionTypes();
        request.setAttribute("GeneralConditions", lstGeneralconditiontype);

        List<Genitalexamtype> lstGenitalexamtype = setup.getGenitalExampleTypes();
        request.setAttribute("GenitalExamples", lstGenitalexamtype);

//        List<HtcSetuphtcapproach>lstHtcSetuphtcapproach = setup.getHtcApproaches();
//        request.setAttribute("lstHtcSetuphtcapproach", lstHtcSetuphtcapproach);
//        
//         List<Proceduretype>lstProceduretype = setup.getProcedureTypes();
//        request.setAttribute("lstProceduretype", lstProceduretype);
//        
//         List<Riskreductionplantype>lstRiskreductionplantype = setup.getRiskReductionPlanTypes();
//        request.setAttribute("lstRiskreductionplantype", lstRiskreductionplantype);
//        
        //get patient details
        Patient p=null;
        HttpSession session = request.getSession();
        String tempClient = (String)request.getAttribute("opdNum");
         p = tempClient==null?(Patient)session.getAttribute("patient") :new CircumcisablePatientImpl().getPatient(tempClient);
        
        session.setAttribute("patient", p);
        float age = 0;
//        Calendar cal1 = Calendar.getInstance();
//        Calendar cal2 = Calendar.getInstance();
//        p.setRegistrationDate(cal2.getTime());
//        try {
//            String d1 = p.getDob().toString().replace("-", "/");
//            String check = d1.substring(d1.lastIndexOf("/"));
//            int temp = Integer.parseInt(check.replace("/", ""));
//            if (temp <= 31) {
//                String[] arr = d1.split("/");
//                d1 = arr[2] + "/" + arr[1] + "/" + arr[0];
//            }
//
//            cal1.setTime(VmmcDateUtil.makeDate(d1));
//            age = VmmcDateUtil.DateDiff(cal1.getTime(), cal2.getTime());
//        } catch (Exception eee) {
//            eee.printStackTrace();
//        }
//        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age =(float)EpmsDuration.getDays(stamp)/365.0f;
        p.setAge(age);
        request.setAttribute("Patient", p);

        RequestDispatcher disp = request.getRequestDispatcher("/vmmc/newVmmc.jsp");
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

        Patient p = (Patient) session.getAttribute("patient");
        // processRequest(request, response);
        String vmmcNumber = request.getParameter("txtvmmcNum");
        String registrationDate = request.getParameter("txtRegDate");
       
        String provinceId = request.getParameter("slctProvince");
        String facilityId = request.getParameter("slctFacility");
        //String[] roles= request.getParameter("ckRole").split(",");
        String districtId = request.getParameter("slctDistrict");
       
        //create first step vmmc
        Vmmc v = new Vmmc();
        IVmmcImpl vs = new IVmmcImpl();
        //v.setComment("@");
        //v.getDateRegistered();txtRegDate
        //v.setFacilityCode(facilityId);
        v.setOpdnumber(p.getOpdnumber());
        /// v.setPatientId(p.getId());   ///// to be removed from the table
        v.setVmmcnumber(vmmcNumber);

        vs.add(v);

        //v.setTypeofFacility("@");
        //int serviceType = Integer.parseInt( request.getParameter("ckServices"));
        //VmmcService serv =new VmmcService();
        //serv.setVmmcid(p.getId());
        //serv.setVmmcserviceTypeId(serviceType);
        //VmmcServiceServiceImpl vss= new VmmcServiceServiceImpl();
        //vss.add(serv);
        // molding step 2
        //capture other specify
        VmmcReferredFromServiceImpl vrfImpl = new VmmcReferredFromServiceImpl();

        String otherReferredFrom = request.getParameter("txtSpecifyReferral");
        VmmcReferredfrom otherVrf = new VmmcReferredfrom();
        if (otherVrf != null) {
            otherVrf.setSpecifyReferredFrom(otherReferredFrom);
            otherVrf.setVmmcid(vmmcNumber);
            otherVrf.setReferredFromId(99); //code for other specify
        }
        vrfImpl.add(otherVrf);

        //capture options on the user inteface being populated by setupReferrals table
        String[] referredFromValues = request.getParameterValues("ckRefferals");
        if(referredFromValues != null){
        for (String g : referredFromValues) {
            VmmcReferredfrom vrf = new VmmcReferredfrom();
            vrf.setReferredFromId(Integer.parseInt(g));
            vrf.setVmmcid(vmmcNumber);
            //also populate the ReferredFromDescription_id by referring to setup table of referrals

            vrfImpl.add(vrf);
            vrf = null;
        }
        }
        

        //molding service still on step 2
        VmmcServiceServiceImpl vssImpl = new VmmcServiceServiceImpl();

        String otherService = request.getParameter("txtSpecifyService");
        VmmcService otherVst = new VmmcService();
        if (otherVst != null) {
            otherVst.setOtherSpecifyService(otherService);
            otherVst.setVmmcid(vmmcNumber);
            otherVst.setVmmcserviceTypeId(99);
        }
        vssImpl.add(otherVst);

        String[] serviceValues = request.getParameterValues("ckvmmcServices");
        if(serviceValues!=null){
        for (String g : serviceValues) {
            VmmcService vst = new VmmcService();
            vst.setVmmcserviceTypeId(Integer.parseInt(g));
            vst.setVmmcid(vmmcNumber);

            vssImpl.add(vst);

        }
       
    }

        //mold step 3
        VmmcCircumcisionReasonServiceImpl vcrImpl = new VmmcCircumcisionReasonServiceImpl();

        String otherReason = request.getParameter("txtSpecifyCircumcisionReason");
        VmmcCircumcisionreason otherCr = new VmmcCircumcisionreason();
        if (otherReason != null) {
            otherCr.setSpecifyOtherReasons(otherReason);
            otherCr.setVmmcid(vmmcNumber);
            otherCr.setCircumcisionReasonTypeId(99);

        }
        vcrImpl.add(otherCr);

        String[] circumcisionReasonValues = request.getParameterValues("ckCircumcisionReasons");
        if(circumcisionReasonValues!=null){
        for (String g : circumcisionReasonValues) {
            VmmcCircumcisionreason vcr = new VmmcCircumcisionreason();
            vcr.setVmmcid(vmmcNumber);
            vcr.setCircumcisionReasonTypeId(Integer.parseInt(g));

            vcrImpl.add(vcr);
            vcr = null;
        }
        }

//        molding step 3 and 4  which submit to the same table
        //mold step4 diagnosis
        VmmcDiagonisedServiceImpl vdsImpl = new VmmcDiagonisedServiceImpl();

        String otherDiagnosis = request.getParameter("txtSpecifyDiagnosis");
        PatientDiagnosis otherPd = new PatientDiagnosis();
        if (otherDiagnosis != null) {
            otherPd.setSpecifyOtherDiagnosis(otherDiagnosis);
            otherPd.setVmmcid(vmmcNumber);
            otherPd.setDiagnosisTypeId(99);

        }
        vdsImpl.add(otherPd);

        String[] diagnosisValues = request.getParameterValues("ckVmmcDiagnoses");
        if(diagnosisValues!=null){
        for (String g : diagnosisValues) {
            PatientDiagnosis pd = new PatientDiagnosis();

            pd.setVmmcid(vmmcNumber);
            pd.setDiagnosisTypeId(Integer.parseInt(g));
            vdsImpl.add(pd);
            pd = null;
        }
        }

        VmmcMedicalScreeningServiceImpl vmsImpl = new VmmcMedicalScreeningServiceImpl();
        String vmsAllegies = request.getParameter("txtSpecifyAllergies");
        String vmsIsClientTested = request.getParameter("rdIsTested");
        String vmsLessOneMonthTest = request.getParameter("txtHIVTestOne");
        String vmsBtwnOneThreeTest = request.getParameter("txtHIVTestOneThree");
        String vmsMoreThreeTest = request.getParameter("txtHIVTestThreeMore");
        String vmsSpecifyPeriodTest = request.getParameter("txtHIVTestSpecify");
        String vmsHIVResult = request.getParameter("txtTestedResult");
        String vmsHIVTestedProof = request.getParameter("txtHIVTestedProof");
        String vmsHIVTestedVMMC = request.getParameter("txtHIVTestedVMMC");
        String vmsHIVTestResult = request.getParameter("txtHIVTestedVMMCResult");
        String vmsTestedWHO = request.getParameter("txtHIVTestedWHO");
        String vmsTestCD4 = request.getParameter("txtHIVTestedCD4");

        String medication = request.getParameter("txtSpecifyMedications");
        String vmsWeight = request.getParameter("txtVitalWeight");
        String vmsTemperature = request.getParameter("txtVitalTemp");
        String vmsBloodPressure = request.getParameter("txtVitalBP");
        String vmsPulse = request.getParameter("txtVitalPulse");
        String vmsIsAnyAllegies = request.getParameter("txtAnyAllergies");
        String vmsAnyMedications = request.getParameter("txtAnyMedications");
        String vmsAnyOperation = request.getParameter("txtAnyOperations");
        String operation = request.getParameter("txtSpecifyOperations");
        String vmsIsAbnormalBleeding = request.getParameter("txtAbnormalBleeding");
        String vmsAbnormalBleeding = request.getParameter("txtSpecifyAbnormalBleeding");

        VmmcMedicalscreening vms = new VmmcMedicalscreening();
        vms.setHasTestedHiv(vmsIsClientTested);
        vms.setIfTestedResult(vmsHIVResult);
        vms.setProofTestProvided(vmsHIVTestedProof);
        vms.setHivtestResult(vmsHIVTestResult);
        int cd4count = vmsTestCD4.length() == 0 ? 0 : Integer.parseInt(vmsTestCD4);
        vms.setCd4cellCount(cd4count);

        int whostage = vmsTestedWHO.length() == 0 ? 0 : Integer.parseInt(vmsTestedWHO);
        vms.setWhoclinicalStage(whostage);
        vms.setHivtestDone(vmsHIVTestedVMMC);
        double weight = vmsWeight.length() == 0 ? 0.0 : Double.parseDouble(vmsWeight);
        vms.setWeight(weight);
        double temperature = vmsTemperature.length() == 0 ? 0.0 : Double.parseDouble(vmsTemperature);
        vms.setTemperature(temperature);
        vms.setBloodPressure(vmsBloodPressure);

        double pulse = vmsPulse.length() == 0 ? 0.0 : Double.parseDouble(vmsPulse);
        vms.setPulse(pulse);
        vms.setIfTestedLessOneMonth(vmsLessOneMonthTest);
        vms.setIfTestedMoreThreeMonths(vmsMoreThreeTest);
        vms.setIfTestedOneThreeMonths(vmsBtwnOneThreeTest);
        vms.setIfTestedSpecify(vmsSpecifyPeriodTest);
        vms.setMedications(medication);
        vms.setAreKnownAllergies(vmsIsAnyAllegies);
        vms.setAllergies(vmsAllegies);
        vms.setAnyMedications(vmsAnyMedications);
        vms.setAnyOperations(vmsAnyOperation);
        vms.setOperations(operation);
        vms.setIsAbnormalBleeding(vmsIsAbnormalBleeding);
        vms.setFamilyHistoryabnormalbleeding(vmsAbnormalBleeding);
        vms.setVmmcid(vmmcNumber);
        vmsImpl.add(vms);

        //mold 5
        VmmcGeneralConditionServiceImpl vgcImpl = new VmmcGeneralConditionServiceImpl();

        String otherGeneralCondition = request.getParameter("txtSpecifyGeneralConditions");
        VmmcGeneralcondition otherVgc = new VmmcGeneralcondition();
        if (otherGeneralCondition != null) {
            otherVgc.setSpecifyGeneralCondition(otherGeneralCondition);
            otherVgc.setVmmcid(vmmcNumber);
            otherVgc.setGeneralConditionTypeId(99);
        }
        vgcImpl.add(otherVgc);

        String[] generalconditionValues = request.getParameterValues("ckGeneralConditions");
        if(generalconditionValues !=null){
        for (String g : generalconditionValues) {
            VmmcGeneralcondition vgc = new VmmcGeneralcondition();
            vgc.setGeneralConditionTypeId(Integer.parseInt(g));
            vgc.setVmmcid(vmmcNumber);
            vgcImpl.add(vgc);
            vgc = null;
        }
        }

        VmmcGenitalexamServiceImpl vgeImpl = new VmmcGenitalexamServiceImpl();

        String otherGenitalExam = request.getParameter("txtSpecifyGenitalExamples");
        VmmcGenitalexam otherVge = new VmmcGenitalexam();

        if (otherGenitalExam != null) {
            otherVge.setSpecifyOtherGenitalExam(otherGenitalExam);
            otherVge.setVmmcid(vmmcNumber);
            otherVge.setGenitalExamTypeId(99);

        }
        vgeImpl.add(otherVge);

        String[] genitalexamValues = request.getParameterValues("ckGenitalExamples");
        if(genitalexamValues != null){
        for (String g : genitalexamValues) {
            VmmcGenitalexam vge = new VmmcGenitalexam();

            vge.setVmmcid(vmmcNumber);
            vge.setGenitalExamTypeId(Integer.parseInt(g));

            vgeImpl.add(vge);
            vge = null;
        }
        }

        VmmcComplaintsServiceImpl vcImpl = new VmmcComplaintsServiceImpl();

        String otherVc = request.getParameter("txtSpecifyComplains");
        VmmcComplaints vc = new VmmcComplaints();
        if (otherVc != null) {
            vc.setComplaintDescription(otherVc);
            vc.setVmmcid(vmmcNumber);
            vc.setComplaintTypeId(99);
            vcImpl.add(vc);
        }
        String specifycomplaint = request.getParameter("txtSpecifyComplains");
        String[] complaintsValues = request.getParameterValues("ckComplains");
        if(complaintsValues !=null){
        for (String g : complaintsValues) {
            VmmcComplaints vcomplaint = new VmmcComplaints();
            //vcomplaint.setComplaintType(Integer.parseInt(g));
            vcomplaint.setComplaintTypeId(Integer.parseInt(g));
            vcomplaint.setVmmcid(vmmcNumber);
            vc.setSpecifyComplaint(specifycomplaint);

            vcImpl.add(vcomplaint);
        }
        }

        // Molding step 6
        VmmcCircumcisionmethodServiceImpl vmmcCircMethImpl = new VmmcCircumcisionmethodServiceImpl();
        VmmcCircumcisionmethod vmmcCircMeth = new VmmcCircumcisionmethod();
        String InformedConsent = request.getParameter("rdInformedConsent");

        String parentalSign = request.getParameter("rdParentalSign");
        String[] ArrConsentObtainedby = request.getParameterValues("ckConsentObt");
        String consentObtainedby = (Arrays.deepToString(ArrConsentObtainedby));
        //org.apache.apache.commons.StringUtils.join(consentObtainedby,";");
        String consentObtSpecify = request.getParameter("txtConsentObtSpecify");
        String[] ArrEligiableMethod = request.getParameterValues("ckEligible");
        String EligiableMethod = (Arrays.deepToString(ArrEligiableMethod));
        String EligiableSpecify = request.getParameter("txtEligibleSpecify");
        String chosenMethod = request.getParameter("rdChosenMethod");
        String chosenSpecify = request.getParameter("txtChosenSpecify");
        
        
        //vmmcCircMeth.setAdultsClinicianInitials(districtId);//??
        vmmcCircMeth.setCircumcisionChosenByClients(chosenMethod);
        vmmcCircMeth.setParentSignature(parentalSign);
        vmmcCircMeth.setInformedConsentGranted(InformedConsent);
        vmmcCircMeth.setParentSignature(parentalSign);
        vmmcCircMeth.setConsentObtainedBy(consentObtainedby);
        
        vmmcCircMeth.setOtherAppropriateSpecify(chosenSpecify);
        vmmcCircMeth.setOtherEligibleSpecify(EligiableSpecify);
        vmmcCircMeth.setCircumcisionMethod(EligiableMethod);
        vmmcCircMeth.setVmmcid(vmmcNumber);
        vmmcCircMeth.setPatientType(facilityId);
        vmmcCircMeth.setVmmcid(vmmcNumber);

        vmmcCircMethImpl.add(vmmcCircMeth);
//create an object of CompletedVmmcClient

        CompletedVmmcClientAll cptdVmmcClient = new CompletedVmmcClientAll(vmmcNumber);

        //also add patient
        p.setVmmcId(vmmcNumber);
        cptdVmmcClient.setP(p);
        CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
        //edit patient table and update the vmcId number
        circumImpl.edit(p);

        request.setAttribute("cptdVmmcClient", cptdVmmcClient);
        //dispatch to dashboard
        AllVmmcsServ serv = new AllVmmcsServ();
        serv.doGet(request, response);
       
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
