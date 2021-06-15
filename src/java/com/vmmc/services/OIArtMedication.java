/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblmedication;
import java.util.List;

/**
 *
 * @author Trevor
 */

// Tblmedication
public interface OIArtMedication {
    int AddArtMedication(Tblmedication medication);
    List<Tblmedication> getArtMedication();
    int editArtMedication(Tblmedication medication);
    int remove(int id);
    
}
