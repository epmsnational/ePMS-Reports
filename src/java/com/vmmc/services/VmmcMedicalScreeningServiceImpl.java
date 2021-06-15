/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcMedicalscreening;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class VmmcMedicalScreeningServiceImpl implements VmmcMedicalScreeningService{

    @Override
    public int add(VmmcMedicalscreening vms) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(vms);
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
    public VmmcMedicalscreening getAll(String vmmcId) {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
         try {
            String hql = "from VmmcMedicalscreening where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcId);
            VmmcMedicalscreening p = (VmmcMedicalscreening)query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }

    @Override
    public int edit(VmmcMedicalscreening vms) {
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(vms);          
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
        int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete VmmcMedicalscreening where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }
    
}
