package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtTestsImpl;
import com.vmmc.services.OIArtVisitableImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
@WebServlet(name = "ARTVRLDue", urlPatterns = {"/ARTVRLDue"})
public class ARTVRLDue extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ARTVRLDue</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ARTVRLDue at " + request.getContextPath() + "</h1>");
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
        Facilities config = facility.getFacilityName(province, district, facili);
        request.setAttribute("facilityName", config.getFacilityName());

        OIArtVisitableImpl visImp = new OIArtVisitableImpl();
        List<Tblvisits> vislist = visImp.getUniqueVisit();
        Tblvisits currentVis = null;
        String[] visarray = vislist.toArray(new String[vislist.size()]);
        List<Tblvisits> currentVisList = new ArrayList();
        for (int i = 0; i < visarray.length; i++) {
            String patId = visarray[i];
            List<Tblvisits> visitslist = visImp.getPatientAllVisit(patId);
            if (!visitslist.isEmpty()) {
                currentVis = visitslist.get(0);
                currentVisList.add(currentVis);

            }
        }

        List<Tbltests> listTests = new OIArtTestsImpl().getUniqueVlTest();
        OIArtTestsImpl testImp = new OIArtTestsImpl();
        List<Tbltests> testlist = testImp.getUniqueVlTest();
        Tbltests currentTest = null;
        String[] testarray = testlist.toArray(new String[testlist.size()]);
        List<Tbltests> CurrentTestList = new ArrayList();
        String testtype = "VRL";
        for (int i = 0; i < visarray.length; i++) {
            String patId = visarray[i];
            List<Tbltests> testslist = testImp.getAllPatientTests(patId, testtype);
            if (!testslist.isEmpty()) {
                currentTest = testslist.get(0);
                CurrentTestList.add(currentTest);

            }
        }
        List<Tblvisits> dueVL = new ArrayList();
        List<Tbltests> highVl = new ArrayList();
        for (Tblvisits vis : currentVisList) {

            for (Tbltests tes : CurrentTestList) {
                if (vis.getId().getPatientId().equalsIgnoreCase(tes.getTblpatients().getPatientId())) {
                    List<Tbltests> vltests = new ArrayList();
                    Date testdate = tes.getTestDate();
                    Date today = new Date();
                    long milsec = 0;

                    if (testdate != null) {
                        milsec =  today.getTime() - testdate.getTime();
                        int diff = (int) TimeUnit.MILLISECONDS.toDays(milsec);
                        if (tes.getResultNumeric() != null) {
                            if (tes.getResultNumeric().intValue() > 1000) {
                                highVl.add(tes);
                            }
                            if (diff > 365) {
                                dueVL.add(vis);
                            }
                        }
                        vltests.add(tes);
                    }
                } else {
                    dueVL.add(vis);
                }
            }
        }

        request.setAttribute("dueforVl", dueVL);
        request.setAttribute("highVL", highVl);
        // 
        RequestDispatcher disp = request.getRequestDispatcher("art/OIArtVRLDue.jsp");

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
