/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;



import com.vmmc.entities.Setupmedicalaidsocities;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class SetupMedicalAidSocitiesImpl implements SetupMedicalAidSocieties {

    @Override
    public int add(Setupmedicalaidsocities ma) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(ma);
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
    public List<Setupmedicalaidsocities> getSetupMedicalAid() {

        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Setupmedicalaidsocities> pList = session.createQuery("from Setupmedicalaidsocities").list();
            return pList;
        } finally {
            session.close();
        }

    }
}
