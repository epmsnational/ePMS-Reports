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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ignatious
 */
public class DataCleaner {

    public List<ArtSummary> ArtSummary(List<ArtSummary> list, Date reportDate) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<OpportunityInfectionAndArtTherapy> OpportunityInfectionAndArtTherapy(List<OpportunityInfectionAndArtTherapy> list, Date reportDate) {
        List<OpportunityInfectionAndArtTherapy> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> OpportunityInfectionAndArtTherapyCryptoccocalStatus(List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list, Date reportDate) {
        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<LaboratoryServicesTests> LaboratoryServicesViralLoad(List<LaboratoryServicesTests> list, Date reportDate) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getResultDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getResultDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<LaboratoryServicesArvSwitch> LaboratoryServicesArvSwitch(List<LaboratoryServicesArvSwitch> list, Date reportDate) {
        List<LaboratoryServicesArvSwitch> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<LaboratoryServicesCdFourCount> LaboratoryServicesCdFourCount(List<LaboratoryServicesCdFourCount> list, Date reportDate) {
        List<LaboratoryServicesCdFourCount> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<ArtSummaryAdverseEvents> ArtSummaryAdverseEvents(List<ArtSummaryAdverseEvents> list, Date reportDate) {
        List<ArtSummaryAdverseEvents> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<HivTbCollaboration> HivTbCollaboration(List<HivTbCollaboration> list, Date reportDate) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<PatientsTransferIn> PatientsTransferIn(List<PatientsTransferIn> list, Date reportDate) {
        List<PatientsTransferIn> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date timestamp = test.getTheTimeStamp();
                    if (timestamp.compareTo(reportDate) < 0) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<LaboratoryServicesTests> LaboratoryServicesTests(List<LaboratoryServicesTests> list, Date reportDate) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date testDate = test.getTestDate();

                    if (testDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<PatientsTransferInVisit> PatientsTransferInVisit(List<PatientsTransferInVisit> list, Date reportDate) {
        List<PatientsTransferInVisit> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getVisitDate() != null)
                .filter(test -> test.getDateOfBirth() != null)
                .filter(test -> test.getSex() != null)
                .forEach(test -> {
                    Date visitDate = test.getVisitDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<EnhancedAdherenceCounselling> EnhancedAdherenceCounsellingFirst(List<EnhancedAdherenceCounselling> list, Date reportDate) {
        List<EnhancedAdherenceCounselling> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getFirstSessionDate() != null)
                .forEach(test -> {
                    Date visitDate = test.getFirstSessionDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<EnhancedAdherenceCounselling> EnhancedAdherenceCounsellingSecond(List<EnhancedAdherenceCounselling> list, Date reportDate) {
        List<EnhancedAdherenceCounselling> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getSecondSessionDate() != null)
                .forEach(test -> {
                    Date visitDate = test.getSecondSessionDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<EnhancedAdherenceCounselling> EnhancedAdherenceCounselling(List<EnhancedAdherenceCounselling> list, Date reportDate) {
        List<EnhancedAdherenceCounselling> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestDate() != null)
                .forEach(test -> {
                    Date visitDate = test.getTestDate();

                    if (visitDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }

                });
        return data;
    }

    public List<CaseBaseNotification> CaseBaseNotification(List<CaseBaseNotification> list, Date reportDate) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDateFormCompleted() != null)
                .forEach(test -> {
                    Date completeDate = test.getDateFormCompleted();

                    if (completeDate.compareTo(reportDate) < 0) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC1(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTBStatusCode() != null)
                .forEach(test -> {
                    String tbStatus = test.getTBStatusCode();
                    if (tbStatus.equalsIgnoreCase("S") || tbStatus.equalsIgnoreCase("Y")) {
                        data.add(test);
                    }
                });

        return data;

    }

    public List<HivTbCollaboration> getC2(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTBStatusCode() != null)
                .forEach(test -> {
                    String tbStatus = test.getTBStatusCode();
                    if (tbStatus.equalsIgnoreCase("S")) {
                        data.add(test);
                    }
                });

        return data;

    }

    public List<HivTbCollaboration> getC3(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTBStatusCode() != null)
                .forEach(test -> {
                    String tbStatus = test.getTBStatusCode();
                    int tbInvestigation = test.getTBInvestigationResults();
                    if (tbStatus.equalsIgnoreCase("S") & (tbInvestigation == 1 || tbInvestigation == 2 || tbInvestigation == 5)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC4(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    int tbInvestigation = test.getTBInvestigationResults();
                    if (tbInvestigation == 1) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC5(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    int arv = test.getARVStatusCode();
                    int tbInvestigation = test.getTBInvestigationResults();
                    if (tbInvestigation == 1 & (arv == 0 || arv == 1)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC6(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    int tbInvestigation = test.getTBInvestigationResults();
                    if (tbInvestigation == 5) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC7(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTBStatusCode() != null)
                .filter(test -> test.getIsIPTEligibility() != null)
                .filter(test -> test.getIPTStatusCode() != null)
                .forEach(test -> {
                    String tbStatus = test.getTBStatusCode();
                    String eligib = test.getIsIPTEligibility();
                    String tptstatus = test.getIPTStatusCode();
                    if ((tbStatus.equalsIgnoreCase("S") || tbStatus.equalsIgnoreCase("Y")) & (eligib.equalsIgnoreCase("yes") || !tptstatus.equalsIgnoreCase("NE"))) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC8(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    int arv = test.getARVStatusCode();
                    int tbInvestigation = test.getTBInvestigationResults();
                    if (arv == 2 & tbInvestigation == 5) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC9(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIPTStatusCode() != null)
                .forEach(test -> {
                    String tptstatus = test.getIPTStatusCode();
                    if (tptstatus.equalsIgnoreCase("II")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC10(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIPTReasonCode() != null)
                .filter(test -> test.getIPTStatusCode() != null)
                .forEach(test -> {
                    String tptreason = test.getIPTReasonCode();
                    String tptstatus = test.getIPTStatusCode();
                    if (tptreason.equalsIgnoreCase("9") & ((tptstatus.equalsIgnoreCase("CI"))
                    || (tptstatus.equalsIgnoreCase("HPI")) || (tptstatus.equalsIgnoreCase("IC"))
                    || (tptstatus.equalsIgnoreCase("II")) || (tptstatus.equalsIgnoreCase("RI")))) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC11(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIPTReasonCode() != null)
                .filter(test -> test.getIPTStatusCode() != null)
                .forEach(test -> {
                    String tptreason = test.getIPTReasonCode();
                    String tptstatus = test.getIPTStatusCode();
                    if (tptreason.equalsIgnoreCase("9") & (tptstatus.equalsIgnoreCase("IS"))) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC12(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIPTReasonCode() != null)
                .forEach(test -> {
                    String tptreason = test.getIPTReasonCode();
                    if (tptreason.equalsIgnoreCase("1")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<HivTbCollaboration> getC13(List<HivTbCollaboration> list) {
        List<HivTbCollaboration> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getIPTReasonCode() != null)
                .forEach(test -> {
                    String tptreason = test.getIPTReasonCode();
                    if (tptreason.equalsIgnoreCase("8")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD1(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    data.add(test);
                });
        return data;
    }

    public List<ArtSummary> getD2(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    int whoStage = test.getWHOStage();
                    if (whoStage == 1 || whoStage == 2) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<ArtSummary> getD3(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .forEach(test -> {
                    int whoStage = test.getWHOStage();
                    if (whoStage == 3 || whoStage == 4) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<OpportunityInfectionAndArtTherapy> getD4(List<OpportunityInfectionAndArtTherapy> list) {
        List<OpportunityInfectionAndArtTherapy> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getARVStatusDescription() != null)
                .filter(test -> test.getDrugTypeID() != null)
                .forEach(test -> {
                    String drugtype = test.getDrugTypeID();
                    if (drugtype.equalsIgnoreCase("COT")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<ArtSummaryAdverseEvents> getD5(List<ArtSummaryAdverseEvents> list) {
        List<ArtSummaryAdverseEvents> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    int arvStatusCode = test.getARVStatusCode();
                    String adverseEvent = test.getAdverseEventsStatusCode();
                    if (arvStatusCode == 1 & !adverseEvent.equals("")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<ArtSummary> getD6(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String status = test.getStatus();
                    int arvstatus = test.getARVStatusCode();
                    if (status.equalsIgnoreCase("Transferred to another clinic") & arvstatus == 1) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<PatientsTransferIn> getD7(List<PatientsTransferIn> list) {
        List<PatientsTransferIn> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getReferredFromID() != null)
                .filter(test -> test.getTransferInId() != null)
                .forEach(test -> {
                    String transferInID = test.getTransferInId();
                    if (transferInID.equalsIgnoreCase("CR")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD8(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String status = test.getStatus();
                    int arvstatus = test.getARVStatusCode();
                    if (status.equalsIgnoreCase("Attending this clinic") & arvstatus == 1) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> getD9(List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list) {
        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> data = new ArrayList<>();

        return data;
    }

    public List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> getD10(List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list) {
        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getProblemAcronym() != null)
                .forEach(test -> {
                    String crypto = test.getProblemAcronym();
                    if (crypto.contains("CMN")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> getD11(List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list) {
        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDrugTypeID() != null)
                .forEach(test -> {
                    String drug = test.getDrugTypeID();
                    if (drug.equalsIgnoreCase("FLU")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> getD13(List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> list) {
        List<OpportunityInfectionAndArtTherapyCryptoccocalStatus> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDrugTypeID() != null)
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String drug = test.getDrugTypeID();
                    String adverse = test.getAdverseEventsStatusCode();
                    if (drug.equalsIgnoreCase("CMN") & !adverse.equalsIgnoreCase("")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<LaboratoryServicesTests> getD14(List<LaboratoryServicesTests> list) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestDate() != null)
                .forEach(test -> {
                    data.add(test);
                });
        return data;
    }

    public List<LaboratoryServicesTests> getD15(List<LaboratoryServicesTests> list) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getResultDate() != null)
                .forEach(test -> {
                    data.add(test);
                });
        return data;
    }

    public List<LaboratoryServicesTests> getD16(List<LaboratoryServicesTests> list) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getResultDate() != null)
                .filter(test -> test.getTestTypeID() != null)
                .forEach(test -> {
                    String testType = test.getTestTypeID();
                    float results = test.getResultNumeric();
                    if (testType.equalsIgnoreCase("VRL") & results > 1000) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<EnhancedAdherenceCounselling> getD17(List<EnhancedAdherenceCounselling> list) {
        List<EnhancedAdherenceCounselling> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getFirstSession() != null)
                .filter(test -> test.getFirstSessionDate() != null)
                .forEach(test -> {
                    data.add(test);
                });
        return data;
    }

    public List<EnhancedAdherenceCounselling> getD18(List<EnhancedAdherenceCounselling> list) {
        List<EnhancedAdherenceCounselling> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getSecondSession() != null)
                .filter(test -> test.getSecondSessionDate() != null)
                .forEach(test -> {
                    data.add(test);
                });
        return data;
    }

    public List<EnhancedAdherenceCounselling> getD19(List<EnhancedAdherenceCounselling> list) {
        List<EnhancedAdherenceCounselling> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestDate() != null)
                .forEach(test -> {
                    float result = test.getResultNumeric();
                    if (result > 1000) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<LaboratoryServicesArvSwitch> getD20(List<LaboratoryServicesArvSwitch> list) {
        List<LaboratoryServicesArvSwitch> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("Second line")) {
                        data.add(test);
                    }
                });
        return data;

    }

    public List<LaboratoryServicesArvSwitch> getD21(List<LaboratoryServicesArvSwitch> list) {
        List<LaboratoryServicesArvSwitch> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("Third line")) {
                        data.add(test);
                    }
                });
        return data;

    }

    public List<LaboratoryServicesTests> getD22(List<LaboratoryServicesTests> list) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeID() != null)
                .forEach(test -> {
                    String testType = test.getTestTypeID();
                    float results = test.getResultNumeric();
                    if (testType.equalsIgnoreCase("CD4") & results < 200) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<LaboratoryServicesTests> getD23(List<LaboratoryServicesTests> list) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeID() != null)
                .forEach(test -> {
                    String testType = test.getTestTypeID();
                    float results = test.getResultNumeric();
                    if (testType.equalsIgnoreCase("CD4") & results >= 200) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<LaboratoryServicesTests> getD24(List<LaboratoryServicesTests> list) {
        List<LaboratoryServicesTests> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getTestTypeID() != null)
                .forEach(test -> {
                    String testType = test.getTestTypeID();
                    float results = test.getResultNumeric();
                    if (testType.equalsIgnoreCase("CD4") & results >= 500) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD25(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("First line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD26(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("First line") & arvstatus == 6 & arvreason == 423) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD27(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    //int arvreason = 
                    if (regimen.equalsIgnoreCase("First line") & arvstatus == 6) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD28(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    //int arvreason = 
                    if (regimen.equalsIgnoreCase("First line") & arvstatus == 6) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD29(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("First line") & status.equalsIgnoreCase("Died")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD30(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("First line") & status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD31(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("First line") & status.equalsIgnoreCase("Transferred to another clinic")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<PatientsTransferInVisit> getD32(List<PatientsTransferInVisit> list) {
        List<PatientsTransferInVisit> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getReferredFromNotes() != null)
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("First Line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummaryAdverseEvents> getD33(List<ArtSummaryAdverseEvents> list) {
        List<ArtSummaryAdverseEvents> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String adverse = test.getAdverseEventsStatusCode();

                    if (adverse.equalsIgnoreCase("g")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD34(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("First line") & arvstatus == 5 & (arvreason == 401 || arvreason == 402 || arvreason == 403
                    || arvreason == 404 || arvreason == 405 || arvreason == 406 || arvreason == 407 || arvreason == 408 || arvreason == 409
                    || arvreason == 410 || arvreason == 411 || arvreason == 412)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD35(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("First line") & arvstatus == 4 & (arvreason == 413 || arvreason == 414)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD36(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("First line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD38(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("Second line") & arvstatus == 6 & arvreason == 423) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD39(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("Second line") & status.equalsIgnoreCase("Died")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD40(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("Second line") & status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD41(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("Second line") & status.equalsIgnoreCase("Transferred to another clinic")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<PatientsTransferInVisit> getD42(List<PatientsTransferInVisit> list) {
        List<PatientsTransferInVisit> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getReferredFromNotes() != null)
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("Second Line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummaryAdverseEvents> getD43(List<ArtSummaryAdverseEvents> list) {
        List<ArtSummaryAdverseEvents> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String adverse = test.getAdverseEventsStatusCode();

                    if (adverse.equalsIgnoreCase("i")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD44(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("Second line") & arvstatus == 5 & (arvreason == 401 || arvreason == 402 || arvreason == 403
                    || arvreason == 404 || arvreason == 405 || arvreason == 406 || arvreason == 407 || arvreason == 408 || arvreason == 409
                    || arvreason == 410 || arvreason == 411 || arvreason == 412)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD45(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("Second line") & arvstatus == 4 & (arvreason == 413 || arvreason == 414)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD46(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("Second line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD48(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("Third line") & arvstatus == 6 & arvreason == 423) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD49(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("Third line") & status.equalsIgnoreCase("Died")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD50(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("Third line") & status.equalsIgnoreCase("Lost to follow-up")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD51(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .filter(test -> test.getStatus() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    String status = test.getStatus();
                    if (regimen.equalsIgnoreCase("Third line") & status.equalsIgnoreCase("Transferred to another clinic")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<PatientsTransferInVisit> getD52(List<PatientsTransferInVisit> list) {
        List<PatientsTransferInVisit> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getReferredFromNotes() != null)
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("Third Line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummaryAdverseEvents> getD53(List<ArtSummaryAdverseEvents> list) {
        List<ArtSummaryAdverseEvents> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getAdverseEventsStatusCode() != null)
                .forEach(test -> {
                    String adverse = test.getAdverseEventsStatusCode();

                    if (adverse.equalsIgnoreCase("k")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD54(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("Third line") & arvstatus == 5 & (arvreason == 401 || arvreason == 402 || arvreason == 403
                    || arvreason == 404 || arvreason == 405 || arvreason == 406 || arvreason == 407 || arvreason == 408 || arvreason == 409
                    || arvreason == 410 || arvreason == 411 || arvreason == 412)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<ArtSummary> getD55(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    int arvstatus = test.getARVStatusCode();
                    int arvreason = test.getARVReasonCode();
                    if (regimen.equalsIgnoreCase("Third line") & arvstatus == 4 & (arvreason == 413 || arvreason == 414)) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<CaseBaseNotification> getAllCases(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getOPDNumber() != null)
                .forEach(test -> {
                    data.add(test);
                });

        return data;
    }

    public List<ArtSummary> getD56(List<ArtSummary> list) {
        List<ArtSummary> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRegimenType() != null)
                .forEach(test -> {
                    String regimen = test.getRegimenType();
                    if (regimen.equalsIgnoreCase("Third line")) {
                        data.add(test);
                    }
                });
        return data;
    }

    public List<CaseBaseNotification> getRecencyTestDone(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTesting() != null)
                .forEach(test -> {
                    String recencyTest = test.getRecencyTesting();
                    if (recencyTest.equalsIgnoreCase("Done")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getRecencyTestNotDone(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTesting() != null)
                .forEach(test -> {
                    String recencyTest = test.getRecencyTesting();
                    if (recencyTest.equalsIgnoreCase("Not Done")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getRecencyTestRecent(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String recencyTest = test.getRecencyTestingResult();
                    if (recencyTest.equalsIgnoreCase("recent")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getRecencyTestLongTerm(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String recencyTest = test.getRecencyTestingResult();
                    if (recencyTest.equalsIgnoreCase("long term")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getRecencyTestInvalid(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String recencyTest = test.getRecencyTestingResult();
                    if (recencyTest.equalsIgnoreCase("invalid")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getRecencyTestNegative(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getRecencyTestingResult() != null)
                .forEach(test -> {
                    String recencyTest = test.getRecencyTestingResult();
                    if (recencyTest.equalsIgnoreCase("rtri negative")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getWhoStage1(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String whoStage = test.getWhoStageAtNotification();
                    if (whoStage.equalsIgnoreCase("1")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getWhoStage2(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String whoStage = test.getWhoStageAtNotification();
                    if (whoStage.equalsIgnoreCase("2")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getWhoStage3(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String whoStage = test.getWhoStageAtNotification();
                    if (whoStage.equalsIgnoreCase("3")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getWhoStage4(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getWhoStageAtNotification() != null)
                .forEach(test -> {
                    String whoStage = test.getWhoStageAtNotification();
                    if (whoStage.equalsIgnoreCase("4")) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getCdCountLow(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDateEnteredEpms() != null)
                .forEach(test -> {
                    int cdCount = test.getCdCountResult();
                    if (cdCount < 200) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getCdCountMild(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDateEnteredEpms() != null)
                .forEach(test -> {
                    int cdCount = test.getCdCountResult();
                    if (cdCount >= 200 && cdCount <= 499) {
                        data.add(test);
                    }
                });

        return data;
    }

    public List<CaseBaseNotification> getCdCountHigh(List<CaseBaseNotification> list) {
        List<CaseBaseNotification> data = new ArrayList<>();
        list.stream()
                .filter(test -> test.getDateEnteredEpms() != null)
                .forEach(test -> {
                    int cdCount = test.getCdCountResult();
                    if (cdCount >= 500) {
                        data.add(test);
                    }
                });

        return data;
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

}
