/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Sti;
import java.util.List;

/**
 *
 * @author Training3
 */
public interface StiTestable {

    int AddStiTest(Sti sti);

    List<Sti> getSti();

    int editSti(Sti sti);

    int removeSti(int id);

    List<Sti> getAllStiSyndromic();

    Sti getStiPatient(String stinumber);

    //List<Sti> getAllSyphilisPositives();
    //List<Sti> getAllConjenitalSyphilis();
}
