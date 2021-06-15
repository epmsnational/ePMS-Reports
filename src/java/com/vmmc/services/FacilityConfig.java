/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Facilities;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author chihw
 */
public class FacilityConfig {
    
    public int add(Facilities p) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.save(p);
            session.flush();
            session.clear();
            transaction.commit();
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            return 0;
        } finally {
            session.close();
        }
    }

    public int checkFacility(int Prov, String Dist, String Fac) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Facilities where provinceCode=:provinceCode and districtCode=:districtCode and facilityCode=:facilityCode ";
            Query query = session.createQuery(hql);
            query.setInteger("provinceCode", Prov);
            query.setString("districtCode", Dist);
            query.setString("facilityCode", Fac);
            
            List<Facilities> list = query.list();
            return list.size();
        } finally {
            session.close();
        }
    }

    public Facilities getFacilityName(int Prov, String Dist, String Fac) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Facilities where provinceCode=:provinceCode and districtCode=:districtCode and facilityCode=:facilityCode ";
            Query query = session.createQuery(hql);
            query.setInteger("provinceCode", Prov);
            query.setString("districtCode", Dist);
            query.setString("facilityCode", Fac);
            Facilities p = (Facilities) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }

}
