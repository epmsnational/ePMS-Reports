/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Laboratory;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author chihw
 */
public class LaboratoryData {

    public void add(Laboratory lab) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(lab);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            session.close();
        }

    }
    
    public List<Laboratory> getLabVrl(String PatientID){
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try{
            String hql = "from Laboratory where patientId=:patientId and testType=:testType";
            Query query = session.createQuery(hql);
            query.setString("patientId", PatientID);
            query.setString("testType", "VRL");
            
            List<Laboratory> results = query.list();
            
            return results;
        }finally{
            session.close();
        }
    }
    public List<Laboratory> getLabCd4(String PatientID){
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try{
            String hql = "from Laboratory where patientId=:patientId and testType=:testType";
            Query query = session.createQuery(hql);
            query.setString("patientId", PatientID);
            query.setString("testType", "CD4");
            
            List<Laboratory> results = query.list();
            
            return results;
        }finally{
            session.close();
        }
    }
    public List<Laboratory> getLabCd4P(String PatientID){
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try{
            String hql = "from Laboratory where patientId=:patientId and testType=:testType";
            Query query = session.createQuery(hql);
            query.setString("patientId", PatientID);
            query.setString("testType", "CD%");
            
            List<Laboratory> results = query.list();
            
            return results;
        }finally{
            session.close();
        }
    }
    public Laboratory getDataTest(int id){
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try{
            String hql = "from Laboratory where id=:id";
            Query query = session.createQuery(hql);
            query.setInteger("id", id);
            
            Laboratory results = (Laboratory) query.list().get(0);
            
            return results;
        }finally{
            session.close();
        }
    }
}
