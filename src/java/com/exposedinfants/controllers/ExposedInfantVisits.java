
package com.exposedinfants.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.services.CompletedExposedInfantClientAll;
import com.vmmc.services.ExposedInfantableImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
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
 * @author mbanol
 */
public class ExposedInfantVisits extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ExposedInfantVisits</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ExposedInfantVisits at " + request.getContextPath() + "</h1>");
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
        
        String ExposedInfantId = null;
        ExposedInfantId = request.getQueryString().replace("%", " ");;

        CompletedExposedInfantClientAll client = new CompletedExposedInfantClientAll(ExposedInfantId);
               
        ExposedInfantableImpl EIpp = new ExposedInfantableImpl();
        Tblexposedinfants p = EIpp.getExposedInfant(ExposedInfantId);
        //ExposedInfantVistableImpl exp = new ExposedInfantVistableImpl();
       // Tblexposedinfantvisits vis =new Tblexposedinfantvisits();
        
        List<Tblexposedinfantvisits> eivisits = client.getExposedinfantvisits();
      client.setP(p);
      
        request.getSession().setAttribute("eivisits", eivisits);
         request.getSession().setAttribute("client", client);
        RequestDispatcher disp = request.getRequestDispatcher("exposeinfants/ExposedInfantVisits.jsp");
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
