package com.vmmc.services;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vmmc.entities.PatientMedicalInsurance;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author Trevor
 */
public class MedicalInsurancableImpl implements MedicalInsurancable {

    @Override
    public int add(PatientMedicalInsurance p) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(p);
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
    public List<PatientMedicalInsurance> getPatientMedicalInsurance(String opdNum) {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<PatientMedicalInsurance> pList = session.createQuery("from patient_medical_insurance").list();
            return pList;
        } finally {
            session.close();
        }  
    }
}

    