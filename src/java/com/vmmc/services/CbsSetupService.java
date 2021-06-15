/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.util.List;

/**
 *
 * @author Trevor
 */
public interface CbsSetupService {
    
    List getCBSEntryPoints();
       List getCBSServiceAccessesHIV();
       List getCBSServiceAccessesSyphilis();
       List getCBSServiceAccessesARVTherapy();
       List getCBSHIVTestTypes();
       List getCBSSyphilisTestTypes();  
       List getCBSSyphilisTestTypes2();
    
}
