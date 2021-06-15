<%-- 
    Document   : patientCard
    Created on : Mar 19, 2016, 2:13:59 AM
    Author     : Developer
--%>

<%@page import="java.util.Enumeration"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>All Clients</title>
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
                    <h1>
                        Art Patient Visit dated ${pvisit.id.visitDate} Patient OI/ART Number ${pvisit.id.patientId}
                    </h1>
                </section>
                <hr>

                <div style="margin-left: auto;margin-right: auto;">
                    <div class="col-lg-10" >
                        <section class="panel">
                            <header class="panel-heading">
                                <span style="color: green;" class="fa fa-arrow-circle-down"> VISIT :</span>
                            </header>

                        </section>
                        <section>
                            <div id="errordiv" style="display:none;background: red;animation: blink">
                                <span class="btn btn-danger btn-lg btn-block"><h3>ERROR SAVING PATIENT CARD DATA</h3></span>

                            </div>
                        </section>

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
                                        <a data-toggle="tab" href="#visit-3">
                                            Visit 
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#tbstatus-3">
                                            TB Investigations 
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#arv-3">
                                            <i class="fa fa-medkit"></i>
                                            ARV Status
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#tests-3">
                                            <i class="fa fa-medkit"></i>
                                            Tests
                                        </a>
                                    </li>

                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b><h4>${pmodel.patient.opdnumber}</h4></b></span>
                                <input type="hidden" id="formKey" value="${pmodel.patient.opdnumber}" />
                                <input type="hidden" id="visitDate" value="${pmodel.oiartvisit.id.visitDate}" />
                                <input type="hidden" id="patientId" value="${pmodel.oiartvisit.id.patientId}" />
                                
                                <%-- put some more hidden fields in the event of new diseases --%>    
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h2>PERSONAL DETAILS</h2>  
                                        
                                        <div class="col-lg-4"><b>Patient ART Number:</b></div>
                                        <div class="col-lg-6">${pmodel.patient.patientId} <br> <hr></div>
                                        <div class="col-lg-4"><b>Cohort Number:</b></div>
                                        <div class="col-lg-6">${pmodel.oiartpatient.fileRef} <br> <hr></div>
                                        <div class="col-lg-4"><b> NAME :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.firstName} <br> <hr></div>
                                        <div class="col-lg-4"><b>Surname  :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.lastName} <br> <hr></div>
                                        <div class="col-lg-4"><b>National ID  :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.nationalId}<br> <hr></div>
                                        <div class="col-lg-4"><b>Sex :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.sex}<br> <hr></div>
                                        <div class="col-lg-4"><b>Date of Birth :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.dob}<br> <hr></div>
                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>

                                    </div>
                                    <div id="visit-3" class="tab-pane">
                                        <h2>Visit Details </h2>
                                        <div class="col-lg-4"><b>Visit Date :</b></div><div class="col-lg-6">${pmodel.oiartvisit.id.visitDate} <br> <hr></div>
                                        <div class="col-lg-4"><b>Visit Type :</b></div><div class="col-lg-6">${pmodel.oiartvisit.visitType} <br> <hr></div>
                                        <div class="col-lg-4"><b>DSD Model :</b></div><div class="col-lg-6">${pmodel.oiartvisit.visitTypeCode} <br> <hr></div>
                                        <div class="col-lg-4"><b>Functional Status:</b></div><div class="col-lg-6">${pmodel.oiartvisit.functionalStatusCode} <br> <hr></div>
                                        <div class="col-lg-4"><b> WHO Stage:</b></div><div class="col-lg-6">${pmodel.oiartvisit.whostage} <br> <hr></div>
                                        <div class="col-lg-4"><b>Family Planning :</b></div><div class="col-lg-6">${pmodel.oiartvisit.familyPlanningId} <br> <hr></div>
                                        <div class="col-lg-4"><b>Pregnant Status :</b></div><div class="col-lg-6">${pmodel.oiartvisit.nowPregnant} <br> <hr></div>
                                        <div class="col-lg-4"><b>Date Of First ANC :</b></div><div class="col-lg-6">${pmodel.oiartvisit.dateOfFirstAnc} <br> <hr></div>
                                        <div class="col-lg-4"><b>LMP Date:</b></div><div class="col-lg-6">${pmodel.oiartvisit.lnmpdate} <br> <hr></div>
                                        <div class="col-lg-4"><b>Problem :</b></div><div class="col-lg-6">${pmodel.oiartproblems.id.problemAcronym} <br> <hr></div>

                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>


                                    </div>
                                    <div id="tbstatus-3" class="tab-pane">

                                        <h2>TB Investigations </h2>
                                        <div class="col-lg-4"><b>TB Status code :</b></div><div class="col-lg-6">${pmodel.oiartvisit.tbstatusCode} <br> <hr></div>
                                        <div class="col-lg-4"><b>TB Investigation:</b></div><div class="col-lg-6">${pmodel.oiartvisit.tbinvestigationResults} <br> <hr></div>
                                        <div class="col-lg-4"><b>IPT Eligibility :</b></div><div class="col-lg-6">${pmodel.oiartvisit.isIpteligibility} <br> <hr></div>
                                        <div class="col-lg-4"><b> TPT Reason :</b></div><div class="col-lg-6">${pmodel.oiartvisit.iptreasonCode} <br> <hr></div>
                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>

                                    <div id="arv-3" class="tab-pane">
                                        <h2>ARV  </h2>
                                        <div class="col-lg-4"><b>Arv Status  :</b></div><div class="col-lg-6">${pmodel.oiartvisit.arvstatusCode} <br> <hr></div>
                                        <div class="col-lg-4"><b> ARV reason:</b></div><div class="col-lg-6">${pmodel.oiartvisit.arvreasonCode} <br> <hr></div>
                                        <div class="col-lg-4"><b>ART Regimen :</b></div><div class="col-lg-6">${pmodel.oiartvisit.v2code} <br> <hr></div>
                                        <div class="col-lg-4"><b>Adverse Event :</b></div><div class="col-lg-6">${pmodel.oiartvisit.adverseEventsStatusCode} <br> <hr></div>
                                        <div class="col-lg-4"><b>Follow up Status:</b></div><div class="col-lg-6">${pmodel.oiartstatus.status} <br> <hr></div>
                                        <div class="col-lg-4"><b>Referral to: </b></div><div class="col-lg-6">${pmodel.oiartreferals.id.referralToCode} <br> <hr></div>
                                        <div class="col-lg-4"><b>Next Review Date: </b></div><div class="col-lg-6">${pmodel.oiartappointments.id.dateOfAppointment} <br> <hr></div>
                                        <div class="col-lg-4"><b>Problem :</b></div><div class="col-lg-6">${pmodel.oiartproblems.id.problemAcronym} <br> <hr></div>
                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>

                                    <div id="tests-3" class="tab-pane">
                                        <h2>Tests  </h2>
                                        <ul class="task-list">
                                            <c:forEach var="test" items="${pmodel.oiarttestslist}">
                                                <li>

                                                    <div class="col-lg-4"><b>Test Type :</b></div><div class="col-lg-6">${test.testTypeId} <br> <hr></div>
                                                    <div class="col-lg-4"><b> Test Date:</b></div><div class="col-lg-6">${test.testDate} <br> <hr></div>
                                                    <div class="col-lg-4"><b>Result Date :</b></div><div class="col-lg-6">${test.resultDate} <br> <hr></div>
                                                    <div class="col-lg-4"><b>Result :</b></div><div class="col-lg-6">${test.resultNumeric} <br> <hr></div>
                                                    <div class="col-lg-4"><b>Notes:</b></div><div class="col-lg-6">${test.resultNotes} <br> <hr></div>
                                                    <div class="col-lg-4"><b>Date Received: </b></div><div class="col-lg-6">${test.recievedDate} <br> <hr></div>

                                                </li>
                                                <hr>
                                            </c:forEach>
                                        </ul>
                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
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
        $(document).on("click", "#editDetailsButton", function () {

            var innerData = $(this).parent().parent().find(".col-lg-4");
            var outerData = $(this).parent().parent().find(".col-lg-6");
            var formTitle = $(this).parent().parent().find("H2").text();
            var formVariable = formTitle.replace(/ /g, '_').toLowerCase();

            var formHTML = "";
            formHTML += "<div data-formVariable=" + formVariable + "  class='modal fade' id='modalForm' tabindex='-1' role='dialog' aria-labelledby='exampleModalLabel'>";
            formHTML += "<div class='modal-dialog' role='document'>";
            formHTML += "<div class='modal-content'>";
            formHTML += "<div class='modal-header'>";
            formHTML += "<button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button>";
            formHTML += "<h4 class='modal-title' id='exampleModalLabel'>" + formTitle + "</h4>";
            formHTML += "</div>";
            formHTML += "<div class='modal-body'>";
            formHTML += "<form class='form-horizontal'>";
            $.each(innerData, function (id, option) {

                var labelText = $(innerData).eq(id).text();
                var textBoxText = $(outerData).eq(id).text();

                if (id === 0) {
                    formHTML += "<div class='form-group'>";
                    formHTML += "<label for='recipient-name' class='control-label col-lg-4 col-sm-2' id='labelText'>" + labelText + "</label>";
                    formHTML += "<div class=\"col-lg-8\" >";
                    formHTML += "<input type='text' class='form-control' id='recipientName' readonly value=" + textBoxText + " >";
                    formHTML += "</div>";
                    formHTML += "</div>";
                } else {
                    formHTML += "<div class='form-group'>";
                    formHTML += "<label for='recipient-name' class='control-label col-lg-4 col-sm-2' id='labelText'>" + labelText + "</label>";
                    formHTML += "<div class=\"col-lg-8\" >";
                    formHTML += "<input type='text' class='form-control' id='recipientName' value=" + textBoxText + " >";
                    formHTML += "</div>";
                    formHTML += "</div>";
                }
            });

            formHTML += "</form>";
            formHTML += "</div>";
            formHTML += "<div class='modal-footer'>";
            formHTML += "<button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>";
            formHTML += "<button type='button' class='btn btn-primary' id='saveChanges'>Save Changes</button>";
            formHTML += "</div>";
            formHTML += "</div>";
            formHTML += "</div>";
            formHTML += "</div>";

            $(formHTML).modal("show");
        });

        $(document).on("click", "#saveChanges", function () {

            var formInnerData = $(this).parent().parent().find(".control-label");
            var formOuterData = $(this).parent().parent().find(".form-control");
            var formVariable = $("#modalForm").attr("data-formvariable");
            var formKey = $("#formKey").val();
            var visitDate = $("#visitDate").val();
            var patientId = $("#patientId").val();
            
            variableString = {};
            $.each(formInnerData, function (i, value) {
                var textBox = $(formOuterData).eq(i).val();
                var labelText = $(formInnerData).eq(i).text().replace(/ :/g, '').replace(/ /g, '').toLowerCase();
                variableString[labelText] = textBox;
            });
            variableString["formVariable"] = formVariable;
            variableString["formKey"] = formKey;
            variableString["visitDate"] = visitDate;
            variableString["patientId"] = patientId;
            

            console.log(variableString);

            $.ajax({
                type: "POST",
                url: "EditArtVisistCard",
                data: variableString,
                success: function (data, textStatus, jqXHR) {
                    window.location = "EditArtVisistCard?" + visitDate+"&"+patientId;
                    
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    $("#errordiv").show();
                    blink("#errordiv", -1, 500); //blink a div with the ID of myDiv
                }

            });

            $("#modalForm").modal('hide');
        });

    </script>
    <script>
        /*    $(document).ready(function () {
         
         //call the blink function on the element you want to blink
         blink("#myDiv", 4, 500); //blink a div with the ID of myDiv
         blink("input[type='submit']", 3, 1000); //blink a submit button
         blink("ol > li:first", -1, 100); //blink the first element in an ordered list (infinite times)
         blink(".myClass", 25, 5000); //blink anything that has a myClass on it
         });
         */
        /**
         * Purpose: blink a page element
         * Preconditions: the element you want to apply the blink to, the number of times to blink the element (or -1 for infinite times), the speed of the blink
         **/

    </script>
    <script class="include" type="text/javascript" src="vmmcresources/js/jquery.dcjqaccordion.2.7.js"></script>    
</body>
</html>


