/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.controllers;

import com.vmmc.entities.Patient;
import com.vmmc.entities.VmmcAdverseevents;
import com.vmmc.entities.VmmcCircumcisionprocedure;
import com.vmmc.entities.VmmcPostprocedureassessment;
import com.vmmc.entities.VmmcPrepexmalecircumcision;
import com.vmmc.entities.VmmcSurgicalmalecircumcision;
import com.vmmc.services.VmmcAdverseEventsDuringProcImpl;
import com.vmmc.services.VmmcPostProceduralAssImpl;
import com.vmmc.services.VmmcPrePexMCImpl;
import com.vmmc.services.VmmcProcServiceImpl;
import com.vmmc.services.VmmcSurgicalMCImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SYSTEMS DEVELOPER ML
 */
@WebServlet(name = "Mytest", urlPatterns = {"/Mytest"})
public class Mytest extends HttpServlet {

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
            out.println("<title>Servlet Mytest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Mytest at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher disp;
            disp = request.getRequestDispatcher("/demographic/patientCard.jsp");
            
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

        Patient p = (Patient) session.getAttribute("patient");
        // processRequest(request, response);
         String vmmcNumber = request.getParameter("txtvmmcNum");
        String registrationDate = request.getParameter("txtRegDate");
        //for circumcision procedures
        
        String VMMCID = request.getParameter("txtVmmcId");
        String DateofProcedure = request.getParameter("txtDateOfProcedure");
        String CircumiserName = request.getParameter("txtCircumcisersName");
        String CircumciserProfession = request.getParameter("rdIsCircumciserProf");
        String AssistantName = request.getParameter("txtAssistantsName");
        String AssistantProfession = request.getParameter("rdIsAssistantProf");
        
        //for circumcision methods
        
        //int CircumcisionProcedureID = Integer.parseInt("");
       /// String ProcedureType = request.getParameter(VMMCID);
        String lignocaineone = request.getParameter("txt1Lignocaine");
        String lignocainetwo = request.getParameter("txt2Lignocaine");
        String bupivacaine = request.getParameter("txtBupivacaine");
        String diathermyused = request.getParameter("rdIsDiathermy");
        
        String DeviceSize = request.getParameter("txtDeviceSize");
        String DeviceBatchSize = request.getParameter("txtDeviceBatch");
        String DeviceExpirydate = request.getParameter("txtExpireDate");
        String Anaesthesia = request.getParameter("rdIsAnaesthesia");
        String AnaesthesiaType = request.getParameter("txtDeviceSpecify");
                
//for adverse events
        
        String isPain =request.getParameter("rdIsPain");
        String isBleeding =request.getParameter("rdIsBleeding");
        String isAnaesthetic =request.getParameter("rdIsAnaesthetic");
        String isDamage =request.getParameter("rdIsDamage");
        String isSkinRemoval =request.getParameter("rdIsSkinRemoval");
        String isDifficulty =request.getParameter("rdIsDifficulty");
        String isDevice =request.getParameter("rdIsDevice");
        String adverseManagement="Pain#"+isPain+",Bleeding#"+isBleeding+",Anaesthetic#"+isAnaesthetic+",Damage to penis#"+isDamage+",Excess skin removal#"+isSkinRemoval+",Difficulty with placement#"+isDifficulty+",Device malfunction"+isDevice;
        
   //for post procedural assessment
        
        String bloodPressue =request.getParameter("txtBloodPressure");
        String pulse = request.getParameter("txtPulse");
        String prepexDevicedPlaced = request.getParameter("rdIsDressed");
        String clientInstruction = request.getParameter("rdIsInstructions");
        String clientCard = request.getParameter("rdIsCard");
        String AnalgesiaGiven = request.getParameter("rdIsAnalgesia");
        String Drug = request.getParameter("txtAnalgesia");
        String generalCondition = request.getParameter("txtGeneralCondition");
        String nextVisitDate = request.getParameter("txtNextScheduledVisit");
        String dischargedBy = request.getParameter("txtDischargedBy");
  
 

        //// mold vmmcprocedure from above data
        
            VmmcProcServiceImpl mc = new VmmcProcServiceImpl();
            VmmcCircumcisionprocedure vcp = new VmmcCircumcisionprocedure();
            
            //proc.setDateofProcedure(DateofProcedure); ///obtain simple data formatter from HTC
            vcp.setVmmcid(VMMCID);
            vcp.setCircumciserName(CircumiserName);
            vcp.setCircumciserProfession(CircumciserProfession);
            vcp.setAssistantName(AssistantName);
            vcp.setAssistantProfession(AssistantProfession);            
            mc.add(vcp);
            
            VmmcSurgicalMCImpl surg =new VmmcSurgicalMCImpl();
            VmmcSurgicalmalecircumcision vsmc = new VmmcSurgicalmalecircumcision();
            double Bupivacaine = bupivacaine.length()==0?0.0:Double.parseDouble(bupivacaine);
            vsmc.setBupivacaine(Bupivacaine);
           
           /// vsmc.setCircumcisionProcedureId(CircumcisionProcedureID);
            double Lignocaine1 = lignocaineone.length()==0?0.0:Double.parseDouble(lignocaineone);
             vsmc.setLignocaineone(Lignocaine1);
             double Lignocaine2 = lignocainetwo.length()==0?0.0:Double.parseDouble(lignocainetwo);
            vsmc.setLignocainetwo(Lignocaine2);
            vsmc.setDiathermySetting(diathermyused);
            //vsmc.setDiathermyUsed(Boolean.FALSE);
            vsmc.setProcedureStartTime(null);
            vsmc.setProcedureEndtime(null);            
            surg.add(vsmc);
            
            VmmcPrePexMCImpl pex = new VmmcPrePexMCImpl();
            VmmcPrepexmalecircumcision vpex = new VmmcPrepexmalecircumcision();
           // double deviceSize = DeviceSize.length()==0?0.0:Double.parseDouble(DeviceSize);
            vpex.setDeviceSize(DeviceSize);
            vpex.setDeviceBatchId(DeviceBatchSize);
            //vpex.setDeviceExpiriyDate(prepexDevicedPlaced);
           // vpex.setTopicalAnaesthesia(Boolean.FALSE);
            vpex.setTopicalAnaesthesiaType(AnaesthesiaType);
            
            
            
            //molding adverse events during procedure
            
            VmmcAdverseEventsDuringProcImpl vaep = new VmmcAdverseEventsDuringProcImpl();
            VmmcAdverseevents vae =new VmmcAdverseevents();
            //vae.setNoAdverseEvents(Boolean.FALSE);
            //vae.setHadAdverseEvents(Boolean.FALSE);           
            vae.setAemanagment(adverseManagement);            
            vaep.add(vae);
            
            //molding post procedural assessment
            VmmcPostProceduralAssImpl vppa = new VmmcPostProceduralAssImpl();
            VmmcPostprocedureassessment vpp = new VmmcPostprocedureassessment();
            vpp.setBloodPressure(bloodPressue);
            double Pulse = pulse.length()==0?0.0:Double.parseDouble(pulse);
            vpp.setPulse(Pulse);
            vpp.setPrePexDevicePlaced(prepexDevicedPlaced);
            vpp.setClientProvideedInstruction(clientInstruction);
            vpp.setGivenMcclientCard(clientCard);
            vpp.setAnalgesiaGiven(AnalgesiaGiven);
            vpp.setGeneralCondition(generalCondition);
           // vpp.setNextVisitDate(nextVisitDate); //
            vpp.setDischargedBy(dischargedBy);
            vppa.add(vpp);
            
            
            
           RequestDispatcher disp = request.getRequestDispatcher("/vmmc/vmmcSingleClientDashboard.jsp");
        disp.forward(request, response);
          

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
