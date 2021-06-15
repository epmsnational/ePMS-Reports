/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblsetupadverseeventsstatus;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface OIArtSetUpAdverseEventsStatus {
     int addAdverseEvents(Tblsetupadverseeventsstatus adverseeventsstatus);
    List<Tblsetupadverseeventsstatus> getAdverseEvents();
    int edit(Tblsetupadverseeventsstatus adverseeventsstatus);
    int remove(int id);
    
}
