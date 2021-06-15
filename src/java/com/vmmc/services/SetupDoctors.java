/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupdoctors;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface SetupDoctors {
     int add(Setupdoctors sd);
    List<Setupdoctors> getSetupSetupDoctors();
     int editSetupDoctors(Setupdoctors sd);
    int removeSetupDoctors(int id);
    
}
