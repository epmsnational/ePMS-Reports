/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.StiSetupsyndrome;
import java.util.List;

/**
 *
 * @author Training3
 */
public interface StiSetupsyndromeable {
    int AddStiSetupsyndrome(StiSetupsyndrome sti);

    List<StiSetupsyndrome> getStiSetupsyndrome();

    int editStiSetupsyndrome(StiSetupsyndrome syndrome);

    int removeStiSetupsyndrome(String stinumber);

    
}
