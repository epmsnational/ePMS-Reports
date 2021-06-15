/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chihw
 */
public class SystemBackup extends HttpServlet {

    int status = 0;
    String messege = "";
    String folderPath = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SystemBackup</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SystemBackup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();

        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province, district, facili);
        request.setAttribute("facilityName", config.getFacilityName());

        RequestDispatcher disp = request.getRequestDispatcher("systemBackup/systemBackup.jsp");
        disp.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();

        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province, district, facili);
        request.setAttribute("facilityName", config.getFacilityName());

        String password = request.getParameter("txtPassword");

        if (Backup(password, config.getFacilityName()) == 1) {
            String display = "Your Backup has been saved at :" + folderPath;

            request.setAttribute("Message", display);
            RequestDispatcher disp = request.getRequestDispatcher("systemBackup/systemBackupComplete.jsp");
            disp.forward(request, response);
        } else {
            request.setAttribute("Message", messege);
            RequestDispatcher disp = request.getRequestDispatcher("systemBackup/systemBackupError.jsp");
            disp.forward(request, response);
        }

    }

    private int Backup(String password, String siteName) {
        String dbname = "zimepms";
        String uname = "root";

        String os = System.getProperty("os.name").toLowerCase();

        Process runtimeProcess = null;

        if (os.contains("win")) {
        folderPath = "C:\\EPMS\\backup";
        File f1 = new File(folderPath);
        if (!f1.exists()) {
            try {
                Files.createDirectories(Paths.get(folderPath)); // create folder if not exist
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        String timeNow = new SimpleDateFormat("dd-MM-YYYY").format(Calendar.getInstance().getTime());
        String saveFileName = siteName.replaceAll("\\s+", "") + timeNow + ".sql";
        String savePath = folderPath + File.separator + saveFileName;
            try {
                //for Windows
                String executeCmd = String.format("\"C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\mysqldump.exe\" -u%s -p%s %s > %s", uname, password, dbname, savePath);
                runtimeProcess = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", executeCmd});

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (os.contains("linux")) {
            String home = System.getProperty("user.home");
        folderPath = home+"/Downloads/Backups/"; // Modify
        File f1 = new File(folderPath);
        if (!f1.exists()) {
            try {
                Files.createDirectories(Paths.get(folderPath)); // create folder if not exist
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        String timeNow = new SimpleDateFormat("dd-MM-YYYY").format(Calendar.getInstance().getTime());
        String saveFileName = siteName.replaceAll("\\s+", "") + timeNow + ".sql";
        String savePath = folderPath + File.separator + saveFileName;
            try {
                //for Unix
                String dump = String.format("mysqldump -u%s -p%s %s > %s", uname, password, dbname, savePath);
                runtimeProcess = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", dump});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            if (runtimeProcess.waitFor() == 0) {
                InputStream inputStream = runtimeProcess.getInputStream();
                byte[] buffer = new byte[inputStream.available()];
                inputStream.read(buffer);

                String str = new String(buffer);
                messege = str;
                System.out.println(str);
                status = 1;
            } else {
                InputStream errorStream = runtimeProcess.getErrorStream();
                byte[] buffer = new byte[errorStream.available()];
                errorStream.read(buffer);

                String str = new String(buffer);
                messege = str;
                System.out.println(str);
                status = 0;
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

        return status;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
