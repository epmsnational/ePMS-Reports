/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Htc;
import com.vmmc.entities.Patient;
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
 * @author Trevor
 */
public class HtsablePatientImpl implements HtsablePatient {
   
    @Override
    public int add(Htc p) {
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

    @Override
    public List<Htc> getAllPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Htc> pList = session.createQuery("from Htc").list();
            return pList;
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
    public List<Htc> getHtcPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            List<Htc> pList = session.createQuery("from Htc").list();
            return pList;
        } finally {
            session.close();
        }

    }

    @Override
    public Htc getHtsPatient(String htcNum) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Htc where htcnumber=:htcNum";
            Query query = session.createQuery(hql);
            query.setString("htcNum", htcNum);
            Htc p = (Htc) query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }

    @Override
    public int edit(Htc p) {
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
        }    }

    @Override
    public int remove(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Htc where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }
    public List<Htc> getAllDatedPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        ReportDates t = new ReportDates();
        
        String[] dates = t.getStartFinishDates(t.getAllDates());
        
        Date [] dt = dateConvertor(dates[0],dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];
        
        try {
            //from Patient where startDate >= :startDate AND <= :endDate
            Query query = session.createQuery("FROM Htc WHERE DateofRegistration BETWEEN :startDate AND :endDate");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);
            
            List<Htc> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    
    public List<Htc> getAllPatientsByDate(String start, String finish) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        Date [] dt = dateConvertor(start,finish);
        Date startDate = dt[0];
        Date endDate = dt[1];
        
        try {
            //from Patient where startDate >= :startDate AND <= :endDate
            Query query = session.createQuery("FROM Htc WHERE DateofRegistration BETWEEN :startDate AND :endDate");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);
            
            List<Htc> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }

    public List<Htc> filterBydates(List<Htc> listofUnfilteredHtc, String startDate, String endDate) {
        List<Htc> htcArray = new ArrayList<>();
        LocalDate sDate = this.getDate(startDate);
        LocalDate eDate = this.getDate(endDate);
        listofUnfilteredHtc.stream()
                .forEach(htc -> {
                    LocalDate cbsDate = getDate(htc.getDateofRegistration().toString());
                    if (cbsDate.isAfter(sDate) && cbsDate.isBefore(eDate)) {
                        htcArray.add(htc);
                    }
                });
        return htcArray;
    }
    public List<Htc> firstTest(List<Htc> listOfFiltered){
        List<Htc> htcFirstTest = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getTestedBefore()!= null)
                .forEach(test ->{
                String testedBefore = test.getTestedBefore();
                if(testedBefore.equalsIgnoreCase("NO")){
                   htcFirstTest.add(test);
                }
                });
        
//        List<Htc> Filtered = listOfFiltered.stream()
//                .filter(Objects::nonNull)
//                .filter(t -> t.getTestedBefore()!= null)
//                .filter(t -> t.getTestedBefore().equalsIgnoreCase("NO"))
//                .collect(Collectors.toList());
        return htcFirstTest;
    }
    public List<Htc> firstTestHivPos(List<Htc> listOfFiltered){
        List<Htc> htcFirstTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .forEach(test ->{
                String testedBefore = test.getTestedBefore();
                String hivpos = test.getFinalResultType();
                if(testedBefore.equalsIgnoreCase("NO")&&hivpos.equalsIgnoreCase("Positive")){
                   htcFirstTestHivPos.add(test);
                }
                });
        return htcFirstTestHivPos;
    }
    
    public List<Htc> testedReceivedResults(List<Htc> listOfFiltered){
        List<Htc> htcFirstTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getPostTestCounseled()!= null)
                .filter(test -> test.getRecievedResult()!= null)
                .forEach(test ->{
                String postTestCounsel = test.getPostTestCounseled();
                String receivedResults = test.getRecievedResult();
                if(receivedResults.equalsIgnoreCase("YES")&&!postTestCounsel.equalsIgnoreCase("No")&&!postTestCounsel.isEmpty()){
                   htcFirstTestHivPos.add(test);
                }
                });
        return htcFirstTestHivPos;
    }
    public List<Htc> testedPositive(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .forEach(test ->{
                String postTest = test.getFinalResultType();
                if(postTest.equalsIgnoreCase("Positive")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    
    public List<Htc> testedPositiveReceivedResultsCounselledIndexCase(List<Htc> listOfFiltered){
        List<Htc> htcFirstTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getPostTestCounseled()!= null)
                .filter(test -> test.getRecievedResult()!= null)
                .forEach(test ->{
                String postTestCounsel = test.getPostTestCounseled();
                String receivedResults = test.getRecievedResult();
                if(receivedResults.equalsIgnoreCase("YES")&&postTestCounsel.equalsIgnoreCase("Index Case")){
                   htcFirstTestHivPos.add(test);
                }
                });
        return htcFirstTestHivPos;
    }
    public List<Htc> testedPositiveCounselledIndexCase(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .filter(test -> test.getPostTestCounseled()!= null)
                .forEach(test ->{
                String postTest = test.getFinalResultType();
                String postTestCounsel = test.getPostTestCounseled();
                if(postTest.equalsIgnoreCase("Positive")&&postTestCounsel.equalsIgnoreCase("Index Case")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc> testedPositiveFacilityI(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .filter(test -> test.getTestPurposeTypeId()!= null)
                .filter(test -> test.getHtcmodelId()!= null)
                .forEach(test ->{
                String postTest = test.getFinalResultType();
                int htcPurpose = test.getTestPurposeTypeId();
                int htcModel = test.getHtcmodelId();
                if(postTest.equalsIgnoreCase("Positive")&&htcModel==7&&htcPurpose==15){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    
    public List<Htc>linkedArt(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .filter(test -> test.getTestPurposeTypeId()!= null)
                .filter(test -> test.getHtcmodelId()!= null)
                .forEach(test ->{
                String postTest = test.getFinalResultType();
                int htcPurpose = test.getTestPurposeTypeId();
                int htcModel = test.getHtcmodelId();
                if(postTest.equalsIgnoreCase("Positive")&&htcModel==7&&htcPurpose==15){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    
    public List<Htc> testedPositiveCommunity(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .filter(test -> test.getHtcmodelId()!= null)
                .forEach(test ->{
                String postTest = test.getFinalResultType();
                int htcModel = test.getHtcmodelId();
                if(postTest.equalsIgnoreCase("Positive")&&htcModel==8){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc> testedCommunityReceivedResultsCounselled(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getPostTestCounseled()!= null)
                .filter(test -> test.getRecievedResult()!= null)
                .filter(test -> test.getHtcmodelId()!= null)
                .forEach(test ->{
                String postTestCounsel = test.getPostTestCounseled();
                String receivedResults = test.getRecievedResult();
                int htcModel = test.getHtcmodelId();
                if(receivedResults.equalsIgnoreCase("Yes")&&!postTestCounsel.isEmpty()&&!postTestCounsel.equalsIgnoreCase("No")&&htcModel==8){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc> testedCommunityReceivedResultsCounselledIndexCase(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getPostTestCounseled()!= null)
                .filter(test -> test.getRecievedResult()!= null)
                .filter(test -> test.getHtcmodelId()!= null)
                .forEach(test ->{
                String postTestCounsel = test.getPostTestCounseled();
                String receivedResults = test.getRecievedResult();
                int htcModel = test.getHtcmodelId();
                if(receivedResults.equalsIgnoreCase("Yes")&&postTestCounsel.equalsIgnoreCase("Index Case")&&htcModel==8){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc> testedPositiveCommunityI(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getFinalResultType()!= null)
                .filter(test -> test.getTestPurposeTypeId()!= null)
                .filter(test -> test.getHtcmodelId()!= null)
                .forEach(test ->{
                String postTest = test.getFinalResultType();
                int htcPurpose = test.getTestPurposeTypeId();
                int htcModel = test.getHtcmodelId();
                if(postTest.equalsIgnoreCase("Positive")&&htcModel==8&&htcPurpose==15){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>servicePmtct(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("8")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>serviceMaleCircumcision(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("1")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>serviceMedicalCare(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("3")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>serviceOiArt(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("4")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>servicePsychosocialSupport(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("5")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>serviceNutrition(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("7")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>serviceTb(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("6")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    public List<Htc>serviceOthers(List<Htc> listOfFiltered){
        List<Htc> htcTestHivPos = new ArrayList<>();
        listOfFiltered.stream()
                .filter(test -> test.getRefferedforService()!= null)
                .forEach(test ->{
                String service = test.getRefferedforService();
                if(service.contains("10")){
                   htcTestHivPos.add(test);
                }
                });
        return htcTestHivPos;
    }
    private LocalDate getDate(String date) {
        String[] tempDate = date.split("-");
        return LocalDate.of(Integer.parseInt(tempDate[0]),
                Integer.parseInt(tempDate[1]),
                Integer.parseInt(tempDate[2]));
    }
    
    public int[] getTotalMalesAndFemalesInRange(List<Htc> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Htc c : list) {
            
            String[] dateComps = "".toString().split("-");
            int years = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).getYears();
            String sex = "";
            //System.out.println(years + "," + c.getSex());
            //filter first by age
            if (years>=lowAge && years<=upperAge) {
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
    
    public int[] getTotalInfantsInRange(List<Htc> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Htc c : list) {
            
            String[] dateComps = "".toString().split("-");
            long months = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).toTotalMonths();
            String sex = "";
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
    
//    public List<Htc> retested(){
//        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        //Transaction transaction = session.beginTransaction();
//        try {
//            //transaction.begin();
//            String hql = "from Htc join HtcHivresult on Htc.opdnumber = HtcHivresult.opdnumber where isRetest = 1";
//            Query query = session.createQuery(hql);
//            List<Htc> pList = query.list();
//            return pList;
//        } finally {
//            session.close();
//        }
//    }


    public Object getReferredFromTypeId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getHtcmodelId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getTestPurposeTypeId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
