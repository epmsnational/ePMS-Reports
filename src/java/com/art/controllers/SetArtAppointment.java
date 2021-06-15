/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.TblappointmentsId;
import com.vmmc.entities.Tblpatients;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtAppointmentsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chihw
 */
public class SetArtAppointment extends HttpServlet {

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
            out.println("<title>Servlet SetArtAppointment</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SetArtAppointment at " + request.getContextPath() + "</h1>");
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
        Facilities config = facility.getFacilityName(province,district,facili);
        request.setAttribute("facilityName",config.getFacilityName());
        
        String oinumber = request.getQueryString().replace("%", " ");
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();
        
        Patient patient = pat.getOIArtPatient(oinumber);
        request.setAttribute("patient", patient);
        
        request.getRequestDispatcher("art/SetArtAppointment.jsp").forward(request, response);
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
        String oinumber = request.getParameter("txtARTNum");
        String appointmentDateMade = request.getParameter("txtDateMade");
        String appointmentDateGiven = request.getParameter("txtDateGiven");
        String notes = request.getParameter("notes");
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp made = null;
        Timestamp given = null;
        
        try {

            Date parsedappointmentDateMade = formatter.parse(appointmentDateMade + " 00:00:00");
            made = new java.sql.Timestamp(parsedappointmentDateMade.getTime());
            
            Date parsedappointmentDateGiven = formatter.parse(appointmentDateGiven + " 00:00:00");
            given = new java.sql.Timestamp(parsedappointmentDateGiven.getTime());
        }
        catch (Exception pw) {
            pw.printStackTrace();
        }
        
        Tblappointments appoint = new Tblappointments();
        TblappointmentsId id = new TblappointmentsId();
        
        id.setPatientId(oinumber);
        id.setDateOfAppointment(made);
        
        appoint.setDateAppointmentGiven(given);
        appoint.setCancelled(0);
        appoint.setId(id);
        
        OIArtAppointmentsImpl saveAppoint = new OIArtAppointmentsImpl();
        saveAppoint.AddArtAppointment(appoint);
        
        response.sendRedirect("AllOIARTServ");
        
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
