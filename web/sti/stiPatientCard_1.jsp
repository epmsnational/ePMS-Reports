<%-- 
    Document   : patientCard
    Created on : Mar 19, 2016, 2:13:59 AM
    Author     : Developer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>STI::Patient card</title>
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
                        STI::PATIENT CARD
                    </h1>
                </section>
                <hr>
                <div style="margin-left: auto;margin-right: auto;">
                    <div class="col-lg-10" >
                        <section class="panel">
                            <header class="panel-heading">
                                <span style="color: red;" class="fa fa-arrow-circle-down"> REFER THIS PATIENT TO :</span>
                            </header>
                           
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
                                            Presentation
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#screening-3">
                                            <i class="fa fa-user"></i>
                                            Sexual History
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#vitals-3">
                                            <i class="fa fa-medkit"></i>
                                            Management
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#medicaltests-3">
                                            <i class="fa fa-stethoscope"></i>
                                            Partner Notification & Treatment
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#informedconsent-3">
                                            <i class="fa fa-stethoscope"></i>
                                            Education
                                        </a>
                                    </li>

                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b>${pmodel.patient.opdnumber}</b></span>
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h2>PERSONAL DETAILS</h2>
                                        <div class="col-lg-4"><b>NAME :</b></div><div class="col-lg-6">${pmodel.patient.firstName} <br> <hr></div>

                                        <div class="col-lg-4"><b>SURNAME :</b></div><div class="col-lg-6">${pmodel.patient.lastName}<br> <hr></div>
                                        <div class="col-lg-4"><b>NATIONAL ID :</b></div><div class="col-lg-6">${pmodel.patient.nationalId}<br> <hr></div>
                                        <div class="col-lg-4"><b>GENDER :</b></div><div class="col-lg-6">${pmodel.patient.sex}<br> <hr></div>
                                        <div class="col-lg-4"><b>AGE :</b></div><div class="col-lg-6">${pmodel.patient.age}<br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF REGISTRATION :</b></div><div class="col-lg-6">${pmodel.patient.registrationDate}<br> <hr></div>
                                        <div class="col-lg-4"><b>MARITAL STATUS :</b></div><div class="col-lg-6">${pmodel.patient.maritalStatus}<br> <hr></div>
                                        <div class="col-lg-4"><b>ORPHAN STATUS :</b></div><div class="col-lg-6">  ${pmodel.patient.ophanStatus}  <br> <hr></div>
                                        <div class="col-lg-4"><b>EDUCATION LEVEL :</b></div><div class="col-lg-6">${pmodel.patient.educationalLevel}<br> <hr></div>
                                        <div class="col-lg-4"><b>OCCUPATION :</b></div><div class="col-lg-6">${pmodel.patient.occupation}<br> <hr></div>

                                    </div>

                                    <div id="contact-3" class="tab-pane">

                                        <h2>PRESENTATION</h2>

                                        <div class="col-lg-4"><b>COMPLAIN :</b></div><div class="col-lg-6">${pmodel.address.mobileNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>NEW STI :</b></div><div class="col-lg-6">${pmodel.address.telNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>REPEAT STI :</b></div><div class="col-lg-6">${pmodel.address.telNumber} <br> <hr></div>
                                        <div class="col-lg-4"><b>STI SYNDROME :</b></div><div class="col-lg-6">${pmodel.address.workAddress} <br> <hr></div>
                                        

                                    </div>
                                    <div id="screening-3" class="tab-pane">

                                        <h2>SEXUAL HISTORY</h2>

                                        <div class="col-lg-4"><b> STI History  :</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="service" items="${services}">
                                                    <li>${service}</li>
                                                    </c:forEach>
                                            </ol>
                                        </div>
                                        <hr>
                                        <div class="col-lg-4"><b>Referred from :</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="referredfrom" items="${referredFrom}">
                                                    <li>${referredfrom}</li>
                                                    </c:forEach>
                                            </ol></div>
                                        <div class="col-lg-4"><b>Primary reason(s) for circumcision:</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="reas" items="${reasons}">
                                                    <li>${reas}</li>
                                                    </c:forEach>
                                            </ol></div>
                                        <div class="col-lg-4"><b>Complaint(s):</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="comp" items="${complaints}">
                                                    <li>${comp}</li>
                                                    </c:forEach>
                                            </ol>
                                        </div>
                                        <div class="col-lg-4"><b>Client diagnosed of:</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="diag" items="${diagnosis}">
                                                    <li>${diag}</li>
                                                    </c:forEach>

                                            </ol></div>
                                        <div class="col-lg-4"><b>General condition(s) :</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="gencon" items="${generalconditions}">
                                                    <li>${gencon}</li>
                                                    </c:forEach>

                                            </ol>
                                        </div>

                                        <div class="col-lg-4"><b>Genital exam problem(s) :</b></div><div class="col-lg-6">
                                            <ol>
                                                <c:forEach var="genexam" items="${genitalexam}">
                                                    <li>${genexam}</li>
                                                    </c:forEach>

                                            </ol>
                                        </div>
                                    </div>
                                    <div id="vitals-3" class="tab-pane">

                                        <h2>MANAGEMENT</h2>


                                        <div class="col-lg-4"><b>Tested for Syphilis:</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.weight} <br> <hr></div>
                                        <div class="col-lg-4"><b>Purpose of Syphilis Test :</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.temperature} <br> <hr></div>
                                        <div class="col-lg-4"><b>Syphilis Test Result:</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.bloodPressure} <br> <hr></div>
                                        <div class="col-lg-4"><b>Treatment:</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.pulse} <br> <hr></div>
                                        <div class="col-lg-4"><b>Tested For HIV  :</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.bloodPressure} <br> <hr></div>
                                        <div class="col-lg-4"><b>HIV Test Result:</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.pulse} <br> <hr></div>
                                         <div class="col-lg-4"> <a href="#myModal" data-toggle="modal" class="btn btn-xs btn-success">
                                  EDIT VITALS
                              </a></div><div class="col-lg-6"> <hr></div>
                                        
                                        <%-- Modal form for Vitals --%>
                                        <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button aria-hidden="true" data-dismiss="modal" class="close" type="button">×</button>
                                                        <h4 class="modal-title">EDIT VITALS</h4>
                                                    </div>
                                                    <div class="modal-body">

                                                        <form class="form-horizontal"  role="form">
                                                            <div class="form-group">
                                                                <label class="col-lg-4 control-label">Email address</label>
                                                                <div class="col-lg-8">
                                                                    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="Enter email">
                                                                </div>
                                                                
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="exampleInputPassword1">Password</label>
                                                                <input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="exampleInputFile">File input</label>
                                                                <input type="file" id="exampleInputFile3">
                                                                <p class="help-block">Example block-level help text here.</p>
                                                            </div>
                                                            <div class="checkbox">
                                                                <label>
                                                                    <input type="checkbox"> Check me out
                                                                </label>
                                                            </div>
                                                            <button type="submit" class="btn btn-default">Submit</button>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="medicaltests-3" class="tab-pane">

                                        <h2>Partner Notification & Treatment</h2>


                                        <div class="col-lg-4"><b>STI Contact Slip Issued:</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.ifTestedResult} <br> <hr></div>
                                        <div class="col-lg-4"><b>STI Contact Slip Received :</b></div><div class="col-lg-6">${pmodel.vmmcMedScreening.hivtestResult} <br> <hr></div>
                                        

                                    </div>
                                    <div id="informedconsent-3" class="tab-pane">

                                        <h2>Education</h2>


                                        <div class="col-lg-4"><b>Condom Information Given:</b></div><div class="col-lg-6">${pmodel.vmmcCircumMethod.informedConsentGranted} <br> <hr></div>

                                        <div class="col-lg-4"><b>Condom Issued</b></div><div class="col-lg-6">${pmodel.vmmcCircumMethod.circumcisionMethod} <br> <hr></div>
                                        <div class="col-lg-4"><b>Comments:</b></div><div class="col-lg-6">${pmodel.vmmcCircumMethod.circumcisionChosenByClients} <br> <hr></div>

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
