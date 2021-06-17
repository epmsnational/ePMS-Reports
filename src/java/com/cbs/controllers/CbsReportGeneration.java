/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbs.controllers;

import com.reports.controllers.FileSave;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ignatious
 */
public class CbsReportGeneration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CbsReportGeneration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CbsReportGeneration at " + request.getContextPath() + "</h1>");
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
        FileSave save = new FileSave();
        
//        String pdfFileName = save.getFilename();
//        String contextPath = getServletContext().getRealPath(File.separator);
//        File pdfFile = new File(contextPath + pdfFileName);

        response.setContentType("application/pdf");
        response.addHeader("Content-Disposition", "inline; filename=" + "zimepms.pdf");
//        response.setContentLength((int) pdfFile.length());
//
//        FileInputStream fileInputStream = new FileInputStream(pdfFile);
//        OutputStream responseOutputStream = response.getOutputStream();
//        int bytes;
//        while ((bytes = fileInputStream.read()) != -1) {
//            responseOutputStream.write(bytes);
        
//        }
        String relativeWebPath = "/home/ignatious/Downloads/Documents/zimepms.pdf";
        String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
        
        request.setAttribute("file", relativeWebPath);
        request.getRequestDispatcher("reporsFilteringtJsps/reportViewerC.jsp").forward(request, response);
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
        processRequest(request, response);
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
