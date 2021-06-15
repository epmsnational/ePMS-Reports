/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Sti;
import com.vmmc.entities.Patient;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Training3
 */
public class CompletedStiClientAll {

    private List<Sti> sti;
    private Patient p;
    private String stiid;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public CompletedStiClientAll() {
    }

    public CompletedStiClientAll(String stiid) {
        this.stiid = stiid;

        Session pd = sessionFactory.openSession();

        try {

            String hql = "from Sti where opdnumber=:stiid";
            Query query = pd.createQuery(hql);
            query.setString("stiid", stiid);
            List<Sti> pList = query.list();
            sti = pList;
        } catch (Exception ex) {
            ex.toString();
        } finally {
            pd.close();
        }

    }

    public List<Sti> getSti() {
        return sti;
    }

    public void setSti(List<Sti> sti) {
        this.sti = sti;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getStiid() {
        return stiid;
    }

    public void setStiid(String stiid) {
        this.stiid = stiid;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    

}
