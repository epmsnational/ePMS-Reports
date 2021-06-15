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
        <title>OI ART ::Patient card</title>
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
                        OI ART::PATIENT CARD
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
                                            PERSONAL DETAILS 
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#events-3">
                                            <i class="fa fa-envelope-o"></i>
                                            PATIENT MAJOR EVENTS
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#baseline-3">
                                            <i class="fa fa-user"></i>
                                            BASELINE STATUS
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#statuses-3">
                                            <i class="fa fa-medkit"></i>
                                            CURRENT STATUS
                                        </a>
                                    </li>
                                    <li class="">
                                        <a data-toggle="tab" href="#calender-3">
                                            <i class="fa fa-stethoscope"></i>
                                            CALENDER
                                        </a>
                                    </li>


                                </ul>
                                <span class="hidden-sm wht-color FontBig"><b>${pmodel.patient.patientId}</b></span>
                            </header>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div id="personal-3" class="tab-pane active">
                                        <h2>PERSONAL DETAILS</h2>
                                        <div class="col-lg-4"><b>NAME :</b></div><div class="col-lg-6">${pmodel.patient.firstName} <br> <hr></div>
                                        <div class="col-lg-4"><b>SURNAME :</b></div><div class="col-lg-6">${pmodel.patient.lastName}<br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF BIRTH :</b></div><div class="col-lg-6">${pmodel.patient.dob}<br> <hr></div>
                                        <div class="col-lg-4"><b>GENDER :</b></div><div class="col-lg-6">${pmodel.patient.sex}<br> <hr></div>
                                        <div class="col-lg-4"><b>AGE :</b></div><div class="col-lg-6">${pmodel.patient.age}<br> <hr></div>
                                        <div class="col-lg-4"><b>MARITAL STATUS :</b></div><div class="col-lg-6">${pmodel.patient.maritalStatus}<br> <hr></div>

                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>

                                    <div id="events-3" class="tab-pane">

                                        <h2>PATIENT MAJOR EVENTS</h2>

                                        <div class="col-lg-4"><b>DATE CONFIRMED HIV POSITIVE:</b></div><div class="col-lg-6">${pmodel.oiartpatient.dateConfirmedHivpositive} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE ENROLLED INTO HIV CARE :</b></div><div class="col-lg-6">${pmodel.oiartpatient.dateOfEnrolment} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE ART START:</b></div><div class="col-lg-6">${pmodel.oiartpatient.visitDate} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF REGIMEN CHANGE :</b></div><div class="col-lg-6">${pmodel.oiartpatient.visitDate} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE TRANSFERED IN :</b></div><div class="col-lg-6">${pmodel.oiartpatient.transferInId} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE TRANSFERED OUT:</b></div><div class="col-lg-6">${pmodel.oiartpatient.referredFromId} <br> <hr></div>
                                        <div class="col-lg-4"><b>MOST RECENT VISIT :</b></div><div class="col-lg-6">${pmodel.oiartpatient.hivtestTypeId} <br> <hr></div>
                                        <div class="col-lg-4"><b>DATE OF DEATH :</b></div><div class="col-lg-6">${pmodel.oiartpatient.hivtestReasonId} <br> <hr></div>
                                        <div class="col-md-12">
                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>
                                    </div>
                                    <div id="baseline-3" class="tab-pane">

                                        <h2>BASELINE TESTS</h2>
                                        <div class="col-lg-4"><b>WHO STAGE:</b></div><div class="col-lg-6">${pmodel.oiartpatient.personalTracingName} <br> <hr></div>
                                        <div class="col-lg-4"><b>FUNCTIONAL STATUS :</b></div><div class="col-lg-6">${pmodel.oiartpatient.personalTracingDate} <br> <hr></div>
                                        <div class="col-lg-4"><b>WEIGHT:</b></div><div class="col-lg-6">${pmodel.oiartpatient.indexCaseName} <br> <hr></div>
                                        <div class="col-lg-4"><b>CD4 :</b></div><div class="col-lg-6">${pmodel.oiartpatient.indexCaseDate} <br> <hr></div>
                                        <div class="col-lg-4"><b>VIRAL LOAD:</b></div><div class="col-lg-6">${pmodel.oiartpatient.isDisclosureHiv} <br> <hr></div>

                                        <div class="col-lg-4"><b>WEIGHT:</b></div><div class="col-lg-6">${pmodel.oiartpatient.disclosureYesWhom} <br> <hr></div>
                                        <div class="col-lg-4"><b>CD4 :</b></div><div class="col-lg-6">${pmodel.oiartpatient.disclosureNoReason} <br> <hr></div>
                                        <div class="col-lg-4"><b>VIRAL LOAD:</b></div><div class="col-lg-6">${pmodel.oiartpatient.disclosureYesDate} <br> <hr></div>

                                        <div class="col-lg-4"><b>CD4 :</b></div><div class="col-lg-6">${pmodel.oiartpatient.disclosureYesRelation} <br> <hr></div>
                                        <div class="col-lg-4"><b>VIRAL LOAD:</b></div><div class="col-lg-6">${pmodel.oiartpatient.isRetestForHivinitiation} <br> <hr></div>
                                        <div class="col-md-12">


                                            <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                        </div>


                                        <div id="statuses-3" class="tab-pane">

                                            <h2>CURRENT STATUS</h2>
                                            <div class="col-lg-4"><b>WHO STAGE</b></div><div class="col-lg-6">${pmodel.oiartpatient.isRetestForHivinitiationDate} <br> <hr></div>
                                            <div class="col-lg-4"><b>FUNCTIONAL STATUS :</b></div><div class="col-lg-6">${pmodel.oiartpatient.fileRef} <br> <hr></div>
                                            <div class="col-lg-4"><b>WEIGHT</b></div><div class="col-lg-6">${pmodel.oiartpatient.notes} <br> <hr></div>
                                            <div class="col-lg-4"><b>CD4</b></div><div class="col-lg-6">${pmodel.oiartpatient.drugAllergies} <br> <hr></div>
                                            <div class="col-lg-4"><b>VIRAL LOAD</b></div><div class="col-lg-6">${pmodel.oiartpatient.dateConfirmedHivpositive} <br> <hr></div>
                                            <div class="col-lg-4"><b>FOLLOW UP STATUS</b></div><div class="col-lg-6">${pmodel.oiartpatient.locationHivtestCode} <br> <hr></div>
                                            <div class="col-lg-4"><b>CURRENT REGIMENT</b></div><div class="col-lg-6">${pmodel.oiartpatient.hivtestTypeId} <br> <hr></div>
                                            <div class="col-md-12">
                                                <div class="btn btn-primary detailsButton" id="editDetailsButton">Edit Details</div>
                                            </div>

                                        </div>
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



                                </div>
                            </div></div>
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
