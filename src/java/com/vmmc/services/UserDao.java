/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import models.Product;
//import models.User;

/**
 *
 * @author hp
 */
public class UserDao {

    private Connection con;

    public UserDao() {
       
    }

    public boolean checkUseremail(String useremail) {
        boolean val = false;
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from User where email=:useremail ";
            Query query = session.createQuery(hql);
            query.setString("useremail", useremail);
            User p = (User)query.list().get(0);
            if(p!=null)
                val=true;
            return val;
        } finally {
            session.close();
        }
    }

    public int saveUser(User b) {

        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(b);
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

    public User getUser(String username) {
          SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from User where username=:username ";
            Query query = session.createQuery(hql);
            query.setString("username", username);
            User p = (User)query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }
     public List<User> getAllUsers() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       
        try {
            
            List<User> pList = session.createQuery("from User").list();
            return pList;
        } finally {
            session.close();
        }

    }

    public User getUserById(int userid) {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            String hql = "from User where email=:userid ";
            Query query = session.createQuery(hql);
            query.setInteger("userid", userid);
            User p = (User)query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }

    public List<User> getUsers(String useremail) {
        List<User> list = new ArrayList();
//        try {
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM users  ");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                User rn = new User();
//                rn.setUserid(rs.getLong(1));
//                rn.setFirstName(rs.getString(2));
//                rn.setLastName(rs.getString(3));
//                rn.setAddress1(rs.getString(4));
//                rn.setAddress2(rs.getString(5));
//                rn.setAddress3(rs.getString(6));
//                rn.setZipCode(rs.getString(7));
//                rn.setContactNumber(rs.getString(8));
//                rn.setUseremail(rs.getString(9));
//                rn.setNationalId(rs.getString(10));
//                rn.setPassword(rs.getString(11));
//                rn.setUserType(rs.getString(12));
//                rn.setAccstats(rs.getString(13));
//                list.add(rn);
//                rn = null;
//            }
//            return list;
//        } catch (Exception ex) {
//            String str = ex.toString();
//            System.out.println(ex.toString());
//            return list;
//        }
return list;
    }

//    public List<User> getSearchUsers(String useremail) {
//        List<User> list = new ArrayList();
//        try {
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM users where  firstname like ?"
//                    + " or lastname like ? or useremail like ? ");
//            ps.setString(1, "%" + useremail + "%");
//            ps.setString(2, "%" + useremail + "%");
//            ps.setString(3, "%" + useremail + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                User rn = new User();
//                rn.setUserid(rs.getLong(1));
//                rn.setFirstName(rs.getString(2));
//                rn.setLastName(rs.getString(3));
//                rn.setAddress1(rs.getString(4));
//                rn.setAddress2(rs.getString(5));
//                rn.setAddress3(rs.getString(6));
//                rn.setZipCode(rs.getString(7));
//                rn.setContactNumber(rs.getString(8));
//                rn.setUseremail(rs.getString(9));
//                rn.setNationalId(rs.getString(10));
//                rn.setPassword(rs.getString(11));
//                rn.setUserType(rs.getString(12));
//                rn.setAccstats(rs.getString(13));
//                list.add(rn);
//                rn = null;
//            }
//            return list;
//        } catch (Exception ex) {
//            String str = ex.toString();
//            System.out.println(ex.toString());
//            return list;
//        }
//    }
//
//    public List<User> getSearchUsersTypes(String usertype) {
//        List<User> list = new ArrayList();
//        try {
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM users where  usertype=?");
//            ps.setString(1, usertype);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                User rn = new User();
//                rn.setUserid(rs.getLong(1));
//                rn.setFirstName(rs.getString(2));
//                rn.setLastName(rs.getString(3));
//                rn.setAddress1(rs.getString(4));
//                rn.setAddress2(rs.getString(5));
//                rn.setAddress3(rs.getString(6));
//                rn.setZipCode(rs.getString(7));
//                rn.setContactNumber(rs.getString(8));
//                rn.setUseremail(rs.getString(9));
//                rn.setNationalId(rs.getString(10));
//                rn.setPassword(rs.getString(11));
//                rn.setUserType(rs.getString(12));
//                rn.setAccstats(rs.getString(13));
//                list.add(rn);
//             //   rn = null;
//            }
//            return list;
//        } catch (Exception ex) {
//            String str = ex.toString();
//            System.out.println(ex.toString());
//            return list;
//        }
//    }
//
//    public void updateUser(User user) {
//        try {
//            PreparedStatement prep = con.prepareStatement("update users set  "
//                    + " firstname=? , "
//                    + " lastname=? , "
//                    + " address1=? , "
//                    + " address2=? , "
//                    + " address3=? , "
//                    + " zipcode=? , "
//                    + " contactnumber=? , "
//                    + " nationalid=? "
//                    + " where userid=?");
//            prep.setString(1, user.getFirstName());
//            prep.setString(2, user.getLastName());
//            prep.setString(3, user.getAddress1());
//            prep.setString(4, user.getAddress2());
//            prep.setString(5, user.getAddress3());
//            prep.setString(6, user.getZipCode());
//            prep.setString(7, user.getContactNumber());
//            prep.setString(8, user.getNationalId());
//            prep.setLong(9, user.getUserid());
//            prep.executeUpdate();
//        } catch (Exception ex) {
//            String str = ex.toString();
//            System.out.println(str);
//        }
//    }
//
//    public void changeStats(User an) {
//        try {
//            PreparedStatement prep = con.prepareStatement("update users set  "
//                    + " accstats=? "
//                    + " where userid=?");
//            prep.setString(1, an.getAccstats());
//            prep.setLong(2, an.getUserid());
//            prep.executeUpdate();
//        } catch (Exception ex) {
//            String str = ex.toString();
//            System.out.println(str);
//        }
//
//    }
//
//    public void changeUserType(String userType, long userid) {
//        try {
//            PreparedStatement prep = con.prepareStatement("update users set  "
//                    + " usertype=? "
//                    + " where userid=?");
//            prep.setString(1, userType);
//            prep.setLong(2, userid);
//            prep.executeUpdate();
//        } catch (Exception ex) {
//            String str = ex.toString();
//            System.out.println(str);
//        }
//
//    }

    public boolean checkPassword(String password, long userid) {
        boolean val = false;
        try {
            PreparedStatement prep = con.prepareStatement("Select * from users  "
                    + " where password = ? and userid = ? ");
            prep.setString(1, password);
            prep.setLong(2, userid);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                val = true;
            }
            return val;
        } catch (Exception ex) {
            String strr = ex.toString();
            System.out.println(strr);
            ex.printStackTrace();
            return val;
        }
    }

    public int changePassword(User s) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
              final Transaction transaction = session.beginTransaction();
            //create the update query
        String query = "update User as p set p.password = :password where p.id = :keyId";

        session.createQuery(query)
            .setString("password", s.getPassword())//this will set the string 'newName' to name variable
            .setInteger("keyId", s.getId())
            .executeUpdate();

             transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

}
