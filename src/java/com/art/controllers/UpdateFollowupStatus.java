/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.controllers;

import com.vmmc.entities.Facilities;
import com.vmmc.entities.Facilityconfig;
import com.vmmc.entities.Tblappointments;
import com.vmmc.entities.Tblstatus;
import com.vmmc.entities.TblstatusId;
import com.vmmc.services.FacilityConfig;
import com.vmmc.services.FacilityConfigServiceImpl;
import com.vmmc.services.OIArtAppointmentsImpl;
import com.vmmc.services.OIArtFollowUpStatusImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lmbano
 */
@WebServlet(name = "UpdateFollowupStatus", urlPatterns = {"/UpdateFollowupStatus"})
public class UpdateFollowupStatus extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
       
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
        // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        OIArtAppointmentsImpl app = new OIArtAppointmentsImpl();
        List<Tblappointments> applist = app.getUniqueAppointment();//change to return all Vmmcs
        Tblappointments currentApp = null;
        String[] array = applist.toArray(new String[applist.size()]);
        List<Tblappointments> epmtylist = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            String patId = array[i];
            List<Tblappointments> appslist = app.getAllAppointment(patId);
            if (!appslist.isEmpty()) {
                currentApp = appslist.get(0);
                epmtylist.add(currentApp);
                /////request.setAttribute("prevvis", prevvis);
            }
        }
        for (Tblappointments i : epmtylist) {

            Date d1 = i.getId().getDateOfAppointment();
            Date d2 = date;
            long milsec = d2.getTime() - d1.getTime();
            int diff = (int) TimeUnit.MILLISECONDS.toDays(milsec);

            if (diff > 0 & diff <= 2) {

                OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                //if(i.getId().getPatientId().getBytes())
                List<Tblstatus> Stat = followupstatusDB.getAllFollowupstatus(i.getId().getPatientId());

                if (!Stat.isEmpty()) {
                    Tblstatus prevSta = Stat.get(0);

                    if (!prevSta.getStatus().equalsIgnoreCase("Transferred to another clinic")) {
                        if (!prevSta.getStatus().equalsIgnoreCase("TO")) {
                            if (!prevSta.getStatus().equalsIgnoreCase("Opted out")) {
                                if (!prevSta.getStatus().equalsIgnoreCase("OO")) {
                                    if (!prevSta.getStatus().equalsIgnoreCase("Died")) {
                                        if (!prevSta.getStatus().equalsIgnoreCase("Missing appointments")) {
                                            Tblstatus followupstatus = new Tblstatus();
                                            TblstatusId followupstatusid = new TblstatusId();
                                            followupstatusid.setPatientId(i.getTblpatients().getPatientId());
                                            followupstatusid.setStatusDate(d2);
                                            followupstatus.setId(followupstatusid);
                                            followupstatus.setStatus("Missing appointments");
                                            followupstatus.setNotes("system");
                                            followupstatusDB.AddArtFollowupstatus(followupstatus);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (diff > 2 & diff < 90) {
                OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                List<Tblstatus> Stat = followupstatusDB.getAllFollowupstatus(i.getId().getPatientId());

                if (!Stat.isEmpty()) {
                    Tblstatus prevSta = Stat.get(0);
                    if (!prevSta.getStatus().equalsIgnoreCase("Transferred to another clinic")) {
                        if (!prevSta.getStatus().equalsIgnoreCase("TO")) {
                            if (!prevSta.getStatus().equalsIgnoreCase("Opted out")) {
                                if (!prevSta.getStatus().equalsIgnoreCase("OO")) {
                                    if (!prevSta.getStatus().equalsIgnoreCase("Died")) {
                                        if (!prevSta.getStatus().equalsIgnoreCase("Defaulter")) {
                                            Tblstatus followupstatus = new Tblstatus();
                                            TblstatusId followupstatusid = new TblstatusId();
                                            followupstatusid.setPatientId(i.getTblpatients().getPatientId());
                                            followupstatusid.setStatusDate(d2);
                                            followupstatus.setId(followupstatusid);
                                            followupstatus.setStatus("Defaulter");
                                            followupstatus.setNotes("system");
                                            followupstatusDB.AddArtFollowupstatus(followupstatus);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            } else if (diff >= 90) {
                OIArtFollowUpStatusImpl followupstatusDB = new OIArtFollowUpStatusImpl();
                List<Tblstatus> Stat = followupstatusDB.getAllFollowupstatus(i.getId().getPatientId());

                if (!Stat.isEmpty()) {
                    Tblstatus prevSta = Stat.get(0);
                    if (!prevSta.getStatus().equalsIgnoreCase("Transferred to another clinic")) {
                        if (!prevSta.getStatus().equalsIgnoreCase("TO")) {
                            if (!prevSta.getStatus().equalsIgnoreCase("Opted out")) {
                                if (!prevSta.getStatus().equalsIgnoreCase("OO")) {
                                    if (!prevSta.getStatus().equalsIgnoreCase("Died")) {
                                        if (!prevSta.getStatus().equalsIgnoreCase("Lost to follow-up")) {
                                            Tblstatus followupstatus = new Tblstatus();
                                            TblstatusId followupstatusid = new TblstatusId();
                                            followupstatusid.setPatientId(i.getTblpatients().getPatientId());
                                            followupstatusid.setStatusDate(d2);
                                            followupstatus.setId(followupstatusid);
                                            followupstatus.setStatus("Lost to follow-up");
                                            followupstatus.setNotes("system");
                                            followupstatusDB.AddArtFollowupstatus(followupstatus);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                continue;
            }
        }
        OIArtFollowUpStatusImpl flo = new OIArtFollowUpStatusImpl();
        List<String> floList = flo.getUniqueFollowupstatus();//  getCurrentFollowupstatus

        String[] statusarray = floList.toArray(new String[floList.size()]);
        List<Tblstatus> statusepmtylist = new ArrayList();
        for (int i = 0;
                i < statusarray.length;
                i++) {
            String patId = statusarray[i];
            List<Tblstatus> statuslist = flo.getAllFollowupstatus(patId);
            if (!statuslist.isEmpty()) {
                Tblstatus currentStatus = statuslist.get(0);
                statusepmtylist.add(currentStatus);
                /////request.setAttribute("prevvis", prevvis);
            }
        }

        request.setAttribute(
                "statuses", statusepmtylist);
        RequestDispatcher disp = request.getRequestDispatcher("art/ArtFollowUpStatus.jsp");

        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
