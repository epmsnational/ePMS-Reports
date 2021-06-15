/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.vmmc.entities.OpportunityInfectionAndArtTherapy;
import com.vmmc.entities.HivTbCollaboration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ignatious
 */
public class EpmsReportsSectionC {

    public List<HivTbCollaboration> getHivTbCollaboration() {
        List<HivTbCollaboration> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
                    + "tblstatus c ON a.PatientID = c.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID";
//            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
//                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
//                    + "tblstatus c ON a.PatientID = c.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
//                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) AND (YEAR(NOW()) - YEAR(`DateOfBirth`)) > 35 group by a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            //query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                HivTbCollaboration report = gson.fromJson(jsonElement, HivTbCollaboration.class);

                reportData.add(report);

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reportData;
    }
    
    public List<HivTbCollaboration> getHivTbCollaborationLastVisit() {
        List<HivTbCollaboration> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
                    + "tblstatus c ON a.PatientID = c.PatientID WHERE a.DateOfDeath is null AND b.VisitDate = (SELECT VisitDate FROM ( SELECT t.*, "
                    + "ROW_NUMBER() OVER(ORDER BY VisitDate) AS RowNumber FROM tblvisits t ) AS tmp WHERE RowNumber = 2 AND a.PatientID = PatientID)";
//            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
//                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
//                    + "tblstatus c ON a.PatientID = c.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
//                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) AND (YEAR(NOW()) - YEAR(`DateOfBirth`)) > 35 group by a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            //query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                HivTbCollaboration report = gson.fromJson(jsonElement, HivTbCollaboration.class);

                reportData.add(report);

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reportData;
    }

    public List<HivTbCollaboration> getHivTbCollaborationC10to13() {
        List<HivTbCollaboration> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
                    + "tblstatus c ON a.PatientID = c.PatientID WHERE b.IPTReasonCode IN(1,2,3,4,5,6,7,8,9,10,11) AND a.DateOfDeath is null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID,b.IPTReasonCode";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            //query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                HivTbCollaboration report = gson.fromJson(jsonElement, HivTbCollaboration.class);

                reportData.add(report);

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reportData;
    }

    public List<HivTbCollaboration> getHivTbCollaborationTbInvestgation() {
        List<HivTbCollaboration> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
                    + "tblstatus c ON a.PatientID = c.PatientID WHERE b.TBInvestigationResults IN(1,2,3,4,5) AND a.DateOfDeath is null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID,b.TBInvestigationResults";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            //query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                HivTbCollaboration report = gson.fromJson(jsonElement, HivTbCollaboration.class);

                reportData.add(report);

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reportData;
    }

    public List<HivTbCollaboration> getHivTbCollaborationTbStatus() {
        List<HivTbCollaboration> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
                    + "tblstatus c ON a.PatientID = c.PatientID WHERE b.TBStatusCode IN('NO','ON','S','Y') AND a.DateOfDeath is null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID,b.TBStatusCode";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            //query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                HivTbCollaboration report = gson.fromJson(jsonElement, HivTbCollaboration.class);

                reportData.add(report);

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reportData;
    }

    public List<HivTbCollaboration> getHivTbCollaborationTptStatus() {
        List<HivTbCollaboration> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
                    + "tblstatus c ON a.PatientID = c.PatientID WHERE b.IPTStatusCode IN('CI','HPI','IC','II','INI','IS','N/A','NE','RI') OR b.TBInvestigationResults "
                    + "IN(1,2,3,4,5) AND (a.DateOfDeath is null AND VisitDate = (Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID)) group by "
                    + "a.PatientID,b.IPTStatusCode,b.TBInvestigationResults";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            //query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                HivTbCollaboration report = gson.fromJson(jsonElement, HivTbCollaboration.class);

                reportData.add(report);

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reportData;
    }

    public void getData() {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.firstSession,b.firstSessionDate,b.secondSession,b.secondSessionDate,c.TestDate,"
                    + "c.ResultDate,c.ResultNumeric FROM  tblpatients a JOIN highviralload b on a.PatientID = b.PatientID JOIN tbltests c ON "
                    + "b.PatientID = c.PatientID WHERE b.repeatedVlDate = c.TestDate AND b.PatientID = c.PatientID group by a.PatientID";

            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            Map<String, Object> row = new HashMap<>();
            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

//                String defaultValue = "0000-00-00 00:00:00.0";
//                row = null_vals(rows, defaultValue);
                //System.out.print(rows);
                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                System.out.print(jsonElement);
//                OpportunityInfectionAndArtTherapy report = gson.fromJson(jsonElement, OpportunityInfectionAndArtTherapy.class);

//                System.out.print("PatientID: " + report.getPatientID());
//                System.out.print(", VisitDate: " + report.getVisitDate());
//                System.out.print(", DateOfBirth: " + report.getDateOfBirth() + "\n");
//                System.out.print(", Status: " + report.getStatus());
//                System.out.print("Sex: " + report.getSex());
//                System.out.print(", Drug Type ID: " + report.getDrugTypeID());
//                System.out.print(", ARVStatusDescription: " + report.getARVStatusDescription());
//                System.out.print("WHO Stage: " + report.getWHOStage());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public <T, K> Map<K, T> null_vals(Map<K, T> my_map, T def_val) {
        my_map = my_map.entrySet().stream().map(entry -> {
            if (entry.getValue() == null) {
                entry.setValue(def_val);
            }
            return entry;
        })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return my_map;
    }

}
