/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author Developer
 */
public class MohccArtRptModel {

    private String gender;
    private float age;
    private boolean isScreenedTbDuringLastVisit;
    private boolean hasSignsOfActiveTb;
    private boolean isScreenedTbHasActiveTb;
    private boolean isInvestigatedForActiveTb;
    private boolean isActiveTbPositive;//opp of preTestCounselling
    private boolean isNewlyEnroledWithActiveTb;
    private boolean isnewlyDiagnosedActiveTbB4ArtInitiation;
    private boolean isInitiatedOnArt; //opp of newTest
    private boolean isnewlyInitiatedOnTbTreatment;
    private boolean isActiveTbStartedOnArt;
    private boolean isActiveTb;
    private boolean isScreenedTBAndEligibleForIPT;
    private boolean isScreenedTbEligibleIPT;
    private boolean isNewlyEnrolledOnARTInitiatedOnIPT;
    private boolean isInARTCareStartedOnIPT;//psycho social support
    private boolean isLostToFollowUpOnIPT;
    private boolean isDiedOnIPT;
    private boolean isOnIPTDevelopedAE;
    private boolean isStoppedIPTDeuToAE;
    private boolean isTransferOutOnIPT;
    private boolean isTransferInOnIPT;
    private boolean isCompletedIPT;
    private boolean isOnIPTDevelopedActiveTB;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public boolean isIsScreenedTbDuringLastVisit() {
        return isScreenedTbDuringLastVisit;
    }

    public void setIsScreenedTbDuringLastVisit(boolean isScreenedTbDuringLastVisit) {
        this.isScreenedTbDuringLastVisit = isScreenedTbDuringLastVisit;
    }

    public boolean isHasSignsOfActiveTb() {
        return hasSignsOfActiveTb;
    }

    public void setHasSignsOfActiveTb(boolean hasSignsOfActiveTb) {
        this.hasSignsOfActiveTb = hasSignsOfActiveTb;
    }

    public boolean isIsScreenedTbHasActiveTb() {
        return isScreenedTbHasActiveTb;
    }

    public void setIsScreenedTbHasActiveTb(boolean isScreenedTbHasActiveTb) {
        this.isScreenedTbHasActiveTb = isScreenedTbHasActiveTb;
    }

    public boolean isIsInvestigatedForActiveTb() {
        return isInvestigatedForActiveTb;
    }

    public void setIsInvestigatedForActiveTb(boolean isInvestigatedForActiveTb) {
        this.isInvestigatedForActiveTb = isInvestigatedForActiveTb;
    }

    public boolean isIsActiveTbPositive() {
        return isActiveTbPositive;
    }

    public void setIsActiveTbPositive(boolean isActiveTbPositive) {
        this.isActiveTbPositive = isActiveTbPositive;
    }

    public boolean isIsNewlyEnroledWithActiveTb() {
        return isNewlyEnroledWithActiveTb;
    }

    public void setIsNewlyEnroledWithActiveTb(boolean isNewlyEnroledWithActiveTb) {
        this.isNewlyEnroledWithActiveTb = isNewlyEnroledWithActiveTb;
    }

    public boolean isIsnewlyDiagnosedActiveTbB4ArtInitiation() {
        return isnewlyDiagnosedActiveTbB4ArtInitiation;
    }

    public void setIsnewlyDiagnosedActiveTbB4ArtInitiation(boolean isnewlyDiagnosedActiveTbB4ArtInitiation) {
        this.isnewlyDiagnosedActiveTbB4ArtInitiation = isnewlyDiagnosedActiveTbB4ArtInitiation;
    }

    public boolean isIsInitiatedOnArt() {
        return isInitiatedOnArt;
    }

    public void setIsInitiatedOnArt(boolean isInitiatedOnArt) {
        this.isInitiatedOnArt = isInitiatedOnArt;
    }

    public boolean isIsnewlyInitiatedOnTbTreatment() {
        return isnewlyInitiatedOnTbTreatment;
    }

    public void setIsnewlyInitiatedOnTbTreatment(boolean isnewlyInitiatedOnTbTreatment) {
        this.isnewlyInitiatedOnTbTreatment = isnewlyInitiatedOnTbTreatment;
    }

    public boolean isIsActiveTbStartedOnArt() {
        return isActiveTbStartedOnArt;
    }

    public void setIsActiveTbStartedOnArt(boolean isActiveTbStartedOnArt) {
        this.isActiveTbStartedOnArt = isActiveTbStartedOnArt;
    }

    public boolean isIsActiveTb() {
        return isActiveTb;
    }

    public void setIsActiveTb(boolean isActiveTb) {
        this.isActiveTb = isActiveTb;
    }

    public boolean isIsScreenedTBAndEligibleForIPT() {
        return isScreenedTBAndEligibleForIPT;
    }

    public void setIsScreenedTBAndEligibleForIPT(boolean isScreenedTBAndEligibleForIPT) {
        this.isScreenedTBAndEligibleForIPT = isScreenedTBAndEligibleForIPT;
    }

    public boolean isIsScreenedTbEligibleIPT() {
        return isScreenedTbEligibleIPT;
    }

    public void setIsScreenedTbEligibleIPT(boolean isScreenedTbEligibleIPT) {
        this.isScreenedTbEligibleIPT = isScreenedTbEligibleIPT;
    }

    public boolean isIsNewlyEnrolledOnARTInitiatedOnIPT() {
        return isNewlyEnrolledOnARTInitiatedOnIPT;
    }

    public void setIsNewlyEnrolledOnARTInitiatedOnIPT(boolean isNewlyEnrolledOnARTInitiatedOnIPT) {
        this.isNewlyEnrolledOnARTInitiatedOnIPT = isNewlyEnrolledOnARTInitiatedOnIPT;
    }

    public boolean isIsInARTCareStartedOnIPT() {
        return isInARTCareStartedOnIPT;
    }

    public void setIsInARTCareStartedOnIPT(boolean isInARTCareStartedOnIPT) {
        this.isInARTCareStartedOnIPT = isInARTCareStartedOnIPT;
    }

    public boolean isIsLostToFollowUpOnIPT() {
        return isLostToFollowUpOnIPT;
    }

    public void setIsLostToFollowUpOnIPT(boolean isLostToFollowUpOnIPT) {
        this.isLostToFollowUpOnIPT = isLostToFollowUpOnIPT;
    }

    public boolean isIsDiedOnIPT() {
        return isDiedOnIPT;
    }

    public void setIsDiedOnIPT(boolean isDiedOnIPT) {
        this.isDiedOnIPT = isDiedOnIPT;
    }

    public boolean isIsOnIPTDevelopedAE() {
        return isOnIPTDevelopedAE;
    }

    public void setIsOnIPTDevelopedAE(boolean isOnIPTDevelopedAE) {
        this.isOnIPTDevelopedAE = isOnIPTDevelopedAE;
    }

    public boolean isIsStoppedIPTDeuToAE() {
        return isStoppedIPTDeuToAE;
    }

    public void setIsStoppedIPTDeuToAE(boolean isStoppedIPTDeuToAE) {
        this.isStoppedIPTDeuToAE = isStoppedIPTDeuToAE;
    }

    public boolean isIsTransferOutOnIPT() {
        return isTransferOutOnIPT;
    }

    public void setIsTransferOutOnIPT(boolean isTransferOutOnIPT) {
        this.isTransferOutOnIPT = isTransferOutOnIPT;
    }

    public boolean isIsTransferInOnIPT() {
        return isTransferInOnIPT;
    }

    public void setIsTransferInOnIPT(boolean isTransferInOnIPT) {
        this.isTransferInOnIPT = isTransferInOnIPT;
    }

    public boolean isIsCompletedIPT() {
        return isCompletedIPT;
    }

    public void setIsCompletedIPT(boolean isCompletedIPT) {
        this.isCompletedIPT = isCompletedIPT;
    }

    public boolean isIsOnIPTDevelopedActiveTB() {
        return isOnIPTDevelopedActiveTB;
    }

    public void setIsOnIPTDevelopedActiveTB(boolean isOnIPTDevelopedActiveTB) {
        this.isOnIPTDevelopedActiveTB = isOnIPTDevelopedActiveTB;
    }
    
    

}
