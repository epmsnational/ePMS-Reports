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
public class OpportunityInfectionAndArtTherapy {
    
    String Status;
    Date DateOfBirth; 
    String Sex; 
    String PatientID;
    String ARVStatusDescription;
    Date VisitDate;
    int WHOStage; 
    String DrugTypeID;

    public OpportunityInfectionAndArtTherapy() {
    }

    public OpportunityInfectionAndArtTherapy(String Status, Date DateOfBirth, String Sex, String PatientID, String ARVStatusDescription, Date VisitDate, int WHOStage, String DrugTypeID) {
        this.Status = Status;
        this.DateOfBirth = DateOfBirth;
        this.Sex = Sex;
        this.PatientID = PatientID;
        this.ARVStatusDescription = ARVStatusDescription;
        this.VisitDate = VisitDate;
        this.WHOStage = WHOStage;
        this.DrugTypeID = DrugTypeID;
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

    public String getARVStatusDescription() {
        return ARVStatusDescription;
    }

    public void setARVStatusDescription(String ARVStatusDescription) {
        this.ARVStatusDescription = ARVStatusDescription;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public int getWHOStage() {
        return WHOStage;
    }

    public void setWHOStage(int WHOStage) {
        this.WHOStage = WHOStage;
    }

    public String getDrugTypeID() {
        return DrugTypeID;
    }

    public void setDrugTypeID(String DrugTypeID) {
        this.DrugTypeID = DrugTypeID;
    }
    
    
    
}
