/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblproblems;
import java.util.List;

/**
 *
 * @author mbanol
 */
public interface OIArtProblemable {
    int addProblems(Tblproblems problems);
    List<Tblproblems> getProblems();
}
