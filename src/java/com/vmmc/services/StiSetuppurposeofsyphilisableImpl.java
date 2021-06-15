/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.StiSetuppurposeofsyphilis;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author divar
 */
public class StiSetuppurposeofsyphilisableImpl  implements StiSetuppurposeofsyphilisable{

    @Override
    public int AddStiSetupPurpose(StiSetuppurposeofsyphilis purpose) {
  final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(purpose);
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
        }    }

  

    @Override
    public int editStiSetupPurpose(StiSetuppurposeofsyphilis purpose) {
   final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(purpose);          
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
        }      }

    @Override
    public int removeStiSetupPurpose(String stinumber) {
   int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete StiSetuppurposeofsyphilis where stinumber =:myid");
        query.setParameter("myid", stinumber);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;   }

    @Override
    public List<StiSetuppurposeofsyphilis> getAllStiSetupPurpose() {
    SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<StiSetuppurposeofsyphilis> StiSetupPurposeList = session.createQuery("from StiSetuppurposeofsyphilis ").list();
            return StiSetupPurposeList;
        } finally {
            session.close();
        }  }
    
}
