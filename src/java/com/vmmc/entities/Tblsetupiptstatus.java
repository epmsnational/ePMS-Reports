package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetupiptstatus generated by hbm2java
 */
public class Tblsetupiptstatus  implements java.io.Serializable {


     private String iptstatusCode;
     private String iptstatusCodeDescription;

    public Tblsetupiptstatus() {
    }

	
    public Tblsetupiptstatus(String iptstatusCode) {
        this.iptstatusCode = iptstatusCode;
    }
    public Tblsetupiptstatus(String iptstatusCode, String iptstatusCodeDescription) {
       this.iptstatusCode = iptstatusCode;
       this.iptstatusCodeDescription = iptstatusCodeDescription;
    }
   
    public String getIptstatusCode() {
        return this.iptstatusCode;
    }
    
    public void setIptstatusCode(String iptstatusCode) {
        this.iptstatusCode = iptstatusCode;
    }
    public String getIptstatusCodeDescription() {
        return this.iptstatusCodeDescription;
    }
    
    public void setIptstatusCodeDescription(String iptstatusCodeDescription) {
        this.iptstatusCodeDescription = iptstatusCodeDescription;
    }




}


