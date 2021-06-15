
package com.vmmc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Nextofkin;
import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientMedicalInsurance;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.PatientModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Developer
 */
@WebServlet(name = "PatientCard", urlPatterns = {"/PatientCard"})
public class PatientCard extends HttpServlet {

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
        
        String opdNum = request.getQueryString();
        if(opdNum==null)
            opdNum=(String)request.getAttribute("opdNum");
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        PatientModel pm = new PatientModel();
        PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
        pm.setAddress(add);
        PatientMedicalInsurance pmi = cgp.getPmiList().size() > 0 ? cgp.getPmiList().get(0) : null;
        pm.setIns(pmi);
        Nextofkin nok = cgp.getNokList().size() > 0 ? cgp.getNokList().get(0) : null;
        pm.setNok(nok);
        //Basicvitals bv = cgp.getBvList().size() > 0 ? cgp.getBvList().get(0) : null;
        //pm.setbVitals(bv);
        pm.setPatient(cgp.getP());

        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("demographic/patientCard.jsp").forward(request, response);

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
