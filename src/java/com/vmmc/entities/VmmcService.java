package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * VmmcService generated by hbm2java
 */
public class VmmcService  implements java.io.Serializable {


     private Integer id;
     private String vmmcid;
     private Integer vmmcserviceTypeId;
     private String serviceDescription;
     private String otherSpecifyService;

    public VmmcService() {
    }

    public VmmcService(String vmmcid, Integer vmmcserviceTypeId, String serviceDescription, String otherSpecifyService) {
       this.vmmcid = vmmcid;
       this.vmmcserviceTypeId = vmmcserviceTypeId;
       this.serviceDescription = serviceDescription;
       this.otherSpecifyService = otherSpecifyService;
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
    public Integer getVmmcserviceTypeId() {
        return this.vmmcserviceTypeId;
    }
    
    public void setVmmcserviceTypeId(Integer vmmcserviceTypeId) {
        this.vmmcserviceTypeId = vmmcserviceTypeId;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }
    
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    public String getOtherSpecifyService() {
        return this.otherSpecifyService;
    }
    
    public void setOtherSpecifyService(String otherSpecifyService) {
        this.otherSpecifyService = otherSpecifyService;
    }




}


