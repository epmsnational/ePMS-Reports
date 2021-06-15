/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblexposedinfants;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface ExposedInfantable {
    int AddExposedInfant(Tblexposedinfants exposedinfant);
    List<Tblexposedinfants> getExposedInfants();
    int editExposedInfant(Tblexposedinfants exposedinfant);
    int remove(String exposedInfantId);
    List<Patient> getAllArtWomenPatients();
    Tblexposedinfants  getExposedInfant(String exposedinfant);
}
