package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * HtsSqnumber generated by hbm2java
 */
public class HtsSqnumber  implements java.io.Serializable {


     private Integer id;
     private Integer sqnumber;
     private Integer year;

    public HtsSqnumber() {
    }

    public HtsSqnumber(Integer sqnumber, Integer year) {
       this.sqnumber = sqnumber;
       this.year = year;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getSqnumber() {
        return this.sqnumber;
    }
    
    public void setSqnumber(Integer sqnumber) {
        this.sqnumber = sqnumber;
    }
    public Integer getYear() {
        return this.year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }




}


