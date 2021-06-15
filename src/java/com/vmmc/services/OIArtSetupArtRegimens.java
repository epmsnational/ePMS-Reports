/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetupArtRegimens {
     int addARVRegimens(Tblsetuparvfixeddosecombinations arvRegimens);
    List<Tblsetuparvfixeddosecombinations> getARVRegimens();
    int edit(Tblsetuparvfixeddosecombinations arvRegimens);
    int remove(int id);
    
}
