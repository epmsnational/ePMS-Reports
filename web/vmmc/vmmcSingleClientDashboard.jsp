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
        <title>Single Client VMMC Dashboard</title>
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
                        ${client.p.firstName}  Dashboard                       
                    </h1>
                </section>
                <hr>
                <div class="row state-overview">
                    <c:if test="${client.visitPlans.size()lt 1}" var="clients">
                       <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol terques">
                                <a href="VmmcProcedure?${client.p.vmmcId}"> <i class="fa fa-medkit"></i></a>
                            </div>                            
                            <div class="value">
                                <h3>
                                    Go to Procedure
                                </h3>
                                <p style="font-size:small">No vmmc procedures taken</p>
                            </div>
                        </section>
                    </div> 
                    </c:if> 
                    
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol yellow">
                                <a  href="ClientVisits">  <i class="fa fa-ambulance"> </i></a>
                            </div>
                            
                            <div class="value">
                                <h1 >
                                  ${client.visitPlans.size()}
                                </h1>
                                <p style="font-size:medium">Scheduled Visits</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol red">
                                <i class="fa fa-arrow-circle-o-right"></i>
                            </div>
                             
                            <div class="value">
                                <h1>
                                    0
                                </h1>
                                <p style="font-size:medium">Missed Appointments</p>
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
                                    Add Visit
                                </h3>
                                <p style="font-size:small">If Client has adverse effects</p>
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
                                   VMMC Card
                                </h3>
                                <p style="font-size:medium">Print VMMC Details</p>
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