
package com.htc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Htc;
import com.vmmc.entities.PatientAddress;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.HtcHivresultServiceImpl;
import com.vmmc.services.HtsablePatientImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HtsPatientCard", urlPatterns = {"/HtsPatientCard"})
public class HtsPatientCard extends HttpServlet {

   
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
        
        String []temp=request.getQueryString().split("&");
       String htcNo = temp[0];
       String opdNum= temp[1];
       // CompletedVmmcClientAll cptdVmmcClient = new CompletedVmmcClientAll(vmmcNo);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        PatientModel pm = new PatientModel();
         PatientAddress add = cgp.getpAddressList().size() > 0 ? cgp.getpAddressList().get(0) : null;
        pm.setAddress(add);
          
        pm.setPatient(cgp.getP());
        HtsablePatientImpl hts = new HtsablePatientImpl();
        
        Htc htc=hts.getHtsPatient(htcNo);
        String referredFrom = setup.getSetupReferredFroms(true).get(htc.getReferredFromTypeId());
        String htsModel = setup.getHtcModels(true).get(htc.getHtcmodelId());
       //String referredTo = setup.getSetupReferredTos(true).get(htc.getRefferedforService());
        String htsPurpose =setup.getHtcTestReasons(true).get(htc.getTestPurposeTypeId());
        
        
        request.setAttribute("htsPurpose",htsPurpose);
        request.setAttribute("htc", htc);
        //put referal info in request
        request.setAttribute("referredFrom", referredFrom);
        request.setAttribute("htsModel", htsModel);
        HtcHivresultServiceImpl results = new HtcHivresultServiceImpl();
        pm.setHtsResults(results.getHivTests(opdNum));
        
        request.setAttribute("pmodel", pm);
        request.getRequestDispatcher("htc/htspatientcard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
