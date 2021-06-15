/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblpatients;
import java.util.List;

/**
 *
 * @author Trevor and Leon
 */
public interface OIArtiable {
    int AddArtPatient(Tblpatients artpatient);
    List<Tblpatients> getArtPatients();
    
    int editArtPatient(Tblpatients artpatient);
    int remove(int id);
    public void updatePatient(String opdnumber,String artnumberold, String artnumber);
    
}
