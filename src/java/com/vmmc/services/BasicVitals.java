/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.Basicvitals;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface BasicVitals {
    
     int add(Basicvitals bv);
    List<Basicvitals>getAllBasicVitals();
    int edit(Basicvitals bv);
    int remove(int id);
}
