/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


import com.vmmc.entities.StiAncsyphilis;
import java.util.List;

/**
 *
 * @author leon-mbano
 */
public interface StiAncsyphilisTestable {
    int AddStiAncsyphilis(StiAncsyphilis Ancsyphilis);
    List<StiAncsyphilis> getAllStiAncsyphilis();
    int editStiAncsyphilis(StiAncsyphilis Ancsyphilis);
    int removeStiAncsyphilis(String stinumber);
    
}
