/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author mbanol
 */

import com.vmmc.entities.HtcTestreason;
import java.util.List;

public interface testReasonable {
    int addTestRn(HtcTestreason shtr);
    List <HtcTestreason> getTestRn();
    int editSetupHtcTestReason(HtcTestreason shtr);
    int removeSetupHtcTestReason(int id);
    }
