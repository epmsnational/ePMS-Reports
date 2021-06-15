/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagement.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Role;
import com.vmmc.entities.Userrole;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.MiscService;
import com.vmmc.services.UserGroupDao;
import com.vmmc.services.UserRoleImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Developer
 */
public class AssignRoles extends HttpServlet {

 
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
        
         String tempClient = request.getQueryString();
       
         String username = tempClient.split("=")[1].trim();
         List<Userrole> listRoles= new UserRoleImpl().getRoles(username);
         request.setAttribute("roles", listRoles);
         MiscService setUp = new MiscService();
         List<Role>allRoles = setUp.getPositions();
         HttpSession session = request.getSession();
         session.setAttribute("allRoles", allRoles);
       
         request.setAttribute("username", username);
         request.getRequestDispatcher("useraccounts/manageuser.jsp").forward(request, response);
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
        String []roles = request.getParameterValues("chkRoles");
        String username= request.getParameter("hdusername");
        UserGroupDao ugd = new UserGroupDao();
        
         int i = 0;
        for(String r: roles)
        {
            Userrole ur = new Userrole(username,r);
            i+=ugd.addGroup(ur);
               
          
        }
        
        if (i >0)
        {
//             List<Userrole> listRoles= new UserRoleImpl().getRoles(username);
//         request.setAttribute("roles", listRoles);
//         MiscService setUp = new MiscService();
//         List<Role>allRoles = setUp.getPositions();
//         request.setAttribute("allRoles", allRoles);
//         
//         request.setAttribute("username", username);
         //request.getRequestDispatcher("useraccounts/manageuser.jsp").forward(request, response);
         response.sendRedirect("AllUsers");
        }
        
        
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
