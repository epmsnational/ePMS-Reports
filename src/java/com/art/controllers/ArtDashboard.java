
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Htc;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.HtcTestableImpl;
import com.vmmc.services.PatientCensus;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leon-mbano
 */
public class ArtDashboard extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArtDashboard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArtDashboard at " + request.getContextPath() + "</h1>");
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
        List<Htc> listClients= new HtcTestableImpl().getAllHivPositives();//change to return all Vmmcs
        
        request.setAttribute("patients",listClients);
        request.setAttribute("facilityName",config.getFacilityName());
       // 
         PatientCensus census = new PatientCensus();
        
        int art = census.countArtPatients();
        int patients = census.countRegisteredPatients();
        int women = census.countArtFemalePatients();
        int expossed = census.countExpossedInfants();

        request.setAttribute("art", art);
        request.setAttribute("women", women);
        request.setAttribute("patients", patients);
        request.setAttribute("expossed", expossed);
        
        RequestDispatcher disp = request.getRequestDispatcher("art/artServiceBasket.jsp");
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
