/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import static com.vmmc.controllers.VmmcPatient.setup;
import com.vmmc.entities.Setupstaff;
import com.vmmc.entities.Visitplans;
import com.vmmc.entities.VmmcAdverseevents;
import com.vmmc.entities.VmmcCircumcisionmethod;
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
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
 * @author mbanol
 */
@WebServlet(name = "VmmcProcedurePrepex", urlPatterns = {"/VmmcProcedurePrepex"})
public class VmmcProcedurePrepex extends HttpServlet {

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
            out.println("<title>Servlet VmmcProcedurePrepex</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VmmcProcedurePrepex at " + request.getContextPath() + "</h1>");
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


        String registrationDate = request.getParameter("txtRegDate");
        //for circumcision procedures

        String VMMCID = request.getParameter("txtVmmcId");
        String DateofProcedure = request.getParameter("txtDateOfProcedure");
        String CircumiserName = request.getParameter("txtCircumcisersName");
        String CircumciserProfession = request.getParameter("rdIsCircumciserProf");
        String AssistantName = request.getParameter("txtAssistantsName");
        String AssistantProfession = request.getParameter("rdIsAssistantProf");


        String DeviceSize = request.getParameter("txtDeviceSize");
        String DeviceBatchSize = request.getParameter("txtDeviceBatch");
        String DeviceExpirydate = request.getParameter("txtExpireDate");
        String TopicalAnaesthesia = request.getParameter("rdIsAnaesthesia");
        String IfAnaesthesiaSpecify = request.getParameter("txtIfAnaesthesiaSpecify");

//for adverse events
        String adverse = request.getParameter("chkAdverse");
        String noAdverse = request.getParameter("chkAdverse");
        String isPain = request.getParameter("rdIsPain");
        String isBleeding = request.getParameter("rdIsBleeding");
//        String isAnaesthetic = request.getParameter("rdIsAnaesthetic");
//        String isDamage = request.getParameter("rdIsDamage");
        String isSkinRemoval = request.getParameter("rdIsSkinRemoval");
        String isDifficulty = request.getParameter("rdIsDifficulty");
        String isDevice = request.getParameter("rdIsDevice");
        String adverseManagement = "Pain#" + isPain + ",Bleeding#" + isBleeding + ",Anaesthetic#"  + ",Damage to penis#"  + ",Excess skin removal#" + isSkinRemoval + ",Difficulty with placement#" + isDifficulty + ",Device malfunction" + isDevice;

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

        Date dateOfprocedure = null;
        Date deviceExpiryDate = null;
        Date nextScheduledVisitDate = null;
       
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

       

        VmmcPrePexMCImpl pex = new VmmcPrePexMCImpl();
        VmmcPrepexmalecircumcision vpex = new VmmcPrepexmalecircumcision();
        vpex.setVmmcid(VMMCID);
        vpex.setDeviceSize(DeviceSize);
        vpex.setDeviceBatchId(DeviceBatchSize);
        vpex.setDeviceExpiriyDate(devDate);
        vpex.setTopicalAnaesthesia(TopicalAnaesthesia);
        vpex.setTopicalAnaesthesiaType(IfAnaesthesiaSpecify);
        pex.add(vpex);
        //molding adverse events during procedure
        VmmcAdverseEventsDuringProcImpl vaep = new VmmcAdverseEventsDuringProcImpl();
        VmmcAdverseevents vae = new VmmcAdverseevents();
        vae.setNoAdverseEvents(noAdverse);
        vae.setHadAdverseEvents(adverse);
        vae.setAemanagment(adverseManagement);
        vae.setVmmcid(VMMCID);
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
        vpp.setNextVisitDate(nextScheduledVisitDate); //
        vpp.setDischargedBy(dischargedBy);
        vpp.setVmmcid(VMMCID);
        vppa.add(vpp);

        //get method
        VmmcCircumcisionmethod method = completedClient.getVcm().get(0);
        String circumMethod = method.getCircumcisionChosenByClients();
        //validate if not postback

        createVisitPlans(circumMethod, completedClient.getP().getVmmcId(), completedClient.getP().getOpdnumber(), completedClient);
        RequestDispatcher disp = request.getRequestDispatcher("/vmmc/vmmcSingleClientDashboard.jsp");
        disp.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    private void createVisitPlans(String method, String vmmcId, String opdNum, CompletedVmmcClientAll sessionClient) {
        List<Visitplans> temp = new ArrayList<>();
        PlannableVisitImpl masterPlan = new PlannableVisitImpl();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Date originalD = cal.getTime();
        if (method.equalsIgnoreCase("Prepex")) {
            for (int i = 1; i <= 49; i++) {
                if (i == 7) {
                    Visitplans plan = new Visitplans();
                    plan.setIsDone(Boolean.FALSE);
                    plan.setAuthorisedBy("system");
                    plan.setVmmcId(vmmcId);
                    plan.setOpdNumber(opdNum);
                    plan.setVisitPlanDescri("Day 7");
                    plan.setVisitPlanDateCreated(new Date());
                    cal.add(Calendar.DAY_OF_MONTH, 7);
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
                if (i == 14) {
                    Visitplans plan = new Visitplans();
                    plan.setIsDone(Boolean.FALSE);
                    plan.setAuthorisedBy("system");
                    plan.setVmmcId(vmmcId);
                    plan.setVisitPlanDescri("Day 14");
                    plan.setVisitPlanDateCreated(new Date());
                    plan.setOpdNumber(opdNum);
                    //do maths
                    int days = VmmcDateUtil.DateDiff(originalD, cal.getTime());
                    cal.add(Calendar.DAY_OF_MONTH, 14 - days);
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

                if (i == 49) {
                    Visitplans plan = new Visitplans();
                    plan.setIsDone(Boolean.FALSE);
                    plan.setAuthorisedBy("system");
                    plan.setVmmcId(vmmcId);
                    plan.setVisitPlanDescri("Day 49");
                    plan.setVisitPlanDateCreated(new Date());
                    plan.setOpdNumber(opdNum);
                    //do maths
                    int days = VmmcDateUtil.DateDiff(originalD, cal.getTime());
                    cal.add(Calendar.DAY_OF_MONTH, 49 - days);
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
