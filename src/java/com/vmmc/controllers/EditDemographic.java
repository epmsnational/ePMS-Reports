/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Basicvitals;
import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Nextofkin;
import com.vmmc.entities.Patient;
import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientMedicalInsurance;
import com.vmmc.services.AddressablePatientImpl;
import com.vmmc.services.BasicVitalImpl;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.MedicalInsurancableImpl;
import com.vmmc.services.NextOfKinImpl;
import com.vmmc.services.NextOfKinnable;
import com.vmmc.services.ObjectCreator;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Developer
 */
@WebServlet(name = "EditDemographic", urlPatterns = {"/EditDemographic"})
public class EditDemographic extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditDemographic</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditDemographic at " + request.getContextPath() + "</h1>");
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
        //kinDb.remove(5);
        
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

Map<String,String[]>data= request.getParameterMap();
if(request.getParameter("formVariable").equalsIgnoreCase("next_of_kin_details"))
{
    //checklist for next of kin fields
    /*
    name,  surname ,   relationship ,  contactno , physicaladdress,  chief,  kraal, village, school, clinic,formVariable

    */
     NextOfKinnable  kinDb = new NextOfKinImpl();
     Nextofkin kin=new Nextofkin();
     kin.setId(Integer.parseInt(data.get("id")[0]));
     kin.setChief(data.get("chief")[0]);
     kin.setClinic(data.get("clinic")[0]);
     kin.setContactNumber(data.get("contactno")[0]);
     kin.setFirstName(data.get("name")[0]);
     kin.setKraal(data.get("kraal")[0]);
     kin.setLastName(data.get("surname")[0]);
     kin.setPhysicalAddress(data.get("physicaladdress")[0]);
     kin.setRelationType(data.get("relationship")[0]);
     kin.setVillage(data.get("village")[0]);
     kin.setSchool(data.get("school")[0]);
     kin.setOpdnumber(data.get("formKey")[0]);
     //now edit  db
     kinDb.edit(kin);
     
     
}
else if(request.getParameter("formVariable").equalsIgnoreCase("patient_contact_details"))
{
//checklist for PATIENT CONTACT DETAILS fields
/*
 mobileno, teleno, workaddress,  worktelno, chief,  kraal, village, school, clinic
*/
    AddressablePatientImpl addrDb = new AddressablePatientImpl();
    PatientAddress add = new PatientAddress();
    add.setId(Integer.parseInt(data.get("id")[0]));
    add.setMobileNumber(data.get("mobileno")[0]);
    add.setTelNumber(data.get("teleno")[0]);
    add.setWorkAddress(data.get("workaddress")[0]);
    add.setWorkTelNumber(data.get("worktelno")[0]);
    add.setChief(data.get("chief")[0]);
    add.setKraal(data.get("kraal")[0]);
    add.setVillage(data.get("village")[0]);
    add.setSchool(data.get("school")[0]);
    add.setClinic(data.get("clinic")[0]);
    add.setOpdnumber(data.get("formKey")[0]);
    addrDb.edit(add);
    
}
else if(request.getParameter("formVariable").equalsIgnoreCase("basic_vitals"))
{
//checklist for basic vitals fields
/*
 temperature, bloodpressure(systolic/dystolic), weight, height, functionalstatus, visitdate, other

*/
    
    BasicVitalImpl basicDb = new BasicVitalImpl ();
    Basicvitals bv = new Basicvitals();
    bv.setId(Integer.parseInt(data.get("id")[0]));
    bv.setTemperature(Float.parseFloat(data.get("temperature")[0]));
    bv.setBloodPressure(data.get("bloodpressure(systolic/dystolic)")[0]);
    bv.setWeight(Float.parseFloat(data.get("weight")[0]));
    bv.setHeight(Float.parseFloat(data.get("height")[0]));
    //bv.setFunctionalStatus(data.get("functionalstatus")[0]);
    //bv.setVisitDate(data.get("visitdate")[0]);
    basicDb.edit(bv);
    
    
    
    
    
}
else if(request.getParameter("formVariable").equalsIgnoreCase("medical_insurance"))
{
//checklist formedical_insurancen fields
/*
 medicalinsurancename, medicalsocnumber, schemetype, relation
*/
    MedicalInsurancableImpl medDb = new MedicalInsurancableImpl();
    PatientMedicalInsurance medin = new PatientMedicalInsurance();
    
    medin.setMedicalInsuranceName(data.get("medicalinsurancename")[0]);
    medin.setMedicalInsuranceNumber(data.get("medicalsocnumber")[0]);
    medin.setMedicalInsuranceScheme(data.get("schemetype")[0]);
    medin.setMedicalInsuranceRelation(data.get("relation")[0]);
    //medDb.edit(medin);
    
    
    
}
else if(request.getParameter("formVariable").equalsIgnoreCase("personal_details"))
{
//checklist for personal fields
/*
 opdnumber,  name,  surname,  nationalid,  gender, age, dateofregistration,  maritalstatus, orphanstatus, educationlevel, occupation
*/
    CircumcisablePatientImpl cirpaDb = new   CircumcisablePatientImpl();
    Patient patient = new Patient();
   
  
    patient.setFirstName(data.get("name")[0]);
    patient.setLastName(data.get("surname")[0]);
    patient.setNationalId(data.get("nationalid")[0]);
    patient.setSex(data.get("gender")[0]);
   // patient.setAge(data.get("age")[0]);
   
    patient.setMaritalStatus(data.get("maritalstatus")[0]);
    patient.setOphanStatus(data.get("orphanstatus")[0]);
    patient.setEducationalLevel(data.get("educationlevel")[0]);
    patient.setOccupation(data.get("occupation")[0]);
    String htsId=(data.get("htsId")[0]);
    if(htsId.length()>0)//maintain original status of the record hts
    patient.setHtsId(htsId);
    String tbId =data.get("tbId")[0];
    if(tbId.length()>0)//maintain original status of the record hts
    patient.setTbId(tbId);
    String vmmcId =data.get("vmmcId")[0];
    if(vmmcId.length()>0)//maintain original status of the record hts
    patient.setVmmcId(vmmcId);
     Timestamp dob = null;
        Timestamp regDate = null;
        try {
            String _dob=data.get("dateofbirth")[0];
            String _regDate=data.get("dateofregistration")[0];
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


    }
 public HashMap<String,String> handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HashMap<String,String>hashMap= new HashMap<>();
                   
            Enumeration<String> parameterNames = req.getParameterNames();
            
            while (parameterNames.hasMoreElements()) {
                String key=parameterNames.nextElement();
                hashMap.put(key, req.getParameter(key));
                System.out.println(key);
                
            }

        return hashMap;

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
