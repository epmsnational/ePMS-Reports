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
public class EnhancedAdherenceCounselling {
    Date DateOfBirth;
    Date firstSessionDate;
    String secondSession;
    String PatientID;
    String Sex;
    Date TestDate;
    Date secondSessionDate;
    String firstSession;
    float ResultNumeric;

    public EnhancedAdherenceCounselling() {
    }

    public EnhancedAdherenceCounselling(Date DateOfBirth, Date firstSessionDate, String secondSession, String PatientID, String Sex, Date TestDate, Date secondSessionDate, String firstSession, float ResultNumeric) {
        this.DateOfBirth = DateOfBirth;
        this.firstSessionDate = firstSessionDate;
        this.secondSession = secondSession;
        this.PatientID = PatientID;
        this.Sex = Sex;
        this.TestDate = TestDate;
        this.secondSessionDate = secondSessionDate;
        this.firstSession = firstSession;
        this.ResultNumeric = ResultNumeric;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Date getFirstSessionDate() {
        return firstSessionDate;
    }

    public void setFirstSessionDate(Date firstSessionDate) {
        this.firstSessionDate = firstSessionDate;
    }

    public String getSecondSession() {
        return secondSession;
    }

    public void setSecondSession(String secondSession) {
        this.secondSession = secondSession;
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

    public Date getTestDate() {
        return TestDate;
    }

    public void setTestDate(Date TestDate) {
        this.TestDate = TestDate;
    }

    public Date getSecondSessionDate() {
        return secondSessionDate;
    }

    public void setSecondSessionDate(Date secondSessionDate) {
        this.secondSessionDate = secondSessionDate;
    }

    public String getFirstSession() {
        return firstSession;
    }

    public void setFirstSession(String firstSession) {
        this.firstSession = firstSession;
    }

    public float getResultNumeric() {
        return ResultNumeric;
    }

    public void setResultNumeric(float ResultNumeric) {
        this.ResultNumeric = ResultNumeric;
    }
    
    

    
}
