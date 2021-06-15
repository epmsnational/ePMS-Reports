/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Province;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author chihw
 */
public class ProvinceConfig {
    
    public Province getProvinceName(String Prov) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Province where provinceCode=:provinceCode";
            Query query = session.createQuery(hql);
            query.setString("provinceCode", Prov);
            Province p = (Province) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }
    
}
