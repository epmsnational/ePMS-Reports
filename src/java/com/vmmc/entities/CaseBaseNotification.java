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
public class CaseBaseNotification {

    String HTCNumber;
    Date DateFormCompleted;
    String SecondTestResult;
    int CdCountResult;
    String recencyTesterName;
    String sex;
    String recencyTesting;
    Date dateHivDiagnosed;
    String recencyTestingNotDone;
    Date dateOfBirth;
    String recencyTestingResult;
    String firstTestMethod;
    String OPDNumber;
    String firstTestResult;
    Date recencyTestingDate;
    String WhoStageAtNotification;
    float CdCountPercentage;
    Date dateEnteredEpms;
    String SecondTestMethod;
    Date CdCountTestDate;

    public CaseBaseNotification() {
    }

    public CaseBaseNotification(String HTCNumber, Date DateFormCompleted, String SecondTestResult, int CdCountResult, String recencyTesterName, String sex, String recencyTesting, Date dateHivDiagnosed, String recencyTestingNotDone, Date dateOfBirth, String recencyTestingResult, String firstTestMethod, String OPDNumber, String firstTestResult, Date recencyTestingDate, String WhoStageAtNotification, float CdCountPercentage, Date dateEnteredEpms, String SecondTestMethod, Date CdCountTestDate) {
        this.HTCNumber = HTCNumber;
        this.DateFormCompleted = DateFormCompleted;
        this.SecondTestResult = SecondTestResult;
        this.CdCountResult = CdCountResult;
        this.recencyTesterName = recencyTesterName;
        this.sex = sex;
        this.recencyTesting = recencyTesting;
        this.dateHivDiagnosed = dateHivDiagnosed;
        this.recencyTestingNotDone = recencyTestingNotDone;
        this.dateOfBirth = dateOfBirth;
        this.recencyTestingResult = recencyTestingResult;
        this.firstTestMethod = firstTestMethod;
        this.OPDNumber = OPDNumber;
        this.firstTestResult = firstTestResult;
        this.recencyTestingDate = recencyTestingDate;
        this.WhoStageAtNotification = WhoStageAtNotification;
        this.CdCountPercentage = CdCountPercentage;
        this.dateEnteredEpms = dateEnteredEpms;
        this.SecondTestMethod = SecondTestMethod;
        this.CdCountTestDate = CdCountTestDate;
    }

    public String getHTCNumber() {
        return HTCNumber;
    }

    public void setHTCNumber(String HTCNumber) {
        this.HTCNumber = HTCNumber;
    }

    public Date getDateFormCompleted() {
        return DateFormCompleted;
    }

    public void setDateFormCompleted(Date DateFormCompleted) {
        this.DateFormCompleted = DateFormCompleted;
    }

    public String getSecondTestResult() {
        return SecondTestResult;
    }

    public void setSecondTestResult(String SecondTestResult) {
        this.SecondTestResult = SecondTestResult;
    }

    public int getCdCountResult() {
        return CdCountResult;
    }

    public void setCdCountResult(int CdCountResult) {
        this.CdCountResult = CdCountResult;
    }

    public String getRecencyTesterName() {
        return recencyTesterName;
    }

    public void setRecencyTesterName(String recencyTesterName) {
        this.recencyTesterName = recencyTesterName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRecencyTesting() {
        return recencyTesting;
    }

    public void setRecencyTesting(String recencyTesting) {
        this.recencyTesting = recencyTesting;
    }

    public Date getDateHivDiagnosed() {
        return dateHivDiagnosed;
    }

    public void setDateHivDiagnosed(Date dateHivDiagnosed) {
        this.dateHivDiagnosed = dateHivDiagnosed;
    }

    public String getRecencyTestingNotDone() {
        return recencyTestingNotDone;
    }

    public void setRecencyTestingNotDone(String recencyTestingNotDone) {
        this.recencyTestingNotDone = recencyTestingNotDone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRecencyTestingResult() {
        return recencyTestingResult;
    }

    public void setRecencyTestingResult(String recencyTestingResult) {
        this.recencyTestingResult = recencyTestingResult;
    }

    public String getFirstTestMethod() {
        return firstTestMethod;
    }

    public void setFirstTestMethod(String firstTestMethod) {
        this.firstTestMethod = firstTestMethod;
    }

    public String getOPDNumber() {
        return OPDNumber;
    }

    public void setOPDNumber(String OPDNumber) {
        this.OPDNumber = OPDNumber;
    }

    public String getFirstTestResult() {
        return firstTestResult;
    }

    public void setFirstTestResult(String firstTestResult) {
        this.firstTestResult = firstTestResult;
    }

    public Date getRecencyTestingDate() {
        return recencyTestingDate;
    }

    public void setRecencyTestingDate(Date recencyTestingDate) {
        this.recencyTestingDate = recencyTestingDate;
    }

    public String getWhoStageAtNotification() {
        return WhoStageAtNotification;
    }

    public void setWhoStageAtNotification(String WhoStageAtNotification) {
        this.WhoStageAtNotification = WhoStageAtNotification;
    }

    public float getCdCountPercentage() {
        return CdCountPercentage;
    }

    public void setCdCountPercentage(float CdCountPercentage) {
        this.CdCountPercentage = CdCountPercentage;
    }

    public Date getDateEnteredEpms() {
        return dateEnteredEpms;
    }

    public void setDateEnteredEpms(Date dateEnteredEpms) {
        this.dateEnteredEpms = dateEnteredEpms;
    }

    public String getSecondTestMethod() {
        return SecondTestMethod;
    }

    public void setSecondTestMethod(String SecondTestMethod) {
        this.SecondTestMethod = SecondTestMethod;
    }

    public Date getCdCountTestDate() {
        return CdCountTestDate;
    }

    public void setCdCountTestDate(Date CdCountTestDate) {
        this.CdCountTestDate = CdCountTestDate;
    }
    
    
}
