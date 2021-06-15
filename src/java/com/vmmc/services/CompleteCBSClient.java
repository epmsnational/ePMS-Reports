/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Sti;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohcc-ATP
 */
public class CompleteCBSClient {

    public CompleteCBSClient() {
    }

    public CompleteCBSClient(String htcnumber) {

        this.htcnumber = htcnumber;

        Session pd = sessionFactory.openSession();

        try {

            String hql = "from Cbs where htcnumber=:htcnumber";
            Query query = pd.createQuery(hql);
            query.setString("htcnumber", htcnumber);
            List<Cbs> pList = query.list();
            cbs = pList;
        } catch (Exception ex) {
            ex.toString();
        } finally {
            pd.close();
        }
    }
    
//    public CompleteCBSClient(String htcnumber,String s) {
//
//        this.htcnumber = htcnumber;
//
//        Session pd = sessionFactory.openSession();
//
//     try {
//            bvList = session.createQuery("from Basicvitals where OPDNumber = :opdNum ").setString("opdNum", opdNum).list();
//
//        } finally {
//            session.clear();
//        }
    
    private Cbs cbss;

    public Cbs getCbss() {
        return cbss;
    }

    public void setCbss(Cbs cbss) {
        this.cbss = cbss;
    }
    private List<Cbs> cbs;
    private Patient p;
    private String htcnumber;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public List<Cbs> getCbs() {
        return cbs;
    }

    public void setCbs(List<Cbs> cbs) {
        this.cbs = cbs;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getHtcnumber() {
        return htcnumber;
    }

    public void setHtcnumber(String htcnumber) {
        this.htcnumber = htcnumber;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
