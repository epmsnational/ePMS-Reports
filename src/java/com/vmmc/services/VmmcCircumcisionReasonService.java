/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcCircumcisionreason;
import java.util.List;

/**
 *
 * @author System Devoloper
 */
public interface VmmcCircumcisionReasonService {
     int add(VmmcCircumcisionreason vcs);
    List<VmmcCircumcisionreason> getAll(String vmmcid);
    int edit(VmmcCircumcisionreason vcs);
    int remove(int id);
    
}
