/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.CbsTests;
import com.vmmc.entities.Patient;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Objects;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Trevor
 */
public class cbsablePatientImpl implements cbsablePatient {

    @Override
    public int add(Cbs p) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(p);
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

    public List<Cbs> getExportCbs() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Cbs> cbs = session.createQuery("from Cbs").list();
            return cbs;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Cbs> getAllPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Cbs> cbsList = session.createQuery("from Cbs").list();
            return cbsList;
        } finally {
            session.close();
        }

    }

    @Override
    public Patient getPatient(String opdNum) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where opdnumber=:opdNum ";
            Query query = session.createQuery(hql);
            query.setString("opdNum", opdNum);
            Patient p = (Patient) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }

//    @Override
//    public int edit(Cbs p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public Cbs getCbsPatient(String opdnumber) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Cbs where opdnumber=:opdnumber";
            Query query = session.createQuery(hql);
            query.setString("opdnumber", opdnumber);
            Cbs p = (Cbs) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }

    @Override
    public CbsTests getCbsTests(String opdnumber) {
         SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from CbsTests where opdnumber=:opdnumber";
            Query query = session.createQuery(hql);
            query.setString("opdnumber", opdnumber);
            CbsTests res = (CbsTests) query.list().get(0);
            return res;
        } finally {
            session.close();
        }
    }
    @Override
    public int remove(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Cbs where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public int edit(Cbs p) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(p);
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

    @Override
    public int countAllPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String hql = "from Cbs";
        Query query = session.createQuery(hql);
        List results = query.list();
        return results.size();
    }

    @Override
    public List<Cbs> countAll() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("From Cbs");
        List<Cbs> listHTS = query.list();

        for (Cbs patient : listHTS) {
            patient.getHtcnumber();
            //System.out.println(brand);
        }
        return listHTS;
    }
    public int exists(String value) {
        Session session = VmmcUtil.getSessionFactory().openSession();
        String minHql = "FROM Cbs t where t.htcnumber = :htcnumber";
        Query query = session.createQuery(minHql);
        query.setParameter("htcnumber", value);
        List results = query.list();
        return results.size();
    }
    
    public int existsDirect(String value) {
        Session session = VmmcUtil.getSessionFactory().openSession();
        String minHql = "FROM Cbs t where t.opdnumber = :opdnumber";
        Query query = session.createQuery(minHql);
        query.setParameter("opdnumber", value);
        List results = query.list();
        return results.size();
    }

    public long[] getTotalMalesAndFemalesInRange(List<Cbs> list, int lowAge, int upperAge) {
        long[] temp = new long[2];
        for (Cbs c : getAllPatients()) {
            // 2013-10-07,Male
            //prep object
            
            String[] dateComps = c.getDateOfBirth().toString().split("-");
            int years = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).getYears();
            String sex = c.getSex();
            System.out.println(years + "," + c.getSex());
            //filter first by age
            if (years>=lowAge && years<=upperAge) {
                System.out.println("found");
                ///this person is within the range of given age
                //determine if male or female
                if (!Objects.isNull(sex)) {
                    
                    if (sex.startsWith("M") || sex.startsWith("m")) {
                        temp[0]++;
                    } else if (sex.startsWith("F") || sex.startsWith("f")) {
                        temp[1]++;
                    }
                }
            }

        }
        return temp;
    }

}
