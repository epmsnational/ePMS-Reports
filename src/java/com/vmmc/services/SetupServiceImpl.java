/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Adverseeventtype;
import com.vmmc.entities.Circumcisionreasontype;
import com.vmmc.entities.Complainttype;
import com.vmmc.entities.Diagnosistype;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Functionalstatustype;
import com.vmmc.entities.Generalconditiontype;
import com.vmmc.entities.Genitalexamtype;
import com.vmmc.entities.Hivresulttype;
import com.vmmc.entities.HtcSetuphtcapproach;
import com.vmmc.entities.HtcTestreason;
import com.vmmc.entities.HtcTesttype;
import com.vmmc.entities.HtcSetuphtcmodel;
import com.vmmc.entities.HtsEntrypoint;
import com.vmmc.entities.Proceduretype;
import com.vmmc.entities.Riskreductionplantype;
import com.vmmc.entities.SetupLinkages;
import com.vmmc.entities.SetupreferredTo;
import com.vmmc.entities.Setupreferredfrom;
import com.vmmc.entities.Setupstaff;
import com.vmmc.entities.Statustype;
import com.vmmc.entities.StiDrugs;
import com.vmmc.entities.StiExaminations;
import com.vmmc.entities.StiHistory;
import com.vmmc.entities.StiInfectiontype;
import com.vmmc.entities.StiSetuppurposeofsyphilis;
import com.vmmc.entities.StiSetupsyndrome;
import com.vmmc.entities.StiSexualactivity;
import com.vmmc.entities.StiSymptoms;
import com.vmmc.entities.Tblsetupadverseeventsstatus;
import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import com.vmmc.entities.Tblsetuparvreasoncodes;
import com.vmmc.entities.Tblsetuparvstatuscodes;
import com.vmmc.entities.Tblsetupdispensers;
import com.vmmc.entities.Tblsetupfamilyplanning;
import com.vmmc.entities.Tblsetupfunctionalstatus;
import com.vmmc.entities.Tblsetuphivtestreasons;
import com.vmmc.entities.Tblsetupiptreasoncodes;
import com.vmmc.entities.Tblsetupiptstatus;
import com.vmmc.entities.Tblsetuppregnancystatus;
import com.vmmc.entities.Tblsetupproblems;
import com.vmmc.entities.Tblsetupreferralsto;
import com.vmmc.entities.Tblsetupstaff;
import com.vmmc.entities.Tblsetupstatus;
import com.vmmc.entities.Tblsetuptbinvestigationresults;
import com.vmmc.entities.Tblsetuptbstatus;
import com.vmmc.entities.Tblsetuptpttype;
import com.vmmc.entities.Tblsetupvisitstatus;
import com.vmmc.entities.Tblsetupvisittypes;
import com.vmmc.entities.Visittype;
import com.vmmc.entities.Vmmcservicetype;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author leon-mbano
 */
public class SetupServiceImpl implements SetupService {

    
    
    public List<Facilities> getFacilityTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Facilities> pList = null;
        try {
            pList = session.createQuery("from Facilities").list();
            return pList;
        } finally {
            session.close();
        }

    }
    
     public List<Tblsetuptpttype> getTptTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuptpttype> pList = null;
        try {
            pList = session.createQuery("from Tblsetuptpttype").list();
            return pList;
        } finally {
            session.close();
        }

    }
    
    public List<Adverseeventtype> getAdverseEventTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Adverseeventtype> pList = null;
        try {
            pList = session.createQuery("from Adverseeventtype").list();
            return pList;
        } finally {
            session.close();
        }

    }

    public List<Circumcisionreasontype> getCircumcisionReasonTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Circumcisionreasontype> pList = null;
        try {
            pList = session.createQuery("from Circumcisionreasontype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getCircumcisionReasonTypes(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Circumcisionreasontype> pList = null;
        try {
            pList = session.createQuery("from Circumcisionreasontype").list();

            for (Circumcisionreasontype x : pList) {
                map.put(x.getId(), x.getCircumcisionReasonName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Complainttype> getComplainTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Complainttype> pList = null;
        try {
            pList = session.createQuery("from Complainttype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getComplainTypes(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Complainttype> pList = null;
        try {
            pList = session.createQuery("from Complainttype").list();

            for (Complainttype x : pList) {
                map.put(x.getId(), x.getComplaintName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Setupstaff> getAllStaff() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Setupstaff> pList = null;
        try {
            pList = session.createQuery("from Setupstaff").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<Diagnosistype> getDiagnosisTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Diagnosistype> pList = null;
        try {
            pList = session.createQuery("from Diagnosistype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getDiagnosisTypes(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Diagnosistype> pList = null;
        try {
            pList = session.createQuery("from Diagnosistype").list();

            for (Diagnosistype x : pList) {
                map.put(x.getId(), x.getDiagnosisName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Functionalstatustype> getFunctionalStatusTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Functionalstatustype> pList = null;
        try {
            pList = session.createQuery("from Functionalstatustype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<Generalconditiontype> getGeneralConditionTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Generalconditiontype> pList = null;
        try {
            pList = session.createQuery("from Generalconditiontype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getGeneralConditionTypes(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Generalconditiontype> pList = null;
        try {
            pList = session.createQuery("from Generalconditiontype").list();

            for (Generalconditiontype x : pList) {
                map.put(x.getId(), x.getGeneralConditionName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Genitalexamtype> getGenitalExampleTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Genitalexamtype> pList = null;
        try {
            pList = session.createQuery("from Genitalexamtype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getGenitalExampleTypes(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Genitalexamtype> pList = null;
        try {
            pList = session.createQuery("from Genitalexamtype").list();

            for (Genitalexamtype x : pList) {
                map.put(x.getId(), x.getGenitalExamName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Hivresulttype> getResultTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Hivresulttype> pList = null;
        try {
            pList = session.createQuery("from Hivresulttype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<HtcSetuphtcapproach> getHtcApproaches() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcSetuphtcapproach> pList = null;
        try {
            pList = session.createQuery("from HtcSetuphtcapproach").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getHtcApproaches(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcSetuphtcapproach> pList = null;
        try {
            pList = session.createQuery("from HtcSetuphtcapproach").list();

            for (HtcSetuphtcapproach x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<StiSetuppurposeofsyphilis> getStiSetuppurposeofsyphilis() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSetuppurposeofsyphilis> pList = null;
        try {
            pList = session.createQuery("from StiSetuppurposeofsyphilis").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getStiSetuppurposeofsyphilis(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSetuppurposeofsyphilis> pList = null;
        try {
            pList = session.createQuery("from StiSetuppurposeofsyphilis").list();

            for (StiSetuppurposeofsyphilis x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<HtcSetuphtcmodel> getHtcModels() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcSetuphtcmodel> pList = null;
        try {
            pList = session.createQuery("from HtcSetuphtcmodel  where mainModel=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getHtcModels(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcSetuphtcmodel> pList = null;
        try {
            pList = session.createQuery("from HtcSetuphtcmodel where mainModel=1").list();

            for (HtcSetuphtcmodel x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<HtcSetuphtcmodel> getHtcFacilityModels() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<HtcSetuphtcmodel> modeList = session.createQuery("from HtcSetuphtcmodel where facilityBased= 1 ").list();
            return modeList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getHtcFacilityModels(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcSetuphtcmodel> pList = null;
        try {
            pList = session.createQuery("from HtcSetuphtcmodel where facilityBased= 1").list();

            for (HtcSetuphtcmodel x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<HtcSetuphtcmodel> getHtcComunityModels() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        // Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<HtcSetuphtcmodel> modeList = session.createQuery("from HtcSetuphtcmodel where communityBased= 1 ").list();
            return modeList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getHtcComunityModels(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcSetuphtcmodel> pList = null;
        try {
            pList = session.createQuery("from HtcSetuphtcmodel where communityBased= 1").list();

            for (HtcSetuphtcmodel x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<HtcTestreason> getHtcTestReasons() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcTestreason> pList = null;
        try {
            pList = session.createQuery("from HtcTestreason").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getHtcTestReasons(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcTestreason> pList = null;
        try {
            pList = session.createQuery("from HtcTestreason").list();

            for (HtcTestreason x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<HtcTesttype> getHtcTestTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtcTesttype> pList = null;
        try {
            pList = session.createQuery("from HtcTesttype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<Proceduretype> getProcedureTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Proceduretype> pList = null;
        try {
            pList = session.createQuery("from Proceduretype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<Riskreductionplantype> getRiskReductionPlanTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Riskreductionplantype> pList = null;
        try {
            pList = session.createQuery("from Riskreductionplantype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<SetupLinkages> getSetupLinkages() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<SetupLinkages> pList = null;
        try {
            pList = session.createQuery("from SetupLinkages").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<SetupreferredTo> getSetupReferredTos() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<SetupreferredTo> pList = null;
        try {
            pList = session.createQuery("from SetupreferredTo").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<Setupreferredfrom> getSetupReferredFroms() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Setupreferredfrom> pList = null;
        try {
            pList = session.createQuery("from Setupreferredfrom").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getSetupReferredFroms(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Setupreferredfrom> pList = null;
        try {
            pList = session.createQuery("from Setupreferredfrom").list();

            for (Setupreferredfrom x : pList) {
                map.put(x.getId(), x.getReferredFromName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Statustype> getStatusTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Statustype> pList = null;
        try {
            pList = session.createQuery("from Statustype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<Visittype> getVisitTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Visittype> pList = null;
        try {
            pList = session.createQuery("from Visittype where ForStandard=-1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getVmmcServiceTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Vmmcservicetype> pList = null;
        try {
            pList = session.createQuery("from Vmmcservicetype").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getVmmcServiceTypes(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Vmmcservicetype> pList = null;
        try {
            pList = session.createQuery("from Vmmcservicetype").list();

            for (Vmmcservicetype x : pList) {
                map.put(x.getId(), x.getVmmcserviceName());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<Tblsetupproblems> getSignsAtEnrolment() {

        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupproblems> pList = null;
        try {
            pList = session.createQuery("from Tblsetupproblems where problemType= 'Current signs'").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getSymptomsAtEnrolment() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupproblems> pList = null;
        try {
            pList = session.createQuery("from Tblsetupproblems where problemType= 'Current symptoms'").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getPastMedicalHistory() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupproblems> pList = null;
        try {
            pList = session.createQuery("from Tblsetupproblems where problemType= 'Past medical history'").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getExaminations() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupproblems> pList = null;
        try {
            pList = session.createQuery("from Tblsetupproblems where problemType= 'Examination'").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getHivTestReasons() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuphivtestreasons> pList = null;
        try {
            pList = session.createQuery("from Tblsetuphivtestreasons ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIFamilyPlanning() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupfamilyplanning> pList = null;
        try {
            pList = session.createQuery("from Tblsetupfamilyplanning ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override

    public List getOIPregnancyStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuppregnancystatus> pList = null;
        try {
            pList = session.createQuery("from Tblsetuppregnancystatus ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIFunctionalStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupfunctionalstatus> pList = null;
        try {
            pList = session.createQuery("from Tblsetupfunctionalstatus ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOITBScreening() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuptbstatus> pList = null;
        try {
            pList = session.createQuery("from Tblsetuptbstatus ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOITBInvestigationResults() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuptbinvestigationresults> pList = null;
        try {
            pList = session.createQuery("from Tblsetuptbinvestigationresults ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIOpportunisticsInfect() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupproblems> pList = null;
        try {
            pList = session.createQuery("from Tblsetupproblems where ProblemType='New OI or other problems' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIIPTStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupiptstatus> pList = null;
        try {
            pList = session.createQuery("from Tblsetupiptstatus ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIIPTNoReasons() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupiptreasoncodes> pList = null;
        try {
            pList = session.createQuery("from Tblsetupiptreasoncodes ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIARVStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuparvstatuscodes> pList = null;
        try {
            pList = session.createQuery("from Tblsetuparvstatuscodes ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIAdverseEventsStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupadverseeventsstatus> pList = null;
        try {
            pList = session.createQuery("from Tblsetupadverseeventsstatus ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIARVReason() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuparvreasoncodes> pList = null;
        try {
            pList = session.createQuery("from Tblsetuparvreasoncodes ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIARVRegimenCombinations() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuparvfixeddosecombinations> pList = null;
        try {
            pList = session.createQuery("from Tblsetuparvfixeddosecombinations ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIReferredTo() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupreferralsto> pList = null;
        try {
            pList = session.createQuery("from Tblsetupreferralsto ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    //include after adding the new table
    public List getOIVisitStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupvisitstatus> pList = null;
        try {
            pList = session.createQuery("from Tblsetupvisitstatus ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIFollowupStatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupstatus> pList = null;
        try {
           // from HtsEntrypoint where type= 2 or type= 0
            pList = session.createQuery("from Tblsetupstatus where statusCode='D'or statusCode='LTFU'or statusCode='MISS'or statusCode='TO'or statusCode='OO' or statusCode='O'or statusCode='Tx' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIClinicians() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupstaff> pList = null;
        try {
            pList = session.createQuery("from Tblsetupstaff ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIDispensers() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupdispensers> pList = null;
        try {
            pList = session.createQuery("from Tblsetupdispensers ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIVisittypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupvisittypes> pList = null;
        try {
            pList = session.createQuery("from Tblsetupvisittypes where dsdclinical=2 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOICinicalVisittypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupvisittypes> pList = null;
        try {
            pList = session.createQuery("from Tblsetupvisittypes where dsdclinical=1 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIRefillVisittypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupvisittypes> pList = null;
        try {
            pList = session.createQuery("from Tblsetupvisittypes where dsdrefil=1 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIOphanstatus() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetupvisittypes> pList = null;
        try {
            pList = session.createQuery("from Tblsetuporphanstatus  ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIARVReason1() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuparvreasoncodes> pList = null;
        try {
            pList = session.createQuery("from Tblsetuparvreasoncodes where MedEligible=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIARVReason2() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuparvreasoncodes> pList = null;
        try {
            pList = session.createQuery("from Tblsetuparvreasoncodes where MedEligible=2").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getOIARVReason4() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tblsetuparvreasoncodes> pList = null;
        try {
            pList = session.createQuery("from Tblsetuparvreasoncodes where MedEligible=4").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<HtsEntrypoint> getHtsEntrypoints() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtsEntrypoint> pList = null;
        try {
            pList = session.createQuery("from HtsEntrypoint").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getHtsEntrypoints(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtsEntrypoint> pList = null;
        try {
            pList = session.createQuery("from HtsEntrypoint").list();

            for (HtsEntrypoint x : pList) {
                map.put(x.getId(), x.getDescription());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<StiSexualactivity> getSTISexualactivity() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSexualactivity> pList = null;
        try {
            pList = session.createQuery("from StiSexualactivity").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getSTISexualactivity(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSexualactivity> pList = null;
        try {
            pList = session.createQuery("from StiSexualactivity").list();

            for (StiSexualactivity x : pList) {
                map.put(x.getId(), x.getSexualactivity());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<StiSymptoms> getSTIFemaleSymptoms() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSymptoms> pList = null;
        try {
            pList = session.createQuery("from StiSymptoms where category = 1 or category = 2").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiSymptoms> getSTIMaleSymptoms() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSymptoms> pList = null;
        try {
            pList = session.createQuery("from StiSymptoms where category = 0 or category = 2").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public Map<Integer, String> getSTISymptoms(boolean isMap) {
        Map<Integer, String> map = new HashMap<>();
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSymptoms> pList = null;
        try {
            pList = session.createQuery("from StiSymptoms").list();

            for (StiSymptoms x : pList) {
                map.put(x.getId(), x.getSymptoms());
            }

            return map;
        } finally {
            session.close();
        }
    }

    public List<StiExaminations> getSTIExaminations1() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiExaminations> pList = null;
        try {
            pList = session.createQuery("from StiExaminations where type=1 OR type=0").list();
            return pList;
        } finally {
            session.close();
        }

    }

    public List<StiExaminations> getSTIExaminations2() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiExaminations> pList = null;
        try {
            pList = session.createQuery("from StiExaminations where type=2 OR type=0").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiExaminations> getSTIExaminations3() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiExaminations> pList = null;
        try {
            pList = session.createQuery("from StiExaminations where type=3 OR type=0").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiHistory> getSTIHistory() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiHistory> pList = null;
        try {
            pList = session.createQuery("from StiHistory where type=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiHistory> getSTIPreviousTreatmentHistory() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiHistory> pList = null;
        try {
            pList = session.createQuery("from StiHistory where type=2").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiHistory> getSTIDrugAllegiesHistory() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiHistory> pList = null;
        try {
            pList = session.createQuery("from StiHistory where type=3").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiSetupsyndrome> getSTIFSyndromes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSetupsyndrome> pList = null;
        try {
            pList = session.createQuery("from StiSetupsyndrome where category= 1 or category=2 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiSetupsyndrome> getSTIMSyndromes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiSetupsyndrome> pList = null;
        try {
            pList = session.createQuery("from StiSetupsyndrome where category= 0 or category= 2 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiInfectiontype> getSTIAdultFemaleInfections() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiInfectiontype> pList = null;
        try {
            pList = session.createQuery("from StiInfectiontype where type=0 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiInfectiontype> getSTIAdultMaleInfections() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiInfectiontype> pList = null;
        try {
            pList = session.createQuery("from StiInfectiontype where type=1 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiInfectiontype> getSTIMaleInfantsInfections() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiInfectiontype> pList = null;
        try {
            pList = session.createQuery("from StiInfectiontype where type=11 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiInfectiontype> getSTIfemaleInfantsInfections() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiInfectiontype> pList = null;
        try {
            pList = session.createQuery("from StiInfectiontype where type=00 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiInfectiontype> getSTIAllInfections() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiInfectiontype> pList = null;
        try {
            pList = session.createQuery("from StiInfectiontype where type=2 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiInfectiontype> getSTIAllInfantsInfections() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiInfectiontype> pList = null;
        try {
            pList = session.createQuery("from StiInfectiontype where type=01 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIUItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%UI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIVItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%VI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTICItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%CI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIPIDtreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%PID%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIARItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%ARI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIGItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%GI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIAIItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%II%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTISItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%SI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIPFItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%PFI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIESItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%ESI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIAGWtreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%SI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTISPItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%SPI%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }

    public List<StiDrugs> getSTIIItreatments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<StiDrugs> pList = null;
        try {
            pList = session.createQuery("from StiDrugs where infectionCode like '%II%' ").list();
            return pList;
        } finally {
            session.close();
        }
    }
    public List<HtsEntrypoint> getSTIMEntrypoints() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtsEntrypoint> pList = null;
        try {
            pList = session.createQuery("from HtsEntrypoint where type= 1 or type= 0 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

            
    public List<HtsEntrypoint> getSTIFEntrypoints() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<HtsEntrypoint> pList = null;
        try {
            pList = session.createQuery("from HtsEntrypoint where type= 2 or type= 0 ").list();
            return pList;
        } finally {
            session.close();
        }
    }

}
