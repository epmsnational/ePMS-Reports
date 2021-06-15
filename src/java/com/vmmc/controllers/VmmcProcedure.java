/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import static com.vmmc.controllers.VmmcPatient.setup;
import com.vmmc.entities.Patient;
import com.vmmc.entities.Setupstaff;
import com.vmmc.entities.Visitplans;
import com.vmmc.entities.VmmcAdverseevents;
import com.vmmc.entities.VmmcCircumcisionmethod;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.vmmc.entities.VmmcCircumcisionprocedure;
import com.vmmc.entities.VmmcPostprocedureassessment;
import com.vmmc.entities.VmmcPrepexmalecircumcision;
import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import com.vmmc.services.CompletedVmmcClientAll;
import com.vmmc.services.PlannableVisitImpl;
import com.vmmc.services.VmmcAdverseEventsDuringProcImpl;
import com.vmmc.services.VmmcDateUtil;
import com.vmmc.services.VmmcPostProceduralAssImpl;
import com.vmmc.services.VmmcPrePexMCImpl;
import com.vmmc.services.VmmcProcServiceImpl;
import com.vmmc.services.VmmcSurgicalMCImpl;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trevor
 */
@WebServlet(name = "VmmcProcedure", urlPatterns = {"/VmmcProcedure"})
public class VmmcProcedure extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     * //
     * <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
     * /**
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

        HttpSession session = request.getSession();
        CompletedVmmcClientAll completedClient = (CompletedVmmcClientAll) session.getAttribute("client");

        List<Setupstaff> lstStaff = setup.getAllStaff();
        request.setAttribute("Setupstaff", lstStaff);

        // Patient p = new CircumcisablePatientImpl().getPatient("6-E-06--2015-09-24 20:42:02.476");
       String vmmcId = request.getQueryString();
        //CompletedVmmcClientAll client = new CompletedVmmcClientAll(vmmcId);
        if (completedClient != null) {
            VmmcCircumcisionmethod method = completedClient.getVcm().get(0);
            String circumMethod = method.getCircumcisionChosenByClients();
            if(circumMethod==null)
                circumMethod="Surgical";
            if (circumMethod.equalsIgnoreCase("Prepex")) {
                request.setAttribute("vmmcid", vmmcId);
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/vmmc/vmmcProcedurePrepex.jsp");
                disp.forward(request, response);
            } else {
                request.setAttribute("vmmcid", vmmcId);
                RequestDispatcher disp;
                disp = request.getRequestDispatcher("/vmmc/vmmcProcedureSurgical.jsp");
                disp.forward(request, response);
            }
        } else {
            //dispatch to error page
            RequestDispatcher disp;
            disp = request.getRequestDispatcher("/vmmc/vmmcProcedureNotFound.jsp");
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

        HttpSession session = request.getSession();
        CompletedVmmcClientAll completedClient = (CompletedVmmcClientAll) session.getAttribute("client");

       // HttpSession session = request.getSession();
        // Patient p = (Patient) session.getAttribute("patient");
        // processRequest(request, response);
       
        //String registrationDate = request.getParameter("txtRegDate");
        //for circumcision procedures

        String VMMCID = request.getParameter("txtVmmcId");
        String DateofProcedure = request.getParameter("txtDateOfProcedure");
        String CircumiserName = request.getParameter("txtCircumcisersName");
        String CircumciserProfession = request.getParameter("rdIsCircumciserProf");
        String AssistantName = request.getParameter("txtAssistantsName");
        String AssistantProfession = request.getParameter("rdIsAssistantProf");

        //for circumcision methods
        //int CircumcisionProcedureID = Integer.parseInt("");
        String ProcedureType = request.getParameter("rdForcepsGuided");
        String OtherSurgicalMethodsSpecify = request.getParameter("txtOtherSurgical");
        String lignocaineone = request.getParameter("txt1Lignocaine");
        String lignocainetwo = request.getParameter("txt2Lignocaine");
        String bupivacaine = request.getParameter("txtBupivacaine");
        String diathermyused = request.getParameter("rdIsDiathermy");
        String diathemySettings = request.getParameter("txtDiathermySetting");
        String procStartTime = request.getParameter("txtStartTime");
        String procEndTime = request.getParameter("txtEndTime");
        String clinicalNotes = request.getParameter("txtClinicalNotes");
/// Prepec circumcision
        String DeviceSize = request.getParameter("txtDeviceSize");
        String DeviceBatchSize = request.getParameter("txtDeviceBatch");
        String DeviceExpirydate = request.getParameter("txtExpireDate");
        String TopicalAnaesthesia = request.getParameter("rdIsAnaesthesia");
        String IfAnaesthesiaSpecify = request.getParameter("txtIfAnaesthesiaSpecify");

//for adverse events
        String adverse = request.getParameter("chkAdverse");
        String noAdverse = request.getParameter("chkNoAdverse");
        String isPain = request.getParameter("rdIsPain");
        String isBleeding = request.getParameter("rdIsBleeding");
        String isAnaesthetic = request.getParameter("rdIsAnaesthetic");
        String isDamage = request.getParameter("rdIsDamage");
        String isSkinRemoval = request.getParameter("rdIsSkinRemoval");
        String isDifficulty = request.getParameter("rdIsDifficulty");
        String isDevice = request.getParameter("rdIsDevice");
        String adverseManagement = "Pain#" + isPain + ",Bleeding#" + isBleeding + ",Anaesthetic#" + isAnaesthetic + ",Damage to penis#" + isDamage + ",Excess skin removal#" + isSkinRemoval + ",Difficulty with placement#" + isDifficulty + ",Device malfunction" + isDevice;

        //for post procedural assessment
        String bloodPressue = request.getParameter("txtBloodPressure");
        String pulse = request.getParameter("txtPulse");
        String prepexDevicedPlaced = request.getParameter("rdIsDressed");
        String clientInstruction = request.getParameter("rdIsInstructions");
        String clientCard = request.getParameter("rdIsCard");
        String AnalgesiaGiven = request.getParameter("rdIsAnalgesia");
        String Drug = request.getParameter("txtAnalgesia");
        String generalCondition = request.getParameter("txtGeneralCondition");
        String nextVisitDate = request.getParameter("txtNextScheduledVisit");
        String dischargedBy = request.getParameter("txtDischargedBy");

       Timestamp nvDate = null;
         Timestamp devDate = null;
         Timestamp dateProc = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedNvDate = formatter.parse(nextVisitDate + " 00:00:00");
            nvDate = new java.sql.Timestamp(parsedNvDate.getTime());
            Date parsedDecDate = formatter.parse(DeviceExpirydate + " 00:00:00");
            devDate = new java.sql.Timestamp(parsedDecDate.getTime());
             Date parsedDateProc = formatter.parse(DateofProcedure + " 00:00:00");
            dateProc = new java.sql.Timestamp(parsedDateProc.getTime());
        } catch (Exception pe) {
            pe.printStackTrace();
        }
        //// mold vmmcprocedure from above data
        VmmcProcServiceImpl mc = new VmmcProcServiceImpl();
        VmmcCircumcisionprocedure vcp = new VmmcCircumcisionprocedure();

        //proc.setDateofProcedure(DateofProcedure); ///obtain simple data formatter from HTC
        vcp.setVmmcid(VMMCID);
        vcp.setDateofProcedure(dateProc);
        vcp.setCircumciserName(CircumiserName);
        vcp.setCircumciserProfession(CircumciserProfession);
        vcp.setAssistantName(AssistantName);
        vcp.setAssistantProfession(AssistantProfession);
        mc.add(vcp);

        VmmcSurgicalMCImpl surg = new VmmcSurgicalMCImpl();
        VmmcSurgicalmalecircumcision vsmc = new VmmcSurgicalmalecircumcision();
        vsmc.setVmmcid(VMMCID);
        vsmc.setProcedureTypeId(ProcedureType);
        double Bupivacaine = bupivacaine.length() == 0 ? 0.0 : Double.parseDouble(bupivacaine);
        vsmc.setBupivacaine(Bupivacaine);

        /// vsmc.setCircumcisionProcedureId(CircumcisionProcedureID);
        double Lignocaine1 = lignocaineone.length() == 0 ? 0.0 : Double.parseDouble(lignocaineone);
        vsmc.setLignocaineone(Lignocaine1);
        double Lignocaine2 = lignocainetwo.length() == 0 ? 0.0 : Double.parseDouble(lignocainetwo);
        vsmc.setLignocainetwo(Lignocaine2);
        vsmc.setDiathermySetting(diathemySettings);
        vsmc.setDiathermyUsed(diathermyused);
        //vsmc.setProcedureStartTime(procStartTime);
        //vsmc.setProcedureEndtime(procEndTime);     
        surg.add(vsmc);

        VmmcPrePexMCImpl pex = new VmmcPrePexMCImpl();
        VmmcPrepexmalecircumcision vpex = new VmmcPrepexmalecircumcision();

        vpex.setDeviceSize(DeviceSize);
        vpex.setDeviceBatchId(DeviceBatchSize);
        vpex.setDeviceExpiriyDate(devDate);
        vpex.setTopicalAnaesthesia(TopicalAnaesthesia);
        vpex.setTopicalAnaesthesiaType(IfAnaesthesiaSpecify);

        //molding adverse events during procedure
        VmmcAdverseEventsDuringProcImpl vaep = new VmmcAdverseEventsDuringProcImpl();
        VmmcAdverseevents vae = new VmmcAdverseevents();
        vae.setNoAdverseEvents(noAdverse);
        vae.setHadAdverseEvents(adverse);
        vae.setAemanagment(adverseManagement);
        vaep.add(vae);

        //molding post procedural assessment
        VmmcPostProceduralAssImpl vppa = new VmmcPostProceduralAssImpl();
        VmmcPostprocedureassessment vpp = new VmmcPostprocedureassessment();
        vpp.setBloodPressure(bloodPressue);
        double Pulse = pulse.length() == 0 ? 0.0 : Double.parseDouble(pulse);
        vpp.setPulse(Pulse);
        vpp.setPrePexDevicePlaced(prepexDevicedPlaced);
        vpp.setClientProvideedInstruction(clientInstruction);
        vpp.setGivenMcclientCard(clientCard);
        vpp.setDrug(Drug);
        vpp.setAnalgesiaGiven(AnalgesiaGiven);
        vpp.setGeneralCondition(generalCondition);
      //  vpp.setNextVisitDate(nextScheduledVisitDate); //
        vpp.setDischargedBy(dischargedBy);
        vppa.add(vpp);

        //get method
        VmmcCircumcisionmethod method = completedClient.getVcm().get(0);
        String circumMethod = method.getCircumcisionChosenByClients();
        //validate if not postback
        
        createVisitPlans(circumMethod, completedClient.getP().getVmmcId(),completedClient.getP().getOpdnumber(),completedClient);
        RequestDispatcher disp = request.getRequestDispatcher("/vmmc/vmmcSingleClientDashboard.jsp");
        disp.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    private void createVisitPlans(String method, String vmmcId, String opdNum,CompletedVmmcClientAll sessionClient) {
        List<Visitplans>temp = new ArrayList<>();
        PlannableVisitImpl masterPlan = new PlannableVisitImpl();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Date originalD = cal.getTime();
        if (method.equalsIgnoreCase("Surgical")) {
            for (int i = 1; i <= 42; i++) {
                if (i == 2) {
                    Visitplans plan = new Visitplans();
                    plan.setIsDone(Boolean.FALSE);
                    plan.setAuthorisedBy("system");
                    plan.setVmmcId(vmmcId);
                    plan.setOpdNumber(opdNum);
                    plan.setVisitPlanDescri("Day 2");
                    plan.setVisitPlanDateCreated(new Date());
                    cal.add(Calendar.DAY_OF_MONTH, 2);
                    switch (cal.get(Calendar.DAY_OF_WEEK)) {
                        case Calendar.SATURDAY:
                            cal.add(Calendar.DAY_OF_MONTH, 2);
                            break;

                        case Calendar.SUNDAY:
                            cal.add(Calendar.DAY_OF_MONTH, 1);
                            break;
                        default:

                    }
                    
                    plan.setVisitPlanDate(cal.getTime());
                    masterPlan.add(plan);
                    temp.add(plan);
                   
                }
                if (i == 7) {
                    Visitplans plan = new Visitplans();
                    plan.setIsDone(Boolean.FALSE);
                    plan.setAuthorisedBy("system");
                    plan.setVmmcId(vmmcId);
                    plan.setVisitPlanDescri("Day 7");
                    plan.setVisitPlanDateCreated(new Date());
                    plan.setOpdNumber(opdNum);
                    //do maths
                    //int days = VmmcDateUtil.DateDiff(originalD, cal.getTime());
                     int days=(int)TimeUnit.MILLISECONDS.toDays(originalD.compareTo(cal.getTime()));
                    cal.compareTo(cal);
                    cal.add(Calendar.DAY_OF_MONTH, 7-days);
                    switch (cal.get(Calendar.DAY_OF_WEEK)) {
                        case Calendar.SATURDAY:
                            cal.add(Calendar.DAY_OF_MONTH, 2);
                            break;

                        case Calendar.SUNDAY:
                            cal.add(Calendar.DAY_OF_MONTH, 1);
                            break;
                        default:

                    }
                    plan.setVisitPlanDate(cal.getTime());
                    masterPlan.add(plan);
                    temp.add(plan);
                }
               
                if (i == 42) {
                    Visitplans plan = new Visitplans();
                    plan.setIsDone(Boolean.FALSE);
                    plan.setAuthorisedBy("system");
                    plan.setVmmcId(vmmcId);
                    plan.setVisitPlanDescri("Day 42");
                    plan.setVisitPlanDateCreated(new Date());
                    plan.setOpdNumber(opdNum);
                      //do maths
                   // int days = VmmcDateUtil.DateDiff(originalD, cal.getTime());
                   int days=(int)TimeUnit.MILLISECONDS.toDays(originalD.compareTo(cal.getTime()));
                    cal.add(Calendar.DAY_OF_MONTH, 42-days);
                    switch (cal.get(Calendar.DAY_OF_WEEK)) {
                        case Calendar.SATURDAY:
                            cal.add(Calendar.DAY_OF_MONTH, 2);
                            break;

                        case Calendar.SUNDAY:
                            cal.add(Calendar.DAY_OF_MONTH, 1);
                            break;
                        default:

                    }
                    plan.setVisitPlanDate(cal.getTime());
                    masterPlan.add(plan);
                    temp.add(plan);
                }
            }
            //fillup session client with planned vists
            sessionClient.setVisitPlans(temp);
        }
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
