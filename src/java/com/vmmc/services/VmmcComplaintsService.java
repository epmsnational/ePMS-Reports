/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcComplaints;
import java.util.List;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public interface VmmcComplaintsService {
    int add(VmmcComplaints vmmcomplaints);
    List<VmmcComplaints> getVmmcComplaints(String vmmcid);
    int edit(VmmcComplaints vmmcomplaints);
    int remove(int id);
    
}
