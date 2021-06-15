/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.VmmcPostprocedureassessment;
import com.vmmc.entities.VmmcVisits;
import com.vmmc.services.VmmcPostProceduralAssImpl;
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
public class vmmcPostProcedure {

    private static String[] columns = {"Vmmcid", "AnalgesiaGiven", "BloodPressure", "ClientProvideedInstruction", "Drug", "GeneralCondition", "GivenMcclientCard", "NextVisitDate", "PrePexDevicePlaced", "Pulse"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        VmmcPostProceduralAssImpl app = new VmmcPostProceduralAssImpl();
        List<VmmcPostprocedureassessment> post = app.getAllVmmcPost();

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

        for (VmmcPostprocedureassessment ap : post) {

            //if (ap.getDateAppointmentGiven() != null) {
            //SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
            //String appGivenDate = f.format(ap.getDateAppointmentGiven());
            // String appDate = f.format(ap.getId().getDateOfAppointment());
            Row row = sheet.createRow(rowNum++);

            if (ap.getVmmcid() != null) {
                row.createCell(0).setCellValue(ap.getVmmcid());
            }
            if (ap.getAnalgesiaGiven() != null) {
                row.createCell(1).setCellValue(ap.getAnalgesiaGiven());
            }
            if (ap.getBloodPressure() != null) {
                row.createCell(2).setCellValue(ap.getBloodPressure());
            }
            if (ap.getClientProvideedInstruction() != null) {
                row.createCell(3).setCellValue(ap.getClientProvideedInstruction());
            }
            if (ap.getDrug() != null) {
                row.createCell(4).setCellValue(ap.getDrug());
            }
            if (ap.getGeneralCondition() != null) {
                row.createCell(5).setCellValue(ap.getGeneralCondition());
            }
            if (ap.getGivenMcclientCard() != null) {
                row.createCell(6).setCellValue(ap.getGivenMcclientCard());
            }
            if (ap.getNextVisitDate() != null) {
                row.createCell(7).setCellValue(ap.getNextVisitDate());
            }
            if (ap.getPrePexDevicePlaced() != null) {
                row.createCell(8).setCellValue(ap.getPrePexDevicePlaced());
            }
            if (ap.getPulse() != null) {
                row.createCell(9).setCellValue(ap.getPulse());
            }

        }
       // }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        //FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\vmmc.csv");
        FileOutputStream fileOut = new FileOutputStream("vmmc_post_procedure.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }
}
