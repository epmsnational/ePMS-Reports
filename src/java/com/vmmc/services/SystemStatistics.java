/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author System Developer
 */
public class SystemStatistics implements AutoCloseable{
    
    private int vmmcs;
    private int cbss;

    
    private int oiarts;
    private int htss;
    private int tbs;
    private int all;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
     Session session =null;
    public SystemStatistics() {        
          
       session = sessionFactory.openSession();
      // getVmmcs();
      // getAll();
      
    }

    public int getCbs() {
        Query query = session.createQuery("Select count(c.opdnumber) as cbss from cbs c where c.opdnumber > ''");
           List myList = query.list();
          Long l = (Long)myList.get(0);
            cbss =l.intValue();
        return cbss;
    }

  
    public int getOiarts() {
         Query query = session.createQuery("Select count(p.patientId) as oiarts from Patient p where p.patientId > ''");
           List myList = query.list();
          Long l = (Long)myList.get(0);
            oiarts =l.intValue();
        return oiarts;
    }
   
    
    public int getVmmcs() {         
        
           Query query = session.createQuery("Select count(p.vmmcId) as vmmcs from Patient p where p.vmmcId > ''");
           List myList = query.list();
          Long l = (Long)myList.get(0);
            vmmcs =l.intValue();
        return vmmcs;
    }

    public int getHtss() {
        Query query = session.createQuery("Select count(p.htsId) as htsss from Patient p where p.htsId > ''");
           List myList = query.list();
          Long l = (Long)myList.get(0);
            htss =l.intValue();
        return htss;
    }

    public int getTbs() {
           Query query = session.createQuery("Select count(p.tbId) as tbs from Patient p where tbId > ''");
           List myList = query.list();
          Long l = (Long)myList.get(0);
            tbs =l.intValue();
        return tbs;
    }

    public int getAll() {
        Query query = session.createQuery("Select count(p.opdnumber) as tbs from Patient p where p.opdnumber > ''");
           List myList = query.list();
          Long l = (Long)myList.get(0);
            all =l.intValue();
        return all;
    }

    @Override
    public void close() throws Exception {
        session.close();
        this.close();
    }
    
    
    
}
