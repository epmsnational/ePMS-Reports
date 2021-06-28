/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.vmmc.entities.ArtSummary;
import com.vmmc.entities.ArtSummaryAdverseEvents;
import com.vmmc.entities.EnhancedAdherenceCounselling;
import com.vmmc.entities.LaboratoryServicesArvSwitch;
import com.vmmc.entities.LaboratoryServicesCdFourCount;
import com.vmmc.entities.LaboratoryServicesTests;
import com.vmmc.entities.OpportunityInfectionAndArtTherapy;
import com.vmmc.entities.OpportunityInfectionAndArtTherapyCryptoccocalStatus;
import com.vmmc.entities.PatientsTransferIn;
import com.vmmc.entities.PatientsTransferInVisit;
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
public class EpmsReportsSectionD {

    public List<OpportunityInfectionAndArtTherapy> getTreatmentAndProphylaxis() {
        List<OpportunityInfectionAndArtTherapy> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId, a.dateOfBirth, a.sex, b.id.visitDate, b.whostage,c.status, d.id.drugTypeId,e.arvstatusDescription"
                    + " FROM Tblpatients a,Tblvisits b,Tblstatus c,Tblmedication d,Tblsetuparvstatuscodes e WHERE a.id.patientId = b.id.patientId "
                    + "AND b.id.patientId = c.id.patientId AND c.id.patientId = d.id.patientId AND b.arvstatusCode = e.arvstatusCode group by a.id.patientId";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("WHOStage", object[4]);
                map.put("Status", object[5]);
                map.put("DrugTypeID", object[6]);
                map.put("ARVStatusDescription", object[7]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                OpportunityInfectionAndArtTherapy report = gson.fromJson(jsonElement, OpportunityInfectionAndArtTherapy.class);

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

    public List<OpportunityInfectionAndArtTherapy> getTreatmentAndProphylaxisNewly() {
        List<OpportunityInfectionAndArtTherapy> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId, a.dateOfBirth, a.sex, b.id.visitDate, b.whostage,c.status, d.id.drugTypeId,e.arvstatusDescription FROM Tblpatients a,"
                    + "Tblvisits b,Tblstatus c,Tblmedication d,Tblsetuparvstatuscodes e WHERE e.arvstatusDescription = \'Start ARV\' AND a.id.patientId = b.id.patientId"
                    + " AND b.id.patientId = c.id.patientId AND c.id.patientId = d.id.patientId AND b.arvstatusCode = e.arvstatusCode group by a.id.patientId";
            
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("WHOStage", object[4]);
                map.put("Status", object[5]);
                map.put("DrugTypeID", object[6]);
                map.put("ARVStatusDescription", object[7]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                OpportunityInfectionAndArtTherapy report = gson.fromJson(jsonElement, OpportunityInfectionAndArtTherapy.class);

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

    public List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> getOpportunityInfectionAndArtTherapyCryptoccocalStatus() {
        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId,a.dateOfBirth, a.sex, b.id.visitDate, b.id.problemAcronym, c.id.drugTypeId, d.adverseEventsStatusCode,"
                    + " e.status FROM Tblpatients a,Tblproblems b,Tblmedication c,Tblvisits d,Tblstatus e WHERE a.id.patientId = b.id.patientId AND"
                    + " a.id.patientId = c.id.patientId AND a.id.patientId = d.id.patientId AND a.id.patientId = e.id.patientId group by a.id.patientId";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ProblemAcronym", object[4]);
                map.put("DrugTypeID", object[5]);
                map.put("AdverseEventsStatusCode", object[6]);
                map.put("Status", object[7]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                OpportunityInfectionAndArtTherapyCryptoccocalStatus report = gson.fromJson(jsonElement, OpportunityInfectionAndArtTherapyCryptoccocalStatus.class);

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

    public List<LaboratoryServicesTests> getLaboratoryServicesTests() {
        List<LaboratoryServicesTests> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId,a.dateOfBirth,a.sex,b.testTypeId,b.testDate,b.resultDate,b.resultNumeric,b.recievedDate "
                    + "FROM Tblpatients a,Tbltests b WHERE a.id.patientId = b.tblpatients.patientId AND b.resultNumeric is not null group by a.id.patientId";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("TestTypeID", object[3]);
                map.put("TestDate", object[4]);
                map.put("ResultDate", object[5]);
                map.put("ResultNumeric", object[6]);
                map.put("ReceivedDate", object[7]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                LaboratoryServicesTests report = gson.fromJson(jsonElement, LaboratoryServicesTests.class);

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

    public List<LaboratoryServicesArvSwitch> getLaboratoryServicesArvSwitch() {
        List<LaboratoryServicesArvSwitch> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId,a.dateOfBirth, a.sex,b.id.visitDate,b.arvstatusCode,c.regimenType,d.status FROM Tblpatients a, Tblvisits b, "
                    + "Tblsetuparvfixeddosecombinations c, Tblstatus d WHERE a.id.patientId = b.id.patientId AND b.arvcode = c.arvcode AND a.id.patientId = d.id.patientId"
                    + " AND b.arvstatusCode = 4 group by a.id.patientId";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("RegimenType", object[5]);
                map.put("Status", object[6]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                LaboratoryServicesArvSwitch report = gson.fromJson(jsonElement, LaboratoryServicesArvSwitch.class);

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

    public List<LaboratoryServicesCdFourCount> getLaboratoryServicesCdFourCount() {
        List<LaboratoryServicesCdFourCount> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId,a.dateOfBirth,a.sex,b.id.visitDate,c.regimenType,d.status, e.testDate,e.resultDate,e.resultNumeric,e.recievedDate FROM "
                    + "Tblpatients a, Tblvisits b, Tblsetuparvfixeddosecombinations c, Tblstatus d, Tbltests e WHERE a.id.patientId = b.id.patientId AND b.arvcode = c.arvcode"
                    + " AND a.id.patientId = d.id.patientId AND a.id.patientId = e.tblpatients.patientId AND e.resultNumeric is not null AND b.arvstatusCode = 2 AND e.testTypeId = \'CD4\' "
                    + "group by a.id.patientId,b.id.visitDate";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("RegimenType", object[4]);
                map.put("Status", object[5]);
                map.put("Testdate", object[6]);
                map.put("ResultDate", object[7]);
                map.put("ResultNumeric", object[8]);
                map.put("ReceivedDate", object[9]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                LaboratoryServicesCdFourCount report = gson.fromJson(jsonElement, LaboratoryServicesCdFourCount.class);

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

    public List<ArtSummary> getArtSummary() {
        List<ArtSummary> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId, a.dateOfBirth, a.sex,b.id.visitDate,b.arvstatusCode,b.arvreasonCode,b.whostage,c.regimenType, d.status FROM Tblpatients a, "
                    + "Tblvisits b, Tblsetuparvfixeddosecombinations c, Tblstatus d  WHERE a.id.patientId = b.id.patientId AND b.arvcode = c.arvcode AND "
                    + "a.id.patientId = d.id.patientId AND a.dateOfDeath is null group by a.id.patientId";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("ARVReasonCode", object[5]);
                map.put("WHOStage", object[6]);
                map.put("RegimenType", object[7]);
                map.put("Status", object[8]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                ArtSummary report = gson.fromJson(jsonElement, ArtSummary.class);

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

    public List<PatientsTransferIn> getPatientsTransferIn() {
        List<PatientsTransferIn> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.PatientID, a.DateOfBirth, a.Sex, a.TransferInId, a.ReferredFromID, a.ReferredFromNotes,a.TheTimeStamp "
                    + "FROM tblpatients a WHERE a.TransferInId IN('AR','CR')";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                PatientsTransferIn report = gson.fromJson(jsonElement, PatientsTransferIn.class);

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

    public List<PatientsTransferInVisit> getPatientsTransferInVisit() {
        List<PatientsTransferInVisit> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId, a.dateOfBirth, a.sex, a.transferInId, a.referredFromId, a.referredFromNotes, b.id.visitDate, c.regimenType FROM Tblpatients a, "
                    + "Tblvisits b, Tblsetuparvfixeddosecombinations c WHERE a.id.patientId = b.id.patientId AND b.arvcode = c.arvcode AND a.transferInId IN('AR','CR') "
                    + "GROUP BY a.id.patientId";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("TransferInId", object[3]);
                map.put("ReferredFromID", object[4]);
                map.put("ReferredFromNotes", object[5]);
                map.put("VisitDate", object[6]);
                map.put("RegimenType", object[7]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                PatientsTransferInVisit report = gson.fromJson(jsonElement, PatientsTransferInVisit.class);

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

    public List<ArtSummary> getArtSummaryNewly() {
        List<ArtSummary> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
//            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,b.ARVStatusCode,c.RegimenType,b.ARVReasonCode, d.Status "
//                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
//                    + "JOIN tblstatus d ON a.PatientID = d.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
//                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID Having Count(*) = 1";
            String sql ="Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.WHOStage,c.RegimenType,b.ARVReasonCode, d.Status,COUNT(*) "
                    + "AS cnt FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
                    + "JOIN tblstatus d ON a.PatientID = d.PatientID WHERE a.DateOfDeath is null GROUP BY a.PatientID  HAVING cnt = 1";
            
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
                ArtSummary report = gson.fromJson(jsonElement, ArtSummary.class);

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

    public List<ArtSummaryAdverseEvents> getArtSummaryAdverseEvents() {
        List<ArtSummaryAdverseEvents> reportData = new ArrayList<>();
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.id.patientId,a.dateOfBirth, a.sex,b.id.visitDate,b.arvstatusCode,b.adverseEventsStatusCode,c.regimenType, d.status FROM Tblpatients a,"
                    + "Tblvisits b, Tblsetuparvfixeddosecombinations c, Tblstatus d  WHERE a.id.patientId = b.id.patientId AND b.arvcode = c.arvcode AND a.id.patientId = d.id.patientId "
                    + "AND a.dateOfDeath is null AND b.adverseEventsStatusCode is not null";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();
                
                map.put("PatientID", object[0]);
                map.put("DateOfBirth", object[1]);
                map.put("Sex", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("AdverseEventsStatusCode", object[5]);
                map.put("RegimenType", object[6]);
                map.put("Status", object[7]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
                ArtSummaryAdverseEvents report = gson.fromJson(jsonElement, ArtSummaryAdverseEvents.class);

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

    public List<EnhancedAdherenceCounselling> getEnhancedAdherenceCounselling() {
        List<EnhancedAdherenceCounselling> reportData = new ArrayList<>();
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
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                JsonElement jsonElement = gson.toJsonTree(rows);
                EnhancedAdherenceCounselling report = gson.fromJson(jsonElement, EnhancedAdherenceCounselling.class);
                
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
