package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetuptesttypes generated by hbm2java
 */
public class Tblsetuptesttypes  implements java.io.Serializable {


     private String testTypeId;
     private String testType;
     private String units;
     private Integer initialVisit;
     private Integer everyVisit;
     private Integer instant;

    public Tblsetuptesttypes() {
    }

	
    public Tblsetuptesttypes(String testTypeId) {
        this.testTypeId = testTypeId;
    }
    public Tblsetuptesttypes(String testTypeId, String testType, String units, Integer initialVisit, Integer everyVisit, Integer instant) {
       this.testTypeId = testTypeId;
       this.testType = testType;
       this.units = units;
       this.initialVisit = initialVisit;
       this.everyVisit = everyVisit;
       this.instant = instant;
    }
   
    public String getTestTypeId() {
        return this.testTypeId;
    }
    
    public void setTestTypeId(String testTypeId) {
        this.testTypeId = testTypeId;
    }
    public String getTestType() {
        return this.testType;
    }
    
    public void setTestType(String testType) {
        this.testType = testType;
    }
    public String getUnits() {
        return this.units;
    }
    
    public void setUnits(String units) {
        this.units = units;
    }
    public Integer getInitialVisit() {
        return this.initialVisit;
    }
    
    public void setInitialVisit(Integer initialVisit) {
        this.initialVisit = initialVisit;
    }
    public Integer getEveryVisit() {
        return this.everyVisit;
    }
    
    public void setEveryVisit(Integer everyVisit) {
        this.everyVisit = everyVisit;
    }
    public Integer getInstant() {
        return this.instant;
    }
    
    public void setInstant(Integer instant) {
        this.instant = instant;
    }




}


