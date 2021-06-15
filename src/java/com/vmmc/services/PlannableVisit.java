/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Visitplans;
import java.util.List;

/**
 *
 * @author System Devoloper
 */
public interface PlannableVisit {
    int add(Visitplans  vp);
    int edit(Visitplans  vp);
    int delete(Visitplans  vp);
    List<Visitplans> getVisitPlans(String vmmcId);
    
    
}
