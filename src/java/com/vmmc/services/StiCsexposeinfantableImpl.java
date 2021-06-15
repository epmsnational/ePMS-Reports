/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiCsexposeinfant;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Mohcc-ATP
 */
public class StiCsexposeinfantableImpl implements StiCsexposeinfantable {

    @Override
    public int AddStiCsexposeinfant(StiCsexposeinfant stiexposed) {

        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(stiexposed);
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
    public List<StiCsexposeinfant> getAllStiCsexposeinfant() {

        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<StiCsexposeinfant> sticsinfantlist = session.createQuery("from StiCsexposeinfant").list();
            return sticsinfantlist;
        } finally {
            session.close();
        }
    }

    @Override
    public int editStiCsexposeinfant(StiCsexposeinfant stiexposed) {

        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(stiexposed);
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
    public int removeStiCsexposeinfant(int id) {

        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete StiCsexposeinfant where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;

    }
    
     public StiCsexposeinfant getCSCase(String infantId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from StiCsexposeinfant where infantId=:infantId";
            Query query = session.createQuery(hql);
            query.setString("infantId", infantId);
            StiCsexposeinfant p = (StiCsexposeinfant) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }
}
