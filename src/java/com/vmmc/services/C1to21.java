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
public class C1to21 {
    
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
    public List<Tblvisits> C1() {
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
     public List<Tblvisits> C2(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhostage() != null)
                .forEach(test -> {
                    int Whostage = test.getWhostage();
                    if (Whostage==1) {
                        data.add(test);
                    }
                });
        return data;
    }
     public List<Tblvisits> C4(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTbstatusCode() != null)
                .forEach(test -> {
                    String TbstatusCode = test.getTbstatusCode();
                    if (TbstatusCode.equalsIgnoreCase("Y")) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C5(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTbinvestigationResults() != null)
                .forEach(test -> {
                    int TbinvestigationResults = test.getTbinvestigationResults();
                    if (TbinvestigationResults==1 || TbinvestigationResults==2) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C6(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTbinvestigationResults() != null)
                .forEach(test -> {
                    int TbinvestigationResults = test.getTbinvestigationResults();
                    if (TbinvestigationResults==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C7(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTbinvestigationResults() != null)
                .forEach(test -> {
                    int TbinvestigationResults = test.getTbinvestigationResults();
                    if (TbinvestigationResults==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C8(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTbinvestigationResults() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    int TbinvestigationResults = test.getTbinvestigationResults();
                    if (ArvstatusCode==1&&TbinvestigationResults==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C10(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTbinvestigationResults() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int ArvstatusCode = test.getArvstatusCode();
                    int TbinvestigationResults = test.getTbinvestigationResults();
                    if (ArvstatusCode==2&&TbinvestigationResults==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C11(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIsIpteligibility() != null)
                .forEach(test -> {
                    String IsIpteligibility = test.getIsIpteligibility();
                    if (IsIpteligibility.equalsIgnoreCase("Yes")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> C12(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode() != null)
                .forEach(test -> {
                    String IptstatusCode = test.getIptstatusCode();
                    if (IptstatusCode.equalsIgnoreCase("II")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> C13(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode() != null)
                .forEach(test -> {
                    String IptstatusCode = test.getIptstatusCode();
                    if (IptstatusCode.equalsIgnoreCase("II")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> C14(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode() != null)
                .forEach(test -> {
                    String IptstatusCode = test.getIptstatusCode();
                    String Status = "";
                    if (Status.equalsIgnoreCase("Died")&&(IptstatusCode.equalsIgnoreCase("II")||IptstatusCode.equalsIgnoreCase("CI")||IptstatusCode.equalsIgnoreCase("IS")
                            ||IptstatusCode.equalsIgnoreCase("HPI"))) {
                        data.add(test);
                    }
                });
        return data;
    }
     public List<Tblvisits> C15(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode() != null)
                .forEach(test -> {
                    String IptstatusCode = test.getIptstatusCode();
                    String Status = "";
                    if (Status.equalsIgnoreCase("Lost to follow-up")&&(IptstatusCode.equalsIgnoreCase("II")||IptstatusCode.equalsIgnoreCase("CI")||IptstatusCode.equalsIgnoreCase("IS")
                            ||IptstatusCode.equalsIgnoreCase("HPI"))) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> C16(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptreasonCode() != null)
                .forEach(test -> {
                    String IptreasonCode = test.getIptreasonCode();
                    if (IptreasonCode.contains("9")||IptreasonCode.contains("11")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> C17(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode()!= null)
                .filter(test -> test.getIptreasonCode() != null)
                .forEach(test -> {
                    String IptreasonCode = test.getIptreasonCode();
                    String IptstatusCode = test.getTbstatusCode();
                    if (IptreasonCode.contains("9")&&IptstatusCode.equalsIgnoreCase("IS")) {
                        data.add(test);
                    }
                });
        return data;
    }
     public List<Tblvisits> C18(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode() != null)
                .forEach(test -> {
                    String IptstatusCode = test.getIptstatusCode();
                    String Status = "";
                    if (Status.equalsIgnoreCase("Transferred to another clinic")&&(IptstatusCode.equalsIgnoreCase("II")||IptstatusCode.equalsIgnoreCase("CI")||IptstatusCode.equalsIgnoreCase("IS")
                            ||IptstatusCode.equalsIgnoreCase("HPI"))) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> C20(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode()!= null)
                .filter(test -> test.getTbinvestigationResults() != null)
                .forEach(test -> {
                    int TbinvestigationResults = test.getTbinvestigationResults();
                    String IptstatusCode = test.getTbstatusCode();
                    if ((IptstatusCode.equalsIgnoreCase("CI")||IptstatusCode.equalsIgnoreCase("II"))&&TbinvestigationResults==1) {
                        data.add(test);
                    }
                });
        return data;
    }
    
    public List<Tblvisits> C21(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIptstatusCode()!= null)
                .forEach(test -> {
                    String IptstatusCode = test.getTbstatusCode();
                    if (IptstatusCode.equalsIgnoreCase("IC")) {
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
