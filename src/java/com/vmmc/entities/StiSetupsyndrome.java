package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * StiSetupsyndrome generated by hbm2java
 */
public class StiSetupsyndrome  implements java.io.Serializable {


     private Integer code;
     private String description;
     private String category;

    public StiSetupsyndrome() {
    }

	
    public StiSetupsyndrome(String description) {
        this.description = description;
    }
    public StiSetupsyndrome(String description, String category) {
       this.description = description;
       this.category = category;
    }
   
    public Integer getCode() {
        return this.code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }




}


