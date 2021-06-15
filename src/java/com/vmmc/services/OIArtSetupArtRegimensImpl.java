/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetuparvfixeddosecombinations;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class OIArtSetupArtRegimensImpl implements OIArtSetupArtRegimens {

    @Override
    public int addARVRegimens(Tblsetuparvfixeddosecombinations arvRegimens) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(arvRegimens);
            session.flush();

            transaction.commit();
            //return "Patient Details have been saved";
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Tblsetuparvfixeddosecombinations> getARVRegimens() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblsetuparvfixeddosecombinations> arvRegimenList = session.createQuery("from Tblsetuparvfixeddosecombinations  ").list();
            return arvRegimenList;
        } finally {
            session.close();
        }
    }

    @Override
    public int edit(Tblsetuparvfixeddosecombinations arvRegimens) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(arvRegimens);
            session.flush();
            session.clear();
            transaction.commit();
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            return 0;
        } finally {
            session.close();
        }
    }
     public static Tblsetuparvfixeddosecombinations getARVRegimenByID(int arvcode) {
         //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "from Tblsetuparvfixeddosecombinations where arvcode=:arvcode ";
            Query query = session.createQuery(hql);
            query.setInteger("arvcode", arvcode);
            Object queryResult =query.uniqueResult();
//                      List<Tblsetuparvfixeddosecombinations> pList = query.list();
           Tblsetuparvfixeddosecombinations reg = (Tblsetuparvfixeddosecombinations)queryResult;
           session.getTransaction().commit();
           
           if(reg.getArvcode()==0){
            return reg;
           }
           else
               return new Tblsetuparvfixeddosecombinations();
        } finally {
            session.close();
        }
    }
    
     public Tblsetuparvfixeddosecombinations getPatienArvRegimen(int arvcode) {
         //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "from Tblsetuparvfixeddosecombinations where arvcode=:arvcode ";
            Query query = session.createQuery(hql);
            query.setInteger("arvcode", arvcode);
            Tblsetuparvfixeddosecombinations p = (Tblsetuparvfixeddosecombinations)query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }
    
     public List<Tblsetuparvfixeddosecombinations> getArvRegimens(int arvCode) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "from Tblsetuparvfixeddosecombinations where arvcode=:arvcode";
            Query query = session.createQuery(hql);
            query.setInteger("arvcode", arvCode);
            List<Tblsetuparvfixeddosecombinations> p = query.list();
            return p;
        } finally {
            session.close();
        }
    }
//    public Tblsetuparvfixeddosecombinations getARVRegimenByID(int arvcode) {
//         //To change body of generated methods, choose Tools | Templates.
//        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        try {
//            String hql = "from Tblsetuparvfixeddosecombinations where arvcode=:arvcode ";
//            Query query = session.createQuery(hql);
//            query.setInteger("arvcode", arvcode);
//                      List<Tblsetuparvfixeddosecombinations> pList = query.list();
//           Tblsetuparvfixeddosecombinations reg = pList.get(0);
//            return reg;
//        } finally {
//            session.close();
//        }
//    }

    @Override
    public int remove(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblsetuparvfixeddosecombinations where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

}
