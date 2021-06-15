/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reports.services;

import com.reports.controllers.CountersAdults;
import com.reports.controllers.CountersInfants;
import com.reports.controllers.DataCleaner;
import com.vmmc.entities.ZimepmsReport;
import com.vmmc.services.EpmsReportsSectionC;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ignatious
 */
public class HivTbCollaborationPopulate {

    public List<ZimepmsReport> populateReport(Date ReportDate) {
        List<ZimepmsReport> listData = new ArrayList<>();
        EpmsReportsSectionC epmsReports = new EpmsReportsSectionC();
        CountersAdults adults = new CountersAdults();
        CountersInfants infants = new CountersInfants();
        DataCleaner cleanData = new DataCleaner();

        //C1 variables
        int[] c1infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 0, 3);
        int[] c1infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 4, 12);
        int[] c1infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 13, 24);
        int[] c1infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 59);
        int[] c1adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 5, 9);
        int[] c1adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 10, 14);
        int[] c1adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 15, 19);
        int[] c1adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 20, 24);
        int[] c1adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 29);
        int[] c1adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 30, 34);
        int[] c1adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 35, 39);
        int[] c1adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 40, 44);
        int[] c1adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 45, 49);
        int[] c1adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC1(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 50, 100);

        int totalc1 = c1infant3[0] + c1infant3[1] + c1infant12[0] + c1infant12[1] + c1infant24[0] + c1infant24[1] + c1infant59[0] + c1infant59[1] + c1adults9[0] + c1adults9[1]
                + c1adults14[0] + c1adults14[1] + c1adults19[0] + c1adults19[1] + c1adults24[0] + c1adults24[1] + c1adults29[0] + c1adults29[1] + c1adults34[0] + c1adults34[1]
                + c1adults39[0] + c1adults39[1] + c1adults44[0] + c1adults44[1] + c1adults49[0] + c1adults49[1] + c1adults50[0] + c1adults50[1];

        //C2 variables
        int[] c2infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 0, 3);
        int[] c2infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 4, 12);
        int[] c2infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 13, 24);
        int[] c2infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 59);
        int[] c2adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 5, 9);
        int[] c2adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 10, 14);
        int[] c2adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 15, 19);
        int[] c2adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 20, 24);
        int[] c2adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 29);
        int[] c2adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 30, 34);
        int[] c2adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 35, 39);
        int[] c2adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 40, 44);
        int[] c2adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 45, 49);
        int[] c2adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC2(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 50, 100);

        int totalc2 = c2infant3[0] + c2infant3[1] + c2infant12[0] + c2infant12[1] + c2infant24[0] + c2infant24[1] + c2infant59[0] + c2infant59[1] + c2adults9[0] + c2adults9[1]
                + c2adults14[0] + c2adults14[1] + c2adults19[0] + c2adults19[1] + c2adults24[0] + c2adults24[1] + c2adults29[0] + c2adults29[1] + c2adults34[0] + c2adults34[1]
                + c2adults39[0] + c2adults39[1] + c2adults44[0] + c2adults44[1] + c2adults49[0] + c2adults49[1] + c2adults50[0] + c2adults50[1];

        //C3 variables
        int[] c3infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 0, 3);
        int[] c3infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 4, 12);
        int[] c3infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 13, 24);
        int[] c3infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 59);
        int[] c3adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 5, 9);
        int[] c3adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 10, 14);
        int[] c3adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 15, 19);
        int[] c3adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 20, 24);
        int[] c3adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 29);
        int[] c3adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 30, 34);
        int[] c3adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 35, 39);
        int[] c3adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 40, 44);
        int[] c3adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 45, 49);
        int[] c3adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC3(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 50, 100);

        int totalc3 = c3infant3[0] + c3infant3[1] + c3infant12[0] + c3infant12[1] + c3infant24[0] + c3infant24[1] + c3infant59[0] + c3infant59[1] + c3adults9[0] + c3adults9[1]
                + c3adults14[0] + c3adults14[1] + c3adults19[0] + c3adults19[1] + c3adults24[0] + c3adults24[1] + c3adults29[0] + c3adults29[1] + c3adults34[0] + c3adults34[1]
                + c3adults39[0] + c3adults39[1] + c3adults44[0] + c3adults44[1] + c3adults49[0] + c3adults49[1] + c3adults50[0] + c3adults50[1];

        //C4 variables
        int[] c4infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 0, 3);
        int[] c4infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 4, 12);
        int[] c4infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 13, 24);
        int[] c4infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 59);
        int[] c4adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 5, 9);
        int[] c4adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 10, 14);
        int[] c4adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 15, 19);
        int[] c4adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 20, 24);
        int[] c4adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 29);
        int[] c4adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 30, 34);
        int[] c4adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 35, 39);
        int[] c4adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 40, 44);
        int[] c4adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 45, 49);
        int[] c4adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC4(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 50, 100);

        int totalc4 = c4infant3[0] + c4infant3[1] + c4infant12[0] + c4infant12[1] + c4infant24[0] + c4infant24[1] + c4infant59[0] + c4infant59[1] + c4adults9[0] + c4adults9[1]
                + c4adults14[0] + c4adults14[1] + c4adults19[0] + c4adults19[1] + c4adults24[0] + c4adults24[1] + c4adults29[0] + c4adults29[1] + c4adults34[0] + c4adults34[1]
                + c4adults39[0] + c4adults39[1] + c4adults44[0] + c4adults44[1] + c4adults49[0] + c4adults49[1] + c4adults50[0] + c4adults50[1];

        //C5 variables
        int[] c5infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 0, 3);
        int[] c5infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 4, 12);
        int[] c5infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 13, 24);
        int[] c5infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 59);
        int[] c5adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 5, 9);
        int[] c5adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 10, 14);
        int[] c5adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 15, 19);
        int[] c5adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 20, 24);
        int[] c5adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 29);
        int[] c5adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 30, 34);
        int[] c5adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 35, 39);
        int[] c5adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 40, 44);
        int[] c5adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 45, 49);
        int[] c5adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC5(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 50, 100);

        int totalc5 = c5infant3[0] + c5infant3[1] + c5infant12[0] + c5infant12[1] + c5infant24[0] + c5infant24[1] + c5infant59[0] + c5infant59[1] + c5adults9[0] + c5adults9[1]
                + c5adults14[0] + c5adults14[1] + c5adults19[0] + c5adults19[1] + c5adults24[0] + c5adults24[1] + c5adults29[0] + c5adults29[1] + c5adults34[0] + c5adults34[1]
                + c5adults39[0] + c5adults39[1] + c5adults44[0] + c5adults44[1] + c5adults49[0] + c5adults49[1] + c5adults50[0] + c5adults50[1];

        //C6 variables
        int[] c6infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 0, 3);
        int[] c6infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 4, 12);
        int[] c6infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 13, 24);
        int[] c6infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 59);
        int[] c6adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 5, 9);
        int[] c6adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 10, 14);
        int[] c6adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 15, 19);
        int[] c6adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 20, 24);
        int[] c6adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 25, 29);
        int[] c6adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 30, 34);
        int[] c6adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 35, 39);
        int[] c6adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 40, 44);
        int[] c6adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 45, 49);
        int[] c6adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC6(epmsReports.getHivTbCollaborationTbInvestgation()), ReportDate), 50, 100);

        int totalc6 = c6infant3[0] + c6infant3[1] + c6infant12[0] + c6infant12[1] + c6infant24[0] + c6infant24[1] + c6infant59[0] + c6infant59[1] + c6adults9[0] + c6adults9[1]
                + c6adults14[0] + c6adults14[1] + c6adults19[0] + c6adults19[1] + c6adults24[0] + c6adults24[1] + c6adults29[0] + c6adults29[1] + c6adults34[0] + c6adults34[1]
                + c6adults39[0] + c6adults39[1] + c6adults44[0] + c6adults44[1] + c6adults49[0] + c6adults49[1] + c6adults50[0] + c6adults50[1];

        //C7 variables
        int[] c7infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 0, 3);
        int[] c7infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 4, 12);
        int[] c7infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 13, 24);
        int[] c7infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 59);
        int[] c7adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 5, 9);
        int[] c7adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 10, 14);
        int[] c7adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 15, 19);
        int[] c7adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 20, 24);
        int[] c7adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 29);
        int[] c7adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 30, 34);
        int[] c7adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 35, 39);
        int[] c7adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 40, 44);
        int[] c7adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 45, 49);
        int[] c7adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC7(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 50, 100);

        int totalc7 = c7infant3[0] + c7infant3[1] + c7infant12[0] + c7infant12[1] + c7infant24[0] + c7infant24[1] + c7infant59[0] + c7infant59[1] + c7adults9[0] + c7adults9[1]
                + c7adults14[0] + c7adults14[1] + c7adults19[0] + c7adults19[1] + c7adults24[0] + c7adults24[1] + c7adults29[0] + c7adults29[1] + c7adults34[0] + c7adults34[1]
                + c7adults39[0] + c7adults39[1] + c7adults44[0] + c7adults44[1] + c7adults49[0] + c7adults49[1] + c7adults50[0] + c7adults50[1];

        //C8 variables
        int[] c8infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 0, 3);
        int[] c8infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 4, 12);
        int[] c8infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 13, 24);
        int[] c8infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 25, 59);
        int[] c8adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 5, 9);
        int[] c8adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 10, 14);
        int[] c8adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 15, 19);
        int[] c8adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 20, 24);
        int[] c8adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 25, 29);
        int[] c8adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 30, 34);
        int[] c8adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 35, 39);
        int[] c8adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 40, 44);
        int[] c8adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 45, 49);
        int[] c8adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC8(epmsReports.getHivTbCollaborationTptStatus()), ReportDate), 50, 100);

        int totalc8 = c8infant3[0] + c8infant3[1] + c8infant12[0] + c8infant12[1] + c8infant24[0] + c8infant24[1] + c8infant59[0] + c8infant59[1] + c8adults9[0] + c8adults9[1]
                + c8adults14[0] + c8adults14[1] + c8adults19[0] + c8adults19[1] + c8adults24[0] + c8adults24[1] + c8adults29[0] + c8adults29[1] + c8adults34[0] + c8adults34[1]
                + c8adults39[0] + c8adults39[1] + c8adults44[0] + c8adults44[1] + c8adults49[0] + c8adults49[1] + c8adults50[0] + c8adults50[1];

        //C9 variables
        int[] c9infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 0, 3);
        int[] c9infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 4, 12);
        int[] c9infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 13, 24);
        int[] c9infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 59);
        int[] c9adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 5, 9);
        int[] c9adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 10, 14);
        int[] c9adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 15, 19);
        int[] c9adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 20, 24);
        int[] c9adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 25, 29);
        int[] c9adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 30, 34);
        int[] c9adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 35, 39);
        int[] c9adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 40, 44);
        int[] c9adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 45, 49);
        int[] c9adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC9(epmsReports.getHivTbCollaborationTbStatus()), ReportDate), 50, 100);

        int totalc9 = c9infant3[0] + c9infant3[1] + c9infant12[0] + c9infant12[1] + c9infant24[0] + c9infant24[1] + c9infant59[0] + c9infant59[1] + c9adults9[0] + c9adults9[1]
                + c9adults14[0] + c9adults14[1] + c9adults19[0] + c9adults19[1] + c9adults24[0] + c9adults24[1] + c9adults29[0] + c9adults29[1] + c9adults34[0] + c9adults34[1]
                + c9adults39[0] + c9adults39[1] + c9adults44[0] + c9adults44[1] + c9adults49[0] + c9adults49[1] + c9adults50[0] + c9adults50[1];

        //C10 variables
        int[] c10infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 0, 3);
        int[] c10infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 4, 12);
        int[] c10infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 13, 24);
        int[] c10infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 59);
        int[] c10adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 5, 9);
        int[] c10adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 10, 14);
        int[] c10adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 15, 19);
        int[] c10adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 20, 24);
        int[] c10adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 29);
        int[] c10adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 30, 34);
        int[] c10adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 35, 39);
        int[] c10adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 40, 44);
        int[] c10adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 45, 49);
        int[] c10adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC10(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 50, 100);

        int totalc10 = c10infant3[0] + c10infant3[1] + c10infant12[0] + c10infant12[1] + c10infant24[0] + c10infant24[1] + c10infant59[0] + c10infant59[1] + c10adults9[0] + c10adults9[1]
                + c10adults14[0] + c10adults14[1] + c10adults19[0] + c10adults19[1] + c10adults24[0] + c10adults24[1] + c10adults29[0] + c10adults29[1] + c10adults34[0] + c10adults34[1]
                + c10adults39[0] + c10adults39[1] + c10adults44[0] + c10adults44[1] + c10adults49[0] + c10adults49[1] + c10adults50[0] + c10adults50[1];

        //C11 variables
        int[] c11infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 0, 3);
        int[] c11infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 4, 12);
        int[] c11infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 13, 24);
        int[] c11infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 59);
        int[] c11adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 5, 9);
        int[] c11adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 10, 14);
        int[] c11adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 15, 19);
        int[] c11adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 20, 24);
        int[] c11adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 29);
        int[] c11adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 30, 34);
        int[] c11adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 35, 39);
        int[] c11adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 40, 44);
        int[] c11adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 45, 49);
        int[] c11adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC11(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 50, 100);

        int totalc11 = c11infant3[0] + c11infant3[1] + c11infant12[0] + c11infant12[1] + c11infant24[0] + c11infant24[1] + c11infant59[0] + c11infant59[1] + c11adults9[0] + c11adults9[1]
                + c11adults14[0] + c11adults14[1] + c11adults19[0] + c11adults19[1] + c11adults24[0] + c11adults24[1] + c11adults29[0] + c11adults29[1] + c11adults34[0] + c11adults34[1]
                + c11adults39[0] + c11adults39[1] + c11adults44[0] + c11adults44[1] + c11adults49[0] + c11adults49[1] + c11adults50[0] + c11adults50[1];

        //C12 variables
        int[] c12infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 0, 3);
        int[] c12infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 4, 12);
        int[] c12infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 13, 24);
        int[] c12infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 59);
        int[] c12adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 5, 9);
        int[] c12adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 10, 14);
        int[] c12adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 15, 19);
        int[] c12adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 20, 24);
        int[] c12adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 29);
        int[] c12adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 30, 34);
        int[] c12adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 35, 39);
        int[] c12adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 40, 44);
        int[] c12adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 45, 49);
        int[] c12adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC12(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 50, 100);

        int totalc12 = c12infant3[0] + c12infant3[1] + c12infant12[0] + c12infant12[1] + c12infant24[0] + c12infant24[1] + c12infant59[0] + c12infant59[1] + c12adults9[0] + c12adults9[1]
                + c12adults14[0] + c12adults14[1] + c12adults19[0] + c12adults19[1] + c12adults24[0] + c12adults24[1] + c12adults29[0] + c12adults29[1] + c12adults34[0] + c12adults34[1]
                + c12adults39[0] + c12adults39[1] + c12adults44[0] + c12adults44[1] + c12adults49[0] + c12adults49[1] + c12adults50[0] + c12adults50[1];

        //C13 variables
        int[] c13infant3 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 0, 3);
        int[] c13infant12 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 4, 12);
        int[] c13infant24 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 13, 24);
        int[] c13infant59 = infants.getTotalInfantsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 59);
        int[] c13adults9 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 5, 9);
        int[] c13adults14 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 10, 14);
        int[] c13adults19 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 15, 19);
        int[] c13adults24 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 20, 24);
        int[] c13adults29 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 25, 29);
        int[] c13adults34 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 30, 34);
        int[] c13adults39 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 35, 39);
        int[] c13adults44 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 40, 44);
        int[] c13adults49 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 45, 49);
        int[] c13adults50 = adults.getTotalAdultsInHivTbCollaboration(cleanData.HivTbCollaboration(cleanData.getC13(epmsReports.getHivTbCollaborationC10to13()), ReportDate), 50, 100);

        int totalc13 = c13infant3[0] + c13infant3[1] + c13infant12[0] + c13infant12[1] + c13infant24[0] + c13infant24[1] + c13infant59[0] + c13infant59[1] + c13adults9[0] + c13adults9[1]
                + c13adults14[0] + c13adults14[1] + c13adults19[0] + c13adults19[1] + c13adults24[0] + c13adults24[1] + c13adults29[0] + c13adults29[1] + c13adults34[0] + c13adults34[1]
                + c13adults39[0] + c13adults39[1] + c13adults44[0] + c13adults44[1] + c13adults49[0] + c13adults49[1] + c13adults50[0] + c13adults50[1];

        //Setting Data
        ZimepmsReport c1 = new ZimepmsReport();
        c1.setData_name(" C1. PLHIV in care screened for TB during their last visit. (Pre-ART and ART registers)");
        c1.setMonthm1(c1infant3[0]);
        c1.setMonthf1(c1infant3[1]);
        c1.setMonthm2(c1infant12[0]);
        c1.setMonthf2(c1infant12[1]);
        c1.setMonthm3(c1infant24[0]);
        c1.setMonthf3(c1infant24[1]);
        c1.setMonthm4(c1infant59[0]);
        c1.setMonthf4(c1infant59[1]);
        c1.setYearm5(c1adults9[0]);
        c1.setYearf5(c1adults9[1]);
        c1.setYearm6(c1adults14[0]);
        c1.setYearf6(c1adults14[1]);
        c1.setYearm7(c1adults19[0]);
        c1.setYearf7(c1adults19[1]);
        c1.setYearm8(c1adults24[0]);
        c1.setYearf8(c1adults24[1]);
        c1.setYearm9(c1adults29[0]);
        c1.setYearf9(c1adults29[1]);
        c1.setYearm10(c1adults34[0]);
        c1.setYearf10(c1adults34[1]);
        c1.setYearm11(c1adults39[0]);
        c1.setYearf11(c1adults39[1]);
        c1.setYearm12(c1adults44[0]);
        c1.setYearf12(c1adults44[1]);
        c1.setYearm13(c1adults49[0]);
        c1.setYearf13(c1adults49[1]);
        c1.setYearm14(c1adults50[0]);
        c1.setYearf14(c1adults50[1]);
        c1.setTotal(totalc1);

        ZimepmsReport c2 = new ZimepmsReport();
        c2.setData_name(" C2. PLHIV in care screened for TB and had signs of active TB disease (Presumptive Cases) (Pre-ART and ART registers)");
        c2.setMonthm1(c2infant3[0]);
        c2.setMonthf1(c2infant3[1]);
        c2.setMonthm2(c2infant12[0]);
        c2.setMonthf2(c2infant12[1]);
        c2.setMonthm3(c2infant24[0]);
        c2.setMonthf3(c2infant24[1]);
        c2.setMonthm4(c2infant59[0]);
        c2.setMonthf4(c2infant59[1]);
        c2.setYearm5(c2adults9[0]);
        c2.setYearf5(c2adults9[1]);
        c2.setYearm6(c2adults14[0]);
        c2.setYearf6(c2adults14[1]);
        c2.setYearm7(c2adults19[0]);
        c2.setYearf7(c2adults19[1]);
        c2.setYearm8(c2adults24[0]);
        c2.setYearf8(c2adults24[1]);
        c2.setYearm9(c2adults29[0]);
        c2.setYearf9(c2adults29[1]);
        c2.setYearm10(c2adults34[0]);
        c2.setYearf10(c2adults34[1]);
        c2.setYearm11(c2adults39[0]);
        c2.setYearf11(c2adults39[1]);
        c2.setYearm12(c2adults44[0]);
        c2.setYearf12(c2adults44[1]);
        c2.setYearm13(c2adults49[0]);
        c2.setYearf13(c2adults49[1]);
        c2.setYearm14(c2adults50[0]);
        c2.setYearf14(c2adults50[1]);
        c2.setTotal(totalc2);

        ZimepmsReport c3 = new ZimepmsReport();
        c3.setData_name(" C3. PLHIV in care investigated for active TB (Active TB) (Pre-ART and ART registers)");
        c3.setMonthm1(c3infant3[0]);
        c3.setMonthf1(c3infant3[1]);
        c3.setMonthm2(c3infant12[0]);
        c3.setMonthf2(c3infant12[1]);
        c3.setMonthm3(c3infant24[0]);
        c3.setMonthf3(c3infant24[1]);
        c3.setMonthm4(c3infant59[0]);
        c3.setMonthf4(c3infant59[1]);
        c3.setYearm5(c3adults9[0]);
        c3.setYearf5(c3adults9[1]);
        c3.setYearm6(c3adults14[0]);
        c3.setYearf6(c3adults14[1]);
        c3.setYearm7(c3adults19[0]);
        c3.setYearf7(c3adults19[1]);
        c3.setYearm8(c3adults24[0]);
        c3.setYearf8(c3adults24[1]);
        c3.setYearm9(c3adults29[0]);
        c3.setYearf9(c3adults29[1]);
        c3.setYearm10(c3adults34[0]);
        c3.setYearf10(c3adults34[1]);
        c3.setYearm11(c3adults39[0]);
        c3.setYearf11(c3adults39[1]);
        c3.setYearm12(c3adults44[0]);
        c3.setYearf12(c3adults44[1]);
        c3.setYearm13(c3adults49[0]);
        c3.setYearf13(c3adults49[1]);
        c3.setYearm14(c3adults50[0]);
        c3.setYearf14(c3adults50[1]);
        c3.setTotal(totalc3);

        ZimepmsReport c4 = new ZimepmsReport();
        c4.setData_name(" C4. PLHIV in care tested positive for TB disease (Pre-ART and ART registers)");
        c4.setMonthm1(c4infant3[0]);
        c4.setMonthf1(c4infant3[1]);
        c4.setMonthm2(c4infant12[0]);
        c4.setMonthf2(c4infant12[1]);
        c4.setMonthm3(c4infant24[0]);
        c4.setMonthf3(c4infant24[1]);
        c4.setMonthm4(c4infant59[0]);
        c4.setMonthf4(c4infant59[1]);
        c4.setYearm5(c4adults9[0]);
        c4.setYearf5(c4adults9[1]);
        c4.setYearm6(c4adults14[0]);
        c4.setYearf6(c4adults14[1]);
        c4.setYearm7(c4adults19[0]);
        c4.setYearf7(c4adults19[1]);
        c4.setYearm8(c4adults24[0]);
        c4.setYearf8(c4adults24[1]);
        c4.setYearm9(c4adults29[0]);
        c4.setYearf9(c4adults29[1]);
        c4.setYearm10(c4adults34[0]);
        c4.setYearf10(c4adults34[1]);
        c4.setYearm11(c4adults39[0]);
        c4.setYearf11(c4adults39[1]);
        c4.setYearm12(c4adults44[0]);
        c4.setYearf12(c4adults44[1]);
        c4.setYearm13(c4adults49[0]);
        c4.setYearf13(c4adults49[1]);
        c4.setYearm14(c4adults50[0]);
        c4.setYearf14(c4adults50[1]);
        c4.setTotal(totalc4);

        ZimepmsReport c5 = new ZimepmsReport();
        c5.setData_name(" C5. Number PLHIV enrolled in HIV care with active TB disease. (ART registers)");
        c5.setMonthm1(c5infant3[0]);
        c5.setMonthf1(c5infant3[1]);
        c5.setMonthm2(c5infant12[0]);
        c5.setMonthf2(c5infant12[1]);
        c5.setMonthm3(c5infant24[0]);
        c5.setMonthf3(c5infant24[1]);
        c5.setMonthm4(c5infant59[0]);
        c5.setMonthf4(c5infant59[1]);
        c5.setYearm5(c5adults9[0]);
        c5.setYearf5(c5adults9[1]);
        c5.setYearm6(c5adults14[0]);
        c5.setYearf6(c5adults14[1]);
        c5.setYearm7(c5adults19[0]);
        c5.setYearf7(c5adults19[1]);
        c5.setYearm8(c5adults24[0]);
        c5.setYearf8(c5adults24[1]);
        c5.setYearm9(c5adults29[0]);
        c5.setYearf9(c5adults29[1]);
        c5.setYearm10(c5adults34[0]);
        c5.setYearf10(c5adults34[1]);
        c5.setYearm11(c5adults39[0]);
        c5.setYearf11(c5adults39[1]);
        c5.setYearm12(c5adults44[0]);
        c5.setYearf12(c5adults44[1]);
        c5.setYearm13(c5adults49[0]);
        c5.setYearf13(c5adults49[1]);
        c5.setYearm14(c5adults50[0]);
        c5.setYearf14(c5adults50[1]);
        c5.setTotal(totalc5);

        ZimepmsReport c6 = new ZimepmsReport();
        c6.setData_name(" C6. Number PLHIV in care newly initiated on TB treatment (Pre-ART and ART registers)");
        c6.setMonthm1(c6infant3[0]);
        c6.setMonthf1(c6infant3[1]);
        c6.setMonthm2(c6infant12[0]);
        c6.setMonthf2(c6infant12[1]);
        c6.setMonthm3(c6infant24[0]);
        c6.setMonthf3(c6infant24[1]);
        c6.setMonthm4(c6infant59[0]);
        c6.setMonthf4(c6infant59[1]);
        c6.setYearm5(c6adults9[0]);
        c6.setYearf5(c6adults9[1]);
        c6.setYearm6(c6adults14[0]);
        c6.setYearf6(c6adults14[1]);
        c6.setYearm7(c6adults19[0]);
        c6.setYearf7(c6adults19[1]);
        c6.setYearm8(c6adults24[0]);
        c6.setYearf8(c6adults24[1]);
        c6.setYearm9(c6adults29[0]);
        c6.setYearf9(c6adults29[1]);
        c6.setYearm10(c6adults34[0]);
        c6.setYearf10(c6adults34[1]);
        c6.setYearm11(c6adults39[0]);
        c6.setYearf11(c6adults39[1]);
        c6.setYearm12(c6adults44[0]);
        c6.setYearf12(c6adults44[1]);
        c6.setYearm13(c6adults49[0]);
        c6.setYearf13(c6adults49[1]);
        c6.setYearm14(c6adults50[0]);
        c6.setYearf14(c6adults50[1]);
        c6.setTotal(totalc6);

        ZimepmsReport c7 = new ZimepmsReport();
        c7.setData_name(" C7. PLHIV in care screened for TB and eligible for TB Preventive Therapy (inc TPT). (Pre-ART and ART registers)");
        c7.setMonthm1(c7infant3[0]);
        c7.setMonthf1(c7infant3[1]);
        c7.setMonthm2(c7infant12[0]);
        c7.setMonthf2(c7infant12[1]);
        c7.setMonthm3(c7infant24[0]);
        c7.setMonthf3(c7infant24[1]);
        c7.setMonthm4(c7infant59[0]);
        c7.setMonthf4(c7infant59[1]);
        c7.setYearm5(c7adults9[0]);
        c7.setYearf5(c7adults9[1]);
        c7.setYearm6(c7adults14[0]);
        c7.setYearf6(c7adults14[1]);
        c7.setYearm7(c7adults19[0]);
        c7.setYearf7(c7adults19[1]);
        c7.setYearm8(c7adults24[0]);
        c7.setYearf8(c7adults24[1]);
        c7.setYearm9(c7adults29[0]);
        c7.setYearf9(c7adults29[1]);
        c7.setYearm10(c7adults34[0]);
        c7.setYearf10(c7adults34[1]);
        c7.setYearm11(c7adults39[0]);
        c7.setYearf11(c7adults39[1]);
        c7.setYearm12(c7adults44[0]);
        c7.setYearf12(c7adults44[1]);
        c7.setYearm13(c7adults49[0]);
        c7.setYearf13(c7adults49[1]);
        c7.setYearm14(c7adults50[0]);
        c7.setYearf14(c7adults50[1]);
        c7.setTotal(totalc7);

        ZimepmsReport c8 = new ZimepmsReport();
        c8.setData_name(" C8. PLHIV newly enrolled in HIV care who were initiated on TB Preventive Therapy (inc TPT) (TPT registers)");
        c8.setMonthm1(c8infant3[0]);
        c8.setMonthf1(c8infant3[1]);
        c8.setMonthm2(c8infant12[0]);
        c8.setMonthf2(c8infant12[1]);
        c8.setMonthm3(c8infant24[0]);
        c8.setMonthf3(c8infant24[1]);
        c8.setMonthm4(c8infant59[0]);
        c8.setMonthf4(c8infant59[1]);
        c8.setYearm5(c8adults9[0]);
        c8.setYearf5(c8adults9[1]);
        c8.setYearm6(c8adults14[0]);
        c8.setYearf6(c8adults14[1]);
        c8.setYearm7(c8adults19[0]);
        c8.setYearf7(c8adults19[1]);
        c8.setYearm8(c8adults24[0]);
        c8.setYearf8(c8adults24[1]);
        c8.setYearm9(c8adults29[0]);
        c8.setYearf9(c8adults29[1]);
        c8.setYearm10(c8adults34[0]);
        c8.setYearf10(c8adults34[1]);
        c8.setYearm11(c8adults39[0]);
        c8.setYearf11(c8adults39[1]);
        c8.setYearm12(c8adults44[0]);
        c8.setYearf12(c8adults44[1]);
        c8.setYearm13(c8adults49[0]);
        c8.setYearf13(c8adults49[1]);
        c8.setYearm14(c8adults50[0]);
        c8.setYearf14(c8adults50[1]);
        c8.setTotal(totalc8);

        ZimepmsReport c9 = new ZimepmsReport();
        c9.setData_name(" C9. PLHIV in care started on TB Preventive Therapy (inc TPT) (TPT registers)");
        c9.setMonthm1(c9infant3[0]);
        c9.setMonthf1(c9infant3[1]);
        c9.setMonthm2(c9infant12[0]);
        c9.setMonthf2(c9infant12[1]);
        c9.setMonthm3(c9infant24[0]);
        c9.setMonthf3(c9infant24[1]);
        c9.setMonthm4(c9infant59[0]);
        c9.setMonthf4(c9infant59[1]);
        c9.setYearm5(c9adults9[0]);
        c9.setYearf5(c9adults9[1]);
        c9.setYearm6(c9adults14[0]);
        c9.setYearf6(c9adults14[1]);
        c9.setYearm7(c9adults19[0]);
        c9.setYearf7(c9adults19[1]);
        c9.setYearm8(c9adults24[0]);
        c9.setYearf8(c9adults24[1]);
        c9.setYearm9(c9adults29[0]);
        c9.setYearf9(c9adults29[1]);
        c9.setYearm10(c9adults34[0]);
        c9.setYearf10(c9adults34[1]);
        c9.setYearm11(c9adults39[0]);
        c9.setYearf11(c9adults39[1]);
        c9.setYearm12(c9adults44[0]);
        c9.setYearf12(c9adults44[1]);
        c9.setYearm13(c9adults49[0]);
        c9.setYearf13(c9adults49[1]);
        c9.setYearm14(c9adults50[0]);
        c9.setYearf14(c9adults50[1]);
        c9.setTotal(totalc9);

        ZimepmsReport c10 = new ZimepmsReport();
        c10.setData_name(" C10. PLHIV in care on TB Preventive Therapy (inc TPT) who developed adverse events. (TPT/Essential Changes registers)");
        c10.setMonthm1(c10infant3[0]);
        c10.setMonthf1(c10infant3[1]);
        c10.setMonthm2(c10infant12[0]);
        c10.setMonthf2(c10infant12[1]);
        c10.setMonthm3(c10infant24[0]);
        c10.setMonthf3(c10infant24[1]);
        c10.setMonthm4(c10infant59[0]);
        c10.setMonthf4(c10infant59[1]);
        c10.setYearm5(c10adults9[0]);
        c10.setYearf5(c10adults9[1]);
        c10.setYearm6(c10adults14[0]);
        c10.setYearf6(c10adults14[1]);
        c10.setYearm7(c10adults19[0]);
        c10.setYearf7(c10adults19[1]);
        c10.setYearm8(c10adults24[0]);
        c10.setYearf8(c10adults24[1]);
        c10.setYearm9(c10adults29[0]);
        c10.setYearf9(c10adults29[1]);
        c10.setYearm10(c10adults34[0]);
        c10.setYearf10(c10adults34[1]);
        c10.setYearm11(c10adults39[0]);
        c10.setYearf11(c10adults39[1]);
        c10.setYearm12(c10adults44[0]);
        c10.setYearf12(c10adults44[1]);
        c10.setYearm13(c10adults49[0]);
        c10.setYearf13(c10adults49[1]);
        c10.setYearm14(c10adults50[0]);
        c10.setYearf14(c10adults50[1]);
        c10.setTotal(totalc10);

        ZimepmsReport c11 = new ZimepmsReport();
        c11.setData_name(" C11. PLHIV in care who stopped on TB Preventive Therapy (inc TPT) due to severe adverse events* (TPT/Essential Changes registers)");
        c11.setMonthm1(c11infant3[0]);
        c11.setMonthf1(c11infant3[1]);
        c11.setMonthm2(c11infant12[0]);
        c11.setMonthf2(c11infant12[1]);
        c11.setMonthm3(c11infant24[0]);
        c11.setMonthf3(c11infant24[1]);
        c11.setMonthm4(c11infant59[0]);
        c11.setMonthf4(c11infant59[1]);
        c11.setYearm5(c11adults9[0]);
        c11.setYearf5(c11adults9[1]);
        c11.setYearm6(c11adults14[0]);
        c11.setYearf6(c11adults14[1]);
        c11.setYearm7(c11adults19[0]);
        c11.setYearf7(c11adults19[1]);
        c11.setYearm8(c11adults24[0]);
        c11.setYearf8(c11adults24[1]);
        c11.setYearm9(c11adults29[0]);
        c11.setYearf9(c11adults29[1]);
        c11.setYearm10(c11adults34[0]);
        c11.setYearf10(c11adults34[1]);
        c11.setYearm11(c11adults39[0]);
        c11.setYearf11(c11adults39[1]);
        c11.setYearm12(c11adults44[0]);
        c11.setYearf12(c11adults44[1]);
        c11.setYearm13(c11adults49[0]);
        c11.setYearf13(c11adults49[1]);
        c11.setYearm14(c11adults50[0]);
        c11.setYearf14(c11adults50[1]);
        c11.setTotal(totalc11);

        ZimepmsReport c12 = new ZimepmsReport();
        c12.setData_name(" C12. PLHIV in care on TB Preventive Therapy (inc TPT) developing active TB disease. (TPT registers)");
        c12.setMonthm1(c12infant3[0]);
        c12.setMonthf1(c12infant3[1]);
        c12.setMonthm2(c12infant12[0]);
        c12.setMonthf2(c12infant12[1]);
        c12.setMonthm3(c12infant24[0]);
        c12.setMonthf3(c12infant24[1]);
        c12.setMonthm4(c12infant59[0]);
        c12.setMonthf4(c12infant59[1]);
        c12.setYearm5(c12adults9[0]);
        c12.setYearf5(c12adults9[1]);
        c12.setYearm6(c12adults14[0]);
        c12.setYearf6(c12adults14[1]);
        c12.setYearm7(c12adults19[0]);
        c12.setYearf7(c12adults19[1]);
        c12.setYearm8(c12adults24[0]);
        c12.setYearf8(c12adults24[1]);
        c12.setYearm9(c12adults29[0]);
        c12.setYearf9(c12adults29[1]);
        c12.setYearm10(c12adults34[0]);
        c12.setYearf10(c12adults34[1]);
        c12.setYearm11(c12adults39[0]);
        c12.setYearf11(c12adults39[1]);
        c12.setYearm12(c12adults44[0]);
        c12.setYearf12(c12adults44[1]);
        c12.setYearm13(c12adults49[0]);
        c12.setYearf13(c12adults49[1]);
        c12.setYearm14(c12adults50[0]);
        c12.setYearf14(c12adults50[1]);
        c12.setTotal(totalc12);

        ZimepmsReport c13 = new ZimepmsReport();
        c13.setData_name(" C13. PLHIV in care who completed TB Preventive Therapy (inc TPT) course. (TPT registers)");
        c13.setMonthm1(c13infant3[0]);
        c13.setMonthf1(c13infant3[1]);
        c13.setMonthm2(c13infant12[0]);
        c13.setMonthf2(c13infant12[1]);
        c13.setMonthm3(c13infant24[0]);
        c13.setMonthf3(c13infant24[1]);
        c13.setMonthm4(c13infant59[0]);
        c13.setMonthf4(c13infant59[1]);
        c13.setYearm5(c13adults9[0]);
        c13.setYearf5(c13adults9[1]);
        c13.setYearm6(c13adults14[0]);
        c13.setYearf6(c13adults14[1]);
        c13.setYearm7(c13adults19[0]);
        c13.setYearf7(c13adults19[1]);
        c13.setYearm8(c13adults24[0]);
        c13.setYearf8(c13adults24[1]);
        c13.setYearm9(c13adults29[0]);
        c13.setYearf9(c13adults29[1]);
        c13.setYearm10(c13adults34[0]);
        c13.setYearf10(c13adults34[1]);
        c13.setYearm11(c13adults39[0]);
        c13.setYearf11(c13adults39[1]);
        c13.setYearm12(c13adults44[0]);
        c13.setYearf12(c13adults44[1]);
        c13.setYearm13(c13adults49[0]);
        c13.setYearf13(c13adults49[1]);
        c13.setYearm14(c13adults50[0]);
        c13.setYearf14(c13adults50[1]);
        c13.setTotal(totalc13);

        //Adding data to List
        listData.add(c1);
        listData.add(c2);
        listData.add(c3);
        listData.add(c4);
        listData.add(c5);
        listData.add(c6);
        listData.add(c7);
        listData.add(c8);
        listData.add(c9);
        listData.add(c10);
        listData.add(c11);
        listData.add(c12);
        listData.add(c13);

        return listData;
    }

    public String getReportTitle() {
        String title = "Section C HIV/TB COLLABORATION";

        return title;

    }

    public String getReportName() {
        String title = "Section C";

        return title;
    }

    public String getPeriod() {
        String period = "December 2022";

        return period;
    }

}
