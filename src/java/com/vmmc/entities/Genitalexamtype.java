package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Genitalexamtype generated by hbm2java
 */
public class Genitalexamtype  implements java.io.Serializable {


     private int id;
     private String genitalExamName;

    public Genitalexamtype() {
    }

	
    public Genitalexamtype(int id) {
        this.id = id;
    }
    public Genitalexamtype(int id, String genitalExamName) {
       this.id = id;
       this.genitalExamName = genitalExamName;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getGenitalExamName() {
        return this.genitalExamName;
    }
    
    public void setGenitalExamName(String genitalExamName) {
        this.genitalExamName = genitalExamName;
    }




}


