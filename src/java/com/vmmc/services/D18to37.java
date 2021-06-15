/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tbltests;
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
public class D18to37 {
    
    public List<Tbltests> getAllVisits() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates tes = new ReportDates();

        String[] dates = tes.getStartFinishDates(tes.getAllDates());

        Date[] dt = dateConvertor(dates[0], dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];

        try {
            Query query = session.createQuery("FROM Tbltests WHERE ResultDate BETWEEN :startDate AND :endDate group by tblpatients.patientId");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);

            List<Tbltests> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    public List<Tblvisits> getAllVisitData() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates vis = new ReportDates();

        String[] dates = vis.getStartFinishDates(vis.getAllDates());

        Date[] dt = dateConvertor(dates[0], dates[1]);
        Date startDate = dt[0];
        Date endDate = dt[1];

        try {
            //from Patient where startDate >= :startDate AND <= :endDate
            Query query = session.createQuery("FROM Tblvisits WHERE VisitDate BETWEEN :startDate AND :endDate group by id.patientId");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);

            List<Tblvisits> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }
    
    public List<Tbltests> D18(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
//                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    int ARVStatusCode = 0;
                    if (TestTypeId.equalsIgnoreCase("VRL")&&ARVStatusCode==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> D19(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
//                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    int ARVStatusCode = 0;
                    if (TestTypeId.equalsIgnoreCase("VRL")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> D20(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
                .filter(test -> test.getResultNumeric() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    float ResultNumeric = test.getResultNumeric();
                    if (TestTypeId.equalsIgnoreCase("VRL")&&ResultNumeric>1000) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> D26(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
                .filter(test -> test.getResultNumeric() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    float ResultNumeric = test.getResultNumeric();
                    if (TestTypeId.equalsIgnoreCase("CD4")&&ResultNumeric<100) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> D27(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
                .filter(test -> test.getResultNumeric() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    float ResultNumeric = test.getResultNumeric();
                    if (TestTypeId.equalsIgnoreCase("CD4")&&(ResultNumeric>100&&ResultNumeric<350)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> D28(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
                .filter(test -> test.getResultNumeric() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    float ResultNumeric = test.getResultNumeric();
                    if (TestTypeId.equalsIgnoreCase("CD4")&&(ResultNumeric>350&&ResultNumeric<500)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> D29(List<Tbltests> list) {
        List<Tbltests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeId() != null)
                .filter(test -> test.getResultNumeric() != null)
                .forEach(test -> {
                    String TestTypeId = test.getTestTypeId();
                    float ResultNumeric = test.getResultNumeric();
                    if (TestTypeId.equalsIgnoreCase("CD4")&&ResultNumeric>500) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D32(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvstatusCode() != null)
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    int arvCode = test.getArvcode();
                    if (ArvstatusCode==2&&(arvCode == 1 || arvCode == 5 || arvCode == 6 || arvCode == 7 || arvCode == 23
                    || arvCode == 26 || arvCode == 27 || arvCode == 42 || arvCode == 44 || arvCode == 45
                    || arvCode == 46 || arvCode == 90 || arvCode == 97 || arvCode == 99 || arvCode == 104
                    || arvCode == 105 || arvCode == 106 || arvCode == 112 || arvCode == 113)) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> D33(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
//                .filter(test -> test.getStatus() != null)
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    String Status = "";
                    int arvCode = test.getArvcode();
                    if (Status.equalsIgnoreCase("Died")&&(arvCode == 1 || arvCode == 5 || arvCode == 6 || arvCode == 7 || arvCode == 23
                    || arvCode == 26 || arvCode == 27 || arvCode == 42 || arvCode == 44 || arvCode == 45
                    || arvCode == 46 || arvCode == 90 || arvCode == 97 || arvCode == 99 || arvCode == 104
                    || arvCode == 105 || arvCode == 106 || arvCode == 112 || arvCode == 113)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D34(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
//                .filter(test -> test.getStatus() != null)
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    String Status = "";
                    int arvCode = test.getArvcode();
                    if (Status.equalsIgnoreCase("Lost to follow-up")&&(arvCode == 1 || arvCode == 5 || arvCode == 6 || arvCode == 7 || arvCode == 23
                    || arvCode == 26 || arvCode == 27 || arvCode == 42 || arvCode == 44 || arvCode == 45
                    || arvCode == 46 || arvCode == 90 || arvCode == 97 || arvCode == 99 || arvCode == 104
                    || arvCode == 105 || arvCode == 106 || arvCode == 112 || arvCode == 113)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D35(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvstatusCode() != null)
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    int arvCode = test.getArvcode();
                    if (ArvstatusCode==5&&(arvCode == 1 || arvCode == 5 || arvCode == 6 || arvCode == 7 || arvCode == 23
                    || arvCode == 26 || arvCode == 27 || arvCode == 42 || arvCode == 44 || arvCode == 45
                    || arvCode == 46 || arvCode == 90 || arvCode == 97 || arvCode == 99 || arvCode == 104
                    || arvCode == 105 || arvCode == 106 || arvCode == 112 || arvCode == 113)) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> D36(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
//                .filter(test -> test.getStatus() != null)
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    String Status = "";
                    int arvCode = test.getArvcode();
                    if (Status.equalsIgnoreCase("Transferred to another clinic")&&(arvCode == 1 || arvCode == 5 || arvCode == 6 || arvCode == 7 || arvCode == 23
                    || arvCode == 26 || arvCode == 27 || arvCode == 42 || arvCode == 44 || arvCode == 45
                    || arvCode == 46 || arvCode == 90 || arvCode == 97 || arvCode == 99 || arvCode == 104
                    || arvCode == 105 || arvCode == 106 || arvCode == 112 || arvCode == 113)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tbltests> removeNulls(List<Tbltests> list) {
        List<Tbltests> datesOfBirth = new ArrayList<>();
        list.stream()
//                .filter(dates -> dates.getDob() != null)
//                .filter(dates -> dates.getSex() != null)
                .forEach(dates -> {
                    datesOfBirth.add(dates);
                });
        return datesOfBirth;
    }
    
    public List<Tblvisits> removeNullsV(List<Tblvisits> list) {
        List<Tblvisits> datesOfBirth = new ArrayList<>();
        list.stream()
//                .filter(dates -> dates.getDob() != null)
//                .filter(dates -> dates.getSex() != null)
                .forEach(dates -> {
                    datesOfBirth.add(dates);
                });
        return datesOfBirth;
    }
    
    public int[] getTotalMalesAndFemalesInRange(List<Tbltests> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Tbltests c : list) {
            
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
    public int[] getTotalMalesAndFemalesInRangeV(List<Tblvisits> list, int lowAge, int upperAge) {
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

    public int[] getTotalInfantsInRange(List<Tbltests> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Tbltests c : list) {

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
    public int[] getTotalInfantsInRangeV(List<Tblvisits> list, int lowAge, int upperAge) {
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
