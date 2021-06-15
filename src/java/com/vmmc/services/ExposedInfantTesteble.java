/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblexposedinfanttests;
import com.vmmc.entities.TblexposedinfanttestsId;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface ExposedInfantTesteble {
    int AddExposedInfantTest(Tblexposedinfanttests test);
    List<Tblexposedinfanttests> getExposedInfantTest();
    int editExposedInfantTest(Tblexposedinfanttests test);
    int removeExposedInfantTest(TblexposedinfanttestsId id);
    
}
