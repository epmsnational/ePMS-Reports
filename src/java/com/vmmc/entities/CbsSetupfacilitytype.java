package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * CbsSetupfacilitytype generated by hbm2java
 */
public class CbsSetupfacilitytype  implements java.io.Serializable {


     private Integer id;
     private String facilitytype;

    public CbsSetupfacilitytype() {
    }

    public CbsSetupfacilitytype(String facilitytype) {
       this.facilitytype = facilitytype;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFacilitytype() {
        return this.facilitytype;
    }
    
    public void setFacilitytype(String facilitytype) {
        this.facilitytype = facilitytype;
    }




}


