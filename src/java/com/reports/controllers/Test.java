/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reports.controllers;

import com.vmmc.entities.ArtSummary;
import com.vmmc.entities.HivTbCollaboration;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.EpmsReportsSectionC;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ignatious
 */
public class Test {

    public static void main(String[] args) throws IOException {
        EpmsReportsSectionC report = new EpmsReportsSectionC();
        //CountersAdults count = new CountersAdults();
        //count.testYearsCalculator(report.getHivTbCollaboration());
//          report.getData();
        List<HivTbCollaboration> data = report.getHivTbCollaborationTptStatus();
//        CircumcisablePatientImpl c = new CircumcisablePatientImpl();
//        List data = c.getAllObjectPatients();
        for(HivTbCollaboration v : data){
        System.out.println(v);
        }
    }
    
}
