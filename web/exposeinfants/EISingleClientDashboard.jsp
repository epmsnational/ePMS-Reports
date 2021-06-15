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
        <title>Single Exposed Infant Dashboard</title>
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
                        ${client.p.fullName}  Exposed Infant Dashboard                       
                    </h1>
                </section>
                <hr>
                
                <div class="row state-overview">
                    
                       <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol terques">
                                <a href="ExposedInfantVisits?${client.p.exposedInfantId}"> <i class="fa fa-medkit"></i></a>
                            </div>                            
                            <div class="value">
                                <h3>
                                    All visits
                                </h3>
                                <p style="font-size:small">${client.p.fullName} Visits</p>
                            </div>
                        </section>
                    </div> 
                    
                    
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol yellow">
                                <a  href="ExposedInfantVisit?${client.p.exposedInfantId}">  <i class="fa fa-ambulance"> </i></a>
                            </div>
                            
                            <div class="value">
                                <h3>
                                  New Visit
                                </h3>
                                <p style="font-size:medium">${client.p.fullName} New Visit</p>
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
                                    Enter HIV Results
                                </h3>
                                <p style="font-size:medium">update Information</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol blue">
                               
                                 <a href="AdditionalVisit">  <i class="fa fa-bitbucket-square"></i></i></a>
                            </div>
                            <div class="value">
                                <h3>
                                    Schedule
                                </h3>
                                <p style="font-size:small">Calendar of events</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol weather-bg">
                                <i class="fa fa-print"></i>
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
                                <i class="fa fa-print"></i>
                            </div>
                             
                            <div class="value">
                                <h3>
                                  Followup Status
                                </h3>
                                <p style="font-size:medium">update status</p>
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