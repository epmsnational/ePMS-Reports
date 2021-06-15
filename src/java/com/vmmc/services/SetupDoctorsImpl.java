/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupdoctors;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Developer
 */
public class SetupDoctorsImpl implements SetupDoctors{

    @Override
    public int add(Setupdoctors sd) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(sd);
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
    public List<Setupdoctors> getSetupSetupDoctors() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            //transaction.begin();
            List<Setupdoctors> doctorsList = session.createQuery("from Setupdoctors  ").list();
            return doctorsList;
        } finally {
            session.close();
        }
    }

    @Override
    public int editSetupDoctors(Setupdoctors sd) {
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(sd);          
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
    public int removeSetupDoctors(int id) {
        int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Setupdoctors where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }
    
    
}
