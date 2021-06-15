/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Riskreductionplantype;
import java.util.List;

/**
 *
 * @author Trevor
 */
public interface VmmcRiskReductionPlanTypesService {
     int add(Riskreductionplantype rrpt);
    List<Riskreductionplantype> getRiskReductionPlanTypes();
    int edit(Riskreductionplantype rrpt);
    int remove(int id);
    
}
