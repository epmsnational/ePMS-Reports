/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiCsSetupsigns;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohcc-ATP
 */
public class StiCsSetupServiceImpl implements StiCsSetupService {

    @Override
    public List getStiCsSigns() { SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<StiCsSetupsigns> pList=null;
        try {
            pList = session.createQuery("from StiCsSetupsigns").list();
            return pList;
        } finally {
            session.close();
        }   }
    }
