/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblappointments;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtAppointmentsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohcc-ATP
 */
@WebServlet(name = "ARTAppointments", urlPatterns = {"/ARTAppointments"})
public class ARTAppointments extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

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
        
        OIArtAppointmentsImpl app = new OIArtAppointmentsImpl();
        List<Tblappointments> applist = app.getUniqueAppointment();//change to return all Vmmcs
        Tblappointments currentApp= null;
        String[] array = applist.toArray(new String[applist.size()]);
        List<Tblappointments> epmtylist = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            String patId = array[i];
            List<Tblappointments> appslist = app.getAllAppointment(patId);
            if (!appslist.isEmpty()) {
                currentApp = appslist.get(0);
                epmtylist.add(currentApp);
                /////request.setAttribute("prevvis", prevvis);
            }
        }

        request.setAttribute("epmtylist", epmtylist);

        // 
        RequestDispatcher disp = request.getRequestDispatcher("art/artAllAppointments.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
