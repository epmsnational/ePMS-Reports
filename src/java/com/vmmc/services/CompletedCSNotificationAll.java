/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.StiCs;
import com.vmmc.entities.StiCsexposeinfant;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohcc-ATP
 */
public class CompletedCSNotificationAll {
     private List<StiCs> stics;
    private StiCs p;
    private String stinumber;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

     public CompletedCSNotificationAll() {
    }
    public CompletedCSNotificationAll(String stinumber) {
        this.stinumber = stinumber;

        Session pd = sessionFactory.openSession();

        try {

            String hql = "from StiCs where stinumber=:stinumber";
            Query query = pd.createQuery(hql);
            query.setString("stinumber", stinumber);
            List<StiCs> pList = query.list();
            stics = pList;
        } catch (Exception ex) {
            ex.toString();
        } finally {
            pd.close();
        }

    }
    public List<StiCs> getStics() {
        return stics;
    }

    public void setStics(List<StiCs> stics) {
        this.stics = stics;
    }

    public StiCs getP() {
        return p;
    }

    public void setP(StiCs p) {
        this.p = p;
    }

    public String getStinumber() {
        return stinumber;
    }

    public void setStinumber(String stinumber) {
        this.stinumber = stinumber;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

   
}
