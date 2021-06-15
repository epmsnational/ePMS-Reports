/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author mbanol
 */

import com.vmmc.entities.HtcSetuphtcapproach;
import java.util.List;
public interface HtcApproach {
    int addHtcApproach(HtcSetuphtcapproach htcApproach);
    List<HtcSetuphtcapproach > getHtcApproach();
    int edit(HtcSetuphtcapproach htcApproach);
    int remove(int id);
 
}
