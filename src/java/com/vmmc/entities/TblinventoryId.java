package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblinventoryId generated by hbm2java
 */
public class TblinventoryId  implements java.io.Serializable {


     private String msdcode;
     private Date inventoryDate;

    public TblinventoryId() {
    }

    public TblinventoryId(String msdcode, Date inventoryDate) {
       this.msdcode = msdcode;
       this.inventoryDate = inventoryDate;
    }
   
    public String getMsdcode() {
        return this.msdcode;
    }
    
    public void setMsdcode(String msdcode) {
        this.msdcode = msdcode;
    }
    public Date getInventoryDate() {
        return this.inventoryDate;
    }
    
    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblinventoryId) ) return false;
		 TblinventoryId castOther = ( TblinventoryId ) other; 
         
		 return ( (this.getMsdcode()==castOther.getMsdcode()) || ( this.getMsdcode()!=null && castOther.getMsdcode()!=null && this.getMsdcode().equals(castOther.getMsdcode()) ) )
 && ( (this.getInventoryDate()==castOther.getInventoryDate()) || ( this.getInventoryDate()!=null && castOther.getInventoryDate()!=null && this.getInventoryDate().equals(castOther.getInventoryDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMsdcode() == null ? 0 : this.getMsdcode().hashCode() );
         result = 37 * result + ( getInventoryDate() == null ? 0 : this.getInventoryDate().hashCode() );
         return result;
   }   


}


