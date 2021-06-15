/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Vmmc;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author System Devoloper
 */
public class IVmmcImpl implements IVmmc  {
     @Override
    public int add(Vmmc v) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(v);
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
    public List<Vmmc> getVmmcs() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Vmmc> pList = session.createQuery("from Vmmc").list();
            return pList;
        } finally {
            session.close();
        }

    }
    @Override
    public Vmmc getVmmc(String opdNum) {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from Vmmc where opdnumber=:opdNum ";
            Query query = session.createQuery(hql);
            query.setString("opdNum", opdNum);
            Vmmc p = (Vmmc)query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }
}
