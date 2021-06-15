/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbs.controllers;

import com.vmmc.entities.Cbs;
import com.vmmc.entities.CbsTests;
import com.vmmc.entities.District;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Province;
import com.vmmc.services.CbsSetupServiceImpl;
import com.vmmc.services.DistrictConfig;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.ProvinceConfig;
import com.vmmc.services.cbsTestsImpl;
import com.vmmc.services.cbsablePatientImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DevOOP
 */
@WebServlet(name = "NotificationTeens", urlPatterns = {"/NotificationTeens"})
public class NotificationTeens extends HttpServlet {

    static CbsSetupServiceImpl cbssetup = new CbsSetupServiceImpl();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NotificationTeens</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NotificationTeens at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        Facilities config = facility.getFacilityName(province, district, facili);
        request.setAttribute("facilityName", config.getFacilityName());

        DistrictConfig distr = new DistrictConfig();
        ProvinceConfig prov = new ProvinceConfig();
        
        District districtName = distr.getDistrictName(province, district);
        Province provinceName = prov.getProvinceName(String.valueOf(province));
        
        request.setAttribute("districtName", districtName.getDistrictName());
        request.setAttribute("provinceName", provinceName.getProvinceName());
        
        Patient p = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p = tempClient == null ? (Patient) session.getAttribute("patient") : new cbsablePatientImpl().getPatient(tempClient);

        session.setAttribute("patient", p);
        RequestDispatcher disp = request.getRequestDispatcher("cbs/newNotificationTeens_1.jsp");
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
        LocalDate d = LocalDate.now();
        String dateEpms = d.toString();
        HttpSession session = request.getSession();
        //take patient from session
        Patient p = (Patient) request.getSession().getAttribute("patient");

        //Step 1: Demographic
        String patientOpd = p.getOpdnumber();
        String cbshtcnumber = p.getHtsId();
        String cbsDateFormCompleted = request.getParameter("txtCBSDateComplete");
        String cbsSurname = request.getParameter("txtCBSSurname");
        String cbsName = request.getParameter("txtCBSName");
        String cbsNatId = request.getParameter("txtCBSNatId");
        String cbsDob = request.getParameter("txtCBSDob");
        String cbsGender = request.getParameter("txtCBSGender");
        String cbsUniqueId = request.getParameter("txtcbsUniqueId");
        String cbsMotherName = request.getParameter("txtmothername");
        String cbsBirthPlace = request.getParameter("txtmotherbirthplace");

        //Step 2: HIV Diagnosis
        String cbsDateofhivdiagnosis = request.getParameter("txtdateofhivdiagnosis");
        String firsttest = request.getParameter("TEST1");
        String cbsFirstHivTest = request.getParameter("txtcbstest1");
        String cbsFirstHivTestResult = request.getParameter("txtcbstest1Result");
        String secondtest = request.getParameter("TEST2");
        String cbsSecondHivTest = request.getParameter("txtcbstest2");
        String cbsSecondHivTestResult = request.getParameter("txtcbstest2Result");

        //Step 3: Baseline Info
        String cbsSelfIdentifiedGender = request.getParameter("txtselfidentifiedgender");
        String cbsMarital = request.getParameter("txtcbsMarital");
        String cbsReligion = request.getParameter("txtcbsReligion");
        String cbsHighestLevelEducation = request.getParameter("txtcbseducationlevel");
        String cbsIsSexualActive = request.getParameter("txtcbsSexualActive");
        String cbsContactofIndexCase = request.getParameter("txtcbsCaseIndex");
        String cbsIndexCaseHTCnumber = request.getParameter("txtbsHtcNumber");
        String cbsIndexCaseARTnumber = request.getParameter("txtcbsArtNumber");
        String cbsIndexCaseUniqNumber = request.getParameter("txtcbsUniqueId");

        //Step 4 :  HIV Clinical Info
        String cbsWhoClinicalStage = request.getParameter("txtcbsadultwhostage");
        String cbsWhoClinicalStageResult = request.getParameter("txtcbsadultwhostageresult");
        String cbsCdCount = request.getParameter("txtcbsadultcd4count");
        String cbsCdCountResult = request.getParameter("txtcbsadultcd4countresult");
        String cbsCdCountPercentage = request.getParameter("txtcbsadultcd4countpercentage");
        String cbsCdCountDate = request.getParameter("txtcbsadultcd4countresultdate");
        String cbsInitiatedonart = request.getParameter("txtcbsadultInitiatedonart");
        String cbsOartNumber = request.getParameter("txtcbsadultoiartumber");
        String cbsOartRegimen = request.getParameter("txtcbsadultartregimen");
        String cbsReasonNotInitiatedonart = request.getParameter("txtCBSadultnotinitiated");

        //Step 5 :  Site and Info
        String cbsMemberReporting = request.getParameter("txtCBSMemberReporting");
        String cbsStaffTele = request.getParameter("txtCBSStaffTelephone");
        String cbsReporterEmail = request.getParameter("txtCBSReporterEmail");

        //Conversions String ---> Int
        int cbsCdCountResult1, cbsCdCountPercentage1 = 0;
        if (cbsCdCount.equalsIgnoreCase("yes")) {
            cbsCdCountResult1 = Integer.valueOf(cbsCdCountResult);
            cbsCdCountPercentage1 = Integer.valueOf(cbsCdCountPercentage);
        } else {
            cbsCdCountResult1 = 0;
            cbsCdCountPercentage1 = 0;
        }

        //Dates
        Timestamp cbsDateFormCompleted1 = null;
        Timestamp cbsDob1 = null;
        Timestamp cbsepms = null;

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");

            Date parsedFormCompleted = formatter.parse(cbsDateFormCompleted + " 00:00:00");
            cbsDateFormCompleted1 = new java.sql.Timestamp(parsedFormCompleted.getTime());

            Date parsedcbsDob = formatter.parse(cbsDob + " 00:00:00");
            cbsDob1 = new java.sql.Timestamp(parsedcbsDob.getTime());

            Date parseepms = formatter1.parse(dateEpms);
            cbsepms = new java.sql.Timestamp(parseepms.getTime());
        } catch (Exception pw) {
            pw.printStackTrace();
        }

        cbsablePatientImpl cbsdb = new cbsablePatientImpl();
        Cbs cb = new Cbs();

        //Step 1:
        cb.setDateFormCompleted(cbsDateFormCompleted1);
        cb.setHtcnumber(cbshtcnumber);
        cb.setOpdnumber(patientOpd);
        cb.setSurname(cbsSurname);
        cb.setFirstname(cbsName);
        cb.setNationalId(cbsNatId);
        cb.setDateOfBirth(cbsDob1);
        cb.setSex(cbsGender);
        cb.setPseudoId(cbsUniqueId);
        cb.setMomName(cbsMotherName);
        cb.setDistOfBirth(cbsBirthPlace);

        //step 3
        cb.setSelfIdGeder(cbsSelfIdentifiedGender);
        cb.setReligion(cbsReligion);
        cb.setMaritalStatus(cbsMarital);
        cb.setHighestEducationalLevel(cbsHighestLevelEducation);
        cb.setSexualactive(cbsIsSexualActive);
        cb.setContactOfIndexTest(cbsContactofIndexCase);
        if (cbsContactofIndexCase.equalsIgnoreCase("yes")) {
            cb.setContactofindexcaseArtnumber(cbsIndexCaseARTnumber);
            cb.setContactofindexcaseHtsnumber(cbsIndexCaseHTCnumber);
            cb.setContactofindexcaseUniqnumber(cbsIndexCaseUniqNumber);
        } else {
            cb.setContactofindexcaseArtnumber(null);
            cb.setContactofindexcaseHtsnumber(null);
            cb.setContactofindexcaseUniqnumber(null);
        }

        //step 4
        cb.setInitiatedonart(cbsInitiatedonart);
        if (cbsInitiatedonart.equalsIgnoreCase("yes")) {
            cb.setArtNumber(cbsOartNumber);
            cb.setArtRegimen(cbsOartRegimen);
            cb.setReasonNotInitiatedOnArt(null);
        } else {
            cb.setArtNumber(null);
            cb.setArtRegimen(null);
            cb.setReasonNotInitiatedOnArt(cbsReasonNotInitiatedonart);
        }

        //step 5
        cb.setStaffMemberEntering(cbsMemberReporting);
        cb.setStaffMemberEmail(cbsReporterEmail);
        cb.setStaffMemberTelephone(cbsStaffTele);
        cb.setDateEnteredEpms(cbsepms);

        //add to database cbs
//        cbsdb.add(cb);
        if (cbsdb.add(cb) == 1) {

            //moulding items for cbstests table
            Timestamp cbsDateofHivDiagnosis = null;
            Timestamp cbsCdcountDate = null;

            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                Date parsehivdiagnosis = formatter.parse(cbsDateofhivdiagnosis + " 00:00:00");
                cbsDateofHivDiagnosis = new java.sql.Timestamp(parsehivdiagnosis.getTime());

                Date parsercdcountdate = formatter.parse(cbsCdCountDate + " 00:00:00");
                cbsCdcountDate = new java.sql.Timestamp(parsercdcountdate.getTime());

            } catch (Exception pe) {
                pe.printStackTrace();
            }

            cbsTestsImpl ctiDB = new cbsTestsImpl();
            CbsTests cbsAdult = new CbsTests();

            //Step 1
            cbsAdult.setHtcnumber(cbshtcnumber);
            cbsAdult.setOpdnumber(patientOpd);

            // Step 2
            cbsAdult.setDateHivDiagnosed(cbsDateofHivDiagnosis);
            if (firsttest.equalsIgnoreCase("yes")) {
                cbsAdult.setFirstTestMethod(cbsFirstHivTest);
                cbsAdult.setFirstTestResult(cbsFirstHivTestResult);
            } else {
                cbsAdult.setFirstTestMethod(null);
                cbsAdult.setFirstTestResult(null);
            }
            if (secondtest.equalsIgnoreCase("yes")) {
                cbsAdult.setSecondTestMethod(cbsSecondHivTest);
                cbsAdult.setSecondTestResult(cbsSecondHivTestResult);
            } else {
                cbsAdult.setSecondTestMethod(null);
                cbsAdult.setSecondTestResult(null);
            }

            // Step 4
            cbsAdult.setWhoStage(cbsWhoClinicalStage);
            if (cbsWhoClinicalStage.equalsIgnoreCase("yes")) {
                cbsAdult.setWhoStageAtNotification(cbsWhoClinicalStageResult);
            } else {
                cbsAdult.setWhoStageAtNotification(null);
            }

            cbsAdult.setCdCountTest(cbsCdCount);
            if (cbsCdCount.equalsIgnoreCase("yes")) {
                cbsAdult.setCdCountTestDate(cbsCdcountDate);
                cbsAdult.setCdCountResult(cbsCdCountResult1);
                cbsAdult.setCdCountPercentage(cbsCdCountPercentage1);
            } else {
                cbsAdult.setCdCountTestDate(null);
                cbsAdult.setCdCountResult(null);
                cbsAdult.setCdCountPercentage(null);
            }

            cbsAdult.setDateFormCompleted(cbsDateFormCompleted1);

            ctiDB.addCbsTests(cbsAdult);
        }

        response.sendRedirect("AllNotifications");
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
