/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.controllers.csNotification;


import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.StiCs;
import com.vmmc.entities.StiCsSetupsigns;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.StiCSableImpl;
import com.vmmc.services.StiCsSetupServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lmbano
 */
public class STICS extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet STICS</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet STICS at " + request.getContextPath() + "</h1>");
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
        
         StiCsSetupServiceImpl st = new StiCsSetupServiceImpl();
        
        List<StiCsSetupsigns> cssetusignsplist = st.getStiCsSigns();
        request.setAttribute("cssetusignsplist", cssetusignsplist);
        
        RequestDispatcher disp = request.getRequestDispatcher("stics/CongenitalCaseNotification.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  String patientId = locationForOinumber;
        String DateofReport = request.getParameter("txtDateofReport");
        String ReportingFacility = request.getParameter("txtReportingFacility");
        String MothersObsHistoryGravida = request.getParameter("txtMothersObsHistoryGravida");
        String MothersName = request.getParameter("txtMothersName");
        String MothersAddress = request.getParameter("txtMothersAddress");
        String MothersDOB = request.getParameter("txtMothersDOB");
        String MothersObsHistoryParity = request.getParameter("txtMothersObsHistoryParity");
        String LMPBeforeDelivery = request.getParameter("txtLMPBeforeDelivery");
        String MothersReligion = request.getParameter("txtMothersReligion");
        String FirstPrenatalVisit = request.getParameter("txtFirstPrenatalVisit");
        String TrimesterFirstPrenatalVisit = request.getParameter("txtTrimesterFirstPrenatalVisit");
        String MotherHIVStatusDuriPreg = request.getParameter("txtMotherHIVStatusDuriPreg");
        String MothersMaritalStatus = request.getParameter("txtMothersMaritalStatus");
        String PeriodReceivingBenzathinePenicillin = request.getParameter("txtPeriodReceivingBenzathinePenicillin");
        String ReceivedBenzathinePenicilinDate = request.getParameter("txtReceivedBenzathinePenicilinDate");
        String MotherSyphilisTreatment = request.getParameter("txtTreatmentReceivedBenzathinePenicillin");
        String DateOfDelivery = request.getParameter("txtDateOfDelivery");
        String VitalStatus = request.getParameter("txtVitalStatus");
        String DateOfDeath = request.getParameter("txtDateOfDeath");
        String BirthWeight = request.getParameter("txtBirthWeight");
        String GestationalAge = request.getParameter("txtGestationalAge");
        String NonTreponemaltest = request.getParameter("txtNonTreponemaltest");
        String DateOfNonTreponemalTest = request.getParameter("txtDateOfNonTreponemalTest");
        String TiterOfNonTreponemalTest = request.getParameter("txtTiterOfNonTreponemalTest");
        String TreponemaltestDone = request.getParameter("txtTreponemaltestDone");
        String TreponemaltestDoneDate = request.getParameter("txtDateOf1stTreponemalTest");
        String DarkiedExam = request.getParameter("txtDarkiedExam");
      //  String SignsOfCongenitalSyphilis = request.getParameter("chkSignsOfCongenitalSyphilis");
        String BoneXRay = request.getParameter("txtBoneXRay");
        String CSFVDRL = request.getParameter("txtCSFVDRL");
        String CSFProteinCSFWBC = request.getParameter("txtCSFProteinCSFWBC");
        String InfantCongenitalSyphilistreatment = request.getParameter("txtInfantCongenitalSyphilistreatment");
        String CSClassification = request.getParameter("txtCSClassification");
        String DateOfNonTreponemalTestMotherRecent = request.getParameter("txtDateOfNonTreponemalTestMotherRecent");
        String ResultOfNonTreponemalTestMotherRecen = request.getParameter("txtResultOfNonTreponemalTestMotherRecent");
        String TiterOfNonTreponemalTestMotherRecent = request.getParameter("txtTiterOfNonTreponemalTestMotherRecent");
        String DateOfNonTreponemalTestMotherRecenFirst = request.getParameter("txtDateOfNonTreponemalTestMotherRecenFirst");
        String ResultOfNonTreponemalTestMotherFirst = request.getParameter("txtResultOfNonTreponemalTestMotherFirst");
        String TiterOfNonTreponemalTestMotherFirst = request.getParameter("txtTiterOfNonTreponemalTestMotherFirst");
        String DateOfPositiveTreponemalTestRecent = request.getParameter("txtDateOfPositiveTreponemalTestRecent");
        String DateOfPositiveTreponemalTestFirst = request.getParameter("txtDateOfPositiveTreponemalTestFirst");
        String FirstPrenatalVisitTreponemalNontreponemal = request.getParameter("txtFirstPrenatalVisitTreponemalNontreponemal");
        String weeksgestationTreponemalNontreponemal = request.getParameter("txt2832weeksgestationTreponemalNontreponemal");
        String DeliveryTreponemalNontreponemal = request.getParameter("txtDeliveryTreponemalNontreponemal");

        /*  Fomating dates
         DateofReport
         MothersDOB
         ReceivedBenzathinePenicilinDate
         DateOfDelivery
         DateOfNonTreponemalTest
         DateOfNonTreponemalTest
         DateOfDeath
         DateOfNonTreponemalTestMotherRecent
         DateOfNonTreponemalTestMotherRecenFirst
         DateOfPositiveTreponemalTestRecent
         DateOfPositiveTreponemalTestFirst
         FirstPrenatalVisit
        
         DateOf1stTreponemalTest
         */
        Timestamp dateofReport = null;
        Timestamp mothersDOB = null;
        Timestamp receivedBenzathinePenicilinDate = null;
        Timestamp dateOfDelivery = null;
        Timestamp dateOfNonTreponemalTest = null;
        //Timestamp dateOfNonTreponemalTest= null;
        Timestamp dateOfDeath = null;
        Timestamp dateOfNonTreponemalTestMotherRecent = null;
        Timestamp dateOfNonTreponemalTestMotherRecenFirst = null;
        Timestamp dateOfPositiveTreponemalTestRecent = null;
        Timestamp dateOfPositiveTreponemalTestFirst = null;
        //LMPBeforeDelivery
        Timestamp lMPBeforeDelivery = null;
        Timestamp firstPrenatalVisit = null;
        Timestamp treponemaltestDoneDate = null;

        try {

            //// tblpatients
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            Date parsedDateofReport = formatter.parse(DateofReport + " 00:00:00");
            dateofReport = new java.sql.Timestamp(parsedDateofReport.getTime());

            Date parsedFirstPrenatalVisi = formatter.parse(FirstPrenatalVisit + " 00:00:00");
            firstPrenatalVisit = new java.sql.Timestamp(parsedFirstPrenatalVisi.getTime());

            // TreponemaltestDone
            Date parsedTreponemaltestDone = formatter.parse(TreponemaltestDoneDate + " 00:00:00");
            treponemaltestDoneDate = new java.sql.Timestamp(parsedTreponemaltestDone.getTime());
            Date parsedbeforeDelivery = formatter.parse(LMPBeforeDelivery + " 00:00:00");
            lMPBeforeDelivery = new java.sql.Timestamp(parsedbeforeDelivery.getTime());
            Date parsedmothersDOB = formatter.parse(MothersDOB + " 00:00:00");
            mothersDOB = new java.sql.Timestamp(parsedmothersDOB.getTime());
            Date parsedreceivedBenzathinePenicilinDate = formatter.parse(ReceivedBenzathinePenicilinDate + " 00:00:00");
            receivedBenzathinePenicilinDate = new java.sql.Timestamp(parsedreceivedBenzathinePenicilinDate.getTime());
            Date parseddateOfDelivery = formatter.parse(DateOfDelivery + " 00:00:00");
            dateOfDelivery = new java.sql.Timestamp(parseddateOfDelivery.getTime());
              Date parseddateOfNonTreponemalTest = formatter.parse(DateOfNonTreponemalTest + " 00:00:00");
            dateOfNonTreponemalTest = new java.sql.Timestamp(parseddateOfNonTreponemalTest.getTime());
            Date parseddateOfDeath = formatter.parse(DateOfDeath + " 00:00:00");
            dateOfDeath = new java.sql.Timestamp(parseddateOfDeath.getTime());
            Date parseddateOfNonTreponemalTestMotherRecent = formatter.parse(DateOfNonTreponemalTestMotherRecent + " 00:00:00");
            dateOfNonTreponemalTestMotherRecent = new java.sql.Timestamp(parseddateOfNonTreponemalTestMotherRecent.getTime());
            Date parseddateOfNonTreponemalTestMotherRecenFirst = formatter.parse(DateOfNonTreponemalTestMotherRecenFirst + " 00:00:00");
            dateOfNonTreponemalTestMotherRecenFirst = new java.sql.Timestamp(parseddateOfNonTreponemalTestMotherRecenFirst.getTime());
            Date parseddateOfPositiveTreponemalTestRecent = formatter.parse(DateOfPositiveTreponemalTestRecent + " 00:00:00");
            dateOfPositiveTreponemalTestRecent = new java.sql.Timestamp(parseddateOfPositiveTreponemalTestRecent.getTime());
            Date parseddateOfPositiveTreponemalTestFirst = formatter.parse(DateOfPositiveTreponemalTestFirst + " 00:00:00");
            dateOfPositiveTreponemalTestFirst = new java.sql.Timestamp(parseddateOfPositiveTreponemalTestFirst.getTime());

        } catch (Exception pe) {
            pe.printStackTrace();
        }

        String SignsOfCongenitalSyphilis = null;
        //  String SignsOfCongenitalSyphilis = request.getParameter("chkSignsOfCongenitalSyphilis");
        String[] SignsOfCongenitalSyphilisValues = request.getParameterValues("chkSignsOfCongenitalSyphilis");
        if (SignsOfCongenitalSyphilisValues != null) {
            for (String g : SignsOfCongenitalSyphilisValues) {
                SignsOfCongenitalSyphilis = "#" + g;
            }
        }
        /// to add service for adding STI Case
        StiCSableImpl csimp = new StiCSableImpl();
        StiCs cs = new StiCs();

        cs.setDateofReport(dateofReport);
        cs.setBirthWeight(BirthWeight);
        cs.setBoneXray(BoneXRay);
        cs.setCsclassification(CSClassification);
        cs.setCsfproteinCsfwb(CSFProteinCSFWBC);
        cs.setCsfvdrl(CSFVDRL);
        cs.setDarkiedExam(DarkiedExam);
        cs.setDateOfDeath(dateOfDeath);
        cs.setDateOfDelivery(dateOfDelivery);
        cs.setDateOfNonTreponemalTest(dateOfNonTreponemalTest);
        cs.setDateOfNonTreponemalTestMotherRecenFirst(dateOfNonTreponemalTestMotherRecenFirst);
        cs.setDateOfNonTreponemalTestMotherRecent(dateOfNonTreponemalTestMotherRecent);
        cs.setDateOfPositiveTreponemalTestFirst(dateOfPositiveTreponemalTestFirst);
        cs.setDateOfPositiveTreponemalTestRecent(dateOfPositiveTreponemalTestRecent);
        cs.setDateReceivingBenzathinePenicillin(receivedBenzathinePenicilinDate);
        cs.setFirstPrenatalVisit(firstPrenatalVisit);
        cs.setGestationalAge(GestationalAge);
        cs.setInfantCongenitalSyphilistreatment(InfantCongenitalSyphilistreatment);
        cs.setLmpbeforeDelivery(lMPBeforeDelivery);
        cs.setMotherHivstatusDuriPreg(MotherHIVStatusDuriPreg);
        cs.setMotherId(MothersName);
        cs.setMotherSyphilisTreatment(MotherSyphilisTreatment);
        cs.setMothersAddress(MothersAddress);
        cs.setMothersMaritalStatus(MothersMaritalStatus);
        cs.setMothersObsHistoryGravida(MothersObsHistoryGravida);
        cs.setMothersObsHistoryParity(MothersObsHistoryParity);
        cs.setMothersReligion(MothersReligion);
        cs.setNonTreponemaltest(NonTreponemaltest);
        //cs.setOpdnumber("");
        cs.setPeriodReceivingBenzathinePenicillin(PeriodReceivingBenzathinePenicillin);
        cs.setReportingFacility(ReportingFacility);
        cs.setResultOfNonTreponemalTestMotherFirst(ResultOfNonTreponemalTestMotherFirst);
        cs.setResultOfNonTreponemalTestMotherRecent(ResultOfNonTreponemalTestMotherRecen);
        cs.setSignsOfCongenitalSyphilis(SignsOfCongenitalSyphilis);
        //cs.setStinumber("");
        cs.setTiterOfNonTreponemalTest(TiterOfNonTreponemalTest);
        cs.setTiterOfNonTreponemalTestMotherFirst(TiterOfNonTreponemalTestMotherFirst);
        cs.setTiterOfNonTreponemalTestMotherRecent(TiterOfNonTreponemalTestMotherRecent);
        cs.setTreponemaltestDone(TreponemaltestDone);
        cs.setTreponemaltestDoneDate(treponemaltestDoneDate);
        cs.setTrimesterFirstPrenatalVisit(TrimesterFirstPrenatalVisit);
        cs.setVitalStatus(VitalStatus);
        cs.setIsNonTreponemalTestFirstVisit(FirstPrenatalVisitTreponemalNontreponemal);
        cs.setIsNonTreponemalTestWeeksGest(weeksgestationTreponemalNontreponemal);
        cs.setIsNonTreponemalTestDelivery(DeliveryTreponemalNontreponemal);
        cs.setCsfproteinCsfwb(CSFProteinCSFWBC);
        csimp.AddCS(cs);

        // session.setAttribute("cptsticlient", cptsticlient);
        response.sendRedirect("AllSTIClients");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
