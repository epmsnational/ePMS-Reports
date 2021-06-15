/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcPostprocedureassessment;
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
public class VmmcPostProceduralAssImpl implements VmmcPostProceduralAss{
    
    @Override
    public int add(VmmcPostprocedureassessment vppa) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(vppa);
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
    public VmmcPostprocedureassessment getVppa(String vmmcid) {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from vmmc_vmmc_postprocedureassessment where VMMCID=:vmmcid ";
            Query query = session.createQuery(hql);
            query.setString("vmmcid", vmmcid);
            VmmcPostprocedureassessment p = (VmmcPostprocedureassessment)query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    
}
    public List<VmmcPostprocedureassessment> getAllVmmcPost() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<VmmcPostprocedureassessment> treatmentlist = session.createQuery("from VmmcPostprocedureassessment").list();
            return treatmentlist;
        } finally {
            session.close();
        }
    }
    
}
