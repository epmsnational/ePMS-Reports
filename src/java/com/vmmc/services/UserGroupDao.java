/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Userrole;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author hp
 */
public class UserGroupDao {

    private Connection con;

    public UserGroupDao() {
       
    }

    public int addGroup(Userrole ug) {

         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(ug);
           
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

    public void modifyGroup(String groupName, String useremail) {

        try {
            PreparedStatement prep = con.prepareStatement("update   usergroups "
                    + " set groupname=?"
                    + " where useremail = ?");
            prep.setString(1, groupName);
            prep.setString(2, useremail);;
            prep.executeUpdate();
        } catch (Exception ex) {
            String str = ex.toString();
            System.out.println(str);
        }

    }

    public int removeUserGroup(Userrole ug) {
         final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.delete(ug);
           
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

}
