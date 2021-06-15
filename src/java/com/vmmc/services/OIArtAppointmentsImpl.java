/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.Tblvisits;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
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
public class OIArtAppointmentsImpl implements OIArtAppointments {

    @Override
    public int AddArtAppointment(Tblappointments appointment) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(appointment);
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
    public List<Tblappointments> getAppointment() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblappointments> appointmentList = session.createQuery(" from Tblappointments").list();/// select distinct id.patientId, id.dateOfAppointment,dateAppointmentGiven
            return appointmentList;
        } finally {
            session.close();
        }
    }

    public List<Tblappointments> getUniqueAppointment() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblappointments> appointmentList = session.createQuery("  select distinct id.patientId from Tblappointments").list();
            return appointmentList;
        } finally {
            session.close();
        }
    }

    public List<Tblappointments> getAllDistinctAppointments() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblappointments> appointmentList = session.createQuery("FROM Tblappointments T1    \n"
                    + "WHERE id.dateOfAppointment = (\n"
                    + "   SELECT max(id.dateOfAppointment)\n"
                    + "   FROM Tblappointments T2\n"
                    + "   WHERE T1.id.patientId=T2.id.patientId\n"
                    + ")").list();
            return appointmentList;
        } finally {
            session.close();
        }
    }

    public List<Tblappointments> LostToFollowUp(List<Tblappointments> list) {
        List<Tblappointments> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getId().getDateOfAppointment() != null)
                .forEach(test -> {
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String[] dateComps = formatter.format(test.getId().getDateOfAppointment()).split("-");
//                    String[] dateComps = test.getId().getDateOfAppointment().toString().split("-");
//                    int days = Period.between(LocalDate.of(
//                                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
//                            ), LocalDate.now()).getDays();
                    LocalDate today = LocalDate.now();
                    LocalDate appointed = LocalDate.of(Integer.parseInt(dateComps[0]),Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2]));
                    long day = ChronoUnit.DAYS.between(appointed, today);
                    if (day >= 28) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblappointments> getAllAppointment(String ionumber) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
//            List<Tblappointments> appointmentList = session.createQuery("  select distinct id.patientId from Tblappointments").list();
//            return appointmentList;

            String hql = "from Tblappointments where id.patientId = :ionumber ORDER BY dateAppointmentGiven DESC";
            Query query = session.createQuery(hql);
            query.setString("ionumber", ionumber);
            List<Tblappointments> appsList = query.list();
            return appsList;
        } finally {
            session.close();
        }
    }

    @Override
    public int editAppointment(Tblappointments appointment) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(appointment);
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
    public int removeAppointment(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblappointments where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }
}
