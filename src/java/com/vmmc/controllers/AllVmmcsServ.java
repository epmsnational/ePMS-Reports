/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.IOException;
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
 * @author System Devoloper
 */
@WebServlet(name = "AllVmmcsServ", urlPatterns = {"/AllVmmcsServ"})
public class AllVmmcsServ extends HttpServlet {

    /**
     *The fetch mode only says that the association must be fetched. If you want to add restrictions on an associated entity, you must create an alias, or a subcriteria. I generally prefer using aliases, but YMMV:

Criteria c = session.createCriteria(Dokument.class, "dokument");
c.createAlias("dokument.role", "role"); // inner join by default
c.createAlias("role.contact", "contact");
c.add(Restrictions.eq("contact.lastName", "Test"));
return c.list();
This is of course well explain in the Hibernate reference manual, and the javadoc for Criteria even has examples. Read the documentation: it has plenty of useful information.
    } */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
      //  processRequest(request, response);
       
        
        List<Patient> listClients= new CircumcisablePatientImpl().getAllPatients();//change to return all Vmmcs
        List<Patient> tempList = new ArrayList<>();
        for(Patient p : listClients)
        {
            if(p.getVmmcId()!=null)
                tempList.add(p);
        }
        request.setAttribute("patients",tempList);
        RequestDispatcher disp = request.getRequestDispatcher("vmmc/AllVmmcs.jsp");
        disp.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
