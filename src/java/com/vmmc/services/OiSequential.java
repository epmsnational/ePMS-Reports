/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.ArtSqnumber;

/**
 *
 * @author mbanol
 */
public interface OiSequential {
    ArtSqnumber findByID(int id);
     void edidSeqnumber(ArtSqnumber seqnumber);
    
}
