/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author Trevor
 * 
 */

import com.vmmc.entities.PatientMedicalInsurance;
import java.util.List;

public interface MedicalInsurancable {
    
    int add(PatientMedicalInsurance p);
    public List<PatientMedicalInsurance> getPatientMedicalInsurance(String opdNum);
    
    
}
