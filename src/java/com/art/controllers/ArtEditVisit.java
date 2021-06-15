/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Patient;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.OIArtVisitableImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ignatious
 */
public class ArtEditVisit extends HttpServlet {

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
            out.println("<title>Servlet ArtEditVisit</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArtEditVisit at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        String patientid = request.getParameter("txtpatientid");
        String visitdate = request.getParameter("txtvisitdate");
        String whostage = request.getParameter("txtwhostage");
        String oldartregimen = request.getParameter("txtoldarvcode");
        String newartregimen = request.getParameter("txtnewarvcode");
        String arvreasoncode = request.getParameter("txtarvreason");
        String arvstatuscode = request.getParameter("txtarvstatus");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp oivisitdate = null;
        try {

            Date parsedVisitDate = formatter.parse(visitdate);
            oivisitdate = new java.sql.Timestamp(parsedVisitDate.getTime());

        } catch (Exception pw) {
            pw.printStackTrace();
        }

        int artregimen1 = Integer.parseInt(oldartregimen);
        int artregimen2 = Integer.parseInt(newartregimen);
        int arvreason = Integer.parseInt(arvreasoncode);
        int arvstatus = Integer.parseInt(arvstatuscode);
        int who = Integer.parseInt(whostage);

        int regimen = 0;
        if (artregimen2 > 0) {
            regimen = artregimen2;
        } else {
            regimen = artregimen1;
        }
        OIArtVisitableImpl ps = new OIArtVisitableImpl();
        int a = ps.updateVisit(patientid, oivisitdate, who, regimen, arvstatus, arvreason);
        
        if(a > 0){
            CompletedARTClientAll client = new CompletedARTClientAll(patientid);
            CircumcisablePatientImpl OIARTpp = new CircumcisablePatientImpl();
            client.getVisits();
            Patient pp = OIARTpp.getOIArtPatient(patientid);
            client.setP(pp);
            
            request.getSession().setAttribute("client", client);
            RequestDispatcher disp  = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
            disp.forward(request, response);
        }
        else{
          response.sendRedirect("AllOIARTServ");  
        }
        //response.sendRedirect("AllOIARTServ");
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
