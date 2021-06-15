/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupstaff;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public class SetupstaffImpl implements SetupstaffService {

    @Override
    public int add(Setupstaff s) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(s);
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
    public Setupstaff getStaff(String userName)
    {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from setupstaff where userName=:userName ";
            Query query = session.createQuery(hql);
            query.setString("userName", userName);
            Setupstaff p = (Setupstaff)query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    
    }
    @Override
    public List<Setupstaff> getAllStaff() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Setupstaff> pList = session.createQuery("from setupstaff").list();
            return pList;
        } finally {
            session.close();
        }

    }

}
