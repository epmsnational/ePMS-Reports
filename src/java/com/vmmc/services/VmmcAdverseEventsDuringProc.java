/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.VmmcAdverseevents;

/**
 *
 * @author Trevor
 */
public interface VmmcAdverseEventsDuringProc {
    int add(VmmcAdverseevents vae);
    VmmcAdverseevents getVAE(String vmmcid);
    int edit(VmmcAdverseevents vae);
    int remove(int id);
}
