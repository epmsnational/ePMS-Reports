package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Tblsetuptbinvestigationresults generated by hbm2java
 */
public class Tblsetuptbinvestigationresults  implements java.io.Serializable {


     private int tbinvestigationResults;
     private String tbinvestigationResultsDescription;

    public Tblsetuptbinvestigationresults() {
    }

	
    public Tblsetuptbinvestigationresults(int tbinvestigationResults) {
        this.tbinvestigationResults = tbinvestigationResults;
    }
    public Tblsetuptbinvestigationresults(int tbinvestigationResults, String tbinvestigationResultsDescription) {
       this.tbinvestigationResults = tbinvestigationResults;
       this.tbinvestigationResultsDescription = tbinvestigationResultsDescription;
    }
   
    public int getTbinvestigationResults() {
        return this.tbinvestigationResults;
    }
    
    public void setTbinvestigationResults(int tbinvestigationResults) {
        this.tbinvestigationResults = tbinvestigationResults;
    }
    public String getTbinvestigationResultsDescription() {
        return this.tbinvestigationResultsDescription;
    }
    
    public void setTbinvestigationResultsDescription(String tbinvestigationResultsDescription) {
        this.tbinvestigationResultsDescription = tbinvestigationResultsDescription;
    }




}


