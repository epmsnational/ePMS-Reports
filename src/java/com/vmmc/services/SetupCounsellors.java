/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupprimarycounsellors;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface SetupCounsellors {
     int add(Setupprimarycounsellors spc);
    List<Setupprimarycounsellors> getSetupSetupPC();
     int editSetupPC(Setupprimarycounsellors spc);
    int removeSetupPC(int id);
    
}
