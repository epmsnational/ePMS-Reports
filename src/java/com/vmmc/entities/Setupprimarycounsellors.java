package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1



/**
 * Setupprimarycounsellors generated by hbm2java
 */
public class Setupprimarycounsellors  implements java.io.Serializable {


     private int id;
     private String firstName;
     private String surname;
     private String idnumber;

    public Setupprimarycounsellors() {
    }

	
    public Setupprimarycounsellors(int id) {
        this.id = id;
    }
    public Setupprimarycounsellors(int id, String firstName, String surname, String idnumber) {
       this.id = id;
       this.firstName = firstName;
       this.surname = surname;
       this.idnumber = idnumber;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getIdnumber() {
        return this.idnumber;
    }
    
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }




}


