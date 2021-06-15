/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.sti;

import com.vmmc.entities.Sti;
import com.vmmc.services.StiTestableImpl;
import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author devoop
 */
@WebServlet(name = "StiAllExport", urlPatterns = {"/StiAllExport"})
public class StiAllExport extends HttpServlet {

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
            out.println("<title>Servlet StiAllExport</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StiAllExport at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("export/StiReport.jsp");
        rd.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String startDatef = request.getParameter("txtRptStartDate");
        String endDatef = request.getParameter("txtRptEndDate");
        Date startDate = null;
        Date endDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            startDate = sdf.parse(startDatef);
            endDate = sdf.parse(endDatef);
        } catch (ParseException ex) {
            Logger.getLogger(StiAllExport.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        StiTestableImpl app = new StiTestableImpl();
        java.util.List<Sti> sti = app.getAllStiSyndromic();
       // List<Sti> stiist = stiimp.getExportSti();//change to return all Vmmcs
       // List<Sti> epmtylist = new ArrayList();
        if (!sti.isEmpty()) {
            for (Sti currentApp : sti) {
                if (currentApp.getDateOfRegistration().compareTo(startDate) >= 0 && currentApp.getDateOfRegistration().compareTo(endDate) <= 0) {
                    sti.add(currentApp);
                }
            }
        }
        request.setAttribute("startDate", startDate);
        request.setAttribute("endDate", endDate);
        request.setAttribute("sti", sti);
        RequestDispatcher rd = request.getRequestDispatcher("export/StiExportExcel.jsp");
        rd.forward(request, response);

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
