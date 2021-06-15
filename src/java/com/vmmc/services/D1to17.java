/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblvisits;
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
 * @author EPMS
 */
public class D1to17 {
    
    public List<Tblvisits> getAllVisits() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates vis = new ReportDates();

        String[] dates = vis.getStartFinishDates(vis.getAllDates());

        Date[] dt = dateConvertor(dates[0], dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];

        try {
            Query query = session.createQuery("FROM Tblvisits WHERE VisitDate BETWEEN :startDate AND :endDate group by id.patientId");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);

            List<Tblvisits> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    public List<Tblvisits> newlyDiagnosed() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates vis = new ReportDates();

        String[] dates = vis.getStartFinishDates(vis.getAllDates());

        Date[] dt = dateConvertor(dates[0], dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];

        try {
            Query query = session.createQuery("FROM Tblvisits WHERE RegDate BETWEEN :startDate AND :endDate group by id.patientId");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);

            List<Tblvisits> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    
    public List<Tblvisits> D1(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    if (ArvstatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> D2(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhostage() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int Whostage = test.getWhostage();
                    int ArvstatusCode = test.getArvstatusCode();
                    if (Whostage==1&&ArvstatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D3(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhostage() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int Whostage = test.getWhostage();
                    int ArvstatusCode = test.getArvstatusCode();
                    if (Whostage==2&&ArvstatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D4(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhostage() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int Whostage = test.getWhostage();
                    int ArvstatusCode = test.getArvstatusCode();
                    if (Whostage==3&&ArvstatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D5(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhostage() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int Whostage = test.getWhostage();
                    int ArvstatusCode = test.getArvstatusCode();
                    if (Whostage==4&&ArvstatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D7(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String AdverseEventsStatusCode = test.getAdverseEventsStatusCode();
                    if (AdverseEventsStatusCode.equalsIgnoreCase("c=CTX1")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D8(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String AdverseEventsStatusCode = test.getAdverseEventsStatusCode();
                    if (AdverseEventsStatusCode.equalsIgnoreCase("d=CTX2")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D10(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
//                .filter(test -> test.getStatus() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    String Status = "";
                    int ArvstatusCode = test.getArvstatusCode();
                    if (ArvstatusCode==1&&Status.equalsIgnoreCase("Died")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D11(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
//                .filter(test -> test.getStatus() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    String Status = "";
                    int ArvstatusCode = test.getArvstatusCode();
                    if (ArvstatusCode==1&&Status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D12(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
//                .filter(test -> test.getStatus() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    String Status = "";
                    int ArvstatusCode = test.getArvstatusCode();
                    if (ArvstatusCode==1&&Status.equalsIgnoreCase("Transferred to another clinic")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D14(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    if (ArvstatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> removeNulls(List<Tblvisits> list) {
        List<Tblvisits> datesOfBirth = new ArrayList<>();
        list.stream()
//                .filter(dates -> dates.getDob() != null)
//                .filter(dates -> dates.getSex() != null)
                .forEach(dates -> {
                    datesOfBirth.add(dates);
                });
        return datesOfBirth;
    }
    
    public int[] getTotalMalesAndFemalesInRange(List<Tblvisits> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Tblvisits c : list) {
            
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

    public int[] getTotalInfantsInRange(List<Tblvisits> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Tblvisits c : list) {

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
    
}
