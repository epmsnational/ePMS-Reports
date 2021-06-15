<%-- 
    Document   : leftsidebar
    Created on : 02-Jan-2016, 13:42:32
    Author     : System Developer
--%>

<!--sidebar start-->
<aside>

    <!-- sidebar menu start-->
    <div tabindex="5000" class="nav-collapse " id="sidebar" style="outline: invert; overflow-x: hidden; overflow-y: hidden;">
        <ul class="sidebar-menu" id="nav-accordion">
            <li>
                <a href="MainDashboard">
                    <i class="fa fa-dashboard"></i>
                    <span>Dashboard</span>
                </a>
            </li>               
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-user-md"></i> <span>Registration</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href=AllClients><i class="fa fa-circle-o"></i>View All Clients</a></li> 
                    <!--   <li><a href="demographic/ajaxPatients.jsp"><i class="fa fa-circle-o"></i>View Ajax All Clients</a></li>-->
                    <li><a href=AddPatientServlet><i class="fa fa-circle-o"></i>Add Patient</a></li>
                </ul>
            </li>
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-h-square"></i> <span>HTS Module</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">

                    <li><a href="AllHtsServ"><i class="fa fa-circle-o"></i>View All HTS Clients</a></li>
                    <li><a href="AllHivPositive"><i class="fa fa-circle-o"></i>View All HIV Positive Clients</a></li>

                </ul>
            </li>

            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-scissors"></i> <span>Case Based Notification</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href=ReferCBS><i class="fa fa-circle-o"></i>Notify a Patient</a></li>
                    <li><a href=AllNotifications><i class="fa fa-circle-o"></i>All Notified Patients</a></li>
                    <li><a href=VisualizationServlet><i class="fa fa-circle-o"></i>Visualization</a></li>
                    <li class="sub-menu">
                        <a href="#">
                            <i class="fa fa-gear"></i> <span>CBS Export For analysis </span> <i class="fa fa-angle-left pull-right"></i>
                        </a>
                        <ul class="sub">
                            <li><a href=RecencyExport><i class="fa fa-circle-o"></i>Recency Testing</a></li>
                            <li><a href="#"><i class="fa fa-circle-o"></i>Infants </a></li>
                        </ul>
                    </li>

                </ul>
            </li>
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-h-square"></i> <span>OI/ART Module</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href="SingleArtClient"><i class="fa fa-circle-o"></i>Capture Client Visit</a></li>
                    <li><a href="AllOIARTServ"><i class="fa fa-circle-o"></i>View All ART Clients</a></li>
                    <li><a href="ARTHighVRL"><i class="fa fa-circle-o"></i>High Viral Load</a></li>
                    <li><a href="ARTVRLDue"><i class="fa fa-circle-o"></i>Viral Load due</a></li>
                    <li><a href="PreArtClients"><i class="fa fa-circle-o"></i>Pre ART Clients</a></li>
                    <li><a href="ARTAppointments"><i class="fa fa-circle-o"></i>ART Appointment</a></li>
                    <li><a href="MissedAppointment"><i class="fa fa-circle-o"></i>Missed Appointment Clients</a></li>
                    <li><a href="ArtLostToFollowUp"><i class="fa fa-circle-o"></i>LTFU Clients</a></li>


                </ul>
            </li>
            <%--
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-scissors"></i> <span>VMMC Module</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href=AllVmmcsServ><i class="fa fa-circle-o"></i>Vmmc Clients` Data</a></li>



                </ul>
            </li>
            --%>
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-scissors"></i> <span>STI Module</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href=AllSTIClients><i class="fa fa-circle-o"></i>All STI Clients</a></li>
                    <li><a href=AllSTICs><i class="fa fa-circle-o"></i>Congenital Syphilis Notifications</a></li>
                    <li><a href=AllCSExposedInfants><i class="fa fa-circle-o"></i>Congenital Syphilis Exposed infants</a></li>



                </ul>
            </li>

            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-gear"></i> <span>MOHCC REPORTS </span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href="#"><i class="fa fa-circle-o"></i>CBS</a></li>
                    <li class="sub-menu">
                        <a href="#">
                            <i class="fa fa-gear"></i> <span>OI/ART </span> <i class="fa fa-angle-left pull-right"></i>
                        </a>
                        <ul class="sub">
                            <li><a href="ArtSectionCReport"><i class="fa fa-circle-o"></i>Section C</a></li>
                            <li><a href="ArtSectionDReport"><i class="fa fa-circle-o"></i>Section D</a></li>
                        </ul>

                    </li>
                </ul>
            </li> 
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-h-square"></i> <span>MOHCC EXPORTS</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li class="sub-menu">
                        <a href="#">
                            <i class="fa fa-gear"></i> <span>STI Export For analysis </span> <i class="fa fa-angle-left pull-right"></i>
                        </a>
                        <ul class="sub">
                            <li><a href="StiAllExport"><i class="fa fa-circle-o"></i>STI </a></li>
                            <li><a href="CongenitalCaseReportAll"><i class="fa fa-circle-o"></i>Congenital Case</a></li>
                        </ul>
                    </li>

                    <li class="sub-menu">
                        <a href="#">
                            <i class="fa fa-gear"></i> <span>ART Patient List </span> <i class="fa fa-angle-left pull-right"></i>
                        </a>
                        <ul class="sub">
                            <li><a href="ARTTests"><i class="fa fa-circle-o"></i>List Of tests</a></li>
                            <li><a href="ARTAppointments"><i class="fa fa-circle-o"></i>Appointments Export</a></li>
                            <li><a href="ARTFollowUpStatus"><i class="fa fa-circle-o"></i>Patient Status</a></li>
                            <li><a href="UpdateFollowupStatus"><i class="fa fa-circle-o"></i>update Status</a></li>

                        </ul>

                    </li>
                    <li class="sub-menu">
                        <a href="#">
                            <i class="fa fa-gear"></i> <span>ART Export For analysis </span> <i class="fa fa-angle-left pull-right"></i>
                        </a>
                        <ul class="sub">
                            <li><a href="ArtTestsExport"><i class="fa fa-circle-o"></i>Patient Tests</a></li>
                            <li><a href="ArtPatientStatuExport"><i class="fa fa-circle-o"></i>Follow up status</a></li>
                            <li><a href="ArtAppointmentsExport"><i class="fa fa-circle-o"></i>Appointments Export</a></li>
                            <li><a href="CbsAllExport"><i class="fa fa-circle-o"></i>CBS Export</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-gear"></i> <span>SETTINGS</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href="RegisterStaff"><i class="fa fa-circle-o"></i>Setup Clinicians</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>Setup Province</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>Setup Facility</a></li>
                </ul>
            </li> 
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-gear"></i> <span>BACKUP</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href="SystemBackup"><i class="fa fa-circle-o"></i>Backup</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>Restore</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>Macrodatabase</a></li>
                </ul>
            </li> 
            <li class="sub-menu">
                <a href="#">
                    <i class="fa fa-user"></i> <span>Admin Module</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sub">
                    <li><a href="AllUsers"><i class="fa fa-circle-o"></i>Users</a></li>
                    <li><a href="RegisterUser"><i class="fa fa-circle-o"></i>Add User</a></li>
                </ul>
            </li>
        </ul>

        <!-- sidebar menu end-->
    </div>
</aside>