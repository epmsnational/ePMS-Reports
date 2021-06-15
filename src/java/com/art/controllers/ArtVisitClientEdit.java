/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tblsetuparvfixeddosecombinations;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.Tblvisits;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtSetupArtRegimensImpl;
import com.vmmc.services.OIArtVisitableImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ignatious
 */
public class ArtVisitClientEdit extends HttpServlet {

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
            out.println("<title>Servlet ArtVisitClientEdit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArtVisitClientEdit at " + request.getContextPath() + "</h1>");
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
        
        SetupServiceImpl setup = new SetupServiceImpl();
        
        List<Tblsetuparvfixeddosecombinations> arvfixeddosecombinationslist = setup.getOIARVRegimenCombinations();
        
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();
        
        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province,district,facili);
        request.setAttribute("facilityName",config.getFacilityName());

        String patientString = request.getQueryString().replace("%", " ");
        String[] arr = patientString.split("&");
        String visdate = arr[0];
        String patientId = arr[1];

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date visitdate = null;
        try {
            visitdate = sdf.parse(visdate);
        } catch (ParseException ex) {
            Logger.getLogger(ArtVisitClientEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        String opdNum = request.getQueryString();
        if (opdNum == null) {
            opdNum = (String) request.getAttribute("opdNum");
        }

        CompletedARTClientAll client = new CompletedARTClientAll(patientId, visitdate);
        OIArtVisitableImpl artp = new OIArtVisitableImpl();
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();
        Patient p = pat.getOIArtPatient(patientId);
        PatientModel pm = new PatientModel();
        

        OIArtVisitableImpl visimpl = new OIArtVisitableImpl();
        OIArtSetupArtRegimensImpl regim = new OIArtSetupArtRegimensImpl();
       
        int patArvCode = visimpl.getPatientSingleVisit(patientId, visitdate).getArvcode();
        Tblsetuparvfixeddosecombinations patientRegimen = regim.getPatienArvRegimen(patArvCode);
        
        String descr = patientRegimen.getArvdescription();
        String nameCode = patientRegimen.getV2code();
        
        List<Tblvisits> vislist = client.getVisits();
        if (vislist.size() > 0) {
            for (Tblvisits v : vislist) {
                if (v.getId().getVisitDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                    pm.setOiartvisit(v);
                }
            }
        }
        Patient patient = p;
        pm.setPatient(patient);
        // Tblvisits visits = client.getVisits().size() > 0 ? client.getVisits().get(0) : null;
        

        List<Tblstatus> statuslist = client.getStatus();
        if (statuslist.size() > 0) {
            for (Tblstatus s : statuslist) {
                if (s.getId().getStatusDate() != null) {
                    if (s.getId().getStatusDate().compareTo(visitdate) == 0) { /// date1.compareTo(date2) == 0
                        pm.setOiartstatus(s);
                    }
                }
            }
        }


        Tblpatients artpatient = client.getPatients().size() > 0 ? client.getPatients().get(0) : null;
        pm.setOiartpatient(artpatient);

        
        request.setAttribute("pmodel", pm);
        request.setAttribute("description", descr);
        request.setAttribute("regimen", nameCode);
        request.setAttribute("arvregimens", arvfixeddosecombinationslist);

        client.setP(p);

        request.getSession().setAttribute("client", client);
        request.getRequestDispatcher("art/ArtVisitsEdit.jsp").forward(request, response);

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
