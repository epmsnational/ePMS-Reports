/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.Tblbaselinetests;
import com.vmmc.entities.Tblfamilyinfo;
import com.vmmc.entities.Tblfamilyrelatives;
import com.vmmc.entities.Tblmedication;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblpatientspriorexposure;
import com.vmmc.entities.Tblpatientsproblems;
import com.vmmc.entities.Tblpregnancies;
import com.vmmc.entities.Tblproblems;
import com.vmmc.entities.Tblreferralsto;
import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.TblstatusId;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.TblvisitsId;
import java.util.Date;
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author mbanol
 */
public class CompletedARTClientAll {

    public CompletedARTClientAll() {
    }

    private String patientId;
    private Date visitDate;

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public List<Tblfamilyinfo> getFamilyinfo() {
        return familyinfo;
    }

    public void setFamilyinfo(List<Tblfamilyinfo> familyinfo) {
        this.familyinfo = familyinfo;
    }
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public CompletedARTClientAll(String patientId, Date visitDate) {
        this.patientId = patientId;
        this.visitDate = visitDate;

        Session session = sessionFactory.openSession();

        try {

            String hql = "from Tblstatus where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("statusDate", visitDate);
//            String hql = "from Tblstatus status where status.id.patientId=:patientId and status.id.statusDate=:visitDate";
//            Query query = session.createQuery(hql);
            List<Tblstatus> pList = query.list();
            status = pList;

        } catch (Exception ex) {
            ex.toString();
        } finally {
            session.clear();
        }
        //Session sessService = sessionFactory.openSession();

        try {

            String hql = "from Tbltests tes where tblpatients.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("visitDate", visitDate);
            List<Tbltests> pList = query.list();
            tests = pList;
        } finally {
            session.clear();
        }
       

        try {

            String hql = "from Tblvisits where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("visitDate", visitDate);
            List<Tblvisits> pList = query.list();
            visits = pList;
        } finally {
            session.clear();
        }
       

        try {
            String hql = "from Tblreferralsto where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("visitDate", visitDate);
            List<Tblreferralsto> pList = query.list();
            referredto = pList;
        } finally {
            session.clear();
        }
       

        try {
            String hql = "from Tblproblems  where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("visitDate", visitDate);
            List<Tblproblems> pList = query.list();
            problems = pList;
        } finally {
            session.clear();
        }
       
        try {
            String hql = "from Patient  where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("visitDate", visitDate);
            List<Patient> pList = query.list();
            patient = pList;
        } finally {
            session.clear();
        }

        try {
            String hql = "from Tblpregnancies  where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpregnancies> pList = query.list();
            pregnancies = pList;
        } finally {
            session.clear();
        }
        //Session sessReasons = sessionFactory.openSession();

//        try {
//            String hql = "from Tblproblems probs where probs.id.patientId=:patientId and probs.id.visitDate=:visitDate";
//            Query query = session.createQuery(hql);
//            query.setString("patientId", patientId);
//            List<Tblproblems> pList = query.list();
//            problems = pList;
//        } finally {
//            session.clear();
//        }
        try {
            String hql = "from Tblpatientsproblems where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatientsproblems> pList = query.list();
            patientsproblems = pList;
        } finally {
            session.clear();
        }

        //Session sessCircumMethod = sessionFactory.openSession();
        try {
            String hql = "from Tblpatientspriorexposure where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatientspriorexposure> pList = query.list();
            priorexposure = pList;
        } finally {
            session.clear();
        }
          try {
            String hql = "from Tblpatients where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatients> pList = query.list();
            patients = pList;
        } finally {
            session.clear();
        }
       try {
            String hql = "from Tblmedication where id.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate("visitDate", visitDate);
            List<Tblmedication> pList = query.list();
            medication = pList;
        } finally {
            session.clear();
        }

        try {
            String hql = "from Tblfamilyinfo where tblpatients.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblfamilyinfo> pList = query.list();
            familyinfo = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from Tblappointments where id.patientId=:patientId ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            // query.setDate("visitDate", visitDate);
            List<Tblappointments> pList = query.list();
            appointments = pList;
        } finally {
            session.clear();
        }

        try {
            String hql = "from Tblbaselinetests where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblbaselinetests> pList = query.list();
            baselinetests = pList;
        } finally {
            session.clear();
        }
        session.close();

    }

    public CompletedARTClientAll(String patientId) {
        this.patientId = patientId;

        Session session = sessionFactory.openSession();

        try {

            //String hql = "from Tblstatus status where status.id.patientId=:patientId and status.id.statusDate=:visitDate ";
            // Query query = session.createQuery(hql);
            //query.setString("patientId", patientId);
            String hql = "from Tblstatus status where status.id.patientId=:patientId ORDER by id.statusDate DESC";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblstatus> pList = query.list();
            status = pList;

        } catch (Exception ex) {
            ex.toString();
        } finally {
            session.clear();
        }
        //Session sessService = sessionFactory.openSession();

        try {

            String hql = "from Tbltests where tblpatients.patientId=:patientId ORDER by testDate DESC";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tbltests> pList = query.list();
            tests = pList;
        } finally {
            session.clear();
        }
        //Session sessReferredfrom = sessionFactory.openSession();

        try {

            String hql = "from Tblvisits visit where visit.id.patientId=:patientId ORDER BY id.visitDate DESC ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblvisits> pList = query.list();
            visits = pList;
        } finally {
            session.clear();
        }
        // Session sessGenCon = sessionFactory.openSession();

//        try {
//            String hql = "from Tblreferralsto ref where ref.id.patientId=:patientId ORDER BY id.visitDate DESC ";
//            Query query = session.createQuery(hql);
//            query.setString("patientId", patientId);
//            List<Tblreferralsto> pList = query.list();
//            referredto = pList;
//        } finally {
//            session.clear();
//        }
//        //Session sessComp = sessionFactory.openSession();
//
        try {
            String hql = "from Tblproblems prob where prob.id.patientId=:patientId ORDER BY id.visitDate DESC ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblproblems> pList = query.list();
            problems = pList;
        } finally {
            session.clear();
        }
//        // Session sessGenExam = sessionFactory.openSession();
//
        try {
            String hql = "from Tblpregnancies preg where preg.id.patientId=:patientId ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpregnancies> pList = query.list();
            pregnancies = pList;
        } finally {
            session.clear();
        }
//
        try {
            String hql = "from Tblpatientsproblems where id.patientId=:patientId ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatientsproblems> pList = query.list();
            patientsproblems = pList;
        } finally {
            session.clear();
        }
//
//        //Session sessCircumMethod = sessionFactory.openSession();
        try {
            String hql = "from Tblpatientspriorexposure where id.patientId=:patientId ORDER BY dateStarted DESC";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatientspriorexposure> pList = query.list();
            priorexposure = pList;
        } finally {
            session.clear();
        }
        //Session sessMedScreening = sessionFactory.openSession();

        try {
            String hql = "from Tblpatients where patientId=:patientId ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatients> pList = query.list();
            patients = pList;
        } finally {
            session.clear();
        }
        // Session sessVplans = sessionFactory.openSession();

//        try {
//            String hql = "from Tblmedication where id.patientId=:patientId ORDER BY id.visitDate ";
//            Query query = session.createQuery(hql);
//            query.setString("patientId", patientId);
//            List<Tblmedication> pList = query.list();
//            medication = pList;
//        } finally {
//            session.clear();
//        }
//
        try {
            String hql = "from Tblfamilyinfo where tblpatients.patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblfamilyinfo> pList = query.list();
            familyinfo = pList;
        } finally {
            session.clear();
        }
        try {
            String hql = "from Tblappointments  where id.patientId=:patientId ORDER BY dateAppointmentGiven";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblappointments> pList = query.list();
            appointments = pList;
        } finally {
            session.clear();
        }
//
        try {
            String hql = "from Tblbaselinetests where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            //query.setDate(1, visitDate);
            List<Tblbaselinetests> pList = query.list();
            baselinetests = pList;
        } finally {
            session.clear();
        }
//
        try {
            String hql = "from Tblsetuparvfixeddosecombinations";
            Query query = session.createQuery(hql);
//            query.setString("patientId", patientId);
            //query.setDate(1, visitDate);
            List<Tblsetuparvfixeddosecombinations> pList = query.list();
            arvfixeddosecombinations = pList;
        } finally {
            session.clear();
        }
      session.close();
    }
    private Patient p;
    private List<Patient> patient;
    private List<Tblstatus> status;
    private List<Tbltests> tests;
    private List<Tblvisits> visits;
    private List<Tblreferralsto> referredto;
    private List<Tblproblems> problems;
    private List<Tblpregnancies> pregnancies;
    private List<Tblpatientsproblems> patientsproblems;
    private List<Tblpatientspriorexposure> priorexposure;
    private List<Tblpatients> patients;
    private List<Tblmedication> medication;
    private List<Tblfamilyinfo> familyinfo;
    private List<Tblfamilyrelatives> familyrelatives;
    private List<Tblappointments> appointments;
    private List<Tblbaselinetests> baselinetests;
    private List<Tblsetuparvfixeddosecombinations> arvfixeddosecombinations;

    public List<Tblsetuparvfixeddosecombinations> getArvfixeddosecombinations() {
        return arvfixeddosecombinations;
    }

    public void setArvfixeddosecombinations(List<Tblsetuparvfixeddosecombinations> arvfixeddosecombinations) {
        this.arvfixeddosecombinations = arvfixeddosecombinations;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public List<Tblstatus> getStatus() {
        return status;
    }

    public void setStatus(List<Tblstatus> status) {
        this.status = status;
    }

    public List<Tbltests> getTests() {
        return tests;
    }
    public List<Patient> getPatient() {
        return patient;
    }
    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public void setTests(List<Tbltests> tests) {
        this.tests = tests;
    }

    public List<Tblvisits> getVisits() {

        return visits;
    }

    public void setVisits(List<Tblvisits> visits) {
        this.visits = visits;
    }

    public List<Tblreferralsto> getReferredto() {
        return referredto;
    }

    public void setReferredto(List<Tblreferralsto> referredto) {
        this.referredto = referredto;
    }

    public List<Tblproblems> getProblems() {
        return problems;
    }

    public void setProblems(List<Tblproblems> problems) {
        this.problems = problems;
    }

    public List<Tblpregnancies> getPregnancies() {
        return pregnancies;
    }

    public void setPregnancies(List<Tblpregnancies> pregnancies) {
        this.pregnancies = pregnancies;
    }

    public List<Tblpatientsproblems> getPatientsproblems() {
        return patientsproblems;
    }

    public void setPatientsproblems(List<Tblpatientsproblems> patientsproblems) {
        this.patientsproblems = patientsproblems;
    }

    public List<Tblpatientspriorexposure> getPriorexposure() {
        return priorexposure;
    }

    public void setPriorexposure(List<Tblpatientspriorexposure> priorexposure) {
        this.priorexposure = priorexposure;
    }

    public List<Tblpatients> getPatients() {
        return patients;
    }

    public void setPatients(List<Tblpatients> patients) {
        this.patients = patients;
    }

    public List<Tblmedication> getMedication() {
        return medication;
    }

    public void setMedication(List<Tblmedication> medication) {
        this.medication = medication;
    }

    public List<Tblfamilyinfo> getFamilyinfor() {
        return familyinfo;
    }

    public void setFamilyinfor(List<Tblfamilyinfo> familyinfo) {
        this.familyinfo = familyinfo;
    }

    public List<Tblfamilyrelatives> getFamilyrelatives() {
        return familyrelatives;
    }

    public void setFamilyrelatives(List<Tblfamilyrelatives> familyrelatives) {
        this.familyrelatives = familyrelatives;
    }

    public List<Tblappointments> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Tblappointments> appointments) {
        this.appointments = appointments;
    }

    public List<Tblbaselinetests> getBaselinetests() {
        return baselinetests;
    }

    public void setBaselinetests(List<Tblbaselinetests> baselinetests) {
        this.baselinetests = baselinetests;
    }

}
