/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Visitplans;
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
public class PlannableVisitImpl  implements PlannableVisit{

    @Override
    public List<Visitplans> getVisitPlans(String vmmcId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from Visitplans where vmmcId=:vmmcId ";
            Query query = session.createQuery(hql);
            query.setString("vmmcId", vmmcId);
            List<Visitplans> p = query.list();
            return p;
        } finally {
            session.close();
        }
    }
    @Override
    public int add(Visitplans vp) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(vp);
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
    public int edit(Visitplans vp) {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
              final Transaction transaction = session.beginTransaction();
            //create the update query
        String query = "update Visitplans as vp set vp.isDone = :isdone where vp.vpId =:keyId";

        session.createQuery(query)
            .setBoolean("isdone", vp.getIsDone())//this will set the string 'newName' to name variable
            .setLong("keyId", vp.getVpId())
            .executeUpdate();

             transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

    @Override
    public int delete(Visitplans vp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
