/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblpatientsproblems;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtPatientProblemable {
    int addPatientsProblems(Tblpatientsproblems patientsproblems);
    List<Tblpatientsproblems> getPatientsProblems();
    
    
}
