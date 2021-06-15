/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.StiCsexposeinfant;
import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.services.ExposedInfantVistableImpl;
import com.vmmc.services.StiCsexposeinfantableImpl;
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
public class SyphilisExposed {

    private static String[] columns = {"ExposedInfantId", "InfantOpdnumber", "MotherOpdnumber", "CaseCriteria", "CaseDefination", "Examination", "NonTreponemalTestResult", "Notified", "Signs" ,"UmblicalOrPlacentaStatus"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        StiCsexposeinfantableImpl exp = new StiCsexposeinfantableImpl();
        List<StiCsexposeinfant> sticsexpos = exp.getAllStiCsexposeinfant();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("StiCExposedInfants");

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

        for (StiCsexposeinfant ap : sticsexpos) {

//            if (ap.getNextVisitDate() != null) {
//                SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
//                String NextVisitDate = f.format(ap.getNextVisitDate());
//                String TimeStamp = f.format(ap.getTheTimeStamp());
            Row row = sheet.createRow(rowNum++);
            if (ap.getInfantId() != null) {
                row.createCell(0).setCellValue(ap.getInfantId());
            }
            if (ap.getInfantOpdnumber() != null) {
                row.createCell(1).setCellValue(ap.getInfantOpdnumber());
            }

            if (ap.getMotherOpdnumber() != null) {
                row.createCell(2).setCellValue(ap.getMotherOpdnumber());
            }
            if (ap.getCaseCriteria() != null) {
                row.createCell(3).setCellValue(ap.getCaseCriteria());
            }
            if (ap.getCaseDefination() != null) {
                row.createCell(4).setCellValue(ap.getCaseDefination());
            }
            if (ap.getExamination() != null) {
                row.createCell(5).setCellValue(ap.getExamination());
            }

            if (ap.getNonTreponemalTestResult() != null) {
                row.createCell(6).setCellValue(ap.getNonTreponemalTestResult());
            }
            if (ap.getNotified() != null) {
                row.createCell(7).setCellValue(ap.getNotified());
            }
            if (ap.getSigns() != null) {
                row.createCell(8).setCellValue(ap.getSigns());
            }
            if (ap.getUmblicalOrPlacentaStatus() != null) {
                row.createCell(9).setCellValue(ap.getUmblicalOrPlacentaStatus());
            }
        }
        //}

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
       // FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\Sphilis_exposed_infant.csv");
        FileOutputStream fileOut = new FileOutputStream("Sphilis_exposed_infant.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
