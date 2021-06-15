/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Statustype;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpVisitStatus {
    int addVisitStatus(Statustype arvVisitStatus);
    List<Statustype> getVisitStatus();
    int edit(Statustype arvVisitStatus);
    int remove(int id);
    
}
