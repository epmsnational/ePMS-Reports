<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>New HTS Client</title>
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
                                        You are about to fill new HTS Client Intake Form <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            HTS Module
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
                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="HtsPatient" method="POST">

                                <fieldset title="Step 1" class="step" id="default-step-0">
                                    <legend> Personal Details</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Facility :</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control"  name="txtFacHTCNum" id="txtFacHTCNum" readonly="readonly" value="<c:out value="${facilityID}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Sequential Number:</label>
                                        <div class="col-lg-2">
                                            <input type="text" class="form-control"  name="txtsequential" id="htsNotxt" placeholder="00000" max="99999" min="0" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">CIF Registration Date:</label>
                                        <div class="col-lg-4">
                                            <input type="date" class="form-control" placeholder="Date of registration" name="txtHtcRegDate" required="required">
                                        </div>
                                        <label class="col-lg-2 control-label">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" national id" readonly="readonly" name="txtNatId" value="<c:out value="${patient.nationalId}"/>">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">First Name</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder=" name" name="txtName" value="${patient.firstName}" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label">Surname :</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="surname" name="txtSurname" value="${patient.lastName}" readonly="readonly">
                                        </div>
                                    </div>
                                        
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="date of birth" readonly="readonly" name="txtDob" value="<c:out value="${patient.dob}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Age </label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="age" name="txtAge" value="<c:out value="${patient.age}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Gender</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtGender" class="form-control" value="<c:out value="${patient.sex}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Marital Status</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtMarital" class="form-control" value="<c:out value="${patient.maritalStatus}"/>">
                                        </div>
                                    </div>                                       
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Orphan Status</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtOrphan" class="form-control" value="<c:out value="${patient.sex}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Highest attained Educational Level</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" name="txtEducation" class="form-control" value="<c:out value="${patient.educationalLevel}"/>">
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Occupation</label>
                                        <div class="col-lg-4">
                                            <input type="text" readonly="readonly" name="txtOccupation" class="form-control" value="<c:out value="${patient.occupation}"/>">
                                        </div>

                                    </div>
                                    <label class="col-lg-2 control-label">Entry Point </label>
                                    <div class="col-lg-4">

                                        <select name="txtEntryPoint" class="form-control">
                                            <option> </option>
                                            <c:forEach var="entrypoint" items="${htcentrypoint}">
                                                <option value="${entrypoint.id}">${entrypoint.description}</option>
                                            </c:forEach>

                                        </select>
                                    </div>
                                </fieldset>


                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>Referral Information</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Tested as a Couple</label>
                                        <div class="col-lg-2">
                                            <select  class="form-control" id="isCouple" name="txtIsCouple"  onchange="showDiv7(this)">
                                                <option> </option>
                                                <option value="No">No</option>
                                                <option value="Yes">Yes</option>                                                  
                                            </select>


                                        </div>
                                        <div id ="part5" style="display: none;">
                                            <label class="col-lg-2 control-label" style="color: blue">Coupled to </label>
                                            <div class="col-lg-3">
                                                <input type="text" class="form-control" placeholder="couple HTS Number" name="txtCoupledTo">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                    <label class="col-lg-2 control-label">HTC Model </label>
                                    <div class="col-lg-2">
                                        <select name="txtHtcModelMain" class="form-control" onchange="showDiv9(this)">
                                            <option> </option>
                                            <c:forEach var="hmodel" items="${htcmodel}">
                                                <option value="${hmodel.id}">${hmodel.description}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div id="part7a" style="display: none;">
                                        <label class="col-lg-2 control-label">Community based </label>
                                        <div class="col-lg-2">
                                            <select name="txtCommunityBasedHtcModel" class="form-control">
                                                <option> </option>
                                                <c:forEach var="hmodel" items="${htccomunitymodel}">
                                                    <option value="${hmodel.id}">${hmodel.description}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div id="part7b" style="display: none;" >
                                        <label class="col-lg-2 control-label">Facility based </label>
                                        <div class="col-lg-2">
                                            <select name="txtFacilitybasedHtcModel" class="form-control">
                                                <option> </option>
                                                <c:forEach var="hmodel" items="${htcfacilitymodel}">
                                                    <option value="${hmodel.id}">${hmodel.description}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>

                                    </div>   
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label">Reasons For HIV Testing </label>
                                        <div class="col-lg-3">
                                            <select name="txtReasonsForHIVTesting" class="form-control">
                                                <option> </option>
                                                <c:forEach var="reason" items="${Testreason}">
                                                    <option value="${reason.id}">${reason.description}</option>
                                                </c:forEach>
                                            </select>
                                        </div>

                                    </div>  

                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-2" >
                                    <legend> HIV Counseling</legend>
                                    <div>
                                        <p style="color: green">HIV Counselling </p>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label"> Pre-Test Information Given </label>
                                        <div class="col-lg-3">
                                            <select name="txtPre-TestInformationGiven" class="form-control">
                                                <option> </option>
                                                <option value="Yes">Yes</option>
                                                <option value="No">No</option>                                                  
                                            </select>


                                        </div>


                                        <label class="col-lg-2 control-label"> Opted out</label>
                                        <div class="col-lg-2">

                                            <select  class="form-control" id="optOut" name="txtOptOut"  onchange="showDiv1(this)">
                                                <option> </option>
                                                <option value="No">No</option>
                                                <option value="Yes">Yes</option>                                                  
                                            </select>
                                        </div>
                                    </div>


                                    <div class="form-group" id ="part1" style="display: none;" >
                                        <label class="col-lg-3 control-label"> Tested Before </label>
                                        <div class="col-lg-3">

                                            <select class="form-control" id="testedBefore" name="txtFirstTestEver"  onchange="showDiv2(this)">
                                                <option> </option>
                                                <option value="No">No</option>
                                                <option value="Yes">Yes</option>                                                  
                                            </select>
                                        </div>
                                        <div class="form-group" id="part2" style="display: none;">
                                            <div id="beforetestdate" class="non">
                                                <label class="col-lg-2 control-label">Date Tested</label>
                                                <div class="col-lg-2">
                                                    <input type="date" class="form-control" placeholder="date tested" name="txtDateTestedBefore">
                                                </div>
                                            </div>
                                            <c:if test="${patient.sex == 'Female'}" var="opopop">
                                                <label class="col-lg-1 control-label"> Currently Pregnancy or Lactation </label>
                                                <div class="col-lg-1">

                                                    <select class="form-control" name="txtCurrentPreg" >
                                                        <option> </option>
                                                        <option value="No" >No</option>
                                                        <option value="Yes">Yes</option>                                                  
                                                    </select>
                                                </div>
                                            </c:if>



                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Name of counselor / person who collected Blood</label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" placeholder="councellor name" name="txtCounsellor">
                                        </div>
                                    </div>




                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend>HIV Testing</legend>

                                    <div class="form-group" id="opt" style="display: none;">
                                        <div class="form-group">
                                            <div class="col-lg-1">
                                                <label>Test Count </label><br>
                                            </div>
                                            <div class="col-lg-2">
                                                <label>Test Kit Used</label><br>
                                            </div>
                                            <div class="col-lg-2">
                                                <label> Lot Number</label><br>
                                            </div>
                                            <div class="col-lg-2">
                                                <label> Test Kit Expiry date</label><br>
                                            </div>
                                            <div class="col-lg-2">
                                                <label> Test Result</label><br>
                                            </div>
                                            <div class="col-lg-1">
                                                <label> Start Time</label><br>
                                            </div>
                                            <div class="col-lg-1">
                                                <label> Reading time</label><br>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div>
                                                <div class="col-lg-1">
                                                    <label> First Test</label><br>
                                                </div>
                                                <div class="col-lg-2">
                                                    <select  class="form-control" id="firstTestKit" name="txtfirstTestKit" >

                                                        <option></option>
                                                        <option value="Determine">Determine</option>
                                                        <option value="SD Bioline">SD Bioline</option>
                                                    </select>


                                                </div>

                                                <div class="col-lg-2">

                                                    <input type="text" class="form-control"  name="txtKit1LotNumber" placeholder="lot number"  >
                                                </div>

                                                <div class="col-lg-2">

                                                    <input type="date" class="form-control" name="txtKit1ExpiryDate" >
                                                </div>

                                                <div class="col-lg-2">

                                                    <select  class="form-control" id="kit1Result" name="txtKit1Result"  onchange="showDiv3(this)">
                                                        <option> </option>
                                                        <option>Negative</option>
                                                        <option>Positive</option>                                                  
                                                    </select>

                                                </div>
                                                <div class="col-lg-1">

                                                    <input type="text" class="form-control" name="txtKit1StartTime" >
                                                </div>
                                                <div class="col-lg-1">

                                                    <input type="text" class="form-control" name="txtKit1ReadingTime" >
                                                </div>

                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div id ="part3a" style="display: none;">
                                                <div class="col-lg-1">
                                                    <label> Second Test </label><br>
                                                </div>
                                                <div >
                                                    <div class="col-lg-2">
                                                        <select class="form-control" id="secondTestKit" name="txtsecondTestKit" >
                                                            <option></option>
                                                            <option value="CHEMBIO">CHEMBIO</option>
                                                            <option value="First Response">First Response</option>
                                                        </select>

                                                    </div>

                                                    <div class="col-lg-2">
                                                        <input type="text" class="form-control"  name="txtKit2LotNumber"  >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <input type="date" class="form-control"  name="txtKit2ExpiryDate" >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <select class="form-control" id="kit2result" name="txtKit2Result" onchange="showDiv4(this)"  >
                                                            <option> </option>

                                                            <option>Negative</option>
                                                            <option>Positive</option>                                                  
                                                        </select>

                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtKit2StartTime" >
                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtKit2ReadingTime" >
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div id ="part3a1" style="display: none;">
                                                <div class="col-lg-1">
                                                    <label> First Parallel Test</label><br>
                                                </div>
                                                <div >
                                                    <div class="col-lg-2">
                                                        <select class ="form-control" id="parallelFirstTestKit" name="txtparallelFirstTestKit" >
                                                            <option></option>
                                                            <option value="Determine">Determine</option>
                                                            <option value="SD Bioline">SD Bioline</option>
                                                        </select>
                                                    </div>

                                                    <div class="col-lg-2">

                                                        <input type="text" class="form-control"  name="txtparallelKit1LotNumber"  >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <input type="date" class="form-control"  name="txtparallelKit1ExpiryDate" >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <select class="form-control" id="parallelkit1Result" name="txtparallelKit1Result" >
                                                            <option> </option>
                                                            <option value="Negative">Negative</option>
                                                            <option value="Positive">Positive</option>                                                  
                                                        </select>

                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtparallelKit1StartTime" >
                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtparallelKit1ReadingTime" >
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div id ="part3a2" style="display: none;">
                                                <div class="col-lg-1">
                                                    <label> Second Parallel Test</label><br>
                                                </div>
                                                <div >
                                                    <div class="col-lg-2">
                                                        <select class="form-control" id="parallelSecondTestKit" name="txtparallelSecondTestKit">
                                                            <option></option>
                                                            <option value="CHEMBIO">CHEMBIO</option>
                                                            <option value="First Response">First Response</option>
                                                        </select>

                                                    </div>

                                                    <div class="col-lg-2">

                                                        <input type="text" class="form-control"  name="txtparallelKit2LotNumber"  >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <input type="date" class="form-control"  name="txtparallelKit2ExpiryDate" >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <select class="form-control" id="parallelkit2result" name="txtparallelKit2Result" onchange="showDiv3a(this)"  >
                                                            <option> </option>

                                                            <option value="Negative">Negative</option>
                                                            <option value="Positive">Positive</option>                                                  
                                                        </select>
                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtparallelKit2StartTime" >
                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtparallelKit2ReadingTime" >
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                        <div id ="partHide" style="display: none;">
                                            <input type="text" id="parallelHidenResult" name="txtparallelHidenFinalResult"/>
                                        </div>
                                        <div class="form-group">
                                            <div id ="part3b" style="display: none;">
                                                <div class="col-lg-1">
                                                    <label> Final Test</label><br>
                                                </div>
                                                <div >
                                                    <div class="col-lg-2">

                                                        <select class="form-control" id="FinalTestTestKit" name="txtFinalTestTestKit">
                                                            <option></option>
                                                            <option value="INSTI">INSTI</option>
                                                            <option value="CHEMBIO">CHEMBIO</option>
                                                        </select>


                                                    </div>

                                                    <div class="col-lg-2">
                                                        <input type="text" class="form-control"  name="txtTieBrLotNumber"  >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <input type="date" class="form-control"  name="txtTieBrExpiryDate" >
                                                    </div>

                                                    <div class="col-lg-2">
                                                        <select class="form-control" id="txtTieBrResult" name="txtTieBrResult" onchange="showDiv5(this)"/>
                                                        <option> </option>

                                                        <option>Negative</option>
                                                        <option>Positive(inconclusive)</option>                                                  
                                                        </select>

                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtTieBrStartTime" >
                                                    </div>
                                                    <div class="col-lg-1">

                                                        <input type="text" class="form-control" name="txtTieBrReadingTime" >
                                                    </div>


                                                </div>

                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div id ="part3c" style="display: none;">

                                                <div >

                                                    <label class="col-lg-2 control-label"><b>Final Result</b></label>
                                                    <div class="col-lg-3">
                                                        <input class="form-control" readonly="readonly" type="text" id="txtFinalResult" name="txtFinalResult"/>

                                                    </div>



                                                </div>

                                            </div>
                                        </div>
                                        <div class="form-group">

                                            <div >

                                                <label class="col-lg-2 control-label"><b>Test Performed by</b></label>
                                                <div class="col-lg-3">
                                                    <input type="text" class="form-control"  name="txtTestPerformedBy"  >
                                                </div>



                                            </div>

                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset title="Step 5" class="step" id="default-step-4" >
                                    <legend> HIV Test Result</legend>

                                    <div class="form-group" id="opt1" style="display: none;">
                                        <div class="form-group">
                                            <label style="color: blue;"class="col-lg-3 control-label"> Post test counselled and Received Result</label>
                                            <div class="col-lg-2">

                                                <select class="form-control" name="txtPosttestcounselledandReceivedResult" onchange="showDiv6(this)">
                                                    <option> </option>
                                                    <option value="No">No</option>
                                                    <option value="Yes">Yes</option>                                                  
                                                </select>
                                            </div>
                                            <div id ="part4" style="display: none;">
                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label" style="color: blue;">Date Post Test performed</label>
                                                    <div class="col-lg-2">
                                                        <input type="date" class="form-control" placeholder="Post test date" name="txtPostTestDate">

                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label style="color: blue;"class="col-lg-3 control-label">Consent/Assent to Patient tracing</label>
                                            <div class="col-lg-2">

                                                <select class="form-control" name="txtConsent/AssenttoPatienttracing" >
                                                    <option> </option>
                                                    <option value="Personal ">Personal </option>
                                                    <option value="Index Case">Index Case</option>
                                                    <option value="No">No</option>
                                                </select>
                                            </div>
                                            <!--                                            <div id ="part4" style="display: none;">
                                                                                            <div class="form-group">
                                                                                                <label class="col-lg-3 control-label" style="color: blue;">Date Post Test performed</label>
                                                                                                <div class="col-lg-2">
                                                                                                    <input type="date" class="form-control" placeholder="Post test date" name="txtPostTestDate">
                                            
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>-->
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label" style="color: blue;"> Linkage to Post-test service </label>
                                        <div class="col-lg-2">

                                            <div class="checkbox">                                                                                
                                                <label style="color: blue;">Tick all that apply</label>
                                                <c:forEach items="${referredTo}" var="pp">
                                                    <label>
                                                        <input type="checkbox" id="ckReferredTo" name="ckReferredTo" value="${pp.id}" onchange="showDiv8(this)"> ${pp.description}
                                                    </label>
                                                </c:forEach>
                                                <div id="part6b" style = "Display : none;">
                                                    <label style="color: blue;"for="txtSpecifyReferredTo">Others specify:</label>
                                                    <input type="text" class="form-control" placeholder="Referred To" name="txtSpecifyReferredTo">
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-3">

                                        </div>
                                        <div class="col-lg-3">

                                        </div>
                                        <div class="col-lg-2">
                                            <input type="submit" value="Print result"/>
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


        </script>
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
        <script language="Javascript" type="text/javascript">
            function showDiv1(elem) {
                if (elem.value == 'No') {
                    document.getElementById('part1').style.display = "block";
                    document.getElementById('opt').style.display = "block";
                    document.getElementById('opt1').style.display = "block";
                } else if (elem.value == 'Yes') {
                    document.getElementById('part1').style.display = "block";
                    document.getElementById('opt').style.display = "none";
                    document.getElementById('opt1').style.display = "none";
                }
                else {

                    document.getElementById('part1').style.display = "none";
                    document.getElementById('opt').style.display = "none";
                    document.getElementById('opt1').style.display = "none";
                }
            }
            function showDiv2(elem) {
                if (elem.value == 'Yes') {
                    document.getElementById('part2').style.display = "block";
                } else if (elem.value == 'No') {
                    document.getElementById('part2').style.display = "none";
                }
            }

            function showDiv3(elem) {
                if (elem.value == 'Negative') {
                    document.getElementById('part3a').style.display = "none";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "block";
                    document.getElementById('part3a1').style.display = "none";
                    document.getElementById('part3a2').style.display = "none";
                    document.getElementById('part3a3').style.display = "block";
                } else if (elem.value == 'Positive') {
                    document.getElementById('part3a').style.display = "block";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "none";
                    document.getElementById('part3a1').style.display = "none";
                    document.getElementById('part3a2').style.display = "none";
                    document.getElementById('part3a3').style.display = "block";
                } else {
                    document.getElementById('part3a').style.display = "block";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "none";
                    document.getElementById('part3a1').style.display = "none";
                    document.getElementById('part3a2').style.display = "none";
                    document.getElementById('part3a3').style.display = "block";
                }
            }
            function showDiv3a(elem) {
                var x = document.getElementById('parallelkit1Result').value;
                var y = document.getElementById('parallelkit2result').value;
                if (x != "" && y != "") {
                    if (elem.value == 'Negative' && x == 'Negative') {
                        document.getElementById('part3a').style.display = "block";
                        document.getElementById('part3b').style.display = "none";
                        document.getElementById('part3c').style.display = "block";
                        document.getElementById('part3a1').style.display = "block";
                        document.getElementById('part3a2').style.display = "block";
                        document.getElementById('parallelHidenResult').value = 'Negative';
                        document.getElementById('parallelHidenResult').style.display = "block";

                    }
                    else if (elem.value == 'Positive' && x == 'Positive') {
                        document.getElementById('part3a').style.display = "block";
                        document.getElementById('part3b').style.display = "none";
                        document.getElementById('part3c').style.display = "block";
                        document.getElementById('part3a1').style.display = "block";
                        document.getElementById('part3a2').style.display = "block";
                        document.getElementById('parallelHidenResult').value = 'Positive';
                        document.getElementById('parallelHidenResult').style.display = "block";
                    }
                    else if (x != y) {
                        document.getElementById('part3a').style.display = "block";
                        document.getElementById('part3b').style.display = "block";
                        document.getElementById('part3c').style.display = "none";
                        document.getElementById('part3a1').style.display = "block";
                        document.getElementById('part3a2').style.display = "block";

                    }

                    else {
                        document.getElementById('part3a').style.display = "block";
                        document.getElementById('part3b').style.display = "block";
                        document.getElementById('part3c').style.display = "block";
                        document.getElementById('part3a1').style.display = "block";
                        document.getElementById('part3a2').style.display = "block";

                    }
                }
                else {
                    alert("Perfom first test");
                }
            }
            function showDiv4(elem) {
                if (elem.value == 'Negative') {
                    document.getElementById('part3a1').style.display = "block";
                    document.getElementById('part3a2').style.display = "block";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "none";
                } else if (elem.value == 'Positive') {
                    document.getElementById('part3a1').style.display = "none";
                    document.getElementById('part3a2').style.display = "none";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "block";
                } else {
                    document.getElementById('part3b').style.display = "block";
                    document.getElementById('part3c').style.display = "none";
                }
            }

            function showDiv5(elem) {
                if (elem.value == 'Negative') {


                    document.getElementById('part3c').style.display = "block";
                } else if (elem.value == 'Positive') {


                    document.getElementById('part3c').style.display = "block";
                } else {

                    document.getElementById('part3c').style.display = "block";
                }
            }


            function showDiv6(elem) {
                if (elem.value == 'No') {


                    document.getElementById('part4').style.display = "none";
                } else {

                    document.getElementById('part4').style.display = "block";
                }
            }
            function showDiv7(elem) {
                if (elem.value == 'No') {


                    document.getElementById('part5').style.display = "none";
                }
                else if (elem.value == 'Yes') {

                    document.getElementById('part5').style.display = "block";
                }
                else {

                    document.getElementById('part5').style.display = "none";
                }
            }
            function showDiv8(elem) {
                if (elem.value == 10) {
                    if (elem.checked) {
                        document.getElementById('part6b').style.display = "block";
                    }
                    else {

                        document.getElementById('part6b').style.display = "none";

                    }
                }

            }
            function showDiv9(elem) {
                if (elem.value == 7) {
                    document.getElementById('part7b').style.display = "block";
                    document.getElementById('part7a').style.display = "none";
                }

                else if (elem.value == 8) {
                    document.getElementById('part7a').style.display = "block";
                    document.getElementById('part7b').style.display = "none";
                }
                else {
                    document.getElementById('part7b').style.display = "none";
                    document.getElementById('part7a').style.display = "none";

                }
            }


        </script>
    </body>
</html>