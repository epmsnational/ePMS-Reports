/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.entities;

import java.util.Date;

/**
 *
 * @author ignatious
 */
public class PatientsTransferInVisit {

    Date DateOfBirth;
    String ReferredFromID;
    String PatientID;
    String Sex;
    String ReferredFromNotes;
    String TransferInId;
    Date VisitDate;
    String RegimenType;

    public PatientsTransferInVisit() {
    }

    public PatientsTransferInVisit(Date DateOfBirth, String ReferredFromID, String PatientID, String Sex, String ReferredFromNotes, String TransferInId, Date VisitDate, String RegimenType) {
        this.DateOfBirth = DateOfBirth;
        this.ReferredFromID = ReferredFromID;
        this.PatientID = PatientID;
        this.Sex = Sex;
        this.ReferredFromNotes = ReferredFromNotes;
        this.TransferInId = TransferInId;
        this.VisitDate = VisitDate;
        this.RegimenType = RegimenType;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getReferredFromID() {
        return ReferredFromID;
    }

    public void setReferredFromID(String ReferredFromID) {
        this.ReferredFromID = ReferredFromID;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getReferredFromNotes() {
        return ReferredFromNotes;
    }

    public void setReferredFromNotes(String ReferredFromNotes) {
        this.ReferredFromNotes = ReferredFromNotes;
    }

    public String getTransferInId() {
        return TransferInId;
    }

    public void setTransferInId(String TransferInId) {
        this.TransferInId = TransferInId;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public String getRegimenType() {
        return RegimenType;
    }

    public void setRegimenType(String RegimenType) {
        this.RegimenType = RegimenType;
    }
    
    

}
