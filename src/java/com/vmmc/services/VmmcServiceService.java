/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcService;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface VmmcServiceService {
    int add(VmmcService vs);
    List<VmmcService>getAll(String vmmcId);
    int editVmmcService(VmmcService vs);
    int removeVmmcService(int id);
    
}
