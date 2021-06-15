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
import com.vmmc.services.PatientCensus;
import java.io.IOException;
import static java.util.Objects.isNull;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author System Devoloper
 */
public class MainDashboard extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

        int checkFacility = facility.checkFacility(province, district, facili);

        if (checkFacility > 0) {
            Facilities config = facility.getFacilityName(province, district, facili);

//        Cookie c1=new Cookie("facilityName",config.getFacilityName());
            PatientCensus census = new PatientCensus();

            int cbs = census.countCbsPatients();
            int hts = census.countHtsPatients();
            int art = census.countArtPatients();
            int patients = census.countRegisteredPatients();
            int women = census.countArtFemalePatients();
            int sti = census.countStiPatients();
            int expossed = census.countExpossedInfants();

            request.setAttribute("cbs", cbs);
            request.setAttribute("hts", hts);
            request.setAttribute("art", art);
            request.setAttribute("women", women);
            request.setAttribute("patients", patients);
            request.setAttribute("sti", sti);
            request.setAttribute("expossed", expossed);

            request.setAttribute("facilityName", config.getFacilityName());
            RequestDispatcher disp = request.getRequestDispatcher("demographic/MainDashboard.jsp");
            disp.forward(request, response);
        } else {
            response.sendRedirect("SetupFacility");
        }

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
