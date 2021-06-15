package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tblbaselinetests generated by hbm2java
 */
public class Tblbaselinetests  implements java.io.Serializable {


     private Integer theId;
     private String patientId;
     private String testTypeId;
     private Date testDate;
     private Date resultDate;
     private String resultNumeric;
     private String resultNotes;
     private Date dateOfEnrolment;

    public Tblbaselinetests() {
    }

	
    public Tblbaselinetests(String patientId) {
        this.patientId = patientId;
    }
    public Tblbaselinetests(String patientId, String testTypeId, Date testDate, Date resultDate, String resultNumeric, String resultNotes, Date dateOfEnrolment) {
       this.patientId = patientId;
       this.testTypeId = testTypeId;
       this.testDate = testDate;
       this.resultDate = resultDate;
       this.resultNumeric = resultNumeric;
       this.resultNotes = resultNotes;
       this.dateOfEnrolment = dateOfEnrolment;
    }
   
    public Integer getTheId() {
        return this.theId;
    }
    
    public void setTheId(Integer theId) {
        this.theId = theId;
    }
    public String getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public String getTestTypeId() {
        return this.testTypeId;
    }
    
    public void setTestTypeId(String testTypeId) {
        this.testTypeId = testTypeId;
    }
    public Date getTestDate() {
        return this.testDate;
    }
    
    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }
    public Date getResultDate() {
        return this.resultDate;
    }
    
    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }
    public String getResultNumeric() {
        return this.resultNumeric;
    }
    
    public void setResultNumeric(String resultNumeric) {
        this.resultNumeric = resultNumeric;
    }
    public String getResultNotes() {
        return this.resultNotes;
    }
    
    public void setResultNotes(String resultNotes) {
        this.resultNotes = resultNotes;
    }
    public Date getDateOfEnrolment() {
        return this.dateOfEnrolment;
    }
    
    public void setDateOfEnrolment(Date dateOfEnrolment) {
        this.dateOfEnrolment = dateOfEnrolment;
    }




}


