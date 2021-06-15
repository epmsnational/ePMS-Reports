/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupvisittypes;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpVisitTypable {
    int addVisittype(Tblsetupvisittypes visittypes);
    List<Tblsetupvisittypes> getVisittype();
    int edit(Tblsetupvisittypes visittypes);
    int remove(int id);
    
}
