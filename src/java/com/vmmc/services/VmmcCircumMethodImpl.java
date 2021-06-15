/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcCircumcisionmethod;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class VmmcCircumMethodImpl implements VmmcCircumMethod {
@Override
    public int add(VmmcCircumcisionmethod vcm) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(vcm);
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
     
    public VmmcCircumcisionmethod getVmmcCircumMethod(String vmmcid) {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from VmmcCircumcisionmethod where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            VmmcCircumcisionmethod m = (VmmcCircumcisionmethod)query.list().get(0);
            return m;
        } finally {
            session.close();
        }

    }

    

   
    @Override
    public int edit(VmmcCircumcisionmethod vmmccircumcisionmethod) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(vmmccircumcisionmethod);          
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
        Query query = session.createQuery("delete VmmcCircumcisionmethod where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public VmmcCircumcisionmethod getVmmcCircumcisionmethod(String vmmcid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}

