/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiTreament;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author leon-mbano
 */
public class StiTreatableImpl implements StiTreatable {

    @Override
    public int AddStiTreament(StiTreament stireament) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(stireament);
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
    public List<StiTreament> getAllStiTreaments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<StiTreament> treatmentlist = session.createQuery("from StiTreament").list();
            return treatmentlist;
        } finally {
            session.close();
        }
    }

    @Override
    public StiTreament getStiTreament(String stiNumber, Date treatmentdate) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            StiTreament treatmentlist = (StiTreament) session.createQuery("from StiTreament where stiNumber=:stiNumber AND treatmentdate=:treatmentdate");
            return treatmentlist;
        } finally {
            session.close();
        }
    }

    @Override
    public int editStiTreament(StiTreament stitreament) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(stitreament);
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
    public int removeStiTreament(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete StiTreament where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public List<StiTreament> getPatientStiTreaments(String stiNumber) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<StiTreament> treatmentlist = session.createQuery("from StiTreament where stiNumber=:stiNumber ").list();
            return treatmentlist;
        } finally {
            session.close();
        }
    }

}
