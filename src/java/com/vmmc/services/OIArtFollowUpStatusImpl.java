/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblstatus;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class OIArtFollowUpStatusImpl implements OIArtFollowUpStatus {

    @Override
    public int AddArtFollowupstatus(Tblstatus followupstatus) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(followupstatus);
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
    public int editFollowupstatus(Tblstatus followupstatus) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(followupstatus);
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
    public int removeFollowupstatus(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblstatus where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public List<Tblstatus> getFollowupstatus() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblstatus> followupstatusList = session.createQuery("from Tblstatus").list();
            return followupstatusList;
        } finally {
            session.close();
        }
    }

    public List<String> getUniqueFollowupstatus() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<String> followupstatusList = session.createQuery("select distinct id.patientId from Tblstatus").list();
            return followupstatusList;
        } finally {
            session.close();
        }
    }

    public List<Tblstatus> getCurrentFollowupstatus() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblstatus> followupstatusList = session.createQuery("select distinct id, status from Tblstatus group by id order by id.statusDate DESC").list();
            return followupstatusList;
        } finally {
            session.close();
        }
    }
    public List<Tblstatus> getAllLastFollowUpStatuses() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String qqq = "FROM Tblstatus a\n"
                    + "WHERE a.id.statusDate = (\n"
                    + "    SELECT MAX(id.statusDate) FROM Tblstatus e\n"
                    + "    WHERE e.id.patientId = a.id.patientId\n"
                    + ")";
            List<Tblstatus> statusList = session.createQuery(qqq).list();
            return statusList;
        } finally {
            session.close();
        }
    }
    public List<Tblstatus> lostToFollowUp(List<Tblstatus> list) {
        List<Tblstatus> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getStatus()!= null)
                .forEach(test -> {
                    String Status = test.getStatus();
                    if (Status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblstatus> MissedAppointment(List<Tblstatus> list) {
        List<Tblstatus> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getStatus()!= null)
                .forEach(test -> {
                    String Status = test.getStatus();
                    if (Status.equalsIgnoreCase("Missing appointments")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblstatus> getAllFollowupstatus(String oinumber) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
//            //transaction.begin();  from Tblstatus where id.patientId = :oinumber ORDER BY id.statusDate DESC
//            List<Tblstatus> followupstatusList = session.createQuery("from Tblstatus where id.patientId = :oinumber ORDER BY id.statusDate DESC").list();
//            return followupstatusList;

            String hql = "from Tblstatus where id.patientId = :oinumber ORDER BY id.statusDate DESC";
            Query query = session.createQuery(hql);
            query.setString("oinumber", oinumber);
            List<Tblstatus> statusList = query.list();
            return statusList;

        } finally {
            session.close();
        }
    }
}
