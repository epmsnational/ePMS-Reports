<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>OI/ART Visit</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <link href="vmmcresources/css/form.css" rel="stylesheet" type="text/css"/>
        <link href="vmmcresources/assets/jquery-ui/jquery-ui-1.10.1.custom.min.css" rel="stylesheet"/>
        <link href="vmmcresources/css/jquery.alerts.css" rel="stylesheet" type="text/css"/>
        <script src="jquery-ui-1.10.2/jquery-1.9.1.js" type="text/javascript"></script>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">
                <section class="content-header">
                    <h1>
                        OI/ART Visit
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            New OI/ART Visit::You are about to fill visit for <a href="#" class="alert-block"><c:out value="${patient.firstName}" />  <c:out value="${patient.lastName}" /></a> : with OI/ART Number <a href="#" class="alert-link"><c:out value="${patient.patientId}" /></a>

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

                                </ul>
                            </div>
                            <form class="form-horizontal" name="visitForm" id="default" action="OIARTVisitServ" method="POST">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend> Consultation</legend>

                                    <div >
                                        <hr>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2" style="color: blue;"><b>DATE OF REVIEW :</b></div>
                                            <div class="col-lg-2">
                                                <input style="color: blue;" type="date" class="form-control" placeholder="review date" name="txtOIDateOfReview" required="required" >
                                            </div>

                                            <div class="col-lg-1" style="color: blue;"><b> VISIT TYPE:</b></div>
                                            <div class="col-lg-2">
                                                <select name="slcOIVisitType" class="form-control" onchange="showDiv6(this)">
                                                    <option> </option>
                                                    <c:forEach var="visittype" items="${visittypes}">
                                                        <option value="${visittype.visitTypeCode}">${visittype.visitTypeLong}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id="visitrefill" style="display: none;">
                                                <div class="col-lg-1" style="color: blue;"><b> DSD REFILL VISITS:</b></div>
                                                <div class="col-lg-2">
                                                    <select name="slcOIRefillVisitType" class="form-control" onchange="showDiv7(this)">
                                                        <option> </option>
                                                        <c:forEach var="refilltype" items="${refillvisittypeslist}">
                                                            <option value="${refilltype.visitTypeCode}">${refilltype.visitTypeLong}</option>
                                                        </c:forEach>

                                                    </select>
                                                </div>
                                            </div>
                                            <div id="visitclinical" style="display: none;">
                                                <div class="col-lg-1" style="color: blue;"><b> DSD CLINICAL VISITS:</b></div>
                                                <div class="col-lg-2">
                                                    <select name="slcOIClinicalVisitType" class="form-control" onchange="showDiv5(this)">
                                                        <option> </option>
                                                        <c:forEach var="clinicalvisit" items="${clinicalvisittypeslist}">
                                                            <option value="${clinicalvisit.visitTypeCode}">${clinicalvisit.visitTypeLong}</option>
                                                        </c:forEach>

                                                    </select>
                                                </div>
                                            </div>

                                        </div>

                                        <div id="visitVal1" style="display: none;">
                                            <div class="form-group" style="color: blue;">
                                                <div class="col-lg-2" style="color: blue;"><b> WEIGHT:</b></div><div class="col-lg-4">
                                                    <input style="color: blue;" type="number" class="form-control" placeholder="weight in kgs" name="txtOIWeight" max="200" min="0" step="0.01">
                                                </div>

                                                <div class="col-lg-2" style="color: blue;"><b> HEIGHT:</b></div><div class="col-lg-4">
                                                    <input style="color: blue;" type="number" class="form-control" placeholder="height in cm" name="txtOIHeight" max="200" min="20" step="0.01">
                                                </div>
                                            </div>
                                            <div class="form-group" style="color: blue;">
                                                <div class="col-lg-2" style="color: blue;"><b> PREGNANCY/ LACTATING STATUS:</b></div>
                                                <div class="col-lg-2">
                                                    <select name="slcOIPregnantStatus" class="form-control" onchange="showDiv(this)">
                                                        <option> </option>
                                                        <c:forEach var="pregnancystatu" items="${pregnancystatus}">
                                                            <option value="${pregnancystatu.pregnancystatuscode}">${pregnancystatu.pregnancystatusdescription}</option>
                                                        </c:forEach>

                                                    </select>
                                                </div>
                                                <div id="div" style="display: none;">
                                                    <div class="col-lg-2" ><b> LNMP Date:</b>                                                    
                                                    </div><div class="col-lg-2"><input style="color: blue; " type="date" class="form-control" placeholder="LNMP" name="txtOILNMPDate" >
                                                    </div>
                                                    <div class="col-lg-2" ><b> 1st ANC Booking:</b></div><div class="col-lg-2">
                                                        <input style="color: blue; " type="date" class="form-control" placeholder="1st ANC" name="txtOIFirstANCDate" >
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group" style="color: blue;">
                                                <div class="col-lg-2"><b> FUNCTIONAL STATUS:</b></div><div class="col-lg-4">
                                                    <select name="slcOIFunctionalStatus" class="form-control">
                                                        <option> </option>
                                                        <c:forEach var="functionalstat" items="${functionalstatus}">
                                                            <option value="${functionalstat.functionalStatusCode}">${functionalstat.functionalStatusDescription}</option>
                                                        </c:forEach>

                                                    </select>
                                                </div>

                                                <div class="col-lg-2"><b> WHO CLINICAL STAGE:</b></div><div class="col-lg-4">
                                                    <select id="whostage"name ="slcOIWhoClinicalStage" class="form-control" placeholder="select WHO stage" >

                                                        <option> </option>   
                                                        <option value="1">1</option>  
                                                        <option value="2">2</option>  
                                                        <option value="3">3</option>  
                                                        <option value="4">4</option> 
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group" style="color: blue;">
                                                <div class="col-lg-2" ><b> TB SCREENING:</b></div><div class="col-lg-4">
                                                    <select name="slcOITBScreening" class="form-control" onchange="showDiv1(this)">
                                                        <option> </option>
                                                        <c:forEach var="tbstat" items="${tbstatus}">
                                                            <option value="${tbstat.tbstatusCode}">${tbstat.tbstatusDescription}</option>
                                                        </c:forEach>

                                                    </select>
                                                </div>

                                                <div id="div1" style="display: none;">
                                                    <div class="col-lg-2"><b> TB SCREENING INVESTIGATION:</b></div><div class="col-lg-4">
                                                        <select name="slcOITBInvestigation" class="form-control">
                                                            <option> </option>
                                                            <c:forEach var="tbinvestigation" items="${tbinvestigation}">
                                                                <option value="${tbinvestigation.tbInvestigation}">${tbinvestigation.tbInvestigation}</option>
                                                            </c:forEach>

                                                        </select>
                                                    </div>

                                                    <div class="col-lg-2"><b> TB INVESTIGATION RESULT:</b></div><div class="col-lg-4">
                                                        <select name="slcOITBInvestigationResult" class="form-control">
                                                            <option> </option>
                                                            <c:forEach var="tbinvestigationresult" items="${tbinvestigationresults}">
                                                                <option value="${tbinvestigationresult.tbinvestigationResults}">${tbinvestigationresult.tbinvestigationResultsDescription}</option>
                                                            </c:forEach>

                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group" style="color: blue;">
                                                <div class="col-lg-2" ><b> OPPORTUNISTIC INFECTIONS AND OTHER PROBLEMS:</b></div><div class="col-lg-4">


                                                    <c:forEach items="${opportunistic}" var="opportunist">
                                                        <label>                                                       
                                                            <input type="checkbox" id="ckHivtestreasons[]" name="slcOIOIInfections" value="${opportunist.problemAcronym}">${opportunist.problemDescription} 
                                                        </label> 
                                                    </c:forEach>
                                                </div>
                                                <div class="col-lg-2" ><b> FAMILY PLANNING STATUS:</b></div><div class="col-lg-4">

                                                    <c:forEach items="${familyplanningstatus}" var="familyplanning">
                                                        <label>                                                       
                                                            <input type="checkbox" id="ckHivtestreasons[]" name="slcOIFamilyPlanningnStatus" value="${familyplanning.familyPlanningId}">${familyplanning.familyPlanningMethod} 
                                                        </label> 
                                                    </c:forEach>


                                                </div>



                                            </div>
                                            <hr>
                                        </div>
                                    </div>

                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>Prescriptions & Dispensing</legend>

                                    <div >
                                        <div class="col-lg-12" style="color: red"><h3>COTRIMOXAZOLE :</h3></div>
                                        <div class="form-group" style="color: blue;" style="background-color: grey">
                                            <div class="col-lg-2" style="color: blue;"><b>Quantity Dispensed(Tablets or ml) :</b></div><div class="col-lg-4">
                                                <input style="color: blue;" type="number" class="form-control" placeholder="Quantiy dispenced" name="txtOICotriQuantiyDispensed" >
                                            </div>

                                            <div class="col-lg-2" style="color: blue;"><b> % Adherence:</b></div><div class="col-lg-4">
                                                <input  style="color: blue;" type="number" class="form-control" placeholder="% adherence" name="txtOICotriAdherence" max="100" min="0" >
                                            </div>
                                        </div><hr>
                                    </div>

                                    <div class="col-lg-12" style="color: red"><h3>TPT :</h3></div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b> TPT Eligibility:</b></div>
                                        <div class="col-lg-4">


                                            <select name ="slcOIIPTEligibility" class="form-control" placeholder="select Eligibility" onchange="showDiv2(this)">
                                                <option> </option>
                                                <c:forEach var="istpteligibility" items="${istpteligibility}">
                                                    <option value="${istpteligibility.tptEligibilityCode}">${istpteligibility.tptEligibilityDescription}</option>
                                                </c:forEach> 
                                            </select>

                                        </div>
                                    </div>

                                    <div class="form-group" style="color: blue;">

                                        <div id="div2a" style="display: none;">
                                            <div class="col-lg-2" style="color: blue;"><b> TPT STATUS:</b></div>
                                            <div class="col-lg-4">
                                                <select name="slcOIIPTStatus" class="form-control" onchange="showDivT(this)">
                                                    <option> </option>
                                                    <c:forEach var="iptstat" items="${iptstatus}">
                                                        <option value="${iptstat.iptstatusCode}">${iptstat.iptstatusCodeDescription}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>

                                        </div>
                                    </div>
                                    <div id="div2b" style="display: none;">
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2" ><b> QUANTITY DISPENSED TABLETS/ml:</b></div><div class="col-lg-4">
                                                <input style="color: blue;" type="number" class="form-control" placeholder="Tablets/ml" name="txtOIIPTQuantiyDispensed" >
                                            </div>

                                            <div class="col-lg-2" ><b> % ADHERENCE:</b></div><div class="col-lg-4">
                                                <input style="color: blue;" type="number" class="form-control" placeholder="% adherence" name="txtOIIPTAdherence" max="100" min="0">
                                            </div>
                                        </div>
                                    </div><hr>
                                    <div class="col-lg-12" style="color: red;"><h3>CRYPTOCOCCAL STATUS :</h3></div>
                                    <div class="col-lg-2" style="color: blue;"><b> CRYPTOCOCCAL SCREENING:</b></div>
                                    <div class="col-lg-4">
                                        <select name ="cryptococcalscreening" class="form-control">
                                            <option> </option>
                                            <c:forEach var="cryptococcalscreening" items="${cryptococcalscreening}">
                                                <option value="${cryptococcalscreening.cryptococcalScreeningCode}">${cryptococcalscreening.cryptococcalScreeningDescription}</option>
                                            </c:forEach> 
                                        </select>

                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-2" style="color: blue;"><b> CRYPTOCOCCAL INVESTIGATION DONE:</b></div>
                                        <div class="col-lg-4">
                                            <select name ="cryptococcalinvestigation" class="form-control">
                                                <option> </option>
                                                <c:forEach var="cryptococcalinvestigation" items="${cryptococcalinvestigation}">
                                                    <option value="${cryptococcalinvestigation.cryptococcalInvestigationCode}">${cryptococcalinvestigation.cryptococcalInvestigationDescription}</option>
                                                </c:forEach> 
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-2" style="color: blue;"><b> CRYPTOCOCCAL INVESTIGATION RESULTS:</b></div>
                                        <div class="col-lg-4">
                                            <select name ="cryptococcalinvestigationresult" class="form-control">
                                                <option> </option>
                                                <option value="Positive">Positive</option>
                                                <option value="Negative">Negative</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-2" style="color: blue;"><b> CRYPTOCOCCAL TREATMENT DONE:</b></div>
                                        <div class="col-lg-4">
                                            <select name ="cryptococcaltreatment" class="form-control">
                                                <option> </option>
                                                <c:forEach var="cryptococcaltreatment" items="${cryptococcaltreatment}">
                                                    <option value="${cryptococcaltreatment.cryptococcalTreatmentCode}">${cryptococcaltreatment.cryptococcalTreatmentDescription}</option>
                                                </c:forEach> 
                                            </select>
                                        </div>
                                    </div>
                                    <hr>

                                    <div class="col-lg-12" style="color: red" align="left"  ><h3>ARV :</h3></div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" ><b> ARV STATUS:</b></div>
                                        <div class="col-lg-4">
                                            <select id="arvstatus"name="slcOIARVStatus" class="form-control" onchange="showDiv3(this)">
                                                <option> </option>
                                                <c:forEach var="arvstat" items="${arvstatus}">
                                                    <option value="${arvstat.arvstatusCode}">${arvstat.arvstatusDescription}</option>
                                                </c:forEach>

                                            </select>

                                        </div>

                                        <div class="col-lg-2"><b> ADVERSE EVENT STATUS:</b></div><div class="col-lg-4">
                                            <select name="slcOIAdverseEventStatus" class="form-control">
                                                <option> </option>
                                                <c:forEach var="adverseeventsstat" items="${adverseeventsstatus}">
                                                    <option value="${adverseeventsstat.adverseEventsStatusCode}">${adverseeventsstat.adverseEventsStatusCode}</option>
                                                </c:forEach>

                                            </select>

                                        </div>
                                    </div>



                                    <div class="form-group" style="color: blue;">
                                        <div id="div3f" style="display: none;">
                                            <div class="col-lg-2" ><b> ARV REASON:</b></div> 
                                        </div> 
                                        <div class="col-lg-4">
                                            <div id="div3a" style="display: none;">
                                                <select name="slcOIARVReason1" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="arvreasoncode1" items="${arvreasoncodes1}">
                                                        <option value="${arvreasoncode1.arvreasonCode}">${arvreasoncode1.arvreasonCode} - ${arvreasoncode1.arvreason}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id="div3b" style="display: none;">
                                                <select name="slcOIARVReason2" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="arvreasoncode2" items="${arvreasoncodes2}">
                                                        <option value="${arvreasoncode2.arvreasonCode}">${arvreasoncode2.arvreasonCode} - ${arvreasoncode2.arvreason}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div id="div3c" style="display: none;">
                                                <select name="slcOIARVReason4" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="arvreasoncode4" items="${arvreasoncodes4}">
                                                        <option value="${arvreasoncode4.arvreasonCode}">${arvreasoncode4.arvreasonCode} - ${arvreasoncode4.arvreason}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>

                                        </div>                                       
                                    </div>
                                    <div id="div3d" style="display: none;">
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2">ART INITIATION CATEGORY:</div>
                                            <div class="col-lg-4">
                                                <select name="artinitiationcategory" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="artcategories" items="${artcategories}">
                                                        <option value="${artcategories.artInitiationCategoryCode}">${artcategories.artInitiationCategoryCode} - ${artcategories.artInitiationCategoryDescription}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2">ARV COMBINATION REGIMEN:</div>
                                            <div class="col-lg-4">
                                                <select name="slcOIARVRegmenCombination" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="arvregimen" items="${arvregimens}">
                                                        <option value="${arvregimen.arvcode}">${arvregimen.v2code} - ${arvregimen.arvdescription}</option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="div3e" style="display: none;">
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2" ><b> QUANTITY PRESCRIBED:</b></div>
                                            <div class="col-lg-4">
                                                <input  id="arvqp"type="number" class="form-control" placeholder="tablets/ml" name="txtOIARVQuantityPrescribed" >
                                            </div>
                                            <div class="col-lg-2"><b> QUANTITY DISPENSED</b></div>
                                            <div class="col-lg-4">
                                                <input  id="arvqd"type="number" class="form-control" placeholder="tablets/ml" name="txtOIARVQuantityDispensed" onchange="showValidateArv(this)">
                                            </div>
                                        </div>
                                        <div id="div3g" class="form-group" style="color: blue;">
                                            <div class="col-lg-2"><b> % ADHERENCE</b></div>
                                            <div class="col-lg-4">
                                                <input  type="number" class="form-control" placeholder="% adherence" name="txtOIARVAdherence" max="100" min="0">
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-2" >
                                    <legend>Lab Results</legend>
                                    <div class="form-group" id="divviral">
                                        <label class="col-lg-2 control-label">VIRAL LOAD</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="vl" name="chkvl" value="Yes" onchange="showDivVL(this)" />
                                        </label>
                                    </div>
                                    <div class="col-sm-12" id="divVL" style="display: none"> 
                                        <label class="col-lg-2 control-label" style="color: blue">Capture Lab Tests</label>
                                        <div class="form-group col-sm-2" style="text-align: left;">
                                            <input type="radio" name="rdcaptureVLlab" id="optCaptureLab" value="CA" onchange="showDiv23(this)">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Get Results From Lab</label>
                                        <div class="form-group col-sm-2" style="text-align: left;color: red;">
                                            <input type="radio" name="rdcaptureVLlab" id="optCaptureLab" value="AU" onchange="showDiv23(this)">
                                        </div>
                                    </div>
                                    <div class="form-group" id="div23" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">Count</label>
                                        <div class="col-lg-3">
                                            <input type="number" class="form-control" placeholder="copies/ml" name="txtOIViralLoad" />
                                        </div>
                                        <label class="col-lg-2 control-label">VIRAL LOAD Test date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOIViralLoadTestDate" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div24" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">Result Received at Facility date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOIVLReceivedAtFacility" />
                                        </div>
                                        <label class="col-lg-2 control-label">Result Given to client date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOIVLDateRecievedByClient" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div25" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">VIRAL LOAD Notes</label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" name="txtOIVLNotes" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div23X" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">Viral Load Copies</label>
                                        <div class="col-lg-4">
                                            <select name="labviralload" class="form-control">
                                                <option> </option>
                                                <c:forEach var="viralload" items="${viralload}">
                                                    <option value="${viralload.id}">Test Date : ${viralload.testDate} Result : ${viralload.result}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group" id="divcd4">
                                        <label class="col-lg-2 control-label">CD4 Count Result :</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="cd4" name="chkcd4" value="Yes" onchange="showDivCD(this)" />
                                        </label>
                                    </div>
                                    <div class="col-sm-12" id="divCD" style="display: none"> 
                                        <label class="col-lg-2 control-label" style="color: blue">Capture Lab Tests</label>
                                        <div class="form-group col-sm-2" style="text-align: left;">
                                            <input type="radio" name="rdcaptureCDlab" id="optCaptureLab" value="CA" onchange="showDiv17(this)">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Get Results From Lab</label>
                                        <div class="form-group col-sm-2" style="text-align: left;color: red;">
                                            <input type="radio" name="rdcaptureCDlab" id="optCaptureLab" value="AU" onchange="showDiv17(this)">
                                        </div>
                                    </div>
                                    <div class="form-group" id="div17" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label" >Copies:</label>
                                        <div class="col-lg-3">
                                            <input type="number" class="form-control" placeholder="cell/mm3" name="txtOICD4Count" />
                                        </div>
                                        <label class="col-lg-2 control-label" >CD4 Count Date:</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" placeholder="CD4 Count date" name="txtOICD4TestDate" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div17a" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">Result Received at Facility date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOICD4ReceivedAtFacility" />
                                        </div>
                                        <label class="col-lg-2 control-label">Result Given to client date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOICD4DateRecievedByClient" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div17X" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label" >CD4 Count Result:</label>
                                        <div class="col-lg-4">
                                            <select name="labcdcount" class="form-control">
                                                <option> </option>
                                                <c:forEach var="cdcount" items="${cdcount}">
                                                    <option value="${cdcount.id}">Test Date : ${cdcount.testDate} Result : ${cdcount.result}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group" id="divcd4p">
                                        <label class="col-lg-2 control-label">CD4 % result</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="cd4p" name="chkcd4p" value="Yes" onchange="showDivCDP(this)" />
                                        </label>
                                    </div>
                                    <div class="col-sm-12" id="divCDP" style="display: none"> 
                                        <label class="col-lg-2 control-label" style="color: blue">Capture Lab Tests</label>
                                        <div class="form-group col-sm-2" style="text-align: left;">
                                            <input type="radio" name="rdcaptureCDPlab" id="optCaptureLab" value="CA" onchange="showDiv18(this)">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Get Results From Lab</label>
                                        <div class="form-group col-sm-2" style="text-align: left;color: red;">
                                            <input type="radio" name="rdcaptureCDPlab" id="optCaptureLab" value="AU" onchange="showDiv18(this)">
                                        </div>
                                    </div>
                                    <div class="form-group" id="div18" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label" >Percentages:</label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" placeholder="%" name="txtOICDPercResult" />
                                        </div>
                                        <label class="col-lg-2 control-label">CD4 % Date :</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" placeholder="CD4% date" name="txtOICDPercDate" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div18a" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">Result Received at Facility date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOICDPercReceivedAtFacility" />
                                        </div>
                                        <label class="col-lg-2 control-label">Result Given to client date</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" name="txtOICDPercDateRecievedByClient" />
                                        </div>
                                    </div>
                                    <div class="form-group" id="div18X" style="display: none;color: red;">
                                        <label class="col-lg-2 control-label">CD4 % :</label>
                                        <div class="col-lg-4">
                                            <select name="labcdpercent" class="form-control">
                                                <option> </option>
                                                <c:forEach var="cdpercent" items="${cdpercent}">
                                                    <option value="${cdpercent.id}">Test Date : ${cdpercent.testDate} Result : ${cdpercent.result}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group" id="divhb">
                                        <label class="col-lg-2 control-label">HB Result:</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="hb" name="chkhb" value="Yes" onchange="showDiv19(this)" />
                                        </label>
                                        <div id="div19" style="display: none;color: red;">
                                            <div class="col-lg-3">
                                                <input type="text" class="form-control" placeholder=" g/dl" name="txtOIHBResult" />
                                            </div>
                                            <label class="col-lg-2 control-label">HB Result Date :</label>
                                            <div class="col-lg-3">
                                                <input type="date" class="form-control" placeholder="HB result Date" name="txtOIHBDate" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" id="divalt">
                                        <label class="col-lg-2 control-label">ALT Result</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="atl" name="chkatl" value="Yes" onchange="showDiv20(this)" />
                                        </label>
                                        <div id="div20" style="display: none;color: red;">
                                            <div class="col-lg-3">
                                                <input type="number" class="form-control" placeholder="mmol/L" name="txtOIATL" />
                                            </div>
                                            <label class="col-lg-2 control-label">ALT Result date</label>
                                            <div class="col-lg-3">
                                                <input type="date" class="form-control" placeholder="ATL Result Date" name="txtOIALTDate" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" id="divother">
                                        <label class="col-lg-2 control-label">Other diagnosis</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="wbc" name="chkwbc" value="Yes" onchange="showDiv21(this)" />
                                        </label>
                                        <div id="div21" style="display: none;color: red;">
                                            <div class="col-lg-3">
                                                <input type="number" class="form-control" name="txtOIOtherDiagnosis" />
                                            </div>
                                            <label class="col-lg-2 control-label">Other diagnosis test date</label>
                                            <div class="col-lg-3">
                                                <input type="date" class="form-control" name="txtOIWBCDate" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" id="divcreat">
                                        <label class="col-lg-2 control-label">CREATININE</label> 
                                        <label class="col-lg-1 control-label">
                                            <input type="checkbox" id="creatin" name="chkcreatin" value="Yes" onchange="showDiv22(this)" />
                                        </label>
                                        <div id="div22" style="display: none;color: red;">
                                            <div class="col-lg-3">
                                                <input type="text" class="form-control" placeholder="creatinine" name="txtOICreatinine" />
                                            </div>
                                            <label class="col-lg-2 control-label">CREATININE Result date</label>
                                            <div class="col-lg-3">
                                                <input type="date" class="form-control" placeholder="creatinine result date" name="txtOICreatinineDate" />
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                                
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend> Cervical Cancer Screening:<p>HPV Test/VIAC</p></legend>
                                    <div class="form-group" style="color: blue;">
                                        <label class="col-lg-2 control-label" >HPV Test Result:</label>
                                        <div class="col-lg-3">
                                            <select name="txthpvresult" class="form-control">
                                                <option> </option>
                                                <option value="Positive">Positive</option>
                                                <option value="Negative">Negative</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label" >VIAC Result:</label>
                                        <div class="col-lg-3">
                                            <select name="txtviacresult" class="form-control">
                                                <option> </option>
                                                <option value="Positive">Positive</option>
                                                <option value="Negative">Negative</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group" style="color: blue;">
                                        <label class="col-lg-2 control-label" >Treatment:</label>
                                        <div class="col-lg-3">
                                            <select name="txttreatment" class="form-control">
                                                <option> </option>
                                                    <c:forEach var="cervicalcancertreatment" items="${cervicalcancertreatment}">
                                                        <option value="${cervicalcancertreatment.cervicalCancerTreatmentCode}">${cervicalcancertreatment.cervicalCancerTreatmentDescription}</option>
                                                    </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </fieldset>
                                
                                <fieldset title="Step 5" class="step" id="default-step-4" >
                                    <legend> Followup & Outcome </legend>
                                    <div >
                                        <div class="form-group" style="color: blue;">
                                            <br>
                                            <label class="col-lg-2 control-label"><b>Referred to:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcOIReferredTo" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="referredt" items="${referredto}">
                                                        <option value="${referredt.referralToCode}">${referredt.referralTo}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Next review date :</b></label>
                                            <div class="col-lg-4">
                                                <input  type="date" class="form-control" placeholder="next review date" name="txtOINextReviwDate">
                                            </div>
                                            <br><br>

                                            <label class="col-lg-2 control-label"><b>Visit Status:</b></label>
                                            <div class="col-lg-4">
                                                <select name="txtVisitStatus" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="visitstatus" items="${visitstatus}">
                                                        <option value="${visitstatus.visitstatuscode}">${visitstatus.visitstatusdescription}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Final Outcome:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcFollowUpStatus" class="form-control" onchange="showDiv8(this)">
                                                    <option> </option>
                                                    <c:forEach var="followupstat" items="${followupstatus}">
                                                        <option value="${followupstat.statusCode}">${followupstat.status}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <div id ="div9" style="display: none;"> 
                                                <label class="col-lg-2 control-label"><b>Transfer out Facility:</b></label>
                                                <div class="col-lg-4">



                                                    <select name="slcOITransferredTo" class="form-control">
                                                        <option> </option>
                                                        <c:forEach var="facility" items="${failitylist}">
                                                            <option value="${facility.provinceCode}-${facility.districtCode}-${facility.facilityCode}">${facility.facilityName}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>


                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Name of clinician:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcClinician" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="staffpersonel" items="${staffpersonel}">
                                                        <option value="${staffpersonel.id}">${staffpersonel.userName}&nbsp;${staffpersonel.firstName}&nbsp;${staffpersonel.lastName}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Name of pharmacy Dispenser:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcPharmacyDispenser" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="staffpersonel" items="${staffpersonel}">
                                                        <option value="${staffpersonel.id}">${staffpersonel.userName}&nbsp;${staffpersonel.firstName}&nbsp;${staffpersonel.lastName}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Notes:</b></label>
                                            <div class="col-lg-4">
                                                <textarea class="form-control" name="txtOINotes"></textarea>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-lg-4">
                                        <input  type="hidden" class="form-control"  name="txtPrevARVStaus"value="<c:out value="${prevvis.arvstatusCode}"/>">
                                    </div>
                                    <div class="col-lg-4">
                                        <input  type="hidden" class="form-control"  name="txtPrevARVRegimen"value="<c:out value="${prevvis.arvcode}"/>">
                                    </div>
                                    <div class="col-lg-4">
                                        <input  type="hidden" class="form-control"  name="txtPrevWHOStage" value="<c:out value="${prevvis.whostage}"/>">
                                    </div>
                                </fieldset>

                                <input type="submit" name="action" onclick="return validate()" class="finish btn btn-danger"  value="Finish"/>
                            </form>
                        </div>
                    </section>
                </section>
            </section>
        </section>
    </section>
    <%@include file="/vmmcwizardjs.jsp" %>

    <script src="vmmcresources/js/sliders.js" type="text/javascript"></script>
    <script src="vmmcresources/js/jquery.alerts.js" type="text/javascript"></script>
    <%@include file="../footer.jsp" %>



    <!--script for this page-->
    <!--Ajaxfy the post of this form-->
    <script>
                                    /* jConfirm('Sure ?', 'Yes dude', 'Nope', function(confirmed){
                                     if(confirmed){
                                     }else{ }*/
                                    $(document).on("submit", "#default", function(event) {
                                    var $form = $(this);
                                            jConfirm('Are you sure to save?', 'Save', 'Cancel', function(r){
                                            if (r == true)
                                            {
                                            $.post($form.attr("action"), $form.serialize(), function(response) {
                                            }
                                            });
                                                    // ...

                                            });
                                                    // alert('I got this far');
                                                    event.preventDefault(); // Important! Prevents submitting the form.
                                            });</script>

    <script>

                //step wizard

                $(function () {
                $('#default').stepy({
                backLabel: 'Previous',
                        block: true,
                        nextLabel: 'Next',
                        titleClick: true,
                        titleTarget: '.stepy-tab'});
                });</script>
    <script>
                $(document).ready(function()
        {
        $('#dob').focusout(function(event){
        var computedAge = $('#dob').val();
                $.get('AddPatientServlet', {dob:computedAge}, function(responseText)
                {
                $('#theAge').val(responseText);
                });
        });
        });
                $(document).ready(function()
        {
        $('#theAge').focusout(function(event){
        var computeDob = $('#theAge').val();
                $.get('AddPatientServlet', {dobAge:computeDob}, function(responseText)
                {
                $('#dob').val(responseText);
                });
        });
        });</script>

    <script type="text/javascript">
                RevSlide.initRevolutionSlider();
                $(window).load(function () {
        $('[data-zlname = reverse-effect]').mateHover({
        position: 'y-reverse', overlayStyle: 'rolling',
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

                $(document).ready(function ()
        {
        //default value
        var defaultValue = $('#slider-range-temperature-amount').text();
                $('#temperature').val(0);
                $('#slider-range-temperature').focusout(function () {
        var strinfo = $('#slider-range-temperature-amount').text();
                //alert(strinfo);
                $('#temperature').val(strinfo);
        });
        });
                $(document).ready(function ()
        {
        //default value
        var defaultValue = $('#slider-range-dystolic-amount').text();
                $('#dystolic').val(0);
                $('#slider-range-dystolic').focusout(function () {
        var strinfo = $('#slider-range-dystolic-amount').text();
                //alert(strinfo);
                $('#dystolic').val(strinfo);
        });
        });
                $(document).ready(function ()
        {
        //default value
        var defaultValue = $('#slider-range-height-amount').text();
                $('#height').val(0);
                $('#slider-range-height').focusout(function () {
        var strinfo = $('#slider-range-height-amount').text();
                // alert(strinfo);
                $('#height').val(strinfo);
        });
        });
                $(document).ready(function ()
        {
        //default value
        var defaultValue = $('#slider-range-systolic-amount').text();
                $('#systolic').val(0);
                $('#slider-range-systolic').focusout(function () {
        var strinfo = $('#slider-range-systolic-amount').text();
                // alert(strinfo);
                $('#systolic').val(strinfo);
        });
        });
                $(document).ready(function ()
        {
        //default value
        var defaultValue = $('#slider-range-weight-amount').text();
                $('#weight').val(0);
                $('#slider-range-weight').focusout(function () {
        var strinfo = $('#slider-range-weight-amount').text();
                // alert(strinfo);
                $('#weight').val(strinfo);
        });
        });</script>

    <script language="Javascript" type="text/javascript">
                function showDiv(elem) {
                if (elem.value == 'P') {
                document.getElementById('div').style.display = "block";
                } else {
                document.getElementById('div').style.display = "none";
                }
                }
        function showDiv1(elem) {
        if (elem.value == 'ON') {
        document.getElementById('div1').style.display = "block";
        } else if (elem.value == 'S') {
        document.getElementById('div1').style.display = "block";
        } else {
        document.getElementById('div1').style.display = "none";
        }
        }


        function showDiv2(elem) {
        if (elem.value == 'Y') {
        document.getElementById('div2a').style.display = "block";
                document.getElementById('div2b').style.display = "block";
        }
        if (elem.value == '') {
        document.getElementById('div2a').style.display = "none";
                document.getElementById('div2b').style.display = "none";
        }
        else {
        document.getElementById('div2a').style.display = "block";
                document.getElementById('div2b').style.display = "block";
        }
        }
        function showDiv3(elem) {
        if (elem.value == '1') {
        document.getElementById('div3a').style.display = "block";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "none";
                document.getElementById('div3d').style.display = "none";
                document.getElementById('div3e').style.display = "none";
                document.getElementById('div3f').style.display = "block";
        } else if (elem.value == '2') {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "block";
                document.getElementById('div3c').style.display = "none";
                document.getElementById('div3d').style.display = "block";
                document.getElementById('div3e').style.display = "block";
                document.getElementById('div3f').style.display = "block";
                document.getElementById('div3g').style.display = "none";
        }
        else if (elem.value == '3') {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "none";
                document.getElementById('div3d').style.display = "block";
                document.getElementById('div3e').style.display = "block";
                document.getElementById('div3f').style.display = "none";
                document.getElementById('div3g').style.display = "block";
        }
        else if (elem.value == '4') {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "block";
                document.getElementById('div3d').style.display = "block";
                document.getElementById('div3e').style.display = "block";
                document.getElementById('div3f').style.display = "block";
                document.getElementById('div3g').style.display = "block";
        }
        else if (elem.value == '5') {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "block";
                document.getElementById('div3d').style.display = "block";
                document.getElementById('div3e').style.display = "block";
                document.getElementById('div3f').style.display = "block";
                document.getElementById('div3g').style.display = "block";
        }
        else if (elem.value == '6') {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "block";
                document.getElementById('div3d').style.display = "block";
                document.getElementById('div3e').style.display = "block";
                document.getElementById('div3f').style.display = "block";
                document.getElementById('div3g').style.display = "block";
        }
        else if (elem.value == '7') {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "block";
                document.getElementById('div3d').style.display = "block";
                document.getElementById('div3e').style.display = "block";
                document.getElementById('div3f').style.display = "block";
                document.getElementById('div3g').style.display = "block";
        }
        else {
        document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
                document.getElementById('div3c').style.display = "none";
                document.getElementById('div3d').style.display = "none";
                document.getElementById('div3e').style.display = "none";
                document.getElementById('div3g').style.display = "none";
        }
        }



        function showDiv4(elem) {
        if (elem.value == 'INI') {
        document.getElementById('div2b').style.display = "block";
        } else if (elem.value == 'IS') {
        document.getElementById('div2b').style.display = "block";
        }
        else {
        document.getElementById('div2b').style.display = "none";
        }
        }
        function showDivT(elem) {
        if (elem.value == 'INI') {
        document.getElementById('divTpt').style.display = "block";
        } else if (elem.value == 'IS') {
        document.getElementById('divTpt').style.display = "block";
        }
        else {
        document.getElementById('divTpt').style.display = "none";
        }
        }
        function showDiv5(elem) {
        if (elem.value == 'P') {
        document.getElementById('visitVal1').style.display = "block";
        } else if (elem.value == 'D') {

        document.getElementById('visitVal1').style.display = "block";
        }

        else if (elem.value == 'E'){
        document.getElementById('visitVal1').style.display = "block";
        }
        else if (elem.value == 'F'){
        document.getElementById('visitVal1').style.display = "block";
        }
        else if (elem.value == 'G'){
        document.getElementById('visitVal1').style.display = "block";
        }
        else if (elem.value == 'O'){
        document.getElementById('visitVal1').style.display = "block";
        }
        else{
        document.getElementById('visitVal1').style.display = "none";
        }
        }
        function showDiv6(elem) {
        if (elem.value == 'CL') {
        document.getElementById('visitclinical').style.display = "block";
                document.getElementById('visitrefill').style.display = "none";
        }
        else if (elem.value == 'RF') {

        document.getElementById('visitclinical').style.display = "none";
                document.getElementById('visitrefill').style.display = "block";
                document.getElementById('visitVal1').style.display = "none";
        }

        else{
        document.getElementById('visitclinical').style.display = "none";
                document.getElementById('visitrefill').style.display = "none";
        }
        }

        function showDiv17(elem) {
        if (elem.value == 'CA') {
        if (elem.checked) {
        document.getElementById('div17').style.display = "block";
                document.getElementById('div17a').style.display = "block";
                document.getElementById('div17X').style.display = "none";
        }
        else {

        document.getElementById('div17').style.display = "none";
                document.getElementById('div17a').style.display = "none";
                document.getElementById('div17X').style.display = "none";
        }
        }
        else if (elem.value == 'AU') {
        if (elem.checked) {
        document.getElementById('div17X').style.display = "block";
                document.getElementById('div17').style.display = "none";
                document.getElementById('div17a').style.display = "none";
        }
        else {
        document.getElementById('div17X').style.display = "none";
                document.getElementById('div17').style.display = "none";
                document.getElementById('div17a').style.display = "none";
        }
        }
        }

        function showDiv18(elem) {
        if (elem.value == 'CA') {
        document.getElementById('div18').style.display = "block";
                document.getElementById('div18a').style.display = "block";
                document.getElementById('div18X').style.display = "none";
        }
        else if (elem.value == 'AU') {
        document.getElementById('div18X').style.display = "block";
                document.getElementById('div18').style.display = "none";
                document.getElementById('div18a').style.display = "none";
        }
        else {
        document.getElementById('div18').style.display = "none";
                document.getElementById('div18X').style.display = "none";
                document.getElementById('div18a').style.display = "none";
        }
        }
        function showDiv19(elem) {
        if (elem.value == 'Yes') {
        if (elem.checked) {
        document.getElementById('div19').style.display = "block";
        }
        else {

        document.getElementById('div19').style.display = "none";
        }
        }
        }
        function showDiv20(elem) {
        if (elem.value == 'Yes') {
        if (elem.checked) {
        document.getElementById('div20').style.display = "block";
        }
        else {

        document.getElementById('div20').style.display = "none";
        }
        }
        }
        function showDiv21(elem) {
        if (elem.value == 'Yes') {
        if (elem.checked) {
        document.getElementById('div21').style.display = "block";
        }
        else {

        document.getElementById('div21').style.display = "none";
        }
        }
        }
        function showDiv22(elem) {
        if (elem.value == 'Yes') {
        if (elem.checked) {
        document.getElementById('div22').style.display = "block";
        }
        else {

        document.getElementById('div22').style.display = "none";
        }
        }
        }
        function showDivCDP(elem){
        if (elem.value == 'Yes'){
        if (elem.checked){
        document.getElementById('divCDP').style.display = "block";
        }
        else{
        document.getElementById('divCDP').style.display = "none";
                document.getElementById('div18').style.display = "none";
                document.getElementById('div18X').style.display = "none";
        }
        }
        else{
        document.getElementById('divCDP').style.display = "none";
                document.getElementById('div18').style.display = "none";
                document.getElementById('div18X').style.display = "none";
        }
        }
        function showDivCD(elem){
        if (elem.value == 'Yes'){
        if (elem.checked){
        document.getElementById('divCD').style.display = "block";
        }
        else{
        document.getElementById('divCD').style.display = "none";
                document.getElementById('div17').style.display = "none";
                document.getElementById('div17X').style.display = "none";
        }
        }
        else{
        document.getElementById('divCD').style.display = "none";
                document.getElementById('div17').style.display = "none";
                document.getElementById('div17X').style.display = "none";
        }

        }
        function showDivVL(elem) {
        if (elem.value == 'Yes'){
        if (elem.checked){
        document.getElementById('divVL').style.display = "block";
        }
        else{
        document.getElementById('divVL').style.display = "none";
                document.getElementById('div23').style.display = "none";
                document.getElementById('div24').style.display = "none";
                document.getElementById('div25').style.display = "none";
                document.getElementById('div23X').style.display = "none";
        }
        }
        else{
        document.getElementById('divVL').style.display = "none";
                document.getElementById('div23').style.display = "none";
                document.getElementById('div24').style.display = "none";
                document.getElementById('div25').style.display = "none";
                document.getElementById('div23X').style.display = "none";
        }
        }
        function showDiv23(elem) {
        if (elem.value == 'CA') {
        document.getElementById('div23').style.display = "block";
                document.getElementById('div24').style.display = "block";
                document.getElementById('div25').style.display = "block";
                document.getElementById('div23X').style.display = "none";
        }

        else if (elem.value == 'AU'){
        document.getElementById('div23').style.display = "none";
                document.getElementById('div24').style.display = "none";
                document.getElementById('div25').style.display = "none";
                document.getElementById('div23X').style.display = "block";
        }
        else{
        document.getElementById('div23').style.display = "none";
                document.getElementById('div24').style.display = "none";
                document.getElementById('div25').style.display = "none";
                document.getElementById('div23X').style.display = "none";
        }
        }
        function showDiv23X(elem) {
        if (elem.value == 'Yes') {
        if (elem.checked) {
        document.getElementById('div23X').style.display = "block";
        }
        else {

        document.getElementById('div23X').style.display = "none";
        }
        }
        }
        function showDiv8(elem) {
        if (elem.value == 'TO') {
        document.getElementById('div9').style.display = "block";
        }

        else{
        document.getElementById('div9').style.display = "none";
        }
        }
        function showDivCaptLab(elem) {
        if (elem.value == 'CA') {
        if (elem.checked) {
        document.getElementById('divviral').style.display = "block";
                document.getElementById('divcd4').style.display = "block";
                document.getElementById('divcd4p').style.display = "block";
                document.getElementById('divhb').style.display = "block";
                document.getElementById('divalt').style.display = "block";
                document.getElementById('divwbc').style.display = "block";
                document.getElementById('divcreat').style.display = "block";
                document.getElementById('divother').style.display = "block";
        }
        else {
        document.getElementById('divviral').style.display = "none";
                document.getElementById('divcd4').style.display = "none";
                document.getElementById('divcd4p').style.display = "none";
                document.getElementById('divhb').style.display = "none";
                document.getElementById('divalt').style.display = "none";
                document.getElementById('divwbc').style.display = "none";
                document.getElementById('divcreat').style.display = "none";
                document.getElementById('divvrl').style.display = "none";
                document.getElementById('divother').style.display = "none";
        }
        }

        }
        function showDivAutoLab(elem){
        if (elem.value == 'AU') {
        if (elem.checked) {
        document.getElementById('divviralX').style.display = "block";
                document.getElementById('divcd4X').style.display = "block";
                document.getElementById('divcd4pX').style.display = "block";
                document.getElementById('divhb').style.display = "block";
                document.getElementById('divalt').style.display = "block";
                document.getElementById('divwbc').style.display = "block";
                document.getElementById('divcreat').style.display = "block";
                document.getElementById('divother').style.display = "block";
        }
        else{
        document.getElementById('divviralX').style.display = "none";
                document.getElementById('divcd4X').style.display = "none";
                document.getElementById('divcd4pX').style.display = "none";
                document.getElementById('divhb').style.display = "none";
                document.getElementById('divalt').style.display = "none";
                document.getElementById('divwbc').style.display = "none";
                document.getElementById('divcreat').style.display = "none";
                document.getElementById('divvrl').style.display = "none";
                document.getElementById('divother').style.display = "none";
        }
        }

        }

        function validate(){

        var arvstatus = document.visitForm.slcOIARVStatus.value;
                var arvregimen = document.visitForm.slcOIARVRegmenCombination.value;
                var whostagging = document.visitForm.slcOIWhoClinicalStage.value;
                var prevarvstatus = document.visitForm.txtPrevARVStaus.value;
                var prevarvregimen = document.visitForm.txtPrevARVRegimen.value;
                var prevwhostagging = document.visitForm.txtPrevWHOStage.value;
                if (whostagging < prevwhostagging && whostagging != 0){
        alert("This patient previously had a higher WHO stage, therefore they cannot now have a lower WHO stage");
                document.getElementById('whostage').focus();
                return false;
        }

        if (prevarvstatus == 3){
        if (arvstatus != prevarvstatus && arvstatus != 4 || arvstatus != prevarvstatus && arvstatus != 5){

        if (arvstatus == 1){
        alert("The previouse status for this patient was continue ARV and therefore you should not enter status as No ARV");
                document.getElementById('arvstatus').focus();
                return false;
        }
        if (arvstatus == 2){
        alert("The previouse status for this patient was continue ARV and therefore you should not enter status as Start ARV");
                document.getElementById('arvstatus').focus(); return false;
        }

        if (arvstatus == 6){
        alert("The previouse status for this patient was continue ARV and therefore you should not enter status as Restart ARV");
                document.getElementById('arvstatus').focus();
                return false;
        }
        if (arvstatus == 7){
        alert("The previouse status for this patient was continue ARV and therefore you should not enter status as PMTCT Prohpylaxis");
                document.getElementById('arvstatus').focus();
                return false;
        }
        }
        if (prevarvstatus == arvstatus && arvregimen != prevarvregimen){


        alert("This patient was on a different regimen on their last visit than in this visit.Therefore it is not logical to choose 'Continue ARVs' rather it should be 'Change ARVs' Correct data now? ");
                document.getElementById('arvstatus').focus();
                return false;
        }

        }



        }
        function showValidateFluconazole(){

        var prescribed = document.visitForm.txtOIFlzQuantiyPrescribed.value;
                var dispensed = document.visitForm.txtOIFlzQuantiyDispensed.value;
                if (prescribed < dispensed){
        alert("The dispensed medicines cannot be greater than what was prescibed");
                document.getElementById('fluqd').focus();
                return false;
        }



        }

        function showValidateArv(){

        var prescribed = document.visitForm.txtOIARVQuantityPrescribed.value;
                var dispensed = document.visitForm.txtOIARVQuantityDispensed.value;
                if (prescribed < dispensed){
        alert("The dispensed medicines cannot be greater than what was prescibed");
                document.getElementById('arvqd').focus();
                return false;
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
