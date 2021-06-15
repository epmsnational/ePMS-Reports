/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.services.ExposedInfantVistableImpl;
import com.vmmc.services.ExposedInfantableImpl;
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
public class exposedInfants {

    private static String[] columns = {"ChildPatientId", "DateOfBirth", "DateOfDeath", "ExposedInfantId", "InfantStatusCode" ,"InfantStatusDate","ModeOfDelivery","MotherPatientId","PlaceOfDelivery","RegistrationDate","Sex","TheTimeStamp","UserNumber"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        ExposedInfantableImpl app = new ExposedInfantableImpl();
        List<Tblexposedinfants> exposed = app.getExposedInfants();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("ExposedInfants");

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

        for (Tblexposedinfants ap : exposed) {

            //if (ap.getDateAppointmentGiven() != null) {
            //SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
            //String appGivenDate = f.format(ap.getDateAppointmentGiven());
            // String appDate = f.format(ap.getId().getDateOfAppointment());
            Row row = sheet.createRow(rowNum++);

            if (ap.getChildPatientId() != null) {
                row.createCell(0).setCellValue(ap.getChildPatientId());
            }
            if (ap.getDateOfBirth() != null) {
                row.createCell(1).setCellValue(ap.getDateOfBirth());
            }
            if (ap.getDateOfDeath() != null) {
                row.createCell(2).setCellValue(ap.getDateOfDeath());
            }
            if (ap.getExposedInfantId() != null) {
                row.createCell(3).setCellValue(ap.getExposedInfantId());
            }
            if (ap.getInfantStatusCode() != null) {
                row.createCell(4).setCellValue(ap.getInfantStatusCode());
            }

            if (ap.getInfantStatusDate() != null) {
                row.createCell(5).setCellValue(ap.getInfantStatusDate());
            }
            if (ap.getModeOfDelivery() != null) {
                row.createCell(6).setCellValue(ap.getModeOfDelivery());
            }
            if (ap.getMotherPatientId() != null) {
                row.createCell(7).setCellValue(ap.getMotherPatientId());
            }
            if (ap.getPlaceOfDelivery() != null) {
                row.createCell(8).setCellValue(ap.getPlaceOfDelivery());
            }
            if (ap.getRegistrationDate() != null) {
                row.createCell(9).setCellValue(ap.getRegistrationDate());
            }

            if (ap.getSex() != null) {
                row.createCell(10).setCellValue(ap.getSex());
            }
            if (ap.getTheTimeStamp() != null) {
                row.createCell(11).setCellValue(ap.getTheTimeStamp());
            }
            if (ap.getUserNumber() != null) {
                row.createCell(12).setCellValue(ap.getUserNumber());
            }
            
           
        }
        
        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\exposed_infants.csv");
        //FileOutputStream fileOut = new FileOutputStream("exposed_infants.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
