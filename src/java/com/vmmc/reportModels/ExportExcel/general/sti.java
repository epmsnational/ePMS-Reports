/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.vmmc.entities.Sti;
import com.vmmc.services.StiTestableImpl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Training3
 */
public class sti {

    private static String[] columns = { "Sti Number", "Opd Number","Date Of Registration",  "Entry point","Episode","AncSyphTreatedBefore" ,"AncSyphilisResult" ,"AncSyphilisTestResults","AncSyphilisTreated","AncSyphillisTreatment","AncTestedDuringPregnancy","AncTestedForSyphilis","Complaints","CondomInformationGiven","CondomsIssued","DeliveryOutcome","Examinations","HivTestResult","HivtestedBefore","HivtestedBeforeResult","AncSyphTestedBeforeResult","PurposeOfSyphilisTesting","ScreenedForSyphilis","SexualHistory","StiContactSlipIssued","StiContactSlipReceived","StiInfectionType","Stisyndrome","SyphilisResult","SyphilisTestResult","SyphilisTreated","TestedForHiv","TestedForSyphilis","Treatment"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        StiTestableImpl app = new StiTestableImpl();
        List<Sti> sti = app.getAllStiSyndromic();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sti");

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

        for (Sti ap : sti) {

            if (ap.getDateOfRegistration() != null) {
                SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
                String DateOfRegistration = f.format(ap.getDateOfRegistration());
                //String appDate = f.format(ap.getId().getDateOfAppointment()); 
                Row row = sheet.createRow(rowNum++);

                row.createCell(0).setCellValue(ap.getStinumber());
                row.createCell(1).setCellValue(ap.getOpdnumber());
                row.createCell(2).setCellValue(DateOfRegistration);
                row.createCell(3).setCellValue(ap.getEntryPoint());
                row.createCell(4).setCellValue(ap.getEpisode());
                row.createCell(5).setCellValue(ap.getAncSyphTreatedBefore());
                row.createCell(6).setCellValue(ap.getAncSyphilisResult());
                row.createCell(7).setCellValue(ap.getAncSyphilisTestResults());
                row.createCell(8).setCellValue(ap.getAncSyphilisTreated());
                row.createCell(9).setCellValue(ap.getAncSyphillisTreatment());
                row.createCell(10).setCellValue(ap.getAncTestedDuringPregnancy());
                row.createCell(11).setCellValue(ap.getAncTestedForSyphilis());
                row.createCell(12).setCellValue(ap.getComplaints());
                row.createCell(13).setCellValue(ap.getCondomInformationGiven());
                row.createCell(14).setCellValue(ap.getCondomsIssued());
                row.createCell(15).setCellValue(ap.getDeliveryOutcome());
                row.createCell(16).setCellValue(ap.getExaminations());
                row.createCell(17).setCellValue(ap.getHivTestResult());
                row.createCell(18).setCellValue(ap.getHivtestedBefore());
                //row.createCell(19).setCellValue(ap.getHivtestedBefore());
                row.createCell(19).setCellValue(ap.getHivtestedBeforeResult());
                row.createCell(20).setCellValue(ap.getAncSyphTestedBeforeResult());
                // row.createCell(21).setCellValue(ap.getOpdnumber());
                row.createCell(21).setCellValue(ap.getPurposeOfSyphilisTesting());
                row.createCell(22).setCellValue(ap.getScreenedForSyphilis());
                row.createCell(23).setCellValue(ap.getSexualHistory());
                row.createCell(24).setCellValue(ap.getStiContactSlipIssued());
                row.createCell(25).setCellValue(ap.getStiContactSlipReceived());
                row.createCell(26).setCellValue(ap.getStiInfectionType());
                row.createCell(27).setCellValue(ap.getStisyndrome());
                row.createCell(28).setCellValue(ap.getSyphilisResult());
                row.createCell(29).setCellValue(ap.getSyphilisTestResult());
                row.createCell(30).setCellValue(ap.getSyphilisTreated());
                row.createCell(31).setCellValue(ap.getTestedForHiv());
                row.createCell(32).setCellValue(ap.getTestedForSyphilis());
                row.createCell(33).setCellValue(ap.getTreatment());
            }
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        //FileOutputStream fileOut = new FileOutputStream("sti.csv");
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\sti.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
