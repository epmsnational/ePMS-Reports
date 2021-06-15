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
                                            <input  type="text" class="form-control" placeholder="sti number" name="txtStiNo"  id="stiNotxt" placeholder="PP-DD-FF-YYYY-E-00000" maxlength="21" required="required">
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
                                            <input readonly="readonly" id="page" type="text" class="form-control" placeholder="age" name="txtAge" value="<c:out value="${patient.age}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Gender</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" id="psex" name="txtGender" class="form-control" value="<c:out value="${patient.sex}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Marital Status</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtMarital" class="form-control" value="<c:out value="${patient.maritalStatus}"/>">
                                        </div>
                                    </div>                                       

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Entry Point </label>
                                        <div class="form-group col-lg-10">
                                            <div id ="part2c" style="display: none;" >
                                                <div class="col-lg-4">                                                                                

                                                    <select name="txtStiMEntryPoint" class="form-control" onchange="showDiv(this)">
                                                        <option> </option>
                                                        <c:forEach var="entrypoint" items="${stimentrypoint}">
                                                            <option value="${entrypoint.id}">${entrypoint.description}</option>
                                                        </c:forEach>

                                                    </select>

                                                </div>
                                            </div>
                                            <div id ="part2d" style="display: none;" >
                                                <div class="col-lg-4">                                                                                

                                                    <select name="txtStiFEntryPoint" class="form-control" onchange="showDiv(this)">
                                                        <option> </option>
                                                        <c:forEach var="entrypoint" items="${stifentrypoint}">
                                                            <option value="${entrypoint.id}">${entrypoint.description}</option>
                                                        </c:forEach>

                                                    </select>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>History </legend>
                                    <div class="col-sm-12">
                                        <div>
                                            <div class="form-group col-sm-3">
                                                <div id ="part2a" style="display: none;" >
                                                    <div class="checkbox">                                                                                
                                                        <label style="color: red; text-align: center;">Female patient Complains(Tick all that apply)</label>
                                                        <c:forEach items="${stifsymptoms}" var="fsymptom">
                                                            <label>
                                                                <input type="checkbox" id="cksymptom" name="ckfsymptom" value="${fsymptom.symptoms}"> ${fsymptom.symptoms}
                                                            </label>
                                                        </c:forEach>

                                                    </div>
                                                </div>
                                                <div id ="part2b" style="display: none;" >
                                                    <div class="checkbox">                                                                                
                                                        <label style="color: red; text-align: center;">Male patient Complains(Tick all that apply)</label>
                                                        <c:forEach items="${stimsymptoms}" var="msymptom">
                                                            <label>
                                                                <input type="checkbox" id="cksymptom" name="ckmsymptom" value="${msymptom.symptoms}"> ${msymptom.symptoms}
                                                            </label>
                                                        </c:forEach>

                                                    </div>
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
                                            <div id ="part3a" style="display: none;" >
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Male Examinations (Tick all that apply)</label>
                                                    <c:forEach items="${stimaleexaminations}" var="mexam">
                                                        <label>
                                                            <input type="checkbox" id="ckRefferals" name="ckmexam" value="${mexam.examination}"> ${mexam.examination}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div>
                                            <div id ="part3b" style="display: none;" >
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



                                    </div>


                                </fieldset> 
                                <fieldset title="Step 4" class="step" id="default-step-1" >
                                    <legend>Diagnosis</legend>

                                    <div class="form-group">
                                        <div class="col-lg-3">

                                            <div id ="part4a" style="display: none;" >
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">STI Male Patient Syndrome(Tick all that apply)</label>
                                                    <c:forEach items="${stimsyndromes}" var="msyndrome">
                                                        <label>
                                                            <input type="checkbox" id="msyndrome" name="ckmsyndrome" value="${msyndrome.description}" onchange="showDivMaleSyndrome(this)"> ${msyndrome.description}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div>
                                            <div id ="part4b" style="display: none;" >
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">STI Female patient Syndrome(Tick all that apply)</label>
                                                    <c:forEach items="${stifsyndromes}" var="fsyndrome">
                                                        <label>
                                                            <input type="checkbox" id="fsyndrome" name="ckfsyndrome" value="${fsyndrome.description}" onchange="showDivFemaleSyndrome(this)"> ${fsyndrome.description}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div>

                                        </div>
                                        <div class="col-lg-3">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Infections in All(Tick all that apply)</label>
                                                <c:forEach items="${allinfections}" var="allinfection">
                                                    <label>
                                                        <input type="checkbox" id="allinfection" name="ckallinfection" value="${allinfection.infectiontype}" onchange="showDivAllinfection(this)"> ${allinfection.description}
                                                    </label>
                                                </c:forEach>

                                            </div>
                                        </div>

                                        <div class="form-group col-sm-3">
                                            <div id ="part4c" style="display: none;" >
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Infections in Female(Tick all that apply)</label>
                                                    <c:forEach items="${femaleinfections}" var="femaleinfection">
                                                        <label>
                                                            <input type="checkbox" id="femaleinfection" name="ckfemaleinfection" value="${femaleinfection.infectiontype}" onchange="showDivFemaleinfection(this)"> ${femaleinfection.description}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div>
                                            <div id ="part4d" style="display: none;" >
                                                <div class="checkbox">                                                                                
                                                    <label style="color: red; text-align: center;">Infections in Male(Tick all that apply)</label>
                                                    <c:forEach items="${maleinfections}" var="maleinfection">
                                                        <label>
                                                            <input type="checkbox" id="femaleinfection" name="ckmaleinfection" value="${maleinfection.infectiontype}" onchange="showDivMaleinfection(this)"> ${maleinfection.description}
                                                        </label>
                                                    </c:forEach>

                                                </div>
                                            </div>
                                        </div>

                                        <div id ="part4e" style="display: none;" >
                                            <div class="form-group col-sm-3">
                                                <div id ="part4f" style="display: none;" >
                                                    <div class="checkbox">                                                                                
                                                        <label style="color: red; text-align: center;">Infections in Male infants(Tick all that apply)</label>
                                                        <c:forEach items="${maleInfantsinfections}" var="maleInfantsinfection">
                                                            <label>
                                                                <input type="checkbox" id="maleInfantsinfection" name="ckmaleInfantsinfection" value="${maleInfantsinfection.infectiontype}" onchange="showDivMaleInfantsinfection(this)"> ${maleInfantsinfection.description}
                                                            </label>
                                                        </c:forEach>

                                                    </div>
                                                </div>
                                                <div id ="part4g" style="display: none;" >
                                                    <div class="checkbox">                                                                                
                                                        <label style="color: red; text-align: center;">Infections in female infant(Tick all that apply)</label>
                                                        <c:forEach items="${femaleinfantsinfections}" var="femaleinfantsinfection">
                                                            <label>
                                                                <input type="checkbox" id="femaleinfantsinfection" name="ckfemaleinfantsinfection" value="${femaleinfantsinfection.infectiontype}" onchange="showDivFemaleInfantsinfection(this)"> ${femaleinfantsinfection.description}
                                                            </label>
                                                        </c:forEach>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>


                                </fieldset> 


                                <fieldset title="Step 5" class="step" id="default-step-1" >
                                    <legend>Syphilis Screening</legend>
                                    <div class="form-group" id ="part5maina" style="display: none;">
                                        <legend>General Patient Syphilis Screening</legend>
                                        <div class="form-group">

                                            <label class="col-lg-2 control-label" style="color: blue">STI Episode </label>
                                            <div class="col-lg-2">
                                                <select name="txtStiEpisode" class="form-control">
                                                    <option> </option>
                                                    <option value="New STI"> New STI</option>
                                                    <option value="Repeat STI">Repeat STI </option>
                                                </select>
                                            </div>

                                            <label class="col-lg-2 control-label" style="color: blue">Tested for Syphilis</label>
                                            <div class="col-lg-2">
                                                <select name="txtTestedForSyphilis" class="form-control" onchange="showDiv5a(this)">
                                                    <option> </option>
                                                    <option> Yes</option>
                                                    <option> No</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group" id ="part5a" style="display: none;">

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
                                                <div class="col-lg-2">
                                                    <select name="txtGenSyphilisTestResults" class="form-control">
                                                        <option> </option>
                                                        <option value="pos">Positive </option>
                                                        <option value="neg">Negative </option>
                                                    </select>
                                                </div>
                                            </div>

                                        </div>
                                    </div>

                                    <div class="form-group" id ="part5mainb" style="display: none;">
                                        <legend>Syphilis in ANC</legend>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label" style="color: blue">ANC Booking Time</label>
                                            <div class="col-lg-3">
                                                <select name="txtAncBookingTime" class="form-control" onchange="showDiv5b(this)">
                                                    <option> </option>
                                                    <option value="first anc booking"> first anc booking</option>
                                                    <option value="third trimester">third trimester</option>
                                                    <option value="Post delivery">Post delivery</option>
                                                </select>
                                            </div>

                                        </div>

                                        <div class="form-group" id ="part5b" style="display: none;">
                                            <div class="form-group">
                                                <label class="col-lg-2 control-label" style="color: blue">Tested for syphillis during pregnancy </label>
                                                <div class="col-lg-3">
                                                    <select name="txtAncSyphillisTestedDuringPregnancy" class="form-control" onchange="showDiv5c(this)">
                                                        <option> </option>
                                                        <option value="yes"> Yes</option>
                                                        <option value="no"> No </option>
                                                    </select> 
                                                </div>
                                                <div id ="part5c1" style="display: none;">
                                                    <label class="col-lg-2 control-label" style="color: blue">Date tested for syphilis during pregnancy </label>
                                                    <div class="col-lg-3">

                                                        <input  type="date" class="form-control" placeholder=" name" name="txtAncDateSyphillisTestedDuringPregnancy" >
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group">

                                                <div id ="part5c2" style="display: none;">
                                                    <label class="col-lg-2 control-label" style="color: blue">Syphilis Test during pregnancy Result </label>
                                                    <div class="col-lg-3">
                                                        <select name="txtAncSyphilisTestDuringPregnantResults" class="form-control" onchange="showDiv5d(this)">
                                                            <option> </option>
                                                            <option value="pos"> positive</option>
                                                            <option value="neg"> negative </option>
                                                        </select> 
                                                    </div>
                                                </div>
                                                <div id ="part5d" style="display: none;">
                                                    <label class="col-lg-2 control-label" style="color: blue">Syphilis Treated </label>
                                                    <div class="col-lg-3">
                                                        <select name="txtAncSyphilisDuringPregnantTreated" class="form-control">
                                                            <option> </option>
                                                            <option value="yes"> Yes</option>
                                                            <option value="no"> No </option>
                                                        </select> 
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="col-lg-2 control-label" style="color: blue">Delivery Date </label>
                                                <div class="col-lg-3">

                                                    <input  type="date" class="form-control" placeholder=" name" name="txtDateOfDelivery" >
                                                </div>
                                                <label class="col-lg-2 control-label" style="color: blue">Delivery Outcome </label>
                                                <div class="col-lg-3">
                                                    <select name="txtDeliveryOutcome" class="form-control">
                                                        <option> </option>
                                                        <option value="still birth"> Still birth</option>
                                                        <option value="live birth"> Live birth </option>
                                                        <option value="neonatal death"> Neonatal death </option>
                                                    </select> 
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label" style="color: blue">Tested for syphilis</label>
                                            <div class="col-lg-3">
                                                <select name="txtAncTestedForSyphilis" class="form-control" onchange="showDiv5e(this)">
                                                    <option> </option>
                                                    <option value="yes"> Yes</option>
                                                    <option value="no">No</option>
                                                </select>
                                            </div>
                                            <div id ="part5e" style="display: none;">
                                                <label class="col-lg-2 control-label" style="color: blue">Syphilis Test Result </label>
                                                <div class="col-lg-3">
                                                    <select name="txtAncSyphilisTestResults" class="form-control" onchange="showDiv5f(this)">
                                                        <option> </option>
                                                        <option value="pos"> positive</option>
                                                        <option value="neg"> negative </option>
                                                    </select> 
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group" id ="part5f" style="display: none;">
                                            <label class="col-lg-2 control-label" style="color: blue">Syphilis Treated </label>
                                            <div class="col-lg-3">
                                                <select name="txtAncSyphilisTreated" class="form-control">
                                                    <option> </option>
                                                    <option> Yes</option>
                                                    <option>No</option>
                                                </select>
                                            </div>
                                        </div>

                                        <legend>STI Treatment in ANC</legend>
                                        <div class="form-group" id ="VI" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Vaginal Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncVITreatment" class="form-control" onchange="showDiv5b1(this)">
                                                    <option> </option>
                                                    <c:forEach var="vitreatment" items="${VITreatment}">
                                                        <option value="${vitreatment.description}">${vitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a1" style="display: none;" >


                                                <label class="col-lg-1 control-label" style="color: blue">Vaginal Infection Dose </label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncVIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncVIDuration" >
                                                </div>

                                            </div>
                                        </div>

                                        <div class="form-group" id ="PID" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">PID treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncPIDTreatment" class="form-control " onchange="showDiv5b2(this)">
                                                    <option> </option>
                                                    <c:forEach var="pidtreatment" items="${PIDTreatment}">
                                                        <option value="${pidtreatment.description}">${pidtreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a2" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">PID Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncPIDDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncPIDDuration" >
                                                </div>


                                            </div>
                                        </div>
                                        <div class="form-group" id ="CI" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Cervical Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncCITreatment" class="form-control"onchange="showDiv5b3(this)">
                                                    <option> </option>
                                                    <c:forEach var="citreatment" items="${CITreatment}">
                                                        <option value="${citreatment.description}">${citreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a3" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Cervical Infection  Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncCIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncCIDuration" >
                                                </div>


                                            </div>
                                        </div>
                                        <div class="form-group" id ="ARI" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Anal Or Rectal Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncARITreatment" class="form-control"onchange="showDiv5b4(this)">
                                                    <option> </option>
                                                    <c:forEach var="aritreatment" items="${ARITreatment}">
                                                        <option value="${aritreatment.description}">${aritreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a4" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Anal Or Rectal Infection Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncARIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration </label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncARIDuration" >
                                                </div>

                                            </div>
                                        </div>
                                        <div class="form-group" id ="GI" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Genital Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncGITreatment" class="form-control"onchange="showDiv5b5(this)">
                                                    <option> </option>
                                                    <c:forEach var="gitreatment" items="${GITreatment}">
                                                        <option value="${gitreatment.description}">${gitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a5" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Genital Infection Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncGIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncGIDuration" >
                                                </div>


                                            </div>
                                        </div>
                                        <div class="form-group" id ="ESI" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Eye or Systemic Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncESITreatment" class="form-control"onchange="showDiv5b6(this)">
                                                    <option> </option>
                                                    <c:forEach var="esitreatment" items="${ESITreatment}">
                                                        <option value="${esitreatment.description}">${esitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a6" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Eye or Systemic Infection Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncESIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncESIDuration" >
                                                </div>


                                            </div>
                                        </div>
                                        <div class="form-group" id ="AGW" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Anal Genital Warts treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncAGWTreatment" class="form-control"onchange="showDiv5b7(this)">
                                                    <option> </option>
                                                    <c:forEach var="agwtreatment" items="${AGWTreatment}">
                                                        <option value="${agwtreatment.description}">${agwtreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a7" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Anal Genital Warts  Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncAGWDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncAGWDuration" >
                                                </div>


                                            </div>
                                        </div>

                                        <div class="form-group" id ="SPI" style="display: none;">

                                            <label class="col-lg-1 control-label" style="color: blue">Skin & Pubic Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncSPITreatment" class="form-control"onchange="showDiv5b8(this)">
                                                    <option> </option>
                                                    <c:forEach var="spitreatment" items="${SPITreatment}">
                                                        <option value="${spitreatment.description}">${spitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a8" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Skin & Pubic Infection Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncSPIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncSPIDuration" >
                                                </div>


                                            </div>
                                        </div>

                                        <div class="form-group" id ="II" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Inguinal Infection treatments </label>
                                            <div class="col-lg-2">

                                                <select name="txtAncIITreatment" class="form-control"onchange="showDiv5b9(this)">
                                                    <option> </option>
                                                    <c:forEach var="iitreatment" items="${IITreatment}">
                                                        <option value="${iitreatment.description}">${iitreatment.description}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id ="part5a9" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Inguinal Infection  Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncIIDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncIIDuration" >
                                                </div>


                                            </div>
                                        </div>
                                        <div class="form-group" >
                                            <label class="col-lg-1 control-label" style="color: blue">Other treatments </label>
                                            <div class="col-lg-2">
                                                <input  type="text" class="form-control" placeholder=" name" name="txtAncOtherTreatment" >

                                            </div>
                                            <div id ="part5a10" style="display: none;" >

                                                <label class="col-lg-1 control-label" style="color: blue">Other Dose</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncOtherDose" >
                                                </div>


                                                <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                                <div class="col-lg-2">
                                                    <input  type="text" class="form-control" placeholder=" name" name="txtAncOtherDuration" >
                                                </div>


                                            </div>
                                        </div>

                                </fieldset>

 <fieldset title="Step 6" class="step" id="default-step-1" >
                                    <legend>HIV Tests Information</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Tested for HIV</label>
                                        <div class="col-lg-2">
                                            <select  class="form-control" id="isCouple" name="txtTestedForHiv" onchange="showDiv7(this)" >
                                                <option> </option>
                                                <option value="no">No</option>
                                                <option value="yes">Yes</option>                                                  
                                            </select>


                                        </div>
                                        <div id ="part7" style="display: none;"> 
                                            <label class="col-lg-2 control-label" style="color: blue">HIV Test Result </label>
                                            <div class="col-lg-3">
                                                <select name="txtHivTestResult" class="form-control">
                                                    <option> </option>
                                                    <option value="pos"> positive</option>
                                                    <option value="neg"> negative </option>
                                                </select>
                                            </div>
                                        </div>

                                    </div>
                                    
                                    
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Tested HIV Before </label>
                                        <div class="col-lg-2">
                                            <select name="txtTestedHIVBefore" class="form-control" onchange="showDiv8(this)">
                                                <option> </option>
                                                <option value="yes">Yes </option>
                                                <option value="no">No </option>
                                            </select>
                                        </div>
                                        <div id ="part8" style="display: none;"> 
                                            <label class="col-lg-2 control-label" style="color: blue">HIV Tested Before Result </label>
                                            <div class="col-lg-3">
                                                <select name="txtHIVTestedBeforeResult" class="form-control">
                                                    <option> </option>
                                                    <option value="pos">Positive </option>
                                                    <option value="neg">Negative </option>
                                                </select>
                                            </div>

                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Comment </label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control"  name="txtComment">
                                        </div>
                                    </div>
                                </fieldset>


                                <fieldset title="Step 7" class="step" id="default-step-5">
                                    <legend>Treatment Medication </legend>
                                    <div class="form-group" id="GUI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Urethral Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtUITreatment" class="form-control" onchange="showDiv6a(this)">
                                                <option> </option>
                                                <c:forEach var="treatment" items="${UITreatment}">
                                                    <option value="${treatment.description}">${treatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6a" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue"> Urethral Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtUIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtUIDuration">
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group" id="GVI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Vaginal Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtVITreatment" class="form-control" onchange="showDiv6b(this)">
                                                <option> </option>
                                                <c:forEach var="vitreatment" items="${VITreatment}">
                                                    <option value="${vitreatment.description}">${vitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6b" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Vaginal Infection Dose </label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtVIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtVIDuration">
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group" id="GSI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Scrotum Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtSITreatment" class="form-control" onchange="showDiv6c(this)">
                                                <option> </option>
                                                <c:forEach var="sitreatment" items="${SITreatment}">
                                                    <option value="${sitreatment.description}">${sitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6c" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Scrotum Infection Dose </label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtSIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtSIDuration">
                                            </div>

                                        </div>
                                    </div>
                                    <div class="form-group" id="GPID" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">PID treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtPIDTreatment" class="form-control" onchange="showDiv6d(this)">
                                                <option> </option>
                                                <c:forEach var="pidtreatment" items="${PIDTreatment}">
                                                    <option value="${pidtreatment.description}">${pidtreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6d" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">PID Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtPIDDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtPIDDuration">
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group" id="GCI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Cervical Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtCITreatment" class="form-control" onchange="showDiv6e(this)">
                                                <option> </option>
                                                <c:forEach var="citreatment" items="${CITreatment}">
                                                    <option value="${citreatment.description}">${citreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6e" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Cervical Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtCIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtCIDuration">
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group" id="GARI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Anal or Rectal Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtARITreatment" class="form-control" onchange="showDiv6f(this)">
                                                <option> </option>
                                                <c:forEach var="aritreatment" items="${ARITreatment}">
                                                    <option value="${aritreatment.description}">${aritreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6f" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Anal or Rectal Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtARIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration </label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtARIDuration">
                                            </div>

                                        </div>
                                    </div>
                                    <div class="form-group" id="GGI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Genital Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtGITreatment" class="form-control" onchange="showDiv6g(this)">
                                                <option> </option>
                                                <c:forEach var="gitreatment" items="${GITreatment}">
                                                    <option value="${gitreatment.description}">${gitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6g" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Genital Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtGIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtGIDuration">
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group" id="GPFI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Penal Fore-Skin Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtPFITreatment" class="form-control" onchange="showDiv6h(this)">
                                                <option> </option>
                                                <c:forEach var="pfitreatment" items="${PFITreatment}">
                                                    <option value="${pfitreatment.description}">${pfitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6h" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Penal Fore-Skin Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtPFIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtPFIDuration">
                                            </div>

                                        </div>
                                    </div>
                                    <div class="form-group" id="GESI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Eye or Systemic Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtESITreatment" class="form-control" onchange="showDiv6i(this)">
                                                <option> </option>
                                                <c:forEach var="esitreatment" items="${ESITreatment}">
                                                    <option value="${esitreatment.description}">${esitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6i" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Eye or Systemic Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtESIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtESIDuration">
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group" id="GAGW" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Anal & Genital Warts treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtAGWTreatment" class="form-control" onchange="showDiv6j(this)">
                                                <option> </option>
                                                <c:forEach var="agwtreatment" items="${AGWTreatment}">
                                                    <option value="${agwtreatment.description}">${agwtreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6j" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Anal & Genital Warts Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtAGWDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtAGWDuration">
                                            </div>

                                        </div>
                                    </div>
                                    <div class="form-group" id="GSPI" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Skin or Pubic Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtSPITreatment" class="form-control" onchange="showDiv6k(this)">
                                                <option> </option>
                                                <c:forEach var="spitreatment" items="${SPITreatment}">
                                                    <option value="${spitreatment.description}">${spitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6k" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Skin or Pubic Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtSPIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtSPIDuration">
                                            </div>

                                        </div>
                                    </div>

                                    <div class="form-group" id="GII" style="display: none;">
                                        <label class="col-lg-1 control-label" style="color: blue">Inguinal Infection treatments </label>
                                        <div class="col-lg-2">

                                            <select name="txtIITreatment" class="form-control" onchange="showDiv6l(this)">
                                                <option> </option>
                                                <c:forEach var="iitreatment" items="${IITreatment}">
                                                    <option value="${iitreatment.description}">${iitreatment.description}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div id="part6l" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Inguinal Infection Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtIIDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtIIDuration">
                                            </div>
                                        </div>

                                    </div>




                                    <div class="form-group">
                                        <label class="col-lg-1 control-label" style="color: blue">Other treatments </label>
                                        <div class="col-lg-2">
                                            <input type="text" class="form-control" placeholder=" name" name="txtOtherTreatment">

                                        </div>
                                        <div id="part6m" style="display: none;">
                                            <label class="col-lg-1 control-label" style="color: blue">Other Dose</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtOtherDose">
                                            </div>


                                            <label class="col-lg-1 control-label" style="color: blue">Duration</label>


                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" placeholder=" name" name="txtOtherDuration">
                                            </div>
                                        </div>

                                    </div>





                                </fieldset>

                                <fieldset title="Step 9" class="step" id="default-step-1" >
                                    <legend>Partner Notification and treatment</legend>
                                    
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
            function format(input, format, sep) {
                var output = "";
                var idx = 0;
                for (var i = 0; i < format.length && idx < input.length; i++) {
                    output += input.substr(idx, format[i]);
                    if (idx + format[i] < input.length)
                        output += sep;
                    idx += format[i];
                }

                output += input.substr(idx);

                return output;
            }

            $('#stiNotxt').keyup(function () {
                var foo = $(this).val().replace(/-/g, "");
                if (foo.length > 0) {
                    foo = format(foo, [2, 2, 2, 4, 1, 5], "-");
                }


                $(this).val(foo);
            });


        </script>

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

            });
        </script>

        <script>
            $(document).ready(function ()
            {
                var sex = document.getElementById("psex").value;

                if (sex == 'Male') {
                    document.getElementById('part2b').style.display = "block";
                    document.getElementById('part2c').style.display = "block";
                    document.getElementById('part3a').style.display = "block";
                    document.getElementById('part4a').style.display = "block";
                    document.getElementById('part4d').style.display = "block";

                } else if (sex == 'Female') {

                    document.getElementById('part2a').style.display = "block";
                    document.getElementById('part2d').style.display = "block";
                    document.getElementById('part3b').style.display = "block";
                    document.getElementById('part4b').style.display = "block";
                    document.getElementById('part4c').style.display = "block";

                }

            });
        </script>
        <script language="Javascript" type="text/javascript">

            function showDiv5a(elem) {
                if (elem.value == 'Yes') {

                    document.getElementById('part5a').style.display = "block";

                } else if (elem.value == 'No') {
                    document.getElementById('part5a').style.display = "none";
                } else {
                    document.getElementById('part5a').style.display = "none";
                }
            }

            function showDiv5b(elem) {
                if (elem.value == 'Post delivery') {

                    document.getElementById('part5b').style.display = "block";

                } else if (elem.value == ' ') {
                    document.getElementById('part5b').style.display = "none";
                } else {
                    document.getElementById('part5b').style.display = "none";
                }
            }

            function showDiv5c(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part5c1').style.display = "block";
                    document.getElementById('part5c2').style.display = "block";
                } else if (elem.value == 'no') {
                    document.getElementById('part5c1').style.display = "none";
                    document.getElementById('part5c2').style.display = "none";
                } else {
                    document.getElementById('part5c1').style.display = "none";
                    document.getElementById('part5c2').style.display = "none";
                }
            }



            function showDiv5d(elem) {
                if (elem.value == 'pos') {

                    document.getElementById('part5d').style.display = "block";

                } else if (elem.value == 'neg') {
                    document.getElementById('part5d').style.display = "none";

                } else {
                    document.getElementById('part5d').style.display = "none";

                }
            }
            function showDiv5f(elem) {
                if (elem.value == 'pos') {

                    document.getElementById('part5f').style.display = "block";

                } else if (elem.value == 'neg') {
                    document.getElementById('part5f').style.display = "none";

                } else {
                    document.getElementById('part5f').style.display = "none";

                }
            }
            function showDiv5e(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part5e').style.display = "block";

                } else if (elem.value == 'no') {
                    document.getElementById('part5e').style.display = "none";

                } else {
                    document.getElementById('part5e').style.display = "none";

                }
            }

            function showDiv7(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part7').style.display = "block";

                } else if (elem.value == 'no') {
                    document.getElementById('part7').style.display = "none";

                } else {
                    document.getElementById('part7').style.display = "none";

                }
            }
            function showDiv(elem) {
                if (elem.value == 1) {

                    document.getElementById('part5maina').style.display = "none";
                    document.getElementById('part5mainb').style.display = "block";

                } else if (elem.value == 2) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 3) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 4) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 5) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 6) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 7) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 8) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 9) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 10) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 11) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 12) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else {
                    document.getElementById('part5maina').style.display = "none";
                    document.getElementById('part5mainb').style.display = "none";

                }
            }

            function showDiv5b1(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a1').style.display = "none";

                } else {
                    document.getElementById('part5a1').style.display = "block";

                }
            }

            function showDiv5b2(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a2').style.display = "none";

                } else {
                    document.getElementById('part5a2').style.display = "block";

                }
            }
            function showDiv5b3(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a3').style.display = "none";

                } else {
                    document.getElementById('part5a3').style.display = "block";

                }
            }
            function showDiv5b4(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a4').style.display = "none";

                } else {
                    document.getElementById('part5a4').style.display = "block";

                }
            }
            function showDiv5b5(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a5').style.display = "none";

                } else {
                    document.getElementById('part5a5').style.display = "block";

                }
            }
            function showDiv5b6(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a6').style.display = "none";

                } else {
                    document.getElementById('part5a6').style.display = "block";

                }
            }
            function showDiv5b7(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a7').style.display = "none";

                } else {
                    document.getElementById('part5a7').style.display = "block";

                }
            }
            function showDiv5b8(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a8').style.display = "none";

                } else {
                    document.getElementById('part5a8').style.display = "block";

                }
            }
            function showDiv5b9(elem) {
                if (elem.value == '') {
                    document.getElementById('part5a9').style.display = "none";

                } else {
                    document.getElementById('part5a9').style.display = "block";

                }
            }

            function showDiv6a(elem) {
                if (elem.value == '') {
                    document.getElementById('part6a').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6a').style.display = "block";

                }
            }
            function showDiv6d(elem) {
                if (elem.value == '') {
                    document.getElementById('part6d').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6d').style.display = "block";

                }
            }

            function showDiv6b(elem) {
                if (elem.value == '') {
                    document.getElementById('part6b').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6b').style.display = "block";

                }
            }
            function showDiv6c(elem) {
                if (elem.value == '') {
                    document.getElementById('part6c').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6c').style.display = "block";

                }
            }

            function showDiv6e(elem) {
                if (elem.value == '') {
                    document.getElementById('part6e').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6e').style.display = "block";

                }
            }


            function showDiv6f(elem) {
                if (elem.value == '') {
                    document.getElementById('part6f').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6f').style.display = "block";

                }
            }
            function showDiv6g(elem) {
                if (elem.value == '') {
                    document.getElementById('part6g').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6g').style.display = "block";

                }
            }
            function showDiv6h(elem) {
                if (elem.value == '') {
                    document.getElementById('part6h').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6h').style.display = "block";

                }
            }
            function showDiv6i(elem) {
                if (elem.value == '') {
                    document.getElementById('part6i').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6i').style.display = "block";

                }
            }
            function showDiv6j(elem) {
                if (elem.value == '') {
                    document.getElementById('part6j').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6j').style.display = "block";

                }
            }
            function showDiv6k(elem) {
                if (elem.value == '') {
                    document.getElementById('part6k').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6k').style.display = "block";

                }
            }
            function showDiv6l(elem) {
                if (elem.value == '') {
                    document.getElementById('part6l').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6l').style.display = "block";

                }
            }
            function showDiv6m(elem) {
                if (elem.value == '') {
                    document.getElementById('part6m').style.display = "none";

                } else if (elem.value != '') {
                    document.getElementById('part6m').style.display = "block";

                }
            }


            function showDivMaleinfection(elem) {
                if (elem.value == 'SI') {
                    if (elem.checked) {
                        document.getElementById('GSI').style.display = "block";
                    } else {

                        document.getElementById('GSI').style.display = "none";

                    }
                }
                if (elem.value == 'UI') {
                    if (elem.checked) {
                        document.getElementById('GUI').style.display = "block";
                    } else {

                        document.getElementById('GUI').style.display = "none";

                    }
                }

                if (elem.value == 'PFI') {
                    if (elem.checked) {
                        document.getElementById('GPFI').style.display = "block";
                    } else {

                        document.getElementById('GPFI').style.display = "none";

                    }
                }


            }

            function showDivAllinfection(elem) {

                if (elem.value == 'ARI') {
                    if (elem.checked) {
                        document.getElementById('GARI').style.display = "block";
                    } else {

                        document.getElementById('GARI').style.display = "none";

                    }
                }

                if (elem.value == 'GI') {
                    if (elem.checked) {
                        document.getElementById('GGI').style.display = "block";
                    } else {

                        document.getElementById('GGI').style.display = "none";

                    }
                }


                if (elem.value == 'II') {
                    if (elem.checked) {
                        document.getElementById('GII').style.display = "block";
                    } else {

                        document.getElementById('GII').style.display = "none";

                    }
                }


                if (elem.value == 'SPI') {
                    if (elem.checked) {
                        document.getElementById('GSPI').style.display = "block";
                    } else {

                        document.getElementById('GSPI').style.display = "none";

                    }
                }



                if (elem.value == 'AGW') {
                    if (elem.checked) {
                        document.getElementById(' GAGW').style.display = "block";
                    } else {

                        document.getElementById(' GAGW').style.display = "none";

                    }
                }


            }
            function showDivFemaleinfection(elem) {

                if (elem.value == 'PID') {
                    if (elem.checked) {
                        document.getElementById('GPID').style.display = "block";
                    } else {

                        document.getElementById('GPID').style.display = "none";

                    }
                }



                if (elem.value == 'VI') {
                    if (elem.checked) {
                        document.getElementById('GVI').style.display = "block";
                    } else {

                        document.getElementById('GVI').style.display = "none";

                    }
                }
                if (elem.value == 'CI') {
                    if (elem.checked) {
                        document.getElementById('GCI').style.display = "block";
                    } else {

                        document.getElementById('GCI').style.display = "none";

                    }
                }
            }

            function showDivFemaleInfantsinfection(elem) {

                if (elem.value == 'ESI') {
                    if (elem.checked) {
                        document.getElementById('GESI').style.display = "block";
                    } else {

                        document.getElementById('GESI').style.display = "none";

                    }
                }
                if (elem.value == 'VI') {
                    if (elem.checked) {
                        document.getElementById('GVI').style.display = "block";
                    } else {

                        document.getElementById('GVI').style.display = "none";

                    }
                }

                if (elem.value == 'AGW') {
                    if (elem.checked) {
                        document.getElementById(' GAGW').style.display = "block";
                    } else {

                        document.getElementById(' GAGW').style.display = "none";

                    }
                }

            }
            function showDiv8(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part8').style.display = "block";

                } else if (elem.value == 'no') {
                    document.getElementById('part8').style.display = "none";

                } else {
                    document.getElementById('part8').style.display = "none";

                }
            }
            function showDivMaleInfantsinfection(elem) {

                if (elem.value == 'ESI') {
                    if (elem.checked) {
                        document.getElementById('GESI').style.display = "block";
                    } else {

                        document.getElementById('GESI').style.display = "none";

                    }
                }
                if (elem.value == 'SI') {
                    if (elem.checked) {
                        document.getElementById('GSI').style.display = "block";
                    } else {

                        document.getElementById('GSI').style.display = "none";

                    }
                }
                if (elem.value == 'UI') {
                    if (elem.checked) {
                        document.getElementById('GUI').style.display = "block";
                    } else {

                        document.getElementById('GUI').style.display = "none";

                    }
                }

                if (elem.value == 'PFSI') {
                    if (elem.checked) {
                        document.getElementById('GPFI').style.display = "block";
                    } else {

                        document.getElementById('GPFI').style.display = "none";

                    }
                }

            }
        </script>
		<script language="javascript">
        window.onload = function () {
        document.forms[0].reset();
                placeFocus();
        }
        function placeFocus() {
        document.forms[0].elements[0].focus(); // assuming the first element
        }
    </script>
    </body>
</html>
