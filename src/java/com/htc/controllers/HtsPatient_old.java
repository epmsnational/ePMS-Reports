///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.htc.controllers;
//
//
//import com.vmmc.entities.Facilityconfig;
//import com.vmmc.entities.Htc;
//import com.vmmc.entities.HtcHivresult;
//import com.vmmc.entities.HtcSetuphtcapproach;
//import com.vmmc.entities.HtcSetuphtcmodel;
//import com.vmmc.entities.HtcTestreason;
//import com.vmmc.entities.Patient;
//import com.vmmc.entities.SetupreferredTo;
//import com.vmmc.entities.Setupreferredfrom;
//import com.vmmc.services.CircumcisablePatientImpl;
//import com.vmmc.services.CompletedHtsClientAll;
//import com.vmmc.services.EpmsDuration;
//
//import com.vmmc.services.FacilityConfigServiceImpl;
//import com.vmmc.services.HtcHivresultServiceImpl;
//import com.vmmc.services.HtsablePatientImpl;
//import com.vmmc.services.SetupServiceImpl;
//import java.io.IOException;
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// *
// * @author leon-mbano
// */
//@WebServlet(name = "HtsPatient", urlPatterns = {"/HtsPatient"})
//public class HtsPatient extends HttpServlet {
//    static SetupServiceImpl setup = new SetupServiceImpl();
//  
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//   
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        //creating HTS No
//        Facilityconfig fc = new FacilityConfigServiceImpl().getFacilityConfig(1);
//
//        String htsStub = fc.getProvinceId() + "-" + fc.getDistrictId() + "-" + fc.getFacilityId();
//        String locationForHts = null;
//        try {
//            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//            Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
//            java.util.Date timeStamp = format.parse(currentTimestamp.toString());
//
//            locationForHts = htsStub + "-" + currentTimestamp.toString().substring(0, 4);
//            locationForHts += "-V" + currentTimestamp.toString().substring(4, currentTimestamp.toString().length()).replaceAll(":", "-");
//            locationForHts = locationForHts.replace(" ", "-");
//        } catch (Exception e) {
//        }
//
//        request.setAttribute("htsnum", locationForHts);
//
//        List<HtcSetuphtcapproach> lstHtcSetuphtcapproach = setup.getHtcApproaches();
//        request.setAttribute("htcapproach", lstHtcSetuphtcapproach);
//        
//        List<SetupreferredTo> lstSetupreferredTo = setup.getSetupReferredTos();
//        request.setAttribute("referredTo", lstSetupreferredTo);
//        
//        
//        List<Setupreferredfrom> referrals = setup.getSetupReferredFroms();
//        request.setAttribute("referrals", referrals);
//
//        List<HtcTestreason> testReason = setup.getHtcTestReasons();
//        request.setAttribute("Testreason",testReason);
//        
//        
//        List<HtcSetuphtcapproach> htcappi = setup.getHtcApproaches();
//        request.setAttribute("htcapproach", htcappi);
//        
//        List<HtcSetuphtcmodel> htcmodel = setup.getHtcModels();
//        request.setAttribute("htcmodel", htcmodel);
//        
//        
//        //get patient details
//        Patient p=null;
//        Htc h =null;
//        HttpSession session = request.getSession();
//        String tempClient = (String)request.getAttribute("opdNum");
//         p = tempClient==null?(Patient)session.getAttribute("patient") :new HtsablePatientImpl().getPatient(tempClient);
//        
//      
//        float age = 0;
//
//        Calendar cal2 = Calendar.getInstance();
//        Timestamp stamp = Timestamp.valueOf(p.getDob().toString());
//        age =(float)EpmsDuration.getDays(stamp)/365.0f;
//        p.setAge(age);
//        String htcNum = p.getHtsId();
//        session.setAttribute("patient", p);
//        session.setAttribute("htcNum", htcNum);
//
//
//        RequestDispatcher disp = request.getRequestDispatcher("htc/Htcservices.jsp");
//        disp.forward(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        //take patient from session
//        Patient p = (Patient) request.getSession().getAttribute("patient");
//        
//        String htcnumber= request.getParameter("txtHtcNo");
//        //create first hts step
//        //Htc h = new Htc();
//        //HtsablePatientImpl hs = new HtsablePatientImpl();
//
//       // h.setOpdnumber(p.getOpdnumber());
//
//        //h.setHtcnumber("htcnumber");
//
//        //hs.add(h);
//
//        
//        String regDate = request.getParameter("txtHtcRegDate");
//        String referredFrm = request.getParameter("txtReferred"); 
//        int refFrm = Integer.parseInt(referredFrm);
//        String htcApproach = request.getParameter("txtHtcApproach");
//        String htcModel = request.getParameter("txtHtcModel");
//        int htcM = Integer.parseInt(htcModel);
//        String testPurpose = request.getParameter("txtPurposeOfTest");
//        int tstPurpose = Integer.parseInt(testPurpose);
//        String CounsellingReceived = request.getParameter("txtCounsellingreceived");
//        String optout = request.getParameter("txtOptOut");
//        String testedBefore = request.getParameter("txtTestedBefore");
//        String testedBeforeDate = request.getParameter("txtDateTestedBefore");
//        String currentPreg = request.getParameter("txtCurrentPreg");
//        String counselor = request.getParameter("txtCounsellor");
//        String coupledTo = request.getParameter("txtCoupledTo");
//        String postTestCounsel = request.getParameter("txtPostTestCounselling");
//        String finalResult = request.getParameter("txtFinalResult");
//      
//        String receivedResult = request.getParameter("txtReceivedResult");
//       
//        String referredTo = request.getParameter("txtReferredTo");
//        int refTo = Integer.parseInt(referredTo);
//        String testPeformedBy = request.getParameter("txtTestPerformedBy");
//        String postTestDate = request.getParameter("txtPostTestDate");
//        /// lot 1 kit details
//        
//        String kit1LotNo = request.getParameter("txtKit1LotNumber");
//        String kit1Expiry = request.getParameter("txtKit1ExpiryDate");
//        String kit1Result = request.getParameter("txtKit1Result");
//        /// lot 2 kit details
//       
//        String kit2LotNo = request.getParameter("txtKit2LotNumber");
//        String kit2Result = request.getParameter("txtKit2Result");
//        String kit2Expiry = request.getParameter("txtKit2ExpiryDate");
//        /// tie breaker details
//        //String tiebrTestKit = request.getParameter("txtTieBrTestKit");
//        String tiebrLotNo = request.getParameter("txtTieBrLotNumber");
//        String tieBrExpiry = request.getParameter("txtTieBrExpiryDate");
//        String tiebrResult = request.getParameter("txtTieBrResult");
//       
//        Date dtiebr = null;
//        Timestamp dtiebrTs=null;
//        Date dkit2 = null;
//        Timestamp dkit2Ts=null;
//        Date dkit1 = null;
//        Timestamp dkit1Ts =null;
//        Date dtestB4 = null;
//        Timestamp dregDTs=null;
//        Date regD = null;
//        Date postDt = null;
////         Timestamp dob = null;
////        Timestamp regDate = null;
////        try {
////            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
////            Date parsedDate = formatter.parse(dTemp + " 00:00:00");
////            dob = new java.sql.Timestamp(parsedDate.getTime());
////            Date parsedReg = formatter.parse(regdStr + " 00:00:00");
////            regDate = new java.sql.Timestamp(parsedReg.getTime());
////        } catch (Exception pe) {
////            pe.printStackTrace();
////        }
//        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//        try {
//            dtiebr = tieBrExpiry.length()>0 ? df.parse(tieBrExpiry.replace('-', '/')):null;
//            dtiebrTs= tieBrExpiry.length()>0 ? new Timestamp( dtiebr.getTime()):null; //time stamp for expiry tiebreaker date
//            dkit2 = kit2Expiry.length()>0 ? df.parse(kit2Expiry.replace('-', '/')):null;
//            dkit2Ts= kit2Expiry.length()>0? new Timestamp(dkit2.getTime()):null;
//            dkit1 = kit1Expiry.length()>0? df.parse(kit1Expiry.replace('-', '/')):null;
//            dkit1Ts= kit1Expiry.length()>0? new Timestamp(dkit1.getTime()):null;
//            dtestB4 = testedBeforeDate.length()>0? df.parse(testedBeforeDate.replace('-', '/')):null;
//            regD = regDate.length()>0? df.parse(regDate.replace('-', '/')):null;
//            postDt = postTestDate.length()>0? df.parse(postTestDate.replace('-', '/')):null;
//
//        } catch (Exception ee) {
//            ee.printStackTrace();
//        }
//
//        //// mold htcpatient from above data
//        
//            HtsablePatientImpl htcdb = new HtsablePatientImpl();
//            Htc tst = new Htc();
//            
//            tst.setHtcnumber(htcnumber);
//            tst.setCoupleTo(coupledTo);            
//            tst.setDateTestedBefore(dtestB4);
//            tst.setDateofRegistration(regD);
//            tst.setNameofCounselor(counselor);
//            tst.setOpdnumber(p.getOpdnumber());
//           
//            tst.setHtcapproach(htcApproach);
//            tst.setHtcmodelId(htcM);
//            tst.setTestPurposeTypeId(tstPurpose);
//            tst.setReferredFromTypeId(refFrm);
//            tst.setOptedOut(optout);
//            tst.setCurrentPregnancyLactation(currentPreg);
//            tst.setPostTestCounseled(postTestCounsel);
//            tst.setPostTestCounselDate(postDt);
//            tst.setFinalResultType(finalResult);
//            tst.setRecievedResult(receivedResult);
//            tst.setRefferedforService(referredTo);
//            tst.setCounselingRecieved(CounsellingReceived);
//            tst.setTestedBefore(testedBefore);
//            tst.setPerformedBy(testPeformedBy);
//            
//            htcdb.add(tst);
//            HtcHivresultServiceImpl hhrs = new HtcHivresultServiceImpl();
//             HtcHivresult hhr = new HtcHivresult();
//             hhr.setHtcnumber(htcnumber);
//             hhr.setExpireDate(dkit1Ts);//testkit1
//             hhr.setLotNumber(kit1LotNo);
//             hhr.setIsRetest(Boolean.FALSE);
//             hhr.setTestKit("First Response");
//             hhr.setResult(kit1Result);
//             hhr.setOpdnumber(p.getOpdnumber());
//             hhrs.add(hhr);
////record tests conditionally
//             if(kit2Result.length()>0)
//             {
//                 HtcHivresult hhr2 = new HtcHivresult();
//             hhr2.setHtcnumber(htcnumber);
//             hhr2.setExpireDate(dkit2Ts);//testkit1
//             hhr2.setLotNumber(kit2LotNo);
//             hhr2.setIsRetest(Boolean.FALSE);
//             hhr2.setTestKit("Determine");
//             hhr2.setResult(kit2Result);
//             hhr2.setOpdnumber(p.getOpdnumber());
//             hhrs.add(hhr2);
//             }
//              if(tiebrResult.length()>0)
//             {
//             HtcHivresult hhr3 = new HtcHivresult();
//             hhr3.setHtcnumber(htcnumber);
//             hhr3.setExpireDate(dtiebrTs);//testkit1
//             hhr3.setLotNumber(tiebrLotNo);
//             hhr3.setIsRetest(Boolean.FALSE);
//             hhr3.setTestKit("CHAMBIO");
//             hhr3.setResult(tiebrResult);
//             hhr3.setOpdnumber(p.getOpdnumber());
//             hhrs.add(hhr3);
//             }   
//           
//            //hhr.setHtctestTypeId(tstPurpose);
//            
//         //create an object of HTSClient
//
//            CompletedHtsClientAll cpthtsclient = new CompletedHtsClientAll(htcnumber) {};
//
//        //also add patient
//        p.setHtsId(htcnumber);
//        cpthtsclient.setP(p);
//        CircumcisablePatientImpl circumImpl = new CircumcisablePatientImpl();
//        //edit patient table and update the htsId number
//        circumImpl.editHTS(p);
//
//        session.setAttribute("cpthtsclient", cpthtsclient);
//        
//
//            
//           //dispatch to dashboard
//           if(!finalResult.equals("Positive"))
//           {response.sendRedirect("AllHtsServ");}
//           
////        AllHtsServ serv = new AllHtsServ();
////        serv.doGet(request, response);
//
//           else
//           {response.sendRedirect("NotificationAdults");}
//
//        
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}