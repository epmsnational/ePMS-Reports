/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblsetuptesttypes;
import com.vmmc.entities.Tbltests;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIARTTblsetuptesttypableImpl;
import com.vmmc.services.OIArtTestsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohcc-ATP
 */
@WebServlet(name = "ARTTests", urlPatterns = {"/ARTTests"})
public class ARTTests extends HttpServlet {

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
        
        OIARTTblsetuptesttypableImpl testtypeim = new OIARTTblsetuptesttypableImpl();
        List<Tblsetuptesttypes>  testTypes = testtypeim.getTestTypes();
        request.setAttribute("testTypes", testTypes);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("art/reportOIART_Tests.jsp");
        disp.forward(request, response);
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 
       List<Tbltests> listClients = new OIArtTestsImpl().getUniqueVlTest();//change to return all Vmmcs

       OIArtTestsImpl testImp = new OIArtTestsImpl();
        List<Tbltests> testlist = testImp.getUniqueVlTest();//change to return all Vmmcs
        Tbltests currentTest= null;
        String[] array = testlist.toArray(new String[testlist.size()]);
        List<Tbltests> epmtylist = new ArrayList();
        String testtype=request.getParameter("slcOIARTTestTypes");
        for (int i = 0; i < array.length; i++) {
            String patId = array[i];
            List<Tbltests> testslist = testImp.getAllPatientTests(patId,testtype);
            if (!testslist.isEmpty()) {
                currentTest = testslist.get(0);
                epmtylist.add(currentTest);
                
            }
        }
         request.setAttribute("testtype", testtype);
        request.setAttribute("epmtylist", epmtylist);
        
        // 
        RequestDispatcher disp = request.getRequestDispatcher("art/OIArtTests.jsp");
        disp.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
