package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetupreferrals generated by hbm2java
 */
public class Tblsetupreferrals  implements java.io.Serializable {


     private String referredFromId;
     private String referredFrom;

    public Tblsetupreferrals() {
    }

	
    public Tblsetupreferrals(String referredFromId) {
        this.referredFromId = referredFromId;
    }
    public Tblsetupreferrals(String referredFromId, String referredFrom) {
       this.referredFromId = referredFromId;
       this.referredFrom = referredFrom;
    }
   
    public String getReferredFromId() {
        return this.referredFromId;
    }
    
    public void setReferredFromId(String referredFromId) {
        this.referredFromId = referredFromId;
    }
    public String getReferredFrom() {
        return this.referredFrom;
    }
    
    public void setReferredFrom(String referredFrom) {
        this.referredFrom = referredFrom;
    }




}


