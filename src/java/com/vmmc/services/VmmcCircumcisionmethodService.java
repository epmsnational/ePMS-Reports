/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcCircumcisionmethod;
import java.util.List;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public interface VmmcCircumcisionmethodService {
    int add(VmmcCircumcisionmethod vcumM);
    List<VmmcCircumcisionmethod>getAllvmmcCircumsionMethod(String vmmcId);
    int edit(VmmcCircumcisionmethod vcumM);
    int remove(int id);
    
}
