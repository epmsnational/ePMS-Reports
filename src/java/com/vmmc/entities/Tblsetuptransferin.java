package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetuptransferin generated by hbm2java
 */
public class Tblsetuptransferin  implements java.io.Serializable {


     private String transferInId;
     private String transferIn;

    public Tblsetuptransferin() {
    }

	
    public Tblsetuptransferin(String transferInId) {
        this.transferInId = transferInId;
    }
    public Tblsetuptransferin(String transferInId, String transferIn) {
       this.transferInId = transferInId;
       this.transferIn = transferIn;
    }
   
    public String getTransferInId() {
        return this.transferInId;
    }
    
    public void setTransferInId(String transferInId) {
        this.transferInId = transferInId;
    }
    public String getTransferIn() {
        return this.transferIn;
    }
    
    public void setTransferIn(String transferIn) {
        this.transferIn = transferIn;
    }




}


