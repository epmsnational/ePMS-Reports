/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.general;

import com.vmmc.entities.Htc;
import com.vmmc.entities.HtcHivresult;
import com.vmmc.entities.Tblappointments;
import com.vmmc.services.HtcHivresultServiceImpl;
import com.vmmc.services.HtcTestableImpl;
import com.vmmc.services.OIArtAppointmentsImpl;
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
public class hts_1 {

    private static String[] columns = {"OPD Number", "Hts Number", "Date Of Registration", "HtModel", "Counselling Received", "Entry Point", "Result Type", "CoupleTo", "CurrentPregnancyLactation", "PostTestCounseled", "RecievedResult", "ReferredFromTypeId", "RefferedforService", "TestedBefore", "Test Kit", "Lot number", "Test date", "Test Category", "Is retest", "Test result", "Start time", "Reading time"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        HtcTestableImpl app = new HtcTestableImpl();
        List<Htc> hts = app.getAllHivPositives();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Hts");

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

        for (Htc ap : hts) {

            if (ap.getDateofRegistration() != null) {
                SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
                String DateOfReg = f.format(ap.getDateofRegistration());
                //String DateTestedBefore = f.format(ap.getDateTestedBefore());
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(ap.getOpdnumber());
                row.createCell(1).setCellValue(ap.getHtcnumber());
                row.createCell(2).setCellValue(DateOfReg);
                row.createCell(3).setCellValue(ap.getHtcmodelId());
                row.createCell(4).setCellValue(ap.getCounselingRecieved());
                row.createCell(5).setCellValue(ap.getEntryPointId());
                row.createCell(6).setCellValue(ap.getFinalResultType());
                row.createCell(7).setCellValue(ap.getCoupleTo());
                row.createCell(8).setCellValue(ap.getCurrentPregnancyLactation());
                row.createCell(9).setCellValue(ap.getPostTestCounseled());
                row.createCell(10).setCellValue(ap.getRecievedResult());
                row.createCell(11).setCellValue(ap.getReferredFromTypeId());
                row.createCell(12).setCellValue(ap.getRefferedforService());
                row.createCell(13).setCellValue(ap.getTestedBefore());
                //row.createCell(10).setCellValue(DateTestedBefore);
                HtcHivresultServiceImpl test = new HtcHivresultServiceImpl();
                List<HtcHivresult> res = test.getHivSingleTest(ap.getHtcnumber());

                if (res != null) {
                    if (!res.isEmpty()) {
                        if (res.size() > 1) {
                            String testkit = null;
                            String lotnumber = null;
                            String expdate = null;
                            String testcate = null;
                            String isretest = null;
                            String result = null;
                            String starttime = null;
                            String readtime = null;
                            for (HtcHivresult r : res) {

                                testkit +="#" + r.getTestKit();
                                lotnumber += "#" + r.getLotNumber();
                                expdate += "#" + r.getExpireDate();
                                testcate += "#" + r.getTestCategory();
                                isretest += "#" + r.getIsRetest();
                                result += "#" + r.getResult();
                                starttime += "#" + r.getStarttime();
                                readtime += "#" + r.getReadingtime();

                            }
                            //if (r.getTestKit() != null) {
                            row.createCell(14).setCellValue(testkit);
                            //}
                            //if (r.getLotNumber() != null) {
                            row.createCell(15).setCellValue(lotnumber);
                            //}
                            // if (r.getExpireDate() != null) {
                            row.createCell(16).setCellValue(expdate);
                            // }
                            //if (r.getTestCategory() != null) {
                            row.createCell(17).setCellValue(testcate);
                            //}
                            // if (r.getIsRetest() != null) {
                            row.createCell(18).setCellValue(isretest);
                            // }
                            //if (r.getResult() != null) {
                            row.createCell(19).setCellValue(result);
                            // }
                            //if (r.getStarttime() != null) {
                            row.createCell(20).setCellValue(starttime);
                           // }
                            // if (r.getReadingtime() != null) {
                            row.createCell(21).setCellValue(readtime);
                        } else {

                            for (HtcHivresult r : res) {
                                if (r.getTestKit() != null) {
                                    row.createCell(14).setCellValue(r.getTestKit());
                                }
                                if (r.getLotNumber() != null) {
                                    row.createCell(15).setCellValue(r.getLotNumber());
                                }
                                if (r.getExpireDate() != null) {
                                    row.createCell(16).setCellValue(r.getExpireDate());
                                }
                                if (r.getTestCategory() != null) {
                                    row.createCell(17).setCellValue(r.getTestCategory());
                                }
                                if (r.getIsRetest() != null) {
                                    row.createCell(18).setCellValue(r.getIsRetest());
                                }
                                if (r.getResult() != null) {
                                    row.createCell(19).setCellValue(r.getResult());
                                }
                                if (r.getStarttime() != null) {
                                    row.createCell(20).setCellValue(r.getStarttime());
                                }
                                if (r.getReadingtime() != null) {
                                    row.createCell(21).setCellValue(r.getReadingtime());
                                }

                            }
                        }
                    }
                }


            }
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\hts.csv");
        // FileOutputStream fileOut = new FileOutputStream("hts.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

}
