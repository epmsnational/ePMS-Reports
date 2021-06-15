/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.PatientAddress;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trymore
 */
public class AddressablePatientImpl implements AddressablePatient {

    @Override
    public int addAdd(PatientAddress addr) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(addr);
            session.flush();
            session.clear();
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
    public List<PatientAddress> getAddress(int OPDNumber) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();

            List<PatientAddress> addressList = session.createQuery("from PatientAddress where OPDNumber = " + OPDNumber).list();
            return addressList;
        } finally {
            session.close();
        }
    }

    @Override
    public int edit(PatientAddress addr) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(addr);
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
        Query query = session.createQuery("delete PatientAddress where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }
    public List<PatientAddress> checkAddress(String OPDNumber) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();

            List<PatientAddress> addressList = session.createQuery("from PatientAddress where OPDNumber = " + OPDNumber).list();
            return addressList;
        } finally {
            session.close();
        }
    }
}
