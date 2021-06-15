/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiHistory;
import java.util.List;

/**
 *
 * @author lyndon
 */
public interface StiHistorable {
    int add(StiHistory history);
    List<StiHistory> getAll();
    int edit(StiHistory history);
    int remove(int id);
}
