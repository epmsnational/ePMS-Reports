/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.TblvisitsId;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Trevor
 */
public class OIArtVisitableImpl implements OIArtVisitable {

    @Override
    public int AddArtVisit(Tblvisits visit) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(visit);
            session.flush();

            transaction.commit();
            //return "Patient Details have been saved";
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Tblvisits> getVisit() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblvisits> visitList = session.createQuery("from Tblvisits").list();
            return visitList;
        } finally {
            session.close();
        }
    }

    @Override
    public int edit(Tblvisits visit) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(visit);
            session.flush();
            session.clear();
            transaction.commit();
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public int remove(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblvisits where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    public Tblvisits getOIArtVisit(TblvisitsId id) {

        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "from Tblvisits where id=:id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            //query.setOb("id", id);
            Tblvisits visit = (Tblvisits) query.list().get(0);
            return visit;
        } finally {
            session.close();
        }
    }

    @Override
    public Tblvisits getPatientSingleVisit(String patientid, Date visitdate) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            String hql = "from Tblvisits where id.visitDate=:visitdate and id.patientId=:patientid ";
            Query query = session.createQuery(hql);
            query.setString("patientid", patientid);
            query.setDate("visitdate", visitdate);

            Tblvisits visit = (Tblvisits) query.list().get(0);
            return visit;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Tblvisits> getPatientAllVisit(String oinumber) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();/// FROM Bar b ORDER BY b.id

            // List<Tblvisits> visitList = session.createQuery("from Tblvisits where id.patientId = :oinumber ORDER BY id.visitDate DESC").list(); 
            String hql = "from Tblvisits where id.patientId = :oinumber ORDER BY id.visitDate DESC";
            Query query = session.createQuery(hql);
            query.setString("oinumber", oinumber);
            List<Tblvisits> visitList = query.list();
            return visitList;

        } finally {
            session.close();
        }
    }

    public List<Tblvisits> getUniqueVisit() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            List<Tblvisits> visitList = session.createQuery("select distinct id.patientId from Tblvisits").list();
            return visitList;
        } finally {
            session.close();
        }
    }

    public List<Tblvisits> getAllLastVisit() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String qqq = "FROM Tblvisits a\n"
                    + "WHERE a.id.visitDate = (\n"
                    + "    SELECT MAX(id.visitDate) FROM Tblvisits e\n"
                    + "    WHERE e.id.patientId = a.id.patientId\n"
                    + ")";
            List<Tblvisits> visitList = session.createQuery(qqq).list();
            return visitList;
        } finally {
            session.close();
        }
    }

    public List<Tblvisits> getLastVis(List<Tblvisits> list, String patientId) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getId().getPatientId() != null)
                .forEach(test -> {
                    String PatientId = test.getId().getPatientId();
                    if (PatientId.equalsIgnoreCase(patientId)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> preArt(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvstatusCode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    String Status = "";
                    if (ArvstatusCode == 1 && Status.equalsIgnoreCase("Attending this clinic")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public void update(String patientid, Timestamp visdate, Timestamp nextreviewdate, String whostage) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction tx = session.beginTransaction();
        try {
            String hql = "UPDATE tblvisits set VisitDate = :VisitDate, WHOStage =:WHOStage" + "WHERE PatientID = :PatientID AND VisitDate = :VisitDateOld";
            Query query = session.createQuery(hql);
            //query.setParameter("VisitDate",nextreviewdate);
            query.setParameter("VisitDateOld", visdate);
            query.setParameter("PatientID", patientid);
            query.setParameter("WHOStage", whostage);
            query.executeUpdate();
            session.flush();
            session.clear();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }

        } finally {
            session.close();
        }

    }

    public int editVisits(String patientId, Date visitDate, int WhoStage, int arvCode, int arvStatus, int arvReason) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction tx = session.beginTransaction();

        int status = 0;
        try {
            String qq = "UPDATE tblvisits b SET b.WHOStage =:WHOStage, b.ARVCode =:ARVCode, b.ARVReasonCode =:ARVReasonCode, b.ARVStatusCode =:ARVStatusCode"
                    + "WHERE b.PatientID =:PatientID AND b.VisitDate =:VisitDate";
            status = session.createQuery(qq)
                    .setParameter("VisitDate", visitDate)
                    .setParameter("PatientID", patientId)
                    .setParameter("WHOStage", WhoStage)
                    .setParameter("ARVCode", arvCode)
                    .setParameter("ARVStatusCode", arvStatus)
                    .setParameter("ARVReasonCode", arvReason)
                    .executeUpdate();
            tx.commit();

            if (status > 0) {
                status = 1;
            } else {
                status = 0;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }

        } finally {
            session.close();
        }
        return status;
    }

    public int updateVisit(String patientId, Date visitDate, int WhoStage, int arvCode, int arvStatus, int arvReason) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction tx;
        int res = 0;

        try {
            tx = session.beginTransaction();
            List<Tblvisits> crit = session.createCriteria(Tblvisits.class)
                    .add(Restrictions.eq("PatientID", patientId))
                    .add(Restrictions.eq("VisitDate", visitDate)).list();
            
            for(Tblvisits vis : crit){
                vis.setArvcode(arvCode);
                vis.setWhostage(WhoStage);
                vis.setArvreasonCode(arvReason);
                vis.setArvstatusCode(arvStatus);
                session.saveOrUpdate(vis);
                tx.commit();
                
                res = 1;
            }

        } catch (Exception e) {
            e.printStackTrace();
            res = 0;
        }
        return res;

    }
}
