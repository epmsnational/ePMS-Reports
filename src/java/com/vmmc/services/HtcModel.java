/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.HtcSetuphtcmodel;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface HtcModel {
    int addModel(HtcSetuphtcmodel model);
    List<HtcSetuphtcmodel> getModel();
    List<HtcSetuphtcmodel>getFacilityModels();
    List<HtcSetuphtcmodel>getComunityModels();
    int edit(HtcSetuphtcmodel model);
    int remove(int id);
    
    
}
