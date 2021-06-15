/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.Tbltests;
import com.vmmc.services.OIArtTestsImpl;
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
public class artTests {

    private static String[] columns = {"PatientId", "TestDate", "TestType", "ResultDate", "ResultNumeric", "ResultNotes"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        OIArtTestsImpl app = new OIArtTestsImpl();
        List<Tbltests> test = app.getTest();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("OIArt_tests");

        Font headerFont = workbook.createFont();
        //headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.BLUE.getIndex());

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

        for (Tbltests ap : test) {

//           if (ap.getTestDate() != null) {
//
//
//                        SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
//                        String testDate = f.format(ap.getTestDate());

                        Row row = sheet.createRow(rowNum++);

                        if (ap.getTblpatients().getPatientId()!= null) {
                            row.createCell(0).setCellValue(ap.getTblpatients().getPatientId());
                        }
                        if (ap.getTestDate() != null) {
                            row.createCell(1).setCellValue(ap.getTestDate());
                        }
                        if (ap.getTestTypeId() != null) {
                            row.createCell(2).setCellValue(ap.getTestTypeId());
                        }
                        if (ap.getResultDate() != null) {
                            row.createCell(4).setCellValue(ap.getResultDate());
                        }

                        if (ap.getResultNumeric() != null) {
                            row.createCell(5).setCellValue(ap.getResultNumeric());
                        }
                        if (ap.getResultNotes() != null) {
                            row.createCell(6).setCellValue(ap.getResultNotes());
                       // }
           }
        }
        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        //FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\art_medication.csv");
        FileOutputStream fileOut = new FileOutputStream("OIArttests.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");

    }

}
