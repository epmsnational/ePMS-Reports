package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tblsetuparvstatuscodes generated by hbm2java
 */
public class Tblsetuparvstatuscodes  implements java.io.Serializable {


     private int arvstatusCode;
     private String arvstatusDescription;
     private Integer onArvs;
     private Set tblsetuparvreasoncodeses = new HashSet(0);

    public Tblsetuparvstatuscodes() {
    }

	
    public Tblsetuparvstatuscodes(int arvstatusCode) {
        this.arvstatusCode = arvstatusCode;
    }
    public Tblsetuparvstatuscodes(int arvstatusCode, String arvstatusDescription, Integer onArvs, Set tblsetuparvreasoncodeses) {
       this.arvstatusCode = arvstatusCode;
       this.arvstatusDescription = arvstatusDescription;
       this.onArvs = onArvs;
       this.tblsetuparvreasoncodeses = tblsetuparvreasoncodeses;
    }
   
    public int getArvstatusCode() {
        return this.arvstatusCode;
    }
    
    public void setArvstatusCode(int arvstatusCode) {
        this.arvstatusCode = arvstatusCode;
    }
    public String getArvstatusDescription() {
        return this.arvstatusDescription;
    }
    
    public void setArvstatusDescription(String arvstatusDescription) {
        this.arvstatusDescription = arvstatusDescription;
    }
    public Integer getOnArvs() {
        return this.onArvs;
    }
    
    public void setOnArvs(Integer onArvs) {
        this.onArvs = onArvs;
    }
    public Set getTblsetuparvreasoncodeses() {
        return this.tblsetuparvreasoncodeses;
    }
    
    public void setTblsetuparvreasoncodeses(Set tblsetuparvreasoncodeses) {
        this.tblsetuparvreasoncodeses = tblsetuparvreasoncodeses;
    }




}


