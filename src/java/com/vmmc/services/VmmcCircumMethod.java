/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcCircumcisionmethod;

/**
 *
 * @author Trevor
 */
public interface VmmcCircumMethod {
    int add(VmmcCircumcisionmethod vmmccircumcisionmethod);
   VmmcCircumcisionmethod getVmmcCircumcisionmethod(String vmmcid);
   int edit(VmmcCircumcisionmethod vmmccircumcisionmethod);
    int remove(int id);
    
}
