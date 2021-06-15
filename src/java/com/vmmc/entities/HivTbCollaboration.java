/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.entities;

import java.util.Date;

/**
 *
 * @author ignatious
 */
public class HivTbCollaboration {
    Date DateOfBirth;
    int TBInvestigationResults;
    String Status;
    String IPTStatusCode;
    int ARVStatusCode;
    String PatientID;
    String Sex;
    String IPTReasonCode;
    String TypeOfTPT;
    String IsIPTEligibility;
    Date VisitDate;
    String TBStatusCode;

    public HivTbCollaboration() {
    }

    public HivTbCollaboration(Date DateOfBirth, int TBInvestigationResults, String Status, String IPTStatusCode, int ARVStatusCode, String PatientID, String Sex, String IPTReasonCode, String TypeOfTPT, String IsIPTEligibility, Date VisitDate, String TBStatusCode) {
        this.DateOfBirth = DateOfBirth;
        this.TBInvestigationResults = TBInvestigationResults;
        this.Status = Status;
        this.IPTStatusCode = IPTStatusCode;
        this.ARVStatusCode = ARVStatusCode;
        this.PatientID = PatientID;
        this.Sex = Sex;
        this.IPTReasonCode = IPTReasonCode;
        this.TypeOfTPT = TypeOfTPT;
        this.IsIPTEligibility = IsIPTEligibility;
        this.VisitDate = VisitDate;
        this.TBStatusCode = TBStatusCode;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public int getTBInvestigationResults() {
        return TBInvestigationResults;
    }

    public void setTBInvestigationResults(int TBInvestigationResults) {
        this.TBInvestigationResults = TBInvestigationResults;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getIPTStatusCode() {
        return IPTStatusCode;
    }

    public void setIPTStatusCode(String IPTStatusCode) {
        this.IPTStatusCode = IPTStatusCode;
    }

    public int getARVStatusCode() {
        return ARVStatusCode;
    }

    public void setARVStatusCode(int ARVStatusCode) {
        this.ARVStatusCode = ARVStatusCode;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getIPTReasonCode() {
        return IPTReasonCode;
    }

    public void setIPTReasonCode(String IPTReasonCode) {
        this.IPTReasonCode = IPTReasonCode;
    }

    public String getTypeOfTPT() {
        return TypeOfTPT;
    }

    public void setTypeOfTPT(String TypeOfTPT) {
        this.TypeOfTPT = TypeOfTPT;
    }

    public String getIsIPTEligibility() {
        return IsIPTEligibility;
    }

    public void setIsIPTEligibility(String IsIPTEligibility) {
        this.IsIPTEligibility = IsIPTEligibility;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public String getTBStatusCode() {
        return TBStatusCode;
    }

    public void setTBStatusCode(String TBStatusCode) {
        this.TBStatusCode = TBStatusCode;
    }
    
    
}
