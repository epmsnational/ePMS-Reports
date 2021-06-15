<%-- 
    Document   : htspatientcard
    Created on : Apr 8, 2016, 11:24:46 AM
    Author     : Developer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>HTS Patient Card</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <style>
            .detailsButton {
                clear: both;
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
                    <span>
                        <h3>
                            HTS  PATIENT CARD
                        </h3>
                    </span>
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
                                <span type="button" class="btn btn-shadow btn-danger"><a href="ProgReferred?prog=ART&opdNum=${pmodel.patient.opdnumber}">OI/ART PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-success"><a href="ProgReferred?prog=STI&opdNum=${pmodel.patient.opdnumber}">STI PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-danger"><a href="ProgReferred?prog=CBS&opdNum=${pmodel.patient.opdnumber}">CBS PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-warning"><a href="ProgReferred?prog=TB&opdNum=${pmodel.patient.opdnumber}">TB PROGRAM</a></span>
                                <span type="button" class="btn btn-shadow btn-infor"><a href="ProgReferred?prog=PHARMACY&opdNum=${pmodel.patient.opdnumber}">PHARMACY PROGRAM</a></span>
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
                                            REFERRAL INFORMATION
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#nextofkin-3">
                                            <i class="fa fa-user"></i>
                                            HIV COUNSELLING
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#testing-3">
                                            <i class="fa fa-medkit"></i>
                                            HIV TESTING
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#results-3">
                                            <i class="fa fa-stethoscope"></i>
                                            HIV TEST RESULTS
                                        </a>
                                    </li>
                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b>${pmodel.patient.opdnumber}</b></span>
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h4>PERSONAL DETAILS</h4>
                                        <span class="btn btn-success btn-lg "><h5>HTS NUMBER :${pmodel.patient.htsId}</h5></span>
                                        <br>
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

                                        <h4>CLIENT REFERRAL INFORMATION</h4>
                                        <span class="btn btn-success btn-lg btn-block"><h5>HTS NUMBER :${pmodel.patient.htsId}</h5></span>
                                        <br>
                                        <div class="col-lg-4"><b>REFERRED FROM :</b></div><div class="col-lg-6">${referredFrom} <br> <hr></div>
                                        <div class="col-lg-4"><b>HTS MODEL :</b></div><div class="col-lg-6">${htsModel} <br> <hr></div>
                                        <div class="col-lg-4"><b>HTS APPROACH :</b></div><div class="col-lg-6">${htc.htcapproach} <br> <hr></div>
                                        <div class="col-lg-4"><b>PURPOSE OF TESTING :</b></div><div class="col-lg-6">${htsPurpose} <br> <hr></div>

                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>

                                    </div>
                                    <div id="nextofkin-3" class="tab-pane">

                                        <h4>HIV COUNSELING</h4>
                                        <span class="btn btn-success btn-lg btn-block"><h5>HTS NUMBER :${pmodel.patient.htsId}</h5></span>
                                        <br>

                                        <div class="col-lg-4"><b>TYPE OF COUNSELING RECEIVED:</b></div><div class="col-lg-6">${htc.counselingRecieved} <br> <hr></div>
                                        <div class="col-lg-4"><b>OPTED OUT :</b></div><div class="col-lg-6">${htc.optedOut} <br> <hr></div>
                                        <div class="col-lg-4"><b>TESTED BEFORE:</b></div><div class="col-lg-6">${htc.testedBefore} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE TESTED BEFORE:</b></div><div class="col-lg-6">${htc.dateTestedBefore} <br> <hr></div>
                                        <div class="col-lg-4"><b>NAME OF COUNSELOR/ BLOOD COLLECTOR :</b></div><div class="col-lg-6">${htc.nameofCounselor} <br> <hr></div>


                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>
                                    <div id="testing-3" class="tab-pane">

                                        <h4>HIV TESTING</h4>
                                        <span class="btn btn-success btn-lg btn-block"><h5>HTS NUMBER :${pmodel.patient.htsId}</h5></span>
                                        <br>

                                        <c:forEach var="result" items="${pmodel.htsResults}">
                                            <div class="col-lg-4"  style="font-weight: bold; font-size: large; color: red;"><b>LOT NO :</b></div><div class="col-lg-6" style="font-weight: bold; font-size: large; color: red;">${result.lotNumber} <br> <hr></div>
                                            <div class="col-lg-4"><b>TEST KIT :</b></div><div class="col-lg-6" style="font-weight: bold; font-size: large; color: #0044cc;">${result.testKit} <br> <hr></div>
                                            <div class="col-lg-4"><b>EXPIRY DATE :</b></div><div class="col-lg-6">${result.expireDate} <br> <hr></div>
                                            <div class="col-lg-4"><b>RESULT :</b></div><div class="col-lg-6" style="font-weight: bold; font-size: large; color: #0044cc;">${result.result} <br> <hr></div>

                                        </c:forEach>
                                        <h3></h3>


                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>

                                    <div id="results-3" class="tab-pane">

                                        <h4>HIV RESULTS</h4>
                                        <span class="btn btn-success btn-lg btn-block"><h5>HTS NUMBER :${pmodel.patient.htsId}</h5></span>
                                        <br>



                                        <div class="col-lg-4"><b>RECEIVED RESULTS :</b></div><div class="col-lg-6">${htc.recievedResult} <br> <hr></div>
                                        <div class="col-lg-4"><b>POST TEST COUNSELED :</b></div><div class="col-lg-6">${htc.postTestCounseled} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE POST TEST COUNSELED :</b></div><div class="col-lg-6">${htc.postTestCounselDate} <br> <hr></div>
                                        <div class="col-lg-4"><b>REFERRED TO :</b></div><div class="col-lg-6">${htc.refferedforService} <br> <hr></div>

                                        <h3></h3>
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



