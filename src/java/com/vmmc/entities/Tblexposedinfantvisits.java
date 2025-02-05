package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblexposedinfantvisits generated by hbm2java
 */
public class Tblexposedinfantvisits  implements java.io.Serializable {


     private TblexposedinfantvisitsId id;
     private Tblexposedinfants tblexposedinfants;
     private String visitTypeCode;
     private Double weight;
     private String feedingPracticeId;
     private Integer immunizationsUpToDate;
     private Date nextVisitDate;
     private Integer staffId;
     private Integer userNumber;
     private Date theTimeStamp;
     private String cotriSupplied;
     private String nvpsupplied;
     private String typeOfHivtestCode;
     private String hivtestResult;
     private String hivresultIssued;
     private String comments;
     private Set tblexposedinfantproblemses = new HashSet(0);
     private Set tblexposedinfantmedications = new HashSet(0);

    public Tblexposedinfantvisits() {
    }

	
    public Tblexposedinfantvisits(TblexposedinfantvisitsId id, Tblexposedinfants tblexposedinfants) {
        this.id = id;
        this.tblexposedinfants = tblexposedinfants;
    }
    public Tblexposedinfantvisits(TblexposedinfantvisitsId id, Tblexposedinfants tblexposedinfants, String visitTypeCode, Double weight, String feedingPracticeId, Integer immunizationsUpToDate, Date nextVisitDate, Integer staffId, Integer userNumber, Date theTimeStamp, String cotriSupplied, String nvpsupplied, String typeOfHivtestCode, String hivtestResult, String hivresultIssued, String comments, Set tblexposedinfantproblemses, Set tblexposedinfantmedications) {
       this.id = id;
       this.tblexposedinfants = tblexposedinfants;
       this.visitTypeCode = visitTypeCode;
       this.weight = weight;
       this.feedingPracticeId = feedingPracticeId;
       this.immunizationsUpToDate = immunizationsUpToDate;
       this.nextVisitDate = nextVisitDate;
       this.staffId = staffId;
       this.userNumber = userNumber;
       this.theTimeStamp = theTimeStamp;
       this.cotriSupplied = cotriSupplied;
       this.nvpsupplied = nvpsupplied;
       this.typeOfHivtestCode = typeOfHivtestCode;
       this.hivtestResult = hivtestResult;
       this.hivresultIssued = hivresultIssued;
       this.comments = comments;
       this.tblexposedinfantproblemses = tblexposedinfantproblemses;
       this.tblexposedinfantmedications = tblexposedinfantmedications;
    }
   
    public TblexposedinfantvisitsId getId() {
        return this.id;
    }
    
    public void setId(TblexposedinfantvisitsId id) {
        this.id = id;
    }
    public Tblexposedinfants getTblexposedinfants() {
        return this.tblexposedinfants;
    }
    
    public void setTblexposedinfants(Tblexposedinfants tblexposedinfants) {
        this.tblexposedinfants = tblexposedinfants;
    }
    public String getVisitTypeCode() {
        return this.visitTypeCode;
    }
    
    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode;
    }
    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getFeedingPracticeId() {
        return this.feedingPracticeId;
    }
    
    public void setFeedingPracticeId(String feedingPracticeId) {
        this.feedingPracticeId = feedingPracticeId;
    }
    public Integer getImmunizationsUpToDate() {
        return this.immunizationsUpToDate;
    }
    
    public void setImmunizationsUpToDate(Integer immunizationsUpToDate) {
        this.immunizationsUpToDate = immunizationsUpToDate;
    }
    public Date getNextVisitDate() {
        return this.nextVisitDate;
    }
    
    public void setNextVisitDate(Date nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }
    public Integer getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
    public Integer getUserNumber() {
        return this.userNumber;
    }
    
    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }
    public Date getTheTimeStamp() {
        return this.theTimeStamp;
    }
    
    public void setTheTimeStamp(Date theTimeStamp) {
        this.theTimeStamp = theTimeStamp;
    }
    public String getCotriSupplied() {
        return this.cotriSupplied;
    }
    
    public void setCotriSupplied(String cotriSupplied) {
        this.cotriSupplied = cotriSupplied;
    }
    public String getNvpsupplied() {
        return this.nvpsupplied;
    }
    
    public void setNvpsupplied(String nvpsupplied) {
        this.nvpsupplied = nvpsupplied;
    }
    public String getTypeOfHivtestCode() {
        return this.typeOfHivtestCode;
    }
    
    public void setTypeOfHivtestCode(String typeOfHivtestCode) {
        this.typeOfHivtestCode = typeOfHivtestCode;
    }
    public String getHivtestResult() {
        return this.hivtestResult;
    }
    
    public void setHivtestResult(String hivtestResult) {
        this.hivtestResult = hivtestResult;
    }
    public String getHivresultIssued() {
        return this.hivresultIssued;
    }
    
    public void setHivresultIssued(String hivresultIssued) {
        this.hivresultIssued = hivresultIssued;
    }
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    public Set getTblexposedinfantproblemses() {
        return this.tblexposedinfantproblemses;
    }
    
    public void setTblexposedinfantproblemses(Set tblexposedinfantproblemses) {
        this.tblexposedinfantproblemses = tblexposedinfantproblemses;
    }
    public Set getTblexposedinfantmedications() {
        return this.tblexposedinfantmedications;
    }
    
    public void setTblexposedinfantmedications(Set tblexposedinfantmedications) {
        this.tblexposedinfantmedications = tblexposedinfantmedications;
    }




}


