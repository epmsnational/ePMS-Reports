/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcCircumcisionprocedure;

/**
 *
 * @author Trevor
 */
public interface VmmcProcService {
    int add(VmmcCircumcisionprocedure vcp);
    VmmcCircumcisionprocedure getVmmcCircumProc( String vmmcid);
    int editVmmcProcedure(VmmcCircumcisionprocedure vcp);
    int removeVmmcProcedure(int id);
}
