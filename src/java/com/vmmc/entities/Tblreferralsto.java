package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblreferralsto generated by hbm2java
 */
public class Tblreferralsto  implements java.io.Serializable {


     private TblreferralstoId id;
     private Tblvisits tblvisits;

    public Tblreferralsto() {
    }

    public Tblreferralsto(TblreferralstoId id, Tblvisits tblvisits) {
       this.id = id;
       this.tblvisits = tblvisits;
    }
   
    public TblreferralstoId getId() {
        return this.id;
    }
    
    public void setId(TblreferralstoId id) {
        this.id = id;
    }
    public Tblvisits getTblvisits() {
        return this.tblvisits;
    }
    
    public void setTblvisits(Tblvisits tblvisits) {
        this.tblvisits = tblvisits;
    }




}


