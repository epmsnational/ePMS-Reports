/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblexposedinfants;
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

public class ExposedInfantableImpl implements ExposedInfantable{

    @Override
    public int AddExposedInfant(Tblexposedinfants exposedinfant) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(exposedinfant);
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
    public List<Tblexposedinfants> getExposedInfants() {

        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblexposedinfants> exposedInfantList = session.createQuery("from Tblexposedinfants").list();
            return exposedInfantList;
        } finally {
            session.close();
        }
    }
    
    @Override
    public int editExposedInfant(Tblexposedinfants exposedinfant) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(exposedinfant);
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
    public int remove(String exposedInfantId) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblexposedinfants where String exposedInfantId =:String exposedInfantId");
        query.setParameter("exposedInfantId", exposedInfantId);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public List<Patient> getAllArtWomenPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            //transaction.begin();
            List<Patient> pList = session.createQuery("from Patient where sex ='Female' AND patientId is not null").list();
            return pList;
        } finally {
            session.close();
        }}
    
    
    @Override
    public Tblexposedinfants  getExposedInfant(String exposedinfant) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Tblexposedinfants where exposedInfantId=:exposedinfant";
            Query query = session.createQuery(hql);
            query.setString("exposedinfant", exposedinfant);
            Tblexposedinfants p = (Tblexposedinfants) query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }
    
}
