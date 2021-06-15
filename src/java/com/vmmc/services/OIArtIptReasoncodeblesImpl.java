/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.Tblsetupiptreasoncodes;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author mbanol
 */
public class OIArtIptReasoncodeblesImpl implements  OIArtIptReasoncodebles{

    @Override
    public int addIptReasoncodes(Tblsetupiptreasoncodes iptreason) {
     final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(iptreason);
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
    public List<Tblsetupiptreasoncodes> getIptReasons() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblsetupiptreasoncodes> iptreasonList = session.createQuery("from Tblsetupiptreasoncodes  ").list();
            return iptreasonList;
        } finally {
            session.close();
        }}
    
}
