/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.StiSetupsyndrome;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Training3
 */
public class StiSetupsyndromeableImpl implements StiSetupsyndromeable  {

    @Override
    public int AddStiSetupsyndrome(StiSetupsyndrome sti) {
  final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(sti);
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
    public List<StiSetupsyndrome> getStiSetupsyndrome() {
  SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<StiSetupsyndrome> stiList = session.createQuery("from StiSetupsyndrome").list();
            return stiList;
        } finally {
            session.close();
        }   }

    @Override
    public int editStiSetupsyndrome(StiSetupsyndrome syndrome) {
 final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(syndrome);
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
        }  }

    @Override
    public int removeStiSetupsyndrome(String stinumber) {
 int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete StiSetupsyndrome where stinumber =:myid");
        query.setParameter("myid", stinumber);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;       }
    
}
