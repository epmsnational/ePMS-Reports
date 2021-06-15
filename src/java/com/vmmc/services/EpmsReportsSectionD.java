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
            String sql = "Select a.PatientID, a.DateOfBirth, a.Sex, b.VisitDate, b.WHOStage,c.Status, d.DrugTypeID,e.ARVStatusDescription "
                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblstatus c ON b.PatientID = c.PatientID"
                    + " JOIN tblmedication d ON c.PatientID = d.PatientID JOIN tblsetuparvstatuscodes e ON b.ARVStatusCode = e.ARVStatusCode "
                    + "AND b.VisitDate = (Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            Map<String, Object> row = new HashMap<>();
            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                String defaultValue = "0";
                row = null_vals(rows, defaultValue);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(row);
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
            String sql = "Select a.PatientID, a.DateOfBirth, a.Sex, b.VisitDate, b.WHOStage,c.Status, d.DrugTypeID,e.ARVStatusDescription "
                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblstatus c ON b.PatientID = c.PatientID"
                    + " JOIN tblmedication d ON c.PatientID = d.PatientID JOIN tblsetuparvstatuscodes e ON b.ARVStatusCode = e.ARVStatusCode "
                    + "AND b.VisitDate = (Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID Having count(*) = 1";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            Map<String, Object> row = new HashMap<>();
            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                String defaultValue = "0";
                row = null_vals(rows, defaultValue);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(row);
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth, b.VisitDate, b.ProblemAcronym, c.DrugTypeID, d.AdverseEventsStatusCode, e.Status "
                    + "FROM tblpatients a JOIN tblproblems b ON a.PatientID = b.PatientID JOIN tblmedication c ON a.PatientID = c.PatientID "
                    + "JOIN tblvisits d ON a.PatientID = d.PatientID JOIN tblstatus e ON a.PatientID = e.PatientID AND b.VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.TestTypeID,b.TestDate,b.ResultDate,b.ResultNumeric,b.RecievedDate "
                    + "FROM tblpatients a JOIN tbltests b ON a.PatientID = b.PatientID where b.ResultNumeric is not null group by a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,b.ARVStatusCode,c.RegimenType,d.Status FROM tblpatients a"
                    + " JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
                    + "JOIN tblstatus d ON a.PatientID = d.PatientID WHERE b.ARVStatusCode = 4 AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID)";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,c.RegimenType, d.Status, e.TestDate,e.ResultDate,e.RecievedDate,"
                    + "e.ResultNumeric FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
                    + "JOIN tblstatus d ON a.PatientID = d.PatientID JOIN tbltests e ON a.PatientID = e.PatientID WHERE e.ResultNumeric is not null AND b.ARVStatusCode = 2 "
                    + "AND e.TestTypeID = \"CD4\" AND VisitDate = (Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID)";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.ARVReasonCode,c.RegimenType, d.Status "
                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
                    + "JOIN tblstatus d ON a.PatientID = d.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID";
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
            String sql = "Select a.PatientID, a.DateOfBirth, a.Sex, a.TransferInId, a.ReferredFromID, a.ReferredFromNotes, b.VisitDate, c.RegimenType "
                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVcode "
                    + "WHERE a.TransferInId IN('AR','CR') AND VisitDate = (Select min(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) "
                    + "GROUP BY a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,b.ARVStatusCode,c.RegimenType,b.ARVReasonCode, d.Status "
                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
                    + "JOIN tblstatus d ON a.PatientID = d.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) group by a.PatientID Having Count(*) = 1";
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
            String sql = "Select a.PatientID, a.Sex, a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.AdverseEventsStatusCode,c.RegimenType, d.Status "
                    + "FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations c ON b.ARVCode = c.ARVCode "
                    + "JOIN tblstatus d ON a.PatientID = d.PatientID WHERE a.DateOfDeath is null AND b.AdverseEventsStatusCode is not null AND VisitDate = "
                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID)";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(rows);
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
