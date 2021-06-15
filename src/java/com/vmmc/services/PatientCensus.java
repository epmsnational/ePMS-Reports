/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.Htc;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Sti;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.entities.Tblpatients;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author chihw
 */
public class PatientCensus {

    public int countCbsPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Cbs> cbsList = session.createQuery("from Cbs").list();
            return cbsList.size();
        } finally {
            session.close();
        }

    }

    public int countHtsPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Htc> pList = session.createQuery("from Htc").list();
            return pList.size();
        } finally {
            session.close();
        }

    }
    
    public int countArtPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblpatients> pList = session.createQuery("from Tblpatients").list();
            return pList.size();
        } finally {
            session.close();
        }

    }
    
    public int countRegisteredPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Patient> pList = session.createQuery("from Patient").list();
            return pList.size();
        } finally {
            session.close();
        }

    }
    
    public int countArtFemalePatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            String hql = "from Tblpatients where sex =:sex";
            Query query = session.createQuery(hql);
            query.setString("sex", "Female");
            List<Tblpatients> pList = query.list();
            return pList.size();
        } finally {
            session.close();
        }

    }
    public int countExpossedInfants() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblexposedinfants> cbsList = session.createQuery("from Tblexposedinfants").list();
            return cbsList.size();
        } finally {
            session.close();
        }

    }
    public int countStiPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Sti> cbsList = session.createQuery("from Sti").list();
            return cbsList.size();
        } finally {
            session.close();
        }

    }

}
