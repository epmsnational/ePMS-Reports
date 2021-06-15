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
public class D38to58 {
    
    public List<Tblvisits> getAllVisitsD41D49D57(){
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ReportDates vis = new ReportDates();

        String[] dates = vis.getStartFinishDates(vis.getAllDates());

        Date[] dt = dateConvertor(dates[0], dates[1]);
        Date endDate = dt[1];

        try {
            Query query = session.createQuery("FROM Tblvisits WHERE VisitDate <= :endDate group by id.patientId");
            query.setTimestamp("endDate", endDate);

            List<Tblvisits> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }

    public List<Tblvisits> getAllVisits() {
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

    public List<Tblvisits> D38(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String service = test.getAdverseEventsStatusCode();
                    if (service.equalsIgnoreCase("g=ART 1st line 1")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D39(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String service = test.getAdverseEventsStatusCode();
                    if (service.equalsIgnoreCase("h=ART 1st line 2")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D41(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    if (arvCode == 1 || arvCode == 5 || arvCode == 6 || arvCode == 7 || arvCode == 23
                    || arvCode == 26 || arvCode == 27 || arvCode == 42 || arvCode == 44 || arvCode == 45
                    || arvCode == 46 || arvCode == 90 || arvCode == 97 || arvCode == 99 || arvCode == 104
                    || arvCode == 105 || arvCode == 106 || arvCode == 112 || arvCode == 113) {
                        data.add(test);
                    }
                });
        return data;
    }
    
     public List<Tblvisits> D42(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    String Status = "";
                    if ((arvCode == 8 || arvCode == 28 || arvCode == 29 || arvCode == 31
                    || arvCode == 40 || arvCode == 41 || arvCode == 43 || arvCode == 47 || arvCode == 48
                    || arvCode == 98 || arvCode == 100 || arvCode == 101 || arvCode == 102 || arvCode == 107
                    || arvCode == 108 || arvCode == 109 || arvCode == 110 || arvCode == 114 || arvCode == 115
                    || arvCode == 116 || arvCode == 117 || arvCode == 124 || arvCode == 125 || arvCode == 126)&&Status.equalsIgnoreCase("Died")) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D43(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    String Status = "";
                    if ((arvCode == 8 || arvCode == 28 || arvCode == 29 || arvCode == 31
                    || arvCode == 40 || arvCode == 41 || arvCode == 43 || arvCode == 47 || arvCode == 48
                    || arvCode == 98 || arvCode == 100 || arvCode == 101 || arvCode == 102 || arvCode == 107
                    || arvCode == 108 || arvCode == 109 || arvCode == 110 || arvCode == 114 || arvCode == 115
                    || arvCode == 116 || arvCode == 117 || arvCode == 124 || arvCode == 125 || arvCode == 126)
                            &&Status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D44(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    int Arvstatus = test.getArvstatusCode();
                    if (Arvstatus == 5 && (arvCode == 8 || arvCode == 28 || arvCode == 29 || arvCode == 31
                    || arvCode == 40 || arvCode == 41 || arvCode == 43 || arvCode == 47 || arvCode == 48
                    || arvCode == 98 || arvCode == 100 || arvCode == 101 || arvCode == 102 || arvCode == 107
                    || arvCode == 108 || arvCode == 109 || arvCode == 110 || arvCode == 114 || arvCode == 115
                    || arvCode == 116 || arvCode == 117 || arvCode == 124 || arvCode == 125 || arvCode == 126)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D45(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    String Status = "";
                    if ((arvCode == 8 || arvCode == 28 || arvCode == 29 || arvCode == 31
                    || arvCode == 40 || arvCode == 41 || arvCode == 43 || arvCode == 47 || arvCode == 48
                    || arvCode == 98 || arvCode == 100 || arvCode == 101 || arvCode == 102 || arvCode == 107
                    || arvCode == 108 || arvCode == 109 || arvCode == 110 || arvCode == 114 || arvCode == 115
                    || arvCode == 116 || arvCode == 117 || arvCode == 124 || arvCode == 125 || arvCode == 126)
                            &&Status.equalsIgnoreCase("Transferred out")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D47(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String service = test.getAdverseEventsStatusCode();
                    if (service.equalsIgnoreCase("i=ART 2nd regimen 1")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D48(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String service = test.getAdverseEventsStatusCode();
                    if (service.equalsIgnoreCase("J=ART 2ndregimen 2")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D49(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    if (arvCode == 8 || arvCode == 28 || arvCode == 29 || arvCode == 31
                    || arvCode == 40 || arvCode == 41 || arvCode == 43 || arvCode == 47 || arvCode == 48
                    || arvCode == 98 || arvCode == 100 || arvCode == 101 || arvCode == 102 || arvCode == 107
                    || arvCode == 108 || arvCode == 109 || arvCode == 110 || arvCode == 114 || arvCode == 115
                    || arvCode == 116 || arvCode == 117 || arvCode == 124 || arvCode == 125 || arvCode == 126) {
                        data.add(test);
                    }
                });
        return data;
    }
     public List<Tblvisits> D50(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    String Status = "";
                    if ((arvCode == 103 || arvCode == 118 || arvCode == 119
                    || arvCode == 128 || arvCode == 129)&&Status.equalsIgnoreCase("Died")) {
                        data.add(test);
                    }
                });
        return data;
    }
      public List<Tblvisits> D51(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    String Status = "";
                    if ((arvCode == 103 || arvCode == 118 || arvCode == 119
                    || arvCode == 128 || arvCode == 129)&&Status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D52(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
                .filter(test -> test.getArvstatusCode() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    int Arvstatus = test.getArvstatusCode();
                    if (Arvstatus == 5 && (arvCode == 103 || arvCode == 118 || arvCode == 119
                    || arvCode == 128 || arvCode == 129)) {
                        data.add(test);
                    }
                });
        return data;
    }
    public List<Tblvisits> D53(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
//                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    String Status = "";
                    if ((arvCode == 103 || arvCode == 118 || arvCode == 119
                    || arvCode == 128 || arvCode == 129)&&Status.equalsIgnoreCase("Transferred out")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D55(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String service = test.getAdverseEventsStatusCode();
                    if (service.equalsIgnoreCase("k=ART 3rd regimen 1")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D56(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String service = test.getAdverseEventsStatusCode();
                    if (service.equalsIgnoreCase("l=ART 3rd regimen 2")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<Tblvisits> D57(List<Tblvisits> list) {
        List<Tblvisits> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getArvcode() != null)
                .forEach(test -> {
                    int arvCode = test.getArvcode();
                    if (arvCode == 103 || arvCode == 118 || arvCode == 119
                    || arvCode == 128 || arvCode == 129) {
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
