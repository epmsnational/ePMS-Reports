/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.ArtSummary;
import com.vmmc.entities.ArtSummaryAdverseEvents;
import com.vmmc.entities.CaseBaseNotification;
import com.vmmc.entities.HivTbCollaboration;
import com.vmmc.entities.LaboratoryServicesArvSwitch;
import com.vmmc.entities.LaboratoryServicesCdFourCount;
import com.vmmc.entities.LaboratoryServicesTests;
import com.vmmc.entities.OpportunityInfectionAndArtTherapy;
import com.vmmc.entities.OpportunityInfectionAndArtTherapyCryptoccocalStatus;
import com.vmmc.entities.PatientsTransferIn;
import com.vmmc.entities.PatientsTransferInVisit;
import com.vmmc.jasper.Report;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author karma
 */
public class HtsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        EpmsReportsSectionD epms = new EpmsReportsSectionD();
        EpmsReportsSectionC epm = new EpmsReportsSectionC();
        EpmsReportsCbs cbs = new EpmsReportsCbs();
        
//        epm.thetaJoin();
   
//                List<HivTbCollaboration> data = epm.getHivTbCollaborationTptStatus();
//        for (HivTbCollaboration report : data) {
//            System.out.print("PatientID: " + report.getPatientID());
//            System.out.print("  Sex: " + report.getSex());
//                System.out.print("  Visit Date: " + report.getVisitDate());
//            System.out.print(", DateOfBirth: " + report.getDateOfBirth()+"");
//            System.out.print(", Status: " + report.getStatus() + " ");
//            System.out.print(", IPT Status: " + report.getIPTReasonCode());
//            System.out.print(", TB Investigation: " + report.getTBInvestigationResults());
//            System.out.print("  TB Status: " + report.getTBStatusCode());
//            System.out.print(", Status: " + report.getStatus());
//            System.out.print(", IPT Eligibity: " + report.getIsIPTEligibility() + " ");
//        }
//        List<OpportunityInfectionAndArtTherapy> list = epms.getTreatmentAndProphylaxisNewly();
//        for (OpportunityInfectionAndArtTherapy report : list) {
//            System.out.print("PatientID: " + report.getPatientID());
//            System.out.print(", Dirt Of Birth: " + report.getDateOfBirth());
//            System.out.print(", Sex: " + report.getSex());
//            System.out.print(", Visit Date: " + report.getVisitDate());
//            System.out.print(", Who Stage: " + report.getWHOStage());
//            System.out.print(", Status: " + report.getStatus());
//            System.out.print(", Drug Type ID: " + report.getDrugTypeID());
//            System.out.print(", Arv Description: " + report.getARVStatusDescription()+" ");
//        }
//        epms.getArtSummaryTransferIn();
//        EpmsReportsSectionC rep = new EpmsReportsSectionC();
//
//        List<PatientsTransferIn> data = epms.getPatientsTransferIn();
//        for(PatientsTransferIn art : data){
//            System.out.print("PatientID: " + art.getPatientID());
//            System.out.print(", Dirt Of Birth: " + art.getDateOfBirth());
//            System.out.print(", Sex: " + art.getSex());
//            System.out.print(", The Time Stamp: " + art.getTheTimeStamp());
//            System.out.print(", Reffered From: " + art.getReferredFromID());
//            System.out.print(", Reffered From Notes: " + art.getReferredFromNotes());
//            System.out.print(", Transfer In ID: " + art.getTransferInId()+" ");
//        }
        
//        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list = epms.getOpportunityInfectionAndArtTherapyCryptoccocalStatus();
//        for (OpportunityInfectionAndArtTherapyCryptoccocalStatus report : list) {
//            System.out.print("PatientID: " + report.getPatientID());
//            System.out.print(", Dirt Of Birth: " + report.getDateOfBirth());
//            System.out.print(", Sex: " + report.getSex());
//            System.out.print(", Visit Date: " + report.getVisitDate());
//            System.out.print(", Problem Acronym: " + report.getProblemAcronym());
//            System.out.print(", Status: " + report.getStatus());
//            System.out.print(", Drug Type ID: " + report.getDrugTypeID());
//            System.out.print(", Adverse Event: " + report.getAdverseEventsStatusCode()+" ");
//        }
//        List<LaboratoryServicesTests> list = epms.getLaboratoryServicesTests();
//        for (LaboratoryServicesTests report : list) {
//            System.out.print("PatientID: " + report.getPatientID());
//            System.out.print(", Dirt Of Birth: " + report.getDateOfBirth());
//            System.out.print(", Sex: " + report.getSex());
//            System.out.print(", Test Date: " + report.getTestDate());
//            System.out.print(", Received date: " + report.getRecievedDate());
//            System.out.print(", Result date: " + report.getResultDate());
//            System.out.print(", Test Type ID: " + report.getTestTypeID());
//            System.out.print(", Result: " + report.getResultNumeric()+" ");
//        }
//        List<LaboratoryServicesArvSwitch> list = epms.getLaboratoryServicesArvSwitch();
//        for (LaboratoryServicesArvSwitch report : list) {
//            System.out.print("PatientID: " + report.getPatientID());
//            System.out.print(", Date Of Birth: " + report.getDateOfBirth());
//            System.out.print(", Sex: " + report.getSex());
//            System.out.print(", Regimen Type: " + report.getRegimenType());
//            System.out.print(", Arv Status Code: " + report.getARVStatusCode());
//            System.out.print(", Visit date: " + report.getVisitDate());
//            System.out.print(", Status: " + report.getStatus()+" ");
//        }
        
                List<ArtSummaryAdverseEvents> list = epms.getArtSummaryAdverseEvents();
        for (ArtSummaryAdverseEvents report : list) {
            System.out.print("PatientID: " + report.getPatientID());
            System.out.print(", Dirt Of Birth: " + report.getDateOfBirth());
            System.out.print(", Sex: " + report.getSex());
            System.out.print(", Adverse Event: " + report.getAdverseEventsStatusCode());
            System.out.print(", Visit Date: " + report.getVisitDate());
            System.out.print(", Regimen Type: " + report.getRegimenType());
            System.out.print(", ARV Code: " + report.getARVStatusCode());
            System.out.print(", Status: " + report.getStatus()+" ");
        }
        
    }
    
   
}
