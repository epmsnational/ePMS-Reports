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
                        PATIENT CARD
                    </h1>
                </section>
                <hr>

                <div style="margin-left: auto;margin-right: auto;">
                    <div class="col-lg-10" >
                        <section class="panel">
                            <header class="panel-heading">
                                <span style="color: green;" class="fa fa-arrow-circle-down"> REFER THIS PATIENT TO :</span>
                            </header>
                            <div class="panel-body">
                                <span type="button" class="btn btn-shadow btn-default"><a href="ProgReferred?prog=VMMC&opdNum=${pmodel.patient.opdnumber}">VMMC PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-primary"><a href="ProgReferred?prog=HTS&opdNum=${pmodel.patient.opdnumber}">HTS PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-success"><a href="ProgReferred?prog=ART&opdNum=${pmodel.patient.opdnumber}">OI ART PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-info" ><a href="ProgReferred?prog=CBSCIF&opdNum=${pmodel.patient.opdnumber}">CBS PROGRAM (No CIF)</a></span>
                                <span type="button" class="btn btn-shadow btn-warning"><a href="ProgReferred?prog=STI&opdNum=${pmodel.patient.opdnumber}">STI PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-danger"><a href="ProgReferred?prog=TB&opdNum=${pmodel.patient.opdnumber}">TB PROGRAM</a></span>
                            </div>
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
                                    <li class="">
                                        <a data-toggle="tab" href="#Medisociety-3">
                                            <i class="fa fa-medkit"></i>
                                            Medical Aid
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#vitals-3">
                                            <i class="fa fa-stethoscope"></i>
                                            Vitals
                                        </a>
                                    </li>
                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b><h4>${pmodel.patient.opdnumber}</h4></b></span>
                                <input type="hidden" id="formKey" value="${pmodel.patient.opdnumber}" />
                                <input type="hidden" id="facilityCode" value="${pmodel.patient.facilityCode}" />
                                <input type="hidden" id="vmmcId" value="${pmodel.patient.vmmcId}" />
                                <input type="hidden" id="tbId" value="${pmodel.patient.tbId}" />
                                <input type="hidden" id="htsId" value="${pmodel.patient.htsId}" />

                                <%-- put some more hidden fields in the event of new diseases --%>    
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h3>PERSONAL DETAILS</h3>
                                        <div class="col-lg-4"><b>OPD NUMBER :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.opdnumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>NAME :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.firstName} <br> <hr></div>
                                        <div class="col-lg-4"><b>SURNAME :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.lastName}<br> <hr></div>
                                        <div class="col-lg-4"><b>NATIONAL ID :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.nationalId}<br> <hr></div>
                                        <div class="col-lg-4"><b>GENDER :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.sex}<br> <hr></div>
                                        <div class="col-lg-4"><b>AGE :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.age}<br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF BIRTH :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.dob}<br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF REGISTRATION :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.registrationDate}<br> <hr></div>
                                        <div class="col-lg-4"><b>MARITAL STATUS :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.maritalStatus}<br> <hr></div>
                                        <div class="col-lg-4"><b>ORPHAN STATUS :</b></div>
                                        <div class="col-lg-6">  ${pmodel.patient.ophanStatus}  <br> <hr></div>
                                        <div class="col-lg-4"><b>EDUCATION LEVEL :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.educationalLevel}<br> <hr></div>
                                        <div class="col-lg-4"><b>OCCUPATION :</b></div>
                                        <div class="col-lg-6">${pmodel.patient.occupation}<br> <hr></div>



                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>

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

                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>

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

                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>

                                    </div>
                                    <div id="vitals-3" class="tab-pane">

                                        <h3>BASIC VITALS</h3>
                                        <div class="col-lg-4"><b>ID :</b></div><div class="col-lg-6">${pmodel.bVitals.id} <br> <hr></div>
                                        <div class="col-lg-4"><b>TEMPERATURE :</b></div><div class="col-lg-6">${pmodel.bVitals.temperature} <br> <hr></div>
                                        <div class="col-lg-4"><b>BLOOD PRESSURE (Systolic/Dystolic) :</b></div><div class="col-lg-6">${pmodel.bVitals.bloodPressure} <br> <hr></div>
                                        <div class="col-lg-4"><b>WEIGHT:</b></div><div class="col-lg-6">${pmodel.bVitals.weight} <br> <hr></div>
                                        <div class="col-lg-4"><b>HEIGHT:</b></div><div class="col-lg-6">${pmodel.bVitals.height} <br> <hr></div>
                                        <div class="col-lg-4"><b>FUNCTIONAL STATUS :</b></div><div class="col-lg-6">${pmodel.bVitals.functionalStatus} <br> <hr></div>
                                        <div class="col-lg-4"><b>OTHER :</b></div><div class="col-lg-6">${pmodel.bVitals.basicvitalscol} <br> <hr></div>

                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>

                                    <div id="Medisociety-3" class="tab-pane">

                                        <h3>MEDICAL INSURANCE</h3>

                                        <div class="col-lg-4"><b>ID :</b></div><div class="col-lg-6">${pmodel.ins.id} <br> <hr></div>
                                        <div class="col-lg-4"><b>MEDICAL INSURANCE NAME :</b></div><div class="col-lg-6">${pmodel.ins.medicalInsuranceName} <br> <hr></div>
                                        <div class="col-lg-4"><b>MEDICAL SOC NUMBER :</b></div><div class="col-lg-6">${pmodel.ins.medicalInsuranceNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>SCHEME TYPE</b></div><div class="col-lg-6">${pmodel.ins.medicalInsuranceScheme} <br> <hr></div>
                                        <div class="col-lg-4"><b>RELATION:</b></div><div class="col-lg-6">${pmodel.ins.medicalInsuranceRelation} <br> <hr></div>

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
            var htsId = $("#htsId").val();
            var tbId = $("#tbId").val();
            var vmmcId = $("#vmmcId").val();
            var facilityCode = $("#facilityCode").val();

            variableString = {};
            $.each(formInnerData, function (i, value) {
                var textBox = $(formOuterData).eq(i).val();
                var labelText = $(formInnerData).eq(i).text().replace(/ :/g, '').replace(/ /g, '').toLowerCase();
                variableString[labelText] = textBox;
            });
            variableString["formVariable"] = formVariable;
            variableString["formKey"] = formKey;
            variableString["facilityCode"] = facilityCode;
            variableString["vmmcId"] = vmmcId;
            variableString["tbId"] = tbId;
            variableString["htsId"] = htsId;

            console.log(variableString);

            $.ajax({
                type: "POST",
                url: "EditDemographic",
                data: variableString,
                success: function (data, textStatus, jqXHR) {
                    window.location = "PatientCard?" + formKey;
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


