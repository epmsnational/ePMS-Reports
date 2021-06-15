/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.District;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Province;
import com.vmmc.entities.Role;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Developer
 */
public class MiscService implements IMiscellaneousService {

    @Override
    public List<District> getDistricts() {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<District> pList = session.createQuery("from District group by districtCode").list();
            return pList;
        } finally {
            session.close();
        }

    }

    @Override
    public List<Province> getProvinces() {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Province> pList = session.createQuery("from Province group by provinceCode").list();
            return pList;
        } finally {
            session.close();
        }

    }

    @Override
    public List<Role> getPositions() {
       SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Role> pList = session.createQuery("from Role").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Facilities> getFacilities() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Facilities> pList = session.createQuery("from Facilities group by facilityCode").list();
            return pList;
        } finally {
            session.close();
        }
    }
    
}
