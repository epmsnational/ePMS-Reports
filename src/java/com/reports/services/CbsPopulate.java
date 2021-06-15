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
import com.vmmc.services.EpmsReportsCbs;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ignatious
 */
public class CbsPopulate {

    public List<ZimepmsReport> populateReport(Date ReportDate) {
        List<ZimepmsReport> listData = new ArrayList<>();
        EpmsReportsCbs epmsReports = new EpmsReportsCbs();
        CountersAdults adults = new CountersAdults();
        CountersInfants infants = new CountersInfants();
        DataCleaner cleanData = new DataCleaner();
        
        //Cb1 Variables
       int[] cb1infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 0, 3);
        int[] cb1infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 4, 12);
        int[] cb1infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 13, 24);
        int[] cb1infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 25, 59);
        int[] cb1adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 5, 9);
        int[] cb1adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 10, 14);
        int[] cb1adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 15, 19);
        int[] cb1adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 20, 24);
        int[] cb1adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 25, 29);
        int[] cb1adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 30, 34);
        int[] cb1adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 35, 39);
        int[] cb1adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 40, 44);
        int[] cb1adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 45, 49);
        int[] cb1adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(epmsReports.getCaseBaseNotification(), ReportDate), 50, 100);
        
        int totalcb1 = cb1infant3[0] + cb1infant3[1] + cb1infant12[0] + cb1infant12[1] + cb1infant24[0] + cb1infant24[1] + cb1infant59[0] + cb1infant59[1] + cb1adults9[0] + cb1adults9[1]
                + cb1adults14[0] + cb1adults14[1] + cb1adults19[0] + cb1adults19[1] + cb1adults24[0] + cb1adults24[1] + cb1adults29[0] + cb1adults29[1] + cb1adults34[0] + cb1adults34[1]
                + cb1adults39[0] + cb1adults39[1] + cb1adults44[0] + cb1adults44[1] + cb1adults49[0] + cb1adults49[1] + cb1adults50[0] + cb1adults50[1];
        
        //Cb2 Variables
        int[] cb2infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb2infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb2infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb2infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb2adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb2adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb2adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb2adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb2adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb2adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb2adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb2adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb2adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb2adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestRecent(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
       
        int totalcb2 = cb2infant3[0] + cb2infant3[1] + cb2infant12[0] + cb2infant12[1] + cb2infant24[0] + cb2infant24[1] + cb2infant59[0] + cb2infant59[1] + cb2adults9[0] + cb2adults9[1]
                + cb2adults14[0] + cb2adults14[1] + cb2adults19[0] + cb2adults19[1] + cb2adults24[0] + cb2adults24[1] + cb2adults29[0] + cb2adults29[1] + cb2adults34[0] + cb2adults34[1]
                + cb2adults39[0] + cb2adults39[1] + cb2adults44[0] + cb2adults44[1] + cb2adults49[0] + cb2adults49[1] + cb2adults50[0] + cb2adults50[1];
        
        //Cb3 Variables
        int[] cb3infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb3infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb3infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb3infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb3adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb3adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb3adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb3adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb3adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb3adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb3adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb3adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb3adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb3adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNotDone(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb3 = cb3infant3[0] + cb3infant3[1] + cb3infant12[0] + cb3infant12[1] + cb3infant24[0] + cb3infant24[1] + cb3infant59[0] + cb3infant59[1] + cb3adults9[0] + cb3adults9[1]
                + cb3adults14[0] + cb3adults14[1] + cb3adults19[0] + cb3adults19[1] + cb3adults24[0] + cb3adults24[1] + cb3adults29[0] + cb3adults29[1] + cb3adults34[0] + cb3adults34[1]
                + cb3adults39[0] + cb3adults39[1] + cb3adults44[0] + cb3adults44[1] + cb3adults49[0] + cb3adults49[1] + cb3adults50[0] + cb3adults50[1];
        
        //Cb4 Variables
        int[] cb4infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb4infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb4infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb4infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb4adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb4adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb4adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb4adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb4adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb4adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb4adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb4adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb4adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb4adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestLongTerm(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb4 = cb4infant3[0] + cb4infant3[1] + cb4infant12[0] + cb4infant12[1] + cb4infant24[0] + cb4infant24[1] + cb4infant59[0] + cb4infant59[1] + cb4adults9[0] + cb4adults9[1]
                + cb4adults14[0] + cb4adults14[1] + cb4adults19[0] + cb4adults19[1] + cb4adults24[0] + cb4adults24[1] + cb4adults29[0] + cb4adults29[1] + cb4adults34[0] + cb4adults34[1]
                + cb4adults39[0] + cb4adults39[1] + cb4adults44[0] + cb4adults44[1] + cb4adults49[0] + cb4adults49[1] + cb4adults50[0] + cb4adults50[1];
        
        //Cb5 Variables
        int[] cb5infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb5infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb5infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb5infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb5adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb5adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb5adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb5adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb5adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb5adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb5adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb5adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb5adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb5adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestInvalid(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb5 = cb5infant3[0] + cb5infant3[1] + cb5infant12[0] + cb5infant12[1] + cb5infant24[0] + cb5infant24[1] + cb5infant59[0] + cb5infant59[1] + cb5adults9[0] + cb5adults9[1]
                + cb5adults14[0] + cb5adults14[1] + cb5adults19[0] + cb5adults19[1] + cb5adults24[0] + cb5adults24[1] + cb5adults29[0] + cb5adults29[1] + cb5adults34[0] + cb5adults34[1]
                + cb5adults39[0] + cb5adults39[1] + cb5adults44[0] + cb5adults44[1] + cb5adults49[0] + cb5adults49[1] + cb5adults50[0] + cb5adults50[1];
        
        //Cb6 Variables
        int[] cb6infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb6infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb6infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb6infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb6adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb6adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb6adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb6adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb6adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb6adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb6adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb6adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb6adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb6adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getRecencyTestNegative(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb6 = cb6infant3[0] + cb6infant3[1] + cb6infant12[0] + cb6infant12[1] + cb6infant24[0] + cb6infant24[1] + cb6infant59[0] + cb6infant59[1] + cb6adults9[0] + cb6adults9[1]
                + cb6adults14[0] + cb6adults14[1] + cb6adults19[0] + cb6adults19[1] + cb6adults24[0] + cb6adults24[1] + cb6adults29[0] + cb6adults29[1] + cb6adults34[0] + cb6adults34[1]
                + cb6adults39[0] + cb6adults39[1] + cb6adults44[0] + cb6adults44[1] + cb6adults49[0] + cb6adults49[1] + cb6adults50[0] + cb6adults50[1];
        
        //Cb7 Variables
        int[] cb7infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb7infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb7infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb7infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb7adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb7adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb7adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb7adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb7adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb7adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb7adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb7adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb7adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb7adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage1(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb7 = cb7infant3[0] + cb7infant3[1] + cb7infant12[0] + cb7infant12[1] + cb7infant24[0] + cb7infant24[1] + cb7infant59[0] + cb7infant59[1] + cb7adults9[0] + cb7adults9[1]
                + cb7adults14[0] + cb7adults14[1] + cb7adults19[0] + cb7adults19[1] + cb7adults24[0] + cb7adults24[1] + cb7adults29[0] + cb7adults29[1] + cb7adults34[0] + cb7adults34[1]
                + cb7adults39[0] + cb7adults39[1] + cb7adults44[0] + cb7adults44[1] + cb7adults49[0] + cb7adults49[1] + cb7adults50[0] + cb7adults50[1];
        
        //Cb8 Variables
        int[] cb8infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb8infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb8infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb8infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb8adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb8adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb8adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb8adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb8adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb8adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb8adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb8adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb8adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb8adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage2(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb8 = cb8infant3[0] + cb8infant3[1] + cb8infant12[0] + cb8infant12[1] + cb8infant24[0] + cb8infant24[1] + cb8infant59[0] + cb8infant59[1] + cb8adults9[0] + cb8adults9[1]
                + cb8adults14[0] + cb8adults14[1] + cb8adults19[0] + cb8adults19[1] + cb8adults24[0] + cb8adults24[1] + cb8adults29[0] + cb8adults29[1] + cb8adults34[0] + cb8adults34[1]
                + cb8adults39[0] + cb8adults39[1] + cb8adults44[0] + cb8adults44[1] + cb8adults49[0] + cb8adults49[1] + cb8adults50[0] + cb8adults50[1];
        
        //Cb9 Variables
        int[] cb9infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb9infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb9infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb9infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb9adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb9adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb9adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb9adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb9adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb9adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb9adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb9adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb9adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb9adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage3(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb9 = cb9infant3[0] + cb9infant3[1] + cb9infant12[0] + cb9infant12[1] + cb9infant24[0] + cb9infant24[1] + cb9infant59[0] + cb9infant59[1] + cb9adults9[0] + cb9adults9[1]
                + cb9adults14[0] + cb9adults14[1] + cb9adults19[0] + cb9adults19[1] + cb9adults24[0] + cb9adults24[1] + cb9adults29[0] + cb9adults29[1] + cb9adults34[0] + cb9adults34[1]
                + cb9adults39[0] + cb9adults39[1] + cb9adults44[0] + cb9adults44[1] + cb9adults49[0] + cb9adults49[1] + cb9adults50[0] + cb9adults50[1];
        
        //Cb10 Variables
        int[] cb10infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb10infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb10infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb10infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb10adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb10adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb10adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb10adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb10adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb10adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb10adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb10adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb10adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb10adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getWhoStage4(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb10 = cb10infant3[0] + cb10infant3[1] + cb10infant12[0] + cb10infant12[1] + cb10infant24[0] + cb10infant24[1] + cb10infant59[0] + cb10infant59[1] + cb10adults9[0] + cb10adults9[1]
                + cb10adults14[0] + cb10adults14[1] + cb10adults19[0] + cb10adults19[1] + cb10adults24[0] + cb10adults24[1] + cb10adults29[0] + cb10adults29[1] + cb10adults34[0] + cb10adults34[1]
                + cb10adults39[0] + cb10adults39[1] + cb10adults44[0] + cb10adults44[1] + cb10adults49[0] + cb10adults49[1] + cb10adults50[0] + cb10adults50[1];
        
        //Cb11 Variables
        int[] cb11infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb11infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb11infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb11infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb11adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb11adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb11adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb11adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb11adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb11adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb11adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb11adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb11adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb11adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountLow(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb11 = cb11infant3[0] + cb11infant3[1] + cb11infant12[0] + cb11infant12[1] + cb11infant24[0] + cb11infant24[1] + cb11infant59[0] + cb11infant59[1] + cb11adults9[0] + cb11adults9[1]
                + cb11adults14[0] + cb11adults14[1] + cb11adults19[0] + cb11adults19[1] + cb11adults24[0] + cb11adults24[1] + cb11adults29[0] + cb11adults29[1] + cb11adults34[0] + cb11adults34[1]
                + cb11adults39[0] + cb11adults39[1] + cb11adults44[0] + cb11adults44[1] + cb11adults49[0] + cb11adults49[1] + cb11adults50[0] + cb11adults50[1];
        
        //Cb12 Variables
        int[] cb12infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb12infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb12infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb12infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb12adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb12adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb12adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb12adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb12adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb12adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb12adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb12adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb12adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb12adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountMild(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb12 = cb12infant3[0] + cb12infant3[1] + cb12infant12[0] + cb12infant12[1] + cb12infant24[0] + cb12infant24[1] + cb12infant59[0] + cb12infant59[1] + cb12adults9[0] + cb12adults9[1]
                + cb12adults14[0] + cb12adults14[1] + cb12adults19[0] + cb12adults19[1] + cb12adults24[0] + cb12adults24[1] + cb12adults29[0] + cb12adults29[1] + cb12adults34[0] + cb12adults34[1]
                + cb12adults39[0] + cb12adults39[1] + cb12adults44[0] + cb12adults44[1] + cb12adults49[0] + cb12adults49[1] + cb12adults50[0] + cb12adults50[1];
        
        //Cb13 Variables
        int[] cb13infant3 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 0, 3);
        int[] cb13infant12 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 4, 12);
        int[] cb13infant24 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 13, 24);
        int[] cb13infant59 = infants.getTotalInfantsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 25, 59);
        int[] cb13adults9 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 5, 9);
        int[] cb13adults14 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 10, 14);
        int[] cb13adults19 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 15, 19);
        int[] cb13adults24 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 20, 24);
        int[] cb13adults29 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 25, 29);
        int[] cb13adults34 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 30, 34);
        int[] cb13adults39 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 35, 39);
        int[] cb13adults44 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 40, 44);
        int[] cb13adults49 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 45, 49);
        int[] cb13adults50 = adults.getTotalAdultsInCaseBaseNotification(cleanData.CaseBaseNotification(cleanData.getCdCountHigh(epmsReports.getCaseBaseNotification()), ReportDate), 50, 100);
        
        int totalcb13 = cb13infant3[0] + cb13infant3[1] + cb13infant12[0] + cb13infant12[1] + cb13infant24[0] + cb13infant24[1] + cb13infant59[0] + cb13infant59[1] + cb13adults9[0] + cb13adults9[1]
                + cb13adults14[0] + cb13adults14[1] + cb13adults19[0] + cb13adults19[1] + cb13adults24[0] + cb13adults24[1] + cb13adults29[0] + cb13adults29[1] + cb13adults34[0] + cb13adults34[1]
                + cb13adults39[0] + cb13adults39[1] + cb13adults44[0] + cb13adults44[1] + cb13adults49[0] + cb13adults49[1] + cb13adults50[0] + cb13adults50[1];
        
        ZimepmsReport cb1 = new ZimepmsReport();
        cb1.setData_name("1. Number of Newly diagnosed HIV Cases");
        cb1.setMonthm1(cb1infant3[0]);
        cb1.setMonthf1(cb1infant3[1]);
        cb1.setMonthm2(cb1infant12[0]);
        cb1.setMonthf2(cb1infant12[1]);
        cb1.setMonthm3(cb1infant24[0]);
        cb1.setMonthf3(cb1infant24[1]);
        cb1.setMonthm4(cb1infant59[0]);
        cb1.setMonthf4(cb1infant59[1]);
        cb1.setYearm5(cb1adults9[0]);
        cb1.setYearf5(cb1adults9[1]);
        cb1.setYearm6(cb1adults14[0]);
        cb1.setYearf6(cb1adults14[1]);
        cb1.setYearm7(cb1adults19[0]);
        cb1.setYearf7(cb1adults19[1]);
        cb1.setYearm8(cb1adults24[0]);
        cb1.setYearf8(cb1adults24[1]);
        cb1.setYearm9(cb1adults29[0]);
        cb1.setYearf9(cb1adults29[1]);
        cb1.setYearm10(cb1adults34[0]);
        cb1.setYearf10(cb1adults34[1]);
        cb1.setYearm11(cb1adults39[0]);
        cb1.setYearf11(cb1adults39[1]);
        cb1.setYearm12(cb1adults44[0]);
        cb1.setYearf12(cb1adults44[1]);
        cb1.setYearm13(cb1adults49[0]);
        cb1.setYearf13(cb1adults49[1]);
        cb1.setYearm14(cb1adults50[0]);
        cb1.setYearf14(cb1adults50[1]);
        cb1.setTotal(totalcb1);
        
        ZimepmsReport cb2 = new ZimepmsReport();
        cb2.setData_name("2. Number of newly diagnosed HIV Cases with a Recent Infection");
        cb2.setMonthm1(cb2infant3[0]);
        cb2.setMonthf1(cb2infant3[1]);
        cb2.setMonthm2(cb2infant12[0]);
        cb2.setMonthf2(cb2infant12[1]);
        cb2.setMonthm3(cb2infant24[0]);
        cb2.setMonthf3(cb2infant24[1]);
        cb2.setMonthm4(cb2infant59[0]);
        cb2.setMonthf4(cb2infant59[1]);
        cb2.setYearm5(cb2adults9[0]);
        cb2.setYearf5(cb2adults9[1]);
        cb2.setYearm6(cb2adults14[0]);
        cb2.setYearf6(cb2adults14[1]);
        cb2.setYearm7(cb2adults19[0]);
        cb2.setYearf7(cb2adults19[1]);
        cb2.setYearm8(cb2adults24[0]);
        cb2.setYearf8(cb2adults24[1]);
        cb2.setYearm9(cb2adults29[0]);
        cb2.setYearf9(cb2adults29[1]);
        cb2.setYearm10(cb2adults34[0]);
        cb2.setYearf10(cb2adults34[1]);
        cb2.setYearm11(cb2adults39[0]);
        cb2.setYearf11(cb2adults39[1]);
        cb2.setYearm12(cb2adults44[0]);
        cb2.setYearf12(cb2adults44[1]);
        cb2.setYearm13(cb2adults49[0]);
        cb2.setYearf13(cb2adults49[1]);
        cb2.setYearm14(cb2adults50[0]);
        cb2.setYearf14(cb2adults50[1]);
        cb2.setTotal(totalcb2);
        
        ZimepmsReport cb3 = new ZimepmsReport();
        cb3.setData_name("3. Number of newly diagnosed HIV with RTRI not done");
        cb3.setMonthm1(cb3infant3[0]);
        cb3.setMonthf1(cb3infant3[1]);
        cb3.setMonthm2(cb3infant12[0]);
        cb3.setMonthf2(cb3infant12[1]);
        cb3.setMonthm3(cb3infant24[0]);
        cb3.setMonthf3(cb3infant24[1]);
        cb3.setMonthm4(cb3infant59[0]);
        cb3.setMonthf4(cb3infant59[1]);
        cb3.setYearm5(cb3adults9[0]);
        cb3.setYearf5(cb3adults9[1]);
        cb3.setYearm6(cb3adults14[0]);
        cb3.setYearf6(cb3adults14[1]);
        cb3.setYearm7(cb3adults19[0]);
        cb3.setYearf7(cb3adults19[1]);
        cb3.setYearm8(cb3adults24[0]);
        cb3.setYearf8(cb3adults24[1]);
        cb3.setYearm9(cb3adults29[0]);
        cb3.setYearf9(cb3adults29[1]);
        cb3.setYearm10(cb3adults34[0]);
        cb3.setYearf10(cb3adults34[1]);
        cb3.setYearm11(cb3adults39[0]);
        cb3.setYearf11(cb3adults39[1]);
        cb3.setYearm12(cb3adults44[0]);
        cb3.setYearf12(cb3adults44[1]);
        cb3.setYearm13(cb3adults49[0]);
        cb3.setYearf13(cb3adults49[1]);
        cb3.setYearm14(cb3adults50[0]);
        cb3.setYearf14(cb3adults50[1]);
        cb3.setTotal(totalcb3);
        
        ZimepmsReport cb4 = new ZimepmsReport();
        cb4.setData_name("4. Number of newly diagnosed HIV with Long Term infection");
        cb4.setMonthm1(cb4infant3[0]);
        cb4.setMonthf1(cb4infant3[1]);
        cb4.setMonthm2(cb4infant12[0]);
        cb4.setMonthf2(cb4infant12[1]);
        cb4.setMonthm3(cb4infant24[0]);
        cb4.setMonthf3(cb4infant24[1]);
        cb4.setMonthm4(cb4infant59[0]);
        cb4.setMonthf4(cb4infant59[1]);
        cb4.setYearm5(cb4adults9[0]);
        cb4.setYearf5(cb4adults9[1]);
        cb4.setYearm6(cb4adults14[0]);
        cb4.setYearf6(cb4adults14[1]);
        cb4.setYearm7(cb4adults19[0]);
        cb4.setYearf7(cb4adults19[1]);
        cb4.setYearm8(cb4adults24[0]);
        cb4.setYearf8(cb4adults24[1]);
        cb4.setYearm9(cb4adults29[0]);
        cb4.setYearf9(cb4adults29[1]);
        cb4.setYearm10(cb4adults34[0]);
        cb4.setYearf10(cb4adults34[1]);
        cb4.setYearm11(cb4adults39[0]);
        cb4.setYearf11(cb4adults39[1]);
        cb4.setYearm12(cb4adults44[0]);
        cb4.setYearf12(cb4adults44[1]);
        cb4.setYearm13(cb4adults49[0]);
        cb4.setYearf13(cb4adults49[1]);
        cb4.setYearm14(cb4adults50[0]);
        cb4.setYearf14(cb4adults50[1]);
        cb4.setTotal(totalcb4);
        
        ZimepmsReport cb5 = new ZimepmsReport();
        cb5.setData_name("5. Number of newly diagnosed HIV with Invalid Results");
        cb5.setMonthm1(cb5infant3[0]);
        cb5.setMonthf1(cb5infant3[1]);
        cb5.setMonthm2(cb5infant12[0]);
        cb5.setMonthf2(cb5infant12[1]);
        cb5.setMonthm3(cb5infant24[0]);
        cb5.setMonthf3(cb5infant24[1]);
        cb5.setMonthm4(cb5infant59[0]);
        cb5.setMonthf4(cb5infant59[1]);
        cb5.setYearm5(cb5adults9[0]);
        cb5.setYearf5(cb5adults9[1]);
        cb5.setYearm6(cb5adults14[0]);
        cb5.setYearf6(cb5adults14[1]);
        cb5.setYearm7(cb5adults19[0]);
        cb5.setYearf7(cb5adults19[1]);
        cb5.setYearm8(cb5adults24[0]);
        cb5.setYearf8(cb5adults24[1]);
        cb5.setYearm9(cb5adults29[0]);
        cb5.setYearf9(cb5adults29[1]);
        cb5.setYearm10(cb5adults34[0]);
        cb5.setYearf10(cb5adults34[1]);
        cb5.setYearm11(cb5adults39[0]);
        cb5.setYearf11(cb5adults39[1]);
        cb5.setYearm12(cb5adults44[0]);
        cb5.setYearf12(cb5adults44[1]);
        cb5.setYearm13(cb5adults49[0]);
        cb5.setYearf13(cb5adults49[1]);
        cb5.setYearm14(cb5adults50[0]);
        cb5.setYearf14(cb5adults50[1]);
        cb5.setTotal(totalcb5);
        
        ZimepmsReport cb6 = new ZimepmsReport();
        cb6.setData_name("6. Number of newly diagnosed HIV with RTRI Negative");
        cb6.setMonthm1(cb6infant3[0]);
        cb6.setMonthf1(cb6infant3[1]);
        cb6.setMonthm2(cb6infant12[0]);
        cb6.setMonthf2(cb6infant12[1]);
        cb6.setMonthm3(cb6infant24[0]);
        cb6.setMonthf3(cb6infant24[1]);
        cb6.setMonthm4(cb6infant59[0]);
        cb6.setMonthf4(cb6infant59[1]);
        cb6.setYearm5(cb6adults9[0]);
        cb6.setYearf5(cb6adults9[1]);
        cb6.setYearm6(cb6adults14[0]);
        cb6.setYearf6(cb6adults14[1]);
        cb6.setYearm7(cb6adults19[0]);
        cb6.setYearf7(cb6adults19[1]);
        cb6.setYearm8(cb6adults24[0]);
        cb6.setYearf8(cb6adults24[1]);
        cb6.setYearm9(cb6adults29[0]);
        cb6.setYearf9(cb6adults29[1]);
        cb6.setYearm10(cb6adults34[0]);
        cb6.setYearf10(cb6adults34[1]);
        cb6.setYearm11(cb6adults39[0]);
        cb6.setYearf11(cb6adults39[1]);
        cb6.setYearm12(cb6adults44[0]);
        cb6.setYearf12(cb6adults44[1]);
        cb6.setYearm13(cb6adults49[0]);
        cb6.setYearf13(cb6adults49[1]);
        cb6.setYearm14(cb6adults50[0]);
        cb6.setYearf14(cb6adults50[1]);
        cb6.setTotal(totalcb6);
        
        ZimepmsReport cb7 = new ZimepmsReport();
        cb7.setData_name("7. Number of Newly diagnosed HIV Cases at WHO Stage 1");
        cb7.setMonthm1(cb7infant3[0]);
        cb7.setMonthf1(cb7infant3[1]);
        cb7.setMonthm2(cb7infant12[0]);
        cb7.setMonthf2(cb7infant12[1]);
        cb7.setMonthm3(cb7infant24[0]);
        cb7.setMonthf3(cb7infant24[1]);
        cb7.setMonthm4(cb7infant59[0]);
        cb7.setMonthf4(cb7infant59[1]);
        cb7.setYearm5(cb7adults9[0]);
        cb7.setYearf5(cb7adults9[1]);
        cb7.setYearm6(cb7adults14[0]);
        cb7.setYearf6(cb7adults14[1]);
        cb7.setYearm7(cb7adults19[0]);
        cb7.setYearf7(cb7adults19[1]);
        cb7.setYearm8(cb7adults24[0]);
        cb7.setYearf8(cb7adults24[1]);
        cb7.setYearm9(cb7adults29[0]);
        cb7.setYearf9(cb7adults29[1]);
        cb7.setYearm10(cb7adults34[0]);
        cb7.setYearf10(cb7adults34[1]);
        cb7.setYearm11(cb7adults39[0]);
        cb7.setYearf11(cb7adults39[1]);
        cb7.setYearm12(cb7adults44[0]);
        cb7.setYearf12(cb7adults44[1]);
        cb7.setYearm13(cb7adults49[0]);
        cb7.setYearf13(cb7adults49[1]);
        cb7.setYearm14(cb7adults50[0]);
        cb7.setYearf14(cb7adults50[1]);
        cb7.setTotal(totalcb7);
        
        ZimepmsReport cb8 = new ZimepmsReport();
        cb8.setData_name("8. Number of Newly diagnosed HIV Cases at WHO Stage 2");
        cb8.setMonthm1(cb8infant3[0]);
        cb8.setMonthf1(cb8infant3[1]);
        cb8.setMonthm2(cb8infant12[0]);
        cb8.setMonthf2(cb8infant12[1]);
        cb8.setMonthm3(cb8infant24[0]);
        cb8.setMonthf3(cb8infant24[1]);
        cb8.setMonthm4(cb8infant59[0]);
        cb8.setMonthf4(cb8infant59[1]);
        cb8.setYearm5(cb8adults9[0]);
        cb8.setYearf5(cb8adults9[1]);
        cb8.setYearm6(cb8adults14[0]);
        cb8.setYearf6(cb8adults14[1]);
        cb8.setYearm7(cb8adults19[0]);
        cb8.setYearf7(cb8adults19[1]);
        cb8.setYearm8(cb8adults24[0]);
        cb8.setYearf8(cb8adults24[1]);
        cb8.setYearm9(cb8adults29[0]);
        cb8.setYearf9(cb8adults29[1]);
        cb8.setYearm10(cb8adults34[0]);
        cb8.setYearf10(cb8adults34[1]);
        cb8.setYearm11(cb8adults39[0]);
        cb8.setYearf11(cb8adults39[1]);
        cb8.setYearm12(cb8adults44[0]);
        cb8.setYearf12(cb8adults44[1]);
        cb8.setYearm13(cb8adults49[0]);
        cb8.setYearf13(cb8adults49[1]);
        cb8.setYearm14(cb8adults50[0]);
        cb8.setYearf14(cb8adults50[1]);
        cb8.setTotal(totalcb8);
        
        ZimepmsReport cb9 = new ZimepmsReport();
        cb9.setData_name("9. Number of Newly diagnosed HIV Cases at WHO Stage 3");
        cb9.setMonthm1(cb9infant3[0]);
        cb9.setMonthf1(cb9infant3[1]);
        cb9.setMonthm2(cb9infant12[0]);
        cb9.setMonthf2(cb9infant12[1]);
        cb9.setMonthm3(cb9infant24[0]);
        cb9.setMonthf3(cb9infant24[1]);
        cb9.setMonthm4(cb9infant59[0]);
        cb9.setMonthf4(cb9infant59[1]);
        cb9.setYearm5(cb9adults9[0]);
        cb9.setYearf5(cb9adults9[1]);
        cb9.setYearm6(cb9adults14[0]);
        cb9.setYearf6(cb9adults14[1]);
        cb9.setYearm7(cb9adults19[0]);
        cb9.setYearf7(cb9adults19[1]);
        cb9.setYearm8(cb9adults24[0]);
        cb9.setYearf8(cb9adults24[1]);
        cb9.setYearm9(cb9adults29[0]);
        cb9.setYearf9(cb9adults29[1]);
        cb9.setYearm10(cb9adults34[0]);
        cb9.setYearf10(cb9adults34[1]);
        cb9.setYearm11(cb9adults39[0]);
        cb9.setYearf11(cb9adults39[1]);
        cb9.setYearm12(cb9adults44[0]);
        cb9.setYearf12(cb9adults44[1]);
        cb9.setYearm13(cb9adults49[0]);
        cb9.setYearf13(cb9adults49[1]);
        cb9.setYearm14(cb9adults50[0]);
        cb9.setYearf14(cb9adults50[1]);
        cb9.setTotal(totalcb9);
        
        ZimepmsReport cb10 = new ZimepmsReport();
        cb10.setData_name("10. Number of Newly diagnosed HIV Cases at WHO Stage 4");
        cb10.setMonthm1(cb10infant3[0]);
        cb10.setMonthf1(cb10infant3[1]);
        cb10.setMonthm2(cb10infant12[0]);
        cb10.setMonthf2(cb10infant12[1]);
        cb10.setMonthm3(cb10infant24[0]);
        cb10.setMonthf3(cb10infant24[1]);
        cb10.setMonthm4(cb10infant59[0]);
        cb10.setMonthf4(cb10infant59[1]);
        cb10.setYearm5(cb10adults9[0]);
        cb10.setYearf5(cb10adults9[1]);
        cb10.setYearm6(cb10adults14[0]);
        cb10.setYearf6(cb10adults14[1]);
        cb10.setYearm7(cb10adults19[0]);
        cb10.setYearf7(cb10adults19[1]);
        cb10.setYearm8(cb10adults24[0]);
        cb10.setYearf8(cb10adults24[1]);
        cb10.setYearm9(cb10adults29[0]);
        cb10.setYearf9(cb10adults29[1]);
        cb10.setYearm10(cb10adults34[0]);
        cb10.setYearf10(cb10adults34[1]);
        cb10.setYearm11(cb10adults39[0]);
        cb10.setYearf11(cb10adults39[1]);
        cb10.setYearm12(cb10adults44[0]);
        cb10.setYearf12(cb10adults44[1]);
        cb10.setYearm13(cb10adults49[0]);
        cb10.setYearf13(cb10adults49[1]);
        cb10.setYearm14(cb10adults50[0]);
        cb10.setYearf14(cb10adults50[1]);
        cb10.setTotal(totalcb10);
        
        ZimepmsReport cb11 = new ZimepmsReport();
        cb11.setData_name("11. Number of Newly diagnosed HIV Cases with CD 4 count < 200");
        cb11.setMonthm1(cb11infant3[0]);
        cb11.setMonthf1(cb11infant3[1]);
        cb11.setMonthm2(cb11infant12[0]);
        cb11.setMonthf2(cb11infant12[1]);
        cb11.setMonthm3(cb11infant24[0]);
        cb11.setMonthf3(cb11infant24[1]);
        cb11.setMonthm4(cb11infant59[0]);
        cb11.setMonthf4(cb11infant59[1]);
        cb11.setYearm5(cb11adults9[0]);
        cb11.setYearf5(cb11adults9[1]);
        cb11.setYearm6(cb11adults14[0]);
        cb11.setYearf6(cb11adults14[1]);
        cb11.setYearm7(cb11adults19[0]);
        cb11.setYearf7(cb11adults19[1]);
        cb11.setYearm8(cb11adults24[0]);
        cb11.setYearf8(cb11adults24[1]);
        cb11.setYearm9(cb11adults29[0]);
        cb11.setYearf9(cb11adults29[1]);
        cb11.setYearm10(cb11adults34[0]);
        cb11.setYearf10(cb11adults34[1]);
        cb11.setYearm11(cb11adults39[0]);
        cb11.setYearf11(cb11adults39[1]);
        cb11.setYearm12(cb11adults44[0]);
        cb11.setYearf12(cb11adults44[1]);
        cb11.setYearm13(cb11adults49[0]);
        cb11.setYearf13(cb11adults49[1]);
        cb11.setYearm14(cb11adults50[0]);
        cb11.setYearf14(cb11adults50[1]);
        cb11.setTotal(totalcb11);
        
        ZimepmsReport cb12 = new ZimepmsReport();
        cb12.setData_name("12. Number of Newly diagnosed HIV Cases with CD 4 count between 200 and 499");
        cb12.setMonthm1(cb12infant3[0]);
        cb12.setMonthf1(cb12infant3[1]);
        cb12.setMonthm2(cb12infant12[0]);
        cb12.setMonthf2(cb12infant12[1]);
        cb12.setMonthm3(cb12infant24[0]);
        cb12.setMonthf3(cb12infant24[1]);
        cb12.setMonthm4(cb12infant59[0]);
        cb12.setMonthf4(cb12infant59[1]);
        cb12.setYearm5(cb12adults9[0]);
        cb12.setYearf5(cb12adults9[1]);
        cb12.setYearm6(cb12adults14[0]);
        cb12.setYearf6(cb12adults14[1]);
        cb12.setYearm7(cb12adults19[0]);
        cb12.setYearf7(cb12adults19[1]);
        cb12.setYearm8(cb12adults24[0]);
        cb12.setYearf8(cb12adults24[1]);
        cb12.setYearm9(cb12adults29[0]);
        cb12.setYearf9(cb12adults29[1]);
        cb12.setYearm10(cb12adults34[0]);
        cb12.setYearf10(cb12adults34[1]);
        cb12.setYearm11(cb12adults39[0]);
        cb12.setYearf11(cb12adults39[1]);
        cb12.setYearm12(cb12adults44[0]);
        cb12.setYearf12(cb12adults44[1]);
        cb12.setYearm13(cb12adults49[0]);
        cb12.setYearf13(cb12adults49[1]);
        cb12.setYearm14(cb12adults50[0]);
        cb12.setYearf14(cb12adults50[1]);
        cb12.setTotal(totalcb12);
        
        ZimepmsReport cb13 = new ZimepmsReport();
        cb13.setData_name("13. Number of Newly diagnosed HIV Cases with CD 4 count < 500");
        cb13.setMonthm1(cb13infant3[0]);
        cb13.setMonthf1(cb13infant3[1]);
        cb13.setMonthm2(cb13infant12[0]);
        cb13.setMonthf2(cb13infant12[1]);
        cb13.setMonthm3(cb13infant24[0]);
        cb13.setMonthf3(cb13infant24[1]);
        cb13.setMonthm4(cb13infant59[0]);
        cb13.setMonthf4(cb13infant59[1]);
        cb13.setYearm5(cb13adults9[0]);
        cb13.setYearf5(cb13adults9[1]);
        cb13.setYearm6(cb13adults14[0]);
        cb13.setYearf6(cb13adults14[1]);
        cb13.setYearm7(cb13adults19[0]);
        cb13.setYearf7(cb13adults19[1]);
        cb13.setYearm8(cb13adults24[0]);
        cb13.setYearf8(cb13adults24[1]);
        cb13.setYearm9(cb13adults29[0]);
        cb13.setYearf9(cb13adults29[1]);
        cb13.setYearm10(cb13adults34[0]);
        cb13.setYearf10(cb13adults34[1]);
        cb13.setYearm11(cb13adults39[0]);
        cb13.setYearf11(cb13adults39[1]);
        cb13.setYearm12(cb13adults44[0]);
        cb13.setYearf12(cb13adults44[1]);
        cb13.setYearm13(cb13adults49[0]);
        cb13.setYearf13(cb13adults49[1]);
        cb13.setYearm14(cb13adults50[0]);
        cb13.setYearf14(cb13adults50[1]);
        cb13.setTotal(totalcb13);
        
        
        listData.add(cb1);
        listData.add(cb2);
        listData.add(cb3);
        listData.add(cb4);
        listData.add(cb5);
        listData.add(cb6);
        listData.add(cb7);
        listData.add(cb8);
        listData.add(cb9);
        listData.add(cb10);
        listData.add(cb11);
        listData.add(cb12);
        listData.add(cb13);
        
        return listData;
    }
    
    public String getReportTitle() {
        String title = "CASE BASE SURVEILLANCE";

        return title;

    }

    public String getReportName() {
        String title = "Section CBS";

        return title;
    }

    public String getPeriod() {
        String period = "December 2022";

        return period;
    }

}
