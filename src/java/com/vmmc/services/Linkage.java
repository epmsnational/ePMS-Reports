/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author mbanol
 * 
 */

import com.vmmc.entities.SetupLinkages;
import java.util.List;

public interface Linkage {
    int linkAdd(SetupLinkages linked);
    List<SetupLinkages>getlinked();
    
}
