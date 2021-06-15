package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblsetupstatus;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.TblstatusId;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompleteGenericPatient;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtFollowUpStatusImpl;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lmbano
 */
@WebServlet(name = "ArtUpdateFolloUpStatus", urlPatterns = {"/ArtUpdateFolloUpStatus"})
public class ArtUpdateFolloUpStatus extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArtUpdateFolloUpStatus</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArtUpdateFolloUpStatus at " + request.getContextPath() + "</h1>");
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
        // OIArtFollowUpStatusImpl flo = new OIArtFollowUpStatusImpl();

        String[] temp = request.getQueryString().split("&");
        String oinumber = temp[0];
        String opdNum = temp[1];
        // CompletedARTClientAll cptdArtClient = new CompletedARTClientAll(oinumber);
        CircumcisablePatientImpl pat = new CircumcisablePatientImpl();

        //PatientModel pm = new PatientModel();
        Patient patient = pat.getOIArtPatient(oinumber);
         //cptdArtClient.setP(patient);
        SetupServiceImpl setup = new SetupServiceImpl();
        CompleteGenericPatient cgp = new CompleteGenericPatient(opdNum);
        request.setAttribute("patient", patient);
        HttpSession session = request.getSession();
        session.setAttribute("patient", patient);
        List<Tblsetupstatus> statuslist = setup.getOIFollowupStatus();
        request.setAttribute("followupstatus", statuslist);
        List<Facilities> failitylist = setup.getFacilityTypes();
        request.setAttribute("failitylist", failitylist);

        request.getRequestDispatcher("art/ArtUpdateFollowUpStatus.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        Patient p = (Patient) session.getAttribute("patient"); // patient get from patient registration
        String patientId = p.getPatientId();
        String Date = request.getParameter("txtDate");
        String TranferredTo = request.getParameter("slcOITransferredTo");
        String notes = request.getParameter("txtNotes");
        String FollowUpStatus = request.getParameter("slcFollowUpStatus");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Timestamp reviewDate = null;//DateOfReview
        try {
            Date parsedDate = formatter.parse(Date + " 00:00:00");
            reviewDate = new java.sql.Timestamp(parsedDate.getTime());
        } catch (Exception pe) {
            pe.printStackTrace();
        }
        if (FollowUpStatus
                != null) {
            if (!FollowUpStatus.isEmpty()) {

                if (!FollowUpStatus.equalsIgnoreCase("TO")) {
                    OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                    Tblstatus followupstatus = new Tblstatus();
                    TblstatusId followupstatusid = new TblstatusId();
                    followupstatusid.setPatientId(patientId);
                    followupstatusid.setStatusDate(reviewDate);
                    followupstatus.setId(followupstatusid);
                    followupstatus.setStatus(FollowUpStatus);
                    followupstatus.setTransferOutToWhere(TranferredTo);
                    followupstatus.setNotes(notes);
                    followupstatusDB.AddArtFollowupstatus(followupstatus);
                } else {
                    OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                    Tblstatus followupstatus = new Tblstatus();
                    TblstatusId followupstatusid = new TblstatusId();
                    followupstatusid.setPatientId(patientId);
                    followupstatusid.setStatusDate(reviewDate);
                    followupstatus.setId(followupstatusid);
                    followupstatus.setStatus(FollowUpStatus);
                    followupstatus.setTransferOutToWhere(TranferredTo);
                    followupstatus.setNotes(notes);
                    followupstatusDB.AddArtFollowupstatus(followupstatus);
                }
            }
        }

        response.sendRedirect(
                "AllOIARTServ");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
