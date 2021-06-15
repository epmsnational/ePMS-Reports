/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.entities.TblexposedinfantvisitsId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author mbanol
 */
public class ExposedInfantVistableImpl implements ExposedInfantVistable {

    @Override
    public int AddExposedInfantVisit(Tblexposedinfantvisits visit) {
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
    public List<Tblexposedinfantvisits> getAllExposedInfantVisits() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblexposedinfantvisits> visitList = session.createQuery("from Tblexposedinfantvisits").list();
            return visitList;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Tblexposedinfantvisits> getExposedInfantVisits(String exposedInfantId) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblexposedinfantvisits> visitList = session.createQuery("from Tblexposedinfantvisits where exposedInfantId=:exposedInfantId").list();
            return visitList;
        } finally {
            session.close();
        }
    }

    @Override
    public int editExposedInfantVisit(Tblexposedinfantvisits visit) {

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
    public int removeExposedInfantVisit(TblexposedinfantvisitsId id) {
        int result = 0;

        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblvisits where id =:id");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public List<Tblexposedinfantvisits> getExposedInfantVisit(TblexposedinfantvisitsId id) {
        
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblexposedinfantvisits> visitList = session.createQuery("from Tblexposedinfantvisits where id = :id ").list();
            return visitList;
        } finally {
            session.close();
        }
    }

}
