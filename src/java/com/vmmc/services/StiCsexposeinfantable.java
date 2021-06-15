/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiCsexposeinfant;
import java.util.List;

/**
 *
 * @author Mohcc-ATP
 */
public interface StiCsexposeinfantable {
    int AddStiCsexposeinfant(StiCsexposeinfant stiexposed);
    List<StiCsexposeinfant> getAllStiCsexposeinfant();
    // List<StiCs> getPatientStiTreaments(String stinumber);   
    int editStiCsexposeinfant(StiCsexposeinfant stiexposed);
    int removeStiCsexposeinfant(int id);
    
}
