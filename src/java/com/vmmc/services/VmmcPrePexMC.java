/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcPrepexmalecircumcision;

/**
 *
 * @author Trevor
 */
public interface VmmcPrePexMC {
    int add(VmmcPrepexmalecircumcision vpxm);    
    VmmcPrepexmalecircumcision getPrepex(String vmmcid);
    int editPrepexMC(VmmcPrepexmalecircumcision vpxm);
    int deletePrepexMC(int id);
    
}
