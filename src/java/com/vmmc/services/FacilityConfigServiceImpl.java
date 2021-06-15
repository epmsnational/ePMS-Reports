/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Facilityconfig;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class FacilityConfigServiceImpl implements FacilityConfigService {

    @Override
    public Facilityconfig getFacilityConfig(int id) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "from Facilityconfig where idfacilityConfig=:id ";
            Query query = session.createQuery(hql);
            query.setInteger("id", id);
            Facilityconfig p = (Facilityconfig)query.list().get(0);
            return p;
        } finally {
            session.close();
        }

        
    }
    public Facilityconfig getFacilitySite() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "from Facilityconfig";
            Query query = session.createQuery(hql);
            Facilityconfig p = (Facilityconfig)query.list().get(0);
            return p;
        } finally {
            session.close();
        }

        
    }
    
    
}
