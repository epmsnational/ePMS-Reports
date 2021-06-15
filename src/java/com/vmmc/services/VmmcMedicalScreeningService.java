/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcMedicalscreening;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface VmmcMedicalScreeningService {
    
    int add(VmmcMedicalscreening vms);
    VmmcMedicalscreening getAll(String vmmcId);
    int edit(VmmcMedicalscreening vms);
    int remove(int id);
    
    
    
}
