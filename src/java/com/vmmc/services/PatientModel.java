/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Basicvitals;
import com.vmmc.entities.Cbs;
import com.vmmc.entities.HtcHivresult;
import com.vmmc.entities.Nextofkin;
import com.vmmc.entities.Patient;
import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientDiagnosis;
import com.vmmc.entities.PatientMedicalInsurance;
import com.vmmc.entities.StiCs;
import com.vmmc.entities.StiCsexposeinfant;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.Tblbaselinetests;
import com.vmmc.entities.Tblmedication;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblpatientspriorexposure;
import com.vmmc.entities.Tblpatientsproblems;
import com.vmmc.entities.Tblproblems;
import com.vmmc.entities.Tblreferralsto;
import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import com.vmmc.entities.Tblsetuparvreasoncodes;
import com.vmmc.entities.Tblsetuparvstatuscodes;
import com.vmmc.entities.Tblsetupfamilyplanning;
import com.vmmc.entities.Tblsetupfunctionalstatus;
import com.vmmc.entities.Tblsetuphivtestreasons;
import com.vmmc.entities.Tblsetuphivtesttypes;
import com.vmmc.entities.Tblsetupiptreasoncodes;
import com.vmmc.entities.Tblsetupiptstatus;
import com.vmmc.entities.Tblsetuporphanstatus;
import com.vmmc.entities.Tblsetuppregnancystatus;
import com.vmmc.entities.Tblsetupproblems;
import com.vmmc.entities.Tblsetupreferrals;
import com.vmmc.entities.Tblsetupreferralsto;
import com.vmmc.entities.Tblsetupstatus;
import com.vmmc.entities.Tblsetuptbinvestigationresults;
import com.vmmc.entities.Tblsetuptbstatus;
import com.vmmc.entities.Tblsetuptesttypes;
import com.vmmc.entities.Tblsetuptransferin;
import com.vmmc.entities.Tblsetupvisitstatus;
import com.vmmc.entities.Tblsetupvisittypes;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.Visitplans;
import com.vmmc.entities.VmmcAdverseevents;
import com.vmmc.entities.VmmcAdverseeventtype;
import com.vmmc.entities.VmmcCircumcisionmethod;
import com.vmmc.entities.VmmcCircumcisionprocedure;
import com.vmmc.entities.VmmcCircumcisionreason;
import com.vmmc.entities.VmmcComplaints;
import com.vmmc.entities.VmmcGeneralcondition;
import com.vmmc.entities.VmmcGenitalexam;
import com.vmmc.entities.VmmcMedicalscreening;
import com.vmmc.entities.VmmcPostprocedureassessment;
import com.vmmc.entities.VmmcPrepexmalecircumcision;
import com.vmmc.entities.VmmcReferredfrom;
import com.vmmc.entities.VmmcRiskreductionplan;
import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import com.vmmc.entities.VmmcVisits;
import com.vmmc.entities.Vmmcservicetype;
import com.vmmc.entities.VmmcService;
import java.util.List;

/**
 *
 * @author Developer
 */
public class PatientModel {

    private StiCs stics;

    public StiCs getStics() {
        return stics;
    }

    public void setStics(StiCs stics) {
        this.stics = stics;
    }

    public StiCsexposeinfant getExposeinfant() {
        return exposeinfant;
    }

    public void setExposeinfant(StiCsexposeinfant exposeinfant) {
        this.exposeinfant = exposeinfant;
    }
    private Cbs cbs;
  
    public Cbs getCbs() {
        return cbs;
    }
   
    public void setCbs(Cbs cbs) {
        this.cbs = cbs;
    }
 public Cbs getCbsPatient() {
        return cbspatient;
    }

    public void setCbsPatient(Cbs cbspatient) {
        this.cbspatient = cbspatient;
    }
    private Cbs cbspatient;
    private StiCsexposeinfant exposeinfant;
    private Patient patient;
    private Basicvitals bVitals;
    private List<VmmcService> vmmcService;
    private List<PatientDiagnosis> vmmcPatientDiagnosis;
    private List<VmmcAdverseevents> vmmcAdEvents;
    private List<VmmcAdverseeventtype> vmmcAdEventType;
    private VmmcCircumcisionmethod vmmcCircumMethod;
    private VmmcCircumcisionprocedure vmmcCircumProcedure;
    private List<VmmcCircumcisionreason> vmmcCircumcisionReason;
    private List<VmmcComplaints> vmmcComplaints;
    private List<VmmcGeneralcondition> vmmcGeneralCondition;
    private List<VmmcGenitalexam> vmmcGenExam;
    private VmmcMedicalscreening vmmcMedScreening;
    private VmmcPostprocedureassessment vmmcPostProcAssessment;
    private VmmcPrepexmalecircumcision vmmcPrepexCircumcision;
    private List<VmmcReferredfrom> vmmcReferredfrom;
    private List<VmmcRiskreductionplan> vmmcRiskreductionPlan;
    //private List<>referralInfo;
    private List<HtcHivresult> htsResults;
    private VmmcSurgicalmalecircumcision vmmcSurgicalCircum;
    private List<VmmcVisits> vmmcVisits;
    private List<Vmmcservicetype> vmmcServiceType;
    private Visitplans vmmcVisitsPlans;
    private Nextofkin nok;
    private PatientAddress address;
    private PatientMedicalInsurance ins;
    private List<Tbltests> oiarttestslist;

    public List<Tbltests> getOiarttestslist() {
        return oiarttestslist;
    }

    public void setOiarttestslist(List<Tbltests> oiarttestslist) {
        this.oiarttestslist = oiarttestslist;
    }
///////////
    private Tblpatients oiartpatient;
    private Tblvisits oiartvisit;
    private Tbltests oiartcurrenttests;
    private Tblbaselinetests oiartbaselinetests;
    private Tblmedication oiartmedications;
    private Tblproblems oiartproblems;
    private Tblpatientsproblems oiartpatientsproblems;
    private Tblappointments oiartappointments;
    private Tblstatus oiartstatus;
    private Tblreferralsto oiartreferals;
    private List<Tblreferralsto> oiartreferralstolist;
    private List<Tblbaselinetests> oiartbaselinetestslist;

    public List<Tblbaselinetests> getOiartbaselinetestslist() {
        return oiartbaselinetestslist;
    }

    public void setOiartbaselinetestslist(List<Tblbaselinetests> oiartbaselinetestslist) {
        this.oiartbaselinetestslist = oiartbaselinetestslist;
    }

    public List<Tblreferralsto> getOiartreferralstolist() {
        return oiartreferralstolist;
    }

    public void setOiartreferralstolist(List<Tblreferralsto> oiartreferralstolist) {
        this.oiartreferralstolist = oiartreferralstolist;
    }
    private Tblpatientspriorexposure oiartpriorexposure;
    private List<Tblsetupfunctionalstatus> oiartfunctionalstatus;
    private List<Tblsetuphivtestreasons> oiarthivtestreasons;
    private List<Tblsetuphivtesttypes> oiarthivtesttypes;
    private List<Tblsetupfamilyplanning> oiartfamilyplanning;
    private List<Tblsetupiptreasoncodes> oiartiptreasoncodes;
    private List<Tblsetuparvreasoncodes> oiartarvreasoncodes;
    private List<Tblsetupiptstatus> oiartiptstatus;
    private List<Tblsetuporphanstatus> oiartorphanstatus;
    private List<Tblsetuppregnancystatus> oiartpregnancystatus;
    private List<Tblsetupproblems> oiartproblemslst;
    private List<Tblsetupreferrals> oiartreferrals;
    private List<Tblsetupreferralsto> oiartreferralsto;
    private List<Tblsetuptbstatus> oiarttbstatus;
    private List<Tblsetuptesttypes> oiarttesttypes;
    private List<Tblsetuparvstatuscodes> oiartarvstatuscodes;
    private List<Tblsetuparvfixeddosecombinations> oiartarvfixeddosecombinations;
    private List<Tblsetuptbinvestigationresults> oiarttbinvestigationresults;
    private List<Tblsetuptransferin> oiarttransferin;
    private List<Tblsetupvisitstatus> oiartvisitstatus;
    private List<Tblsetupvisittypes> oiartvisittypes;
    private List<Tblsetupstatus> oiartstatuslst;
 //private List<Tblvisits> oiartvisits;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Basicvitals getbVitals() {
        return bVitals;
    }

    public void setbVitals(Basicvitals bVitals) {
        this.bVitals = bVitals;
    }

    public Nextofkin getNok() {
        return nok;
    }

    public void setNok(Nextofkin nok) {
        this.nok = nok;
    }

    public PatientAddress getAddress() {
        return address;
    }

    public void setAddress(PatientAddress address) {
        this.address = address;
    }

    public PatientMedicalInsurance getIns() {
        return ins;
    }

    public void setIns(PatientMedicalInsurance ins) {
        this.ins = ins;
    }

    public VmmcCircumcisionprocedure getVmmcCircumProcedure() {
        return vmmcCircumProcedure;
    }

    public void setVmmcCircumProcedure(VmmcCircumcisionprocedure vmmcCircumProcedure) {
        this.vmmcCircumProcedure = vmmcCircumProcedure;
    }

    public VmmcMedicalscreening getVmmcMedScreening() {
        return vmmcMedScreening;
    }

    public void setVmmcMedScreening(VmmcMedicalscreening vmmcMedScreening) {
        this.vmmcMedScreening = vmmcMedScreening;
    }

    public VmmcPostprocedureassessment getVmmcPostProcAssessment() {
        return vmmcPostProcAssessment;
    }

    public void setVmmcPostProcAssessment(VmmcPostprocedureassessment vmmcPostProcAssessment) {
        this.vmmcPostProcAssessment = vmmcPostProcAssessment;
    }

    public VmmcPrepexmalecircumcision getVmmcPrepexCircumcision() {
        return vmmcPrepexCircumcision;
    }

    public void setVmmcPrepexCircumcision(VmmcPrepexmalecircumcision vmmcPrepexCircumcision) {
        this.vmmcPrepexCircumcision = vmmcPrepexCircumcision;
    }

    public List<VmmcService> getVmmcService() {
        return vmmcService;
    }

    public void setVmmcService(List<VmmcService> vmmcService) {
        this.vmmcService = vmmcService;
    }

    public VmmcSurgicalmalecircumcision getVmmcSurgicalCircum() {
        return vmmcSurgicalCircum;
    }

    public void setVmmcSurgicalCircum(VmmcSurgicalmalecircumcision vmmcSurgicalCircum) {
        this.vmmcSurgicalCircum = vmmcSurgicalCircum;
    }

    public Visitplans getVmmcVisitsPlans() {
        return vmmcVisitsPlans;
    }

    public void setVmmcVisitsPlans(Visitplans vmmcVisitsPlans) {
        this.vmmcVisitsPlans = vmmcVisitsPlans;
    }

    public List<PatientDiagnosis> getVmmcPatientDiagnosis() {
        return vmmcPatientDiagnosis;
    }

    public void setVmmcPatientDiagnosis(List<PatientDiagnosis> vmmcPatientDiagnosis) {
        this.vmmcPatientDiagnosis = vmmcPatientDiagnosis;
    }

    public List<VmmcAdverseevents> getVmmcAdEvents() {
        return vmmcAdEvents;
    }

    public void setVmmcAdEvents(List<VmmcAdverseevents> vmmcAdEvents) {
        this.vmmcAdEvents = vmmcAdEvents;
    }

    public List<VmmcAdverseeventtype> getVmmcAdEventType() {
        return vmmcAdEventType;
    }

    public void setVmmcAdEventType(List<VmmcAdverseeventtype> vmmcAdEventType) {
        this.vmmcAdEventType = vmmcAdEventType;
    }

    public List<VmmcCircumcisionreason> getVmmcCircumcisionReason() {
        return vmmcCircumcisionReason;
    }

    public void setVmmcCircumcisionReason(List<VmmcCircumcisionreason> vmmcCircumcisionReason) {
        this.vmmcCircumcisionReason = vmmcCircumcisionReason;
    }

    public List<VmmcComplaints> getVmmcComplaints() {
        return vmmcComplaints;
    }

    public void setVmmcComplaints(List<VmmcComplaints> vmmcComplaints) {
        this.vmmcComplaints = vmmcComplaints;
    }

    public List<VmmcGeneralcondition> getVmmcGeneralCondition() {
        return vmmcGeneralCondition;
    }

    public void setVmmcGeneralCondition(List<VmmcGeneralcondition> vmmcGeneralCondition) {
        this.vmmcGeneralCondition = vmmcGeneralCondition;
    }

    public List<VmmcGenitalexam> getVmmcGenExam() {
        return vmmcGenExam;
    }

    public void setVmmcGenExam(List<VmmcGenitalexam> vmmcGenExam) {
        this.vmmcGenExam = vmmcGenExam;
    }

    public List<VmmcReferredfrom> getVmmcReferredfrom() {
        return vmmcReferredfrom;
    }

    public void setVmmcReferredfrom(List<VmmcReferredfrom> vmmcReferredfrom) {
        this.vmmcReferredfrom = vmmcReferredfrom;
    }

    public List<VmmcRiskreductionplan> getVmmcRiskreductionPlan() {
        return vmmcRiskreductionPlan;
    }

    public void setVmmcRiskreductionPlan(List<VmmcRiskreductionplan> vmmcRiskreductionPlan) {
        this.vmmcRiskreductionPlan = vmmcRiskreductionPlan;
    }

    public List<VmmcVisits> getVmmcVisits() {
        return vmmcVisits;
    }

    public void setVmmcVisits(List<VmmcVisits> vmmcVisits) {
        this.vmmcVisits = vmmcVisits;
    }

    public List<Vmmcservicetype> getVmmcServiceType() {
        return vmmcServiceType;
    }

    public void setVmmcServiceType(List<Vmmcservicetype> vmmcServiceType) {
        this.vmmcServiceType = vmmcServiceType;
    }

    public VmmcCircumcisionmethod getVmmcCircumMethod() {
        return vmmcCircumMethod;
    }

    public List<HtcHivresult> getHtsResults() {
        return htsResults;
    }

    public void setHtsResults(List<HtcHivresult> htsResults) {
        this.htsResults = htsResults;
    }

    public void setVmmcCircumMethod(VmmcCircumcisionmethod vmmcCircumMethod) {
        this.vmmcCircumMethod = vmmcCircumMethod;
    }

    public Tblpatients getOiartpatient() {
        return oiartpatient;
    }

    public void setOiartpatient(Tblpatients oiartpatient) {
        this.oiartpatient = oiartpatient;
    }

    public Tblvisits getOiartvisit() {
        return oiartvisit;
    }

    public void setOiartvisit(Tblvisits oiartvisit) {
        this.oiartvisit = oiartvisit;
    }

    public Tbltests getOiartcurrenttests() {
        return oiartcurrenttests;
    }

    public void setOiartcurrenttests(Tbltests oiartcurrenttests) {
        this.oiartcurrenttests = oiartcurrenttests;
    }

    public Tblbaselinetests getOiartbaselinetests() {
        return oiartbaselinetests;
    }

    public void setOiartbaselinetests(Tblbaselinetests oiartbaselinetests) {
        this.oiartbaselinetests = oiartbaselinetests;
    }

    public Tblmedication getOiartmedications() {
        return oiartmedications;
    }

    public void setOiartmedications(Tblmedication oiartmedications) {
        this.oiartmedications = oiartmedications;
    }

    public Tblproblems getOiartproblems() {
        return oiartproblems;
    }

    public void setOiartproblems(Tblproblems oiartproblems) {
        this.oiartproblems = oiartproblems;
    }

    public Tblpatientsproblems getOiartpatientsproblems() {
        return oiartpatientsproblems;
    }

    public void setOiartpatientsproblems(Tblpatientsproblems oiartpatientsproblems) {
        this.oiartpatientsproblems = oiartpatientsproblems;
    }

    public Tblappointments getOiartappointments() {
        return oiartappointments;
    }

    public void setOiartappointments(Tblappointments oiartappointments) {
        this.oiartappointments = oiartappointments;
    }

    public Tblstatus getOiartstatus() {
        return oiartstatus;
    }

    public void setOiartstatus(Tblstatus oiartstatus) {
        this.oiartstatus = oiartstatus;
    }

    public Tblreferralsto getOiartreferals() {
        return oiartreferals;
    }

    public void setOiartreferals(Tblreferralsto oiartreferals) {
        this.oiartreferals = oiartreferals;
    }

    public Tblpatientspriorexposure getOiartpriorexposure() {
        return oiartpriorexposure;
    }

    public void setOiartpriorexposure(Tblpatientspriorexposure oiartpriorexposure) {
        this.oiartpriorexposure = oiartpriorexposure;
    }

    public List<Tblsetupfunctionalstatus> getOiartfunctionalstatus() {
        return oiartfunctionalstatus;
    }

    public void setOiartfunctionalstatus(List<Tblsetupfunctionalstatus> oiartfunctionalstatus) {
        this.oiartfunctionalstatus = oiartfunctionalstatus;
    }

    public List<Tblsetuphivtestreasons> getOiarthivtestreasons() {
        return oiarthivtestreasons;
    }

    public void setOiarthivtestreasons(List<Tblsetuphivtestreasons> oiarthivtestreasons) {
        this.oiarthivtestreasons = oiarthivtestreasons;
    }

    public List<Tblsetuphivtesttypes> getOiarthivtesttypes() {
        return oiarthivtesttypes;
    }

    public void setOiarthivtesttypes(List<Tblsetuphivtesttypes> oiarthivtesttypes) {
        this.oiarthivtesttypes = oiarthivtesttypes;
    }

    public List<Tblsetupfamilyplanning> getOiartfamilyplanning() {
        return oiartfamilyplanning;
    }

    public void setOiartfamilyplanning(List<Tblsetupfamilyplanning> oiartfamilyplanning) {
        this.oiartfamilyplanning = oiartfamilyplanning;
    }

    public List<Tblsetupiptreasoncodes> getOiartiptreasoncodes() {
        return oiartiptreasoncodes;
    }

    public void setOiartiptreasoncodes(List<Tblsetupiptreasoncodes> oiartiptreasoncodes) {
        this.oiartiptreasoncodes = oiartiptreasoncodes;
    }

    public List<Tblsetuparvreasoncodes> getOiartarvreasoncodes() {
        return oiartarvreasoncodes;
    }

    public void setOiartarvreasoncodes(List<Tblsetuparvreasoncodes> oiartarvreasoncodes) {
        this.oiartarvreasoncodes = oiartarvreasoncodes;
    }

    public List<Tblsetupiptstatus> getOiartiptstatus() {
        return oiartiptstatus;
    }

    public void setOiartiptstatus(List<Tblsetupiptstatus> oiartiptstatus) {
        this.oiartiptstatus = oiartiptstatus;
    }

    public List<Tblsetuporphanstatus> getOiartorphanstatus() {
        return oiartorphanstatus;
    }

    public void setOiartorphanstatus(List<Tblsetuporphanstatus> oiartorphanstatus) {
        this.oiartorphanstatus = oiartorphanstatus;
    }

    public List<Tblsetuppregnancystatus> getOiartpregnancystatus() {
        return oiartpregnancystatus;
    }

    public void setOiartpregnancystatus(List<Tblsetuppregnancystatus> oiartpregnancystatus) {
        this.oiartpregnancystatus = oiartpregnancystatus;
    }

    public List<Tblsetupproblems> getOiartproblemslst() {
        return oiartproblemslst;
    }

    public void setOiartproblemslst(List<Tblsetupproblems> oiartproblemslst) {
        this.oiartproblemslst = oiartproblemslst;
    }

    public List<Tblsetupreferrals> getOiartreferrals() {
        return oiartreferrals;
    }

    public void setOiartreferrals(List<Tblsetupreferrals> oiartreferrals) {
        this.oiartreferrals = oiartreferrals;
    }

    public List<Tblsetupreferralsto> getOiartreferralsto() {
        return oiartreferralsto;
    }

    public void setOiartreferralsto(List<Tblsetupreferralsto> oiartreferralsto) {
        this.oiartreferralsto = oiartreferralsto;
    }

    public List<Tblsetuptbstatus> getOiarttbstatus() {
        return oiarttbstatus;
    }

    public void setOiarttbstatus(List<Tblsetuptbstatus> oiarttbstatus) {
        this.oiarttbstatus = oiarttbstatus;
    }

    public List<Tblsetuptesttypes> getOiarttesttypes() {
        return oiarttesttypes;
    }

    public void setOiarttesttypes(List<Tblsetuptesttypes> oiarttesttypes) {
        this.oiarttesttypes = oiarttesttypes;
    }

    public List<Tblsetuparvstatuscodes> getOiartarvstatuscodes() {
        return oiartarvstatuscodes;
    }

    public void setOiartarvstatuscodes(List<Tblsetuparvstatuscodes> oiartarvstatuscodes) {
        this.oiartarvstatuscodes = oiartarvstatuscodes;
    }

    public List<Tblsetuparvfixeddosecombinations> getOiartarvfixeddosecombinations() {
        return oiartarvfixeddosecombinations;
    }

    public void setOiartarvfixeddosecombinations(List<Tblsetuparvfixeddosecombinations> oiartarvfixeddosecombinations) {
        this.oiartarvfixeddosecombinations = oiartarvfixeddosecombinations;
    }

    public List<Tblsetuptbinvestigationresults> getOiarttbinvestigationresults() {
        return oiarttbinvestigationresults;
    }

    public void setOiarttbinvestigationresults(List<Tblsetuptbinvestigationresults> oiarttbinvestigationresults) {
        this.oiarttbinvestigationresults = oiarttbinvestigationresults;
    }

    public List<Tblsetuptransferin> getOiarttransferin() {
        return oiarttransferin;
    }

    public void setOiarttransferin(List<Tblsetuptransferin> oiarttransferin) {
        this.oiarttransferin = oiarttransferin;
    }

    public List<Tblsetupvisitstatus> getOiartvisitstatus() {
        return oiartvisitstatus;
    }

    public void setOiartvisitstatus(List<Tblsetupvisitstatus> oiartvisitstatus) {
        this.oiartvisitstatus = oiartvisitstatus;
    }

    public List<Tblsetupvisittypes> getOiartvisittypes() {
        return oiartvisittypes;
    }

    public void setOiartvisittypes(List<Tblsetupvisittypes> oiartvisittypes) {
        this.oiartvisittypes = oiartvisittypes;
    }

    public List<Tblsetupstatus> getOiartstatuslst() {
        return oiartstatuslst;
    }

    public void setOiartstatuslst(List<Tblsetupstatus> oiartstatuslst) {
        this.oiartstatuslst = oiartstatuslst;
    }

}
