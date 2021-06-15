/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tbltests;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtTests {
    int AddArtTest(Tbltests test);
    List<Tbltests> getTest();
    int edit(Tbltests test);
    int remove(int id);
    
}
