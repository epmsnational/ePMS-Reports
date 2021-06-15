/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.StiAncsyphilis;
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
public class StiAncsyphilisTestableImpl implements StiAncsyphilisTestable{

    @Override
    public int AddStiAncsyphilis(StiAncsyphilis Ancsyphilis) {
      final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(Ancsyphilis);
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
        }  }

    @Override
    public List<StiAncsyphilis> getAllStiAncsyphilis() {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<StiAncsyphilis> StiAncsyPhilisList = session.createQuery("from StiAncsyphilis  where finalResultType='Positive'").list();
            return StiAncsyPhilisList;
        } finally {
            session.close();
        }   
    }

    @Override
    public int editStiAncsyphilis(StiAncsyphilis Ancsyphilis) {
   final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(Ancsyphilis);          
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
        }    }

    @Override
    public int removeStiAncsyphilis(String stinumber) {
   int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete StiAncsyphilis where stinumber =:myid");
        query.setParameter("myid", stinumber);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;    }
    
}
