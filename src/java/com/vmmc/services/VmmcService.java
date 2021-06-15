/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Vmmc;
import java.util.List;

/**
 *
 * @author System Devoloper
 */
interface VmmcService {
   int add(VmmcService vmmcservice);
    List<VmmcService> getVmmcs();
    VmmcService getVmmcService(String vmmcid);    
    
}
