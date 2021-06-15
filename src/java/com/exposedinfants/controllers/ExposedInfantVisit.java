package com.exposedinfants.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.entities.Tblexposedinfantvisits;
import com.vmmc.entities.TblexposedinfantvisitsId;
import com.vmmc.services.CompletedExposedInfantClientAll;
import com.vmmc.services.ExposedInfantVistableImpl;
import com.vmmc.services.ExposedInfantableImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mbanol
 */
public class ExposedInfantVisit extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ExposedInfantVisit</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ExposedInfantVisit at " + request.getContextPath() + "</h1>");
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
        //client.getp
        //get a patient object
        ExposedInfantableImpl EIpp = new ExposedInfantableImpl();
        Tblexposedinfants p = EIpp.getExposedInfant(ExposedInfantId);
//        ExposedInfantVistableImpl exp = new ExposedInfantVistableImpl();
//        List<Tblexposedinfantvisits> eivisits = exp.getExposedInfantVisits(ExposedInfantId);
        client.setP(p);
//        client.setExposedinfantvisits(eivisits);

        request.getSession().setAttribute("client", client);
        request.getSession().setAttribute("EIID", ExposedInfantId);
        RequestDispatcher disp = request.getRequestDispatcher("exposeinfants/newExposedInfantVisit.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
// Step 1
        String exposedInfantId = request.getParameter("txtEINUmber");
        String reviewDate = request.getParameter("txtEIDateOfReview");
        String EINextReviewDate = request.getParameter("txtEINextReviewDate");
        String visitType = request.getParameter("txtEIVisitType");
        String clinicName = request.getParameter("txtEITransitClinicName");
        String feedingtype = request.getParameter("txtEIFeedingType");
        String otherFeedingtype = request.getParameter("txtEIOtherFeedingType");

        double weight = Double.parseDouble(request.getParameter("txtEIWeight"));

        int immunizationStatus = Integer.parseInt(request.getParameter("txtEIImmunizationStatus"));
// Step 2
        String cotrimoxazoleSupplied = request.getParameter("txtEICotrimoxazoleSupplied");
        String EINVP = request.getParameter("txtEINVP");
        String EIHIVTestCode = request.getParameter("txtEIHIVTestCode");
        String EIHIVTestResult = request.getParameter("txtEIHIVTestResult");
        String EIHIVResultIssued = request.getParameter("txtEIHIVResultIssued");
        String EIComment = request.getParameter("txtEIComment");

        //change dates to time stamps
        Timestamp visitdate = null; ///reviewDate
        Timestamp nextRevewDate = null; ///EINextReviewDate
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedVisDate = formatter.parse(reviewDate + " 00:00:00");
            visitdate = new java.sql.Timestamp(parsedVisDate.getTime());

            Date parsedNextRevD = formatter.parse(EINextReviewDate + " 00:00:00");
            nextRevewDate = new java.sql.Timestamp(parsedNextRevD.getTime());
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());

        ExposedInfantVistableImpl visImp = new ExposedInfantVistableImpl();
        Tblexposedinfantvisits vis = new Tblexposedinfantvisits();
        TblexposedinfantvisitsId id = new TblexposedinfantvisitsId();
        id.setExposedInfantId(exposedInfantId);
        id.setVisitDate(visitdate);
        vis.setId(id);
        vis.setFeedingPracticeId(feedingtype);
        vis.setNextVisitDate(nextRevewDate);
        vis.setVisitTypeCode(visitType);
        vis.setTheTimeStamp(currentTimestamp);
        vis.setImmunizationsUpToDate(immunizationStatus);
        vis.setWeight(weight);
        vis.setCotriSupplied(cotrimoxazoleSupplied);
        vis.setNvpsupplied(EINVP);
        vis.setTypeOfHivtestCode(EIHIVTestCode);
        vis.setHivtestResult(EIHIVTestResult);
        vis.setHivresultIssued(EIHIVResultIssued);
        
        vis.setComments(EIComment);

        visImp.AddExposedInfantVisit(vis);
        
        response.sendRedirect("AllExposedInfants");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
