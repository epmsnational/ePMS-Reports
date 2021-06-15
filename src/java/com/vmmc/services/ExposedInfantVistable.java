/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.entities.TblexposedinfantvisitsId;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface ExposedInfantVistable {
    int AddExposedInfantVisit(Tblexposedinfantvisits visit);
    List<Tblexposedinfantvisits> getAllExposedInfantVisits();
    int editExposedInfantVisit(Tblexposedinfantvisits visit);
    int removeExposedInfantVisit(TblexposedinfantvisitsId id);
    List<Tblexposedinfantvisits> getExposedInfantVisits(String exposedInfantId);
     List<Tblexposedinfantvisits> getExposedInfantVisit(TblexposedinfantvisitsId id);
    
    
}
