package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Setupservicetypes generated by hbm2java
 */
public class Setupservicetypes  implements java.io.Serializable {


     private int idsetupServiceTypes;
     private String setupServiceName;

    public Setupservicetypes() {
    }

    public Setupservicetypes(int idsetupServiceTypes, String setupServiceName) {
       this.idsetupServiceTypes = idsetupServiceTypes;
       this.setupServiceName = setupServiceName;
    }
   
    public int getIdsetupServiceTypes() {
        return this.idsetupServiceTypes;
    }
    
    public void setIdsetupServiceTypes(int idsetupServiceTypes) {
        this.idsetupServiceTypes = idsetupServiceTypes;
    }
    public String getSetupServiceName() {
        return this.setupServiceName;
    }
    
    public void setSetupServiceName(String setupServiceName) {
        this.setupServiceName = setupServiceName;
    }




}


