/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetuparvstatuscodes;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpARVStatus {
    int addARVStatus(Tblsetuparvstatuscodes arvstatus);
    List<Tblsetuparvstatuscodes> getARVStatus();
    int edit(Tblsetuparvstatuscodes arvstatus);
    int remove(int id);
    
}
