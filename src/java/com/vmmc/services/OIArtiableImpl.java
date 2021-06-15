/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.TblappointmentsId;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.TblvisitsId;
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
public class OIArtiableImpl implements OIArtiable {

    @Override
    public int AddArtPatient(Tblpatients artpatient) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(artpatient);
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
    public List<Tblpatients> getArtPatients() {//To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Tblpatients> artList = session.createQuery("from Tblpatients").list();
            return artList;
        } finally {
            session.close();
        }
    }

    @Override
    public int editArtPatient(Tblpatients artpatient) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(artpatient);
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
    public int remove(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Tblpatients where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    public Tblpatients getPatient(String patientId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Tblpatients where patientId=:patientId ";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            Tblpatients p = (Tblpatients) query.list().get(0);
            return p;
        } finally {
            session.close();
        }
    }

    public void updatePatient(String opdnumber, String artnumberold, String artnumber) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
//        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
//        Session session = sessionFactory.openSession();
        final Transaction tx = session.beginTransaction();
        try {
//            String hql = "Select count(*) FROM patient WHERE OPDNumber = :opdnumber";
//            String hql1 = "Select count(*) FROM tblappointments WHERE PatientID = :artnumberold";
//            String hql2 = "Select count(*) FROM tblpatients WHERE  PatientID = :artnumberold";
//            Query query = session.createQuery(hql);
//            Query query1 = session.createQuery(hql1);
//            Query query2 = session.createQuery(hql2);
//            query.setParameter("opdnumber", opdnumber);
//            query1.setParameter("artnumberold", artnumberold);
//            query2.setParameter("artnumberold", artnumberold);
//
//            List results = query.list();
//            List results1 = query1.list();
//            List results2 = query2.list();
//            int patients = results.size();
//            int patients1 = results1.size();
//            int patients2 = results2.size();
//            if (patients > 0) {
//                String qry = "update Patient set patientId = :patientId" + " where OPDNumber = :OPDNumber";
//                String qry1 = "update Tblappointments set PatientID = :patientid" + " where PatientID = :oldoartnumber";
//                String qry2 = "update Tblvisits set PatientID = :patientid" + " where PatientID = :oldoartnumber";
//                Query update = session.createQuery(qry);
//                update.setParameter("patientId", artnumber);
//                update.setParameter("OPDNumber", opdnumber);
//                update.executeUpdate();
                
                Patient pat = (Patient)session.get(Patient.class, opdnumber);
                pat.setPatientId(artnumber);
                session.update(pat);
                session.flush();
                session.clear();
                tx.commit();
                
                TblvisitsId vis = (TblvisitsId)session.get(TblvisitsId.class, artnumberold);
                vis.setPatientId(artnumber);
                session.update(vis);
                session.flush();
                session.clear();
                tx.commit();
                
                TblappointmentsId app = (TblappointmentsId)session.get(TblappointmentsId.class, artnumberold);
                app.setPatientId(artnumber);
                session.update(app);
                session.flush();
                session.clear();
                tx.commit();
                
//                String hql="update table set id=? where id=? ";
//Query query=HibernateSessionFactory.getSession().createQuery(hql);
//query.setInteger(0,1);
//query.setInteger(1,2);
//query.executeUpdate();
//HibernateSessionFactory.getSession().beginTransaction().commit();


//                Query update1 = session.createQuery(qry1);
//                update1.setParameter("patientid", artnumber);
//                update1.setParameter("oldoartnumber", artnumberold);
//                update1.executeUpdate();
//                session.flush();
//                session.clear();
//                tx.commit();
//
//String sql = "update table set id = ? where id= ?"
//Session session = HibernateSessionFactory.getSession();  
//SQLQuery query = session.createSQLQuery(sql);
//query.setParameter(0, 1);
//query.setParameter(1, 2); 



//                
//                Query update2 = session.createQuery(qry2);
//                update2.setParameter("patientid", artnumber);
//                update2.setParameter("oldoartnumber", artnumberold);
//                session.flush();
//                session.clear();
//                tx.commit();

//                if (patients1 > 0) {
//                    String qry1 = "update tblappointments set PatientID = :patientid" + " where PatientID = :oldoartnumber";
//                    Query update1 = session.createQuery(qry1);
//                    update1.setParameter("patientid", artnumber);
//                    update1.setParameter("oldoartnumber", artnumberold);
//                    update1.executeUpdate();
//                    session.flush();
//                    session.clear();
//                    tx.commit();
//
//                    if (patients2 > 0) {
//                        String qry2 = "update tblvisits set PatientID = :patientid" + " where PatientID = :oldoartnumber";
//                        Query update2 = session.createQuery(qry2);
//                        update2.setParameter("patientid", artnumber);
//                        update2.setParameter("oldoartnumber", artnumberold);
//                        update2.executeUpdate();
//                        session.flush();
//                        session.clear();
//                        tx.commit();
//
//                    }
//
//                }
//            }
//
//                tx = session.beginTransaction();
//                Patient pat = (Patient)session.get(Patient.class, opdnumber);
//                TblvisitsId vis = (TblvisitsId)session.get(TblvisitsId.class, artnumberold);
//                TblappointmentsId app = (TblappointmentsId)session.get(TblappointmentsId.class, artnumberold);
//                pat.setPatientId(artnumber);
//                vis.setPatientId(artnumber);
//                app.setPatientId(artnumber);
//                session.update(pat);
//                tx.commit();
//            
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }

        } finally {
            session.close();
        }
    }
//    public void updateColl(String idold, String idnew) {
//        String[] arrayid = {};
//                final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        final Transaction tx = session.beginTransaction();
//  try {
//    String qry2 = "update tblvisits set PatientID = :patientid" + " where PatientID = :oldoartnumber";
//    Query update = session.createQuery(qry2);
//
//   for(int i = 0; i < arrayi; i++) {
//   }
//
//  } catch (SQLException e) {
//     e.printStackTrace();
//  }
//}

}
