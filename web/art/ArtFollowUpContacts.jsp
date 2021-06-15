<%-- 
    Document   : ArtFollowUpContacts
    Created on : Aug 7, 2020, 12:33:19 PM
    Author     : chihw
--%>

<%@page import="java.util.Enumeration"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>Patient Follow Up Contacts</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <style>
            .detailsButton {
                clear: both;
            }
            .blink {
                color: #FFF !important;
                background: #FC79CE !important;
            }
        </style>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">
                <section class="content-header" style="text-align: center;">
                    <h3>
                        PATIENT FOLLOW UP DETAILS
                    </h3>
                </section>
                <hr>

                <div style="margin-left: auto;margin-right: auto;">
                    <div class="col-lg-10" >
                        <!--tab nav start-->
                        <section class="panel">
                            <header class="panel-heading tab-bg-dark-navy-blue tab-right FontBig FontTimes ">
                                <ul class="nav nav-tabs pull-right">
                                    <li class="active">
                                        <a data-toggle="tab" href="#personal-3">
                                            <i class="fa fa-home"></i>
                                            Personal 
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#contact-3">
                                            <i class="fa fa-envelope-o"></i>
                                            Contact
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#nextofkin-3">
                                            <i class="fa fa-user"></i>
                                            Next Of Kin
                                        </a>
                                    </li>
                                   
                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b><h4>${pmodel.patient.patientId}</h4></b></span>

                                <%-- put some more hidden fields in the event of new diseases --%>    
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h3>PERSONAL DETAILS</h3>
                                        <div class="col-lg-4"><b>NAME :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.firstName} <br> <hr></div>
                                        <div class="col-lg-4"><b>SURNAME :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.lastName}<br> <hr></div>
                                        <div class="col-lg-4"><b>NATIONAL ID :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.nationalId}<br> <hr></div>
                                        <div class="col-lg-4"><b>GENDER :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.sex}<br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF BIRTH :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.dob}<br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF REGISTRATION :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.registrationDate}<br> <hr></div>
                                        <div class="col-lg-4"><b>MARITAL STATUS :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.maritalStatus}<br> <hr></div>
                                    </div>

                                    <div id="contact-3" class="tab-pane">

                                        <h3>PATIENT CONTACT DETAILS</h3>
                                        <div class="col-lg-4"><b>ID :</b></div><div class="col-lg-6">${pmodel.address.id} <br> <hr></div>
                                        <div class="col-lg-4"><b>MOBILE NO :</b></div><div class="col-lg-6">${pmodel.address.mobileNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>TELE NO :</b></div><div class="col-lg-6">${pmodel.address.telNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>WORK ADDRESS :</b></div><div class="col-lg-6">${pmodel.address.workAddress} <br> <hr></div>
                                        <div class="col-lg-4"><b>WORK TEL NO :</b></div><div class="col-lg-6">${pmodel.address.workTelNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>CHIEF :</b></div><div class="col-lg-6">${pmodel.address.chief} <br> <hr></div>
                                        <div class="col-lg-4"><b> KRAAL :</b></div><div class="col-lg-6">${pmodel.address.kraal} <br> <hr></div>
                                        <div class="col-lg-4"><b>VILLAGE :</b></div><div class="col-lg-6">${pmodel.address.village} <br> <hr></div>
                                        <div class="col-lg-4"><b>SCHOOL :</b></div><div class="col-lg-6">${pmodel.address.school} <br> <hr></div>
                                        <div class="col-lg-4"><b>CLINIC :</b></div><div class="col-lg-6">${pmodel.address.clinic} <br> <hr></div>


                                    </div>

                                    <div id="nextofkin-3" class="tab-pane">
                                        <h3>NEXT OF KIN DETAILS</h3>
                                        <div class="col-lg-4"><b>ID :</b></div><div class="col-lg-6">${pmodel.nok.id} <br> <hr></div>
                                        <div class="col-lg-4"><b>NAME :</b></div><div class="col-lg-6">${pmodel.nok.firstName} <br> <hr></div>
                                        <div class="col-lg-4"><b>SURNAME :</b></div><div class="col-lg-6">${pmodel.nok.lastName} <br> <hr></div>
                                        <div class="col-lg-4"><b>RELATIONSHIP :</b></div><div class="col-lg-6">${pmodel.nok.relationType} <br> <hr></div>
                                        <div class="col-lg-4"><b>CONTACT NO :</b></div><div class="col-lg-6">${pmodel.nok.contactNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>PHYSICAL ADDRESS :</b></div><div class="col-lg-6">${pmodel.nok.physicalAddress} <br> <hr></div>
                                        <div class="col-lg-4"><b>CHIEF :</b></div><div class="col-lg-6">${pmodel.nok.chief} <br> <hr></div>
                                        <div class="col-lg-4"><b> KRAAL :</b></div><div class="col-lg-6">${pmodel.nok.kraal} <br> <hr></div>
                                        <div class="col-lg-4"><b>VILLAGE :</b></div><div class="col-lg-6">${pmodel.nok.village} <br> <hr></div>
                                        <div class="col-lg-4"><b>SCHOOL :</b></div><div class="col-lg-6">${pmodel.nok.school} <br> <hr></div>
                                        <div class="col-lg-4"><b>CLINIC :</b></div><div class="col-lg-6">${pmodel.nok.clinic} <br> <hr></div>

                                    </div>
                                    
                                </div>
                            </div>
                        </section>
                        <!--tab nav start-->
                    </div>
                </div>
            </section>
        </section>
        <!--main content end-->
    </section>
    <!-- ./wrapper -->
    <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
    <script>
        function blink(elem, times, speed) {
            if (times > 0 || times < 0) {
                if ($(elem).hasClass("blink"))
                    $(elem).removeClass("blink");
                else
                    $(elem).addClass("blink");
            }

            clearTimeout(function () {
                blink(elem, times, speed);
            });

            if (times > 0 || times < 0) {
                setTimeout(function () {
                    blink(elem, times, speed);
                }, speed);
                times -= .5;
            }
        }
        
    </script>
    <script class="include" type="text/javascript" src="vmmcresources/js/jquery.dcjqaccordion.2.7.js"></script>    
</body>
</html>





