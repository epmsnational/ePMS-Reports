/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiCsSignsInfant;
import java.util.List;

/**
 *
 * @author lmbano
 */
public interface StiCsSignsInfantable {
    
    int addCsSigns(StiCsSignsInfant sign);
    List<StiCsSignsInfant> getCsSigns();
    
}
