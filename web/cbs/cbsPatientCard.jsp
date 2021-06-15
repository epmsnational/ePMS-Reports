<%-- 
    Document   : cbsPatientCard
    Created on : Jul 22, 2019, 12:30:05 PM
    Author     : DevOOP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>CBS Notification Card</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <style>
            .detailsButton {
                clear: both;
            }
        </style>
        <script type="text/javascript" src="bootstrap.min.js"></script>
        <script type="text/javascript" src="jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="jquery-3.1.0.min.js"></script>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">
                <section class="content-header" style="text-align: center;">
                    <span>
                        <h1>
                            CBS  PATIENT CARD
                        </h1>
                    </span>
                </section>
                <hr>
                <div style="margin-left: auto;margin-right: auto;">
                    <div class="col-lg-10" >
                        <section class="panel">
                            <header class="panel-heading">
                                <span style="color: red;" class="fa fa-arrow-circle-down"> REFER THIS PATIENT TO :</span>
                            </header>
                            <div class="panel-body">
                                <span type="button" class="btn btn-shadow btn-default"><a href="ProgReferred?prog=VMMC&opdNum=${pmodel.patient.opdnumber}">VMMC PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-danger"><a href="ProgReferred?prog=ART&opdNum=${pmodel.patient.opdnumber}">OI/ART PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-success">STI PROGRAM</span>
                                <span type="button" class="btn btn-shadow btn-warning">TB PROGRAM</span>
                                <span type="button" class="btn btn-shadow btn-danger">PHARMACY PROGRAM</span>
                            </div>
                        </section>
                        <!--tab nav start-->
                        <section class="panel">
                            <header class="panel-heading tab-bg-dark-navy-blue tab-right FontBig FontTimes ">
                                <ul class="nav nav-tabs pull-right">
                                    <li class="active">
                                        <a data-toggle="tab" href="#personal-3">
                                            <i class="fa fa-home"></i>
                                            PERSONAL 
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#contact-3">
                                            <i class="fa fa-envelope-o"></i>
                                            RECENCY TESTING
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#nextofkin-3">
                                            <i class="fa fa-user"></i>
                                            INFANTS
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#results-3">
                                            <i class="fa fa-stethoscope"></i>
                                            HIV DIAGNOSIS
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#testing-3">
                                            <i class="fa fa-medkit"></i>
                                            RISK FACTORS(PAST 12 MONTHS)
                                        </a>
                                    </li>
                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b>${pmodel.patient.opdnumber}</b></span>
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h2>PERSONAL DETAILS</h2>
                                        <span class="btn btn-success btn-lg btn-block"><h3>HTS NUMBER :${pmodel.patient.htsId}</h3></span>
                                        <br>
                                        <div class="col-lg-4"><b>OPD NUMBER :</b></div>
                                        <div class="col-lg-6"> <br>${pmodel.patient.opdnumber}<hr></div>
                                        <div class="col-lg-4"><b>NAME :</b></div>
                                        <div class="col-lg-6"> <br>${pmodel.patient.firstName}<hr></div>
                                        <div class="col-lg-4"><b>SURNAME :</b></div>
                                        <div class="col-lg-6"><br>${pmodel.patient.lastName}<hr></div>
                                        <div class="col-lg-4"><b>NATIONAL ID :</b></div>
                                        <div class="col-lg-6"><br>${pmodel.patient.nationalId}<hr></div>
                                        <div class="col-lg-4"><b>GENDER :</b></div>
                                        <div class="col-lg-6"><br>${pmodel.patient.sex}<hr></div>
                                        <div class="col-lg-4"><b>DATE OF REGISTRATION :</b></div>
                                        <div class="col-lg-6"><br>${pmodel.patient.registrationDate}<hr></div>
                                        <div class="col-lg-4"><b>MARITAL STATUS :</b></div>
                                        <div class="col-lg-6"><br>${pmodel.patient.maritalStatus}<hr></div>
                                        <div class="col-lg-4"><b>EDUCATION LEVEL :</b></div>
                                        <div class="col-lg-6"><br>${pmodel.patient.educationalLevel}<hr></div>
                                    </div>

                                    <div id="contact-3" class="tab-pane">

                                        <h2>RECENCY TESTING</h2>
                                        <span class="btn btn-success btn-lg btn-block"><h3>HTS NUMBER :${pmodel.patient.htsId}</h3></span>
                                        <br>
                                        <div class="col-lg-4"><b>TEST DONE :</b></div><div class="col-lg-6">${tmodel.recencyTesting}<br><hr></div>
                                        <div class="col-lg-4"><b>REASON TEST NOT DONE :</b></div><div class="col-lg-6">${tmodel.recencyTestingNotDone}<br> <hr></div>
                                        <div class="col-lg-4"><b>TEST RESULT :</b></div><div class="col-lg-6">${tmodel.recencyTestingResult}<br> <hr></div>
                                        <div class="col-lg-4"><b>TEST DATE :</b></div><div class="col-lg-6">${tmodel.recencyTestingDate}<br> <hr></div>
                                        <div class="col-lg-4"><b>TESTER NAME :</b></div><div class="col-lg-6">${tmodel.recencyTesterName}<br> <hr></div>
                                    </div>
                                    <div id="nextofkin-3" class="tab-pane">
                                        <h2>INFANTS</h2>
                                        <span class="btn btn-success btn-lg btn-block"><h3>HTS NUMBER :${pmodel.patient.htsId}</h3></span>
                                        <br>
                                        <div class="col-lg-4"><b>PLACE OF DELIVERY:</b></div><div class="col-lg-6">${model.placeOfDelivery}<br><hr></div>
                                        <div class="col-lg-4"><b>DELIVERED BY:</b></div><div class="col-lg-6">${model.deliveredBy}<br><hr></div>
                                        <div class="col-lg-4"><b>BIRTH WEIGHT:</b></div><div class="col-lg-6">${model.birthWeight}<br><hr></div>
                                        <div class="col-lg-4"><b>FEEDING MODE:</b></div><div class="col-lg-6">${model.feedingMethod}<br><hr></div>
                                        <div class="col-lg-4"><b>FEEDING DURATION:</b></div><div class="col-lg-6">${model.feedingDuration}<br><hr></div>
                                        <div class="col-lg-4"><b>PROPHYLAXIS :</b></div><div class="col-lg-6">${model.infantProphylaxis}<br><hr></div>
                                        
                                    </div>
                                        
                                        <div id="results-3" class="tab-pane">
                                        <h2>HIV DIAGNOSIS </h2>
                                        <span class="btn btn-success btn-lg btn-block"><h3>HTS NUMBER :${pmodel.patient.htsId}</h3></span>
                                        <br>
                                        <div class="col-lg-4"><b>DATE OF HIV DIAGNOSIS  :</b></div><div class="col-lg-6">${tmodel.dateHivDiagnosed}<br><hr></div>
                                        <div class="col-lg-4"><b>FIRST HIV TEST :</b></div><div class="col-lg-6">${tmodel.firstTestMethod}<br><hr></div>
                                        <div class="col-lg-4"><b>FIRST HIV TEST RESULT  :</b></div><div class="col-lg-6">${tmodel.firstTestResult}<br><hr></div>
                                        <div class="col-lg-4"><b>SECOND HIV TEST :</b></div><div class="col-lg-6">${tmodel.secondTestMethod}<br><hr></div>
                                        <div class="col-lg-4"><b>SECOND HIV TEST RESULT :</b></div><div class="col-lg-6">${tmodel.secondTestResult}<br><hr></div>
                                    </div>
                                        
                                    <div id="testing-3" class="tab-pane">

                                        <h2>RISK FACTORS FOR THE PAST 12 MONTHS</h2>
                                        <span class="btn btn-success btn-lg btn-block"><h3>HTS NUMBER :${pmodel.patient.htsId}</h3></span>
                                        <br>
                                        <div class="col-lg-4"><b>Has been sexual abused :</b></div>
                                        <div class="col-lg-6">${model.sexualabused}<br><hr></div>
                                        <div class="col-lg-4"><b>Had sex with male :</b></div>
                                        <div class="col-lg-6">${model.unProtectedSexWithMale}<br><hr></div>
                                        <div class="col-lg-4"><b>Had sex with female :</b></div>
                                        <div class="col-lg-6"> ${model.unProtectedSexWithFemale}<br><hr></div>
                                        <div class="col-lg-4"><b>Had unprotected sex without a condom :</b></div>
                                        <div class="col-lg-6">${model.unprotectedsexnocondom}<br> <hr></div>
                                        <div class="col-lg-4"><b>Had sex with a sex worker :</b></div>
                                        <div class="col-lg-6">${model.sexWithSexWorker}<br> <hr></div>
                                        <div class="col-lg-4"><b>Exchanged sex for money/material goods :</b></div>
                                        <div class="col-lg-6">${model.exchangedSexMoney}<br><hr></div>
                                        <div class="col-lg-4"><b>Injected recteational drugs :</b></div>
                                        <div class="col-lg-6">${model.injectables}<br> <hr></div>
                                        <div class="col-lg-4"><b>Received medical injections :</b></div>
                                        <div class="col-lg-6">${model.recMedicalInjection}<br> <hr></div>
                                        <div class="col-lg-4"><b>Received blood transfussions :</b></div>
                                        <div class="col-lg-6">${model.recBloodTranfusion}<br><hr></div>
                                        <div class="col-lg-4"><b>Been incarcerated into jail :</b></div>
                                        <div class="col-lg-6">${model.beenPrison}<br><hr></div>
                                        <div class="col-lg-4"><b>Tatooed with unsterilized instruments :</b></div>
                                        <div class="col-lg-6">${model.tatooedwithunsterilized}<br><hr></div>
                                        <br>
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

                formHTML += "<div class='form-group'>";
                formHTML += "<label for='recipient-name' class='control-label col-lg-4 col-sm-2' id='labelText'>" + labelText + "</label>";
                formHTML += "<div class=\"col-lg-8\" >";
                formHTML += "<input type='text' class='form-control' id='recipientName' value=" + textBoxText + " >";
                formHTML += "</div>";
                formHTML += "</div>";
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

            variableString = {};
            $.each(formInnerData, function (i, value) {
                var textBox = $(formOuterData).eq(i).val();
                var labelText = $(formInnerData).eq(i).text().replace(/ :/g, '').replace(/ /g, '').toLowerCase();
                variableString[labelText] = textBox;
            });
            variableString["formVariable"] = formVariable;

            console.log(variableString);

            $.ajax({
                type: "POST",
                url: "EditDemographic",
                data: variableString
            });

            $("#modalForm").modal('hide');
        });
    </script>
    <script class="include" type="text/javascript" src="vmmcresources/js/jquery.dcjqaccordion.2.7.js"></script>    
</body>
</html>




