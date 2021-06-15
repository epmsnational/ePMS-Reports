/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Setupstaff;
import java.util.List;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public interface SetupstaffService {
    int add(Setupstaff s);
    List<Setupstaff> getAllStaff();
    Setupstaff getStaff(String userName);
    
}
