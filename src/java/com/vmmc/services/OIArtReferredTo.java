/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblreferralsto;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtReferredTo {
    int addReferredTo(Tblreferralsto referredTo);
    List<Tblreferralsto> getReferredTo();
    int edit(Tblreferralsto referredTo);
    int remove(int id);
    
}
