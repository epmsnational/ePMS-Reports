/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.PatientSqnumber;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author lmbano
 */
public class PatientSequencialImpl implements PatientSequencial {

    @Override
    public PatientSqnumber findByID(int id) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from PatientSqnumber where id=:id ";
            Query query = session.createQuery(hql);
            query.setInteger("id", id);
            PatientSqnumber sqnum = (PatientSqnumber) query.list().get(0);
            return sqnum;
        } finally {
            session.close();
        }
    }

    @Override
    public void edidSeqnumber(PatientSqnumber seqnumber) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(seqnumber);
            session.flush();
            session.clear();
            transaction.commit();
            // return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            //return 0;
        } finally {
            session.close();
        }

    }

}
