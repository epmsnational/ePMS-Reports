package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tblpregnancies generated by hbm2java
 */
public class Tblpregnancies  implements java.io.Serializable {


     private TblpregnanciesId id;
     private Tblpatients tblpatients;
     private String notes;
     private String ancnumber;
     private Date dateOfBirth;
     private String pregnancyOutcomeId;
     private Integer numberLiveBorn;
     private String birthLocation;
     private String deliveryModeId;
     private String assistanceId;
     private String presentationId;
     private String tearId;
     private Integer ldprophylaxisArvcode;

    public Tblpregnancies() {
    }

	
    public Tblpregnancies(TblpregnanciesId id, Tblpatients tblpatients) {
        this.id = id;
        this.tblpatients = tblpatients;
    }
    public Tblpregnancies(TblpregnanciesId id, Tblpatients tblpatients, String notes, String ancnumber, Date dateOfBirth, String pregnancyOutcomeId, Integer numberLiveBorn, String birthLocation, String deliveryModeId, String assistanceId, String presentationId, String tearId, Integer ldprophylaxisArvcode) {
       this.id = id;
       this.tblpatients = tblpatients;
       this.notes = notes;
       this.ancnumber = ancnumber;
       this.dateOfBirth = dateOfBirth;
       this.pregnancyOutcomeId = pregnancyOutcomeId;
       this.numberLiveBorn = numberLiveBorn;
       this.birthLocation = birthLocation;
       this.deliveryModeId = deliveryModeId;
       this.assistanceId = assistanceId;
       this.presentationId = presentationId;
       this.tearId = tearId;
       this.ldprophylaxisArvcode = ldprophylaxisArvcode;
    }
   
    public TblpregnanciesId getId() {
        return this.id;
    }
    
    public void setId(TblpregnanciesId id) {
        this.id = id;
    }
    public Tblpatients getTblpatients() {
        return this.tblpatients;
    }
    
    public void setTblpatients(Tblpatients tblpatients) {
        this.tblpatients = tblpatients;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getAncnumber() {
        return this.ancnumber;
    }
    
    public void setAncnumber(String ancnumber) {
        this.ancnumber = ancnumber;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPregnancyOutcomeId() {
        return this.pregnancyOutcomeId;
    }
    
    public void setPregnancyOutcomeId(String pregnancyOutcomeId) {
        this.pregnancyOutcomeId = pregnancyOutcomeId;
    }
    public Integer getNumberLiveBorn() {
        return this.numberLiveBorn;
    }
    
    public void setNumberLiveBorn(Integer numberLiveBorn) {
        this.numberLiveBorn = numberLiveBorn;
    }
    public String getBirthLocation() {
        return this.birthLocation;
    }
    
    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }
    public String getDeliveryModeId() {
        return this.deliveryModeId;
    }
    
    public void setDeliveryModeId(String deliveryModeId) {
        this.deliveryModeId = deliveryModeId;
    }
    public String getAssistanceId() {
        return this.assistanceId;
    }
    
    public void setAssistanceId(String assistanceId) {
        this.assistanceId = assistanceId;
    }
    public String getPresentationId() {
        return this.presentationId;
    }
    
    public void setPresentationId(String presentationId) {
        this.presentationId = presentationId;
    }
    public String getTearId() {
        return this.tearId;
    }
    
    public void setTearId(String tearId) {
        this.tearId = tearId;
    }
    public Integer getLdprophylaxisArvcode() {
        return this.ldprophylaxisArvcode;
    }
    
    public void setLdprophylaxisArvcode(Integer ldprophylaxisArvcode) {
        this.ldprophylaxisArvcode = ldprophylaxisArvcode;
    }




}


