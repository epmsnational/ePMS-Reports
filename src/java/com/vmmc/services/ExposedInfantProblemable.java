/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblexposedinfantproblems;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface ExposedInfantProblemable {
   int addProblems(Tblexposedinfantproblems problems);
    List<Tblexposedinfantproblems> getProblems();
    
    
}
