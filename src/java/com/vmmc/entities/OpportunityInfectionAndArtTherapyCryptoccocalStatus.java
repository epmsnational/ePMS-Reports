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
public class OpportunityInfectionAndArtTherapyCryptoccocalStatus {
    String Status;
    Date DateOfBirth;
    String AdverseEventsStatusCode;
    String ProblemAcronym;
    String PatientID;
    String Sex;
    Date VisitDate;
    String DrugTypeID;

    public OpportunityInfectionAndArtTherapyCryptoccocalStatus() {
    }

    public OpportunityInfectionAndArtTherapyCryptoccocalStatus(String Status, Date DateOfBirth, String AdverseEventsStatusCode, String ProblemAcronym, String PatientID, String Sex, Date VisitDate, String DrugTypeID) {
        this.Status = Status;
        this.DateOfBirth = DateOfBirth;
        this.AdverseEventsStatusCode = AdverseEventsStatusCode;
        this.ProblemAcronym = ProblemAcronym;
        this.PatientID = PatientID;
        this.Sex = Sex;
        this.VisitDate = VisitDate;
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

    public String getAdverseEventsStatusCode() {
        return AdverseEventsStatusCode;
    }

    public void setAdverseEventsStatusCode(String AdverseEventsStatusCode) {
        this.AdverseEventsStatusCode = AdverseEventsStatusCode;
    }

    public String getProblemAcronym() {
        return ProblemAcronym;
    }

    public void setProblemAcronym(String ProblemAcronym) {
        this.ProblemAcronym = ProblemAcronym;
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

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public String getDrugTypeID() {
        return DrugTypeID;
    }

    public void setDrugTypeID(String DrugTypeID) {
        this.DrugTypeID = DrugTypeID;
    }
    
    
    
}
