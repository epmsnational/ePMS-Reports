/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exposedinfants.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.services.ExposedInfantableImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author mbanol
 */
public class ExposedInfantPatient extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ExposedInfantPatient</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ExposedInfantPatient at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        //request.setAttribute("patients",listClients);
        RequestDispatcher disp = request.getRequestDispatcher("exposeinfants/newExposedInfant.jsp");
        disp.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String motheroinumber = request.getParameter("txtMotherOINumber");
        String infantnum = request.getParameter("txtInfantNumber");
        String exposedinfantid = null;
        exposedinfantid = motheroinumber + "-" + "C0"+ infantnum;
        String registrationDate = request.getParameter("txtRegDate");
        //String motherName = request.getParameter("txtMotherName");

        // String motherSurname = request.getParameter("txtMotherSurname");
        String childName = request.getParameter("txtChildName");
        //// need to parse
        String ChildDob = request.getParameter("txtChildDob");
        /// need to parse
        String weight = request.getParameter("txtWeight");
        String gender = request.getParameter("txtGender");
        String placeOfDelivery = request.getParameter("txtPlaceOfDelivery");
        String modeOfdelivery = request.getParameter("txtModeOfdelivery");

        ////
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp regdate = null;
        Timestamp dateOfBirth = null;

        try {

            Date parseRegDate = formatter.parse(registrationDate + " 00:00:00");
            regdate = new java.sql.Timestamp(parseRegDate.getTime());
            Date parseDobDate = formatter.parse(ChildDob + " 00:00:00");
            dateOfBirth = new java.sql.Timestamp(parseDobDate.getTime());

        } catch (Exception pe) {
            pe.printStackTrace();
        }
        //
        ExposedInfantableImpl addExposed = new ExposedInfantableImpl();
        Tblexposedinfants expIn = new Tblexposedinfants();

        //expIn.setChildPatientId(exposedinfantid);
        expIn.setDateOfBirth(dateOfBirth);
        expIn.setExposedInfantId(exposedinfantid);
        expIn.setFullName(childName);
        expIn.setMotherPatientId(motheroinumber);
        expIn.setSex(gender);
        expIn.setPlaceOfDelivery(placeOfDelivery);
        expIn.setModeOfDelivery(modeOfdelivery);
        expIn.setRegistrationDate(regdate);

        addExposed.AddExposedInfant(expIn);
        
         session.setAttribute("cptdOIARTClient", expIn);
        //dispatch to dashboard
        response.sendRedirect("AllExposedInfants");
}

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
