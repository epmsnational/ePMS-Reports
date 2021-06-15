/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.CbsTests;
import com.vmmc.entities.Patient;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface cbsablePatient {
    int add(Cbs p);
    List<Cbs>getAllPatients();
    Patient getPatient(String opdNum);
    int edit(Cbs p);    
    Cbs getCbsPatient(String opdnumber);
    CbsTests getCbsTests(String opdnumber);
    int remove(int id);
    int countAllPatients();
    List<Cbs>countAll();
    /*will search using OPDNumber*/
    
    
}
