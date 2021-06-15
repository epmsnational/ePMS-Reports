/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcVisits;
import java.util.List;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public interface VmmcVisitService {
     int add(VmmcVisits vs);
    List<VmmcVisits>getAllVisits(String vmmcid);
    int editVmmcVisit(VmmcVisits vs);
    int removeVmmcVisit(int id);
}
