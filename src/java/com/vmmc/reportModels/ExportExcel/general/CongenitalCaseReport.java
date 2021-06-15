/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.vmmc.entities.StiCs;
import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.services.ExposedInfantVistableImpl;
import com.vmmc.services.StiCSableImpl;
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
public class CongenitalCaseReport {

    private static String[] columns = {"DateofReport", "BirthWeight", "Stinumber", "Csclassification", "CsfproteinCsfwb", "Csfvdrl", "DarkiedExam", "DateOfDeath", "DateOfDelivery", "DateOfNonTreponemalTest", "DateOfNonTreponemalTestMotherRecenFirst", "DateOfNonTreponemalTestMotherRecent","DateOfPositiveTreponemalTestFirst","DateOfPositiveTreponemalTestRecent","DateReceivingBenzathinePenicillin","FirstPrenatalVisit","GestationalAge","InfantCongenitalSyphilistreatment","IsNonTreponemalTestDelivery","IsNonTreponemalTestFirstVisit","IsNonTreponemalTestWeeksGest","LmpbeforeDelivery","MotherHivstatusDuriPreg","MotherId","MotherSyphilisTreatment","MothersAddress","MothersMaritalStatus","MothersObsHistoryGravida","MothersObsHistoryParity","MothersReligion","NonTreponemaltest","Opdnumber","PeriodReceivingBenzathinePenicillin","ReportingFacility","ResultOfNonTreponemalTestMotherFirst","TiterOfNonTreponemalTestMotherRecent","SignsOfCongenitalSyphilis","BoneXray","TiterOfNonTreponemalTest","TiterOfNonTreponemalTestMotherFirst","TreponemaltestDone","TrimesterFirstPrenatalVisit","VitalStatus"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        StiCSableImpl exp = new StiCSableImpl();
        List<StiCs> cs = exp.getAllCongenitalSyph();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("CongenitalSyphilisCase");

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

        for (StiCs ap : cs) {

            if (ap.getDateofReport() != null) {
                SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
                //String DateofReport = f.format(ap.getDateofReport());
                //String DateOfDeath = f.format(ap.getDateOfDeath());
                //String DateOfDelivery = f.format(ap.getDateOfDelivery());
               // String DateOfNonTreponemalTest = f.format(ap.getDateOfNonTreponemalTest());
                //String DateOfNonTreponemalTestMotherRecenFirst = f.format(ap.getDateOfNonTreponemalTestMotherRecenFirst());
              // String DateOfNonTreponemalTestMotherRecent = f.format(ap.getDateOfNonTreponemalTestMotherRecent());
              // String DateOfPositiveTreponemalTestFirst = f.format(ap.getDateOfPositiveTreponemalTestFirst());         
              // String DateOfPositiveTreponemalTestRecent = f.format(ap.getDateOfPositiveTreponemalTestRecent());
             
               //String DateReceivingBenzathinePenicillin = f.format(ap.getDateReceivingBenzathinePenicillin());
             // String FirstPrenatalVisit = f.format(ap.getFirstPrenatalVisit());
             //String LmpbeforeDelivery = f.format(ap.getLmpbeforeDelivery());
             
              
                Row row = sheet.createRow(rowNum++);

                if (ap.getDateofReport() != null) {
                    row.createCell(0).setCellValue(ap.getDateofReport());
                }
                if (ap.getBirthWeight() != null) {
                    row.createCell(1).setCellValue(ap.getBirthWeight());
                }
                if (ap.getStinumber() != null) {
                    row.createCell(2).setCellValue(ap.getStinumber());
                }
                if (ap.getCsclassification() != null) {
                    row.createCell(3).setCellValue(ap.getCsclassification());
                }
                if (ap.getCsfproteinCsfwb() != null) {
                    row.createCell(4).setCellValue(ap.getCsfproteinCsfwb());
                }

                if (ap.getCsfvdrl() != null) {
                    row.createCell(5).setCellValue(ap.getCsfvdrl());
                }
                if (ap.getDarkiedExam() != null) {
                    row.createCell(6).setCellValue(ap.getDarkiedExam());
                }
                if (ap.getDateOfDeath() != null) {
                    row.createCell(7).setCellValue(ap.getDateOfDeath());
                }
                if (ap.getDateOfDelivery() != null) {
                    row.createCell(8).setCellValue(ap.getDateOfDelivery());
                }
                if (ap.getDateOfNonTreponemalTest() != null) {
                    row.createCell(9).setCellValue(ap.getDateOfNonTreponemalTest());
                }

                if (ap.getDateOfNonTreponemalTestMotherRecenFirst() != null) {
                    row.createCell(10).setCellValue(ap.getDateOfNonTreponemalTestMotherRecenFirst());
                }

                if (ap.getDateOfNonTreponemalTestMotherRecent() != null) {
                    row.createCell(11).setCellValue(ap.getDateOfNonTreponemalTestMotherRecent());
                }
                if (ap.getDateOfPositiveTreponemalTestFirst() != null) {
                    row.createCell(12).setCellValue(ap.getDateOfPositiveTreponemalTestFirst());
                }
                if (ap.getDateOfPositiveTreponemalTestRecent() != null) {
                    row.createCell(13).setCellValue(ap.getDateOfPositiveTreponemalTestRecent());
                }
                if (ap.getDateReceivingBenzathinePenicillin() != null) {
                    row.createCell(14).setCellValue(ap.getDateReceivingBenzathinePenicillin());
                }
                if (ap.getFirstPrenatalVisit() != null) {
                    row.createCell(15).setCellValue(ap.getFirstPrenatalVisit());
                }
                if (ap.getGestationalAge() != null) {
                    row.createCell(16).setCellValue(ap.getGestationalAge());
                }
                if (ap.getInfantCongenitalSyphilistreatment() != null) {
                    row.createCell(17).setCellValue(ap.getInfantCongenitalSyphilistreatment());
                }
                if (ap.getIsNonTreponemalTestDelivery() != null) {
                    row.createCell(18).setCellValue(ap.getIsNonTreponemalTestDelivery());
                }
                if (ap.getIsNonTreponemalTestFirstVisit() != null) {
                    row.createCell(19).setCellValue(ap.getIsNonTreponemalTestFirstVisit());
                }
                if (ap.getIsNonTreponemalTestWeeksGest() != null) {
                    row.createCell(20).setCellValue(ap.getIsNonTreponemalTestWeeksGest());
                }
                if (ap.getLmpbeforeDelivery() != null) {
                    row.createCell(21).setCellValue(ap.getLmpbeforeDelivery());
                }
                if (ap.getMotherHivstatusDuriPreg() != null) {
                    row.createCell(22).setCellValue(ap.getMotherHivstatusDuriPreg());
                }
                if (ap.getMotherId() != null) {
                    row.createCell(23).setCellValue(ap.getMotherId());
                }
                if (ap.getMotherSyphilisTreatment() != null) {
                    row.createCell(24).setCellValue(ap.getMotherSyphilisTreatment());
                }
                if (ap.getMothersAddress() != null) {
                    row.createCell(25).setCellValue(ap.getMothersAddress());
                }
                if (ap.getMothersMaritalStatus() != null) {
                    row.createCell(26).setCellValue(ap.getMothersMaritalStatus());
                }
                if (ap.getMothersObsHistoryGravida() != null) {
                    row.createCell(27).setCellValue(ap.getMothersObsHistoryGravida());
                }
                if (ap.getMothersObsHistoryParity() != null) {
                    row.createCell(28).setCellValue(ap.getMothersObsHistoryParity());
                }
                if (ap.getMothersReligion() != null) {
                    row.createCell(29).setCellValue(ap.getMothersReligion());
                }

                if (ap.getNonTreponemaltest() != null) {
                    row.createCell(30).setCellValue(ap.getNonTreponemaltest());
                }
                if (ap.getOpdnumber() != null) {
                    row.createCell(31).setCellValue(ap.getOpdnumber());
                }
                if (ap.getPeriodReceivingBenzathinePenicillin() != null) {
                    row.createCell(32).setCellValue(ap.getPeriodReceivingBenzathinePenicillin());
                }
                if (ap.getReportingFacility() != null) {
                    row.createCell(33).setCellValue(ap.getReportingFacility());
                }

                if (ap.getResultOfNonTreponemalTestMotherFirst() != null) {
                    row.createCell(34).setCellValue(ap.getResultOfNonTreponemalTestMotherFirst());
                   
                }
                if (ap.getTiterOfNonTreponemalTestMotherRecent() != null) {
                    row.createCell(35).setCellValue(ap.getTiterOfNonTreponemalTestMotherRecent());
                }
                if (ap.getSignsOfCongenitalSyphilis() != null) {
                    row.createCell(36).setCellValue(ap.getSignsOfCongenitalSyphilis());
                }
                if (ap.getBoneXray() != null) {
                    row.createCell(37).setCellValue(ap.getBoneXray());
                }

                if (ap.getTiterOfNonTreponemalTest() != null) {
                    row.createCell(38).setCellValue(ap.getTiterOfNonTreponemalTest());
                }
                if (ap.getTiterOfNonTreponemalTestMotherFirst() != null) {
                    row.createCell(39).setCellValue(ap.getTiterOfNonTreponemalTestMotherFirst());
                }
//                if (ap.getTiterOfNonTreponemalTestMotherRecent() != null) {
//                    row.createCell(40).setCellValue(ap.getTiterOfNonTreponemalTestMotherRecent());
//                }
                if (ap.getTreponemaltestDone() != null) {
                    row.createCell(40).setCellValue(ap.getTreponemaltestDone());
                }

                if (ap.getTrimesterFirstPrenatalVisit() != null) {
                    row.createCell(41).setCellValue(ap.getTrimesterFirstPrenatalVisit());
                }
                if (ap.getVitalStatus() != null) {
                    row.createCell(42).setCellValue(ap.getVitalStatus());
                }

            }
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        //FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\congenital_syphilis_case.csv");
        FileOutputStream fileOut = new FileOutputStream("congenital_syphilis_case.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
