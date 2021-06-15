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
public class LaboratoryServicesTests {
    String TestTypeID; 
    Date DateOfBirth;
    String Sex; 
    String PatientID;
    Date TestDate; 
    Date RecievedDate; 
    float ResultNumeric;
    Date ResultDate;

    public LaboratoryServicesTests() {
    }

    public LaboratoryServicesTests(String TestTypeID, Date DateOfBirth, String Sex, String PatientID, Date TestDate, Date RecievedDate, float ResultNumeric, Date ResultDate) {
        this.TestTypeID = TestTypeID;
        this.DateOfBirth = DateOfBirth;
        this.Sex = Sex;
        this.PatientID = PatientID;
        this.TestDate = TestDate;
        this.RecievedDate = RecievedDate;
        this.ResultNumeric = ResultNumeric;
        this.ResultDate = ResultDate;
    }

    public String getTestTypeID() {
        return TestTypeID;
    }

    public void setTestTypeID(String TestTypeID) {
        this.TestTypeID = TestTypeID;
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

    public Date getRecievedDate() {
        return RecievedDate;
    }

    public void setRecievedDate(Date RecievedDate) {
        this.RecievedDate = RecievedDate;
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
