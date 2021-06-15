/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reports.controllers;

import com.vmmc.entities.ArtSummary;
import com.vmmc.entities.ArtSummaryAdverseEvents;
import com.vmmc.entities.CaseBaseNotification;
import com.vmmc.entities.EnhancedAdherenceCounselling;
import com.vmmc.entities.HivTbCollaboration;
import com.vmmc.entities.LaboratoryServicesArvSwitch;
import com.vmmc.entities.LaboratoryServicesCdFourCount;
import com.vmmc.entities.LaboratoryServicesTests;
import com.vmmc.entities.OpportunityInfectionAndArtTherapy;
import com.vmmc.entities.OpportunityInfectionAndArtTherapyCryptoccocalStatus;
import com.vmmc.entities.PatientsTransferIn;
import com.vmmc.entities.PatientsTransferInVisit;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ignatious
 */
public class CountersAdults {
    
    public int[] getTotalAdultsInArtSummary(List<ArtSummary> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInArtSummaryAdverseEvents(List<ArtSummaryAdverseEvents> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInLaboratoryServicesArvSwitch(List<LaboratoryServicesArvSwitch> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInLaboratoryServicesCdFourCount(List<LaboratoryServicesCdFourCount> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInLaboratoryServicesViralLoad(List<LaboratoryServicesTests> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInOpportunityInfectionAndArtTherapy(List<OpportunityInfectionAndArtTherapy> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInHivTbCollaboration(List<HivTbCollaboration> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInPatientsTransferIn(List<PatientsTransferIn> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInLaboratoryServicesTests(List<LaboratoryServicesTests> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInPatientsTransferInVisit(List<PatientsTransferInVisit> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInEnhancedAdherenceCounselling(List<EnhancedAdherenceCounselling> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public int[] getTotalAdultsInCaseBaseNotification(List<CaseBaseNotification> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        list.stream().forEach((c) -> {
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
        });

        return temp;
    }
    
    public void testYearsCalculator(List<HivTbCollaboration> list){
        list.stream().forEach((c)->{
            Timestamp ts = Timestamp.from(c.getDateOfBirth().toInstant());
            LocalDate dt = ts.toLocalDateTime().toLocalDate();
            LocalDate today = LocalDate.now();
            long years = ChronoUnit.YEARS.between(dt, today);
            String sex = c.getSex();
            
            System.out.println("Gender : " +sex+ " Date Of Birth : "+dt+" Age : " +years);
            
        }
        
        );
    }

    
    
}
