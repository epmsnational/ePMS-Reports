package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * HtcSetuphtcmodel generated by hbm2java
 */
public class HtcSetuphtcmodel  implements java.io.Serializable {


     private Integer id;
     private String description;
     private Integer facilityBased;
     private Integer communityBased;
     private Integer mainModel;

    public HtcSetuphtcmodel() {
    }

    public HtcSetuphtcmodel(String description, Integer facilityBased, Integer communityBased, Integer mainModel) {
       this.description = description;
       this.facilityBased = facilityBased;
       this.communityBased = communityBased;
       this.mainModel = mainModel;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getFacilityBased() {
        return this.facilityBased;
    }
    
    public void setFacilityBased(Integer facilityBased) {
        this.facilityBased = facilityBased;
    }
    public Integer getCommunityBased() {
        return this.communityBased;
    }
    
    public void setCommunityBased(Integer communityBased) {
        this.communityBased = communityBased;
    }
    public Integer getMainModel() {
        return this.mainModel;
    }
    
    public void setMainModel(Integer mainModel) {
        this.mainModel = mainModel;
    }




}


