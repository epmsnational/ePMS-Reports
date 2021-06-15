/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.VmmcVisits;
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
public class vmmcVisits {

    private static String[] columns = {"Vmmcid", "AnyAdverseEvent", "Counseled", "IfCounseledRiskPlan", "AdditionalVisitDate", "ResumedWeeks", "Aecode", "ResumedSexualActivity", "Severity", "StaffComment", "VisitDate","VisitInterval","WoundhealingComplete"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        VmmcVisitServiceImpl app = new VmmcVisitServiceImpl();
        List<VmmcVisits> vmmc = app.getAllVmmcVisits();

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

        for (VmmcVisits ap : vmmc) {

            //if (ap.getDateAppointmentGiven() != null) {
            //SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
            //String appGivenDate = f.format(ap.getDateAppointmentGiven());
            // String appDate = f.format(ap.getId().getDateOfAppointment());
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(ap.getVmmcid());
            if (ap.getAnyAdverseEvent() != null) {
                row.createCell(1).setCellValue(ap.getAnyAdverseEvent());
            }
            if (ap.getCounseled() != null) {
                row.createCell(2).setCellValue(ap.getCounseled());
            }
            if (ap.getIfCounseledRiskPlan() != null) {
                row.createCell(3).setCellValue(ap.getIfCounseledRiskPlan());
            }
            if (ap.getIfNoAdditionalVisitDate() != null) {
                row.createCell(4).setCellValue(ap.getIfNoAdditionalVisitDate());
            }
            if (ap.getIfResumedWeeks() != null) {
                row.createCell(5).setCellValue(ap.getIfResumedWeeks());
            }
            if (ap.getIfYesAecode() != null) {
                row.createCell(6).setCellValue(ap.getIfYesAecode());
            }
            if (ap.getResumedSexualActivity() != null) {
                row.createCell(7).setCellValue(ap.getResumedSexualActivity());
            }
            if (ap.getSeverity() != null) {
                row.createCell(8).setCellValue(ap.getSeverity());
            }
            if (ap.getStaffComment() != null) {
                row.createCell(9).setCellValue(ap.getStaffComment());
            }

            if (ap.getVisitDate() != null) {
                row.createCell(10).setCellValue(ap.getVisitDate());
            }

            if (ap.getVisitInterval() != null) {
                row.createCell(11).setCellValue(ap.getVisitInterval());
            }

            if (ap.getWoundhealingComplete() != null) {
                row.createCell(12).setCellValue(ap.getWoundhealingComplete());
            }
        }
       // }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\vmmc_visits.csv");
       // FileOutputStream fileOut = new FileOutputStream("vmmc_visits.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }
}
