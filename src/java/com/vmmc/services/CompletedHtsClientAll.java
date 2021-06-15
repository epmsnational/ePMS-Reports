/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Htc;
import com.vmmc.entities.Patient;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Trevor
 */
public class CompletedHtsClientAll {

    private List<Htc> htc;
    private Patient p;

    public CompletedHtsClientAll() {
    }

    private String htsid;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public CompletedHtsClientAll(String htsid ,Date startDate, Date endDate) {
        this.htsid = htsid;

        Session pd = sessionFactory.openSession();
        

        try {

            String hql=" from Htc where htcnumber=:htsid";
             Query query = pd.createQuery(hql);
            query.setString("htsid", htsid);
            List<Htc> pList = query.list();
             htc= pList;
            /*
            
            
             //record having greater than
             r.add(Restriction.gt("salary", 2000 ));

             cr.add(Restriction.between("regdate", valbeing , valend));

             /// logical Or
             LogicalExpression orExp -Restriction.or (salary,name);
             cr.add(oeExp)

             /// logical AND
             LogicalExpression andExp -Restriction.and (salary,name);
             cr.add(oeExp)

             List results - cr.list
             */
            /*  Old working criteria query
            
             Criteria cr = pd.createCriteria(Htc.class);
             cr.add(Restrictions.eq("htcnumber", htsid));
             List hts = cr.list();
             // dateofRegistration
             htc= hts;
                  
            Criteria cr = pd.createCriteria(Htc.class);
            Criterion htsnum = Restrictions.eq("htcnumber", htsid);
            Criterion period = Restrictions.between("dateofRegistration", startDate, endDate);
//            Criterion period = Restrictions.gt("dateofRegistration", startDate);
            LogicalExpression andExp = Restrictions.and(htsnum, period);
            cr.add(andExp);
            List hts = cr.list();
            htc = hts;
                    
                    */
        } catch (Exception ex) {
            ex.toString();
        } finally {
            pd.close();
        }
                    
                    
                               


    }
    public CompletedHtsClientAll(String htsid) {
        this.htsid = htsid;

        Session pd = sessionFactory.openSession();
        
        try {

            String hql="from Htc where htcnumber=:htsid";
             Query query = pd.createQuery(hql);
            query.setString("htsid", htsid);
            List<Htc> pList = query.list();
             htc= pList;
         
        } catch (Exception ex) {
            ex.toString();
        } finally {
            pd.close();
        }

    }

    public List<Htc> getHtc() {
        return htc;
    }

    public void setHtc(List<Htc> htc) {
        this.htc = htc;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getHtsid() {
        return htsid;
    }

    public void setHtsid(String htsid) {
        this.htsid = htsid;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
