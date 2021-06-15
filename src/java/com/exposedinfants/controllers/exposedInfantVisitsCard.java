
package com.exposedinfants.controllers;

import com.vmmc.controllers.*;
import com.vmmc.entities.Basicvitals;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Nextofkin;
import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientMedicalInsurance;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.entities.TblexposedinfantvisitsId;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.CompletedExposedInfantClientAll;
import com.vmmc.services.ExposedInfantVistableImpl;
import com.vmmc.services.ExposedInfantableImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mbanol
 */
@WebServlet(name = "exposedInfantVisitsCard", urlPatterns = {"/exposedInfantVisitsCard"})
public class exposedInfantVisitsCard extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();
        
        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province,district,facili);
        request.setAttribute("facilityName",config.getFacilityName());

        String visitId = request.getQueryString().replace("%", " ");
        String[] arr = visitId.split("&");
        String visdate = arr[0];
        String expId = arr[1];
        if (visdate == null) {
            System.out.println("Error no visit date");
        }

        CompletedExposedInfantClientAll client = new CompletedExposedInfantClientAll(expId);

        ExposedInfantableImpl EIpp = new ExposedInfantableImpl();
        Tblexposedinfants p = EIpp.getExposedInfant(expId);
        ExposedInfantVistableImpl exp = new ExposedInfantVistableImpl();
        /// Converting a string to date 
        Timestamp visitdate = null; ///reviewDate
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedVisDate = formatter.parse(visdate + " 00:00:00");
            visitdate = new java.sql.Timestamp(parsedVisDate.getTime());

        } catch (Exception pe) {
            pe.printStackTrace();
        }
        /// Creating visirID
        TblexposedinfantvisitsId id = new TblexposedinfantvisitsId();
        id.setExposedInfantId(expId);
        id.setVisitDate(visitdate);

        //// Getting a specific visit
      //  List<Tblexposedinfantvisits> eivisit = exp.getExposedInfantVisit(id);
        client.setP(p);
   

               // request.getSession().setAttribute("eivisit", eivisit);
                 request.getSession().setAttribute("client", client);
        
            request.getRequestDispatcher("exposeinfants/exposedInfantVisitCard.jsp").forward(request, response);
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
