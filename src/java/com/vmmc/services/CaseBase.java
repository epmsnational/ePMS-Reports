/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;
import com.vmmc.entities.CbsTests;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author chihw
 */
public class CaseBase {
    public List<CbsTests> getAllDatedNotifications() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates vis = new ReportDates();

        String[] dates = vis.getStartFinishDates(vis.getAllDates());

        Date[] dt = dateConvertor(dates[0], dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];

        try {
            Query query = session.createQuery("FROM CbsTests WHERE dateFormCompleted BETWEEN :startDate AND :endDate");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);

            List<CbsTests> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    public List<CbsTests> RecentInfection(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String RecencyTestingResult = test.getRecencyTestingResult();
                    if (RecencyTestingResult.equalsIgnoreCase("recent")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> RecentNotDone(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTesting() != null)
                .forEach(test -> {
                    String RecencyTesting = test.getRecencyTesting();
                    if (RecencyTesting.equalsIgnoreCase("Not Done")) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<CbsTests> LongTermInfection(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String RecencyTestingResult = test.getRecencyTestingResult();
                    if (RecencyTestingResult.equalsIgnoreCase("long term")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> RecentInvalid(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String RecencyTestingResult = test.getRecencyTestingResult();
                    if (RecencyTestingResult.equalsIgnoreCase("invalid")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> RecentNegative(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String RecencyTestingResult = test.getRecencyTestingResult();
                    if (RecencyTestingResult.equalsIgnoreCase("rtri negative")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> WhoStage1(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String WhoStageAtNotification = test.getWhoStageAtNotification();
                    if (WhoStageAtNotification.equalsIgnoreCase("1")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> WhoStage2(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String WhoStageAtNotification = test.getWhoStageAtNotification();
                    if (WhoStageAtNotification.equalsIgnoreCase("2")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> WhoStage3(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String WhoStageAtNotification = test.getWhoStageAtNotification();
                    if (WhoStageAtNotification.equalsIgnoreCase("3")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> WhoStage4(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String WhoStageAtNotification = test.getWhoStageAtNotification();
                    if (WhoStageAtNotification.equalsIgnoreCase("4")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> CdCount1(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getCdCountResult() != null)
                .forEach(test -> {
                    int CdCountResult = test.getCdCountResult();
                    if (CdCountResult<200) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> CdCount2(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getCdCountResult() != null)
                .forEach(test -> {
                    int CdCountResult = test.getCdCountResult();
                    if (CdCountResult>=200&&CdCountResult<=499) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<CbsTests> CdCount3(List<CbsTests> list) {
        List<CbsTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getCdCountResult() != null)
                .forEach(test -> {
                    int CdCountResult = test.getCdCountResult();
                    if (CdCountResult>=500) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public int[] getTotalMalesAndFemalesInRange(List<CbsTests> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (CbsTests c : list) {
            
            String[] dateComps = "".toString().split("-");
            int years = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).getYears();
            String sex = "";
            if (years>=lowAge && years<=upperAge) {
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

    public int[] getTotalInfantsInRange(List<CbsTests> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (CbsTests c : list) {

            String[] dateComps = "".toString().split("-");
            long months = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).toTotalMonths();

            String sex = "";
            if (months >= lowAge && months <= upperAge) {
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

    public Date[] dateConvertor(String sDate, String eDate) {
        Date[] dates = new Date[2];

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp startDate = null;
        Timestamp endDate = null;
        try {
            Date parsedFormCompleted = formatter.parse(sDate);
            startDate = new java.sql.Timestamp(parsedFormCompleted.getTime());

            Date parsedcbsDob = formatter.parse(eDate);
            endDate = new java.sql.Timestamp(parsedcbsDob.getTime());
        } catch (Exception pw) {
            pw.printStackTrace();
        }
        dates[0] = startDate;
        dates[1] = endDate;

        return dates;
    }
    public List<CbsTests> removeNullsV(List<CbsTests> list) {
        List<CbsTests> filtered = new ArrayList<>();
        list.stream()
//                .filter(dates -> dates.getDateOfBirth() != null)
                .filter(dates -> dates.getDateFormCompleted() != null)
//                .filter(dates -> dates.getSex() != null)
                .forEach(dates -> {
                    filtered.add(dates);
                });
        return filtered;
    }
    
}
