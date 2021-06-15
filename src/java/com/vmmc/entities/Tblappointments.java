package com.vmmc.entities;
// Generated Jul 11, 2019 2:29:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tblappointments generated by hbm2java
 */
public class Tblappointments  implements java.io.Serializable {


     private TblappointmentsId id;
     private Tblpatients tblpatients;
     private Date dateAppointmentGiven;
     private Integer cancelled;
     private String notes;

    public Tblappointments() {
    }

	
    public Tblappointments(TblappointmentsId id, Tblpatients tblpatients) {
        this.id = id;
        this.tblpatients = tblpatients;
    }
    public Tblappointments(TblappointmentsId id, Tblpatients tblpatients, Date dateAppointmentGiven, Integer cancelled, String notes) {
       this.id = id;
       this.tblpatients = tblpatients;
       this.dateAppointmentGiven = dateAppointmentGiven;
       this.cancelled = cancelled;
       this.notes = notes;
    }
   
    public TblappointmentsId getId() {
        return this.id;
    }
    
    public void setId(TblappointmentsId id) {
        this.id = id;
    }
    public Tblpatients getTblpatients() {
        return this.tblpatients;
    }
    
    public void setTblpatients(Tblpatients tblpatients) {
        this.tblpatients = tblpatients;
    }
    public Date getDateAppointmentGiven() {
        return this.dateAppointmentGiven;
    }
    
    public void setDateAppointmentGiven(Date dateAppointmentGiven) {
        this.dateAppointmentGiven = dateAppointmentGiven;
    }
    public Integer getCancelled() {
        return this.cancelled;
    }
    
    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

}


