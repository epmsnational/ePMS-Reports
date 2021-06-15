/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbsDirect.controllers;

import com.vmmc.services.SetupServiceImpl;
import com.vmmc.entities.Cbs;
import com.vmmc.entities.CbsTests;
import com.vmmc.entities.District;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Province;
import com.vmmc.services.DistrictConfig;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.ProvinceConfig;
import com.vmmc.services.cbsTestsImpl;
import com.vmmc.services.cbsablePatientImpl;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author devoop
 */
public class DirectInfants extends HttpServlet {

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
            out.println("<title>Servlet DirectInfants</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DirectInfants at " + request.getContextPath() + "</h1>");
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

        String opdnum = p.getOpdnumber();
        SetupServiceImpl setup = new SetupServiceImpl();

        String dateComps[] = p.getDob().toString().split("-");
        int age = Period.between(LocalDate.of(
                Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
        ), LocalDate.now()).getYears();

        session.setAttribute("patient", p);

        if (age >= 15) {
            RequestDispatcher disp = request.getRequestDispatcher("cbsDirect/directAdults.jsp");
            disp.forward(request, response);
        } else if (age >= 2 & age < 12) {
            RequestDispatcher disp = request.getRequestDispatcher("cbsDirect/directTeens.jsp");
            disp.forward(request, response);
        } else if (age >= 12 & age < 15) {
            RequestDispatcher disp = request.getRequestDispatcher("cbsDirect/directMidTeens.jsp");
            disp.forward(request, response);
        } else {
            RequestDispatcher disp = request.getRequestDispatcher("cbsDirect/directInfants.jsp");
            disp.forward(request, response);

        }
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

        //Step 3: Infant
        String cbsTypeOfDelivery = request.getParameter("txtcbstypeofdelivery");
        String cbsPlaceOfDelivery = request.getParameter("txtcbsplaceofdelivery");
        String cbsDeliveredBy = request.getParameter("txtcbsdeliverylevel");
        String cbsBirthWeight = request.getParameter("txtcbsinfantweight");
        String cbsGaAtDelivery = request.getParameter("txtcbsinfantgaatdelivery");
        String cbsFeedingMethod = request.getParameter("txtCBSInfantFeeding");
        String cbsFeedingDuration = request.getParameter("txtcbsfeedingduration");
        String cbsFeedingStatus = request.getParameter("txtcbsbreastfeeding");
        String cbsFeedingAgeCeased = request.getParameter("txtcbsfeedingstopped");
        String cbsInfantProphylaxis = request.getParameter("txtcbsinfantprophylaxis");
        String cbsInfantProphylaxDuration = request.getParameter("txtcbsprophylaxisduration");
        String cbsPreviousTest = request.getParameter("txtcbstestedbefore");
        String cbsArtInitiation = request.getParameter("txtcbsinfantartinitiation");
        String cbsCd4Notification = request.getParameter("txtcbscd4notification");
        String cbsArtRegimen = request.getParameter("txtcbscartregimen");

        //Step 4: Mother
        String cbsMomAlive = request.getParameter("txtcbsmomalive");
        String cbsMomSurrogate = request.getParameter("txtcbsmomsurrodate");
        String cbsMomOartNumber = request.getParameter("txtCBSMomARTNumber");
        String cbsMomMartialStatus = request.getParameter("txtcbsmaritalstatus");
        String cbsAncBooking = request.getParameter("txtcbsANCBooking");
        String cbsGABooking = request.getParameter("txtCBSGA");
        String cbsParityBooking = request.getParameter("txtCBSParity");
        String cbsnumberofANC = request.getParameter("txtCBSancnumber");
        String cbsHIVTesting = request.getParameter("txtcbsHIVTesting");
        String cbsARTStatus = request.getParameter("txtcbsARTStatus");
        String cbsARTStopped = request.getParameter("txtCBSARTdateStopped");
        String cbsMomRegimen = request.getParameter("txtCBSMomRegimen");
        String cbsMomOtherRegimen = request.getParameter("txtCBSRegimenOther");
        String cbsBreastFeedAdherence = request.getParameter("txtcbsadherence");
        String cbsOtherRiskFactors = request.getParameter("txtcbsotherriskfactors");
        String cbsViralLoad1 = request.getParameter("txtcbsviralload1");
        String cbsViralLoadResult1 = request.getParameter("txtCBSViralLoadresult1");
        String cbsViralLoadDate1 = request.getParameter("txtCBSViralLoadDate");
        String cbsViralLoad2 = request.getParameter("txtcbsviralload2");
        String cbsViralLoadResult2 = request.getParameter("txtCBSViralLoadresult2");
        String cbsViralLoadDate2 = request.getParameter("txtCBSViralLoadDate1");

        //Step 5 :  Site and Info
        String cbsMemberReporting = request.getParameter("txtCBSMemberReporting");
        String cbsStaffTele = request.getParameter("txtCBSStaffTelephone");
        String cbsReporterEmail = request.getParameter("txtCBSReporterEmail");

        //Conversions String ---> Int
        int cbsViralLoadResult11, cbsViralLoadResult21, cbsCd4Notification1 = 0;
        if (cbsViralLoad1.equalsIgnoreCase("done")) {
            cbsViralLoadResult11 = Integer.valueOf(cbsViralLoadResult1);
        } else {
            cbsViralLoadResult11 = 0;
        }
        if (cbsViralLoad2.equalsIgnoreCase("done")) {
            cbsViralLoadResult21 = Integer.valueOf(cbsViralLoadResult2);
        } else {
            cbsViralLoadResult21 = 0;
        }
        if (cbsArtInitiation.equalsIgnoreCase("yes")) {
            cbsCd4Notification1 = Integer.valueOf(cbsCd4Notification);
        } else {
            cbsCd4Notification1 = 0;
        }

        //Dates
        Timestamp cbsDateFormCompleted1 = null;
        Timestamp cbsDob1 = null;
        Timestamp cbsDob2 = null;
        Timestamp cbsepms = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");

            Date parsedFormCompleted = formatter.parse(cbsDateFormCompleted + " 00:00:00");
            cbsDateFormCompleted1 = new java.sql.Timestamp(parsedFormCompleted.getTime());

            Date parsedcbsDob = formatter.parse(cbsDob + " 00:00:00");
            cbsDob1 = new java.sql.Timestamp(parsedcbsDob.getTime());

            Date parsedob = formatter1.parse(cbsDob);
            cbsDob2 = new java.sql.Timestamp(parsedob.getTime());

            Date parseepms = formatter1.parse(dateEpms);
            cbsepms = new java.sql.Timestamp(parseepms.getTime());

        } catch (Exception pw) {
            pw.printStackTrace();
        }
        String parseddob = String.valueOf(cbsDob2);
//        float ageCalc = (float)calcDate(parseddob);
//        String ageStr = String.valueOf(ageCalc);

        //// mold notification from above data
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

        //Step 2:
        cb.setSurname(cbsSurname);
        cb.setFirstname(cbsName);
        cb.setNationalId(cbsNatId);
        cb.setDateOfBirth(cbsDob1);
        cb.setSex(cbsGender);

        //step 3
        cb.setTypeOfDelivery(cbsTypeOfDelivery);
        cb.setPlaceOfDelivery(cbsPlaceOfDelivery);
        cb.setDeliveredBy(cbsDeliveredBy);
        cb.setFeedingMethod(cbsFeedingMethod);
        cb.setInitiatedonart(cbsArtInitiation);
        cb.setInfantProphylaxis(cbsInfantProphylaxis);
        cb.setCurrentlyBf(cbsFeedingStatus);
        cb.setBirthWeight(cbsBirthWeight);
        cb.setGaAtDelivery(cbsGaAtDelivery);
        cb.setFeedingDuration(cbsFeedingDuration);
        cb.setFeedingAgeCeased(cbsFeedingAgeCeased);
        cb.setInfantProphylaxisDuration(cbsInfantProphylaxDuration);
        cb.setArtRegimen(cbsArtRegimen);

        //step 4
        cb.setMomOartnumber(cbsMomOartNumber);
        cb.setIsMotherAlive(cbsMomAlive);
        cb.setSurrogateMother(cbsMomSurrogate);
        cb.setMotherMartalStatus(cbsMomMartialStatus);
        cb.setArtRegimen(cbsMomRegimen);
        cb.setMomOtherRegimen(cbsMomOtherRegimen);
        cb.setOtherriskfactors(cbsOtherRiskFactors);
        cb.setGaatbooking(cbsGABooking);
        cb.setNumberofancvisits(cbsnumberofANC);
        cb.setDatestoppedart(cbsARTStopped);
        cb.setParityatbooking(cbsParityBooking);
        cb.setAncbooking(cbsAncBooking);
        cb.setMomHivTesting(cbsHIVTesting);
        cb.setPoorbreastfeed(cbsBreastFeedAdherence);
        cb.setMomArtstatus(cbsARTStatus);

        //step 5
        cb.setStaffMemberEntering(cbsMemberReporting);
        cb.setStaffMemberEmail(cbsReporterEmail);
        cb.setStaffMemberTelephone(cbsStaffTele);
        cb.setDateEnteredEpms(cbsepms);

        //add to database cbs
//        cbsdb.add(cb);
        if (cbsdb.add(cb) == 1) {
            //moulding items for cbstests table
            Timestamp cbsMotherViralLoadDate1 = null;
            Timestamp cbsMotherViralLoadDate2 = null;
            Timestamp cbsDateofHivDiagnosis = null;

            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                Date viralLoadDate1 = formatter.parse(cbsViralLoadDate1 + " 00:00:00");
                cbsMotherViralLoadDate1 = new java.sql.Timestamp(viralLoadDate1.getTime());

                Date viralLoadDate2 = formatter.parse(cbsViralLoadDate2 + " 00:00:00");
                cbsMotherViralLoadDate2 = new java.sql.Timestamp(viralLoadDate2.getTime());

                Date parsehivdiagnosis = formatter.parse(cbsDateofhivdiagnosis + " 00:00:00");
                cbsDateofHivDiagnosis = new java.sql.Timestamp(parsehivdiagnosis.getTime());

            } catch (Exception pe) {
                pe.printStackTrace();
            }

            cbsTestsImpl cbtDB = new cbsTestsImpl();
            CbsTests cbt = new CbsTests();

            //Step 1
            cbt.setHtcnumber(cbshtcnumber);
            cbt.setOpdnumber(patientOpd);

            // Step 2
            cbt.setDateHivDiagnosed(cbsDateofHivDiagnosis);
            cbt.setFirstTestMethod(cbsFirstHivTest);
            cbt.setFirstTestResult(cbsFirstHivTestResult);
            cbt.setSecondTestMethod(cbsSecondHivTest);
            cbt.setSecondTestResult(cbsSecondHivTestResult);

            // Step 3
            cbt.setCdCountPercentage(cbsCd4Notification1);

            //Step 4
            if (firsttest.equalsIgnoreCase("yes")) {
                cbt.setMotherViralloadFirstTest(cbsViralLoad1);
                cbt.setMotherViralloadFirstTestResult(cbsViralLoadResult11);
                cbt.setMotherViralloadFirstTestDate(cbsMotherViralLoadDate1);
            } else {
                cbt.setMotherViralloadFirstTest(null);
                cbt.setMotherViralloadFirstTestResult(null);
                cbt.setMotherViralloadFirstTestDate(null);
            }
            if (secondtest.equalsIgnoreCase("yes")) {
                cbt.setMotherViralloadSecondTest(cbsViralLoad2);
                cbt.setMotherViralloadSecondTestResult(cbsViralLoadResult21);
                cbt.setMotherViralloadSecondTestDate(cbsMotherViralLoadDate2);

            } else {
                cbt.setMotherViralloadSecondTest(null);
                cbt.setMotherViralloadSecondTestResult(null);
                cbt.setMotherViralloadSecondTestDate(null);
            }

            cbt.setDateFormCompleted(cbsDateFormCompleted1);

            cbtDB.addCbsTests(cbt);
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
