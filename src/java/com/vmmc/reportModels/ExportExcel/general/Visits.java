/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblvisits;
import com.vmmc.services.OIArtVisitableImpl;
import com.vmmc.services.OIArtiableImpl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 * @author lmbano
 */
public class Visits {

    private static String[] columns = {"PatientId", "Visit Date", "Visit Type", "DSD Model", "WHO Stagging", "ARV Reason", "ARV Status", "Adverse event", "ARVCOde", "Date of First ANC", "Dispencer ID", "Family planninning ID", "Functional Status", "IPT Reasons", "IPT status", "IPT Legibility", "LNMP Date", "Notes", "Pregnant status", "TB Investigations", "TB Status", "Timestamp", "User Number", "DOB", "Date of enrolment into care", "Sex", "Name"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException,
            ParseException {
        OIArtVisitableImpl visit = new OIArtVisitableImpl();
        List<Tblvisits> vis = visit.getVisit();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("visits");

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
        SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");

        for (Tblvisits v : vis) {
            Date startdate = f.parse("2016-01-10");
            Date enddate = f.parse("2016-01-20");
            Date visd = v.getId().getVisitDate();

            if (visd.before(enddate) == true && (visd.before(startdate) == false)) {
//                
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(v.getId().getPatientId());
                row.createCell(1).setCellValue(v.getId().getVisitDate());
                if (v.getVisitType() != null) {
                    row.createCell(2).setCellValue(v.getVisitType());
                }
                if (v.getVisitTypeCode() != null) {
                    row.createCell(3).setCellValue(v.getVisitTypeCode());
                }
                if (v.getWhostage() != null) {
                    row.createCell(4).setCellValue(v.getWhostage());
                }
                if (v.getArvreasonCode() != null) {
                    row.createCell(5).setCellValue(v.getArvreasonCode());
                }
                if (v.getArvstatusCode() != null) {
                    row.createCell(6).setCellValue(v.getArvstatusCode());
                }
                if (v.getAdverseEventsStatusCode() != null) {
                    row.createCell(7).setCellValue(v.getAdverseEventsStatusCode());
                }
                if (v.getArvcode() != null) {
                    row.createCell(8).setCellValue(v.getArvcode());
                }
                if (v.getDateOfFirstAnc() != null) {
                    row.createCell(9).setCellValue(v.getDateOfFirstAnc());
                }

                if (v.getDispenserId() != null) {
                    row.createCell(10).setCellValue(v.getDispenserId());
                }
                if (v.getFamilyPlanningId() != null) {
                    row.createCell(11).setCellValue(v.getFamilyPlanningId());
                }
                if (v.getFunctionalStatusCode() != null) {
                    row.createCell(12).setCellValue(v.getFunctionalStatusCode());
                }
                if (v.getIptreasonCode() != null) {
                    row.createCell(13).setCellValue(v.getIptreasonCode());
                }
                if (v.getIptstatusCode() != null) {
                    row.createCell(14).setCellValue(v.getIptstatusCode());
                }
                if (v.getIsIpteligibility() != null) {
                    row.createCell(15).setCellValue(v.getIsIpteligibility());
                }

                if (v.getLnmpdate() != null) {
                    row.createCell(16).setCellValue(v.getLnmpdate());
                }
                if (v.getNotes() != null) {
                    row.createCell(17).setCellValue(v.getNotes());
                }
                if (v.getNowPregnant() != null) {
                    row.createCell(18).setCellValue(v.getNowPregnant());
                }
                if (v.getTbinvestigationResults() != null) {
                    row.createCell(19).setCellValue(v.getTbinvestigationResults());
                }
                if (v.getTbstatusCode() != null) {
                    row.createCell(20).setCellValue(v.getTbstatusCode());
                }

                if (v.getTheTimeStamp() != null) {
                    row.createCell(21).setCellValue(v.getTheTimeStamp());

                }
                if (v.getUserNumber() != null) {
                    row.createCell(22).setCellValue(v.getUserNumber());
                }
//String visitdate = f.format(v.getId().getVisitDate());

//                if (v.getLnmpdate() != null) {
//                    String lnmpdate = f.format(v.getLnmpdate());
//
//                    row.createCell(16).setCellValue(lnmpdate);
//                }
//
//                if (v.getTheTimeStamp() != null) {
//                    String timestampdate = f.format(v.getTheTimeStamp());
//                    row.createCell(21).setCellValue(timestampdate);
//                }
                // patient.getDateOfBirth()
                //patient.getDateOfEnrolment()
                OIArtiableImpl pat = new OIArtiableImpl();

                Tblpatients patient = pat.getPatient(v.getId().getPatientId());

                ////// Patient details
                if (patient.getDateOfBirth() != null) {
                    //String dob = f.format(patient.getDateOfBirth());
                    row.createCell(23).setCellValue(patient.getDateOfBirth());
                }
                if (patient.getDateOfEnrolment() != null) {
                    // String dateOfEnrolment = f.format(patient.getDateOfEnrolment());
                    row.createCell(24).setCellValue(patient.getDateOfEnrolment());
                }
                if (patient.getSex() != null) {
                    row.createCell(25).setCellValue(patient.getSex());
                }
                if (patient.getFirstName() != null) {

                    row.createCell(26).setCellValue(patient.getFirstName());
                }
            }
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\visits.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
