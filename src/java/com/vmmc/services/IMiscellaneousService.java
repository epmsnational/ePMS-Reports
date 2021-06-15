/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.District;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Province;
import com.vmmc.entities.Role;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface IMiscellaneousService {
   List<District> getDistricts();
   List<Province> getProvinces();
   List<Role>getPositions();
   List<Facilities> getFacilities();
    
}
