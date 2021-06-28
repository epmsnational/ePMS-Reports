/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.vmmc.entities.HivTbCollaboration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.hibernate.HibernateException;
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
            String sql = "Select a.id.patientId,a.sex,a.dateOfBirth,max(b.id.visitDate),b.arvstatusCode,b.tbinvestigationResults,b.isIpteligibility,b.iptstatusCode,"
                    + " b.tbstatusCode,b.iptreasonCode,b.typeOfTpt,c.status FROM Tblpatients a, Tblvisits b, Tblstatus c WHERE a.id.patientId = b.id.patientId "
                    + "AND a.id.patientId = c.id.patientId AND a.dateOfDeath is null group by a.id.patientId";

            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();

                map.put("PatientID", object[0]);
                map.put("Sex", object[1]);
                map.put("DateOfBirth", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("TBInvestigationResults", object[5]);
                map.put("IsIPTEligibility", object[6]);
                map.put("IPTStatusCode", object[7]);
                map.put("TBStatusCode", object[8]);
                map.put("IPTReasonCode", object[9]);
                map.put("TypeOfTPT", object[10]);
                map.put("Status", object[11]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
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
            String sql = "Select a.id.patientId,a.sex,a.dateOfBirth,max(b.id.visitDate),b.arvstatusCode,b.tbinvestigationResults,b.isIpteligibility,"
                    + "b.iptstatusCode,b.tbstatusCode,b.iptreasonCode,b.typeOfTpt,c.status FROM Tblpatients a, Tblvisits b, Tblstatus c "
                    + "WHERE a.id.patientId = b.id.patientId AND a.id.patientId = c.id.patientId AND b.iptreasonCode IN(1,2,3,4,5,6,7,8,9,10,11) "
                    + "AND a.dateOfDeath is null group by a.id.patientId,b.iptreasonCode";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();

                map.put("PatientID", object[0]);
                map.put("Sex", object[1]);
                map.put("DateOfBirth", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("TBInvestigationResults", object[5]);
                map.put("IsIPTEligibility", object[6]);
                map.put("IPTStatusCode", object[7]);
                map.put("TBStatusCode", object[8]);
                map.put("IPTReasonCode", object[9]);
                map.put("TypeOfTPT", object[10]);
                map.put("Status", object[11]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
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
            String sql = "Select a.id.patientId,a.sex,a.dateOfBirth,max(b.id.visitDate),b.arvstatusCode,b.tbinvestigationResults,"
                    + "b.isIpteligibility,b.iptstatusCode,b.tbstatusCode,b.iptreasonCode,b.typeOfTpt,c.status FROM Tblpatients a, "
                    + "Tblvisits b, Tblstatus c WHERE a.id.patientId = b.id.patientId AND a.id.patientId = c.id.patientId AND "
                    + "b.tbinvestigationResults IN(1,2,3,4,5) AND a.dateOfDeath is null group by a.id.patientId,b.tbinvestigationResults";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();

                map.put("PatientID", object[0]);
                map.put("Sex", object[1]);
                map.put("DateOfBirth", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("TBInvestigationResults", object[5]);
                map.put("IsIPTEligibility", object[6]);
                map.put("IPTStatusCode", object[7]);
                map.put("TBStatusCode", object[8]);
                map.put("IPTReasonCode", object[9]);
                map.put("TypeOfTPT", object[10]);
                map.put("Status", object[11]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
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
            String sql = "Select a.id.patientId,a.sex,a.dateOfBirth,max(b.id.visitDate),b.arvstatusCode,b.tbinvestigationResults,b.isIpteligibility,"
                    + "b.iptstatusCode,b.tbstatusCode,b.iptreasonCode,b.typeOfTpt,c.status FROM Tblpatients a, Tblvisits b, Tblstatus c WHERE "
                    + "a.id.patientId = b.id.patientId AND a.id.patientId = c.id.patientId AND b.tbstatusCode IN('NO','ON','S','Y') AND "
                    + "a.dateOfDeath is null group by a.id.patientId,b.tbstatusCode";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();

                map.put("PatientID", object[0]);
                map.put("Sex", object[1]);
                map.put("DateOfBirth", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("TBInvestigationResults", object[5]);
                map.put("IsIPTEligibility", object[6]);
                map.put("IPTStatusCode", object[7]);
                map.put("TBStatusCode", object[8]);
                map.put("IPTReasonCode", object[9]);
                map.put("TypeOfTPT", object[10]);
                map.put("Status", object[11]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
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
            String sql = "Select a.id.patientId,a.sex,a.dateOfBirth,max(b.id.visitDate),b.arvstatusCode,b.tbinvestigationResults,"
                    + "b.isIpteligibility,b.iptstatusCode,b.tbstatusCode,b.iptreasonCode,b.typeOfTpt,c.status FROM Tblpatients a, "
                    + "Tblvisits b, Tblstatus c WHERE a.id.patientId = b.id.patientId AND a.id.patientId = c.id.patientId AND "
                    + "(b.iptstatusCode IN('CI','HPI','IC','II','INI','IS','N/A','NE','RI') OR b.tbinvestigationResults "
                    + "IN(1,2,3,4,5)) AND a.dateOfDeath is null group by a.id.patientId,b.tbinvestigationResults,b.iptstatusCode";
            List<Object[]> data = session.createQuery(sql).list();
            for (Object[] object : data) {
                Map<String, Object> map = new HashMap<>();

                map.put("PatientID", object[0]);
                map.put("Sex", object[1]);
                map.put("DateOfBirth", object[2]);
                map.put("VisitDate", object[3]);
                map.put("ARVStatusCode", object[4]);
                map.put("TBInvestigationResults", object[5]);
                map.put("IsIPTEligibility", object[6]);
                map.put("IPTStatusCode", object[7]);
                map.put("TBStatusCode", object[8]);
                map.put("IPTReasonCode", object[9]);
                map.put("TypeOfTPT", object[10]);
                map.put("Status", object[11]);

                Gson gson = new Gson();
                JsonElement jsonElement = gson.toJsonTree(map);
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
