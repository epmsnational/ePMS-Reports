/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.VmmcCircumcisionprocedure;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class VmmcProcServiceImpl implements VmmcProcService{
    @Override
    public int add(VmmcCircumcisionprocedure vcp) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(vcp);
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
    
    public VmmcCircumcisionprocedure getVmmcCircumProc(String vmmcid) {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from vmmc_circumcisionprocedure where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            VmmcCircumcisionprocedure p = (VmmcCircumcisionprocedure)query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }
    

//     public void AddVmmcProcData(VmmcCircumcisionprocedure vcp) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public int editVmmcProcedure(VmmcCircumcisionprocedure vcp) {
         /// of importance is the primary key of the nextofkin
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(vcp);          
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
    public int removeVmmcProcedure(int id) {
        int result=0;
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete VmmcCircumcisionprocedure where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    
    
}
