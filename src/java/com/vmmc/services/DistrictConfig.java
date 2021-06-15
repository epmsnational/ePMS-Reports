/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.District;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author chihw
 */
public class DistrictConfig {
    
    public District getDistrictName(int Prov, String Dist) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from District where provinceId=:provinceCode and districtCode=:districtCode";
            Query query = session.createQuery(hql);
            query.setInteger("provinceCode", Prov);
            query.setString("districtCode", Dist);
            District p = (District) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }
    
}
