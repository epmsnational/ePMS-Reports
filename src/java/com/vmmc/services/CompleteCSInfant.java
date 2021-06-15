/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.StiCsexposeinfant;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohcc-ATP
 */
public class CompleteCSInfant {
    
    public CompleteCSInfant(String infantId) {
        this.infantId = infantId;

        Session session = sessionFactory.openSession();

         try {
            String hql = "from StiCsexposeinfant where infantId=:infantId ";
            Query query = session.createQuery(hql);
            query.setString("infantId", infantId);
            p = (StiCsexposeinfant)query.list().get(0);
            
        } finally {
             session.clear();
        }

    }

    public String getInfantId() {
        return infantId;
    }

    public void setInfantId(String infantId) {
        this.infantId = infantId;
    }

    public StiCsexposeinfant getP() {
        return p;
    }

    public void setP(StiCsexposeinfant p) {
        this.p = p;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
     private String infantId;
    private StiCsexposeinfant p;
     private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
    
}
