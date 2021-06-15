<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>New STI Client</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">

                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        You are about to fill new STI Patient Form <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            STI Module
                        </header>
                        <div class="panel-body">

                            <div class="stepy-tab">
                                <ul id="default-titles" class="stepy-titles clearfix">
                                    <li id="default-title-0" class="current-step">
                                        <div>Step 1</div>
                                    </li>
                                    <li id="default-title-1" class="">
                                        <div>Step 2</div>
                                    </li>
                                    <li id="default-title-2" class="">
                                        <div>Step 3</div>
                                    </li>
                                    <li id="default-title-3" class="">
                                        <div>Step 4</div>
                                    </li>
                                    <li id="default-title-4" class="">
                                        <div>Step 5</div>
                                    </li>
                                    <li id="default-title-5" class="">
                                        <div>Step 6</div>
                                    </li>
                                    <li id="default-title-6" class="">
                                        <div>Step 7</div>
                                    </li>
                                    <li id="default-title-7" class="">
                                        <div>Step 8</div>
                                    </li>

                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="AddNewSti" method="POST">



                                <fieldset title="Step 1" class="step" id="default-step-0">
                                    <legend> Personal Details</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label"  style="color: blue">STI Number</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="sti number" name="txtStiNo" >
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Registration Date:</label>
                                        <div class="col-lg-4">
                                            <input type="date" class="form-control" placeholder="Date of registration" name="txtStiRegDate">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">First Name</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder=" name" name="txtName" value="${patient.firstName}" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Surname :</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="surname" name="txtSurname" value="${patient.lastName}" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" national id" readonly="readonly" name="txtNatId" value="<c:out value="${patient.nationalId}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="date of birth" readonly="readonly" name="txtDob" value="<c:out value="${patient.dob}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Age </label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="age" name="txtAge" value="<c:out value="${patient.age}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Gender</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtGender" class="form-control" value="<c:out value="${patient.sex}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Marital Status</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtMarital" class="form-control" value="<c:out value="${patient.maritalStatus}"/>">
                                        </div>
                                    </div>                                       

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Entry Point </label>
                                        <div class="col-lg-4">

                                            <select name="txtStiEntryPoint" class="form-control">
                                                <option> </option>
                                                <c:forEach var="entrypoint" items="${htcentrypoint}">
                                                    <option value="${entrypoint.id}">${entrypoint.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>History Taking</legend>
                                    <div class="col-sm-12">
                                        <div><div class="form-group col-sm-3">
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Complains(Tick all that apply)</label>
                                                    <c:forEach items="${stisymptoms}" var="symptom">
                                                        <label>
                                                            <input type="checkbox" id="cksymptom" name="cksymptom" value="${symptom.symptoms}"> ${symptom.symptoms}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div>

                                            <div class="form-group col-sm-3">
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Recent History(Tick all that apply)</label>
                                                    <c:forEach items="${stihistory}" var="history">
                                                        <label>
                                                            <input type="checkbox" id="ckhistory" name="chkHistory" value="${history.history}"> ${history.history}
                                                        </label>
                                                    </c:forEach>
                                                    <label for="txtSpecifyHistory">Others specify:</label><input type="text" class="form-control" placeholder="specifyhistory" name="txtSpecifyHistory">
                                                </div>
                                            </div> 

                                            <div class="form-group col-sm-3">
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Previous treatment History(Tick all that apply)</label>
                                                    <c:forEach items="${stiprevtreathistory}" var="prevhistory">
                                                        <label>
                                                            <input type="checkbox" id="ckprevhistory" name="chkPrevhistory" value="${prevhistory.history}"> ${prevhistory.history}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div> 
                                            <div class="form-group col-sm-3">
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Drug History(Tick all that apply)</label>
                                                    <c:forEach items="${stidrugalleghistory}" var="drugallhistory">
                                                        <label>
                                                            <input type="checkbox" id="ckdrugallhistory" name="chkDrugallhistory" value="${drugallhistory.history}"> ${drugallhistory.history}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div> 



                                        </div>

                                </fieldset> 
                                <fieldset title="Step 3" class="step" id="default-step-1" >
                                    <legend>Examinations</legend>

                                    <div class="col-sm-12">
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Sexual history(Tick all that apply)</label>
                                                <c:forEach items="${sexualactivity}" var="sexactivity">
                                                    <label>
                                                        <input type="checkbox" id="sexualactivity" name="cksexualactivity" value="${sexactivity.sexualactivity}"> ${sexactivity.sexualactivity}
                                                    </label>
                                                </c:forEach>

                                            </div>

                                            <input type="text" class="form-control" placeholder=" other specify" id="sepecifyOtherexam" name="txtSpecifyOtherExam" > 
                                        </div>
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">General Examinations (Tick all that apply)</label>
                                                <c:forEach items="${stigeneralexaminations}" var="exam">
                                                    <label>
                                                        <input type="checkbox" id="ckgenexam" name="ckgenexam" value="${exam.examination}"> ${exam.examination}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Male Examinations (Tick all that apply)</label>
                                                <c:forEach items="${stimaleexaminations}" var="mexam">
                                                    <label>
                                                        <input type="checkbox" id="ckRefferals" name="ckmexam" value="${mexam.examination}"> ${mexam.examination}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Female Examinations(Tick all that apply)</label>
                                                <c:forEach items="${stifemaleexaminations}" var="fexam">
                                                    <label>
                                                        <input type="checkbox" id="ckRefferals" name="ckfexam" value="${fexam.examination}"> ${fexam.examination}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>


                                    </div>


                                </fieldset> 
                                <fieldset title="Step 4" class="step" id="default-step-1" >
                                    <legend>Consultation</legend>

                                    <div class="form-group">
                                        <div class="col-lg-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">STI Syndrome(Tick all that apply)</label>
                                                <c:forEach items="${stisyndromes}" var="syndrome">
                                                    <label>
                                                        <input type="checkbox" id="cksyndrome" name="cksyndrome" value="${syndrome.description}"> ${syndrome.description}
                                                    </label>
                                                </c:forEach>

                                            </div>

                                        </div>
                                        <div class="col-lg-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in All(Tick all that apply)</label>
                                                <c:forEach items="${allinfections}" var="allinfection">
                                                    <label>
                                                        <input type="checkbox" id="allinfection" name="ckallinfection" value="${allinfection.description}"> ${allinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>
                                    </div> 



                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">STI Episode </label>
                                        <div class="col-lg-2">
                                            <select name="txtStiEpisode" class="form-control">
                                                <option> </option>
                                                <option> New STI</option>
                                                <option>Repeat STI </option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">Tested for Syphilis</label>
                                        <div class="col-lg-2">
                                            <select name="txtTestedForSyphilis" class="form-control">
                                                <option> </option>
                                                <option> Yes</option>
                                                <option> No</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Purpose of syphilis Testing </label>
                                        <div class="col-lg-2">
                                            <select name="txtPurposeOfSyphilisTesting" class="form-control" >
                                                <option> </option>
                                                <c:forEach var="testpurpose" items="${stitestpurposes}">
                                                    <option value="${testpurpose.id}">${testpurpose.description}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div id="part7a">
                                            <label class="col-lg-2 control-label" style="color: blue">Syphilis Test Result </label>
                                            <div class="col-lg-3">
                                                <select name="txtGenSyphilisTestResults" class="form-control">
                                                    <option> </option>
                                                    <option>Positive </option>
                                                    <option>Negative </option>
                                                </select>
                                            </div>
                                        </div>



                                    </div>   


                                </fieldset> 
                                <fieldset title="Step 5" class="step" id="default-step-1" >
                                    <legend>Syphilis in ANC</legend>


                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">ANC Booking Time</label>
                                        <div class="col-lg-3">
                                            <select name="txtAncBookingTime" class="form-control">
                                                <option> </option>
                                                <option value="first anc booking"> first anc booking</option>
                                                <option value="third trimester">third trimester</option>
                                                <option value="Post delivery">Post delivery</option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">Tested for syphilis</label>
                                        <div class="col-lg-3">
                                            <select name="txtAncTestedForSyphilis" class="form-control">
                                                <option> </option>
                                                <option> Yes</option>
                                                <option>No</option>
                                            </select>
                                        </div>



                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Syphilis Test Result </label>
                                        <div class="col-lg-3">
                                            <select name="txtAncSyphilisTestResults" class="form-control">
                                                <option> </option>
                                                <option value="pos"> positive</option>
                                                <option value="neg"> negative </option>
                                            </select> 
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Syphilis Treated </label>
                                        <div class="col-lg-3">
                                            <select name="txtAncSyphilisTreated" class="form-control">
                                                <option> </option>
                                                <option> Yes</option>
                                                <option>No</option>
                                            </select>
                                        </div>


                                    </div>
                                    <legend>Syphilis Treatment</legend>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Dose</label>


                                        <div class="col-lg-2">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtSyphilisDose" >
                                        </div>


                                        <label class="col-lg-2 control-label" style="color: blue">Duration</label>


                                        <div class="col-lg-2">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtSyphilisTreatmentDuration" >
                                        </div>

                                    </div>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Dose 2</label>


                                        <div class="col-lg-2">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtSyphilisDose2" >
                                        </div>


                                        <label class="col-lg-2 control-label" style="color: blue">Duration 2</label>


                                        <div class="col-lg-2">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtSyphilisTreatmentDuration2" >
                                        </div>

                                    </div>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Dose 3</label>


                                        <div class="col-lg-2">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtSyphilisDose3" >
                                        </div>


                                        <label class="col-lg-2 control-label" style="color: blue">Duration 3</label>


                                        <div class="col-lg-2">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtSyphilisTreatmentDuration3" >
                                        </div>

                                    </div>




                                </fieldset>



                                <fieldset title="Step 6" class="step" id="default-step-5">
                                    <legend>STI Treatment</legend>
                                    <div class="form-group">
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in Female(Tick all that apply)</label>
                                                <c:forEach items="${femaleinfections}" var="femaleinfection">
                                                    <label>
                                                        <input type="checkbox" id="femaleinfection" name="ckfemaleinfection" value="${femaleinfection.description}"> ${femaleinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>


                                    </div>

                                    <div class="form-group">
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in Male(Tick all that apply)</label>
                                                <c:forEach items="${maleinfections}" var="maleinfection">
                                                    <label>
                                                        <input type="checkbox" id="femaleinfection" name="ckmaleinfection" value="${maleinfection.description}"> ${maleinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>

                                    </div>

                                    <div class="form-group">
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in Male infants(Tick all that apply)</label>
                                                <c:forEach items="${maleInfantsinfections}" var="maleInfantsinfection">
                                                    <label>
                                                        <input type="checkbox" id="maleInfantsinfection" name="ckmaleInfantsinfection" value="${maleInfantsinfection.description}"> ${maleInfantsinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-group col-sm-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in female infant(Tick all that apply)</label>
                                                <c:forEach items="${femaleinfantsinfections}" var="femaleinfantsinfection">
                                                    <label>
                                                        <input type="checkbox" id="femaleinfantsinfection" name="ckfemaleinfantsinfection" value="${femaleinfantsinfection.description}"> ${femaleinfantsinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in All(Tick all that apply)</label>
                                                <c:forEach items="${allinfections}" var="allinfection">
                                                    <label>
                                                        <input type="checkbox" id="allinfection" name="ckallinfection" value="${allinfection.description}"> ${allinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>

                                    </div>



                                </fieldset>
                                <fieldset title="Step 7" class="step" id="default-step-5">
                                    <legend>Treatment Medication </legend>
                                    <div class="form-group">

                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">UI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtUITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="treatment" items="${UITreatment}">
                                                        <option value="${treatment.description}">${treatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue"> UI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtUIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtUIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">VI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtVITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="vitreatment" items="${VITreatment}">
                                                        <option value="${vitreatment.description}">${vitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">VI Dose </label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtVIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtVIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">SI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtSITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="sitreatment" items="${SITreatment}">
                                                        <option value="${sitreatment.description}">${sitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">SI Dose </label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtSIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtSIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">PID treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtPIDTreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="pidtreatment" items="${PIDTreatment}">
                                                        <option value="${pidtreatment.description}">${pidtreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">PID Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtPIDDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtPIDDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">CI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtCITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="citreatment" items="${CITreatment}">
                                                        <option value="${citreatment.description}">${citreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">CI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtCIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtCIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">ARI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtARITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="aritreatment" items="${ARITreatment}">
                                                        <option value="${aritreatment.description}">${aritreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">ARI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtARIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration 2</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtARIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">GI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtGITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="gitreatment" items="${GITreatment}">
                                                        <option value="${gitreatment.description}">${gitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">GI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtGIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtGIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">PFI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtPFITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="pfitreatment" items="${PFITreatment}">
                                                        <option value="${pfitreatment.description}">${pfitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">PFI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtPFIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtPFIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">ESI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtESITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="esitreatment" items="${ESITreatment}">
                                                        <option value="${esitreatment.description}">${esitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">ESI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtESIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtESIDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">AGW treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtAGWTreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="agwtreatment" items="${AGWTreatment}">
                                                        <option value="${agwtreatment.description}">${agwtreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">AGW Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtAGWDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtAGWDuration" >
                                            </div>


                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">SPI treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtSPITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="spitreatment" items="${SPITreatment}">
                                                        <option value="${spitreatment.description}">${spitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-1 control-label" style="color: blue">SPI Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtSPIDose" >
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtSPIDuration" >
                                            </div>


                                        </div>

                                        <div class="form-group">
                                            <label class="col-lg-1 control-label" style="color: blue">II treatments </label>
                                            <div class="col-lg-3">

                                                <select name="txtIITreatment" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="iitreatment" items="${IITreatment}">
                                                        <option value="${iitreatment.description}">${iitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">II Dose</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtIIDose" >
                                            </div>


                                            <label class="col-lg-2 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtIIDuration" >
                                            </div>


                                        </div>








                                </fieldset>
                                <fieldset title="Step 8" class="step" id="default-step-1" >
                                    <legend>Post Tests Information</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Tested for HIV</label>
                                        <div class="col-lg-2">
                                            <select  class="form-control" id="isCouple" name="txtTestedForHiv"  >
                                                <option> </option>
                                                <option value="No">No</option>
                                                <option value="Yes">Yes</option>                                                  
                                            </select>


                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">HIV Test Result </label>
                                        <div class="col-lg-3">
                                            <select name="txtHivTestResult" class="form-control">
                                                <option> </option>
                                                <option value="pos"> positive</option>
                                                <option value="neg"> negative </option>
                                            </select>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">STI Contact slip issued </label>
                                        <div class="col-lg-2">

                                            <select name="txtStiContactSlipIssue" class="form-control">
                                                <option> </option>
                                                <option>Yes </option>
                                                <option>No </option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">STI Contact Slip received</label>
                                        <div class="col-lg-3">
                                            <select name="txtStiContactSlipReceived" class="form-control">
                                                <option> </option>
                                                <option>Yes </option>
                                                <option> No</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Condom Information given </label>
                                        <div class="col-lg-2">
                                            <select name="txtCondomInfoGiven" class="form-control" >
                                                <option> </option>
                                                <option>Yes </option>
                                                <option>No </option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">Condom Issued </label>
                                        <div class="col-lg-3">
                                            <select name="txtCondomIssued" class="form-control">
                                                <option> </option>
                                                <option>Yes </option>
                                                <option>No </option>
                                            </select>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Comment </label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control"  name="txtComment">
                                        </div>
                                    </div>
                                </fieldset>    



                                <input type="submit" class="finish btn btn-danger" value="Finish"/>
                            </form> </div>
                    </section>
                </section>
            </section>
        </section>
        <%@include file="../footer.jsp" %>
        <%@include file="../vmmcwizardjs.jsp" %>




        <!--script for this page-->
        <script>
            $(document).ready(function ()
            {
                $('#kit1Result').change(function (event) {
                    var result = $('#kit1Result').val();
                    $('#txtFinalResult').val(result);
                });
            });</script>
        <script>
            $(document).ready(function ()
            {
                $('#kit2Result').change(function (event) {
                    var result = $('#kit2Result').val();
                    $('#txtFinalResult').val(result);
                });
            });</script>

        <script>
            $(document).ready(function ()
            {
                $('#txtparallelHidenFinalResult').change(function (event) {
                    var result = $('#txtparallelHidenFinalResult').val();
                    $('#txtFinalResult').val(result);
                });
            });</script>
        <script>
            $(document).ready(function ()
            {
                $('#txtTieBrResult').change(function (event) {
                    var result = $('#txtTieBrResult').val();
                    $('#txtFinalResult').val(result);
                });
            });</script>
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
            });</script>
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
            });</script>

        <script type="text/javascript">
            jQuery(document).ready(function () {

            });</script>

    </body>
</html>
