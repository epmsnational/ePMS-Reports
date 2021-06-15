/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Htc;
import com.vmmc.entities.Patient;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface HtsablePatient {
    
    int add(Htc p);
    List<Htc>getAllPatients();
    Patient getPatient(String opdNum);
    int edit(Htc p);
    Htc getHtsPatient(String htcNum);
    int remove(int id);
    /*HTCNumber*/
    
    
}
