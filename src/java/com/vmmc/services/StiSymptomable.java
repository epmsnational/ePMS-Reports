/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiSymptoms;
import java.util.List;

/**
 *
 * @author lyndon
 */
public interface StiSymptomable {
    
    int add(StiSymptoms syndrome);
    List<StiSymptoms> getAll();
    int edit(StiSymptoms syndrome);
    int remove(int id);
    
}
