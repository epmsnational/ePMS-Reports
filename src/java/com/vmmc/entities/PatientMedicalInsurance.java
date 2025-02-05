package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * PatientMedicalInsurance generated by hbm2java
 */
public class PatientMedicalInsurance  implements java.io.Serializable {


     private Integer id;
     private Integer patientId;
     private String opdnumber;
     private String medicalInsuranceName;
     private String medicalInsuranceNumber;
     private String medicalInsuranceScheme;
     private String medicalInsuranceRelation;

    public PatientMedicalInsurance() {
    }

    public PatientMedicalInsurance(Integer patientId, String opdnumber, String medicalInsuranceName, String medicalInsuranceNumber, String medicalInsuranceScheme, String medicalInsuranceRelation) {
       this.patientId = patientId;
       this.opdnumber = opdnumber;
       this.medicalInsuranceName = medicalInsuranceName;
       this.medicalInsuranceNumber = medicalInsuranceNumber;
       this.medicalInsuranceScheme = medicalInsuranceScheme;
       this.medicalInsuranceRelation = medicalInsuranceRelation;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    public String getOpdnumber() {
        return this.opdnumber;
    }
    
    public void setOpdnumber(String opdnumber) {
        this.opdnumber = opdnumber;
    }
    public String getMedicalInsuranceName() {
        return this.medicalInsuranceName;
    }
    
    public void setMedicalInsuranceName(String medicalInsuranceName) {
        this.medicalInsuranceName = medicalInsuranceName;
    }
    public String getMedicalInsuranceNumber() {
        return this.medicalInsuranceNumber;
    }
    
    public void setMedicalInsuranceNumber(String medicalInsuranceNumber) {
        this.medicalInsuranceNumber = medicalInsuranceNumber;
    }
    public String getMedicalInsuranceScheme() {
        return this.medicalInsuranceScheme;
    }
    
    public void setMedicalInsuranceScheme(String medicalInsuranceScheme) {
        this.medicalInsuranceScheme = medicalInsuranceScheme;
    }
    public String getMedicalInsuranceRelation() {
        return this.medicalInsuranceRelation;
    }
    
    public void setMedicalInsuranceRelation(String medicalInsuranceRelation) {
        this.medicalInsuranceRelation = medicalInsuranceRelation;
    }




}


