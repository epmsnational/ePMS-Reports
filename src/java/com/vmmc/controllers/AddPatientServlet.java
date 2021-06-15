/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Functionalstatustype;
import com.vmmc.entities.Nextofkin;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Nationality;
import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientMedicalInsurance;
import com.vmmc.entities.Setupmedicalaidsocities;
import com.vmmc.services.AddressablePatientImpl;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.MedicalInsurancableImpl;
import com.vmmc.services.Nationalities;
import com.vmmc.services.NextOfKinImpl;
import com.vmmc.services.PatientModel;
import com.vmmc.services.SetupFunctionalStatusImpl;
import com.vmmc.services.SetupMedicalAidSocitiesImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mbanol
 */
@WebServlet(name = "AddPatientServlet", urlPatterns = {"/AddPatientServlet"})
public class AddPatientServlet extends HttpServlet {

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
        //ajax for date
        String date = request.getParameter("dob");
        String theAge = request.getParameter("dobAge");
        if (date != null) {
            Timestamp dob = null;
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date parsedDate = formatter.parse(date + " 00:00:00");
                dob = new java.sql.Timestamp(parsedDate.getTime());

            } catch (Exception pe) {
                pe.printStackTrace();
            }
            //if(request.getParameter("user")=="")
            float age = (float) EpmsDuration.getDays(dob) / 365.0f;
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(2);
            String finalAge = nf.format(age);
            response.getWriter().write(finalAge);
        } else if (theAge != null) {
            Calendar cal = Calendar.getInstance();
            float age = Float.parseFloat(theAge);
            int months = Math.round(age * 12 * -1);
            cal.add(Calendar.MONTH, months);
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            String finalDate = df.format(cal.getTime());
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(finalDate);
        } else {
            String opdStub = province + "-" + district + "-" + facili;
            String locationForOpd = null;
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
                java.util.Date timeStamp = format.parse(currentTimestamp.toString());

                locationForOpd = opdStub + "-" + currentTimestamp.toString().substring(0, 4);
                locationForOpd += currentTimestamp.toString().substring(4, currentTimestamp.toString().length()).replaceAll(":", "-");
                locationForOpd = locationForOpd.replace(" ", "-");
            } catch (Exception e) {
            }
            request.setAttribute("opdnum", locationForOpd);

            SetupMedicalAidSocitiesImpl sam = new SetupMedicalAidSocitiesImpl();
            List<Setupmedicalaidsocities> lst = sam.getSetupMedicalAid();

            HttpSession ses = request.getSession();
            ses.setAttribute("societies", lst);

            SetupFunctionalStatusImpl fsi = new SetupFunctionalStatusImpl();
            List<Functionalstatustype> flst = fsi.getSetupFunctionalStatus();

            ses.setAttribute("functions", flst);

            Nationalities nat = new Nationalities();
            List<Nationality> nations = nat.getNation();

            ses.setAttribute("nations", nations);

            RequestDispatcher disp = request.getRequestDispatcher("demographic/Demographics.jsp");
            disp.forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //get parameters from request for patient
        String opdNum = request.getParameter("txtOpdNum");
        String natId = request.getParameter("txtNatId");
        String type = request.getParameter("txtType");
        String name = request.getParameter("txtName");
        String surname = request.getParameter("txtSurname");
        String dTemp = request.getParameter("txtDob");
        String gender = request.getParameter("txtGender");
        String national = request.getParameter("txtNational");

        String option = "NC";
        String uniqueID = request.getParameter("txtUniqNum");
        String dateUnique = request.getParameter("txtUniqRegDate");
        String facCode = request.getParameter("txtUniqFacCode");

        /// Checking  if patient demographics exist
//        String[] arr1 = dTemp.split("[/-]");
//        Calendar cal = Calendar.getInstance();
//        cal.set(Integer.parseInt(arr1[2]), Integer.parseInt(arr1[1]), Integer.parseInt(arr1[0]));
//        Date dob = cal.getTime();
        String occupation = request.getParameter("txtOccupation");
        String facilityCode = request.getParameter("txtFacilityCode");
        String maritalStatus = request.getParameter("txtMarital");
        String eduLevel = request.getParameter("txtEducation");
        String regTemp = request.getParameter("txtRegDate");
        String regdStr = regTemp.length() > 0 ? regTemp : new java.util.Date().toString();
        String orphanStatus = request.getParameter("txtOrphan");
        //int age = Integer.parseInt(request.getParameter("txtAge"));
        /*
         given age and not dob, calculate dob from the age provided
         otherwise just consider the dob provided        
         */
        //change dates to time stamps
        Timestamp dob = null;
        Timestamp regDate = null;
        Timestamp regUniqDate = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedDate = formatter.parse(dTemp + " 00:00:00");
            dob = new java.sql.Timestamp(parsedDate.getTime());
            Date parsedReg = formatter.parse(regdStr + " 00:00:00");
            regDate = new java.sql.Timestamp(parsedReg.getTime());
            Date parsedUniqReg = formatter.parse(dateUnique + " 00:00:00");
            regUniqDate = new java.sql.Timestamp(parsedUniqReg.getTime());
        } catch (Exception pe) {
            pe.printStackTrace();
        }

        //get values for the patient address
        String address = request.getParameter("txtAddress");
        String telNo = request.getParameter("txtTelNo");
        String mobile = request.getParameter("txtMobile");
        String school = request.getParameter("txtSchool");
        String village = request.getParameter("txtVillage");
        String kraal = request.getParameter("txtKraal");
        String chief = request.getParameter("txtChief");
        String clinic = request.getParameter("txtClinic");
        String alternateAdd = request.getParameter("txtAlternativeAdd");

        // get values for nextof kin
        String kinName = request.getParameter("txtKinName");
        String kinSurname = request.getParameter("txtKinSurname");
        String kinGender = request.getParameter("txtKinGender");
        String kinOccupation = request.getParameter("txtKinOccupation");
        String kinAddress = request.getParameter("txtKinAddress");
        String kinTelNo = request.getParameter("txtKinTelNo");
        String kinMobile = request.getParameter("txtKinMobile");
        String kinSchool = request.getParameter("txtKinSchool");
        String kinVillage = request.getParameter("txtKinVillage");
        String kinKraal = request.getParameter("txtKinKraal");
        String kinChief = request.getParameter("txtKinChief");

        // get values for basic vitals
//        float temperature = Float.parseFloat(request.getParameter("txtTemperature"));
//        float weight = Float.parseFloat(request.getParameter("txtWeight"));
//        float height = Float.parseFloat(request.getParameter("txtHeight"));
//        int bpSystolic = Integer.parseInt(request.getParameter("txtBpSystolic"));
//        int bpDiastolic = Integer.parseInt(request.getParameter("txtBpDiastolic"));
//        String funcStatus = request.getParameter("txtFuncStatus");
        // get values for patient medica insurance
        String insName = request.getParameter("txtInsuranceName");
        String insScheme = request.getParameter("txtInsScheme");
        String insNo = request.getParameter("txtInsuranceNo");
        String insPrincipal = request.getParameter("txtPrincipalMemberName");

        CircumcisablePatientImpl db = new CircumcisablePatientImpl();
        List<Patient> plist = db.getAllPatients();

        if (natId.isEmpty() || natId == "") {
            // if (name != " " && surname != " " && dTemp != " " && gender != " ") {
            String ckpatient = name + surname + dTemp + gender;
            String cknsdpat = name + surname + dTemp;

            for (Patient p : plist) {
                String dbname = p.getFirstName();
                String dbsname = p.getLastName();
                String dbsex = p.getSex();
                Date dbdob = p.getDob();

                String dbpatient = dbname + dbsname + dbdob + dbsex;
                String dbnsdpat = dbname + dbsname + dbdob;
                boolean retVal = true;
                if (ckpatient.equalsIgnoreCase(dbpatient)) {

                    request.setAttribute("errorvmmc", "reg0");
                    retVal = false;
                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
                } else if (cknsdpat.equalsIgnoreCase(dbnsdpat)) {
                    request.setAttribute("errorvmmc", "reg1");
                    retVal = false;

                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                } else {
                    continue;
                }

            }
            Patient p = new Patient();
            Nationality nation = new Nationality();
            p.setDob(dob);

            p.setEducationalLevel(eduLevel);

            p.setFacilityCode(facilityCode);

            p.setFirstName(name);

            p.setLastName(surname);

            p.setMaritalStatus(maritalStatus);

            p.setNationalId(natId);

            p.setType(type);

            p.setOccupation(occupation);
            
            p.setOpdnumber(opdNum);
            
            p.setSex(gender);

            nation.setName(national);

            p.setOphanStatus(orphanStatus);
            PatientModel cpatient = new PatientModel();

            // create a DaoImpl instance
            //  CircumcisablePatientImpl db = new CircumcisablePatientImpl();
            if (db.add(p)
                    > 0) {
                //db.add(p);
                //calculate age
                Timestamp stamp = Timestamp.valueOf(p.getDob().toString());

                p.setAge((float) EpmsDuration.getDays(stamp) / 365.0f);

                AddressablePatientImpl adDb = new AddressablePatientImpl();
                PatientAddress pa = new PatientAddress();
                pa.setChief(chief);
                pa.setClinic(clinic);
                pa.setKraal(kraal);
                pa.setMobileNumber(mobile);

                if (option.equalsIgnoreCase("NC")) {
                    pa.setOpdnumber(opdNum);
                } else if ((option.equalsIgnoreCase("TI"))) {
                    List<PatientAddress> pati = adDb.checkAddress(uniqueID);
                    boolean retVal = true;
                    if (pati.isEmpty()) {
                        pa.setOpdnumber(uniqueID);
                    } else {
                        request.setAttribute("errorvmmc", "existReg");
                        retVal = false;
                        request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                    }
                }

                pa.setPhysicalAddress(address);
                pa.setSchool(school);
                pa.setTelNumber(telNo);
                pa.setVillage(village);
                pa.setWorkAddress(alternateAdd);

                //  pa.setWorkAddress(workaddress);
                //pa.setWorkTelNumber(bustell);
                cpatient.setAddress(pa);
                adDb.addAdd(pa);
                adDb = null;

//                BasicVitalImpl vitDb = new BasicVitalImpl();
//                Basicvitals vts = new Basicvitals();
//            // vts.setBloodPressure(bpDiastolic);
//
//                // vts.setFunctionalStatus(funcStatus);
//                vts.setOpdnumber(opdNum);
//                vts.setTemperature(temperature);
//                vts.setWeight(weight);
//                vts.setHeight(height);
//                vts.setBloodPressure(bpSystolic + "/" + bpDiastolic);
//                cpatient.setbVitals(vts);
//                vitDb.add(vts);
//                vitDb = null;
                MedicalInsurancableImpl medicDb = new MedicalInsurancableImpl();
                PatientMedicalInsurance pmi = new PatientMedicalInsurance();
                pmi.setMedicalInsuranceName(insName);
                pmi.setMedicalInsuranceNumber(insNo);
                pmi.setMedicalInsuranceRelation(insPrincipal);
                pmi.setMedicalInsuranceScheme(insScheme);

                if (option.equalsIgnoreCase("NC")) {
                    pmi.setOpdnumber(opdNum);
                } else if ((option.equalsIgnoreCase("TI"))) {
                    List<PatientMedicalInsurance> pati = medicDb.getPatientMedicalInsurance(uniqueID);
                    boolean retVal = true;
                    if (pati.isEmpty()) {
                        pmi.setOpdnumber(uniqueID);
                    } else {
                        request.setAttribute("errorvmmc", "existReg");
                        retVal = false;
                        request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);

                    }
                }

                medicDb.add(pmi);
                cpatient.setIns(pmi);
                medicDb = null;

                NextOfKinImpl nkiDb = new NextOfKinImpl();
                Nextofkin nki = new Nextofkin();
                nki.setChief(kinChief);
                nki.setVillage(kinVillage);
                nki.setKraal(kinKraal);
                nki.setFirstName(kinName);
                nki.setLastName(kinSurname);
                nki.setPhysicalAddress(kinAddress);
                nki.setContactNumber(kinTelNo);
                nki.setSchool(kinSchool);
                nki.setOpdnumber(opdNum);
                nkiDb.add(nki);

                cpatient.setNok(nki);
                nkiDb = null;

                cpatient.setPatient(p);
                request.setAttribute("pmodel", cpatient);

                RequestDispatcher disp = request.getRequestDispatcher("demographic/patientCard.jsp");
                disp.forward(request, response);

            }

        } else {

            String formNId = natId.replaceAll("-", "");
            for (Patient p : plist) {
                String nationalid = p.getNationalId();
                if (nationalid != null) {
                    String dbNId = nationalid.replaceAll("-", "");
                    boolean retVal = true;
                    if (dbNId.equalsIgnoreCase(formNId)) {
                        request.setAttribute("errorvmmc", "reg2");
                        retVal = false;
                        request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
                    }
                }
            }

            if (regTemp == "") {
                request.setAttribute("errorvmmc", "reg3");
                //retVal = false;
                request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
            }

            //mold a patient from the above data
            Patient p = new Patient();

            p.setDob(dob);

            p.setEducationalLevel(eduLevel);

            p.setFacilityCode(facilityCode);

            p.setFirstName(name);

            p.setLastName(surname);

            p.setMaritalStatus(maritalStatus);

            p.setNationalId(natId);

            p.setOccupation(occupation);

            p.setOpdnumber(opdNum);
            p.setRegistrationDate(regDate);
//            } else if ((option.equalsIgnoreCase("TI"))) {
//                List<Patient> pati = db.checkPatient(uniqueID);
//                boolean retVal = true;
//                if (pati.isEmpty()) {
//                    p.setOpdnumber(uniqueID);
//                    p.setRegistrationDate(regUniqDate);
//                    p.setFacilityCode(facCode);
//                } else {
//                    request.setAttribute("errorvmmc", "existReg");
//                    retVal = false;
//                    request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
//
//                }
//            }

            p.setSex(gender);

            p.setOphanStatus(orphanStatus);
            PatientModel cpatient = new PatientModel();

            if (db.add(p) > 0) {
                Timestamp stamp = Timestamp.valueOf(p.getDob().toString());

                p.setAge((float) EpmsDuration.getDays(stamp) / 365.0f);

                AddressablePatientImpl adDb = new AddressablePatientImpl();
                PatientAddress pa = new PatientAddress();

                pa.setOpdnumber(opdNum);
                pa.setChief(chief);
                pa.setClinic(clinic);
                pa.setKraal(kraal);
                pa.setMobileNumber(mobile);
                pa.setPhysicalAddress(address);
                pa.setSchool(school);
                pa.setTelNumber(telNo);
                pa.setVillage(village);
                pa.setWorkAddress(alternateAdd);
                cpatient.setAddress(pa);
//                } else if ((option.equalsIgnoreCase("TI"))) {
//                    List<PatientAddress> pati = adDb.checkAddress(uniqueID);
//                    boolean retVal = true;
//                    if (pati.size() == 0) {
//                        pa.setOpdnumber(uniqueID);
//                        pa.setChief(chief);
//                        pa.setClinic(clinic);
//                        pa.setKraal(kraal);
//                        pa.setMobileNumber(mobile);
//                        pa.setPhysicalAddress(address);
//                        pa.setSchool(school);
//                        pa.setTelNumber(telNo);
//                        pa.setVillage(village);
//                        pa.setWorkAddress(alternateAdd);
//                        cpatient.setAddress(pa);
//                    } else {
//                        request.setAttribute("errorvmmc", "existReg");
//                        retVal = false;
//                        request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
//                    }
//                }
                adDb.addAdd(pa);
                adDb = null;

                MedicalInsurancableImpl medicDb = new MedicalInsurancableImpl();
                PatientMedicalInsurance pmi = new PatientMedicalInsurance();

//                if (option.equalsIgnoreCase("NC")) {
                pmi.setOpdnumber(opdNum);
                pmi.setMedicalInsuranceName(insName);
                pmi.setMedicalInsuranceNumber(insNo);
                pmi.setMedicalInsuranceRelation(insPrincipal);
                pmi.setMedicalInsuranceScheme(insScheme);
//                } else if ((option.equalsIgnoreCase("TI"))) {
//                    List<PatientMedicalInsurance> pati = medicDb.getPatientMedicalInsurance(uniqueID);
//                    boolean retVal = true;
//                    if (pati.size() == 0) {
//                        pmi.setOpdnumber(uniqueID);
//                        pmi.setMedicalInsuranceName(insName);
//                        pmi.setMedicalInsuranceNumber(insNo);
//                        pmi.setMedicalInsuranceRelation(insPrincipal);
//                        pmi.setMedicalInsuranceScheme(insScheme);
//                    } else {
//                        request.setAttribute("errorvmmc", "existReg");
//                        retVal = false;
//                        request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
//                    }
//                }
                medicDb.add(pmi);
                cpatient.setIns(pmi);
                medicDb = null;

                NextOfKinImpl nkiDb = new NextOfKinImpl();
                Nextofkin nki = new Nextofkin();

//                if (option.equalsIgnoreCase("NC")) {
                nki.setOpdnumber(opdNum);
                nki.setChief(kinChief);
                nki.setVillage(kinVillage);
                nki.setKraal(kinKraal);
                nki.setFirstName(kinName);
                nki.setLastName(kinSurname);
                nki.setPhysicalAddress(kinAddress);
                nki.setContactNumber(kinTelNo);
                nki.setSchool(kinSchool);
//                } else if ((option.equalsIgnoreCase("TI"))) {
//                    nki.setOpdnumber(uniqueID);
//                    nki.setChief(kinChief);
//                    nki.setVillage(kinVillage);
//                    nki.setKraal(kinKraal);
//                    nki.setFirstName(kinName);
//                    nki.setLastName(kinSurname);
//                    nki.setPhysicalAddress(kinAddress);
//                    nki.setContactNumber(kinTelNo);
//                    nki.setSchool(kinSchool);
//                    List<Nextofkin> pati = nkiDb.getNextOfKin(uniqueID);
//                    boolean retVal = true;
//                    if (pati.size() == 0) {
//                        nki.setOpdnumber(uniqueID);
//                        nki.setChief(kinChief);
//                        nki.setVillage(kinVillage);
//                        nki.setKraal(kinKraal);
//                        nki.setFirstName(kinName);
//                        nki.setLastName(kinSurname);
//                        nki.setPhysicalAddress(kinAddress);
//                        nki.setContactNumber(kinTelNo);
//                        nki.setSchool(kinSchool);
//                    } else {
//                        request.setAttribute("errorvmmc", "existReg");
//                        retVal = false;
//                        request.getRequestDispatcher("vmmc/errors.jsp").forward(request, response);
//
//                    }
//                }

                nkiDb.add(nki);

                cpatient.setNok(nki);
                nkiDb = null;

                cpatient.setPatient(p);
                // List<Patient> listClients = new CircumcisablePatientImpl().getAllPatients();//change to return all Vmmcs
                //request.setAttribute("patients", listClients);
                // RequestDispatcher disp = request.getRequestDispatcher("demographic/AllPatients.jsp");
                request.setAttribute("pmodel", cpatient);

                RequestDispatcher disp = request.getRequestDispatcher("demographic/patientCard.jsp");
                disp.forward(request, response);

            }

        }

    }

//dispatch to visits page of this particular patient
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
