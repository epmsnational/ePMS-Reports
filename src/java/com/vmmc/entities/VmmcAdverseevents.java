package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * VmmcAdverseevents generated by hbm2java
 */
public class VmmcAdverseevents  implements java.io.Serializable {


     private Integer id;
     private String vmmcid;
     private String noAdverseEvents;
     private String hadAdverseEvents;
     private String aemanagment;
     private String vmmcnumber;

    public VmmcAdverseevents() {
    }

    public VmmcAdverseevents(String vmmcid, String noAdverseEvents, String hadAdverseEvents, String aemanagment, String vmmcnumber) {
       this.vmmcid = vmmcid;
       this.noAdverseEvents = noAdverseEvents;
       this.hadAdverseEvents = hadAdverseEvents;
       this.aemanagment = aemanagment;
       this.vmmcnumber = vmmcnumber;
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
    public String getNoAdverseEvents() {
        return this.noAdverseEvents;
    }
    
    public void setNoAdverseEvents(String noAdverseEvents) {
        this.noAdverseEvents = noAdverseEvents;
    }
    public String getHadAdverseEvents() {
        return this.hadAdverseEvents;
    }
    
    public void setHadAdverseEvents(String hadAdverseEvents) {
        this.hadAdverseEvents = hadAdverseEvents;
    }
    public String getAemanagment() {
        return this.aemanagment;
    }
    
    public void setAemanagment(String aemanagment) {
        this.aemanagment = aemanagment;
    }
    public String getVmmcnumber() {
        return this.vmmcnumber;
    }
    
    public void setVmmcnumber(String vmmcnumber) {
        this.vmmcnumber = vmmcnumber;
    }




}


