/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface VmmcSurgicalMC {
    
    int add(VmmcSurgicalmalecircumcision vsmc);    
    VmmcSurgicalmalecircumcision getVmmcSurgicalmalecircumcision(String vmmcid);
    int editVmmcSurgical(VmmcSurgicalmalecircumcision vsmc);
    int removeVmmcSurgical(int id);
    
}
