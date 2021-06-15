/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupiptreasoncodes;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface OIArtIptReasoncodebles {
    int addIptReasoncodes(Tblsetupiptreasoncodes iptreason);
    List<Tblsetupiptreasoncodes> getIptReasons();
    
}
