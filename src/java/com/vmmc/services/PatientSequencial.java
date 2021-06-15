
package com.vmmc.services;

import com.vmmc.entities.PatientSqnumber;

/**
 *
 * @author lmbano
 */
public interface PatientSequencial {
     PatientSqnumber findByID(int id);
     void edidSeqnumber(PatientSqnumber seqnumber);
    
}
