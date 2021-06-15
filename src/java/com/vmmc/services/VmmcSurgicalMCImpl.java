/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class VmmcSurgicalMCImpl implements VmmcSurgicalMC{
    @Override
    public int add(VmmcSurgicalmalecircumcision vsmc) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(vsmc);
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
    public VmmcSurgicalmalecircumcision getVmmcSurgicalmalecircumcision(String vmmcid) {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        
        
        try {
            String hql = "from vmmc_surgicalmalecircumcision where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            VmmcSurgicalmalecircumcision p = (VmmcSurgicalmalecircumcision)query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }
    public List<VmmcSurgicalmalecircumcision> getAllVmmcSurgicalmalecircumcision() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<VmmcSurgicalmalecircumcision> treatmentlist = session.createQuery("from VmmcSurgicalmalecircumcision").list();
            return treatmentlist;
        } finally {
            session.close();
        }
    }

    @Override
    public int editVmmcSurgical(VmmcSurgicalmalecircumcision vsmc) {
        // of importance is the primary key of the nextofkin
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(vsmc);          
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
    public int removeVmmcSurgical(int id) {
        int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete VmmcSurgicalmalecircumcision where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

   

   
    
}
