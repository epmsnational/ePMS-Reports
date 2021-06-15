/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblappointments;
import java.util.List;

/**
 *
 * @author Trevor
 */
// Tblappointments
public interface OIArtAppointments {
    int AddArtAppointment(Tblappointments appointment);
    List<Tblappointments> getAppointment();
    int editAppointment(Tblappointments appointment);
    int removeAppointment(int id);
    
}
