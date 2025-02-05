package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Visitplans generated by hbm2java
 */
public class Visitplans  implements java.io.Serializable {


     private Long vpId;
     private Date visitPlanDate;
     private String authorisedBy;
     private Boolean isDone;
     private Date visitPlanDateCreated;
     private String visitPlanDescri;
     private String vmmcId;
     private String opdNumber;

    public Visitplans() {
    }

	
    public Visitplans(String vmmcId, String opdNumber) {
        this.vmmcId = vmmcId;
        this.opdNumber = opdNumber;
    }
    public Visitplans(Date visitPlanDate, String authorisedBy, Boolean isDone, Date visitPlanDateCreated, String visitPlanDescri, String vmmcId, String opdNumber) {
       this.visitPlanDate = visitPlanDate;
       this.authorisedBy = authorisedBy;
       this.isDone = isDone;
       this.visitPlanDateCreated = visitPlanDateCreated;
       this.visitPlanDescri = visitPlanDescri;
       this.vmmcId = vmmcId;
       this.opdNumber = opdNumber;
    }
   
    public Long getVpId() {
        return this.vpId;
    }
    
    public void setVpId(Long vpId) {
        this.vpId = vpId;
    }
    public Date getVisitPlanDate() {
        return this.visitPlanDate;
    }
    
    public void setVisitPlanDate(Date visitPlanDate) {
        this.visitPlanDate = visitPlanDate;
    }
    public String getAuthorisedBy() {
        return this.authorisedBy;
    }
    
    public void setAuthorisedBy(String authorisedBy) {
        this.authorisedBy = authorisedBy;
    }
    public Boolean getIsDone() {
        return this.isDone;
    }
    
    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
    public Date getVisitPlanDateCreated() {
        return this.visitPlanDateCreated;
    }
    
    public void setVisitPlanDateCreated(Date visitPlanDateCreated) {
        this.visitPlanDateCreated = visitPlanDateCreated;
    }
    public String getVisitPlanDescri() {
        return this.visitPlanDescri;
    }
    
    public void setVisitPlanDescri(String visitPlanDescri) {
        this.visitPlanDescri = visitPlanDescri;
    }
    public String getVmmcId() {
        return this.vmmcId;
    }
    
    public void setVmmcId(String vmmcId) {
        this.vmmcId = vmmcId;
    }
    public String getOpdNumber() {
        return this.opdNumber;
    }
    
    public void setOpdNumber(String opdNumber) {
        this.opdNumber = opdNumber;
    }




}


