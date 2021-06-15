/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblbaselinetests;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtBaseLineTests {
    int addBaselineTests(Tblbaselinetests baselineTests);
    List<Tblbaselinetests> getBaselineTests();
    int edit(Tblbaselinetests baselineTests);
    int remove(int id);
    
}
