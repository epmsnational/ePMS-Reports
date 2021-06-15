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
public class LaboratoryServicesArvSwitch {
    String Status;
    Date DateOfBirth; 
    int ARVStatusCode; 
    String Sex; 
    String PatientID; 
    Date VisitDate;
    String RegimenType;

    public LaboratoryServicesArvSwitch() {
    }

    public LaboratoryServicesArvSwitch(String Status, Date DateOfBirth, int ARVStatusCode, String Sex, String PatientID, Date VisitDate, String RegimenType) {
        this.Status = Status;
        this.DateOfBirth = DateOfBirth;
        this.ARVStatusCode = ARVStatusCode;
        this.Sex = Sex;
        this.PatientID = PatientID;
        this.VisitDate = VisitDate;
        this.RegimenType = RegimenType;
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

    public int getARVStatusCode() {
        return ARVStatusCode;
    }

    public void setARVStatusCode(int ARVStatusCode) {
        this.ARVStatusCode = ARVStatusCode;
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

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public String getRegimenType() {
        return RegimenType;
    }

    public void setRegimenType(String RegimenType) {
        this.RegimenType = RegimenType;
    }
    
    
    
}
