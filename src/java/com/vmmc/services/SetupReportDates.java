/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Reportdates;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author chihw
 */
public class SetupReportDates {

    public void update(String start, String end, int id) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            Reportdates reportdates = (Reportdates) session.get(Reportdates.class, id);
            reportdates.setStartDate(start);
            reportdates.setEnd(end);
            session.update(reportdates);
            transaction.commit();
        } catch (HibernateException hb) {
            if (transaction != null) {
                transaction.rollback();
            }
            hb.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public List<Reportdates> getListDate() {
        List<Reportdates> rep = null;
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Criteria pList =  session.createCriteria(Reportdates.class);
            
            rep = pList.list();
            tx.commit();
            return rep;
        } finally {
            session.close();
        }
    }
}
