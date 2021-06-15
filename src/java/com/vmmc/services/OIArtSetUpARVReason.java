/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetuparvreasoncodes;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpARVReason {
     int addARVReason(Tblsetuparvreasoncodes arvReason);
    List<Tblsetuparvreasoncodes> getARVReason();
    int edit(Tblsetuparvreasoncodes arvReason);
    int remove(int id);
    
}
