/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.jasper;

import com.vmmc.entities.ArtSummary;
import com.vmmc.entities.HivTbCollaboration;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ignatious
 */
public class Report {

    public List<ArtSummary> FilteredData(List<ArtSummary> list, Date reportDate) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<ArtSummary> removeNulls(List<ArtSummary> list) {
        List<ArtSummary> datesOfBirth = new ArrayList<>();
        list.stream()
                .filter(dates -> dates.getDateOfBirth() != null)
                .filter(dates -> dates.getSex() != null)
                .forEach(dates -> {
                    datesOfBirth.add(dates);
                });
        return datesOfBirth;
    }

    public Date dateConvertor(String sDate) {
        Date dates;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp startDate = null;
        try {
            Date parsedFormCompleted = formatter.parse(sDate);
            startDate = new java.sql.Timestamp(parsedFormCompleted.getTime());

        } catch (Exception pw) {
            pw.printStackTrace();
        }
        dates = startDate;

        return dates;
    }

    public int[] getTotalMalesAndFemalesInRange(List<ArtSummary> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (ArtSummary c : list) {
            Timestamp ts = Timestamp.from(c.getDateOfBirth().toInstant());
            LocalDate dt = ts.toLocalDateTime().toLocalDate();
            LocalDate today = LocalDate.now();

            long years = ChronoUnit.YEARS.between(dt, today);

            String sex = c.getSex();
            if (years >= lowAge && years <= upperAge) {
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

    public int getPatientCount(List<ArtSummary> list, int lowAge, int upperAge) {
        int count = 0;
        for(ArtSummary c : list){
            Timestamp ts = Timestamp.from(c.getDateOfBirth().toInstant());
            LocalDate dt = ts.toLocalDateTime().toLocalDate();
            LocalDate today = LocalDate.now();

            long years = ChronoUnit.YEARS.between(dt, today);
            if (years >= lowAge && years <= upperAge) {
                count++;
            }
            
            else{
                count = 0;
            }
        }
        
        return count;
    }
    

    public int[] getTotalInfantsInRange(List<ArtSummary> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (ArtSummary c : list) {
            Timestamp ts = Timestamp.from(c.getDateOfBirth().toInstant());
            LocalDate dt = ts.toLocalDateTime().toLocalDate();
            LocalDate today = LocalDate.now();

            long months = ChronoUnit.MONTHS.between(dt, today);
            String sex = c.getSex();
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

}
