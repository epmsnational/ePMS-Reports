package com.vmmc.entities;
// Generated Jul 5, 2021 12:52:57 PM by Hibernate Tools 4.3.1



/**
 * Tblsetupcryptococcalscreening generated by hbm2java
 */
public class Tblsetupcryptococcalscreening  implements java.io.Serializable {


     private String cryptococcalScreeningCode;
     private String cryptococcalScreeningDescription;

    public Tblsetupcryptococcalscreening() {
    }

	
    public Tblsetupcryptococcalscreening(String cryptococcalScreeningCode) {
        this.cryptococcalScreeningCode = cryptococcalScreeningCode;
    }
    public Tblsetupcryptococcalscreening(String cryptococcalScreeningCode, String cryptococcalScreeningDescription) {
       this.cryptococcalScreeningCode = cryptococcalScreeningCode;
       this.cryptococcalScreeningDescription = cryptococcalScreeningDescription;
    }
   
    public String getCryptococcalScreeningCode() {
        return this.cryptococcalScreeningCode;
    }
    
    public void setCryptococcalScreeningCode(String cryptococcalScreeningCode) {
        this.cryptococcalScreeningCode = cryptococcalScreeningCode;
    }
    public String getCryptococcalScreeningDescription() {
        return this.cryptococcalScreeningDescription;
    }
    
    public void setCryptococcalScreeningDescription(String cryptococcalScreeningDescription) {
        this.cryptococcalScreeningDescription = cryptococcalScreeningDescription;
    }




}


