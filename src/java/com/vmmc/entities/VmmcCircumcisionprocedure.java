package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VmmcCircumcisionprocedure generated by hbm2java
 */
public class VmmcCircumcisionprocedure  implements java.io.Serializable {


     private Integer id;
     private String vmmcid;
     private Date dateofProcedure;
     private String circumciserName;
     private String circumciserProfession;
     private String assistantName;
     private String assistantProfession;
     private String clinicalNote;

    public VmmcCircumcisionprocedure() {
    }

    public VmmcCircumcisionprocedure(String vmmcid, Date dateofProcedure, String circumciserName, String circumciserProfession, String assistantName, String assistantProfession, String clinicalNote) {
       this.vmmcid = vmmcid;
       this.dateofProcedure = dateofProcedure;
       this.circumciserName = circumciserName;
       this.circumciserProfession = circumciserProfession;
       this.assistantName = assistantName;
       this.assistantProfession = assistantProfession;
       this.clinicalNote = clinicalNote;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getVmmcid() {
        return this.vmmcid;
    }
    
    public void setVmmcid(String vmmcid) {
        this.vmmcid = vmmcid;
    }
    public Date getDateofProcedure() {
        return this.dateofProcedure;
    }
    
    public void setDateofProcedure(Date dateofProcedure) {
        this.dateofProcedure = dateofProcedure;
    }
    public String getCircumciserName() {
        return this.circumciserName;
    }
    
    public void setCircumciserName(String circumciserName) {
        this.circumciserName = circumciserName;
    }
    public String getCircumciserProfession() {
        return this.circumciserProfession;
    }
    
    public void setCircumciserProfession(String circumciserProfession) {
        this.circumciserProfession = circumciserProfession;
    }
    public String getAssistantName() {
        return this.assistantName;
    }
    
    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }
    public String getAssistantProfession() {
        return this.assistantProfession;
    }
    
    public void setAssistantProfession(String assistantProfession) {
        this.assistantProfession = assistantProfession;
    }
    public String getClinicalNote() {
        return this.clinicalNote;
    }
    
    public void setClinicalNote(String clinicalNote) {
        this.clinicalNote = clinicalNote;
    }




}


