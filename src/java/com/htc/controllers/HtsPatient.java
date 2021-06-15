package com.htc.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Htc;
import com.vmmc.entities.HtcHivresult;
import com.vmmc.entities.HtcSetuphtcapproach;
import com.vmmc.entities.HtcSetuphtcmodel;
import com.vmmc.entities.HtcTestreason;
import com.vmmc.entities.HtsEntrypoint;
import com.vmmc.entities.HtsSqnumber;
import com.vmmc.entities.Patient;
import com.vmmc.entities.SetupreferredTo;
import com.vmmc.entities.Setupreferredfrom;
import com.vmmc.services.CircumcisablePatientImpl;
import com.vmmc.services.CompletedHtsClientAll;
import com.vmmc.services.EpmsDuration;
import com.vmmc.services.FacilityConfig;

import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.HtcHivresultServiceImpl;
import com.vmmc.services.HtsSequentialImpl;
import com.vmmc.services.HtsablePatientImpl;
import com.vmmc.services.SetupServiceImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
 * @author leon-mbano
 */
@WebServlet(name = "HtsPatient", urlPatterns = {"/HtsPatient"})
public class HtsPatient extends HttpServlet {

    static SetupServiceImpl setup = new SetupServiceImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        FacilityConfig facility = new FacilityConfig();
        FacilityConfigServiceImpl serv = new FacilityConfigServiceImpl();
        
        Facilityconfig data = serv.getFacilitySite();
        int province = data.getProvinceId();
        String district = data.getDistrictId();
        String facili = data.getFacilityId();
        Facilities config = facility.getFacilityName(province,district,facili);
        request.setAttribute("facilityName",config.getFacilityName());
        
        Date dateY = new Date();

        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String Year = yearFormat.format(dateY);
        String prov = String.valueOf(province);
        String facID = prov + "-" + data.getDistrictId() + "-" + facili + "-" + Year + "-" + "V";
        request.setAttribute("facilityID", facID);
        
        List<HtcSetuphtcapproach> lstHtcSetuphtcapproach = setup.getHtcApproaches();
        request.setAttribute("htcapproach", lstHtcSetuphtcapproach);

        List<HtsEntrypoint> lstHtsEntrypoint = setup.getHtsEntrypoints();
        request.setAttribute("htcentrypoint", lstHtsEntrypoint);
//        
        List<SetupreferredTo> lstSetupreferredTo = setup.getSetupReferredTos();
        request.setAttribute("referredTo", lstSetupreferredTo);

        List<Setupreferredfrom> referrals = setup.getSetupReferredFroms();
        request.setAttribute("referrals", referrals);

        List<HtcTestreason> testReason = setup.getHtcTestReasons();
        request.setAttribute("Testreason", testReason);

        List<HtcSetuphtcapproach> htcappi = setup.getHtcApproaches();
        request.setAttribute("htcapproach", htcappi);

        List<HtcSetuphtcmodel> htcmodel = setup.getHtcModels();
        request.setAttribute("htcmodel", htcmodel);
        List<HtcSetuphtcmodel> htcfacilitymodel = setup.getHtcFacilityModels();
        request.setAttribute("htcfacilitymodel", htcfacilitymodel);

        List<HtcSetuphtcmodel> htccomunitymodel = setup.getHtcComunityModels();
        request.setAttribute("htccomunitymodel", htccomunitymodel);
        //get patient details
        Patient p = null;
        Htc h = null;
        HttpSession session = request.getSession();
        String tempClient = (String) request.getAttribute("opdNum");
        p = tempClient == null ? (Patient) session.getAttribute("patient") : new HtsablePatientImpl().getPatient(tempClient);

        
        float age = 0;

        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());

        Date date = p.getDob();
        Timestamp stamp = new Timestamp(date.getTime());
        age = (float) EpmsDuration.getDays(stamp) / 365.0f;
        p.setAge(age);
        String htcNum = p.getHtsId();
        session.setAttribute("patient", p);
        session.setAttribute("htcNum", htcNum);

        RequestDispatcher disp = request.getRequestDispatcher("htc/Htcservices_1_1.jsp");
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
        HttpSession session = request.getSession();
        //take patient from session

        
        //creating HTS Number using system
        Facilityconfig fc = new FacilityConfigServiceImpl().getFacilityConfig(1);
        HtsSqnumber sqn = new HtsSqnumber();
        HtsSequentialImpl sqnservive = new HtsSequentialImpl();
        sqn = sqnservive.findByID(1);
        String htsnumberStub = fc.getProvinceId() + "-" + fc.getDistrictId() + "-" + fc.getFacilityId();
        // String locationForHts = null;
        String locationForHts = null;
        String currentyear = null;
        int yearvaluestored;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            java.util.Date timeStamp = format.parse(currentTimestamp.toString());

            currentyear = currentTimestamp.toString().substring(0, 4);
            yearvaluestored = sqn.getYear();

            //////
            if (yearvaluestored != Integer.parseInt(currentyear)) {
                int newyear = Integer.parseInt(currentyear);
                int serialnum = 1;
                locationForHts = htsnumberStub + "-"
                        + newyear + "-" + "V" + "-" + serialnum;
                sqn.setYear(newyear);
                sqn.setSqnumber(2);
                sqnservive.edidSeqnumber(sqn);
            } else {
                locationForHts = htsnumberStub + "-"
                        + currentyear + "-" + "V" + "-" + sqn.getSqnumber();
                sqn.setSqnumber(sqn.getSqnumber() + 1);

                sqnservive.edidSeqnumber(sqn);
            }

        } catch (Exception e) {
        }

        Patient p = (Patient) request.getSession().getAttribute("patient");
        String htcfacilitynumber = request.getParameter("txtFacHTCNum");
        String htcsequentialnumber = request.getParameter("txtsequential");
        String htcnumber = htcfacilitynumber+"-"+htcsequentialnumber;
        // System generated HTS number 
        ///// String htcnumber =locationForHts;
        Date dateOfBirth = p.getDob();
        String gender = p.getSex();
        String regDate = request.getParameter("txtHtcRegDate");

        String Entrypoint = request.getParameter("txtEntryPoint");
        int entrypoint = Integer.parseInt(Entrypoint);
        //Step 2
        String iscoupled = request.getParameter("txtIsCouple");
        String coupledTo = request.getParameter("txtCoupledTo");
       // String referredFrm = request.getParameter("txtReferred");
        //int refFrm = Integer.parseInt(referredFrm);
        //String htcApproach = request.getParameter("txtHtcApproach");
        String htcModel = null;
        int htcM;
        String FacilitybasedhtcModel = request.getParameter("txtFacilitybasedHtcModel");
        String CommunityBasedhtcModel = request.getParameter("txtCommunityBasedHtcModel");

        if (!FacilitybasedhtcModel.equals("")) {
            htcModel = FacilitybasedhtcModel;
            htcM = Integer.parseInt(htcModel);

        } else if (!CommunityBasedhtcModel.equals("")) {
            htcModel = CommunityBasedhtcModel;
            htcM = Integer.parseInt(htcModel);
        } else {
            htcModel = "0";
            htcM = Integer.parseInt(htcModel);
        }
        String testPurpose = request.getParameter("txtReasonsForHIVTesting");
        int tstPurpose = Integer.parseInt(testPurpose);

        //Step 3
        String CounsellingReceived = request.getParameter("txtPre-TestInformationGiven");
        String optout = request.getParameter("txtOptOut");
        String testedBefore = request.getParameter("txtFirstTestEver");
        String testedBeforeDate = request.getParameter("txtDateTestedBefore");
        String currentPreg = request.getParameter("txtCurrentPreg");
        String counselor = request.getParameter("txtCounsellor");

        //Step 4
        /// lot 1 kit details
        String FirstTestKit = request.getParameter("txtfirstTestKit");
        String kit1LotNo = request.getParameter("txtKit1LotNumber");
        String kit1Expiry = request.getParameter("txtKit1ExpiryDate");
        String kit1Result = request.getParameter("txtKit1Result");
        String kit1StartTime = request.getParameter("txtKit1StartTime");
        String kit1ReadingTime = request.getParameter("txtKit1ReadingTime");
        /// lot 2 kit details
        String SecondTestKit = request.getParameter("txtsecondTestKit");
        String kit2LotNo = request.getParameter("txtKit2LotNumber");
        String kit2Result = request.getParameter("txtKit2Result");
        String kit2Expiry = request.getParameter("txtKit2ExpiryDate");
        String kit2StartTime = request.getParameter("txtKit2StartTime");
        String kit2ReadingTime = request.getParameter("txtKit2ReadingTime");

        // Parallel Test 1
        String parallelFirstTestKit = request.getParameter("txtparallelFirstTestKit");
        String parallelKit1LotNumber = request.getParameter("txtparallelKit1LotNumber");
        String parallelKit1ExpiryDate = request.getParameter("txtparallelKit1ExpiryDate");
        String parallelKit1Result = request.getParameter("txtparallelKit1Result");
        String parallelKit1StartTime = request.getParameter("txtparallelKit1StartTime");
        String parallelKit1ReadingTime = request.getParameter("txtparallelKit1ReadingTime");

        //Parallel Test 2
        String parallelSecondTestKit = request.getParameter("txtparallelSecondTestKit");
        String parallelKit2LotNumber = request.getParameter("txtparallelKit2LotNumber");
        String parallelKit2ExpiryDate = request.getParameter("txtparallelKit2ExpiryDate");
        String parallelKit2Result = request.getParameter("txtparallelKit2Result");
        String parallelHidenFinalResult = request.getParameter("txtparallelHidenFinalResult");
        String parallelKit2StartTime = request.getParameter("txtparallelKit2StartTime");
        String parallelKit2ReadingTime = request.getParameter("txtparallelKit2ReadingTime");

        /// INSTI TEST details
        //String tiebrTestKit = request.getParameter("txtTieBrTestKit");
        String tiebrLotNo = request.getParameter("txtTieBrLotNumber");
        String tieBrExpiry = request.getParameter("txtTieBrExpiryDate");
        String tiebrResult = request.getParameter("txtTieBrResult");
        String FinalTestTestKit = request.getParameter("txtFinalTestTestKit");
        String TieBrStartTime = request.getParameter("txtTieBrStartTime");
        String TieBrReadingTime = request.getParameter("txtTieBrReadingTime");

        // Final Result
        // String parallelHidenFinalResult = request.getParameter("txtparallelHidenFinalResult");
        String finalResult = request.getParameter("txtFinalResult");
        String testPeformedBy = request.getParameter("txtTestPerformedBy");

        //Step 5
        String receivedResult = request.getParameter("txtPosttestcounselledandReceivedResult");
        String postTestCounsel = request.getParameter("txtConsent/AssenttoPatienttracing");

        ///String referredTo = request.getParameter("referredTo");
        ///int refTo = Integer.parseInt(referredTo);
        String[] referredTo = request.getParameterValues("ckReferredTo");
        String refer = "";
        if (referredTo != null) {
            for (String g : referredTo) {

                refer = refer.concat(",").concat(g);
            }
        }


        String postTestDate = request.getParameter("txtPostTestDate");

        if (optout.equals("")) {
            //
            response.sendRedirect("HtsError");
        } else {

            Date dtiebr = null;
            Timestamp dtiebrTs = null;
            Date dkit2 = null;
            Timestamp dkit2Ts = null;
            Date dkit1 = null;
            Timestamp dkit1Ts = null;
            Date dtestB4 = null;
            Timestamp dregDTs = null;
            Date regD = null;
            Date postDt = null;
            Date parallelExpiry1 = null;
            Date parallelExpiry2 = null;

//         Timestamp dob = null;
//        Timestamp regDate = null;
//        try {
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//            Date parsedDate = formatter.parse(dTemp + " 00:00:00");
//            dob = new java.sql.Timestamp(parsedDate.getTime());
//            Date parsedReg = formatter.parse(regdStr + " 00:00:00");
//            regDate = new java.sql.Timestamp(parsedReg.getTime());
//        } catch (Exception pe) {
//            pe.printStackTrace();
//        }
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            try {
                dtiebr = tieBrExpiry.length() > 0 ? df.parse(tieBrExpiry.replace('-', '/')) : null;
                dtiebrTs = tieBrExpiry.length() > 0 ? new Timestamp(dtiebr.getTime()) : null; //time stamp for expiry tiebreaker date
                dkit2 = kit2Expiry.length() > 0 ? df.parse(kit2Expiry.replace('-', '/')) : null;
                dkit2Ts = kit2Expiry.length() > 0 ? new Timestamp(dkit2.getTime()) : null;
                dkit1 = kit1Expiry.length() > 0 ? df.parse(kit1Expiry.replace('-', '/')) : null;
                dkit1Ts = kit1Expiry.length() > 0 ? new Timestamp(dkit1.getTime()) : null;
                dtestB4 = testedBeforeDate.length() > 0 ? df.parse(testedBeforeDate.replace('-', '/')) : null;
                regD = regDate.length() > 0 ? df.parse(regDate.replace('-', '/')) : null;
                postDt = postTestDate.length() > 0 ? df.parse(postTestDate.replace('-', '/')) : null;
                parallelExpiry1 = parallelKit1ExpiryDate.length() > 0 ? df.parse(parallelKit1ExpiryDate.replace('-', '/')) : null;
                parallelExpiry2 = parallelKit2ExpiryDate.length() > 0 ? df.parse(parallelKit2ExpiryDate.replace('-', '/')) : null;
            } catch (Exception ee) {
                ee.printStackTrace();
            }

            //// mold htcpatient from above data
            //Opted Inn
            {
                // Checking if patient is a new HIV positive case and if so set notification to zero(0)
                //if the it is a repeat test set notification to two(2)
                // Vlaues to be changed in CBS notification from zero(0) to one(1) for notified cases

                if (optout.equals("No")) {

                    String res = "Positive";
                    String newtest = "No";
                    String notify = null;

                    if (finalResult.equalsIgnoreCase(res)) {

                        if (testedBefore.equalsIgnoreCase(newtest)) {

                            notify = "0";
                        } else {
                            notify = "2";
                        }

                    }
                    HtsablePatientImpl htcdb = new HtsablePatientImpl();
                    Htc tst = new Htc();

                    tst.setHtcnumber(htcnumber);
                    tst.setCoupleTo(coupledTo);
                    tst.setIsCouple(iscoupled);
                    tst.setDateTestedBefore(dtestB4);
                    tst.setDateofRegistration(regD);
                    tst.setNameofCounselor(counselor);
                    tst.setOpdnumber(p.getOpdnumber());
                    tst.setEntryPointId(entrypoint);
                   // tst.setHtcapproach(htcApproach);
                    tst.setHtcmodelId(htcM);
                    tst.setTestPurposeTypeId(tstPurpose);
                   // tst.setReferredFromTypeId(refFrm);
                    tst.setOptedOut(optout);
                    tst.setCurrentPregnancyLactation(currentPreg);
                    tst.setPostTestCounseled(postTestCounsel);
                    tst.setPostTestCounselDate(postDt);
                    tst.setFinalResultType(finalResult);
                    tst.setRecievedResult(receivedResult);
                    tst.setRefferedforService(refer);
                    tst.setCounselingRecieved(CounsellingReceived);
                    tst.setTestedBefore(testedBefore);
                    tst.setPerformedBy(testPeformedBy);
                    tst.setNotified(notify);

                    htcdb.add(tst);
                    
                    HtcHivresultServiceImpl hhrs = new HtcHivresultServiceImpl();
                    HtcHivresult hhr = new HtcHivresult();
                    hhr.setHtcnumber(htcnumber);
                    hhr.setExpireDate(dkit1Ts);//testkit1
                    hhr.setLotNumber(kit1LotNo);
                    hhr.setTestCategory(1);
                    hhr.setIsRetest(Boolean.FALSE);
                    hhr.setTestKit(FirstTestKit);
                    hhr.setResult(kit1Result);
                    hhr.setStarttime(kit1StartTime);
                    hhr.setReadingtime(kit1ReadingTime);
                    hhr.setOpdnumber(p.getOpdnumber());
                    hhr.setDob(p.getDob());
                    hhr.setSex(p.getSex());
                    hhr.setDateofRegistration(regD);
                    
                    hhrs.add(hhr);
//record tests conditionally
                    if (kit2Result.length() > 0) {
                        HtcHivresult hhr2 = new HtcHivresult();
                        hhr2.setHtcnumber(htcnumber);
                        hhr2.setExpireDate(dkit2Ts);//testkit1
                        hhr2.setLotNumber(kit2LotNo);
                        hhr2.setTestCategory(2);
                        hhr2.setStarttime(kit2StartTime);
                        hhr2.setReadingtime(kit2ReadingTime);
                        //hhr2.setIsRetest(Boolean.FALSE);
                        hhr2.setTestKit(SecondTestKit);
                        hhr2.setResult(kit2Result);
                        hhr2.setOpdnumber(p.getOpdnumber());
                        if (testedBefore.equals("Yes")) {
                            hhr2.setIsRetest(Boolean.TRUE);

                        } else {
                            hhr2.setIsRetest(Boolean.FALSE);
                        }
                        hhrs.add(hhr2);
                    }
                    if (parallelFirstTestKit.length() > 0) {
                        //first parallel test
                        HtcHivresult hhr3a = new HtcHivresult();
                        hhr3a.setHtcnumber(htcnumber);
                        hhr3a.setExpireDate(parallelExpiry1);//testkit1
                        hhr3a.setLotNumber(parallelKit1LotNumber);
                        hhr3a.setTestCategory(3);
                        //  hhr3a.setIsRetest(Boolean.FALSE);
                        hhr3a.setTestKit(parallelFirstTestKit);
                        hhr3a.setResult(parallelKit1Result);
                        hhr3a.setStarttime(parallelKit1StartTime);
                        hhr3a.setReadingtime(parallelKit1ReadingTime);
                        hhr3a.setOpdnumber(p.getOpdnumber());
                        if (testedBefore.equals("Yes")) {
                            hhr3a.setIsRetest(Boolean.TRUE);

                        } else {
                            hhr3a.setIsRetest(Boolean.FALSE);
                        }
                        hhrs.add(hhr3a);
                        //second parallel test

                        HtcHivresult hhr3b = new HtcHivresult();
                        hhr3b.setHtcnumber(htcnumber);
                        hhr3b.setExpireDate(parallelExpiry2);//testkit1
                        hhr3b.setLotNumber(parallelKit2LotNumber);
                        hhr3b.setTestCategory(3);
                        //  hhr3b.setIsRetest(Boolean.FALSE);
                        hhr3b.setTestKit(parallelSecondTestKit);
                        hhr3b.setResult(parallelKit2Result);
                        hhr3b.setStarttime(parallelKit2StartTime);
                        hhr3b.setReadingtime(parallelKit2ReadingTime);
                        hhr3b.setOpdnumber(p.getOpdnumber());
                        if (testedBefore.equals("Yes")) {
                            hhr3b.setIsRetest(Boolean.TRUE);

                        } else {
                            hhr3b.setIsRetest(Boolean.FALSE);
                        }
                        hhrs.add(hhr3b);
                    }

                    if (tiebrResult.length() > 0) {
                        HtcHivresult hhr4 = new HtcHivresult();
                        hhr4.setHtcnumber(htcnumber);
                        hhr4.setExpireDate(dtiebrTs);//testkit1
                        hhr4.setLotNumber(tiebrLotNo);
                        hhr4.setTestCategory(4);
                        // hhr4.setIsRetest(Boolean.FALSE);
                        hhr4.setTestKit(FinalTestTestKit);
                        hhr4.setResult(tiebrResult);
                        hhr4.setStarttime(TieBrStartTime);
                        hhr4.setReadingtime(TieBrReadingTime);
                        hhr4.setOpdnumber(p.getOpdnumber());
                        if (testedBefore.equals("Yes")) {
                            hhr4.setIsRetest(Boolean.TRUE);

                        } else {
                            hhr4.setIsRetest(Boolean.FALSE);
                        }
                        hhrs.add(hhr4);
                    }
                } // Opted Out
                else {
                    HtsablePatientImpl htcdb = new HtsablePatientImpl();
                    Htc tst = new Htc();

                    tst.setHtcnumber(htcnumber);
                    tst.setCoupleTo(coupledTo);
                    // tst.setDateTestedBefore(dtestB4);
                    tst.setDateofRegistration(regD);
                    tst.setNameofCounselor(counselor);
                    tst.setOpdnumber(p.getOpdnumber());
                    tst.setEntryPointId(entrypoint);
                    tst.setIsCouple(iscoupled);
                   // tst.setHtcapproach(htcApproach);
                    tst.setHtcmodelId(htcM);
                    tst.setCounselingRecieved(CounsellingReceived);
                    tst.setTestPurposeTypeId(tstPurpose);
                  //  tst.setReferredFromTypeId(refFrm);
                    tst.setRefferedforService(refer);
                    tst.setOptedOut(optout);
                    htcdb.add(tst);
//       

                }
            }
            //hhr.setHtctestTypeId(tstPurpose);
            //create an object of HTSClient
            CompletedHtsClientAll cpthtsclient = new CompletedHtsClientAll(htcnumber) {
            };

            //also add patient
            p.setHtsId(htcnumber);
            cpthtsclient.setP(p);
            CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
            //edit patient table and update the htsId number
            circumImpl.editHTS(p);

            session.setAttribute("cpthtsclient", cpthtsclient);

            //dispatch to dashboard
            if (!finalResult.equals("Positive")) {
                response.sendRedirect("AllHtsServ");
            } //        AllHtsServ serv = new AllHtsServ();
            //        serv.doGet(request, response);
            else {
                response.sendRedirect("NotificationAdults");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
