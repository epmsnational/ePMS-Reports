
package com.vmmc.reportModels.ExportExcel.general;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import com.vmmc.entities.Cbs;
import com.vmmc.services.cbsablePatientImpl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
public class cbsPeads {
    
    
    private static String[] columns = {"Htc Number", "Opd Number", "DateFormCompleted", "NationalId", "Where Test Done","Address", "DistrictOfResidence", "InfantFeedingMode", "InfantProphlaxis6wks", "InfantProphlaxisBreastfeeding", "InfantTested6wks", "InfantTested9mnths", "IsBreadfeeding","IsDeceasedAtNotification" ,"IsDeceasedCauseOfDeath" ,"IsIycf" ,"MotherDiagnosedHiv","MotherDiagnosedHivwksDel" ,"MotherDiagnosedHivwksGest" ,"Religion" ,"RouteOfTransmission"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        cbsablePatientImpl app = new cbsablePatientImpl();
        List<Cbs> cbs = app.getAllPatients();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Cbs");

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

        for (Cbs ap : cbs) {

            if (ap.getDateFormCompleted() != null) {
                SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
                String DateFormCompleted = f.format(ap.getDateFormCompleted());
                //String DateTestedBefore = f.format(ap.getDateTestedBefore());
                Row row = sheet.createRow(rowNum++);

                row.createCell(0).setCellValue(ap.getHtcnumber());
                row.createCell(1).setCellValue(ap.getOpdnumber());
                row.createCell(2).setCellValue(DateFormCompleted);
                row.createCell(3).setCellValue(ap.getNationalId());
//                row.createCell(4).setCellValue(ap.getWhereTestDone());
                //row.createCell(5).setCellValue(ap.getBeenPrison());
                row.createCell(4).setCellValue(ap.getAddress());
                row.createCell(5).setCellValue(ap.getDistrictOfResidence());
                row.createCell(6).setCellValue(ap.getInfantFeedingMode());
//                row.createCell(8).setCellValue(ap.getInfantProphlaxis6wks());
//                row.createCell(9).setCellValue(ap.getInfantProphlaxisBreastfeeding());
//                row.createCell(10).setCellValue(ap.getInfantTested6wks());
//                row.createCell(11).setCellValue(ap.getInfantTested9mnths());
                row.createCell(7).setCellValue(ap.getIsBreadfeeding());
                //row.createCell(10).setCellValue(DateTestedBefore);
//                row.createCell(13).setCellValue(ap.getIsDeceasedAtNotification());
//                row.createCell(14).setCellValue(ap.getIsDeceasedCauseOfDeath());
//                row.createCell(15).setCellValue(ap.getIsIycf());
//                row.createCell(16).setCellValue(ap.getMotherDiagnosedHiv());
//                row.createCell(17).setCellValue(ap.getMotherDiagnosedHivwksDel());
//                row.createCell(18).setCellValue(ap.getMotherDiagnosedHivwksGest());
                row.createCell(8).setCellValue(ap.getReligion());
//                row.createCell(20).setCellValue(ap.getRouteOfTransmission());               
               // row.createCell(21).setCellValue(ap.getMotherDiagnosedHivwksGest());
            }
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
         FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\reports\\cbsPeads.csv");
        //FileOutputStream fileOut = new FileOutputStream("cbsPeads.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/reports");
    }

    
}
