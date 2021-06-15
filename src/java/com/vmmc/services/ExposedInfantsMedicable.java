/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblexposedinfantmedication;
import com.vmmc.entities.TblexposedinfantmedicationId;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface ExposedInfantsMedicable {
    int AddExposedInfantMedication(Tblexposedinfantmedication medication);
    List<Tblexposedinfantmedication> getExposedInfantMedication();
    int editExposedInfantMedication(Tblexposedinfantmedication medication);
    int removeExposedInfantMedication(TblexposedinfantmedicationId id);
    
    
}
