package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * StiCsSignsInfant generated by hbm2java
 */
public class StiCsSignsInfant  implements java.io.Serializable {


     private Integer id;
     private String description;

    public StiCsSignsInfant() {
    }

    public StiCsSignsInfant(String description) {
       this.description = description;
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




}


