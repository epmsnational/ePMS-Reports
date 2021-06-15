/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author mbanol
 */


import com.vmmc.entities.Htc;
import java.util.List;

public interface HtcTestable {
     int AddHtcData(Htc tested);
    List<Htc> getHtc();
    int edit(Htc tested);
    int remove(int id);
    List<Htc> getAllHivPositives();
    
}

