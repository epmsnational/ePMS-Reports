/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcGeneralcondition;
import java.util.List;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public interface VmmcGeneralConditionService {
    int add(VmmcGeneralcondition vgc);
    List<VmmcGeneralcondition> getVmmcGeneralcondition(String vmmcid);
    int editGeneralConditions(VmmcGeneralcondition vgc);
    int removeGeneralConditions(int id);
    
}
