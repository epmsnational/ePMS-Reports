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
public class PatientsTransferIn {

    Date DateOfBirth;
    Date TheTimeStamp;
    String ReferredFromID;
    String PatientID;
    String Sex;
    String ReferredFromNotes;
    String TransferInId;

    public PatientsTransferIn() {
    }

    public PatientsTransferIn(Date DateOfBirth, Date TheTimeStamp, String ReferredFromID, String PatientID, String Sex, String ReferredFromNotes, String TransferInId) {
        this.DateOfBirth = DateOfBirth;
        this.TheTimeStamp = TheTimeStamp;
        this.ReferredFromID = ReferredFromID;
        this.PatientID = PatientID;
        this.Sex = Sex;
        this.ReferredFromNotes = ReferredFromNotes;
        this.TransferInId = TransferInId;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Date getTheTimeStamp() {
        return TheTimeStamp;
    }

    public void setTheTimeStamp(Date TheTimeStamp) {
        this.TheTimeStamp = TheTimeStamp;
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
    
    

   }
