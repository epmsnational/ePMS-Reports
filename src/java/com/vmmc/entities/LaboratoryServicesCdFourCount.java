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
public class LaboratoryServicesCdFourCount {
    String Status; 
    Date DateOfBirth;
    String Sex; 
    String PatientID;
    Date TestDate; 
    Date VisitDate;
    Date RecievedDate;
    String RegimenType;
    float ResultNumeric;
    Date ResultDate;

    public LaboratoryServicesCdFourCount() {
    }

    public LaboratoryServicesCdFourCount(String Status, Date DateOfBirth, String Sex, String PatientID, Date TestDate, Date VisitDate, Date RecievedDate, String RegimenType, float ResultNumeric, Date ResultDate) {
        this.Status = Status;
        this.DateOfBirth = DateOfBirth;
        this.Sex = Sex;
        this.PatientID = PatientID;
        this.TestDate = TestDate;
        this.VisitDate = VisitDate;
        this.RecievedDate = RecievedDate;
        this.RegimenType = RegimenType;
        this.ResultNumeric = ResultNumeric;
        this.ResultDate = ResultDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public Date getTestDate() {
        return TestDate;
    }

    public void setTestDate(Date TestDate) {
        this.TestDate = TestDate;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public Date getRecievedDate() {
        return RecievedDate;
    }

    public void setRecievedDate(Date RecievedDate) {
        this.RecievedDate = RecievedDate;
    }

    public String getRegimenType() {
        return RegimenType;
    }

    public void setRegimenType(String RegimenType) {
        this.RegimenType = RegimenType;
    }

    public float getResultNumeric() {
        return ResultNumeric;
    }

    public void setResultNumeric(float ResultNumeric) {
        this.ResultNumeric = ResultNumeric;
    }

    public Date getResultDate() {
        return ResultDate;
    }

    public void setResultDate(Date ResultDate) {
        this.ResultDate = ResultDate;
    }
    
    
    
    
}
