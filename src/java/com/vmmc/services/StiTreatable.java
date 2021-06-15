
package com.vmmc.services;

import com.vmmc.entities.StiTreament;
import java.util.Date;
import java.util.List;

/**
 *
 * @author leon-mbano
 */
public interface StiTreatable {
     int AddStiTreament(StiTreament stireament);
    List<StiTreament> getAllStiTreaments();
     List<StiTreament> getPatientStiTreaments(String stiNumber);
    StiTreament getStiTreament(String stiNumber, Date treatmentdate);
    int editStiTreament(StiTreament stitreament);
    int removeStiTreament(int id);
}
