/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupfamilyplanning;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpFamilyPlanninable {
    int addFamilyPlanning(Tblsetupfamilyplanning familyplanning);
    List<Tblsetupfamilyplanning> getFamilyPlanning();
    int edit(Tblsetupfamilyplanning familyplanning);
    int remove(int id);
}
