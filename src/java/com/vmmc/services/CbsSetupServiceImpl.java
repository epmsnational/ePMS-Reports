/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.CbsSetupentrypoints;
import com.vmmc.entities.CbsSetupserviceaccess;
import com.vmmc.entities.CbsSetuptestkittypes;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Trevor
 */
public class CbsSetupServiceImpl implements CbsSetupService{

   @Override
    public List getCBSEntryPoints() { SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetupentrypoints> pList=null;
        try {
            pList = session.createQuery("from CbsSetupentrypoints").list();
            return pList;
        } finally {
            session.close();
        }   }

    @Override
    public List getCBSServiceAccessesHIV() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetupserviceaccess> pList=null;
        try {
            pList = session.createQuery("from CbsSetupserviceaccess where isHiv=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getCBSServiceAccessesSyphilis() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetupserviceaccess> pList=null;
        try {
            pList = session.createQuery("from CbsSetupserviceaccess where isSyphilis=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getCBSServiceAccessesARVTherapy() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetupserviceaccess> pList=null;
        try {
            pList = session.createQuery("from CbsSetupserviceaccess where isArvtherapy=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getCBSHIVTestTypes() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetuptestkittypes> pList=null;
        try {
            pList = session.createQuery("from CbsSetuptestkittypes where progId=1").list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public List getCBSSyphilisTestTypes() {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetuptestkittypes> pList=null;
        try {
            pList = session.createQuery("from CbsSetuptestkittypes where progId=0").list();
            return pList;
        } finally {
            session.close();
        }
    }
    @Override
    public List getCBSSyphilisTestTypes2() {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       List<CbsSetuptestkittypes> pList=null;
        try {
            pList = session.createQuery("from CbsSetuptestkittypes where progId=2").list();
            return pList;
        } finally {
            session.close();
        }
}
    
}
