<%-- 
    Document   : vmmcSingleClientDashboard
    Created on : Oct 31, 2015, 10:49:52 AM
    Author     : Trevor
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>Single Client OI/ART Dashboard</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper" style="width:90%;margin-left: auto;margin-right: auto;">
                <section class="content-header" style="text-align: center;">
                    <h1>
                        ${client.p.firstName}  OI/ART Dashboard                       
                    </h1>
                </section>
                <hr>

                <div class="row state-overview">

                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol terques">
                                <a href="ArtClientVisits?${client.p.patientId}&${client.p.opdnumber}"> <i class="fa fa-medkit"></i></a>
                            </div>                            
                            <div class="value">
                                <h3>
                                    All visits
                                </h3>
                                <p style="font-size:small">all recorded visits</p>
                            </div>
                        </section>
                    </div> 


                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol yellow">
                                <a  href="OIARTVisitServ?${client.p.patientId}&${client.p.opdnumber}">  <i class="fa fa-ambulance"> </i></a>
                            </div>

                            <div class="value">
                                <h3>
                                    Add New Visit
                                </h3>
                                <p style="font-size:medium">Enter New Visit</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol red">
                                <i class="fa fa-arrow-circle-o-right"></i>
                            </div>

                            <div class="value">
                                <h3>
                                    Disclosure Information
                                </h3>
                                <p style="font-size:medium">update Infor</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol blue">

                                <a href="SetArtAppointment?${client.p.patientId}">  <i class="fa fa-bitbucket-square"></i></i></a>
                            </div>
                            <div class="value">
                                <h3>
                                    Appointment
                                </h3>
                                <p style="font-size:small">Calendar of events</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol weather-bg">
                                <a href="ArtLaboratory?${client.p.patientId}&${client.p.opdnumber}">  <i class="fa fa-bitbucket-square"></i></i></a>
                            </div>

                            <div class="value">
                                <h3>
                                    Lab results
                                </h3>
                                <p style="font-size:medium">enter received results</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol weather-bg">
                                <a  href="ArtUpdateFolloUpStatus?${client.p.patientId}&${client.p.opdnumber}">  <i class="fa fa-ambulance"> </i></a>

                            </div>

                            <div class="value">
                                <h3>
                                    Followup Status
                                </h3>

                                <p style="font-size:medium">update status</p>
                            </div>

                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol weather-bg">
                                <a href="ArtPatientVisitsListEdit?${client.p.patientId}&${client.p.opdnumber}"> <i class="fa fa-arrow-circle-o-right"></i></a>

                            </div>

                            <div class="value">
                                <h3>
                                    Visits
                                </h3>

                                <p style="font-size:medium">edit visit</p>
                            </div>

                        </section>
                    </div>

                </div>




            </section>
        </section>
        <!--main content end-->
    </section>
    <!-- ./wrapper -->
    <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
    <script src="vmmcresources/js/count.js"></script>


    <script type="text/javascript">
        RevSlide.initRevolutionSlider();
        $(window).load(function () {
            $('[data-zlname = reverse-effect]').mateHover({
                position: 'y-reverse',
                overlayStyle: 'rolling',
                overlayBg: '#fff',
                overlayOpacity: 0.7,
                overlayEasing: 'easeOutCirc', rollingPosition: 'top', popupEasing: 'easeOutBack', popup2Easing: 'easeOutBack'});
        });
        $(window).load(function () {
            $('.flexslider').flexslider({animation: "slide", start: function (slider) {
                    $('body').removeClass('loading');
                }});
        });
    </script>

    <script type="text/javascript">
        jQuery(document).ready(function () {

        });
    </script>
</body>
</html>