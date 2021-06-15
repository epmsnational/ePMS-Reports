
package com.vmmc.reportModels.ExportExcel.general;

import com.vmmc.entities.Tblappointments;
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
 * @author lmbano
 */
public class Appointments {

    private static String[] columns = {"PatientId","Date Appointment given",  "Date Of Appointment"};

    public static void main(String[] args) throws IOException,
            InvalidFormatException {
        OIArtAppointmentsImpl app = new OIArtAppointmentsImpl();
        List<Tblappointments> appointments = app.getAppointment();

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

        for (Tblappointments ap : appointments) {
            
            if (ap.getDateAppointmentGiven() != null) {
                SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
                String appGivenDate = f.format(ap.getDateAppointmentGiven());
                String appDate = f.format(ap.getId().getDateOfAppointment()); 
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(ap.getId().getPatientId());
                row.createCell(1).setCellValue(appGivenDate);
                row.createCell(2).setCellValue(appDate);
            }
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\ePMS\\exports\\appointments.csv");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("You have successfuly exported to parth C/ePMS/exports");
    }

}
