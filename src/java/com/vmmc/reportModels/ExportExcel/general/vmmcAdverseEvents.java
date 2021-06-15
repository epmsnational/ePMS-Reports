/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;


import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.VmmcAdverseevents;
import com.vmmc.services.VmmcAdverseEventsDuringProcImpl;
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
/**
 *
 * @author Mohcc-ATP
 */
public class vmmcAdverseEvents {
     private static String[] columns = {"Vmmcid", "A E Management", "HadAdverseEvents", "NoAdverseEvents", "Vmmcnumber"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        VmmcAdverseEventsDuringProcImpl app = new VmmcAdverseEventsDuringProcImpl();
        List<VmmcAdverseevents> ae = app.getAllVmmcAEs();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Post Procedure");

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

        for (VmmcAdverseevents ap : ae) {

            //if (ap.getDateAppointmentGiven() != null) {
            //SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
            //String appGivenDate = f.format(ap.getDateAppointmentGiven());
            // String appDate = f.format(ap.getId().getDateOfAppointment());
            Row row = sheet.createRow(rowNum++);

            if (ap.getVmmcid() != null) {
                row.createCell(0).setCellValue(ap.getVmmcid());
            }
            if (ap.getAemanagment() != null) {
                row.createCell(1).setCellValue(ap.getAemanagment());
            }
            if (ap.getHadAdverseEvents() != null) {
                row.createCell(2).setCellValue(ap.getHadAdverseEvents());
            }
            if (ap.getNoAdverseEvents() != null) {
                row.createCell(3).setCellValue(ap.getNoAdverseEvents());
            }
            if (ap.getVmmcnumber() != null) {
                row.createCell(4).setCellValue(ap.getVmmcnumber());
            }

        }
       // }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        //FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\vmmc.csv");
        FileOutputStream fileOut = new FileOutputStream("vmmc_adverse_events.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }
    
}
