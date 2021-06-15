/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Highviralload;
import com.vmmc.entities.Patient;
import java.util.List;


public interface highViralPatient {
    int add(Highviralload viral);
    List<Patient>getAllPatients();
    Patient getPatient(String opdNum);
    int edit(Highviralload viral);    
//    Cbs getCbsPatient(String opdnumber);
//    CbsTests getCbsTests(String opdnumber);
//    int remove(int id);
//    int countAllPatients();
//    List<Cbs>countAll();
    /*will search using OPDNumber*/
    
    
}
