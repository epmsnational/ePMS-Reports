/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.util.Map;

/**
 *
 * @author ignatious
 */
public class ReportHash {
    
 Map<String,Object> data;

    public ReportHash() {
    }

    public ReportHash(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
 
 
    
}
