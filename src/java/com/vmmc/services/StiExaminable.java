/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiExaminations;
import java.util.List;

/**
 *
 * @author lyndon
 */
public interface StiExaminable {
      int add(StiExaminations exam);
    List<StiExaminations> getAll();
    int edit(StiExaminations exam);
    int remove(int id);
    
}
