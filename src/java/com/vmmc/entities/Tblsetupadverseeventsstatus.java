package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetupadverseeventsstatus generated by hbm2java
 */
public class Tblsetupadverseeventsstatus  implements java.io.Serializable {


     private String adverseEventsStatusCode;
     private String adverseEventsStatusDescription;

    public Tblsetupadverseeventsstatus() {
    }

	
    public Tblsetupadverseeventsstatus(String adverseEventsStatusCode) {
        this.adverseEventsStatusCode = adverseEventsStatusCode;
    }
    public Tblsetupadverseeventsstatus(String adverseEventsStatusCode, String adverseEventsStatusDescription) {
       this.adverseEventsStatusCode = adverseEventsStatusCode;
       this.adverseEventsStatusDescription = adverseEventsStatusDescription;
    }
   
    public String getAdverseEventsStatusCode() {
        return this.adverseEventsStatusCode;
    }
    
    public void setAdverseEventsStatusCode(String adverseEventsStatusCode) {
        this.adverseEventsStatusCode = adverseEventsStatusCode;
    }
    public String getAdverseEventsStatusDescription() {
        return this.adverseEventsStatusDescription;
    }
    
    public void setAdverseEventsStatusDescription(String adverseEventsStatusDescription) {
        this.adverseEventsStatusDescription = adverseEventsStatusDescription;
    }




}


