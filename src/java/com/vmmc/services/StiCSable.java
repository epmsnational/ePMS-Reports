/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiCs;
import java.util.List;

/**
 *
 * @author Mohcc-ATP
 */
public interface StiCSable {
    int AddCS(StiCs congenital);
    List<StiCs> getAllCongenitalSyph();
    StiCs getCSCase(String stinumber);   
    int editStiCs(StiCs congenital);
    int removeCs(int id);
    
    
}
