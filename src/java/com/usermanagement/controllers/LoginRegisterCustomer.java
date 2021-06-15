/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagement.controllers;

//import dao.UserDao;
//import dura.datainstance.DataInit;
import com.vmmc.entities.District;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Province;
import com.vmmc.entities.Role;
import com.vmmc.entities.User;
import com.vmmc.entities.Userrole;
import com.vmmc.services.Encryptor;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.MiscService;
import com.vmmc.services.UserDao;
import com.vmmc.services.UserRoleImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import models.User;
//import models.UserGroup;0774689598
//import dura.myutil.Encryptor;

/**
 *
 * @author mamhinga
 */
@WebServlet(name = "LoginRegisterCustomer", urlPatterns = {"/RegisterUser"})
public class LoginRegisterCustomer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();

        Facilityconfig data = serv.getFacilitySite();
        int province1 = data.getProvinceId();
        String district1 = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province1, district1, facili);
        request.setAttribute("facilityName", config.getFacilityName());
        try {
            MiscService setUp = new MiscService();
            List<Facilities> facilities = setUp.getFacilities();
            List<District> district = setUp.getDistricts();
            List<Province> province = setUp.getProvinces();
            List<Role> roles = setUp.getPositions();
            request.setAttribute("facilities", facilities);
            request.setAttribute("district", district);
            request.setAttribute("province", province);
            request.setAttribute("roles", roles);
            RequestDispatcher view = request.getRequestDispatcher("useraccounts/loginregister.jsp");
            view.forward(request, response);

        } catch (Exception ex) {
            String str = ex.toString();
            System.out.println(str);
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = createUser(request);
        UserDao ud = new UserDao();
        String confirmpassword = request.getParameter("ConfirmPassword");
        boolean passwordChk = comparePasswords(confirmpassword, user.getPassword(), request);
        RequestDispatcher view = null;
//        if (ud.checkUseremail(user.getUserName())&&passwordChk) {
//            view = request.getRequestDispatcher("usermanagement/newuser.jsp");
//            request.setAttribute("emailmsg", "email address already exist please specify another one");
//            request.setAttribute("user", user);
//            view.forward(request, response);
//        } else {
        view = request.getRequestDispatcher("useraccounts/personaldetails.jsp");
        request.setAttribute("msg", "New user successfully Saved");
        String nupass = Encryptor.str(user.getPassword());
        user.setPassword(nupass);
        ud.saveUser(user);
        request.setAttribute("loggedUser", user);
//            UserGroup ug = new UserGroup();
//            ug.setGroupName(user.getPosition());
//            ug.setUseremail(user.getEmail());
        // DataInit.getInstance().getUserGroupDao().addGroup(ug);
        // response.sendRedirect();
        if (ud.saveUser(user) == 1) {
            List<Userrole> listRoles = new UserRoleImpl().getRoles(user.getUserName());
            request.setAttribute("roles", listRoles);
            MiscService setUp = new MiscService();
            List<Role> allRoles = setUp.getPositions();
            HttpSession session = request.getSession();
            session.setAttribute("allRoles", allRoles);

            request.setAttribute("username", user.getUserName());
            request.getRequestDispatcher("useraccounts/manageuser.jsp").forward(request, response);
        }
        //new AllUsers().doGet(request, response);

        //}
    }

    boolean comparePasswords(String password, String newPassword, HttpServletRequest req) {
        boolean val = false;
        int testNewpassword = password.compareTo(newPassword);
        if (!(testNewpassword == 0)) {
            req.setAttribute("confrimpasserr", "password mismatch");
            val = true;
        }
        return val;
    }

    User createUser(HttpServletRequest req) {
        User user = new User();
        user.setDateCreated(new java.util.Date());
        user.setDateModified(new java.util.Date());
        user.setFirstName(req.getParameter("fname"));
        user.setLastName(req.getParameter("lname"));
        user.setIsActive(Boolean.TRUE);
        user.setLastLogIn(new java.util.Date());
        user.setMiddleName(req.getParameter("middlename"));
        user.setPassword(req.getParameter("Password"));

        user.setUserName(req.getParameter("username"));
        user.setPosition(req.getParameter("role"));

        return user;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
