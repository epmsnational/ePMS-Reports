
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.Tblbaselinetests;
import com.vmmc.entities.Tblmedication;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leon-mbano
 */
@WebServlet(name = "ARTPatientCard", urlPatterns = {"/ARTPatientCard"})
public class ARTPatientCard extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ARTPatientCard</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ARTPatientCard at " + request.getContextPath() + "</h1>");
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
        
        String[] temp = request.getQueryString().split("&");
        String artNo = temp[0];
        String opdNum = temp[1];
        CompletedARTClientAll cptdARTClient = new CompletedARTClientAll(artNo);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        PatientModel pm = new PatientModel();
        pm.setPatient(cgp.getP());
//
//        Patient artpatient = cptdARTClient.getPatient().size() > 0 ? cptdARTClient.getPatient().get(0) : null; //1.
//        pm.setPatient(artpatient);
        Tblvisits artvisit = cptdARTClient.getVisits().size() > 0 ? cptdARTClient.getVisits().get(0) : null; //1.
        pm.setOiartvisit(artvisit);
        Tblstatus artstatus = cptdARTClient.getStatus().size() > 0 ? cptdARTClient.getStatus().get(0) : null; //1.
        pm.setOiartstatus(artstatus);
        Tbltests arttest = cptdARTClient.getTests().size() > 0 ? cptdARTClient.getTests().get(0) : null; //1.
        pm.setOiartcurrenttests(arttest);
        Tblbaselinetests artbaselinetest = cptdARTClient.getBaselinetests().size() > 0 ? cptdARTClient.getBaselinetests().get(0) : null; //1.
        pm.setOiartbaselinetests(artbaselinetest);
        Tblmedication artmedication = cptdARTClient.getMedication().size() > 0 ? cptdARTClient.getMedication().get(0) : null; //1.
        pm.setOiartmedications(artmedication);
        Tblappointments artappointment = cptdARTClient.getAppointments().size() > 0 ? cptdARTClient.getAppointments().get(0) : null; //1.
        pm.setOiartappointments(artappointment);
             
        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("art/ArtPatientCard.jsp").forward(request, response);
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
