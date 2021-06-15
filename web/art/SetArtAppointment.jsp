<%-- 
    Document   : SetArtAppointment
    Created on : Aug 7, 2020, 5:58:37 PM
    Author     : chihw
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title> Appointments </title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <!-- Content Wrapper. Contains page content -->
        <br/>
        <br/>
        <br/>
        <div class="content-wrapper" style="min-height: 900px; width: 65%; margin-left: auto;margin-right: auto;margin-top: 10px;">
            <!-- Content Header (Page header) -->
            <section class="content-header">
                <h1>
                    APPOINTMENTS FOR &nbsp; <span style="color:red">${patient.firstName}</span>
                </h1>
            </section>
            <!-- Main content -->
            <section class="content">
                <!-- Default box -->
                <section class="panel panel-primary">
                    <header class="panel-heading">
                        SCHEDULE FOR APPOINTMENTS 
                    </header>   

                    <div class="panel-body">
                        <form class="form-horizontal" role="form" action="SetArtAppointment" method="POST">
                            <div class="form-group">
                                <label class="col-lg-3 control-label">OI/ART Number :</label>
                                <div class="col-lg-4">
                                    <input readonly="readonly" type="text" class="form-control"  name="txtARTNum" value="<c:out value="${patient.patientId}"/>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="appointmentMade" class="col-lg-3 control-label">Date of Appointment Made:</label>
                                <div class="col-lg-3">
                                    <input type="date" class="form-control"  placeholder="Date of Appointment Made" name="txtDateMade" required="required">

                                </div>

                                <label for="appointmentGiven" class="col-lg-3 control-label">Date of Appointment Given:</label>
                                <div class="col-lg-3">
                                    <input type="date" class="form-control"  placeholder="Date of Appointment Given" name="txtDateGiven" required="required">

                                </div>
                            </div>
                            <div class="form-group">
                                <label for="notes" class="col-lg-3 control-label">Notes :</label>
                                <div class="col-lg-5 col-sm-10">
                                    <input type="text" class="form-control" placeholder="write notes here...." name="notes">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-lg-offset-2 col-lg-10">
                                    <button type="submit" class="btn btn-primary">Schedule Appointment</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </section>

            </section>
    </section>
    <%@include file="../footer.jsp" %>
    <%@include file="/vmmcwizardjs.jsp" %>
    <%@include file="../footer.jsp" %>

    <script>

        //step wizard

        $(function () {
            $('#default').stepy({
                backLabel: 'Previous',
                block: true,
                nextLabel: 'Next',
                titleClick: true,
                titleTarget: '.stepy-tab'
            });
        });
    </script>
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