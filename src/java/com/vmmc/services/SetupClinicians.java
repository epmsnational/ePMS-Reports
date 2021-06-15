/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupclinicians;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface SetupClinicians {
    int add(Setupclinicians sc);
    List<Setupclinicians> getSetupSetupclinicians();
     int editSetupClinicians(Setupclinicians sc);
    int removeSetupClinicians(int id);
    
}
