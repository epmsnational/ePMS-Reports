package com.vmmc.entities;
// Generated Jul 12, 2021 5:45:16 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tblvisits generated by hbm2java
 */
public class Tblvisits  implements java.io.Serializable {


     private TblvisitsId id;
     private String visitType;
     private String visitTypeCode;
     private String visitStatusCode;
     private String nowPregnant;
     private String familyPlanningId;
     private String functionalStatusCode;
     private Integer whostage;
     private String tbstatusCode;
     private String iptreasonCode;
     private String typeOfTpt;
     private Integer arvstatusCode;
     private Integer arvreasonCode;
     private Integer arvcode;
     private String notes;
     private Integer staffId;
     private Integer userNumber;
     private Date theTimeStamp;
     private String adverseEventsStatusCode;
     private Integer dispenserId;
     private Date dateOfFirstAnc;
     private Date lnmpdate;
     private String tbinvestigation;
     private Integer tbinvestigationResults;
     private String isIpteligibility;
     private String iptstatusCode;
     private String cryptococcalScreening;
     private String cryptococcalInvestigation;
     private String cryptococcalInvestigationResults;
     private String cryptococcalTreatment;
     private String arvinitiationCategory;
     private String hpvTestResult;
     private String viacTestResult;
     private String cervicalCancerTreatment;

    public Tblvisits() {
    }

	
    public Tblvisits(TblvisitsId id) {
        this.id = id;
    }
    public Tblvisits(TblvisitsId id, String visitType, String visitTypeCode, String visitStatusCode, String nowPregnant, String familyPlanningId, String functionalStatusCode, Integer whostage, String tbstatusCode, String iptreasonCode, String typeOfTpt, Integer arvstatusCode, Integer arvreasonCode, Integer arvcode, String notes, Integer staffId, Integer userNumber, Date theTimeStamp, String adverseEventsStatusCode, Integer dispenserId, Date dateOfFirstAnc, Date lnmpdate, String tbinvestigation, Integer tbinvestigationResults, String isIpteligibility, String iptstatusCode, String cryptococcalScreening, String cryptococcalInvestigation, String cryptococcalInvestigationResults, String cryptococcalTreatment, String arvinitiationCategory, String hpvTestResult, String viacTestResult, String cervicalCancerTreatment) {
       this.id = id;
       this.visitType = visitType;
       this.visitTypeCode = visitTypeCode;
       this.visitStatusCode = visitStatusCode;
       this.nowPregnant = nowPregnant;
       this.familyPlanningId = familyPlanningId;
       this.functionalStatusCode = functionalStatusCode;
       this.whostage = whostage;
       this.tbstatusCode = tbstatusCode;
       this.iptreasonCode = iptreasonCode;
       this.typeOfTpt = typeOfTpt;
       this.arvstatusCode = arvstatusCode;
       this.arvreasonCode = arvreasonCode;
       this.arvcode = arvcode;
       this.notes = notes;
       this.staffId = staffId;
       this.userNumber = userNumber;
       this.theTimeStamp = theTimeStamp;
       this.adverseEventsStatusCode = adverseEventsStatusCode;
       this.dispenserId = dispenserId;
       this.dateOfFirstAnc = dateOfFirstAnc;
       this.lnmpdate = lnmpdate;
       this.tbinvestigation = tbinvestigation;
       this.tbinvestigationResults = tbinvestigationResults;
       this.isIpteligibility = isIpteligibility;
       this.iptstatusCode = iptstatusCode;
       this.cryptococcalScreening = cryptococcalScreening;
       this.cryptococcalInvestigation = cryptococcalInvestigation;
       this.cryptococcalInvestigationResults = cryptococcalInvestigationResults;
       this.cryptococcalTreatment = cryptococcalTreatment;
       this.arvinitiationCategory = arvinitiationCategory;
       this.hpvTestResult = hpvTestResult;
       this.viacTestResult = viacTestResult;
       this.cervicalCancerTreatment = cervicalCancerTreatment;
    }
   
    public TblvisitsId getId() {
        return this.id;
    }
    
    public void setId(TblvisitsId id) {
        this.id = id;
    }
    public String getVisitType() {
        return this.visitType;
    }
    
    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }
    public String getVisitTypeCode() {
        return this.visitTypeCode;
    }
    
    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode;
    }
    public String getVisitStatusCode() {
        return this.visitStatusCode;
    }
    
    public void setVisitStatusCode(String visitStatusCode) {
        this.visitStatusCode = visitStatusCode;
    }
    public String getNowPregnant() {
        return this.nowPregnant;
    }
    
    public void setNowPregnant(String nowPregnant) {
        this.nowPregnant = nowPregnant;
    }
    public String getFamilyPlanningId() {
        return this.familyPlanningId;
    }
    
    public void setFamilyPlanningId(String familyPlanningId) {
        this.familyPlanningId = familyPlanningId;
    }
    public String getFunctionalStatusCode() {
        return this.functionalStatusCode;
    }
    
    public void setFunctionalStatusCode(String functionalStatusCode) {
        this.functionalStatusCode = functionalStatusCode;
    }
    public Integer getWhostage() {
        return this.whostage;
    }
    
    public void setWhostage(Integer whostage) {
        this.whostage = whostage;
    }
    public String getTbstatusCode() {
        return this.tbstatusCode;
    }
    
    public void setTbstatusCode(String tbstatusCode) {
        this.tbstatusCode = tbstatusCode;
    }
    public String getIptreasonCode() {
        return this.iptreasonCode;
    }
    
    public void setIptreasonCode(String iptreasonCode) {
        this.iptreasonCode = iptreasonCode;
    }
    public String getTypeOfTpt() {
        return this.typeOfTpt;
    }
    
    public void setTypeOfTpt(String typeOfTpt) {
        this.typeOfTpt = typeOfTpt;
    }
    public Integer getArvstatusCode() {
        return this.arvstatusCode;
    }
    
    public void setArvstatusCode(Integer arvstatusCode) {
        this.arvstatusCode = arvstatusCode;
    }
    public Integer getArvreasonCode() {
        return this.arvreasonCode;
    }
    
    public void setArvreasonCode(Integer arvreasonCode) {
        this.arvreasonCode = arvreasonCode;
    }
    public Integer getArvcode() {
        return this.arvcode;
    }
    
    public void setArvcode(Integer arvcode) {
        this.arvcode = arvcode;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
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
    public String getAdverseEventsStatusCode() {
        return this.adverseEventsStatusCode;
    }
    
    public void setAdverseEventsStatusCode(String adverseEventsStatusCode) {
        this.adverseEventsStatusCode = adverseEventsStatusCode;
    }
    public Integer getDispenserId() {
        return this.dispenserId;
    }
    
    public void setDispenserId(Integer dispenserId) {
        this.dispenserId = dispenserId;
    }
    public Date getDateOfFirstAnc() {
        return this.dateOfFirstAnc;
    }
    
    public void setDateOfFirstAnc(Date dateOfFirstAnc) {
        this.dateOfFirstAnc = dateOfFirstAnc;
    }
    public Date getLnmpdate() {
        return this.lnmpdate;
    }
    
    public void setLnmpdate(Date lnmpdate) {
        this.lnmpdate = lnmpdate;
    }
    public String getTbinvestigation() {
        return this.tbinvestigation;
    }
    
    public void setTbinvestigation(String tbinvestigation) {
        this.tbinvestigation = tbinvestigation;
    }
    public Integer getTbinvestigationResults() {
        return this.tbinvestigationResults;
    }
    
    public void setTbinvestigationResults(Integer tbinvestigationResults) {
        this.tbinvestigationResults = tbinvestigationResults;
    }
    public String getIsIpteligibility() {
        return this.isIpteligibility;
    }
    
    public void setIsIpteligibility(String isIpteligibility) {
        this.isIpteligibility = isIpteligibility;
    }
    public String getIptstatusCode() {
        return this.iptstatusCode;
    }
    
    public void setIptstatusCode(String iptstatusCode) {
        this.iptstatusCode = iptstatusCode;
    }
    public String getCryptococcalScreening() {
        return this.cryptococcalScreening;
    }
    
    public void setCryptococcalScreening(String cryptococcalScreening) {
        this.cryptococcalScreening = cryptococcalScreening;
    }
    public String getCryptococcalInvestigation() {
        return this.cryptococcalInvestigation;
    }
    
    public void setCryptococcalInvestigation(String cryptococcalInvestigation) {
        this.cryptococcalInvestigation = cryptococcalInvestigation;
    }
    public String getCryptococcalInvestigationResults() {
        return this.cryptococcalInvestigationResults;
    }
    
    public void setCryptococcalInvestigationResults(String cryptococcalInvestigationResults) {
        this.cryptococcalInvestigationResults = cryptococcalInvestigationResults;
    }
    public String getCryptococcalTreatment() {
        return this.cryptococcalTreatment;
    }
    
    public void setCryptococcalTreatment(String cryptococcalTreatment) {
        this.cryptococcalTreatment = cryptococcalTreatment;
    }
    public String getArvinitiationCategory() {
        return this.arvinitiationCategory;
    }
    
    public void setArvinitiationCategory(String arvinitiationCategory) {
        this.arvinitiationCategory = arvinitiationCategory;
    }
    public String getHpvTestResult() {
        return this.hpvTestResult;
    }
    
    public void setHpvTestResult(String hpvTestResult) {
        this.hpvTestResult = hpvTestResult;
    }
    public String getViacTestResult() {
        return this.viacTestResult;
    }
    
    public void setViacTestResult(String viacTestResult) {
        this.viacTestResult = viacTestResult;
    }
    public String getCervicalCancerTreatment() {
        return this.cervicalCancerTreatment;
    }
    
    public void setCervicalCancerTreatment(String cervicalCancerTreatment) {
        this.cervicalCancerTreatment = cervicalCancerTreatment;
    }




}


