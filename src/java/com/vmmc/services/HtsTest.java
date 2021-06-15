/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.ArtSummary;
import com.vmmc.entities.CaseBaseNotification;
import com.vmmc.entities.HivTbCollaboration;
import com.vmmc.entities.OpportunityInfectionAndArtTherapy;
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
        
        List<CaseBaseNotification> data = cbs.getCaseBaseNotification();
        
        for(CaseBaseNotification c : data){
            System.out.println("OPD Number : "+c.getOPDNumber());
            System.out.println("HTS Number : "+c.getHTCNumber());
            System.out.println("Sex : "+c.getSex());
            System.out.println("Date of Birth : "+c.getDateOfBirth());
            System.out.println("Recency Test : "+c.getRecencyTesting());
            System.out.println("Recency Test Name : "+c.getRecencyTesterName());
            System.out.println("Recency Test Result : "+c.getRecencyTestingResult());
            System.out.println("Recency Test Date : "+c.getRecencyTestingDate());
            System.out.println("Recency Test Not Done : "+c.getRecencyTestingNotDone());
            System.out.println("WHO Stage : "+c.getWhoStageAtNotification());
            
            
        }
        
        //epm.getData();
        
//        epms.getPatientsTransferIn();
//        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
//        Date reportDate = sdformat.parse("2018-01-01");
//        List<HivTbCollaboration> data = FilteredData(epm.getHivTbCollaboration(),reportDate);   
//                List<HivTbCollaboration> data = epm.getHivTbCollaborationLastVisit();
////        //Local
//        for (HivTbCollaboration report : data) {
//            System.out.print("PatientID: " + report.getPatientID());
//            System.out.print("  Sex: " + report.getSex());
//                System.out.print("  Visit Date: " + report.getVisitDate());
//            System.out.print(", DateOfBirth: " + report.getDateOfBirth()+"");
//            Timestamp ts = Timestamp.from(report.getVisitDate().toInstant());
//            Instant in = ts.toInstant();
//            
//            LocalDate dt = ts.toLocalDateTime().toLocalDate();
//            System.out.print(", Visit Date: " + dt + " ");
////            System.out.print(", IPT Status: " + report.getIPTReasonCode());
////            System.out.print(", TB Investigation: " + report.getTBInvestigationResults());
////            System.out.print("  TB Status: " + report.getTBStatusCode());
////            System.out.print(", Status: " + report.getStatus());
//            //System.out.print(", IPT Eligibity: " + report.getIsIPTEligibility() + " ");
//        }
//        List<OpportunityInfectionAndArtTherapy> list = epms.getTreatmentAndProphylaxisNewly();
//        for (OpportunityInfectionAndArtTherapy report : list) {
//            System.out.print(report.getARVStatusDescription() +"");
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
    }

   
}
