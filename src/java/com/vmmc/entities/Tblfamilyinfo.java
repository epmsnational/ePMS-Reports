package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblfamilyinfo generated by hbm2java
 */
public class Tblfamilyinfo  implements java.io.Serializable {


     private int theId;
     private Tblfamilyrelatives tblfamilyrelatives;
     private Tblpatients tblpatients;
     private String relativeType;
     private String relativeAtThisClinic;
     private String relativeCtcid;

    public Tblfamilyinfo() {
    }

	
    public Tblfamilyinfo(int theId) {
        this.theId = theId;
    }
    public Tblfamilyinfo(int theId, Tblfamilyrelatives tblfamilyrelatives, Tblpatients tblpatients, String relativeType, String relativeAtThisClinic, String relativeCtcid) {
       this.theId = theId;
       this.tblfamilyrelatives = tblfamilyrelatives;
       this.tblpatients = tblpatients;
       this.relativeType = relativeType;
       this.relativeAtThisClinic = relativeAtThisClinic;
       this.relativeCtcid = relativeCtcid;
    }
   
    public int getTheId() {
        return this.theId;
    }
    
    public void setTheId(int theId) {
        this.theId = theId;
    }
    public Tblfamilyrelatives getTblfamilyrelatives() {
        return this.tblfamilyrelatives;
    }
    
    public void setTblfamilyrelatives(Tblfamilyrelatives tblfamilyrelatives) {
        this.tblfamilyrelatives = tblfamilyrelatives;
    }
    public Tblpatients getTblpatients() {
        return this.tblpatients;
    }
    
    public void setTblpatients(Tblpatients tblpatients) {
        this.tblpatients = tblpatients;
    }
    public String getRelativeType() {
        return this.relativeType;
    }
    
    public void setRelativeType(String relativeType) {
        this.relativeType = relativeType;
    }
    public String getRelativeAtThisClinic() {
        return this.relativeAtThisClinic;
    }
    
    public void setRelativeAtThisClinic(String relativeAtThisClinic) {
        this.relativeAtThisClinic = relativeAtThisClinic;
    }
    public String getRelativeCtcid() {
        return this.relativeCtcid;
    }
    
    public void setRelativeCtcid(String relativeCtcid) {
        this.relativeCtcid = relativeCtcid;
    }




}


