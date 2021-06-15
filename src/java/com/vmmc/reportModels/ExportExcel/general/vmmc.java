/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.StiTreament;
import com.vmmc.entities.VmmcService;
import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import com.vmmc.entities.VmmcVisits;
import com.vmmc.services.HtcHivresultServiceImpl;
import com.vmmc.services.StiTreatableImpl;
import com.vmmc.services.VmmcAdverseEventsDuringProcImpl;
import com.vmmc.services.VmmcServiceServiceImpl;
import com.vmmc.services.VmmcSurgicalMCImpl;
import com.vmmc.services.VmmcVisitServiceImpl;
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
public class vmmc {

    private static String[] columns = {"Vmmcid", "Bupivacaine", "CircumcisionProcedureId", "DiathermySetting", "DiathermyUsed", "Lignocaineone", "Lignocainetwo", "ProcedureEndtime", "ProcedureStartTime", "ProcedureTypeId"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        VmmcSurgicalMCImpl app = new VmmcSurgicalMCImpl();
        List<VmmcSurgicalmalecircumcision> vmmc = app.getAllVmmcSurgicalmalecircumcision();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Appointment");

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

        for (VmmcSurgicalmalecircumcision ap : vmmc) {

            //if (ap.getDateAppointmentGiven() != null) {
            //SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
            //String appGivenDate = f.format(ap.getDateAppointmentGiven());
            // String appDate = f.format(ap.getId().getDateOfAppointment());
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(ap.getVmmcid());
            if (ap.getBupivacaine() != null) {
                row.createCell(1).setCellValue(ap.getBupivacaine());
            }
            if (ap.getCircumcisionProcedureId() != null) {
                row.createCell(2).setCellValue(ap.getCircumcisionProcedureId());
            }
            if (ap.getDiathermySetting() != null) {
                row.createCell(3).setCellValue(ap.getDiathermySetting());
            }
            if (ap.getDiathermyUsed() != null) {
                row.createCell(4).setCellValue(ap.getDiathermyUsed());
            }
            if (ap.getLignocaineone() != null) {
                row.createCell(5).setCellValue(ap.getLignocaineone());
            }
            if (ap.getLignocainetwo() != null) {
                row.createCell(6).setCellValue(ap.getLignocainetwo());
            }
            if (ap.getProcedureEndtime() != null) {
                row.createCell(7).setCellValue(ap.getProcedureEndtime());
            }
            if (ap.getProcedureStartTime() != null) {
                row.createCell(8).setCellValue(ap.getProcedureStartTime());
            }
            if (ap.getProcedureTypeId() != null) {
                row.createCell(9).setCellValue(ap.getProcedureTypeId());
            }
        }
       // }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        //FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\vmmc.csv");
        FileOutputStream fileOut = new FileOutputStream("vmmc.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
