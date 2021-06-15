
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedARTClientAll;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trevor
 */
@WebServlet(name = "OIARTSingleClientDashboard", urlPatterns = {"/OIARTSingleClientDashboard"})
public class OIARTSingleClientDashboard extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OIARTSingleClientDashboard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OIARTSingleClientDashboard at " + request.getContextPath() + "</h1>");
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
        
          String patientId =null;

        patientId=request.getQueryString().replace("%", " ");;

        
        CompletedARTClientAll client = new CompletedARTClientAll(patientId);
        //client.getp
        //get a patient object
        CircumcisablePatientImpl OIARTpp = new CircumcisablePatientImpl();
        
       
        client.getVisits();
        
        Patient p = OIARTpp.getOIArtPatient(patientId);
        
        //add a patient to the completedAll client
        client.setP(p);
        request.getSession().setAttribute("client",client);
        if (client != null) {
         
           
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
                disp.forward(request, response);
        }
        else
        {
            //dispatch to error page
            RequestDispatcher disp;
            disp = request.getRequestDispatcher("/art/OIARTSingleClientDashboard.jsp");
            disp.forward(request, response); 
            
        }
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
