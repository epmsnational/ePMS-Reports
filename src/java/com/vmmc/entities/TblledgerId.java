package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblledgerId generated by hbm2java
 */
public class TblledgerId  implements java.io.Serializable {


     private String msdcode;
     private Date ledgerDate;
     private String ledgerEntryTypeCode;
     private String fullFacilityCode;

    public TblledgerId() {
    }

    public TblledgerId(String msdcode, Date ledgerDate, String ledgerEntryTypeCode, String fullFacilityCode) {
       this.msdcode = msdcode;
       this.ledgerDate = ledgerDate;
       this.ledgerEntryTypeCode = ledgerEntryTypeCode;
       this.fullFacilityCode = fullFacilityCode;
    }
   
    public String getMsdcode() {
        return this.msdcode;
    }
    
    public void setMsdcode(String msdcode) {
        this.msdcode = msdcode;
    }
    public Date getLedgerDate() {
        return this.ledgerDate;
    }
    
    public void setLedgerDate(Date ledgerDate) {
        this.ledgerDate = ledgerDate;
    }
    public String getLedgerEntryTypeCode() {
        return this.ledgerEntryTypeCode;
    }
    
    public void setLedgerEntryTypeCode(String ledgerEntryTypeCode) {
        this.ledgerEntryTypeCode = ledgerEntryTypeCode;
    }
    public String getFullFacilityCode() {
        return this.fullFacilityCode;
    }
    
    public void setFullFacilityCode(String fullFacilityCode) {
        this.fullFacilityCode = fullFacilityCode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblledgerId) ) return false;
		 TblledgerId castOther = ( TblledgerId ) other; 
         
		 return ( (this.getMsdcode()==castOther.getMsdcode()) || ( this.getMsdcode()!=null && castOther.getMsdcode()!=null && this.getMsdcode().equals(castOther.getMsdcode()) ) )
 && ( (this.getLedgerDate()==castOther.getLedgerDate()) || ( this.getLedgerDate()!=null && castOther.getLedgerDate()!=null && this.getLedgerDate().equals(castOther.getLedgerDate()) ) )
 && ( (this.getLedgerEntryTypeCode()==castOther.getLedgerEntryTypeCode()) || ( this.getLedgerEntryTypeCode()!=null && castOther.getLedgerEntryTypeCode()!=null && this.getLedgerEntryTypeCode().equals(castOther.getLedgerEntryTypeCode()) ) )
 && ( (this.getFullFacilityCode()==castOther.getFullFacilityCode()) || ( this.getFullFacilityCode()!=null && castOther.getFullFacilityCode()!=null && this.getFullFacilityCode().equals(castOther.getFullFacilityCode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMsdcode() == null ? 0 : this.getMsdcode().hashCode() );
         result = 37 * result + ( getLedgerDate() == null ? 0 : this.getLedgerDate().hashCode() );
         result = 37 * result + ( getLedgerEntryTypeCode() == null ? 0 : this.getLedgerEntryTypeCode().hashCode() );
         result = 37 * result + ( getFullFacilityCode() == null ? 0 : this.getFullFacilityCode().hashCode() );
         return result;
   }   


}


