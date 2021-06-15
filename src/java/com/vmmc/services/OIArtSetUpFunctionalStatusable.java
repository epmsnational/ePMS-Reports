/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupfunctionalstatus;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpFunctionalStatusable {
    int addFunctionalstatus(Tblsetupfunctionalstatus functionalstatus);
    List<Tblsetupfunctionalstatus> getFunctionalstatus();
    int edit(Tblsetupfunctionalstatus functionalstatus);
    int remove(int id);
    
}
