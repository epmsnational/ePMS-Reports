/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Adverseeventtype;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface SetupAdverseEventsTypeService {
     int add(Adverseeventtype aet);
    List<Adverseeventtype> getAdverseEventTypes();
    
    
}
