/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reports.controllers;

import com.reports.services.HivTbCollaborationPopulate;
import com.vmmc.entities.ZimepmsReport;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author ignatious
 */
public class GenerateReport {
    
    public void generateReport(Date Date){
        try {
            String dir = System.getProperty("user.home") + "/Downloads/Documents";

            File f1 = new File(dir);
            if (!f1.exists()) {
                try {
                    Files.createDirectories(Paths.get(dir)); // create folder if not exist
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            HivTbCollaborationPopulate dataList = new HivTbCollaborationPopulate();
            List<ZimepmsReport> listItems = dataList.populateReport(Date);

            JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource(listItems);

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("period", dataList.getPeriod());
            parameters.put("reportTitle", dataList.getReportTitle());
            parameters.put("EpmsDataSource", jrbean);

            JasperReport jasperReport = JasperCompileManager.compileReport("/home/ignatious/Documents/NetBeansProjects/ePMS-Reports/zimepms.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            //String timeNow = new SimpleDateFormat("dd-MM-YYYY").format(Calendar.getInstance().getTime());

            String file = dir + File.separatorChar + dataList.getReportTitle().replaceAll("/", "") +".pdf";
            
            FileOutputStream outputStream = new FileOutputStream(new File(file));

            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

            System.out.println("File Generated");
        } catch (JRException | FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
}
