/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagement.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Userrole;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.UserGroupDao;
import com.vmmc.services.UserRoleImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Developer
 */
@WebServlet(name = "RemoveRole", urlPatterns = {"/RemoveRole"})
public class RemoveRole extends HttpServlet {


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
        
        String ourQuery= request.getQueryString();
        String[]arr= ourQuery.split("&");
        String username= arr[0].toString().trim();
        String roleId= arr[1].toString().trim().replace("%20" ," ");
         List<Userrole> listRoles= new UserRoleImpl().getRoles(username);
         UserGroupDao ugd = new UserGroupDao();
         for(Userrole ur:listRoles)
         {
             if(ur.getRoleId().equalsIgnoreCase(roleId))
             {
             
                 ugd.removeUserGroup(ur);
             }
         }
          listRoles= new UserRoleImpl().getRoles(username);
         request.setAttribute("roles", listRoles);
//         HttpSession session = request.getSession();
//         List<Role>allRoles = (List<Role>)session.getAttribute("allRoles");
//         request.setAttribute("allRoles", allRoles);
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
