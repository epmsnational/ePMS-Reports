package com.art.controllers;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Tblpatients;
import com.vmmc.entities.Tbltests;
import com.vmmc.entities.Tblvisits;
import com.vmmc.entities.TblvisitsId;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.OIArtTestsImpl;
import com.vmmc.services.OIArtVisitableImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lmbano
 */
@WebServlet(name = "EditArtVisistCard", urlPatterns = {"/EditArtVisistCard"})
public class EditArtVisistCard extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditArtVisistCard</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditArtVisistCard at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String patientString = request.getQueryString();
        Map<String, String[]> data = request.getParameterMap();
        if (request.getParameter("formVariable").equalsIgnoreCase("tests")) {
    //checklist for next of kin fields
    /*
             name,  surname ,   relationship ,  contactno , physicaladdress,  chief,  kraal, village, school, clinic,formVariable

             */
            OIArtTestsImpl testimp = new OIArtTestsImpl();
            Tbltests test = new Tbltests();
            Tblpatients p = new Tblpatients();
            p.setPatientId(data.get("id")[0]);
            test.setTheId(Integer.parseInt(data.get("id")[0]));
            test.setTblpatients(p);
            test.setTestDate(null); //Test Date
            test.setResultDate(null); //Result Date
            test.setRecievedDate(null); //Date Received
            test.setResultNumeric(Float.parseFloat(data.get("result")[0])); //result
            test.setTestTypeId(data.get("testtype")[0]); ///testtype
            test.setResultNotes(data.get("notes")[0]);//Notes:
            //now edit  db
            testimp.edit(test);

        } else if (request.getParameter("formVariable").equalsIgnoreCase("arv")) {
//checklist for PATIENT CONTACT DETAILS fields
/*
             mobileno, teleno, workaddress,  worktelno, chief,  kraal, village, school, clinic
             */

        } else if (request.getParameter("formVariable").equalsIgnoreCase("tb_investigations")) {
//checklist for basic vitals fields
/*
             temperature, bloodpressure(systolic/dystolic), weight, height, functionalstatus, visitdate, other

             */

        } else if (request.getParameter("formVariable").equalsIgnoreCase("visit_details")) {
//checklist formedical_insurancen fields
/*
             medicalinsurancename, medicalsocnumber, schemetype, relation
             */
            OIArtVisitableImpl medDb = new OIArtVisitableImpl();
            Tblvisits vis = new Tblvisits();

            TblvisitsId patId = new TblvisitsId();
            patId.setPatientId(null);
            // patId.setVisitDate(data.get("visitdate")[0]);
            vis.setId(patId);

            /// vis.setVisitType(data.get("visitdate")[0]);
            vis.setVisitType(data.get("visittype")[0]);
            vis.setVisitTypeCode(data.get("dsdmodel")[0]);
            vis.setNowPregnant(data.get("pregnantstatus")[0]); //pregnantstatus 
            vis.setFamilyPlanningId(null);
            vis.setFunctionalStatusCode(data.get("functionalstatus")[0]);  //functionalstatus
            vis.setWhostage(Integer.parseInt(data.get("whostage")[0])); ///  WHO whostage
            vis.setTbstatusCode(data.get("tbstatuscode")[0]);/// tbstatuscode
            vis.setIptreasonCode(data.get("iptreason")[0]); /// IPT R iptreason
            //vis.setIptstatusCode(data.get("iptreason")[0]);
            vis.setArvreasonCode(Integer.parseInt(data.get("iptreason")[0]));
            //vis.setArvcode(Integer.parseInt(data.get("iptreason")[0]));
            vis.setNotes(null);
            vis.setAdverseEventsStatusCode(null);
      //vis.setDispenserId(Integer.parseInt(data.get("iptreason")[0]));
            //vis.setDateOfFirstAnc(data.get("dateoffirstanc")[0]); /// dateoffirstanc ANC
            //vis.setLnmpdate(data.get("lmpdate")[0]); //// LMP D lmpdate
            vis.setTbinvestigationResults(Integer.parseInt(data.get("tbinvestigation")[0])); /// TB I tbinvestigation
            vis.setIsIpteligibility(data.get("iptlegibility")[0]); /// IPT L iptlegibility
            medDb.edit(vis);

        } else if (request.getParameter("formVariable").equalsIgnoreCase("personal_details")) {
//checklist for personal fields
/*
             opdnumber,  name,  surname,  nationalid,  gender, age, dateofregistration,  maritalstatus, orphanstatus, educationlevel, occupation
             */
            CircumcisablePatientImpl cirpaDb = new CircumcisablePatientImpl();
            Patient patient = new Patient();

            patient.setFirstName(data.get("name")[0]);
            patient.setLastName(data.get("surname")[0]);
            patient.setNationalId(data.get("nationalid")[0]);
//            patient.setSex(data.get("gender")[0]);
   // patient.setAge(data.get("age")[0]);

            patient.setMaritalStatus(data.get("maritalstatus")[0]);
            patient.setOphanStatus(data.get("orphanstatus")[0]);
            patient.setEducationalLevel(data.get("educationlevel")[0]);
            patient.setOccupation(data.get("occupation")[0]);
            String htsId = (data.get("htsId")[0]);
            if (htsId.length() > 0)//maintain original status of the record hts
            {
                patient.setHtsId(htsId);
            }
            String tbId = data.get("tbId")[0];
            if (tbId.length() > 0)//maintain original status of the record hts
            {
                patient.setTbId(tbId);
            }
            String vmmcId = data.get("vmmcId")[0];
            if (vmmcId.length() > 0)//maintain original status of the record hts
            {
                patient.setVmmcId(vmmcId);
            }
            Timestamp dob = null;
            Timestamp regDate = null;
            try {
                String _dob = data.get("dateofbirth")[0];
                String _regDate = data.get("dateofregistration")[0];
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date parsedDate = formatter.parse(_dob + " 00:00:00");
                dob = new java.sql.Timestamp(parsedDate.getTime());
                Date parsedReg = formatter.parse(_regDate + " 00:00:00");
                regDate = new java.sql.Timestamp(parsedReg.getTime());
            } catch (Exception pe) {
                pe.printStackTrace();
            }
            patient.setRegistrationDate(regDate);
            patient.setDob(dob);
            patient.setOpdnumber(data.get("opdnumber")[0]);
            patient.setFacilityCode(data.get("facilityCode")[0]);
            cirpaDb.editFullPatient(patient);

        }
        request.setAttribute(patientString, patientString);
        response.sendRedirect(
                    "ArtVisitClientCard");
        

    }

    public HashMap<String, String> handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HashMap<String, String> hashMap = new HashMap<>();

        Enumeration<String> parameterNames = req.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String key = parameterNames.nextElement();
            hashMap.put(key, req.getParameter(key));
            System.out.println(key);

        }

        return hashMap;

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
