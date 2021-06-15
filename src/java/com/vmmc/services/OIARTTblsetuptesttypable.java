/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetuptesttypes;
import java.util.List;

/**
 *
 * @author lmbano
 */
public interface OIARTTblsetuptesttypable {
    
    int addTestType(Tblsetuptesttypes testType);
    List<Tblsetuptesttypes> getTestTypes();
    int edit(Tblsetuptesttypes testType);
    int remove(String id);
    
}
