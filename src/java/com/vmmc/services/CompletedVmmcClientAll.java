/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.PatientDiagnosis;
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
import com.vmmc.entities.VmmcService;
import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import com.vmmc.entities.VmmcVisits;
import com.vmmc.entities.Vmmcservicetype;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Trevor
 */
public class CompletedVmmcClientAll {

    public CompletedVmmcClientAll() {
    }

    private String vmmcid;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public CompletedVmmcClientAll(String vmmcid) {
        this.vmmcid = vmmcid;

        Session session = sessionFactory.openSession();

        try {

            String hql ="from PatientDiagnosis where VMMCID=:vmmcid";
             Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<PatientDiagnosis> pList = query.list();
            pd = pList;
        } catch (Exception ex) {
            ex.toString();
        } finally {
            session.clear();
        }
        //Session sessService = sessionFactory.openSession();

        try {

            String hql = "from VmmcService where VMMCID=:vmmcid";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcService> pList = query.list();
            vs = pList;
        } finally {
            session.clear();
        }
        //Session sessReferredfrom = sessionFactory.openSession();

        try {
            String hql = "from VmmcReferredfrom where VMMCID=:vmmcid";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcReferredfrom> pList = query.list();
            vff = pList;
        } finally {
            session.clear();
        }
        // Session sessGenCon = sessionFactory.openSession();

        try {
            String hql = "from VmmcGeneralcondition where VMMCID=:vmmcid";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcGeneralcondition> pList = query.list();

            vgc = pList;
        } finally {
            session.clear();
        }
        //Session sessComp = sessionFactory.openSession();

        try {
            String hql = "from VmmcComplaints where VMMCID=:vmmcid";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcComplaints> pList = query.list();

            vc = pList;
        } finally {
            session.clear();
        }
        // Session sessGenExam = sessionFactory.openSession();

        try {
            String hql = "from VmmcGenitalexam where VMMCID=:vmmcid";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcGenitalexam> pList = query.list();

            vge = pList;
        } finally {
            session.clear();
        }
        //Session sessReasons = sessionFactory.openSession();

        try {
            String hql = "from VmmcCircumcisionreason where VMMCID=:vmmcid";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcCircumcisionreason> pList = query.list();
            vcr = pList;
        } finally {
            session.clear();
        }

        //Session sessCircumMethod = sessionFactory.openSession();
        try {
            String hql = "from VmmcCircumcisionmethod where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcCircumcisionmethod> pList = query.list();
            vcm = pList;
        } finally {
            session.clear();
        }
        //Session sessMedScreening = sessionFactory.openSession();

        try {
            String hql = "from VmmcMedicalscreening where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcMedicalscreening> pList = query.list();
            vms = pList;
        } finally {
            session.clear();
        }
        // Session sessVplans = sessionFactory.openSession();

        try {
            String hql = "from Visitplans where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<Visitplans> pList = query.list();
            visitPlans = pList;
        } finally {
            session.clear();
        }

        try {
            String hql = "from VmmcAdverseevents where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcAdverseevents> pList = query.list();
            vmmcAdEvents = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcAdverseevents where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcAdverseeventtype> pList = query.list();
            vmmcAdEventType = pList;
        } finally {
            session.clear();
        }

        try {
            String hql = "from VmmcCircumcisionprocedure where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcCircumcisionprocedure> pList = query.list();
            vmmcCircumProcedure = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcPostprocedureassessment where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcPostprocedureassessment> pList = query.list();
            vmmcPostProcAssessment = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcPrepexmalecircumcision where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcPrepexmalecircumcision> pList = query.list();
            vmmcPrepexCircumcision = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcRiskreductionplan where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcRiskreductionplan> pList = query.list();
            vmmcRiskreductionPlan = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcSurgicalmalecircumcision where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcSurgicalmalecircumcision> pList = query.list();
            vmmcSurgicalCircum = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcVisits where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<VmmcVisits> pList = query.list();
            vmmcVisits = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from VmmcService where vmmcId=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            List<Vmmcservicetype> pList = query.list();
            vmmcServiceType = pList;
        } finally {
            session.clear();
        }
        session.close();
    }

    private Patient p;
    private List<VmmcService> vs;
    private List<VmmcReferredfrom> vff;
    private List<VmmcCircumcisionreason> vcr;
    private List<VmmcMedicalscreening> vms;
    private List<PatientDiagnosis> pd;
    private List<VmmcGeneralcondition> vgc;
    private List<VmmcComplaints> vc;
    private List<VmmcGenitalexam> vge;
    private List< VmmcCircumcisionmethod> vcm;
    private List<Visitplans> visitPlans;

    private List<VmmcAdverseevents> vmmcAdEvents;
    private List<VmmcAdverseeventtype> vmmcAdEventType;
    private List<VmmcCircumcisionprocedure> vmmcCircumProcedure;
    private List<VmmcPostprocedureassessment> vmmcPostProcAssessment;
    private List<VmmcPrepexmalecircumcision> vmmcPrepexCircumcision;
    private List<VmmcRiskreductionplan> vmmcRiskreductionPlan;
    private List<VmmcSurgicalmalecircumcision> vmmcSurgicalCircum;
    private List<VmmcVisits> vmmcVisits;
    private List<Vmmcservicetype> vmmcServiceType;

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

    public List<VmmcCircumcisionprocedure> getVmmcCircumProcedure() {
        return vmmcCircumProcedure;
    }

    public void setVmmcCircumProcedure(List<VmmcCircumcisionprocedure> vmmcCircumProcedure) {
        this.vmmcCircumProcedure = vmmcCircumProcedure;
    }

    public List<VmmcPostprocedureassessment> getVmmcPostProcAssessment() {
        return vmmcPostProcAssessment;
    }

    public void setVmmcPostProcAssessment(List<VmmcPostprocedureassessment> vmmcPostProcAssessment) {
        this.vmmcPostProcAssessment = vmmcPostProcAssessment;
    }

    public List<VmmcPrepexmalecircumcision> getVmmcPrepexCircumcision() {
        return vmmcPrepexCircumcision;
    }

    public void setVmmcPrepexCircumcision(List<VmmcPrepexmalecircumcision> vmmcPrepexCircumcision) {
        this.vmmcPrepexCircumcision = vmmcPrepexCircumcision;
    }

    public List<VmmcRiskreductionplan> getVmmcRiskreductionPlan() {
        return vmmcRiskreductionPlan;
    }

    public void setVmmcRiskreductionPlan(List<VmmcRiskreductionplan> vmmcRiskreductionPlan) {
        this.vmmcRiskreductionPlan = vmmcRiskreductionPlan;
    }

    public List<VmmcSurgicalmalecircumcision> getVmmcSurgicalCircum() {
        return vmmcSurgicalCircum;
    }

    public void setVmmcSurgicalCircum(List<VmmcSurgicalmalecircumcision> vmmcSurgicalCircum) {
        this.vmmcSurgicalCircum = vmmcSurgicalCircum;
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

    public List<Visitplans> getVisitPlans() {
        return visitPlans;
    }

    public void setVisitPlans(List<Visitplans> visitPlans) {
        this.visitPlans = visitPlans;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public List<VmmcService> getVs() {
        return vs;
    }

    public void setVs(List<VmmcService> vs) {
        this.vs = vs;
    }

    public List<VmmcReferredfrom> getVff() {
        return vff;
    }

    public void setVff(List<VmmcReferredfrom> vff) {
        this.vff = vff;
    }

    public List<VmmcCircumcisionreason> getVcr() {
        return vcr;
    }

    public void setVcr(List<VmmcCircumcisionreason> vcr) {
        this.vcr = vcr;
    }

    public List<VmmcMedicalscreening> getVms() {
        return vms;
    }

    public List<VmmcCircumcisionmethod> getVcm() {
        return vcm;
    }

    public List<PatientDiagnosis> getPd() {
        return pd;
    }

    public void setPd(List<PatientDiagnosis> pd) {
        this.pd = pd;
    }

    public List<VmmcGeneralcondition> getVgc() {
        return vgc;
    }

    public void setVgc(List<VmmcGeneralcondition> vgc) {
        this.vgc = vgc;
    }

    public List<VmmcComplaints> getVc() {
        return vc;
    }

    public void setVc(List<VmmcComplaints> vc) {
        this.vc = vc;
    }

    public List<VmmcGenitalexam> getVge() {
        return vge;
    }

    public void setVge(List<VmmcGenitalexam> vge) {
        this.vge = vge;
    }

}
