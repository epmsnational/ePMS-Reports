/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.util.Date;
import com.vmmc.entities.Patient;
import java.util.List;

/**
 *
 * @author mamhinga
 */
public interface CircumcisablePatient {

    int add(Patient p);

    int editFullPatient(Patient p);

    List<Patient> getAllPatients();

    Patient getPatient(String opdNum);

    int edit(Patient p);

    int editHTS(Patient p);

    int editSTI(Patient p);

    int editOIArt(Patient p);

    Patient getVmmcPatient(String vmmcId);

    Patient getOIArtPatient(String patientId);

    Patient getStiPatient(String stiId);

    int remove(int id);
    
    List<Patient> getAllDatedPatients(Date startDate, Date endDate);
    

}
