/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupstatus;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpFollowUpStatus {
    int addFollowUpStatus(Tblsetupstatus followUpStatus);
    List<Tblsetupstatus> getFollowUpStatus();
    int edit(Tblsetupstatus followUpStatus);
    int remove(int id);
    
}
