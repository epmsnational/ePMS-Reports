/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.CbsTests;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface cbsTests {
    int addCbsTests(CbsTests Tests);
    List<CbsTests> getCbsTests();
    int edit(CbsTests Tests);
    int remove(int id);
    List<CbsTests> getRecencyTests();
    
}
