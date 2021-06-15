/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiCs;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohcc-ATP
 */
public class CompleteCSNotification {
    
    
    public CompleteCSNotification(String stinumber) {
        this.stinumber = stinumber;

        Session session = sessionFactory.openSession();

         try {
            String hql = "from StiCs where stinumber=:stinumber ";
            Query query = session.createQuery(hql);
            query.setString("stinumber", stinumber);
            p = (StiCs)query.list().get(0);
            
        } finally {
             session.clear();
        }
session.close();
    }

    private String stinumber;
    private StiCs p;
     private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public String getStinumber() {
        return stinumber;
    }

    public void setStinumber(String stinumber) {
        this.stinumber = stinumber;
    }

    public StiCs getP() {
        return p;
    }

    public void setP(StiCs p) {
        this.p = p;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
}
