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
import com.vmmc.services.EpmsReportsSectionD;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ignatious
 */
public class OpportunisticInfectionsAndAntiretrovialTherapyPopulate {

    public List<ZimepmsReport> populateReport(Date ReportDate) {
        List<ZimepmsReport> listData = new ArrayList<>();
        EpmsReportsSectionD epmsReports = new EpmsReportsSectionD();
        CountersAdults adults = new CountersAdults();
        CountersInfants infants = new CountersInfants();
        DataCleaner cleanData = new DataCleaner();

        //D1 Variables 
        int[] d1infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 0, 3);
        int[] d1infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 4, 12);
        int[] d1infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 13, 24);
        int[] d1infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 25, 59);
        int[] d1adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 5, 9);
        int[] d1adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 10, 14);
        int[] d1adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 15, 19);
        int[] d1adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 20, 24);
        int[] d1adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 25, 29);
        int[] d1adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 30, 34);
        int[] d1adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 35, 39);
        int[] d1adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 40, 44);
        int[] d1adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 45, 49);
        int[] d1adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD1(epmsReports.getArtSummaryNewly()), ReportDate), 50, 100);

        int totald1 = d1infant3[0] + d1infant3[1] + d1infant12[0] + d1infant12[1] + d1infant24[0] + d1infant24[1] + d1infant59[0] + d1infant59[1] + d1adults9[0] + d1adults9[1]
                + d1adults14[0] + d1adults14[1] + d1adults19[0] + d1adults19[1] + d1adults24[0] + d1adults24[1] + d1adults29[0] + d1adults29[1] + d1adults34[0] + d1adults34[1]
                + d1adults39[0] + d1adults39[1] + d1adults44[0] + d1adults44[1] + d1adults49[0] + d1adults49[1] + d1adults50[0] + d1adults50[1];

        //D2 Variables
        int[] d2infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 0, 3);
        int[] d2infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 4, 12);
        int[] d2infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 13, 24);
        int[] d2infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 25, 59);
        int[] d2adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 5, 9);
        int[] d2adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 10, 14);
        int[] d2adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 15, 19);
        int[] d2adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 20, 24);
        int[] d2adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 25, 29);
        int[] d2adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 30, 34);
        int[] d2adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 35, 39);
        int[] d2adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 40, 44);
        int[] d2adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 45, 49);
        int[] d2adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD2(epmsReports.getArtSummaryNewly()), ReportDate), 50, 100);

        int totald2 = d2infant3[0] + d2infant3[1] + d2infant12[0] + d2infant12[1] + d2infant24[0] + d2infant24[1] + d2infant59[0] + d2infant59[1] + d2adults9[0] + d2adults9[1]
                + d2adults14[0] + d2adults14[1] + d2adults19[0] + d2adults19[1] + d2adults24[0] + d2adults24[1] + d2adults29[0] + d2adults29[1] + d2adults34[0] + d2adults34[1]
                + d2adults39[0] + d2adults39[1] + d2adults44[0] + d2adults44[1] + d2adults49[0] + d2adults49[1] + d2adults50[0] + d2adults50[1];

        //D3 Variables
        int[] d3infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 0, 3);
        int[] d3infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 4, 12);
        int[] d3infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 13, 24);
        int[] d3infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 25, 59);
        int[] d3adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 5, 9);
        int[] d3adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 10, 14);
        int[] d3adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 15, 19);
        int[] d3adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 20, 24);
        int[] d3adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 25, 29);
        int[] d3adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 30, 34);
        int[] d3adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 35, 39);
        int[] d3adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 40, 44);
        int[] d3adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 45, 49);
        int[] d3adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD3(epmsReports.getArtSummaryNewly()), ReportDate), 50, 100);

        int totald3 = d3infant3[0] + d3infant3[1] + d3infant12[0] + d3infant12[1] + d3infant24[0] + d3infant24[1] + d3infant59[0] + d3infant59[1] + d3adults9[0] + d3adults9[1]
                + d3adults14[0] + d3adults14[1] + d3adults19[0] + d3adults19[1] + d3adults24[0] + d3adults24[1] + d3adults29[0] + d3adults29[1] + d3adults34[0] + d3adults34[1]
                + d3adults39[0] + d3adults39[1] + d3adults44[0] + d3adults44[1] + d3adults49[0] + d3adults49[1] + d3adults50[0] + d3adults50[1];

        //D4 Variables
        int[] d4infant3 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 0, 3);
        int[] d4infant12 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 4, 12);
        int[] d4infant24 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 13, 24);
        int[] d4infant59 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 25, 59);
        int[] d4adults9 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 5, 9);
        int[] d4adults14 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 10, 14);
        int[] d4adults19 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 15, 19);
        int[] d4adults24 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 20, 24);
        int[] d4adults29 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 25, 29);
        int[] d4adults34 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 30, 34);
        int[] d4adults39 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 35, 39);
        int[] d4adults44 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 40, 44);
        int[] d4adults49 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 45, 49);
        int[] d4adults50 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapy(cleanData.OpportunityInfectionAndArtTherapy(cleanData.getD4(epmsReports.getTreatmentAndProphylaxis()), ReportDate), 50, 100);

        int totald4 = d4infant3[0] + d4infant3[1] + d4infant12[0] + d4infant12[1] + d4infant24[0] + d4infant24[1] + d4infant59[0] + d4infant59[1] + d4adults9[0] + d4adults9[1]
                + d4adults14[0] + d4adults14[1] + d4adults19[0] + d4adults19[1] + d4adults24[0] + d4adults24[1] + d4adults29[0] + d4adults29[1] + d4adults34[0] + d4adults34[1]
                + d4adults39[0] + d4adults39[1] + d4adults44[0] + d4adults44[1] + d4adults49[0] + d4adults49[1] + d4adults50[0] + d4adults50[1];

        //D5 Variables
        int[] d5infant3 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 0, 3);
        int[] d5infant12 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 4, 12);
        int[] d5infant24 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 13, 24);
        int[] d5infant59 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 59);
        int[] d5adults9 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 5, 9);
        int[] d5adults14 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 10, 14);
        int[] d5adults19 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 15, 19);
        int[] d5adults24 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 20, 24);
        int[] d5adults29 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 29);
        int[] d5adults34 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 30, 34);
        int[] d5adults39 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 35, 39);
        int[] d5adults44 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 40, 44);
        int[] d5adults49 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 45, 49);
        int[] d5adults50 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD5(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 50, 100);

        int totald5 = d5infant3[0] + d5infant3[1] + d5infant12[0] + d5infant12[1] + d5infant24[0] + d5infant24[1] + d5infant59[0] + d5infant59[1] + d5adults9[0] + d5adults9[1]
                + d5adults14[0] + d5adults14[1] + d5adults19[0] + d5adults19[1] + d5adults24[0] + d5adults24[1] + d5adults29[0] + d5adults29[1] + d5adults34[0] + d5adults34[1]
                + d5adults39[0] + d5adults39[1] + d5adults44[0] + d5adults44[1] + d5adults49[0] + d5adults49[1] + d5adults50[0] + d5adults50[1];

        //D6 Variables
        int[] d6infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d6infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d6infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d6infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d6adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d6adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d6adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d6adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d6adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d6adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d6adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d6adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d6adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d6adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD6(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald6 = d6infant3[0] + d6infant3[1] + d6infant12[0] + d6infant12[1] + d6infant24[0] + d6infant24[1] + d6infant59[0] + d6infant59[1] + d6adults9[0] + d6adults9[1]
                + d6adults14[0] + d6adults14[1] + d6adults19[0] + d6adults19[1] + d6adults24[0] + d6adults24[1] + d6adults29[0] + d6adults29[1] + d6adults34[0] + d6adults34[1]
                + d6adults39[0] + d6adults39[1] + d6adults44[0] + d6adults44[1] + d6adults49[0] + d6adults49[1] + d6adults50[0] + d6adults50[1];

        //D7 Variables
        int[] d7infant3 = infants.getTotalInfantsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 0, 3);
        int[] d7infant12 = infants.getTotalInfantsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 4, 12);
        int[] d7infant24 = infants.getTotalInfantsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 13, 24);
        int[] d7infant59 = infants.getTotalInfantsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 25, 59);
        int[] d7adults9 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 5, 9);
        int[] d7adults14 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 10, 14);
        int[] d7adults19 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 15, 19);
        int[] d7adults24 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 20, 24);
        int[] d7adults29 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 25, 29);
        int[] d7adults34 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 30, 34);
        int[] d7adults39 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 35, 39);
        int[] d7adults44 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 40, 44);
        int[] d7adults49 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 45, 49);
        int[] d7adults50 = adults.getTotalAdultsInPatientsTransferIn(cleanData.PatientsTransferIn(cleanData.getD7(epmsReports.getPatientsTransferIn()), ReportDate), 50, 100);

        int totald7 = d7infant3[0] + d7infant3[1] + d7infant12[0] + d7infant12[1] + d7infant24[0] + d7infant24[1] + d7infant59[0] + d7infant59[1] + d7adults9[0] + d7adults9[1]
                + d7adults14[0] + d7adults14[1] + d7adults19[0] + d7adults19[1] + d7adults24[0] + d7adults24[1] + d7adults29[0] + d7adults29[1] + d7adults34[0] + d7adults34[1]
                + d7adults39[0] + d7adults39[1] + d7adults44[0] + d7adults44[1] + d7adults49[0] + d7adults49[1] + d7adults50[0] + d7adults50[1];

        //D8 Variables
        int[] d8infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d8infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d8infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d8infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d8adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d8adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d8adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d8adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d8adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d8adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d8adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d8adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d8adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d8adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD8(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald8 = d8infant3[0] + d8infant3[1] + d8infant12[0] + d8infant12[1] + d8infant24[0] + d8infant24[1] + d8infant59[0] + d8infant59[1] + d8adults9[0] + d8adults9[1]
                + d8adults14[0] + d8adults14[1] + d8adults19[0] + d8adults19[1] + d8adults24[0] + d8adults24[1] + d8adults29[0] + d8adults29[1] + d8adults34[0] + d8adults34[1]
                + d8adults39[0] + d8adults39[1] + d8adults44[0] + d8adults44[1] + d8adults49[0] + d8adults49[1] + d8adults50[0] + d8adults50[1];

        //D10 Variables
        int[] d10infant3 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 0, 3);
        int[] d10infant12 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 4, 12);
        int[] d10infant24 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 13, 24);
        int[] d10infant59 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 25, 59);
        int[] d10adults9 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 5, 9);
        int[] d10adults14 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 10, 14);
        int[] d10adults19 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 15, 19);
        int[] d10adults24 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 20, 24);
        int[] d10adults29 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 25, 29);
        int[] d10adults34 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 30, 34);
        int[] d10adults39 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 35, 39);
        int[] d10adults44 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 40, 44);
        int[] d10adults49 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 45, 49);
        int[] d10adults50 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD10(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 50, 100);

        int totald10 = d10infant3[0] + d10infant3[1] + d10infant12[0] + d10infant12[1] + d10infant24[0] + d10infant24[1] + d10infant59[0] + d10infant59[1] + d10adults9[0] + d10adults9[1]
                + d10adults14[0] + d10adults14[1] + d10adults19[0] + d10adults19[1] + d10adults24[0] + d10adults24[1] + d10adults29[0] + d10adults29[1] + d10adults34[0] + d10adults34[1]
                + d10adults39[0] + d10adults39[1] + d10adults44[0] + d10adults44[1] + d10adults49[0] + d10adults49[1] + d10adults50[0] + d10adults50[1];

        //D11 Variables
        int[] d11infant3 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 0, 3);
        int[] d11infant12 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 4, 12);
        int[] d11infant24 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 13, 24);
        int[] d11infant59 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 25, 59);
        int[] d11adults9 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 5, 9);
        int[] d11adults14 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 10, 14);
        int[] d11adults19 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 15, 19);
        int[] d11adults24 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 20, 24);
        int[] d11adults29 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 25, 29);
        int[] d11adults34 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 30, 34);
        int[] d11adults39 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 35, 39);
        int[] d11adults44 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 40, 44);
        int[] d11adults49 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 45, 49);
        int[] d11adults50 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD11(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 50, 100);

        int totald11 = d11infant3[0] + d11infant3[1] + d11infant12[0] + d11infant12[1] + d11infant24[0] + d11infant24[1] + d11infant59[0] + d11infant59[1] + d11adults9[0] + d11adults9[1]
                + d11adults14[0] + d11adults14[1] + d11adults19[0] + d11adults19[1] + d11adults24[0] + d11adults24[1] + d11adults29[0] + d11adults29[1] + d11adults34[0] + d11adults34[1]
                + d11adults39[0] + d11adults39[1] + d11adults44[0] + d11adults44[1] + d11adults49[0] + d11adults49[1] + d11adults50[0] + d11adults50[1];

        //D13 Variables
        int[] d13infant3 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 0, 3);
        int[] d13infant12 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 4, 12);
        int[] d13infant24 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 13, 24);
        int[] d13infant59 = infants.getTotalInfantsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 25, 59);
        int[] d13adults9 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 5, 9);
        int[] d13adults14 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 10, 14);
        int[] d13adults19 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 15, 19);
        int[] d13adults24 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 20, 24);
        int[] d13adults29 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 25, 29);
        int[] d13adults34 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 30, 34);
        int[] d13adults39 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 35, 39);
        int[] d13adults44 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 40, 44);
        int[] d13adults49 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 45, 49);
        int[] d13adults50 = adults.getTotalAdultsInOpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.OpportunityInfectionAndArtTherapyCryptoccocalStatus(cleanData.getD13(epmsReports.getOpportunityInfectionAndArtTherapyCryptoccocalStatus()), ReportDate), 50, 100);

        int totald13 = d13infant3[0] + d13infant3[1] + d13infant12[0] + d13infant12[1] + d13infant24[0] + d13infant24[1] + d13infant59[0] + d13infant59[1] + d13adults9[0] + d13adults9[1]
                + d13adults14[0] + d13adults14[1] + d13adults19[0] + d13adults19[1] + d13adults24[0] + d13adults24[1] + d13adults29[0] + d13adults29[1] + d13adults34[0] + d13adults34[1]
                + d13adults39[0] + d13adults39[1] + d13adults44[0] + d13adults44[1] + d13adults49[0] + d13adults49[1] + d13adults50[0] + d13adults50[1];

        //D14 Variables
        int[] d14infant3 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 0, 3);
        int[] d14infant12 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 4, 12);
        int[] d14infant24 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 13, 24);
        int[] d14infant59 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 59);
        int[] d14adults9 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 5, 9);
        int[] d14adults14 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 10, 14);
        int[] d14adults19 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 15, 19);
        int[] d14adults24 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 20, 24);
        int[] d14adults29 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 29);
        int[] d14adults34 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 30, 34);
        int[] d14adults39 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 35, 39);
        int[] d14adults44 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 40, 44);
        int[] d14adults49 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 45, 49);
        int[] d14adults50 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD14(epmsReports.getLaboratoryServicesTests()), ReportDate), 50, 100);

        int totald14 = d14infant3[0] + d14infant3[1] + d14infant12[0] + d14infant12[1] + d14infant24[0] + d14infant24[1] + d14infant59[0] + d14infant59[1] + d14adults9[0] + d14adults9[1]
                + d14adults14[0] + d14adults14[1] + d14adults19[0] + d14adults19[1] + d14adults24[0] + d14adults24[1] + d14adults29[0] + d14adults29[1] + d14adults34[0] + d14adults34[1]
                + d14adults39[0] + d14adults39[1] + d14adults44[0] + d14adults44[1] + d14adults49[0] + d14adults49[1] + d14adults50[0] + d14adults50[1];

        //D15 Variables
        int[] d15infant3 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 0, 3);
        int[] d15infant12 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 4, 12);
        int[] d15infant24 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 13, 24);
        int[] d15infant59 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 59);
        int[] d15adults9 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 5, 9);
        int[] d15adults14 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 10, 14);
        int[] d15adults19 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 15, 19);
        int[] d15adults24 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 20, 24);
        int[] d15adults29 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 29);
        int[] d15adults34 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 30, 34);
        int[] d15adults39 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 35, 39);
        int[] d15adults44 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 40, 44);
        int[] d15adults49 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 45, 49);
        int[] d15adults50 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD15(epmsReports.getLaboratoryServicesTests()), ReportDate), 50, 100);

        int totald15 = d15infant3[0] + d15infant3[1] + d15infant12[0] + d15infant12[1] + d15infant24[0] + d15infant24[1] + d15infant59[0] + d15infant59[1] + d15adults9[0] + d15adults9[1]
                + d15adults14[0] + d15adults14[1] + d15adults19[0] + d15adults19[1] + d15adults24[0] + d15adults24[1] + d15adults29[0] + d15adults29[1] + d15adults34[0] + d15adults34[1]
                + d15adults39[0] + d15adults39[1] + d15adults44[0] + d15adults44[1] + d15adults49[0] + d15adults49[1] + d15adults50[0] + d15adults50[1];

        //D16 Variables
        int[] d16infant3 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 0, 3);
        int[] d16infant12 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 4, 12);
        int[] d16infant24 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 13, 24);
        int[] d16infant59 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 59);
        int[] d16adults9 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 5, 9);
        int[] d16adults14 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 10, 14);
        int[] d16adults19 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 15, 19);
        int[] d16adults24 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 20, 24);
        int[] d16adults29 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 29);
        int[] d16adults34 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 30, 34);
        int[] d16adults39 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 35, 39);
        int[] d16adults44 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 40, 44);
        int[] d16adults49 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 45, 49);
        int[] d16adults50 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD16(epmsReports.getLaboratoryServicesTests()), ReportDate), 50, 100);

        int totald16 = d16infant3[0] + d16infant3[1] + d16infant12[0] + d16infant12[1] + d16infant24[0] + d16infant24[1] + d16infant59[0] + d16infant59[1] + d16adults9[0] + d16adults9[1]
                + d16adults14[0] + d16adults14[1] + d16adults19[0] + d16adults19[1] + d16adults24[0] + d16adults24[1] + d16adults29[0] + d16adults29[1] + d16adults34[0] + d16adults34[1]
                + d16adults39[0] + d16adults39[1] + d16adults44[0] + d16adults44[1] + d16adults49[0] + d16adults49[1] + d16adults50[0] + d16adults50[1];

        //D17 Variables
        int[] d17infant3 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 0, 3);
        int[] d17infant12 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 4, 12);
        int[] d17infant24 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 13, 24);
        int[] d17infant59 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 25, 59);
        int[] d17adults9 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 5, 9);
        int[] d17adults14 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 10, 14);
        int[] d17adults19 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 15, 19);
        int[] d17adults24 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 20, 24);
        int[] d17adults29 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 25, 29);
        int[] d17adults34 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 30, 34);
        int[] d17adults39 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 35, 39);
        int[] d17adults44 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 40, 44);
        int[] d17adults49 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 45, 49);
        int[] d17adults50 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingFirst(cleanData.getD17(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 50, 100);

        int totald17 = d17infant3[0] + d17infant3[1] + d17infant12[0] + d17infant12[1] + d17infant24[0] + d17infant24[1] + d17infant59[0] + d17infant59[1] + d17adults9[0] + d17adults9[1]
                + d17adults14[0] + d17adults14[1] + d17adults19[0] + d17adults19[1] + d17adults24[0] + d17adults24[1] + d17adults29[0] + d17adults29[1] + d17adults34[0] + d17adults34[1]
                + d17adults39[0] + d17adults39[1] + d17adults44[0] + d17adults44[1] + d17adults49[0] + d17adults49[1] + d17adults50[0] + d17adults50[1];

        //D18 Variables
        int[] d18infant3 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 0, 3);
        int[] d18infant12 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 4, 12);
        int[] d18infant24 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 13, 24);
        int[] d18infant59 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 25, 59);
        int[] d18adults9 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 5, 9);
        int[] d18adults14 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 10, 14);
        int[] d18adults19 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 15, 19);
        int[] d18adults24 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 20, 24);
        int[] d18adults29 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 25, 29);
        int[] d18adults34 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 30, 34);
        int[] d18adults39 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 35, 39);
        int[] d18adults44 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 40, 44);
        int[] d18adults49 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 45, 49);
        int[] d18adults50 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounsellingSecond(cleanData.getD18(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 50, 100);

        int totald18 = d18infant3[0] + d18infant3[1] + d18infant12[0] + d18infant12[1] + d18infant24[0] + d18infant24[1] + d18infant59[0] + d18infant59[1] + d18adults9[0] + d18adults9[1]
                + d18adults14[0] + d18adults14[1] + d18adults19[0] + d18adults19[1] + d18adults24[0] + d18adults24[1] + d18adults29[0] + d18adults29[1] + d18adults34[0] + d18adults34[1]
                + d18adults39[0] + d18adults39[1] + d18adults44[0] + d18adults44[1] + d18adults49[0] + d18adults49[1] + d18adults50[0] + d18adults50[1];

        //D19 Variables
        int[] d19infant3 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 0, 3);
        int[] d19infant12 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 4, 12);
        int[] d19infant24 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 13, 24);
        int[] d19infant59 = infants.getTotalInfantsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 25, 59);
        int[] d19adults9 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 5, 9);
        int[] d19adults14 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 10, 14);
        int[] d19adults19 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 15, 19);
        int[] d19adults24 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 20, 24);
        int[] d19adults29 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 25, 29);
        int[] d19adults34 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 30, 34);
        int[] d19adults39 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 35, 39);
        int[] d19adults44 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 40, 44);
        int[] d19adults49 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 45, 49);
        int[] d19adults50 = adults.getTotalAdultsInEnhancedAdherenceCounselling(cleanData.EnhancedAdherenceCounselling(cleanData.getD19(epmsReports.getEnhancedAdherenceCounselling()), ReportDate), 50, 100);

        int totald19 = d19infant3[0] + d19infant3[1] + d19infant12[0] + d19infant12[1] + d19infant24[0] + d19infant24[1] + d19infant59[0] + d19infant59[1] + d19adults9[0] + d19adults9[1]
                + d19adults14[0] + d19adults14[1] + d19adults19[0] + d19adults19[1] + d19adults24[0] + d19adults24[1] + d19adults29[0] + d19adults29[1] + d19adults34[0] + d19adults34[1]
                + d19adults39[0] + d19adults39[1] + d19adults44[0] + d19adults44[1] + d19adults49[0] + d19adults49[1] + d19adults50[0] + d19adults50[1];

        //D20 Variables
        int[] d20infant3 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 0, 3);
        int[] d20infant12 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 4, 12);
        int[] d20infant24 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 13, 24);
        int[] d20infant59 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 25, 59);
        int[] d20adults9 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 5, 9);
        int[] d20adults14 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 10, 14);
        int[] d20adults19 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 15, 19);
        int[] d20adults24 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 20, 24);
        int[] d20adults29 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 25, 29);
        int[] d20adults34 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 30, 34);
        int[] d20adults39 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 35, 39);
        int[] d20adults44 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 40, 44);
        int[] d20adults49 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 45, 49);
        int[] d20adults50 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD20(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 50, 100);

        int totald20 = d20infant3[0] + d20infant3[1] + d20infant12[0] + d20infant12[1] + d20infant24[0] + d20infant24[1] + d20infant59[0] + d20infant59[1] + d20adults9[0] + d20adults9[1]
                + d20adults14[0] + d20adults14[1] + d20adults19[0] + d20adults19[1] + d20adults24[0] + d20adults24[1] + d20adults29[0] + d20adults29[1] + d20adults34[0] + d20adults34[1]
                + d20adults39[0] + d20adults39[1] + d20adults44[0] + d20adults44[1] + d20adults49[0] + d20adults49[1] + d20adults50[0] + d20adults50[1];

        //D21 Variables
        int[] d21infant3 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 0, 3);
        int[] d21infant12 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 4, 12);
        int[] d21infant24 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 13, 24);
        int[] d21infant59 = infants.getTotalInfantsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 25, 59);
        int[] d21adults9 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 5, 9);
        int[] d21adults14 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 10, 14);
        int[] d21adults19 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 15, 19);
        int[] d21adults24 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 20, 24);
        int[] d21adults29 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 25, 29);
        int[] d21adults34 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 30, 34);
        int[] d21adults39 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 35, 39);
        int[] d21adults44 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 40, 44);
        int[] d21adults49 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 45, 49);
        int[] d21adults50 = adults.getTotalAdultsInLaboratoryServicesArvSwitch(cleanData.LaboratoryServicesArvSwitch(cleanData.getD21(epmsReports.getLaboratoryServicesArvSwitch()), ReportDate), 50, 100);

        int totald21 = d21infant3[0] + d21infant3[1] + d21infant12[0] + d21infant12[1] + d21infant24[0] + d21infant24[1] + d21infant59[0] + d21infant59[1] + d21adults9[0] + d21adults9[1]
                + d21adults14[0] + d21adults14[1] + d21adults19[0] + d21adults19[1] + d21adults24[0] + d21adults24[1] + d21adults29[0] + d21adults29[1] + d21adults34[0] + d21adults34[1]
                + d21adults39[0] + d21adults39[1] + d21adults44[0] + d21adults44[1] + d21adults49[0] + d21adults49[1] + d21adults50[0] + d21adults50[1];

        //D22 Variables
        int[] d22infant3 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 0, 3);
        int[] d22infant12 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 4, 12);
        int[] d22infant24 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 13, 24);
        int[] d22infant59 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 59);
        int[] d22adults9 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 5, 9);
        int[] d22adults14 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 10, 14);
        int[] d22adults19 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 15, 19);
        int[] d22adults24 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 20, 24);
        int[] d22adults29 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 29);
        int[] d22adults34 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 30, 34);
        int[] d22adults39 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 35, 39);
        int[] d22adults44 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 40, 44);
        int[] d22adults49 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 45, 49);
        int[] d22adults50 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD22(epmsReports.getLaboratoryServicesTests()), ReportDate), 50, 100);

        int totald22 = d22infant3[0] + d22infant3[1] + d22infant12[0] + d22infant12[1] + d22infant24[0] + d22infant24[1] + d22infant59[0] + d22infant59[1] + d22adults9[0] + d22adults9[1]
                + d22adults14[0] + d22adults14[1] + d22adults19[0] + d22adults19[1] + d22adults24[0] + d22adults24[1] + d22adults29[0] + d22adults29[1] + d22adults34[0] + d22adults34[1]
                + d22adults39[0] + d22adults39[1] + d22adults44[0] + d22adults44[1] + d22adults49[0] + d22adults49[1] + d22adults50[0] + d22adults50[1];

        //D23 Variables
        int[] d23infant3 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 0, 3);
        int[] d23infant12 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 4, 12);
        int[] d23infant24 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 13, 24);
        int[] d23infant59 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 59);
        int[] d23adults9 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 5, 9);
        int[] d23adults14 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 10, 14);
        int[] d23adults19 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 15, 19);
        int[] d23adults24 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 20, 24);
        int[] d23adults29 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 29);
        int[] d23adults34 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 30, 34);
        int[] d23adults39 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 35, 39);
        int[] d23adults44 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 40, 44);
        int[] d23adults49 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 45, 49);
        int[] d23adults50 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD23(epmsReports.getLaboratoryServicesTests()), ReportDate), 50, 100);

        int totald23 = d23infant3[0] + d23infant3[1] + d23infant12[0] + d23infant12[1] + d23infant24[0] + d23infant24[1] + d23infant59[0] + d23infant59[1] + d23adults9[0] + d23adults9[1]
                + d23adults14[0] + d23adults14[1] + d23adults19[0] + d23adults19[1] + d23adults24[0] + d23adults24[1] + d23adults29[0] + d23adults29[1] + d23adults34[0] + d23adults34[1]
                + d23adults39[0] + d23adults39[1] + d23adults44[0] + d23adults44[1] + d23adults49[0] + d23adults49[1] + d23adults50[0] + d23adults50[1];

        //D24 Variables
        int[] d24infant3 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 0, 3);
        int[] d24infant12 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 4, 12);
        int[] d24infant24 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 13, 24);
        int[] d24infant59 = infants.getTotalInfantsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 59);
        int[] d24adults9 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 5, 9);
        int[] d24adults14 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 10, 14);
        int[] d24adults19 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 15, 19);
        int[] d24adults24 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 20, 24);
        int[] d24adults29 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 25, 29);
        int[] d24adults34 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 30, 34);
        int[] d24adults39 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 35, 39);
        int[] d24adults44 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 40, 44);
        int[] d24adults49 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 45, 49);
        int[] d24adults50 = adults.getTotalAdultsInLaboratoryServicesTests(cleanData.LaboratoryServicesTests(cleanData.getD24(epmsReports.getLaboratoryServicesTests()), ReportDate), 50, 100);

        int totald24 = d24infant3[0] + d24infant3[1] + d24infant12[0] + d24infant12[1] + d24infant24[0] + d24infant24[1] + d24infant59[0] + d24infant59[1] + d24adults9[0] + d24adults9[1]
                + d24adults14[0] + d24adults14[1] + d24adults19[0] + d24adults19[1] + d24adults24[0] + d24adults24[1] + d24adults29[0] + d24adults29[1] + d24adults34[0] + d24adults34[1]
                + d24adults39[0] + d24adults39[1] + d24adults44[0] + d24adults44[1] + d24adults49[0] + d24adults49[1] + d24adults50[0] + d24adults50[1];

        //D25 Variables
        int[] d25infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 0, 3);
        int[] d25infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 4, 12);
        int[] d25infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 13, 24);
        int[] d25infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 25, 59);
        int[] d25adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 5, 9);
        int[] d25adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 10, 14);
        int[] d25adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 15, 19);
        int[] d25adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 20, 24);
        int[] d25adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 25, 29);
        int[] d25adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 30, 34);
        int[] d25adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 35, 39);
        int[] d25adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 40, 44);
        int[] d25adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 45, 49);
        int[] d25adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD25(epmsReports.getArtSummaryNewly()), ReportDate), 50, 100);

        int totald25 = d25infant3[0] + d25infant3[1] + d25infant12[0] + d25infant12[1] + d25infant24[0] + d25infant24[1] + d25infant59[0] + d25infant59[1] + d25adults9[0] + d25adults9[1]
                + d25adults14[0] + d25adults14[1] + d25adults19[0] + d25adults19[1] + d25adults24[0] + d25adults24[1] + d25adults29[0] + d25adults29[1] + d25adults34[0] + d25adults34[1]
                + d25adults39[0] + d25adults39[1] + d25adults44[0] + d25adults44[1] + d25adults49[0] + d25adults49[1] + d25adults50[0] + d25adults50[1];

        //D26 Variables
        int[] d26infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d26infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d26infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d26infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d26adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d26adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d26adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d26adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d26adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d26adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d26adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d26adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d26adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d26adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD26(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald26 = d26infant3[0] + d26infant3[1] + d26infant12[0] + d26infant12[1] + d26infant24[0] + d26infant24[1] + d26infant59[0] + d26infant59[1] + d26adults9[0] + d26adults9[1]
                + d26adults14[0] + d26adults14[1] + d26adults19[0] + d26adults19[1] + d26adults24[0] + d26adults24[1] + d26adults29[0] + d26adults29[1] + d26adults34[0] + d26adults34[1]
                + d26adults39[0] + d26adults39[1] + d26adults44[0] + d26adults44[1] + d26adults49[0] + d26adults49[1] + d26adults50[0] + d26adults50[1];

        //D27 Variables
        int[] d27infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d27infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d27infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d27infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d27adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d27adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d27adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d27adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d27adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d27adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d27adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d27adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d27adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d27adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD27(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald27 = d27infant3[0] + d27infant3[1] + d27infant12[0] + d27infant12[1] + d27infant24[0] + d27infant24[1] + d27infant59[0] + d27infant59[1] + d27adults9[0] + d27adults9[1]
                + d27adults14[0] + d27adults14[1] + d27adults19[0] + d27adults19[1] + d27adults24[0] + d27adults24[1] + d27adults29[0] + d27adults29[1] + d27adults34[0] + d27adults34[1]
                + d27adults39[0] + d27adults39[1] + d27adults44[0] + d27adults44[1] + d27adults49[0] + d27adults49[1] + d27adults50[0] + d27adults50[1];

        //D28 Variables
        int[] d28infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d28infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d28infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d28infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d28adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d28adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d28adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d28adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d28adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d28adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d28adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d28adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d28adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d28adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD28(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald28 = d28infant3[0] + d28infant3[1] + d28infant12[0] + d28infant12[1] + d28infant24[0] + d28infant24[1] + d28infant59[0] + d28infant59[1] + d28adults9[0] + d28adults9[1]
                + d28adults14[0] + d28adults14[1] + d28adults19[0] + d28adults19[1] + d28adults24[0] + d28adults24[1] + d28adults29[0] + d28adults29[1] + d28adults34[0] + d28adults34[1]
                + d28adults39[0] + d28adults39[1] + d28adults44[0] + d28adults44[1] + d28adults49[0] + d28adults49[1] + d28adults50[0] + d28adults50[1];

        //D29 Variables
        int[] d29infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d29infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d29infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d29infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d29adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d29adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d29adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d29adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d29adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d29adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d29adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d29adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d29adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d29adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD29(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald29 = d29infant3[0] + d29infant3[1] + d29infant12[0] + d29infant12[1] + d29infant24[0] + d29infant24[1] + d29infant59[0] + d29infant59[1] + d29adults9[0] + d29adults9[1]
                + d29adults14[0] + d29adults14[1] + d29adults19[0] + d29adults19[1] + d29adults24[0] + d29adults24[1] + d29adults29[0] + d29adults29[1] + d29adults34[0] + d29adults34[1]
                + d29adults39[0] + d29adults39[1] + d29adults44[0] + d29adults44[1] + d29adults49[0] + d29adults49[1] + d29adults50[0] + d29adults50[1];

        //D30 Variables
        int[] d30infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d30infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d30infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d30infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d30adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d30adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d30adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d30adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d30adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d30adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d30adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d30adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d30adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d30adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD30(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald30 = d30infant3[0] + d30infant3[1] + d30infant12[0] + d30infant12[1] + d30infant24[0] + d30infant24[1] + d30infant59[0] + d30infant59[1] + d30adults9[0] + d30adults9[1]
                + d30adults14[0] + d30adults14[1] + d30adults19[0] + d30adults19[1] + d30adults24[0] + d30adults24[1] + d30adults29[0] + d30adults29[1] + d30adults34[0] + d30adults34[1]
                + d30adults39[0] + d30adults39[1] + d30adults44[0] + d30adults44[1] + d30adults49[0] + d30adults49[1] + d30adults50[0] + d30adults50[1];

        //D31 Variables
        int[] d31infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d31infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d31infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d31infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d31adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d31adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d31adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d31adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d31adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d31adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d31adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d31adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d31adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d31adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD31(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald31 = d31infant3[0] + d31infant3[1] + d31infant12[0] + d31infant12[1] + d31infant24[0] + d31infant24[1] + d31infant59[0] + d31infant59[1] + d31adults9[0] + d31adults9[1]
                + d31adults14[0] + d31adults14[1] + d31adults19[0] + d31adults19[1] + d31adults24[0] + d31adults24[1] + d31adults29[0] + d31adults29[1] + d31adults34[0] + d31adults34[1]
                + d31adults39[0] + d31adults39[1] + d31adults44[0] + d31adults44[1] + d31adults49[0] + d31adults49[1] + d31adults50[0] + d31adults50[1];

        //D32 Variables
        int[] d32infant3 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 0, 3);
        int[] d32infant12 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 4, 12);
        int[] d32infant24 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 13, 24);
        int[] d32infant59 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 25, 59);
        int[] d32adults9 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 5, 9);
        int[] d32adults14 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 10, 14);
        int[] d32adults19 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 15, 19);
        int[] d32adults24 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 20, 24);
        int[] d32adults29 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 25, 29);
        int[] d32adults34 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 30, 34);
        int[] d32adults39 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 35, 39);
        int[] d32adults44 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 40, 44);
        int[] d32adults49 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 45, 49);
        int[] d32adults50 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD32(epmsReports.getPatientsTransferInVisit()), ReportDate), 50, 100);

        int totald32 = d32infant3[0] + d32infant3[1] + d32infant12[0] + d32infant12[1] + d32infant24[0] + d32infant24[1] + d32infant59[0] + d32infant59[1] + d32adults9[0] + d32adults9[1]
                + d32adults14[0] + d32adults14[1] + d32adults19[0] + d32adults19[1] + d32adults24[0] + d32adults24[1] + d32adults29[0] + d32adults29[1] + d32adults34[0] + d32adults34[1]
                + d32adults39[0] + d32adults39[1] + d32adults44[0] + d32adults44[1] + d32adults49[0] + d32adults49[1] + d32adults50[0] + d32adults50[1];

        //D33 Variables
        int[] d33infant3 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 0, 3);
        int[] d33infant12 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 4, 12);
        int[] d33infant24 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 13, 24);
        int[] d33infant59 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 59);
        int[] d33adults9 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 5, 9);
        int[] d33adults14 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 10, 14);
        int[] d33adults19 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 15, 19);
        int[] d33adults24 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 20, 24);
        int[] d33adults29 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 29);
        int[] d33adults34 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 30, 34);
        int[] d33adults39 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 35, 39);
        int[] d33adults44 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 40, 44);
        int[] d33adults49 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 45, 49);
        int[] d33adults50 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD33(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 50, 100);

        int totald33 = d33infant3[0] + d33infant3[1] + d33infant12[0] + d33infant12[1] + d33infant24[0] + d33infant24[1] + d33infant59[0] + d33infant59[1] + d33adults9[0] + d33adults9[1]
                + d33adults14[0] + d33adults14[1] + d33adults19[0] + d33adults19[1] + d33adults24[0] + d33adults24[1] + d33adults29[0] + d33adults29[1] + d33adults34[0] + d33adults34[1]
                + d33adults39[0] + d33adults39[1] + d33adults44[0] + d33adults44[1] + d33adults49[0] + d33adults49[1] + d33adults50[0] + d33adults50[1];

        //D34 Variables
        int[] d34infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d34infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d34infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d34infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d34adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d34adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d34adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d34adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d34adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d34adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d34adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d34adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d34adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d34adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD34(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald34 = d34infant3[0] + d34infant3[1] + d34infant12[0] + d34infant12[1] + d34infant24[0] + d34infant24[1] + d34infant59[0] + d34infant59[1] + d34adults9[0] + d34adults9[1]
                + d34adults14[0] + d34adults14[1] + d34adults19[0] + d34adults19[1] + d34adults24[0] + d34adults24[1] + d34adults29[0] + d34adults29[1] + d34adults34[0] + d34adults34[1]
                + d34adults39[0] + d34adults39[1] + d34adults44[0] + d34adults44[1] + d34adults49[0] + d34adults49[1] + d34adults50[0] + d34adults50[1];

        //D35 Variables
        int[] d35infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d35infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d35infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d35infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d35adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d35adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d35adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d35adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d35adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d35adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d35adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d35adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d35adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d35adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD35(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald35 = d35infant3[0] + d35infant3[1] + d35infant12[0] + d35infant12[1] + d35infant24[0] + d35infant24[1] + d35infant59[0] + d35infant59[1] + d35adults9[0] + d35adults9[1]
                + d35adults14[0] + d35adults14[1] + d35adults19[0] + d35adults19[1] + d35adults24[0] + d35adults24[1] + d35adults29[0] + d35adults29[1] + d35adults34[0] + d35adults34[1]
                + d35adults39[0] + d35adults39[1] + d35adults44[0] + d35adults44[1] + d35adults49[0] + d35adults49[1] + d35adults50[0] + d35adults50[1];

        //D36 Variables
        int[] d36infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d36infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d36infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d36infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d36adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d36adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d36adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d36adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d36adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d36adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d36adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d36adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d36adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d36adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD36(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald36 = d36infant3[0] + d36infant3[1] + d36infant12[0] + d36infant12[1] + d36infant24[0] + d36infant24[1] + d36infant59[0] + d36infant59[1] + d36adults9[0] + d36adults9[1]
                + d36adults14[0] + d36adults14[1] + d36adults19[0] + d36adults19[1] + d36adults24[0] + d36adults24[1] + d36adults29[0] + d36adults29[1] + d36adults34[0] + d36adults34[1]
                + d36adults39[0] + d36adults39[1] + d36adults44[0] + d36adults44[1] + d36adults49[0] + d36adults49[1] + d36adults50[0] + d36adults50[1];

        //D38 Variables
        int[] d38infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d38infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d38infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d38infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d38adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d38adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d38adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d38adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d38adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d38adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d38adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d38adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d38adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d38adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD38(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald38 = d38infant3[0] + d38infant3[1] + d38infant12[0] + d38infant12[1] + d38infant24[0] + d38infant24[1] + d38infant59[0] + d38infant59[1] + d38adults9[0] + d38adults9[1]
                + d38adults14[0] + d38adults14[1] + d38adults19[0] + d38adults19[1] + d38adults24[0] + d38adults24[1] + d38adults29[0] + d38adults29[1] + d38adults34[0] + d38adults34[1]
                + d38adults39[0] + d38adults39[1] + d38adults44[0] + d38adults44[1] + d38adults49[0] + d38adults49[1] + d38adults50[0] + d38adults50[1];

        //D39 Variables
        int[] d39infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d39infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d39infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d39infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d39adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d39adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d39adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d39adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d39adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d39adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d39adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d39adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d39adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d39adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD39(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald39 = d39infant3[0] + d39infant3[1] + d39infant12[0] + d39infant12[1] + d39infant24[0] + d39infant24[1] + d39infant59[0] + d39infant59[1] + d39adults9[0] + d39adults9[1]
                + d39adults14[0] + d39adults14[1] + d39adults19[0] + d39adults19[1] + d39adults24[0] + d39adults24[1] + d39adults29[0] + d39adults29[1] + d39adults34[0] + d39adults34[1]
                + d39adults39[0] + d39adults39[1] + d39adults44[0] + d39adults44[1] + d39adults49[0] + d39adults49[1] + d39adults50[0] + d39adults50[1];

        //D40 Variables
        int[] d40infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d40infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d40infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d40infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d40adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d40adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d40adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d40adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d40adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d40adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d40adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d40adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d40adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d40adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD40(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald40 = d40infant3[0] + d40infant3[1] + d40infant12[0] + d40infant12[1] + d40infant24[0] + d40infant24[1] + d40infant59[0] + d40infant59[1] + d40adults9[0] + d40adults9[1]
                + d40adults14[0] + d40adults14[1] + d40adults19[0] + d40adults19[1] + d40adults24[0] + d40adults24[1] + d40adults29[0] + d40adults29[1] + d40adults34[0] + d40adults34[1]
                + d40adults39[0] + d40adults39[1] + d40adults44[0] + d40adults44[1] + d40adults49[0] + d40adults49[1] + d40adults50[0] + d40adults50[1];

        //D41 Variables
        int[] d41infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d41infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d41infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d41infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d41adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d41adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d41adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d41adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d41adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d41adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d41adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d41adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d41adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d41adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD41(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald41 = d41infant3[0] + d41infant3[1] + d41infant12[0] + d41infant12[1] + d41infant24[0] + d41infant24[1] + d41infant59[0] + d41infant59[1] + d41adults9[0] + d41adults9[1]
                + d41adults14[0] + d41adults14[1] + d41adults19[0] + d41adults19[1] + d41adults24[0] + d41adults24[1] + d41adults29[0] + d41adults29[1] + d41adults34[0] + d41adults34[1]
                + d41adults39[0] + d41adults39[1] + d41adults44[0] + d41adults44[1] + d41adults49[0] + d41adults49[1] + d41adults50[0] + d41adults50[1];

        //D42 Variables
        int[] d42infant3 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 0, 3);
        int[] d42infant12 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 4, 12);
        int[] d42infant24 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 13, 24);
        int[] d42infant59 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 25, 59);
        int[] d42adults9 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 5, 9);
        int[] d42adults14 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 10, 14);
        int[] d42adults19 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 15, 19);
        int[] d42adults24 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 20, 24);
        int[] d42adults29 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 25, 29);
        int[] d42adults34 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 30, 34);
        int[] d42adults39 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 35, 39);
        int[] d42adults44 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 40, 44);
        int[] d42adults49 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 45, 49);
        int[] d42adults50 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD42(epmsReports.getPatientsTransferInVisit()), ReportDate), 50, 100);

        int totald42 = d42infant3[0] + d42infant3[1] + d42infant12[0] + d42infant12[1] + d42infant24[0] + d42infant24[1] + d42infant59[0] + d42infant59[1] + d42adults9[0] + d42adults9[1]
                + d42adults14[0] + d42adults14[1] + d42adults19[0] + d42adults19[1] + d42adults24[0] + d42adults24[1] + d42adults29[0] + d42adults29[1] + d42adults34[0] + d42adults34[1]
                + d42adults39[0] + d42adults39[1] + d42adults44[0] + d42adults44[1] + d42adults49[0] + d42adults49[1] + d42adults50[0] + d42adults50[1];

        //D43 Variables
        int[] d43infant3 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 0, 3);
        int[] d43infant12 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 4, 12);
        int[] d43infant24 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 13, 24);
        int[] d43infant59 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 59);
        int[] d43adults9 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 5, 9);
        int[] d43adults14 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 10, 14);
        int[] d43adults19 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 15, 19);
        int[] d43adults24 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 20, 24);
        int[] d43adults29 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 29);
        int[] d43adults34 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 30, 34);
        int[] d43adults39 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 35, 39);
        int[] d43adults44 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 40, 44);
        int[] d43adults49 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 45, 49);
        int[] d43adults50 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD43(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 50, 100);

        int totald43 = d43infant3[0] + d43infant3[1] + d43infant12[0] + d43infant12[1] + d43infant24[0] + d43infant24[1] + d43infant59[0] + d43infant59[1] + d43adults9[0] + d43adults9[1]
                + d43adults14[0] + d43adults14[1] + d43adults19[0] + d43adults19[1] + d43adults24[0] + d43adults24[1] + d43adults29[0] + d43adults29[1] + d43adults34[0] + d43adults34[1]
                + d43adults39[0] + d43adults39[1] + d43adults44[0] + d43adults44[1] + d43adults49[0] + d43adults49[1] + d43adults50[0] + d43adults50[1];

        //D44 Variables
        int[] d44infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d44infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d44infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d44infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d44adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d44adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d44adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d44adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d44adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d44adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d44adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d44adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d44adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d44adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD44(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald44 = d44infant3[0] + d44infant3[1] + d44infant12[0] + d44infant12[1] + d44infant24[0] + d44infant24[1] + d44infant59[0] + d44infant59[1] + d44adults9[0] + d44adults9[1]
                + d44adults14[0] + d44adults14[1] + d44adults19[0] + d44adults19[1] + d44adults24[0] + d44adults24[1] + d44adults29[0] + d44adults29[1] + d44adults34[0] + d44adults34[1]
                + d44adults39[0] + d44adults39[1] + d44adults44[0] + d44adults44[1] + d44adults49[0] + d44adults49[1] + d44adults50[0] + d44adults50[1];

        //D45 Variables
        int[] d45infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d45infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d45infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d45infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d45adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d45adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d45adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d45adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d45adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d45adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d45adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d45adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d45adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d45adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD45(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald45 = d45infant3[0] + d45infant3[1] + d45infant12[0] + d45infant12[1] + d45infant24[0] + d45infant24[1] + d45infant59[0] + d45infant59[1] + d45adults9[0] + d45adults9[1]
                + d45adults14[0] + d45adults14[1] + d45adults19[0] + d45adults19[1] + d45adults24[0] + d45adults24[1] + d45adults29[0] + d45adults29[1] + d45adults34[0] + d45adults34[1]
                + d45adults39[0] + d45adults39[1] + d45adults44[0] + d45adults44[1] + d45adults49[0] + d45adults49[1] + d45adults50[0] + d45adults50[1];

        //D46 Variables
        int[] d46infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d46infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d46infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d46infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d46adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d46adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d46adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d46adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d46adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d46adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d46adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d46adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d46adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d46adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD46(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald46 = d46infant3[0] + d46infant3[1] + d46infant12[0] + d46infant12[1] + d46infant24[0] + d46infant24[1] + d46infant59[0] + d46infant59[1] + d46adults9[0] + d46adults9[1]
                + d46adults14[0] + d46adults14[1] + d46adults19[0] + d46adults19[1] + d46adults24[0] + d46adults24[1] + d46adults29[0] + d46adults29[1] + d46adults34[0] + d46adults34[1]
                + d46adults39[0] + d46adults39[1] + d46adults44[0] + d46adults44[1] + d46adults49[0] + d46adults49[1] + d46adults50[0] + d46adults50[1];

        //D48 Variables
        int[] d48infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d48infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d48infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d48infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d48adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d48adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d48adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d48adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d48adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d48adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d48adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d48adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d48adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d48adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD48(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald48 = d48infant3[0] + d48infant3[1] + d48infant12[0] + d48infant12[1] + d48infant24[0] + d48infant24[1] + d48infant59[0] + d48infant59[1] + d48adults9[0] + d48adults9[1]
                + d48adults14[0] + d48adults14[1] + d48adults19[0] + d48adults19[1] + d48adults24[0] + d48adults24[1] + d48adults29[0] + d48adults29[1] + d48adults34[0] + d48adults34[1]
                + d48adults39[0] + d48adults39[1] + d48adults44[0] + d48adults44[1] + d48adults49[0] + d48adults49[1] + d48adults50[0] + d48adults50[1];

        //D49 Variables
        int[] d49infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d49infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d49infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d49infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d49adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d49adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d49adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d49adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d49adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d49adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d49adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d49adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d49adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d49adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD49(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald49 = d49infant3[0] + d49infant3[1] + d49infant12[0] + d49infant12[1] + d49infant24[0] + d49infant24[1] + d49infant59[0] + d49infant59[1] + d49adults9[0] + d49adults9[1]
                + d49adults14[0] + d49adults14[1] + d49adults19[0] + d49adults19[1] + d49adults24[0] + d49adults24[1] + d49adults29[0] + d49adults29[1] + d49adults34[0] + d49adults34[1]
                + d49adults39[0] + d49adults39[1] + d49adults44[0] + d49adults44[1] + d49adults49[0] + d49adults49[1] + d49adults50[0] + d49adults50[1];

        //D50 Variables
        int[] d50infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d50infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d50infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d50infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d50adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d50adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d50adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d50adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d50adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d50adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d50adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d50adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d50adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d50adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD50(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald50 = d50infant3[0] + d50infant3[1] + d50infant12[0] + d50infant12[1] + d50infant24[0] + d50infant24[1] + d50infant59[0] + d50infant59[1] + d50adults9[0] + d50adults9[1]
                + d50adults14[0] + d50adults14[1] + d50adults19[0] + d50adults19[1] + d50adults24[0] + d50adults24[1] + d50adults29[0] + d50adults29[1] + d50adults34[0] + d50adults34[1]
                + d50adults39[0] + d50adults39[1] + d50adults44[0] + d50adults44[1] + d50adults49[0] + d50adults49[1] + d50adults50[0] + d50adults50[1];

        //D51 Variables
        int[] d51infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d51infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d51infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d51infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d51adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d51adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d51adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d51adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d51adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d51adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d51adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d51adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d51adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d51adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD51(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald51 = d51infant3[0] + d51infant3[1] + d51infant12[0] + d51infant12[1] + d51infant24[0] + d51infant24[1] + d51infant59[0] + d51infant59[1] + d51adults9[0] + d51adults9[1]
                + d51adults14[0] + d51adults14[1] + d51adults19[0] + d51adults19[1] + d51adults24[0] + d51adults24[1] + d51adults29[0] + d51adults29[1] + d51adults34[0] + d51adults34[1]
                + d51adults39[0] + d51adults39[1] + d51adults44[0] + d51adults44[1] + d51adults49[0] + d51adults49[1] + d51adults50[0] + d51adults50[1];

        //D52 Variables
        int[] d52infant3 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 0, 3);
        int[] d52infant12 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 4, 12);
        int[] d52infant24 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 13, 24);
        int[] d52infant59 = infants.getTotalInfantsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 25, 59);
        int[] d52adults9 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 5, 9);
        int[] d52adults14 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 10, 14);
        int[] d52adults19 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 15, 19);
        int[] d52adults24 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 20, 24);
        int[] d52adults29 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 25, 29);
        int[] d52adults34 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 30, 34);
        int[] d52adults39 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 35, 39);
        int[] d52adults44 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 40, 44);
        int[] d52adults49 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 45, 49);
        int[] d52adults50 = adults.getTotalAdultsInPatientsTransferInVisit(cleanData.PatientsTransferInVisit(cleanData.getD52(epmsReports.getPatientsTransferInVisit()), ReportDate), 50, 100);

        int totald52 = d52infant3[0] + d52infant3[1] + d52infant12[0] + d52infant12[1] + d52infant24[0] + d52infant24[1] + d52infant59[0] + d52infant59[1] + d52adults9[0] + d52adults9[1]
                + d52adults14[0] + d52adults14[1] + d52adults19[0] + d52adults19[1] + d52adults24[0] + d52adults24[1] + d52adults29[0] + d52adults29[1] + d52adults34[0] + d52adults34[1]
                + d52adults39[0] + d52adults39[1] + d52adults44[0] + d52adults44[1] + d52adults49[0] + d52adults49[1] + d52adults50[0] + d52adults50[1];

        //D53 Variables
        int[] d53infant3 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 0, 3);
        int[] d53infant12 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 4, 12);
        int[] d53infant24 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 13, 24);
        int[] d53infant59 = infants.getTotalInfantsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 59);
        int[] d53adults9 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 5, 9);
        int[] d53adults14 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 10, 14);
        int[] d53adults19 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 15, 19);
        int[] d53adults24 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 20, 24);
        int[] d53adults29 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 25, 29);
        int[] d53adults34 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 30, 34);
        int[] d53adults39 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 35, 39);
        int[] d53adults44 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 40, 44);
        int[] d53adults49 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 45, 49);
        int[] d53adults50 = adults.getTotalAdultsInArtSummaryAdverseEvents(cleanData.ArtSummaryAdverseEvents(cleanData.getD53(epmsReports.getArtSummaryAdverseEvents()), ReportDate), 50, 100);

        int totald53 = d53infant3[0] + d53infant3[1] + d53infant12[0] + d53infant12[1] + d53infant24[0] + d53infant24[1] + d53infant59[0] + d53infant59[1] + d53adults9[0] + d53adults9[1]
                + d53adults14[0] + d53adults14[1] + d53adults19[0] + d53adults19[1] + d53adults24[0] + d53adults24[1] + d53adults29[0] + d53adults29[1] + d53adults34[0] + d53adults34[1]
                + d53adults39[0] + d53adults39[1] + d53adults44[0] + d53adults44[1] + d53adults49[0] + d53adults49[1] + d53adults50[0] + d53adults50[1];

        //D54 Variables
        int[] d54infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d54infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d54infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d54infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d54adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d54adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d54adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d54adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d54adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d54adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d54adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d54adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d54adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d54adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD54(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald54 = d54infant3[0] + d54infant3[1] + d54infant12[0] + d54infant12[1] + d54infant24[0] + d54infant24[1] + d54infant59[0] + d54infant59[1] + d54adults9[0] + d54adults9[1]
                + d54adults14[0] + d54adults14[1] + d54adults19[0] + d54adults19[1] + d54adults24[0] + d54adults24[1] + d54adults29[0] + d54adults29[1] + d54adults34[0] + d54adults34[1]
                + d54adults39[0] + d54adults39[1] + d54adults44[0] + d54adults44[1] + d54adults49[0] + d54adults49[1] + d54adults50[0] + d54adults50[1];

        //D55 Variables
        int[] d55infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d55infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d55infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d55infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d55adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d55adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d55adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d55adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d55adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d55adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d55adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d55adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d55adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d55adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD55(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald55 = d55infant3[0] + d55infant3[1] + d55infant12[0] + d55infant12[1] + d55infant24[0] + d55infant24[1] + d55infant59[0] + d55infant59[1] + d55adults9[0] + d55adults9[1]
                + d55adults14[0] + d55adults14[1] + d55adults19[0] + d55adults19[1] + d55adults24[0] + d55adults24[1] + d55adults29[0] + d55adults29[1] + d55adults34[0] + d55adults34[1]
                + d55adults39[0] + d55adults39[1] + d55adults44[0] + d55adults44[1] + d55adults49[0] + d55adults49[1] + d55adults50[0] + d55adults50[1];

        //D56 Variables
        int[] d56infant3 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 0, 3);
        int[] d56infant12 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 4, 12);
        int[] d56infant24 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 13, 24);
        int[] d56infant59 = infants.getTotalInfantsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 25, 59);
        int[] d56adults9 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 5, 9);
        int[] d56adults14 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 10, 14);
        int[] d56adults19 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 15, 19);
        int[] d56adults24 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 20, 24);
        int[] d56adults29 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 25, 29);
        int[] d56adults34 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 30, 34);
        int[] d56adults39 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 35, 39);
        int[] d56adults44 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 40, 44);
        int[] d56adults49 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 45, 49);
        int[] d56adults50 = adults.getTotalAdultsInArtSummary(cleanData.ArtSummary(cleanData.getD56(epmsReports.getArtSummary()), ReportDate), 50, 100);

        int totald56 = d56infant3[0] + d56infant3[1] + d56infant12[0] + d56infant12[1] + d56infant24[0] + d56infant24[1] + d56infant59[0] + d56infant59[1] + d56adults9[0] + d56adults9[1]
                + d56adults14[0] + d56adults14[1] + d56adults19[0] + d56adults19[1] + d56adults24[0] + d56adults24[1] + d56adults29[0] + d56adults29[1] + d56adults34[0] + d56adults34[1]
                + d56adults39[0] + d56adults39[1] + d56adults44[0] + d56adults44[1] + d56adults49[0] + d56adults49[1] + d56adults50[0] + d56adults50[1];

         //D57 Variables       
         int d57infant3m =  d36infant3[0] + d46infant3[0] + d56infant3[0];
         int d57infant3f =  d36infant3[1] + d46infant3[1] + d56infant3[1];
         int d57infant12m =  d36infant12[0] + d46infant12[0] + d56infant12[0];
         int d57infant12f =  d36infant12[1] + d46infant12[1] + d56infant12[1];
         int d57infant24m =  d36infant24[0] + d46infant24[0] + d56infant24[0];
         int d57infant24f =  d36infant24[1] + d46infant24[1] + d56infant24[1];
         int d57infant59m =  d36infant59[0] + d46infant59[0] + d56infant59[0];
         int d57infant59f =  d36infant59[1] + d46infant59[1] + d56infant59[1];
         int d57adults9m =  d36adults9[0] + d46adults9[0] + d56adults9[0];
         int d57adults9f =  d36adults9[1] + d46adults9[1] + d56adults9[1];
         int d57adults14m =  d36adults14[0] + d46adults14[0] + d56adults14[0];
         int d57adults14f =  d36adults14[1] + d46adults14[1] + d56adults14[1];
         int d57adults19m =  d36adults19[0] + d46adults19[0] + d56adults19[0];
         int d57adults19f =  d36adults19[1] + d46adults19[1] + d56adults19[1];
         int d57adults24m =  d36adults24[0] + d46adults24[0] + d56adults24[0];
         int d57adults24f =  d36adults24[1] + d46adults24[1] + d56adults24[1];
         int d57adults29m =  d36adults29[0] + d46adults29[0] + d56adults29[0];
         int d57adults29f =  d36adults29[1] + d46adults29[1] + d56adults29[1];
         int d57adults34m =  d36adults34[0] + d46adults34[0] + d56adults34[0];
         int d57adults34f =  d36adults34[1] + d46adults34[1] + d56adults34[1];
         int d57adults39m =  d36adults39[0] + d46adults39[0] + d56adults39[0];
         int d57adults39f =  d36adults39[1] + d46adults39[1] + d56adults39[1];
         int d57adults44m =  d36adults44[0] + d46adults44[0] + d56adults44[0];
         int d57adults44f =  d36adults44[1] + d46adults44[1] + d56adults44[1];
         int d57adults49m =  d36adults49[0] + d46adults49[0] + d56adults49[0];
         int d57adults49f =  d36adults49[1] + d46adults49[1] + d56adults49[1];
         int d57adults50m =  d36adults50[0] + d46adults50[0] + d56adults50[0];
         int d57adults50f =  d36adults50[1] + d46adults50[1] + d56adults50[1];
         
         int totald57 = d57infant3m + d57infant3f + d57infant12m + d57infant12f + d57infant24m + d57infant24f + d57infant59m + d57infant59f + d57adults9m + d57adults9f
                + d57adults14m + d57adults14f + d57adults19m + d57adults19f + d57adults24m + d57adults24f + d57adults29m + d57adults29f + d57adults34m + d57adults34f
                + d57adults39m + d57adults39f + d57adults44m + d57adults44f + d57adults49m + d57adults49f + d57adults50m + d57adults50f;
         
        ZimepmsReport d1 = new ZimepmsReport();
        d1.setData_name("D1. Newly diagnosed PLHIV registered into care. (Pre & ART registers)");
        d1.setMonthm1(d1infant3[0]);
        d1.setMonthf1(d1infant3[1]);
        d1.setMonthm2(d1infant12[0]);
        d1.setMonthf2(d1infant12[1]);
        d1.setMonthm3(d1infant24[0]);
        d1.setMonthf3(d1infant24[1]);
        d1.setMonthm4(d1infant59[0]);
        d1.setMonthf4(d1infant59[1]);
        d1.setYearm5(d1adults9[0]);
        d1.setYearf5(d1adults9[1]);
        d1.setYearm6(d1adults14[0]);
        d1.setYearf6(d1adults14[1]);
        d1.setYearm7(d1adults19[0]);
        d1.setYearf7(d1adults19[1]);
        d1.setYearm8(d1adults24[0]);
        d1.setYearf8(d1adults24[1]);
        d1.setYearm9(d1adults29[0]);
        d1.setYearf9(d1adults29[1]);
        d1.setYearm10(d1adults34[0]);
        d1.setYearf10(d1adults34[1]);
        d1.setYearm11(d1adults39[0]);
        d1.setYearf11(d1adults39[1]);
        d1.setYearm12(d1adults44[0]);
        d1.setYearf12(d1adults44[1]);
        d1.setYearm13(d1adults49[0]);
        d1.setYearf13(d1adults49[1]);
        d1.setYearm14(d1adults50[0]);
        d1.setYearf14(d1adults50[1]);
        d1.setTotal(totald1);

        ZimepmsReport d2 = new ZimepmsReport();
        d2.setData_name("D2. Newly diagnosed PLHIV in care in WHO Stage 1 and 2 at registration (Pre & ART registers)");
        d2.setMonthm1(d2infant3[0]);
        d2.setMonthf1(d2infant3[1]);
        d2.setMonthm2(d2infant12[0]);
        d2.setMonthf2(d2infant12[1]);
        d2.setMonthm3(d2infant24[0]);
        d2.setMonthf3(d2infant24[1]);
        d2.setMonthm4(d2infant59[0]);
        d2.setMonthf4(d2infant59[1]);
        d2.setYearm5(d2adults9[0]);
        d2.setYearf5(d2adults9[1]);
        d2.setYearm6(d2adults14[0]);
        d2.setYearf6(d2adults14[1]);
        d2.setYearm7(d2adults19[0]);
        d2.setYearf7(d2adults19[1]);
        d2.setYearm8(d2adults24[0]);
        d2.setYearf8(d2adults24[1]);
        d2.setYearm9(d2adults29[0]);
        d2.setYearf9(d2adults29[1]);
        d2.setYearm10(d2adults34[0]);
        d2.setYearf10(d2adults34[1]);
        d2.setYearm11(d2adults39[0]);
        d2.setYearf11(d2adults39[1]);
        d2.setYearm12(d2adults44[0]);
        d2.setYearf12(d2adults44[1]);
        d2.setYearm13(d2adults49[0]);
        d2.setYearf13(d2adults49[1]);
        d2.setYearm14(d2adults50[0]);
        d2.setYearf14(d2adults50[1]);
        d2.setTotal(totald2);

        ZimepmsReport d3 = new ZimepmsReport();
        d3.setData_name("Newly diagnosed PLHIV in care in WHO Stage 3 and 4 at registration (Pre &- ART Registers)");
        d3.setMonthm1(d3infant3[0]);
        d3.setMonthf1(d3infant3[1]);
        d3.setMonthm2(d3infant12[0]);
        d3.setMonthf2(d3infant12[1]);
        d3.setMonthm3(d3infant24[0]);
        d3.setMonthf3(d3infant24[1]);
        d3.setMonthm4(d3infant59[0]);
        d3.setMonthf4(d3infant59[1]);
        d3.setYearm5(d3adults9[0]);
        d3.setYearf5(d3adults9[1]);
        d3.setYearm6(d3adults14[0]);
        d3.setYearf6(d3adults14[1]);
        d3.setYearm7(d3adults19[0]);
        d3.setYearf7(d3adults19[1]);
        d3.setYearm8(d3adults24[0]);
        d3.setYearf8(d3adults24[1]);
        d3.setYearm9(d3adults29[0]);
        d3.setYearf9(d3adults29[1]);
        d3.setYearm10(d3adults34[0]);
        d3.setYearf10(d3adults34[1]);
        d3.setYearm11(d3adults39[0]);
        d3.setYearf11(d3adults39[1]);
        d3.setYearm12(d3adults44[0]);
        d3.setYearf12(d3adults44[1]);
        d3.setYearm13(d3adults49[0]);
        d3.setYearf13(d3adults49[1]);
        d3.setYearm14(d3adults50[0]);
        d3.setYearf14(d3adults50[1]);
        d3.setTotal(totald3);

        ZimepmsReport d4 = new ZimepmsReport();
        d4.setData_name("D4. Total PLHIV in care started on CTX prophylaxis (including TB patients). (Pre-& ART registers)");
        d4.setMonthm1(d4infant3[0]);
        d4.setMonthf1(d4infant3[1]);
        d4.setMonthm2(d4infant12[0]);
        d4.setMonthf2(d4infant12[1]);
        d4.setMonthm3(d4infant24[0]);
        d4.setMonthf3(d4infant24[1]);
        d4.setMonthm4(d4infant59[0]);
        d4.setMonthf4(d4infant59[1]);
        d4.setYearm5(d4adults9[0]);
        d4.setYearf5(d4adults9[1]);
        d4.setYearm6(d4adults14[0]);
        d4.setYearf6(d4adults14[1]);
        d4.setYearm7(d4adults19[0]);
        d4.setYearf7(d4adults19[1]);
        d4.setYearm8(d4adults24[0]);
        d4.setYearf8(d4adults24[1]);
        d4.setYearm9(d4adults29[0]);
        d4.setYearf9(d4adults29[1]);
        d4.setYearm10(d4adults34[0]);
        d4.setYearf10(d4adults34[1]);
        d4.setYearm11(d4adults39[0]);
        d4.setYearf11(d4adults39[1]);
        d4.setYearm12(d4adults44[0]);
        d4.setYearf12(d4adults44[1]);
        d4.setYearm13(d4adults49[0]);
        d4.setYearf13(d4adults49[1]);
        d4.setYearm14(d4adults50[0]);
        d4.setYearf14(d4adults50[1]);
        d4.setTotal(totald4);

        ZimepmsReport d5 = new ZimepmsReport();
        d5.setData_name("D5. PLHIV in care on CTX who developed adverse events (Essential Changes register)");
        d5.setMonthm1(d5infant3[0]);
        d5.setMonthf1(d5infant3[1]);
        d5.setMonthm2(d5infant12[0]);
        d5.setMonthf2(d5infant12[1]);
        d5.setMonthm3(d5infant24[0]);
        d5.setMonthf3(d5infant24[1]);
        d5.setMonthm4(d5infant59[0]);
        d5.setMonthf4(d5infant59[1]);
        d5.setYearm5(d5adults9[0]);
        d5.setYearf5(d5adults9[1]);
        d5.setYearm6(d5adults14[0]);
        d5.setYearf6(d5adults14[1]);
        d5.setYearm7(d5adults19[0]);
        d5.setYearf7(d5adults19[1]);
        d5.setYearm8(d5adults24[0]);
        d5.setYearf8(d5adults24[1]);
        d5.setYearm9(d5adults29[0]);
        d5.setYearf9(d5adults29[1]);
        d5.setYearm10(d5adults34[0]);
        d5.setYearf10(d5adults34[1]);
        d5.setYearm11(d5adults39[0]);
        d5.setYearf11(d5adults39[1]);
        d5.setYearm12(d5adults44[0]);
        d5.setYearf12(d5adults44[1]);
        d5.setYearm13(d5adults49[0]);
        d5.setYearf13(d5adults49[1]);
        d5.setYearm14(d5adults50[0]);
        d5.setYearf14(d5adults50[1]);
        d5.setTotal(totald5);

        ZimepmsReport d6 = new ZimepmsReport();
        d6.setData_name("D6. PLHIV in care transferred out before initiation on ART (Essential Changes register/Pre-&ART Registers)");
        d6.setMonthm1(d6infant3[0]);
        d6.setMonthf1(d6infant3[1]);
        d6.setMonthm2(d6infant12[0]);
        d6.setMonthf2(d6infant12[1]);
        d6.setMonthm3(d6infant24[0]);
        d6.setMonthf3(d6infant24[1]);
        d6.setMonthm4(d6infant59[0]);
        d6.setMonthf4(d6infant59[1]);
        d6.setYearm5(d6adults9[0]);
        d6.setYearf5(d6adults9[1]);
        d6.setYearm6(d6adults14[0]);
        d6.setYearf6(d6adults14[1]);
        d6.setYearm7(d6adults19[0]);
        d6.setYearf7(d6adults19[1]);
        d6.setYearm8(d6adults24[0]);
        d6.setYearf8(d6adults24[1]);
        d6.setYearm9(d6adults29[0]);
        d6.setYearf9(d6adults29[1]);
        d6.setYearm10(d6adults34[0]);
        d6.setYearf10(d6adults34[1]);
        d6.setYearm11(d6adults39[0]);
        d6.setYearf11(d6adults39[1]);
        d6.setYearm12(d6adults44[0]);
        d6.setYearf12(d6adults44[1]);
        d6.setYearm13(d6adults49[0]);
        d6.setYearf13(d6adults49[1]);
        d6.setYearm14(d6adults50[0]);
        d6.setYearf14(d6adults50[1]);
        d6.setTotal(totald6);

        ZimepmsReport d7 = new ZimepmsReport();
        d7.setData_name("D7. PLHIV in care who transferred in before initiation on ART. (Essential Changes register/Pre-&-ART Register)");
        d7.setMonthm1(d7infant3[0]);
        d7.setMonthf1(d7infant3[1]);
        d7.setMonthm2(d7infant12[0]);
        d7.setMonthf2(d7infant12[1]);
        d7.setMonthm3(d7infant24[0]);
        d7.setMonthf3(d7infant24[1]);
        d7.setMonthm4(d7infant59[0]);
        d7.setMonthf4(d7infant59[1]);
        d7.setYearm5(d7adults9[0]);
        d7.setYearf5(d7adults9[1]);
        d7.setYearm6(d7adults14[0]);
        d7.setYearf6(d7adults14[1]);
        d7.setYearm7(d7adults19[0]);
        d7.setYearf7(d7adults19[1]);
        d7.setYearm8(d7adults24[0]);
        d7.setYearf8(d7adults24[1]);
        d7.setYearm9(d7adults29[0]);
        d7.setYearf9(d7adults29[1]);
        d7.setYearm10(d7adults34[0]);
        d7.setYearf10(d7adults34[1]);
        d7.setYearm11(d7adults39[0]);
        d7.setYearf11(d7adults39[1]);
        d7.setYearm12(d7adults44[0]);
        d7.setYearf12(d7adults44[1]);
        d7.setYearm13(d7adults49[0]);
        d7.setYearf13(d7adults49[1]);
        d7.setYearm14(d7adults50[0]);
        d7.setYearf14(d7adults50[1]);
        d7.setTotal(totald7);

        ZimepmsReport d8 = new ZimepmsReport();
        d8.setData_name("D8. Total PLHIV in care currently on Pre -ART. (Pre &-ART Registers)");
        d8.setMonthm1(d8infant3[0]);
        d8.setMonthf1(d8infant3[1]);
        d8.setMonthm2(d8infant12[0]);
        d8.setMonthf2(d8infant12[1]);
        d8.setMonthm3(d8infant24[0]);
        d8.setMonthf3(d8infant24[1]);
        d8.setMonthm4(d8infant59[0]);
        d8.setMonthf4(d8infant59[1]);
        d8.setYearm5(d8adults9[0]);
        d8.setYearf5(d8adults9[1]);
        d8.setYearm6(d8adults14[0]);
        d8.setYearf6(d8adults14[1]);
        d8.setYearm7(d8adults19[0]);
        d8.setYearf7(d8adults19[1]);
        d8.setYearm8(d8adults24[0]);
        d8.setYearf8(d8adults24[1]);
        d8.setYearm9(d8adults29[0]);
        d8.setYearf9(d8adults29[1]);
        d8.setYearm10(d8adults34[0]);
        d8.setYearf10(d8adults34[1]);
        d8.setYearm11(d8adults39[0]);
        d8.setYearf11(d8adults39[1]);
        d8.setYearm12(d8adults44[0]);
        d8.setYearf12(d8adults44[1]);
        d8.setYearm13(d8adults49[0]);
        d8.setYearf13(d8adults49[1]);
        d8.setYearm14(d8adults50[0]);
        d8.setYearf14(d8adults50[1]);
        d8.setTotal(totald8);

        ZimepmsReport d9 = new ZimepmsReport();
        d9.setData_name("D9. PLHIV screened for Cryptococcal Meningitis with CrAg test (CM) (ART register)");

        ZimepmsReport d10 = new ZimepmsReport();
        d10.setData_name("D10. PLHIV newly diagnosed with Cryptococcal Meningilis (CM) (ART register)");
        d10.setMonthm1(d10infant3[0]);
        d10.setMonthf1(d10infant3[1]);
        d10.setMonthm2(d10infant12[0]);
        d10.setMonthf2(d10infant12[1]);
        d10.setMonthm3(d10infant24[0]);
        d10.setMonthf3(d10infant24[1]);
        d10.setMonthm4(d10infant59[0]);
        d10.setMonthf4(d10infant59[1]);
        d10.setYearm5(d10adults9[0]);
        d10.setYearf5(d10adults9[1]);
        d10.setYearm6(d10adults14[0]);
        d10.setYearf6(d10adults14[1]);
        d10.setYearm7(d10adults19[0]);
        d10.setYearf7(d10adults19[1]);
        d10.setYearm8(d10adults24[0]);
        d10.setYearf8(d10adults24[1]);
        d10.setYearm9(d10adults29[0]);
        d10.setYearf9(d10adults29[1]);
        d10.setYearm10(d10adults34[0]);
        d10.setYearf10(d10adults34[1]);
        d10.setYearm11(d10adults39[0]);
        d10.setYearf11(d10adults39[1]);
        d10.setYearm12(d10adults44[0]);
        d10.setYearf12(d10adults44[1]);
        d10.setYearm13(d10adults49[0]);
        d10.setYearf13(d10adults49[1]);
        d10.setYearm14(d10adults50[0]);
        d10.setYearf14(d10adults50[1]);
        d10.setTotal(totald10);

        ZimepmsReport d11 = new ZimepmsReport();
        d11.setData_name("D11. PLHIV on pre-emptive treatment with fluconazole (ART register)");
        d11.setMonthm1(d11infant3[0]);
        d11.setMonthf1(d11infant3[1]);
        d11.setMonthm2(d11infant12[0]);
        d11.setMonthf2(d11infant12[1]);
        d11.setMonthm3(d11infant24[0]);
        d11.setMonthf3(d11infant24[1]);
        d11.setMonthm4(d11infant59[0]);
        d11.setMonthf4(d11infant59[1]);
        d11.setYearm5(d11adults9[0]);
        d11.setYearf5(d11adults9[1]);
        d11.setYearm6(d11adults14[0]);
        d11.setYearf6(d11adults14[1]);
        d11.setYearm7(d11adults19[0]);
        d11.setYearf7(d11adults19[1]);
        d11.setYearm8(d11adults24[0]);
        d11.setYearf8(d11adults24[1]);
        d11.setYearm9(d11adults29[0]);
        d11.setYearf9(d11adults29[1]);
        d11.setYearm10(d11adults34[0]);
        d11.setYearf10(d11adults34[1]);
        d11.setYearm11(d11adults39[0]);
        d11.setYearf11(d11adults39[1]);
        d11.setYearm12(d11adults44[0]);
        d11.setYearf12(d11adults44[1]);
        d11.setYearm13(d11adults49[0]);
        d11.setYearf13(d11adults49[1]);
        d11.setYearm14(d11adults50[0]);
        d11.setYearf14(d11adults50[1]);
        d11.setTotal(totald11);

        ZimepmsReport d12 = new ZimepmsReport();
        d12.setData_name("D12. PLHIV on treatment for CM (ART register)");

        ZimepmsReport d13 = new ZimepmsReport();
        d13.setData_name("D13. PLHIV in care with CM treatment who developed adverse events (ART register)");
        d13.setMonthm1(d13infant3[0]);
        d13.setMonthf1(d13infant3[1]);
        d13.setMonthm2(d13infant12[0]);
        d13.setMonthf2(d13infant12[1]);
        d13.setMonthm3(d13infant24[0]);
        d13.setMonthf3(d13infant24[1]);
        d13.setMonthm4(d13infant59[0]);
        d13.setMonthf4(d13infant59[1]);
        d13.setYearm5(d13adults9[0]);
        d13.setYearf5(d13adults9[1]);
        d13.setYearm6(d13adults14[0]);
        d13.setYearf6(d13adults14[1]);
        d13.setYearm7(d13adults19[0]);
        d13.setYearf7(d13adults19[1]);
        d13.setYearm8(d13adults24[0]);
        d13.setYearf8(d13adults24[1]);
        d13.setYearm9(d13adults29[0]);
        d13.setYearf9(d13adults29[1]);
        d13.setYearm10(d13adults34[0]);
        d13.setYearf10(d13adults34[1]);
        d13.setYearm11(d13adults39[0]);
        d13.setYearf11(d13adults39[1]);
        d13.setYearm12(d13adults44[0]);
        d13.setYearf12(d13adults44[1]);
        d13.setYearm13(d13adults49[0]);
        d13.setYearf13(d13adults49[1]);
        d13.setYearm14(d13adults50[0]);
        d13.setYearf14(d13adults50[1]);
        d13.setTotal(totald13);

        ZimepmsReport d14 = new ZimepmsReport();
        d14.setData_name("D14. PLHIV in care on ART who had a sample collected for Viral Load testing. (Facility Viral Load Register)");
        d14.setMonthm1(d14infant3[0]);
        d14.setMonthf1(d14infant3[1]);
        d14.setMonthm2(d14infant12[0]);
        d14.setMonthf2(d14infant12[1]);
        d14.setMonthm3(d14infant24[0]);
        d14.setMonthf3(d14infant24[1]);
        d14.setMonthm4(d14infant59[0]);
        d14.setMonthf4(d14infant59[1]);
        d14.setYearm5(d14adults9[0]);
        d14.setYearf5(d14adults9[1]);
        d14.setYearm6(d14adults14[0]);
        d14.setYearf6(d14adults14[1]);
        d14.setYearm7(d14adults19[0]);
        d14.setYearf7(d14adults19[1]);
        d14.setYearm8(d14adults24[0]);
        d14.setYearf8(d14adults24[1]);
        d14.setYearm9(d14adults29[0]);
        d14.setYearf9(d14adults29[1]);
        d14.setYearm10(d14adults34[0]);
        d14.setYearf10(d14adults34[1]);
        d14.setYearm11(d14adults39[0]);
        d14.setYearf11(d14adults39[1]);
        d14.setYearm12(d14adults44[0]);
        d14.setYearf12(d14adults44[1]);
        d14.setYearm13(d14adults49[0]);
        d14.setYearf13(d14adults49[1]);
        d14.setYearm14(d14adults50[0]);
        d14.setYearf14(d14adults50[1]);
        d14.setTotal(totald14);

        ZimepmsReport d15 = new ZimepmsReport();
        d15.setData_name("D15. PLHIV in care on ART who received Viral Load test results.(Facility Viral Load Register)");
        d15.setMonthm1(d15infant3[0]);
        d15.setMonthf1(d15infant3[1]);
        d15.setMonthm2(d15infant12[0]);
        d15.setMonthf2(d15infant12[1]);
        d15.setMonthm3(d15infant24[0]);
        d15.setMonthf3(d15infant24[1]);
        d15.setMonthm4(d15infant59[0]);
        d15.setMonthf4(d15infant59[1]);
        d15.setYearm5(d15adults9[0]);
        d15.setYearf5(d15adults9[1]);
        d15.setYearm6(d15adults14[0]);
        d15.setYearf6(d15adults14[1]);
        d15.setYearm7(d15adults19[0]);
        d15.setYearf7(d15adults19[1]);
        d15.setYearm8(d15adults24[0]);
        d15.setYearf8(d15adults24[1]);
        d15.setYearm9(d15adults29[0]);
        d15.setYearf9(d15adults29[1]);
        d15.setYearm10(d15adults34[0]);
        d15.setYearf10(d15adults34[1]);
        d15.setYearm11(d15adults39[0]);
        d15.setYearf11(d15adults39[1]);
        d15.setYearm12(d15adults44[0]);
        d15.setYearf12(d15adults44[1]);
        d15.setYearm13(d15adults49[0]);
        d15.setYearf13(d15adults49[1]);
        d15.setYearm14(d15adults50[0]);
        d15.setYearf14(d15adults50[1]);
        d15.setTotal(totald15);

        ZimepmsReport d16 = new ZimepmsReport();
        d16.setData_name("D16. PLHIV in care on ART who received Viral Load test results >1,000 copies/ml. (01/ART Patient Care Booklet)");
        d16.setMonthm1(d16infant3[0]);
        d16.setMonthf1(d16infant3[1]);
        d16.setMonthm2(d16infant12[0]);
        d16.setMonthf2(d16infant12[1]);
        d16.setMonthm3(d16infant24[0]);
        d16.setMonthf3(d16infant24[1]);
        d16.setMonthm4(d16infant59[0]);
        d16.setMonthf4(d16infant59[1]);
        d16.setYearm5(d16adults9[0]);
        d16.setYearf5(d16adults9[1]);
        d16.setYearm6(d16adults14[0]);
        d16.setYearf6(d16adults14[1]);
        d16.setYearm7(d16adults19[0]);
        d16.setYearf7(d16adults19[1]);
        d16.setYearm8(d16adults24[0]);
        d16.setYearf8(d16adults24[1]);
        d16.setYearm9(d16adults29[0]);
        d16.setYearf9(d16adults29[1]);
        d16.setYearm10(d16adults34[0]);
        d16.setYearf10(d16adults34[1]);
        d16.setYearm11(d16adults39[0]);
        d16.setYearf11(d16adults39[1]);
        d16.setYearm12(d16adults44[0]);
        d16.setYearf12(d16adults44[1]);
        d16.setYearm13(d16adults49[0]);
        d16.setYearf13(d16adults49[1]);
        d16.setYearm14(d16adults50[0]);
        d16.setYearf14(d16adults50[1]);
        d16.setTotal(totald16);

        ZimepmsReport d17 = new ZimepmsReport();
        d17.setData_name("D17. PLHIV in care on ART who received Viral Load test results >1,000 copies/ml, who received Enhanced Adherence Counselling (01/ART Patient Care Booklet)");
        d17.setMonthm1(d17infant3[0]);
        d17.setMonthf1(d17infant3[1]);
        d17.setMonthm2(d17infant12[0]);
        d17.setMonthf2(d17infant12[1]);
        d17.setMonthm3(d17infant24[0]);
        d17.setMonthf3(d17infant24[1]);
        d17.setMonthm4(d17infant59[0]);
        d17.setMonthf4(d17infant59[1]);
        d17.setYearm5(d17adults9[0]);
        d17.setYearf5(d17adults9[1]);
        d17.setYearm6(d17adults14[0]);
        d17.setYearf6(d17adults14[1]);
        d17.setYearm7(d17adults19[0]);
        d17.setYearf7(d17adults19[1]);
        d17.setYearm8(d17adults24[0]);
        d17.setYearf8(d17adults24[1]);
        d17.setYearm9(d17adults29[0]);
        d17.setYearf9(d17adults29[1]);
        d17.setYearm10(d17adults34[0]);
        d17.setYearf10(d17adults34[1]);
        d17.setYearm11(d17adults39[0]);
        d17.setYearf11(d17adults39[1]);
        d17.setYearm12(d17adults44[0]);
        d17.setYearf12(d17adults44[1]);
        d17.setYearm13(d17adults49[0]);
        d17.setYearf13(d17adults49[1]);
        d17.setYearm14(d17adults50[0]);
        d17.setYearf14(d17adults50[1]);
        d17.setTotal(totald17);

        ZimepmsReport d18 = new ZimepmsReport();
        d18.setData_name("D18. PLHIV in care on ART who completed EAC and had second VL Test done (01/ART Patient Care Booklet)");
        d18.setMonthm1(d18infant3[0]);
        d18.setMonthf1(d18infant3[1]);
        d18.setMonthm2(d18infant12[0]);
        d18.setMonthf2(d18infant12[1]);
        d18.setMonthm3(d18infant24[0]);
        d18.setMonthf3(d18infant24[1]);
        d18.setMonthm4(d18infant59[0]);
        d18.setMonthf4(d18infant59[1]);
        d18.setYearm5(d18adults9[0]);
        d18.setYearf5(d18adults9[1]);
        d18.setYearm6(d18adults14[0]);
        d18.setYearf6(d18adults14[1]);
        d18.setYearm7(d18adults19[0]);
        d18.setYearf7(d18adults19[1]);
        d18.setYearm8(d18adults24[0]);
        d18.setYearf8(d18adults24[1]);
        d18.setYearm9(d18adults29[0]);
        d18.setYearf9(d18adults29[1]);
        d18.setYearm10(d18adults34[0]);
        d18.setYearf10(d18adults34[1]);
        d18.setYearm11(d18adults39[0]);
        d18.setYearf11(d18adults39[1]);
        d18.setYearm12(d18adults44[0]);
        d18.setYearf12(d18adults44[1]);
        d18.setYearm13(d18adults49[0]);
        d18.setYearf13(d18adults49[1]);
        d18.setYearm14(d18adults50[0]);
        d18.setYearf14(d18adults50[1]);
        d18.setTotal(totald18);

        ZimepmsReport d19 = new ZimepmsReport();
        d19.setData_name("D19. PLHIV in care on ART who had high second Viral Load test results >1,000 copies/ml. (01/ART Patient Care Booklet)");
        d19.setMonthm1(d19infant3[0]);
        d19.setMonthf1(d19infant3[1]);
        d19.setMonthm2(d19infant12[0]);
        d19.setMonthf2(d19infant12[1]);
        d19.setMonthm3(d19infant24[0]);
        d19.setMonthf3(d19infant24[1]);
        d19.setMonthm4(d19infant59[0]);
        d19.setMonthf4(d19infant59[1]);
        d19.setYearm5(d19adults9[0]);
        d19.setYearf5(d19adults9[1]);
        d19.setYearm6(d19adults14[0]);
        d19.setYearf6(d19adults14[1]);
        d19.setYearm7(d19adults19[0]);
        d19.setYearf7(d19adults19[1]);
        d19.setYearm8(d19adults24[0]);
        d19.setYearf8(d19adults24[1]);
        d19.setYearm9(d19adults29[0]);
        d19.setYearf9(d19adults29[1]);
        d19.setYearm10(d19adults34[0]);
        d19.setYearf10(d19adults34[1]);
        d19.setYearm11(d19adults39[0]);
        d19.setYearf11(d19adults39[1]);
        d19.setYearm12(d19adults44[0]);
        d19.setYearf12(d19adults44[1]);
        d19.setYearm13(d19adults49[0]);
        d19.setYearf13(d19adults49[1]);
        d19.setYearm14(d19adults50[0]);
        d19.setYearf14(d19adults50[1]);
        d19.setTotal(totald19);

        ZimepmsReport d20 = new ZimepmsReport();
        d20.setData_name("D20. PLHIV in care on First line switching to Second line. (Facility Viral Load Register/ Essential Changes register)");
        d20.setMonthm1(d20infant3[0]);
        d20.setMonthf1(d20infant3[1]);
        d20.setMonthm2(d20infant12[0]);
        d20.setMonthf2(d20infant12[1]);
        d20.setMonthm3(d20infant24[0]);
        d20.setMonthf3(d20infant24[1]);
        d20.setMonthm4(d20infant59[0]);
        d20.setMonthf4(d20infant59[1]);
        d20.setYearm5(d20adults9[0]);
        d20.setYearf5(d20adults9[1]);
        d20.setYearm6(d20adults14[0]);
        d20.setYearf6(d20adults14[1]);
        d20.setYearm7(d20adults19[0]);
        d20.setYearf7(d20adults19[1]);
        d20.setYearm8(d20adults24[0]);
        d20.setYearf8(d20adults24[1]);
        d20.setYearm9(d20adults29[0]);
        d20.setYearf9(d20adults29[1]);
        d20.setYearm10(d20adults34[0]);
        d20.setYearf10(d20adults34[1]);
        d20.setYearm11(d20adults39[0]);
        d20.setYearf11(d20adults39[1]);
        d20.setYearm12(d20adults44[0]);
        d20.setYearf12(d20adults44[1]);
        d20.setYearm13(d20adults49[0]);
        d20.setYearf13(d20adults49[1]);
        d20.setYearm14(d20adults50[0]);
        d20.setYearf14(d20adults50[1]);
        d20.setTotal(totald20);

        ZimepmsReport d21 = new ZimepmsReport();
        d21.setData_name("D21. PLHIV in care on Second line switching to Third line regimen (Facility Viral Load register/Essential Changes Register)");
        d21.setMonthm1(d21infant3[0]);
        d21.setMonthf1(d21infant3[1]);
        d21.setMonthm2(d21infant12[0]);
        d21.setMonthf2(d21infant12[1]);
        d21.setMonthm3(d21infant24[0]);
        d21.setMonthf3(d21infant24[1]);
        d21.setMonthm4(d21infant59[0]);
        d21.setMonthf4(d21infant59[1]);
        d21.setYearm5(d21adults9[0]);
        d21.setYearf5(d21adults9[1]);
        d21.setYearm6(d21adults14[0]);
        d21.setYearf6(d21adults14[1]);
        d21.setYearm7(d21adults19[0]);
        d21.setYearf7(d21adults19[1]);
        d21.setYearm8(d21adults24[0]);
        d21.setYearf8(d21adults24[1]);
        d21.setYearm9(d21adults29[0]);
        d21.setYearf9(d21adults29[1]);
        d21.setYearm10(d21adults34[0]);
        d21.setYearf10(d21adults34[1]);
        d21.setYearm11(d21adults39[0]);
        d21.setYearf11(d21adults39[1]);
        d21.setYearm12(d21adults44[0]);
        d21.setYearf12(d21adults44[1]);
        d21.setYearm13(d21adults49[0]);
        d21.setYearf13(d21adults49[1]);
        d21.setYearm14(d21adults50[0]);
        d21.setYearf14(d21adults50[1]);
        d21.setTotal(totald21);

        ZimepmsReport d22 = new ZimepmsReport();
        d22.setData_name("D22. PLHIV in care initiated on ART with a C04 count <200 cell/mm3this month. (ART register)");
        d22.setMonthm1(d22infant3[0]);
        d22.setMonthf1(d22infant3[1]);
        d22.setMonthm2(d22infant12[0]);
        d22.setMonthf2(d22infant12[1]);
        d22.setMonthm3(d22infant24[0]);
        d22.setMonthf3(d22infant24[1]);
        d22.setMonthm4(d22infant59[0]);
        d22.setMonthf4(d22infant59[1]);
        d22.setYearm5(d22adults9[0]);
        d22.setYearf5(d22adults9[1]);
        d22.setYearm6(d22adults14[0]);
        d22.setYearf6(d22adults14[1]);
        d22.setYearm7(d22adults19[0]);
        d22.setYearf7(d22adults19[1]);
        d22.setYearm8(d22adults24[0]);
        d22.setYearf8(d22adults24[1]);
        d22.setYearm9(d22adults29[0]);
        d22.setYearf9(d22adults29[1]);
        d22.setYearm10(d22adults34[0]);
        d22.setYearf10(d22adults34[1]);
        d22.setYearm11(d22adults39[0]);
        d22.setYearf11(d22adults39[1]);
        d22.setYearm12(d22adults44[0]);
        d22.setYearf12(d22adults44[1]);
        d22.setYearm13(d22adults49[0]);
        d22.setYearf13(d22adults49[1]);
        d22.setYearm14(d22adults50[0]);
        d22.setYearf14(d22adults50[1]);
        d22.setTotal(totald22);

        ZimepmsReport d23 = new ZimepmsReport();
        d23.setData_name("D23. PLHIV in care initiated on ART with aC04 count =>200 to <500 cellfmm3. (ART register)");
        d23.setMonthm1(d23infant3[0]);
        d23.setMonthf1(d23infant3[1]);
        d23.setMonthm2(d23infant12[0]);
        d23.setMonthf2(d23infant12[1]);
        d23.setMonthm3(d23infant24[0]);
        d23.setMonthf3(d23infant24[1]);
        d23.setMonthm4(d23infant59[0]);
        d23.setMonthf4(d23infant59[1]);
        d23.setYearm5(d23adults9[0]);
        d23.setYearf5(d23adults9[1]);
        d23.setYearm6(d23adults14[0]);
        d23.setYearf6(d23adults14[1]);
        d23.setYearm7(d23adults19[0]);
        d23.setYearf7(d23adults19[1]);
        d23.setYearm8(d23adults24[0]);
        d23.setYearf8(d23adults24[1]);
        d23.setYearm9(d23adults29[0]);
        d23.setYearf9(d23adults29[1]);
        d23.setYearm10(d23adults34[0]);
        d23.setYearf10(d23adults34[1]);
        d23.setYearm11(d23adults39[0]);
        d23.setYearf11(d23adults39[1]);
        d23.setYearm12(d23adults44[0]);
        d23.setYearf12(d23adults44[1]);
        d23.setYearm13(d23adults49[0]);
        d23.setYearf13(d23adults49[1]);
        d23.setYearm14(d23adults50[0]);
        d23.setYearf14(d23adults50[1]);
        d23.setTotal(totald23);

        ZimepmsReport d24 = new ZimepmsReport();
        d24.setData_name("D24. PLHIV in care initíated on ART with aC04 count =>500 cell/mm3. (ART register)");
        d24.setMonthm1(d24infant3[0]);
        d24.setMonthf1(d24infant3[1]);
        d24.setMonthm2(d24infant12[0]);
        d24.setMonthf2(d24infant12[1]);
        d24.setMonthm3(d24infant24[0]);
        d24.setMonthf3(d24infant24[1]);
        d24.setMonthm4(d24infant59[0]);
        d24.setMonthf4(d24infant59[1]);
        d24.setYearm5(d24adults9[0]);
        d24.setYearf5(d24adults9[1]);
        d24.setYearm6(d24adults14[0]);
        d24.setYearf6(d24adults14[1]);
        d24.setYearm7(d24adults19[0]);
        d24.setYearf7(d24adults19[1]);
        d24.setYearm8(d24adults24[0]);
        d24.setYearf8(d24adults24[1]);
        d24.setYearm9(d24adults29[0]);
        d24.setYearf9(d24adults29[1]);
        d24.setYearm10(d24adults34[0]);
        d24.setYearf10(d24adults34[1]);
        d24.setYearm11(d24adults39[0]);
        d24.setYearf11(d24adults39[1]);
        d24.setYearm12(d24adults44[0]);
        d24.setYearf12(d24adults44[1]);
        d24.setYearm13(d24adults49[0]);
        d24.setYearf13(d24adults49[1]);
        d24.setYearm14(d24adults50[0]);
        d24.setYearf14(d24adults50[1]);
        d24.setTotal(totald24);

        ZimepmsReport d25 = new ZimepmsReport();
        d25.setData_name("D25. PLHIV in care newly initiated on first line ART. (ART register)");
        d25.setMonthm1(d25infant3[0]);
        d25.setMonthf1(d25infant3[1]);
        d25.setMonthm2(d25infant12[0]);
        d25.setMonthf2(d25infant12[1]);
        d25.setMonthm3(d25infant24[0]);
        d25.setMonthf3(d25infant24[1]);
        d25.setMonthm4(d25infant59[0]);
        d25.setMonthf4(d25infant59[1]);
        d25.setYearm5(d25adults9[0]);
        d25.setYearf5(d25adults9[1]);
        d25.setYearm6(d25adults14[0]);
        d25.setYearf6(d25adults14[1]);
        d25.setYearm7(d25adults19[0]);
        d25.setYearf7(d25adults19[1]);
        d25.setYearm8(d25adults24[0]);
        d25.setYearf8(d25adults24[1]);
        d25.setYearm9(d25adults29[0]);
        d25.setYearf9(d25adults29[1]);
        d25.setYearm10(d25adults34[0]);
        d25.setYearf10(d25adults34[1]);
        d25.setYearm11(d25adults39[0]);
        d25.setYearf11(d25adults39[1]);
        d25.setYearm12(d25adults44[0]);
        d25.setYearf12(d25adults44[1]);
        d25.setYearm13(d25adults49[0]);
        d25.setYearf13(d25adults49[1]);
        d25.setYearm14(d25adults50[0]);
        d25.setYearf14(d25adults50[1]);
        d25.setTotal(totald25);

        ZimepmsReport d26 = new ZimepmsReport();
        d26.setData_name("D26. PLHIV in care reinitiated on First line ART after Lost To Follow Up (ART Register)");
        d26.setMonthm1(d26infant3[0]);
        d26.setMonthf1(d26infant3[1]);
        d26.setMonthm2(d26infant12[0]);
        d26.setMonthf2(d26infant12[1]);
        d26.setMonthm3(d26infant24[0]);
        d26.setMonthf3(d26infant24[1]);
        d26.setMonthm4(d26infant59[0]);
        d26.setMonthf4(d26infant59[1]);
        d26.setYearm5(d26adults9[0]);
        d26.setYearf5(d26adults9[1]);
        d26.setYearm6(d26adults14[0]);
        d26.setYearf6(d26adults14[1]);
        d26.setYearm7(d26adults19[0]);
        d26.setYearf7(d26adults19[1]);
        d26.setYearm8(d26adults24[0]);
        d26.setYearf8(d26adults24[1]);
        d26.setYearm9(d26adults29[0]);
        d26.setYearf9(d26adults29[1]);
        d26.setYearm10(d26adults34[0]);
        d26.setYearf10(d26adults34[1]);
        d26.setYearm11(d26adults39[0]);
        d26.setYearf11(d26adults39[1]);
        d26.setYearm12(d26adults44[0]);
        d26.setYearf12(d26adults44[1]);
        d26.setYearm13(d26adults49[0]);
        d26.setYearf13(d26adults49[1]);
        d26.setYearm14(d26adults50[0]);
        d26.setYearf14(d26adults50[1]);
        d26.setTotal(totald26);

        ZimepmsReport d27 = new ZimepmsReport();
        d27.setData_name("D27. PLHIV in care reinitiated on First Line ART after stopping treatment (ART register)");
        d27.setMonthm1(d27infant3[0]);
        d27.setMonthf1(d27infant3[1]);
        d27.setMonthm2(d27infant12[0]);
        d27.setMonthf2(d27infant12[1]);
        d27.setMonthm3(d27infant24[0]);
        d27.setMonthf3(d27infant24[1]);
        d27.setMonthm4(d27infant59[0]);
        d27.setMonthf4(d27infant59[1]);
        d27.setYearm5(d27adults9[0]);
        d27.setYearf5(d27adults9[1]);
        d27.setYearm6(d27adults14[0]);
        d27.setYearf6(d27adults14[1]);
        d27.setYearm7(d27adults19[0]);
        d27.setYearf7(d27adults19[1]);
        d27.setYearm8(d27adults24[0]);
        d27.setYearf8(d27adults24[1]);
        d27.setYearm9(d27adults29[0]);
        d27.setYearf9(d27adults29[1]);
        d27.setYearm10(d27adults34[0]);
        d27.setYearf10(d27adults34[1]);
        d27.setYearm11(d27adults39[0]);
        d27.setYearf11(d27adults39[1]);
        d27.setYearm12(d27adults44[0]);
        d27.setYearf12(d27adults44[1]);
        d27.setYearm13(d27adults49[0]);
        d27.setYearf13(d27adults49[1]);
        d27.setYearm14(d27adults50[0]);
        d27.setYearf14(d27adults50[1]);
        d27.setTotal(totald27);

        ZimepmsReport d28 = new ZimepmsReport();
        d28.setData_name("D28. PLHIV in care reinitiated on First line ART from the private and diaspora (ART Register)");
        d28.setMonthm1(d28infant3[0]);
        d28.setMonthf1(d28infant3[1]);
        d28.setMonthm2(d28infant12[0]);
        d28.setMonthf2(d28infant12[1]);
        d28.setMonthm3(d28infant24[0]);
        d28.setMonthf3(d28infant24[1]);
        d28.setMonthm4(d28infant59[0]);
        d28.setMonthf4(d28infant59[1]);
        d28.setYearm5(d28adults9[0]);
        d28.setYearf5(d28adults9[1]);
        d28.setYearm6(d28adults14[0]);
        d28.setYearf6(d28adults14[1]);
        d28.setYearm7(d28adults19[0]);
        d28.setYearf7(d28adults19[1]);
        d28.setYearm8(d28adults24[0]);
        d28.setYearf8(d28adults24[1]);
        d28.setYearm9(d28adults29[0]);
        d28.setYearf9(d28adults29[1]);
        d28.setYearm10(d28adults34[0]);
        d28.setYearf10(d28adults34[1]);
        d28.setYearm11(d28adults39[0]);
        d28.setYearf11(d28adults39[1]);
        d28.setYearm12(d28adults44[0]);
        d28.setYearf12(d28adults44[1]);
        d28.setYearm13(d28adults49[0]);
        d28.setYearf13(d28adults49[1]);
        d28.setYearm14(d28adults50[0]);
        d28.setYearf14(d28adults50[1]);
        d28.setTotal(totald28);

        ZimepmsReport d29 = new ZimepmsReport();
        d29.setData_name("D29. PLHIV in care who have died whilst on First line regimen (Essential Changes register)");
        d29.setMonthm1(d29infant3[0]);
        d29.setMonthf1(d29infant3[1]);
        d29.setMonthm2(d29infant12[0]);
        d29.setMonthf2(d29infant12[1]);
        d29.setMonthm3(d29infant24[0]);
        d29.setMonthf3(d29infant24[1]);
        d29.setMonthm4(d29infant59[0]);
        d29.setMonthf4(d29infant59[1]);
        d29.setYearm5(d29adults9[0]);
        d29.setYearf5(d29adults9[1]);
        d29.setYearm6(d29adults14[0]);
        d29.setYearf6(d29adults14[1]);
        d29.setYearm7(d29adults19[0]);
        d29.setYearf7(d29adults19[1]);
        d29.setYearm8(d29adults24[0]);
        d29.setYearf8(d29adults24[1]);
        d29.setYearm9(d29adults29[0]);
        d29.setYearf9(d29adults29[1]);
        d29.setYearm10(d29adults34[0]);
        d29.setYearf10(d29adults34[1]);
        d29.setYearm11(d29adults39[0]);
        d29.setYearf11(d29adults39[1]);
        d29.setYearm12(d29adults44[0]);
        d29.setYearf12(d29adults44[1]);
        d29.setYearm13(d29adults49[0]);
        d29.setYearf13(d29adults49[1]);
        d29.setYearm14(d29adults50[0]);
        d29.setYearf14(d29adults50[1]);
        d29.setTotal(totald29);

        ZimepmsReport d30 = new ZimepmsReport();
        d30.setData_name("D30. PLHIV lost to follow up whilst on First line regimen (28 days) (Essential Changes register)");
        d30.setMonthm1(d30infant3[0]);
        d30.setMonthf1(d30infant3[1]);
        d30.setMonthm2(d30infant12[0]);
        d30.setMonthf2(d30infant12[1]);
        d30.setMonthm3(d30infant24[0]);
        d30.setMonthf3(d30infant24[1]);
        d30.setMonthm4(d30infant59[0]);
        d30.setMonthf4(d30infant59[1]);
        d30.setYearm5(d30adults9[0]);
        d30.setYearf5(d30adults9[1]);
        d30.setYearm6(d30adults14[0]);
        d30.setYearf6(d30adults14[1]);
        d30.setYearm7(d30adults19[0]);
        d30.setYearf7(d30adults19[1]);
        d30.setYearm8(d30adults24[0]);
        d30.setYearf8(d30adults24[1]);
        d30.setYearm9(d30adults29[0]);
        d30.setYearf9(d30adults29[1]);
        d30.setYearm10(d30adults34[0]);
        d30.setYearf10(d30adults34[1]);
        d30.setYearm11(d30adults39[0]);
        d30.setYearf11(d30adults39[1]);
        d30.setYearm12(d30adults44[0]);
        d30.setYearf12(d30adults44[1]);
        d30.setYearm13(d30adults49[0]);
        d30.setYearf13(d30adults49[1]);
        d30.setYearm14(d30adults50[0]);
        d30.setYearf14(d30adults50[1]);
        d30.setTotal(totald30);

        ZimepmsReport d31 = new ZimepmsReport();
        d31.setData_name("D31. PLHIV in care who transferred out whilst on First line regimen. (Essential Changes register)");
        d31.setMonthm1(d31infant3[0]);
        d31.setMonthf1(d31infant3[1]);
        d31.setMonthm2(d31infant12[0]);
        d31.setMonthf2(d31infant12[1]);
        d31.setMonthm3(d31infant24[0]);
        d31.setMonthf3(d31infant24[1]);
        d31.setMonthm4(d31infant59[0]);
        d31.setMonthf4(d31infant59[1]);
        d31.setYearm5(d31adults9[0]);
        d31.setYearf5(d31adults9[1]);
        d31.setYearm6(d31adults14[0]);
        d31.setYearf6(d31adults14[1]);
        d31.setYearm7(d31adults19[0]);
        d31.setYearf7(d31adults19[1]);
        d31.setYearm8(d31adults24[0]);
        d31.setYearf8(d31adults24[1]);
        d31.setYearm9(d31adults29[0]);
        d31.setYearf9(d31adults29[1]);
        d31.setYearm10(d31adults34[0]);
        d31.setYearf10(d31adults34[1]);
        d31.setYearm11(d31adults39[0]);
        d31.setYearf11(d31adults39[1]);
        d31.setYearm12(d31adults44[0]);
        d31.setYearf12(d31adults44[1]);
        d31.setYearm13(d31adults49[0]);
        d31.setYearf13(d31adults49[1]);
        d31.setYearm14(d31adults50[0]);
        d31.setYearf14(d31adults50[1]);
        d31.setTotal(totald31);

        ZimepmsReport d32 = new ZimepmsReport();
        d32.setData_name("D32. PLHIV in care who transferred in whilst on First line regimen (Essential Changes register)");
        d32.setMonthm1(d32infant3[0]);
        d32.setMonthf1(d32infant3[1]);
        d32.setMonthm2(d32infant12[0]);
        d32.setMonthf2(d32infant12[1]);
        d32.setMonthm3(d32infant24[0]);
        d32.setMonthf3(d32infant24[1]);
        d32.setMonthm4(d32infant59[0]);
        d32.setMonthf4(d32infant59[1]);
        d32.setYearm5(d32adults9[0]);
        d32.setYearf5(d32adults9[1]);
        d32.setYearm6(d32adults14[0]);
        d32.setYearf6(d32adults14[1]);
        d32.setYearm7(d32adults19[0]);
        d32.setYearf7(d32adults19[1]);
        d32.setYearm8(d32adults24[0]);
        d32.setYearf8(d32adults24[1]);
        d32.setYearm9(d32adults29[0]);
        d32.setYearf9(d32adults29[1]);
        d32.setYearm10(d32adults34[0]);
        d32.setYearf10(d32adults34[1]);
        d32.setYearm11(d32adults39[0]);
        d32.setYearf11(d32adults39[1]);
        d32.setYearm12(d32adults44[0]);
        d32.setYearf12(d32adults44[1]);
        d32.setYearm13(d32adults49[0]);
        d32.setYearf13(d32adults49[1]);
        d32.setYearm14(d32adults50[0]);
        d32.setYearf14(d32adults50[1]);
        d32.setTotal(totald32);

        ZimepmsReport d33 = new ZimepmsReport();
        d33.setData_name("D33. PLHIV in care on First line regimen who had adverse events (Essential Changes register)");
        d33.setMonthm1(d33infant3[0]);
        d33.setMonthf1(d33infant3[1]);
        d33.setMonthm2(d33infant12[0]);
        d33.setMonthf2(d33infant12[1]);
        d33.setMonthm3(d33infant24[0]);
        d33.setMonthf3(d33infant24[1]);
        d33.setMonthm4(d33infant59[0]);
        d33.setMonthf4(d33infant59[1]);
        d33.setYearm5(d33adults9[0]);
        d33.setYearf5(d33adults9[1]);
        d33.setYearm6(d33adults14[0]);
        d33.setYearf6(d33adults14[1]);
        d33.setYearm7(d33adults19[0]);
        d33.setYearf7(d33adults19[1]);
        d33.setYearm8(d33adults24[0]);
        d33.setYearf8(d33adults24[1]);
        d33.setYearm9(d33adults29[0]);
        d33.setYearf9(d33adults29[1]);
        d33.setYearm10(d33adults34[0]);
        d33.setYearf10(d33adults34[1]);
        d33.setYearm11(d33adults39[0]);
        d33.setYearf11(d33adults39[1]);
        d33.setYearm12(d33adults44[0]);
        d33.setYearf12(d33adults44[1]);
        d33.setYearm13(d33adults49[0]);
        d33.setYearf13(d33adults49[1]);
        d33.setYearm14(d33adults50[0]);
        d33.setYearf14(d33adults50[1]);
        d33.setTotal(totald33);

        ZimepmsReport d34 = new ZimepmsReport();
        d34.setData_name("D34. PLHIV in care who Medically stopped treatment whilst on First line regimen (Essential Changes register)");
        d34.setMonthm1(d34infant3[0]);
        d34.setMonthf1(d34infant3[1]);
        d34.setMonthm2(d34infant12[0]);
        d34.setMonthf2(d34infant12[1]);
        d34.setMonthm3(d34infant24[0]);
        d34.setMonthf3(d34infant24[1]);
        d34.setMonthm4(d34infant59[0]);
        d34.setMonthf4(d34infant59[1]);
        d34.setYearm5(d34adults9[0]);
        d34.setYearf5(d34adults9[1]);
        d34.setYearm6(d34adults14[0]);
        d34.setYearf6(d34adults14[1]);
        d34.setYearm7(d34adults19[0]);
        d34.setYearf7(d34adults19[1]);
        d34.setYearm8(d34adults24[0]);
        d34.setYearf8(d34adults24[1]);
        d34.setYearm9(d34adults29[0]);
        d34.setYearf9(d34adults29[1]);
        d34.setYearm10(d34adults34[0]);
        d34.setYearf10(d34adults34[1]);
        d34.setYearm11(d34adults39[0]);
        d34.setYearf11(d34adults39[1]);
        d34.setYearm12(d34adults44[0]);
        d34.setYearf12(d34adults44[1]);
        d34.setYearm13(d34adults49[0]);
        d34.setYearf13(d34adults49[1]);
        d34.setYearm14(d34adults50[0]);
        d34.setYearf14(d34adults50[1]);
        d34.setTotal(totald34);

        ZimepmsReport d35 = new ZimepmsReport();
        d35.setData_name("D35. PLHIV in care on First line substituting due to toxicity(Essential Changes register)");
        d35.setMonthm1(d35infant3[0]);
        d35.setMonthf1(d35infant3[1]);
        d35.setMonthm2(d35infant12[0]);
        d35.setMonthf2(d35infant12[1]);
        d35.setMonthm3(d35infant24[0]);
        d35.setMonthf3(d35infant24[1]);
        d35.setMonthm4(d35infant59[0]);
        d35.setMonthf4(d35infant59[1]);
        d35.setYearm5(d35adults9[0]);
        d35.setYearf5(d35adults9[1]);
        d35.setYearm6(d35adults14[0]);
        d35.setYearf6(d35adults14[1]);
        d35.setYearm7(d35adults19[0]);
        d35.setYearf7(d35adults19[1]);
        d35.setYearm8(d35adults24[0]);
        d35.setYearf8(d35adults24[1]);
        d35.setYearm9(d35adults29[0]);
        d35.setYearf9(d35adults29[1]);
        d35.setYearm10(d35adults34[0]);
        d35.setYearf10(d35adults34[1]);
        d35.setYearm11(d35adults39[0]);
        d35.setYearf11(d35adults39[1]);
        d35.setYearm12(d35adults44[0]);
        d35.setYearf12(d35adults44[1]);
        d35.setYearm13(d35adults49[0]);
        d35.setYearf13(d35adults49[1]);
        d35.setYearm14(d35adults50[0]);
        d35.setYearf14(d35adults50[1]);
        d35.setTotal(totald35);

        ZimepmsReport d36 = new ZimepmsReport();
        d36.setData_name("D36. Total PLHIV in care currently receiving first line ART(including those initiated and reinitiated during this current Month)");
        d36.setMonthm1(d36infant3[0]);
        d36.setMonthf1(d36infant3[1]);
        d36.setMonthm2(d36infant12[0]);
        d36.setMonthf2(d36infant12[1]);
        d36.setMonthm3(d36infant24[0]);
        d36.setMonthf3(d36infant24[1]);
        d36.setMonthm4(d36infant59[0]);
        d36.setMonthf4(d36infant59[1]);
        d36.setYearm5(d36adults9[0]);
        d36.setYearf5(d36adults9[1]);
        d36.setYearm6(d36adults14[0]);
        d36.setYearf6(d36adults14[1]);
        d36.setYearm7(d36adults19[0]);
        d36.setYearf7(d36adults19[1]);
        d36.setYearm8(d36adults24[0]);
        d36.setYearf8(d36adults24[1]);
        d36.setYearm9(d36adults29[0]);
        d36.setYearf9(d36adults29[1]);
        d36.setYearm10(d36adults34[0]);
        d36.setYearf10(d36adults34[1]);
        d36.setYearm11(d36adults39[0]);
        d36.setYearf11(d36adults39[1]);
        d36.setYearm12(d36adults44[0]);
        d36.setYearf12(d36adults44[1]);
        d36.setYearm13(d36adults49[0]);
        d36.setYearf13(d36adults49[1]);
        d36.setYearm14(d36adults50[0]);
        d36.setYearf14(d36adults50[1]);
        d36.setTotal(totald36);

        ZimepmsReport d37 = new ZimepmsReport();
        d37.setData_name("D37. PLHIV in care reinitiated on Second line ART after stopping (ART Reqister)");

        ZimepmsReport d38 = new ZimepmsReport();
        d38.setData_name("D38. PLHIV in care reinitiated on Second line ART after Lost To Follow Up (ART Register)");
        d38.setMonthm1(d38infant3[0]);
        d38.setMonthf1(d38infant3[1]);
        d38.setMonthm2(d38infant12[0]);
        d38.setMonthf2(d38infant12[1]);
        d38.setMonthm3(d38infant24[0]);
        d38.setMonthf3(d38infant24[1]);
        d38.setMonthm4(d38infant59[0]);
        d38.setMonthf4(d38infant59[1]);
        d38.setYearm5(d38adults9[0]);
        d38.setYearf5(d38adults9[1]);
        d38.setYearm6(d38adults14[0]);
        d38.setYearf6(d38adults14[1]);
        d38.setYearm7(d38adults19[0]);
        d38.setYearf7(d38adults19[1]);
        d38.setYearm8(d38adults24[0]);
        d38.setYearf8(d38adults24[1]);
        d38.setYearm9(d38adults29[0]);
        d38.setYearf9(d38adults29[1]);
        d38.setYearm10(d38adults34[0]);
        d38.setYearf10(d38adults34[1]);
        d38.setYearm11(d38adults39[0]);
        d38.setYearf11(d38adults39[1]);
        d38.setYearm12(d38adults44[0]);
        d38.setYearf12(d38adults44[1]);
        d38.setYearm13(d38adults49[0]);
        d38.setYearf13(d38adults49[1]);
        d38.setYearm14(d38adults50[0]);
        d38.setYearf14(d38adults50[1]);
        d38.setTotal(totald38);

        ZimepmsReport d39 = new ZimepmsReport();
        d39.setData_name("D39. PLHIV in care who died whilst on Second line ART regimen (Essential Changes register)");
        d39.setMonthm1(d39infant3[0]);
        d39.setMonthf1(d39infant3[1]);
        d39.setMonthm2(d39infant12[0]);
        d39.setMonthf2(d39infant12[1]);
        d39.setMonthm3(d39infant24[0]);
        d39.setMonthf3(d39infant24[1]);
        d39.setMonthm4(d39infant59[0]);
        d39.setMonthf4(d39infant59[1]);
        d39.setYearm5(d39adults9[0]);
        d39.setYearf5(d39adults9[1]);
        d39.setYearm6(d39adults14[0]);
        d39.setYearf6(d39adults14[1]);
        d39.setYearm7(d39adults19[0]);
        d39.setYearf7(d39adults19[1]);
        d39.setYearm8(d39adults24[0]);
        d39.setYearf8(d39adults24[1]);
        d39.setYearm9(d39adults29[0]);
        d39.setYearf9(d39adults29[1]);
        d39.setYearm10(d39adults34[0]);
        d39.setYearf10(d39adults34[1]);
        d39.setYearm11(d39adults39[0]);
        d39.setYearf11(d39adults39[1]);
        d39.setYearm12(d39adults44[0]);
        d39.setYearf12(d39adults44[1]);
        d39.setYearm13(d39adults49[0]);
        d39.setYearf13(d39adults49[1]);
        d39.setYearm14(d39adults50[0]);
        d39.setYearf14(d39adults50[1]);
        d39.setTotal(totald39);

        ZimepmsReport d40 = new ZimepmsReport();
        d40.setData_name("D40. PLHIV lost to follow up whilst on Second line regimen. (Essential Chanaes reaister)");
        d40.setMonthm1(d40infant3[0]);
        d40.setMonthf1(d40infant3[1]);
        d40.setMonthm2(d40infant12[0]);
        d40.setMonthf2(d40infant12[1]);
        d40.setMonthm3(d40infant24[0]);
        d40.setMonthf3(d40infant24[1]);
        d40.setMonthm4(d40infant59[0]);
        d40.setMonthf4(d40infant59[1]);
        d40.setYearm5(d40adults9[0]);
        d40.setYearf5(d40adults9[1]);
        d40.setYearm6(d40adults14[0]);
        d40.setYearf6(d40adults14[1]);
        d40.setYearm7(d40adults19[0]);
        d40.setYearf7(d40adults19[1]);
        d40.setYearm8(d40adults24[0]);
        d40.setYearf8(d40adults24[1]);
        d40.setYearm9(d40adults29[0]);
        d40.setYearf9(d40adults29[1]);
        d40.setYearm10(d40adults34[0]);
        d40.setYearf10(d40adults34[1]);
        d40.setYearm11(d40adults39[0]);
        d40.setYearf11(d40adults39[1]);
        d40.setYearm12(d40adults44[0]);
        d40.setYearf12(d40adults44[1]);
        d40.setYearm13(d40adults49[0]);
        d40.setYearf13(d40adults49[1]);
        d40.setYearm14(d40adults50[0]);
        d40.setYearf14(d40adults50[1]);
        d40.setTotal(totald40);

        ZimepmsReport d41 = new ZimepmsReport();
        d41.setData_name("D41 .PLHIV in care who transferred out whilst on Second line regimen. (Essential Changes register)");
        d41.setMonthm1(d41infant3[0]);
        d41.setMonthf1(d41infant3[1]);
        d41.setMonthm2(d41infant12[0]);
        d41.setMonthf2(d41infant12[1]);
        d41.setMonthm3(d41infant24[0]);
        d41.setMonthf3(d41infant24[1]);
        d41.setMonthm4(d41infant59[0]);
        d41.setMonthf4(d41infant59[1]);
        d41.setYearm5(d41adults9[0]);
        d41.setYearf5(d41adults9[1]);
        d41.setYearm6(d41adults14[0]);
        d41.setYearf6(d41adults14[1]);
        d41.setYearm7(d41adults19[0]);
        d41.setYearf7(d41adults19[1]);
        d41.setYearm8(d41adults24[0]);
        d41.setYearf8(d41adults24[1]);
        d41.setYearm9(d41adults29[0]);
        d41.setYearf9(d41adults29[1]);
        d41.setYearm10(d41adults34[0]);
        d41.setYearf10(d41adults34[1]);
        d41.setYearm11(d41adults39[0]);
        d41.setYearf11(d41adults39[1]);
        d41.setYearm12(d41adults44[0]);
        d41.setYearf12(d41adults44[1]);
        d41.setYearm13(d41adults49[0]);
        d41.setYearf13(d41adults49[1]);
        d41.setYearm14(d41adults50[0]);
        d41.setYearf14(d41adults50[1]);
        d41.setTotal(totald41);

        ZimepmsReport d42 = new ZimepmsReport();
        d42.setData_name("D42. PLHIV in care who transferred in whilst on Second line regimen. (Essential Changes register)");
        d42.setMonthm1(d42infant3[0]);
        d42.setMonthf1(d42infant3[1]);
        d42.setMonthm2(d42infant12[0]);
        d42.setMonthf2(d42infant12[1]);
        d42.setMonthm3(d42infant24[0]);
        d42.setMonthf3(d42infant24[1]);
        d42.setMonthm4(d42infant59[0]);
        d42.setMonthf4(d42infant59[1]);
        d42.setYearm5(d42adults9[0]);
        d42.setYearf5(d42adults9[1]);
        d42.setYearm6(d42adults14[0]);
        d42.setYearf6(d42adults14[1]);
        d42.setYearm7(d42adults19[0]);
        d42.setYearf7(d42adults19[1]);
        d42.setYearm8(d42adults24[0]);
        d42.setYearf8(d42adults24[1]);
        d42.setYearm9(d42adults29[0]);
        d42.setYearf9(d42adults29[1]);
        d42.setYearm10(d42adults34[0]);
        d42.setYearf10(d42adults34[1]);
        d42.setYearm11(d42adults39[0]);
        d42.setYearf11(d42adults39[1]);
        d42.setYearm12(d42adults44[0]);
        d42.setYearf12(d42adults44[1]);
        d42.setYearm13(d42adults49[0]);
        d42.setYearf13(d42adults49[1]);
        d42.setYearm14(d42adults50[0]);
        d42.setYearf14(d42adults50[1]);
        d42.setTotal(totald42);

        ZimepmsReport d43 = new ZimepmsReport();
        d43.setData_name("D43. PLHIV in care on Second Line regimen who developed adverse events. (Essential Changes register)");
        d43.setMonthm1(d43infant3[0]);
        d43.setMonthf1(d43infant3[1]);
        d43.setMonthm2(d43infant12[0]);
        d43.setMonthf2(d43infant12[1]);
        d43.setMonthm3(d43infant24[0]);
        d43.setMonthf3(d43infant24[1]);
        d43.setMonthm4(d43infant59[0]);
        d43.setMonthf4(d43infant59[1]);
        d43.setYearm5(d43adults9[0]);
        d43.setYearf5(d43adults9[1]);
        d43.setYearm6(d43adults14[0]);
        d43.setYearf6(d43adults14[1]);
        d43.setYearm7(d43adults19[0]);
        d43.setYearf7(d43adults19[1]);
        d43.setYearm8(d43adults24[0]);
        d43.setYearf8(d43adults24[1]);
        d43.setYearm9(d43adults29[0]);
        d43.setYearf9(d43adults29[1]);
        d43.setYearm10(d43adults34[0]);
        d43.setYearf10(d43adults34[1]);
        d43.setYearm11(d43adults39[0]);
        d43.setYearf11(d43adults39[1]);
        d43.setYearm12(d43adults44[0]);
        d43.setYearf12(d43adults44[1]);
        d43.setYearm13(d43adults49[0]);
        d43.setYearf13(d43adults49[1]);
        d43.setYearm14(d43adults50[0]);
        d43.setYearf14(d43adults50[1]);
        d43.setTotal(totald43);

        ZimepmsReport d44 = new ZimepmsReport();
        d44.setData_name("D44. PLHIV in care who (medically stopped) treatment whilst on Second line regimen (Essential Changes register)");
        d44.setMonthm1(d44infant3[0]);
        d44.setMonthf1(d44infant3[1]);
        d44.setMonthm2(d44infant12[0]);
        d44.setMonthf2(d44infant12[1]);
        d44.setMonthm3(d44infant24[0]);
        d44.setMonthf3(d44infant24[1]);
        d44.setMonthm4(d44infant59[0]);
        d44.setMonthf4(d44infant59[1]);
        d44.setYearm5(d44adults9[0]);
        d44.setYearf5(d44adults9[1]);
        d44.setYearm6(d44adults14[0]);
        d44.setYearf6(d44adults14[1]);
        d44.setYearm7(d44adults19[0]);
        d44.setYearf7(d44adults19[1]);
        d44.setYearm8(d44adults24[0]);
        d44.setYearf8(d44adults24[1]);
        d44.setYearm9(d44adults29[0]);
        d44.setYearf9(d44adults29[1]);
        d44.setYearm10(d44adults34[0]);
        d44.setYearf10(d44adults34[1]);
        d44.setYearm11(d44adults39[0]);
        d44.setYearf11(d44adults39[1]);
        d44.setYearm12(d44adults44[0]);
        d44.setYearf12(d44adults44[1]);
        d44.setYearm13(d44adults49[0]);
        d44.setYearf13(d44adults49[1]);
        d44.setYearm14(d44adults50[0]);
        d44.setYearf14(d44adults50[1]);
        d44.setTotal(totald44);

        ZimepmsReport d45 = new ZimepmsReport();
        d45.setData_name("D45. PLHIV in care on Second line substituting due to toxicity* (Essential Changes register)");
        d45.setMonthm1(d45infant3[0]);
        d45.setMonthf1(d45infant3[1]);
        d45.setMonthm2(d45infant12[0]);
        d45.setMonthf2(d45infant12[1]);
        d45.setMonthm3(d45infant24[0]);
        d45.setMonthf3(d45infant24[1]);
        d45.setMonthm4(d45infant59[0]);
        d45.setMonthf4(d45infant59[1]);
        d45.setYearm5(d45adults9[0]);
        d45.setYearf5(d45adults9[1]);
        d45.setYearm6(d45adults14[0]);
        d45.setYearf6(d45adults14[1]);
        d45.setYearm7(d45adults19[0]);
        d45.setYearf7(d45adults19[1]);
        d45.setYearm8(d45adults24[0]);
        d45.setYearf8(d45adults24[1]);
        d45.setYearm9(d45adults29[0]);
        d45.setYearf9(d45adults29[1]);
        d45.setYearm10(d45adults34[0]);
        d45.setYearf10(d45adults34[1]);
        d45.setYearm11(d45adults39[0]);
        d45.setYearf11(d45adults39[1]);
        d45.setYearm12(d45adults44[0]);
        d45.setYearf12(d45adults44[1]);
        d45.setYearm13(d45adults49[0]);
        d45.setYearf13(d45adults49[1]);
        d45.setYearm14(d45adults50[0]);
        d45.setYearf14(d45adults50[1]);
        d45.setTotal(totald45);

        ZimepmsReport d46 = new ZimepmsReport();
        d46.setData_name("D46. Total PLHIV in care currently receiving Second line ART (including those switched during the current Month). ART register");
        d46.setMonthm1(d46infant3[0]);
        d46.setMonthf1(d46infant3[1]);
        d46.setMonthm2(d46infant12[0]);
        d46.setMonthf2(d46infant12[1]);
        d46.setMonthm3(d46infant24[0]);
        d46.setMonthf3(d46infant24[1]);
        d46.setMonthm4(d46infant59[0]);
        d46.setMonthf4(d46infant59[1]);
        d46.setYearm5(d46adults9[0]);
        d46.setYearf5(d46adults9[1]);
        d46.setYearm6(d46adults14[0]);
        d46.setYearf6(d46adults14[1]);
        d46.setYearm7(d46adults19[0]);
        d46.setYearf7(d46adults19[1]);
        d46.setYearm8(d46adults24[0]);
        d46.setYearf8(d46adults24[1]);
        d46.setYearm9(d46adults29[0]);
        d46.setYearf9(d46adults29[1]);
        d46.setYearm10(d46adults34[0]);
        d46.setYearf10(d46adults34[1]);
        d46.setYearm11(d46adults39[0]);
        d46.setYearf11(d46adults39[1]);
        d46.setYearm12(d46adults44[0]);
        d46.setYearf12(d46adults44[1]);
        d46.setYearm13(d46adults49[0]);
        d46.setYearf13(d46adults49[1]);
        d46.setYearm14(d46adults50[0]);
        d46.setYearf14(d46adults50[1]);
        d46.setTotal(totald46);

        ZimepmsReport d47 = new ZimepmsReport();
        d47.setData_name("D47. PLHIV in care reinitiated on Third line ART after stopping treatment (ART Register)");

        ZimepmsReport d48 = new ZimepmsReport();
        d48.setData_name("D48. PLHIV in care reinitiated on Third line ART after Lost To Follow Up (28 days) this Month (ART Register)");
        d48.setMonthm1(d48infant3[0]);
        d48.setMonthf1(d48infant3[1]);
        d48.setMonthm2(d48infant12[0]);
        d48.setMonthf2(d48infant12[1]);
        d48.setMonthm3(d48infant24[0]);
        d48.setMonthf3(d48infant24[1]);
        d48.setMonthm4(d48infant59[0]);
        d48.setMonthf4(d48infant59[1]);
        d48.setYearm5(d48adults9[0]);
        d48.setYearf5(d48adults9[1]);
        d48.setYearm6(d48adults14[0]);
        d48.setYearf6(d48adults14[1]);
        d48.setYearm7(d48adults19[0]);
        d48.setYearf7(d48adults19[1]);
        d48.setYearm8(d48adults24[0]);
        d48.setYearf8(d48adults24[1]);
        d48.setYearm9(d48adults29[0]);
        d48.setYearf9(d48adults29[1]);
        d48.setYearm10(d48adults34[0]);
        d48.setYearf10(d48adults34[1]);
        d48.setYearm11(d48adults39[0]);
        d48.setYearf11(d48adults39[1]);
        d48.setYearm12(d48adults44[0]);
        d48.setYearf12(d48adults44[1]);
        d48.setYearm13(d48adults49[0]);
        d48.setYearf13(d48adults49[1]);
        d48.setYearm14(d48adults50[0]);
        d48.setYearf14(d48adults50[1]);
        d48.setTotal(totald48);

        ZimepmsReport d49 = new ZimepmsReport();
        d49.setData_name("D49. PLHIV in care who died whilst on Third line ART regimen (Essential Changes Register)");
        d49.setMonthm1(d49infant3[0]);
        d49.setMonthf1(d49infant3[1]);
        d49.setMonthm2(d49infant12[0]);
        d49.setMonthf2(d49infant12[1]);
        d49.setMonthm3(d49infant24[0]);
        d49.setMonthf3(d49infant24[1]);
        d49.setMonthm4(d49infant59[0]);
        d49.setMonthf4(d49infant59[1]);
        d49.setYearm5(d49adults9[0]);
        d49.setYearf5(d49adults9[1]);
        d49.setYearm6(d49adults14[0]);
        d49.setYearf6(d49adults14[1]);
        d49.setYearm7(d49adults19[0]);
        d49.setYearf7(d49adults19[1]);
        d49.setYearm8(d49adults24[0]);
        d49.setYearf8(d49adults24[1]);
        d49.setYearm9(d49adults29[0]);
        d49.setYearf9(d49adults29[1]);
        d49.setYearm10(d49adults34[0]);
        d49.setYearf10(d49adults34[1]);
        d49.setYearm11(d49adults39[0]);
        d49.setYearf11(d49adults39[1]);
        d49.setYearm12(d49adults44[0]);
        d49.setYearf12(d49adults44[1]);
        d49.setYearm13(d49adults49[0]);
        d49.setYearf13(d49adults49[1]);
        d49.setYearm14(d49adults50[0]);
        d49.setYearf14(d49adults50[1]);
        d49.setTotal(totald49);

        ZimepmsReport d50 = new ZimepmsReport();
        d50.setData_name("D50. PLHIV lost to follow up whilst on Third line regimen.(Essential Changes Register)");
        d50.setMonthm1(d50infant3[0]);
        d50.setMonthf1(d50infant3[1]);
        d50.setMonthm2(d50infant12[0]);
        d50.setMonthf2(d50infant12[1]);
        d50.setMonthm3(d50infant24[0]);
        d50.setMonthf3(d50infant24[1]);
        d50.setMonthm4(d50infant59[0]);
        d50.setMonthf4(d50infant59[1]);
        d50.setYearm5(d50adults9[0]);
        d50.setYearf5(d50adults9[1]);
        d50.setYearm6(d50adults14[0]);
        d50.setYearf6(d50adults14[1]);
        d50.setYearm7(d50adults19[0]);
        d50.setYearf7(d50adults19[1]);
        d50.setYearm8(d50adults24[0]);
        d50.setYearf8(d50adults24[1]);
        d50.setYearm9(d50adults29[0]);
        d50.setYearf9(d50adults29[1]);
        d50.setYearm10(d50adults34[0]);
        d50.setYearf10(d50adults34[1]);
        d50.setYearm11(d50adults39[0]);
        d50.setYearf11(d50adults39[1]);
        d50.setYearm12(d50adults44[0]);
        d50.setYearf12(d50adults44[1]);
        d50.setYearm13(d50adults49[0]);
        d50.setYearf13(d50adults49[1]);
        d50.setYearm14(d50adults50[0]);
        d50.setYearf14(d50adults50[1]);
        d50.setTotal(totald50);

        ZimepmsReport d51 = new ZimepmsReport();
        d51.setData_name("D51. PLHIV in care transferred out whilst on Third line regimen. (Essential Changes register)");
        d51.setMonthm1(d51infant3[0]);
        d51.setMonthf1(d51infant3[1]);
        d51.setMonthm2(d51infant12[0]);
        d51.setMonthf2(d51infant12[1]);
        d51.setMonthm3(d51infant24[0]);
        d51.setMonthf3(d51infant24[1]);
        d51.setMonthm4(d51infant59[0]);
        d51.setMonthf4(d51infant59[1]);
        d51.setYearm5(d51adults9[0]);
        d51.setYearf5(d51adults9[1]);
        d51.setYearm6(d51adults14[0]);
        d51.setYearf6(d51adults14[1]);
        d51.setYearm7(d51adults19[0]);
        d51.setYearf7(d51adults19[1]);
        d51.setYearm8(d51adults24[0]);
        d51.setYearf8(d51adults24[1]);
        d51.setYearm9(d51adults29[0]);
        d51.setYearf9(d51adults29[1]);
        d51.setYearm10(d51adults34[0]);
        d51.setYearf10(d51adults34[1]);
        d51.setYearm11(d51adults39[0]);
        d51.setYearf11(d51adults39[1]);
        d51.setYearm12(d51adults44[0]);
        d51.setYearf12(d51adults44[1]);
        d51.setYearm13(d51adults49[0]);
        d51.setYearf13(d51adults49[1]);
        d51.setYearm14(d51adults50[0]);
        d51.setYearf14(d51adults50[1]);
        d51.setTotal(totald51);

        ZimepmsReport d52 = new ZimepmsReport();
        d52.setData_name("D52. PLHIV in care transferred in on Third line regimen. (Essential Changes Register)");
        d52.setMonthm1(d52infant3[0]);
        d52.setMonthf1(d52infant3[1]);
        d52.setMonthm2(d52infant12[0]);
        d52.setMonthf2(d52infant12[1]);
        d52.setMonthm3(d52infant24[0]);
        d52.setMonthf3(d52infant24[1]);
        d52.setMonthm4(d52infant59[0]);
        d52.setMonthf4(d52infant59[1]);
        d52.setYearm5(d52adults9[0]);
        d52.setYearf5(d52adults9[1]);
        d52.setYearm6(d52adults14[0]);
        d52.setYearf6(d52adults14[1]);
        d52.setYearm7(d52adults19[0]);
        d52.setYearf7(d52adults19[1]);
        d52.setYearm8(d52adults24[0]);
        d52.setYearf8(d52adults24[1]);
        d52.setYearm9(d52adults29[0]);
        d52.setYearf9(d52adults29[1]);
        d52.setYearm10(d52adults34[0]);
        d52.setYearf10(d52adults34[1]);
        d52.setYearm11(d52adults39[0]);
        d52.setYearf11(d52adults39[1]);
        d52.setYearm12(d52adults44[0]);
        d52.setYearf12(d52adults44[1]);
        d52.setYearm13(d52adults49[0]);
        d52.setYearf13(d52adults49[1]);
        d52.setYearm14(d52adults50[0]);
        d52.setYearf14(d52adults50[1]);
        d52.setTotal(totald52);

        ZimepmsReport d53 = new ZimepmsReport();
        d53.setData_name("D53. PLHIV in care on Third Line regimen who developed adverse events. (Essential Changes register)");
        d53.setMonthm1(d53infant3[0]);
        d53.setMonthf1(d53infant3[1]);
        d53.setMonthm2(d53infant12[0]);
        d53.setMonthf2(d53infant12[1]);
        d53.setMonthm3(d53infant24[0]);
        d53.setMonthf3(d53infant24[1]);
        d53.setMonthm4(d53infant59[0]);
        d53.setMonthf4(d53infant59[1]);
        d53.setYearm5(d53adults9[0]);
        d53.setYearf5(d53adults9[1]);
        d53.setYearm6(d53adults14[0]);
        d53.setYearf6(d53adults14[1]);
        d53.setYearm7(d53adults19[0]);
        d53.setYearf7(d53adults19[1]);
        d53.setYearm8(d53adults24[0]);
        d53.setYearf8(d53adults24[1]);
        d53.setYearm9(d53adults29[0]);
        d53.setYearf9(d53adults29[1]);
        d53.setYearm10(d53adults34[0]);
        d53.setYearf10(d53adults34[1]);
        d53.setYearm11(d53adults39[0]);
        d53.setYearf11(d53adults39[1]);
        d53.setYearm12(d53adults44[0]);
        d53.setYearf12(d53adults44[1]);
        d53.setYearm13(d53adults49[0]);
        d53.setYearf13(d53adults49[1]);
        d53.setYearm14(d53adults50[0]);
        d53.setYearf14(d53adults50[1]);
        d53.setTotal(totald53);

        ZimepmsReport d54 = new ZimepmsReport();
        d54.setData_name("D54. PLHIV in care who Medically stopped treatment whilst on Third line regimen (Essential Changes register)");
        d54.setMonthm1(d54infant3[0]);
        d54.setMonthf1(d54infant3[1]);
        d54.setMonthm2(d54infant12[0]);
        d54.setMonthf2(d54infant12[1]);
        d54.setMonthm3(d54infant24[0]);
        d54.setMonthf3(d54infant24[1]);
        d54.setMonthm4(d54infant59[0]);
        d54.setMonthf4(d54infant59[1]);
        d54.setYearm5(d54adults9[0]);
        d54.setYearf5(d54adults9[1]);
        d54.setYearm6(d54adults14[0]);
        d54.setYearf6(d54adults14[1]);
        d54.setYearm7(d54adults19[0]);
        d54.setYearf7(d54adults19[1]);
        d54.setYearm8(d54adults24[0]);
        d54.setYearf8(d54adults24[1]);
        d54.setYearm9(d54adults29[0]);
        d54.setYearf9(d54adults29[1]);
        d54.setYearm10(d54adults34[0]);
        d54.setYearf10(d54adults34[1]);
        d54.setYearm11(d54adults39[0]);
        d54.setYearf11(d54adults39[1]);
        d54.setYearm12(d54adults44[0]);
        d54.setYearf12(d54adults44[1]);
        d54.setYearm13(d54adults49[0]);
        d54.setYearf13(d54adults49[1]);
        d54.setYearm14(d54adults50[0]);
        d54.setYearf14(d54adults50[1]);
        d54.setTotal(totald54);

        ZimepmsReport d55 = new ZimepmsReport();
        d55.setData_name("D55. PLHIV in care on Third line substituting due to toxicity\" (Essential Changes register)");
        d55.setMonthm1(d55infant3[0]);
        d55.setMonthf1(d55infant3[1]);
        d55.setMonthm2(d55infant12[0]);
        d55.setMonthf2(d55infant12[1]);
        d55.setMonthm3(d55infant24[0]);
        d55.setMonthf3(d55infant24[1]);
        d55.setMonthm4(d55infant59[0]);
        d55.setMonthf4(d55infant59[1]);
        d55.setYearm5(d55adults9[0]);
        d55.setYearf5(d55adults9[1]);
        d55.setYearm6(d55adults14[0]);
        d55.setYearf6(d55adults14[1]);
        d55.setYearm7(d55adults19[0]);
        d55.setYearf7(d55adults19[1]);
        d55.setYearm8(d55adults24[0]);
        d55.setYearf8(d55adults24[1]);
        d55.setYearm9(d55adults29[0]);
        d55.setYearf9(d55adults29[1]);
        d55.setYearm10(d55adults34[0]);
        d55.setYearf10(d55adults34[1]);
        d55.setYearm11(d55adults39[0]);
        d55.setYearf11(d55adults39[1]);
        d55.setYearm12(d55adults44[0]);
        d55.setYearf12(d55adults44[1]);
        d55.setYearm13(d55adults49[0]);
        d55.setYearf13(d55adults49[1]);
        d55.setYearm14(d55adults50[0]);
        d55.setYearf14(d55adults50[1]);
        d55.setTotal(totald55);

        ZimepmsReport d56 = new ZimepmsReport();
        d56.setData_name("D56. Total PLHIV in care currently receiving Third line ART (including those who had switched during the current Month). (ART Register)");
        d56.setMonthm1(d56infant3[0]);
        d56.setMonthf1(d56infant3[1]);
        d56.setMonthm2(d56infant12[0]);
        d56.setMonthf2(d56infant12[1]);
        d56.setMonthm3(d56infant24[0]);
        d56.setMonthf3(d56infant24[1]);
        d56.setMonthm4(d56infant59[0]);
        d56.setMonthf4(d56infant59[1]);
        d56.setYearm5(d56adults9[0]);
        d56.setYearf5(d56adults9[1]);
        d56.setYearm6(d56adults14[0]);
        d56.setYearf6(d56adults14[1]);
        d56.setYearm7(d56adults19[0]);
        d56.setYearf7(d56adults19[1]);
        d56.setYearm8(d56adults24[0]);
        d56.setYearf8(d56adults24[1]);
        d56.setYearm9(d56adults29[0]);
        d56.setYearf9(d56adults29[1]);
        d56.setYearm10(d56adults34[0]);
        d56.setYearf10(d56adults34[1]);
        d56.setYearm11(d56adults39[0]);
        d56.setYearf11(d56adults39[1]);
        d56.setYearm12(d56adults44[0]);
        d56.setYearf12(d56adults44[1]);
        d56.setYearm13(d56adults49[0]);
        d56.setYearf13(d56adults49[1]);
        d56.setYearm14(d56adults50[0]);
        d56.setYearf14(d56adults50[1]);
        d56.setTotal(totald56);

        ZimepmsReport d57 = new ZimepmsReport();
        d57.setData_name("D57. Total PLHIV in care currently receiving ART*(add D36+D46+D56)");
        d57.setMonthm1(d57infant3m);
        d57.setMonthf1(d57infant3f);
        d57.setMonthm2(d57infant12m);
        d57.setMonthf2(d57infant12f);
        d57.setMonthm3(d57infant24m);
        d57.setMonthf3(d57infant24f);
        d57.setMonthm4(d57infant59m);
        d57.setMonthf4(d57infant59f);
        d57.setYearm5(d57adults9m);
        d57.setYearf5(d57adults9f);
        d57.setYearm6(d57adults14m);
        d57.setYearf6(d57adults14f);
        d57.setYearm7(d57adults19m);
        d57.setYearf7(d57adults19f);
        d57.setYearm8(d57adults24m);
        d57.setYearf8(d57adults24f);
        d57.setYearm9(d57adults29m);
        d57.setYearf9(d57adults29f);
        d57.setYearm10(d57adults34m);
        d57.setYearf10(d57adults34f);
        d57.setYearm11(d57adults39m);
        d57.setYearf11(d57adults39f);
        d57.setYearm12(d57adults44m);
        d57.setYearf12(d57adults44f);
        d57.setYearm13(d57adults49m);
        d57.setYearf13(d57adults49f);
        d57.setYearm14(d57adults50m);
        d57.setYearf14(d57adults50f);
        d57.setTotal(totald57);

        listData.add(d1);
        listData.add(d2);
        listData.add(d3);
        listData.add(d4);
        listData.add(d5);
        listData.add(d6);
        listData.add(d7);
        listData.add(d8);
        listData.add(d9);
        listData.add(d10);
        listData.add(d11);
        listData.add(d12);
        listData.add(d13);
        listData.add(d14);
        listData.add(d15);
        listData.add(d16);
        listData.add(d17);
        listData.add(d18);
        listData.add(d19);
        listData.add(d20);
        listData.add(d21);
        listData.add(d22);
        listData.add(d23);
        listData.add(d24);
        listData.add(d25);
        listData.add(d26);
        listData.add(d27);
        listData.add(d28);
        listData.add(d29);
        listData.add(d30);
        listData.add(d31);
        listData.add(d32);
        listData.add(d33);
        listData.add(d34);
        listData.add(d35);
        listData.add(d36);
        listData.add(d37);
        listData.add(d38);
        listData.add(d39);
        listData.add(d40);
        listData.add(d41);
        listData.add(d42);
        listData.add(d43);
        listData.add(d44);
        listData.add(d45);
        listData.add(d46);
        listData.add(d47);
        listData.add(d48);
        listData.add(d49);
        listData.add(d50);
        listData.add(d51);
        listData.add(d52);
        listData.add(d53);
        listData.add(d54);
        listData.add(d55);
        listData.add(d56);
        listData.add(d57);

        return listData;

    }

    public String getReportTitle() {
        String title = "Section D OPPORTUNISTIC INFECTIONS AND ANTIRETROVIAL THERAPY";

        return title;

    }

    public String getPeriod() {
        String period = "December 2022";

        return period;
    }

}
