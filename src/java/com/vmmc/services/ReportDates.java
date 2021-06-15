/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Reportdates;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author karma
 */
public class ReportDates {
    
    public List<Reportdates> getAllDates() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            Query query = session.createQuery("from Reportdates where id =:id");
            query.setParameter("id", 1);
            session.flush();
            
            List<Reportdates> pList = query.list();
            return pList;
        } finally {
            session.close();
        }

    }
    
    public String[] getStartFinishDates(List<Reportdates> list) {
        String[] temp = new String[2];
        for (Reportdates c : list) {
            String dateStart = c.getStartDate();
            String dateFinish = c.getEnd();
           
            temp[0] = dateStart;
            temp[1] = dateFinish;
        }
        return temp;
        
    }
}
