/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcReferredfrom;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface VmmcReferredFromService {
    int add(VmmcReferredfrom vrf);
    List<VmmcReferredfrom> getAll(String vmmcid);
    int editReferredFrom(VmmcReferredfrom vrf);
    int removeReferredFrom(int id);
}
