/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.HtcHivresult;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface HtcHivresultService {
    public int add(HtcHivresult hivResult);
    public List<HtcHivresult> getHivTests(String htsNo);
    public int editHivResult(HtcHivresult hivResult);
    public int removeHivResult(String htsNo);
    public HtcHivresult getHivResult(int id);
    
}
