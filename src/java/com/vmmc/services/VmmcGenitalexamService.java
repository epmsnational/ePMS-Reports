/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcGenitalexam;
import java.util.List;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
public interface VmmcGenitalexamService {
    int add(VmmcGenitalexam vge);
    List<VmmcGenitalexam> getVmmcGenitalexam(String vmmcid);
    int edit(VmmcGenitalexam vge);
    int remove(int id);
    
    
}
