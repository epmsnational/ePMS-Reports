/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.Tblmedication;
import com.vmmc.services.OIArtMedicationImpl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class artMedications {
    
    

    private static String[] columns = {"PatientId", "QuantityPrescribed", "QuantityDisp", "PercentAdherence", "Notes","VisitDate"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        OIArtMedicationImpl app = new OIArtMedicationImpl();
        List<Tblmedication> med = app.getArtMedication();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("ArtMedication");

        Font headerFont = workbook.createFont();
        //headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Other rows and cells with contacts data
        int rowNum = 1;

        for (Tblmedication ap : med) {

            //if (ap.getDateAppointmentGiven() != null) {
            //SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
            //String appGivenDate = f.format(ap.getDateAppointmentGiven());
            // String appDate = f.format(ap.getId().getDateOfAppointment());
            Row row = sheet.createRow(rowNum++);
            //if (ap.getId().getVisitDate()>= "2016-12-31" && "2017-12-31">ap.getId().getVisitDate()){

            if (ap.getId().getPatientId() != null) {
                row.createCell(0).setCellValue(ap.getId().getPatientId());
            }
            if (ap.getQuantityPrescribed() != null) {
                row.createCell(1).setCellValue(ap.getQuantityPrescribed());
            }
            if (ap.getQuantityDisp()!= null) {
                row.createCell(2).setCellValue(ap.getQuantityDisp());
            }
            if (ap.getPercentAdherence()!= null) {
                row.createCell(3).setCellValue(ap.getPercentAdherence());
            }
            if (ap.getNotes()!= null) {
                row.createCell(4).setCellValue(ap.getNotes());
            }

           if (ap.getId().getVisitDate() != null) {
               row.createCell(5).setCellValue(ap.getId().getVisitDate());
            }
  
        }
        
        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\art_medication.csv");
       // FileOutputStream fileOut = new FileOutputStream("art_medication.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

    
}
