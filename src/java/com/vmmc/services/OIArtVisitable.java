/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.TblvisitsId;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtVisitable {

    int AddArtVisit(Tblvisits visit);

    List<Tblvisits> getVisit();

    Tblvisits getPatientSingleVisit(String patientid, Date visitdate);

    List<Tblvisits> getPatientAllVisit(String oinumber);

    int edit(Tblvisits visit);

    int remove(int id);
    void update(String patientid, Timestamp visitdate, Timestamp nextreviewdate,String whostage);

}
