/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.StiSetuppurposeofsyphilis;
import java.util.List;

/**
 *
 * @author divar
 */
public interface StiSetuppurposeofsyphilisable {
    int AddStiSetupPurpose(StiSetuppurposeofsyphilis purpose);
    int editStiSetupPurpose( StiSetuppurposeofsyphilis purpose);
    int removeStiSetupPurpose(String stinumber);
    List<StiSetuppurposeofsyphilis> getAllStiSetupPurpose();
    
}
