/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.reportModels.ExportExcel.art;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblstatus;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtFollowUpStatusImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lmbano
 */
@WebServlet(name = "ArtPatientStatuExport", urlPatterns = {"/ArtPatientStatuExport"})
public class ArtPatientStatuExport extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("export/ArtPatientStatusReport.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String startDatef = request.getParameter("txtRptStartDate");
        String endDatef = request.getParameter("txtRptEndDate");
        Date startDate = null;
        Date endDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            startDate = sdf.parse(startDatef);
            endDate = sdf.parse(endDatef);
        } catch (ParseException ex) {
            Logger.getLogger(ArtPatientStatuExport.class.getName()).log(Level.SEVERE, null, ex);
        }
        OIArtFollowUpStatusImpl flo = new OIArtFollowUpStatusImpl();

        List<String> floList = flo.getUniqueFollowupstatus();//  getCurrentFollowupstatus

        String[] array = floList.toArray(new String[floList.size()]);
        List<Tblstatus> epmtylist = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            String patId = array[i];
            List<Tblstatus> statuslist = flo.getAllFollowupstatus(patId);
            if (!statuslist.isEmpty()) {
                Tblstatus currentStatus = statuslist.get(0);
                ///if (currentStatus.getId().getStatusDate().compareTo(startDate) >= 0 && currentStatus.getId().getStatusDate().compareTo(endDate) <= 0) 
                epmtylist.add(currentStatus);

            }
        }

        request.setAttribute("statuses", epmtylist);
        RequestDispatcher rd = request.getRequestDispatcher("export/ArtPatientStatussExportExcel.jsp");
        rd.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
