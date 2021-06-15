/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.GsonBuilder;
import com.vmmc.entities.CaseBaseNotification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class EpmsReportsCbs {

    public List<CaseBaseNotification> getCaseBaseNotification() {
        List<CaseBaseNotification> reportData = new ArrayList<>();

        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select a.HTCNumber,a.OPDNumber,a.DateFormCompleted,a.dateOfBirth,a.sex,a.dateEnteredEpms,b.recencyTesting,b.recencyTesterName,"
                    + "b.recencyTestingDate,b.recencyTestingResult,b.recencyTestingNotDone,b.dateHivDiagnosed,b.firstTestMethod,b.firstTestResult,\n"
                    + "b.SecondTestMethod,b.SecondTestResult,b.WhoStageAtNotification,b.CdCountResult,b.CdCountPercentage,b.CdCountTestDate FROM cbs a "
                    + "JOIN cbs_tests b ON a.OPDNumber = b.OPDNumber";
//            String sql = "Select a.PatientID,a.Sex,a.DateOfBirth,b.VisitDate,b.ARVStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
//                    + "b.TBStatusCode,b.IPTReasonCode,b.TypeOfTPT,c.Status FROM tblpatients a JOIN tblvisits b ON a.PatientID = b.PatientID JOIN "
//                    + "tblstatus c ON a.PatientID = c.PatientID WHERE a.DateOfDeath is null AND VisitDate = "
//                    + "(Select max(VisitDate) FROM tblvisits WHERE a.PatientID = tblvisits.PatientID) AND (YEAR(NOW()) - YEAR(`DateOfBirth`)) > 35 group by a.PatientID";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map<String, Object> rows = (Map<String, Object>) object;

                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                JsonElement jsonElement = gson.toJsonTree(rows);
//                System.out.println(jsonElement);
                CaseBaseNotification report = gson.fromJson(jsonElement, CaseBaseNotification.class);

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

}
