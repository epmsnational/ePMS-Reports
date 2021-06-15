/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupreferralsto;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpReferredTo {
     int addReferredTo(Tblsetupreferralsto referredTo);
    List<Tblsetupreferralsto> getReferredTo();
    int edit(Tblsetupreferralsto referredTo);
    int remove(int id);
    
}
