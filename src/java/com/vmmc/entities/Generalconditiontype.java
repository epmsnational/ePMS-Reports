package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Generalconditiontype generated by hbm2java
 */
public class Generalconditiontype  implements java.io.Serializable {


     private int id;
     private String generalConditionName;

    public Generalconditiontype() {
    }

	
    public Generalconditiontype(int id) {
        this.id = id;
    }
    public Generalconditiontype(int id, String generalConditionName) {
       this.id = id;
       this.generalConditionName = generalConditionName;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getGeneralConditionName() {
        return this.generalConditionName;
    }
    
    public void setGeneralConditionName(String generalConditionName) {
        this.generalConditionName = generalConditionName;
    }




}


