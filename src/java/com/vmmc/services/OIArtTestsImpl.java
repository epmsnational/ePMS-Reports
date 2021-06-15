/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
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
public class OIArtTestsImpl implements OIArtTests{

    @Override
    public int AddArtTest(Tbltests test) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(test);
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
    public List<Tbltests> getTest() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tbltests> testList = session.createQuery("from Tbltests").list();
            return testList;
        } finally {
            session.close();
        }
    }
    
    public List<Tbltests> getUniqueVlTest() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tbltests> testList = session.createQuery("select distinct tblpatients.patientId from Tbltests").list();
            return testList;
        } finally {
            session.close();
        }
    }// Patient done VL test
    //select distinct patientid,testtypeid, testdate,resultdate,resultnumeric,visitdate,recieveddate from tbltests where testtypeid='VRL' group by patientid order by resultdate desc;

    
    public List<Tbltests> getHighVlTest() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tbltests> testList = session.createQuery("select distinct patientid,testtypeid, testdate,resultdate,resultnumeric,visitdate,recieveddate from tbltests where testtypeid='VRL' and resultnumeric>1000 group by patientid").list();
            return testList;
        } finally {
            session.close();
        }
    }
    /// High VL Query 
    ///select distinct patientid,testtypeid, testdate,resultdate,resultnumeric,visitdate,recieveddate from tbltests where testtypeid='VRL' and resultnumeric>1000 group by patientid order by resultdate desc
    
    @Override
    public int edit(Tbltests test) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
           session.update(test);          
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
    
    public List<Tbltests> getAllPatientTests(String ionumber,String testtype) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
//            List<Tblappointments> appointmentList = session.createQuery("  select distinct id.patientId from Tblappointments").list();
//            return appointmentList;
            
            String hql = "from Tbltests where tblpatients.patientId  = :ionumber and testTypeId=:testtype ORDER BY testDate  DESC";
            Query query = session.createQuery(hql);
            query.setString("ionumber", ionumber);
            query.setString("testtype", testtype);
            List<Tbltests> testsList = query.list();
            return testsList;
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
        Query query = session.createQuery("delete Tbltests where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }
    
}
