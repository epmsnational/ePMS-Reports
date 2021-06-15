/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupriskreductionplan;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface SetupRiskreductionplan {
    int add(Setupriskreductionplan srrp);
    List<Setupriskreductionplan> getSetupSetupRRP();
     int editSetupRRP(Setupriskreductionplan srrp);
    int removeSetupRRP(int id);
    
}
