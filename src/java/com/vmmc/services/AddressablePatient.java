/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.PatientAddress;
import java.util.List;


public interface AddressablePatient {
    
    int addAdd(PatientAddress addr);
    List<PatientAddress> getAddress(int OPDNumber);
    int edit(PatientAddress addr);
    int remove(int id);
    
}
