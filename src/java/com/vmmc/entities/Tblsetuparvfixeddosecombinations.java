package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetuparvfixeddosecombinations generated by hbm2java
 */
public class Tblsetuparvfixeddosecombinations  implements java.io.Serializable {


     private int arvcode;
     private String arvname;
     private String arvdescription;
     private String v2code;
     private String regimenType;
     private Integer adults;
     private Integer peds;
     private String pharmCode;

    public Tblsetuparvfixeddosecombinations() {
    }

	
    public Tblsetuparvfixeddosecombinations(int arvcode) {
        this.arvcode = arvcode;
    }
    public Tblsetuparvfixeddosecombinations(int arvcode, String arvname, String arvdescription, String v2code, String regimenType, Integer adults, Integer peds, String pharmCode) {
       this.arvcode = arvcode;
       this.arvname = arvname;
       this.arvdescription = arvdescription;
       this.v2code = v2code;
       this.regimenType = regimenType;
       this.adults = adults;
       this.peds = peds;
       this.pharmCode = pharmCode;
    }
   
    public int getArvcode() {
        return this.arvcode;
    }
    
    public void setArvcode(int arvcode) {
        this.arvcode = arvcode;
    }
    public String getArvname() {
        return this.arvname;
    }
    
    public void setArvname(String arvname) {
        this.arvname = arvname;
    }
    public String getArvdescription() {
        return this.arvdescription;
    }
    
    public void setArvdescription(String arvdescription) {
        this.arvdescription = arvdescription;
    }
    public String getV2code() {
        return this.v2code;
    }
    
    public void setV2code(String v2code) {
        this.v2code = v2code;
    }
    public String getRegimenType() {
        return this.regimenType;
    }
    
    public void setRegimenType(String regimenType) {
        this.regimenType = regimenType;
    }
    public Integer getAdults() {
        return this.adults;
    }
    
    public void setAdults(Integer adults) {
        this.adults = adults;
    }
    public Integer getPeds() {
        return this.peds;
    }
    
    public void setPeds(Integer peds) {
        this.peds = peds;
    }
    public String getPharmCode() {
        return this.pharmCode;
    }
    
    public void setPharmCode(String pharmCode) {
        this.pharmCode = pharmCode;
    }




}


