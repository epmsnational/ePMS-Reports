<%-- 
   
    
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>Single Client STI Dashboard</title>
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
                                    
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol yellow">
                                <a  href="PartnerNotification">  <i class="fa fa-ambulance"> </i></a>
                            </div>
                            
                            <div class="value">
                                <h3 >
                                  Notification
                                </h3>
                                <p style="font-size:medium">Partner Notification</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol red">
                                <a href="TreatmentSchedule">   <i class="fa fa-arrow-circle-o-right"></i></a>
                            </div>
                             
                            <div class="value">
                                <h3>
                                   Schedule
                                </h3>
                                <p style="font-size:medium">Treatment Schedule</p>
                            </div>
                        </section>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <section class="panel">
                            <div class="symbol blue">
                               
                                 <a href="ListAllSyndromes">  <i class="fa fa-bitbucket-square"></i></i></a>
                            </div>
                            <div class="value">
                                <h3>
                                   Syndromes
                                </h3>
                                <p style="font-size:small"> List Of All Syndromes</p>
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