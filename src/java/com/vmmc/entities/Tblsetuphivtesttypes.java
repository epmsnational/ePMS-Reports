package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetuphivtesttypes generated by hbm2java
 */
public class Tblsetuphivtesttypes  implements java.io.Serializable {


     private String hivtestTypeId;
     private String hivtestType;

    public Tblsetuphivtesttypes() {
    }

	
    public Tblsetuphivtesttypes(String hivtestTypeId) {
        this.hivtestTypeId = hivtestTypeId;
    }
    public Tblsetuphivtesttypes(String hivtestTypeId, String hivtestType) {
       this.hivtestTypeId = hivtestTypeId;
       this.hivtestType = hivtestType;
    }
   
    public String getHivtestTypeId() {
        return this.hivtestTypeId;
    }
    
    public void setHivtestTypeId(String hivtestTypeId) {
        this.hivtestTypeId = hivtestTypeId;
    }
    public String getHivtestType() {
        return this.hivtestType;
    }
    
    public void setHivtestType(String hivtestType) {
        this.hivtestType = hivtestType;
    }




}


