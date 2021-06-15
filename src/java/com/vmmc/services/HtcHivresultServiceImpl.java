/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.HtcHivresult;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Developer
 */
public class HtcHivresultServiceImpl implements HtcHivresultService {

    @Override
    public int add(HtcHivresult hivResult) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(hivResult);
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
    public List<HtcHivresult> getHivTests(String opdnumber) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            String hql = "from HtcHivresult where opdnumber =:opdnumber";
            Query query = session.createQuery(hql);
            query.setParameter("opdnumber", opdnumber);
            List<HtcHivresult> pList = query.list();
            return pList;
        } finally {
            session.close();
        }
    }

    @Override
    public int editHivResult(HtcHivresult hivResult) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(hivResult);
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
    public int removeHivResult(String htsNo) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete HtcHivresult where HTCNumber =:htsNo");
        query.setParameter("htsNo", htsNo);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public HtcHivresult getHivResult(int id) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            String hql = "from HtcHivresult where id =:id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            List<HtcHivresult> pList = query.list();
            return pList.get(0);
        } finally {
            session.close();
        }
    }
//select * from Htc join HtcHivresult on Htc.opdnumber = HtcHivresult.opdnumber where isRetest = 1;
//    public List<HtcHivresult> retested(){
//        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        //Transaction transaction = session.beginTransaction();
//        try {
//            //transaction.begin();
//            String hql = "from Htc join HtcHivresult on Htc.opdnumber = HtcHivresult.opdnumber where isRetest = 1";
//            Query query = session.createQuery(hql);
//            List<HtcHivresult> pList = query.list();
//            return pList;
//        } finally {
//            session.close();
//        }
//    }
    
    public List<HtcHivresult> getHivSingleTest(String htcnumber) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            String hql = "from HtcHivresult where htcnumber =:htcnumber";
            Query query = session.createQuery(hql);
            query.setParameter("htcnumber", htcnumber);
            List<HtcHivresult> pList = query.list();
            return pList;
        } finally {
            session.close();
        }
    }
    
    public List<HtcHivresult> getAllHivTest() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates vis = new ReportDates();
        
        String[] dates = vis.getStartFinishDates(vis.getAllDates());
        
        Date [] dt = dateConvertor(dates[0],dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];
        
        try {
            //from Patient where startDate >= :startDate AND <= :endDate
            Query query = session.createQuery("FROM HtcHivresult WHERE DateofRegistration BETWEEN :startDate AND :endDate");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);
            
            List<HtcHivresult> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    public List<HtcHivresult>isRetested(List<HtcHivresult> listOfFiltered){
        List<HtcHivresult> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .forEach(test ->{
                Boolean service = test.getIsRetest();
                if(service.equals(true)){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<HtcHivresult>retestedResult(List<HtcHivresult> listOfFiltered){
        List<HtcHivresult> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getResult()!= null)
                .forEach(test ->{
                String service = test.getResult();
                if(service.equalsIgnoreCase("Positive")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public int[] getTotalTestsInRange(List<HtcHivresult> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (HtcHivresult c : list) {
            
            String[] dateComps = c.getDob().toString().split("-");
            int months = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).getYears();
            String sex = c.getSex();
            //System.out.println(years + "," + c.getSex());
            //filter first by age
            if (months>=lowAge && months<=upperAge) {
                //System.out.println("found");
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
    public int[] getTotalInfantsInRange(List<HtcHivresult> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (HtcHivresult c : list) {
            
            String[] dateComps = c.getDob().toString().split("-");
            long months = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).toTotalMonths();
            
            
            String sex = c.getSex();
            //System.out.println(years + "," + c.getSex());
            //filter first by age
            if (months>=lowAge && months<=upperAge) {
                //System.out.println("found");
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
    
    public Date[] dateConvertor(String sDate, String eDate){
        Date [] dates = new Date[2];
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp startDate = null;
        Timestamp endDate = null;
        try {
            Date parsedFormCompleted = formatter.parse(sDate);
            startDate = new java.sql.Timestamp(parsedFormCompleted.getTime());
            
            Date parsedcbsDob = formatter.parse(eDate);
            endDate = new java.sql.Timestamp(parsedcbsDob.getTime());
        }catch (Exception pw) {
            pw.printStackTrace();
        }
        dates[0] = startDate;
        dates[1] = endDate;
        
        return dates;
    }
    
    

}
