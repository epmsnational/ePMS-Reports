/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.controllers.csNotification;


import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.StiCsexposeinfant;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.StiCsexposeinfantableImpl;
import com.vmmc.services.cbsablePatientImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lmbano
 */
public class STIcSExposedInfant extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet STIcSExposedInfant</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet STIcSExposedInfant at " + request.getContextPath() + "</h1>");
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
        
        Patient p = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p = tempClient == null ? (Patient) session.getAttribute("patient") : new cbsablePatientImpl().getPatient(tempClient);

        float age = 0;
//String infantId = StiCsexposeinfantableImpl.infantId.get(StiCsexposeinfant.class);
        Calendar cal2 = Calendar.getInstance();
       // Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        p.setAge(age);
        String StiId = p.getOpdnumber();
        session.setAttribute("patient", p);
       session.setAttribute("StiId", StiId);

        RequestDispatcher disp = request.getRequestDispatcher("stics/SyphilisExposedInfant.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String OPDNumber = request.getParameter("txtOPDNumber");
        String InfantNumber = request.getParameter("txtInfantNumber");
        String MotherOPDNumber = request.getParameter("txtMotherOPDNumber");
        String UmbilicalCordTests = request.getParameter("txtUmbilicalCordTests");
        String PlacentaTests = request.getParameter("txtPlacentaTests");
        String NonTreponemaltest = request.getParameter("txtNonTreponemaltest");
        String FinalOutcome = request.getParameter("txtFinalOutcome");

        StiCsexposeinfantableImpl ip = new StiCsexposeinfantableImpl();
        StiCsexposeinfant expoin = new StiCsexposeinfant();
        expoin.setExamination(FinalOutcome);
        expoin.setInfantId(InfantNumber);
        expoin.setInfantOpdnumber(InfantNumber);
        expoin.setMotherOpdnumber(MotherOPDNumber);
        expoin.setNonTreponemalTestResult(NonTreponemaltest);
//        expoin.setNotified(OPDNumber);
        expoin.setSigns(OPDNumber);
        expoin.setUmblicalOrPlacentaStatus(UmbilicalCordTests);
        expoin.setCaseCriteria(PlacentaTests);
        expoin.setCaseDefination(PlacentaTests);

        ip.AddStiCsexposeinfant(expoin);
        
         response.sendRedirect("AllCSExposedInfants");
         //AllSTICs
         //

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
