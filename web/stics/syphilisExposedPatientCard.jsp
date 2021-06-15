<%-- 
    Document   : syphilisExposedPatientCard
    Created on : Jun 28, 2019, 3:09:37 PM
    Author     : Mohcc-ATP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <title>STI::Syphilis Exposed Patient Card</title>
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
                            STI::Syphilis Exposed Patient Card
                        </h1>
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
                                    <span type="button" class="btn btn-shadow btn-success"><a href="ProgReferred?prog=HTS&opdNum=${pmodel.patient.opdnumber}">HTS PROGRAM</span>
                                    <span type="button" class="btn btn-shadow btn-danger">CBS PROGRAM</span>
                                    <span type="button" class="btn btn-shadow btn-warning">TB PROGRAM</span>
                                    <span type="button" class="btn btn-shadow btn-warning">PHARMACY PROGRAM</span>
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
                                                Presentation
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#screening-3">
                                                <i class="fa fa-user"></i>
                                                Outcome
                                            </a>
                                        </li>                                  
                                    </ul>
                                    <span class="hidden-sm wht-color FontBig"><b>${stiexposedinf.infantId}</b></span>
                                </header>
                                <div class="panel-body">
                                    <div class="tab-content">
                                        <div id="personal-3" class="tab-pane active">
                                            <h2>PERSONAL DETAILS</h2>
                                            <span class="btn btn-success btn-lg btn-block"><h3>INFANT NUMBER :${stiexposedinf.infantId}</h3></span>
                                            <br>
                                            <div class="col-lg-4"><b>INFANT NUMBER :</b></div>
                                            <div class="col-lg-6">${stiexposedinf.infantId} <br> <hr></div>
                                            <div class="col-lg-4"><b>INFANT OPD NUMBER :</b></div>
                                            <div class="col-lg-6">${stiexposedinf.infantOpdnumber} <br> <hr></div>
                                            <div class="col-lg-4"><b>MOTHER OPD :</b></div>
                                            <div class="col-lg-6">${stiexposedinf.motherOpdnumber}<br> <hr></div>

                                            <div class="col-md-12">
                                                <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                            </div>

                                        </div>


                                        <div id="contact-3" class="tab-pane">

                                            <h2>PRESENTATION</h2>
                                            <span class="btn btn-success btn-lg btn-block"><h3>INFANT NUMBER :${stiexposedinf.infantId}</h3></span>
                                            <br>

                                            <div class="col-lg-4"><b>Examinations :</b></div><div class="col-lg-6">${stiexposedinf.examination} <br> <hr></div>
                                            <div class="col-lg-4"><b>umblical Or Placenta Status :</b></div><div class="col-lg-6">${stiexposedinf.umblicalOrPlacentaStatus} <br> <hr></div>
                                            <div class="col-lg-4"><b>non Treponemal Test Result :</b></div><div class="col-lg-6">${stiexposedinf.nonTreponemalTestResult} <br> <hr></div>
                                            <div class="col-lg-4"><b>signs :</b></div><div class="col-lg-6">${stiexposedinf.signs} <br> <hr></div>


                                        </div>
                                        <div id="screening-3" class="tab-pane">
                                            <span class="btn btn-success btn-lg btn-block"><h3>INFANT NUMBER :${stiexposedinf.infantId}</h3></span>
                                            <br>
                                            <h2>Outcome</h2>
                                            <div class="col-lg-4"><b>case Defination:</b></div><div class="col-lg-6">${stiexposedinf.caseDefination} <br> <hr></div>
                                            <div class="col-lg-4"><b>notified :</b></div><div class="col-lg-6">${stiexposedinf.notified} <br> <hr></div>
                                            <div class="col-lg-4"><b>case Criteria:</b></div><div class="col-lg-6">${stiexposedinf.caseCriteria} <br> <hr></div>
                                            
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

