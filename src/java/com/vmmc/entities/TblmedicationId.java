package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblmedicationId generated by hbm2java
 */
public class TblmedicationId  implements java.io.Serializable {


     private String patientId;
     private Date visitDate;
     private String drugTypeId;

    public TblmedicationId() {
    }

    public TblmedicationId(String patientId, Date visitDate, String drugTypeId) {
       this.patientId = patientId;
       this.visitDate = visitDate;
       this.drugTypeId = drugTypeId;
    }
   
    public String getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public Date getVisitDate() {
        return this.visitDate;
    }
    
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
    public String getDrugTypeId() {
        return this.drugTypeId;
    }
    
    public void setDrugTypeId(String drugTypeId) {
        this.drugTypeId = drugTypeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblmedicationId) ) return false;
		 TblmedicationId castOther = ( TblmedicationId ) other; 
         
		 return ( (this.getPatientId()==castOther.getPatientId()) || ( this.getPatientId()!=null && castOther.getPatientId()!=null && this.getPatientId().equals(castOther.getPatientId()) ) )
 && ( (this.getVisitDate()==castOther.getVisitDate()) || ( this.getVisitDate()!=null && castOther.getVisitDate()!=null && this.getVisitDate().equals(castOther.getVisitDate()) ) )
 && ( (this.getDrugTypeId()==castOther.getDrugTypeId()) || ( this.getDrugTypeId()!=null && castOther.getDrugTypeId()!=null && this.getDrugTypeId().equals(castOther.getDrugTypeId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPatientId() == null ? 0 : this.getPatientId().hashCode() );
         result = 37 * result + ( getVisitDate() == null ? 0 : this.getVisitDate().hashCode() );
         result = 37 * result + ( getDrugTypeId() == null ? 0 : this.getDrugTypeId().hashCode() );
         return result;
   }   


}


