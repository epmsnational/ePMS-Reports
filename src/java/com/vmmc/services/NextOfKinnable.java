/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;
import com.vmmc.entities.Nextofkin;
import java.util.List;

/**
 *
 * @author mbanol
 */
    public interface NextOfKinnable {
    int add(Nextofkin nk);
    List<Nextofkin>getNextOfKin(String opdNum);
    int edit(Nextofkin nk);
    int remove(int id);
   
}




