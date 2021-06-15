/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiHistory;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author lyndon
 */
public class StiHistorableImpl implements StiHistorable {

    @Override
    public int add(StiHistory history) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        try {
            //transaction.begin();
            session.save(history);
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
    public List<StiHistory> getAll() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {

            List<StiHistory> pList = session.createQuery("from  StiHistory").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public int edit(StiHistory history) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(history);
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
        Query query = session.createQuery("delete StiHistory where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

}
