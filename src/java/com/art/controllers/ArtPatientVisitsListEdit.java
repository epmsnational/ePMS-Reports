
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblvisits;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Developer
 */
@WebServlet(name = "ArtPatientVisitsListEdit", urlPatterns = {"/ArtPatientVisitsListEdit"})
public class ArtPatientVisitsListEdit extends HttpServlet {

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
        //get client visits here and post them to their page

        String[] temp = request.getQueryString().split("&");
        String oinumber = temp[0];
        String opdNum = temp[1];
        CompletedARTClientAll cptdArtClient = new CompletedARTClientAll(oinumber);
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();
        List<Tblvisits> visitlst = cptdArtClient.getVisits();
        //PatientModel pm = new PatientModel();
        Patient patient = pat.getOIArtPatient(oinumber);

        // cptdArtClient.setP(patient);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        request.setAttribute("patient", patient);
        request.setAttribute("visitlst", visitlst);
        request.setAttribute("artnumber", oinumber);
        request.setAttribute("cptdArtClient", cptdArtClient);
        request.setAttribute("facilityName",config.getFacilityName());
        RequestDispatcher dis = request.getRequestDispatcher("art/artPatientVisitsListEdit.jsp");
        dis.forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
