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
        <title>Main Dashboard</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">
                <section class="content-header" style="text-align: center;">
                    <h1>
                        MINISTRY OF HEALTH AND CHILD CARE 
                    </h1>
                </section>
                <hr>
                <!--state overview start-->
                <div class="row state-overview">
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol terques">
                                <a href="AllClients"> <i class="fa fa-user"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${patients}</div>
                                </h1>
                                <p style="font-size:large">Registered Clients</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol blue">

                                <a href="ArtDashboard"><i class="fa fa-user"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${art}</div>
                                </h1>
                                <p style="font-size:large">OI/ART Clients</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol yellow">
                                <a href="AllHivPositive"><i class="fa fa-user"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${hts}</div>
                                </h1>
                                <p style="font-size:large">HTS +ve Clients</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol blue">
                                <a href="AllNotifications"><i class="fa fa-umbrella"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${cbs}</div>
                                </h1>
                                <p style="font-size:large">CBS</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6" style="font-weight: bold">
                        <section class="panel">
                            <div class="symbol blue">
                                <a href="AllHivPosWomen"><i class="fa fa-umbrella"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${women}</div>
                                </h1>
                                <p style="font-size:large">HIV+ Female Clients</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">

                            <div class="symbol weather-bg">
                                <a href="AllSTIClients"><i class="fa fa-user"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${sti}</div>
                                </h1>
                                <p style="font-size:large">STI Clients</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol red">
                                <a href="AllExposedInfants"><i class="fa fa-user"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">${expossed}</div>
                                </h1>
                                <p style="font-size:large">Exposed Infants</p>
                            </div>
                        </section>
                    </div><div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol weather-bg">
                                <a href="#"><i class="fa fa-umbrella"></i></a>
                            </div>

                            <div class="value">
                                <h1>
                                    <div class="count-number">0</div>
                                </h1>
                                <p style="font-size:large">TB Clients</p>
                            </div>
                        </section>
                    </div>

                            
                            <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol weather-bg">
                                <a href="#"><i class="fa fa-umbrella"></i></a>
                            </div>
                            <div class="value">
                                <h1>
                                    <div class="count-number">0</div>
                                </h1>
                                <p style="font-size:large">Active Patients</p>
                            </div>
                        </section>
                    </div>
                </div>
                <!--state overview end-->

                <% 
                    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                    
                    response.setHeader("Pragma", "no-cache");
                    
                    response.setHeader("Expires", "0");
                
                %>

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

