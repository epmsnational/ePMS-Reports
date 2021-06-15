/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.HtsSqnumber;

/**
 *
 * @author mbanol
 */
public interface HtsSequential {
    HtsSqnumber findByID(int id);
     void edidSeqnumber(HtsSqnumber seqnumber);
    
}
