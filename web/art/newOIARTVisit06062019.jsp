<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>OI/ART Visit::ePMS</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>

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
                            New OI/ART Visit::You are about to fill visit for <a href="#" class="alert-link"><c:out value="${patient.firstName}" />  <c:out value="${patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${patient.patientId}" /></a>

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

                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="OIARTVisitServ" method="POST">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend> Consultation</legend>

                                    <div style="background-color: grey">
                                        <hr>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2" style="color: blue;"><b>DATE OF REVIEW :</b></div>
                                            <div class="col-lg-2">
                                                <input style="color: blue;" type="date" class="form-control" placeholder="review date" name="txtOIDateOfReview" >
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
                                                    <select name ="slcOIWhoClinicalStage" class="form-control" placeholder="select WHO stage" >

                                                        <option> </option>   
                                                        <option>1</option>  
                                                        <option>2</option>  
                                                        <option>3</option>  
                                                        <option>4</option> 
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

                                    <div style="background-color: grey">
                                        <div class="col-lg-12" style="color: red"><h3>COTRIMOXAZOLE :</h3></div>
                                        <div class="form-group" style="color: blue;" style="background-color: grey">
                                            <div class="col-lg-2" style="color: blue;"><b>Quantity Dispensed(Tablets or ml) :</b></div><div class="col-lg-4">
                                                <input style="color: blue;" type="number" class="form-control" placeholder="Quantiy dispenced" name="txtOICotriQuantiyDispensed" >
                                            </div>

                                            <div class="col-lg-2" style="color: blue;"><b> % Adherence:</b></div><div class="col-lg-4">
                                                <input  style="color: blue;" type="number" class="form-control" placeholder="% adherence" name="txtOICotriAdherence" max="100" min="0" >
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-lg-12" style="color: red"><h3>IPT :</h3></div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b> IPT Eligibility:</b></div>
                                        <div class="col-lg-4">
                                            <select name ="slcOIIPTEligibility" class="form-control" placeholder="select Eligibility" onchange="showDiv2(this)">

                                                <option> </option>   
                                                <option value="Yes">Yes </option>  
                                                <option value="No"> No</option>  
                                            </select>

                                        </div>

                                        <div id="div2a" style="display: none;">
                                            <div class="col-lg-2" style="color: blue;"><b> IPT STATUS:</b></div>
                                            <div class="col-lg-4">
                                                <select name="slcOIIPTStatus" class="form-control" onchange="showDiv4(this)">
                                                    <option> </option>
                                                    <c:forEach var="iptstat" items="${iptstatus}">
                                                        <option value="${iptstat.iptstatusCode}">${iptstat.iptstatusCodeDescription}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                        </div>
                                    </div>
                                    <div id="div2b" style="display: none;">
                                        <div id="div4" style="display: none;">
                                            <div class="form-group" style="color: blue;">
                                                <div class="col-lg-2" style="color: blue;"><b> REASON FOR NOT STARTING OR STOPPING IPT:</b></div><div class="col-lg-4">
                                                    <select name="slcOIReasonForNotIPT" class="form-control">
                                                        <option> </option>
                                                        <c:forEach var="iptreasoncode" items="${iptreasoncodes}">
                                                            <option value="${iptreasoncode.iptreasonCod}">${iptreasoncode.iptreason}</option>
                                                        </c:forEach>

                                                    </select>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2" ><b> QUANTITY DISPENSED TABLETS/ml:</b></div><div class="col-lg-4">
                                                <input style="color: blue;" type="number" class="form-control" placeholder="Tablets/ml" name="txtOIIPTQuantiyDispensed" >
                                            </div>
                                            <div class="col-lg-2" ><b> % ADHERENCE:</b></div><div class="col-lg-4">
                                                <input style="color: blue;" type="number" class="form-control" placeholder="% adherence" name="txtOIIPTAdherence" max="100" min="0">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="background-color: grey">

                                        <div class="col-lg-12" style="color: red;"><h3>FLUCONAZOLE :</h3></div>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2"><b> QUANTITY PRESCRIBED:</b></div><div class="col-lg-4">
                                                <input  type="number" class="form-control" placeholder="tablets/ml" name="txtOIFlzQuantiyPrescribed" >
                                            </div>

                                            <div class="col-lg-2"><b> QUANTITY DISPENSED:</b></div><div class="col-lg-4">
                                                <input  type="number" class="form-control" placeholder="tablets/ml" name="txtOIFlzQuantiyDispensed" >
                                            </div>
                                        </div><hr>
                                    </div>

                                    <div class="col-lg-12" style="color: red" align="left"  ><h3>ARV :</h3></div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" ><b> ARV STATUS:</b></div><div class="col-lg-4">
                                            <select name="slcOIARVStatus" class="form-control" onchange="showDiv3(this)">
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
                                        <div id="div3d" style="display: none;">
                                            <div class="col-lg-2"><b> ARV COMBINATION REGIMEN:</b></div>
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
                                            <div class="col-lg-2" ><b> QUANTITY PRESCRIBED:</b></div><div class="col-lg-2">
                                                <input  type="number" class="form-control" placeholder="tablets/ml" name="txtOIARVQuantityPrescribed" >
                                            </div>

                                            <div class="col-lg-2"><b> QUANTITY DISPENSED</b></div><div class="col-lg-2">
                                                <input  type="number" class="form-control" placeholder="tablets/ml" name="txtOIARVQuantityDispensed" >
                                            </div>
                                            <div id="div3g" style="display: none;">
                                                <div class="col-lg-2"><b> % ADHERENCE</b></div><div class="col-lg-2">
                                                    <input  type="number" class="form-control" placeholder="% adherence" name="txtOIARVAdherence" max="100" min="0">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-2" >
                                    <legend> Tests & Results</legend>
                                    <div style="background-color: grey">
                                        <hr>
                                        <div class="form-group" style="color: blue;">
                                            <label class="col-lg-2 control-label"><b>CD4 COUNT :</b></label>
                                            <div class="col-lg-4">
                                                <input  type="number" class="form-control" placeholder="cells/mm3" name="txtOICD4Count" >
                                            </div>
                                            <label class="col-lg-3 control-label" ><b>CD4 TEST DATE</b></label>
                                            <div class="col-lg-3">
                                                <input type="date"  class="form-control" placeholder="cd4 test date" name="txtOICD4TestDate">
                                            </div>
                                        </div>
                                        <div class="form-group" style="color: blue;">
                                            <label class="col-lg-2 control-label"><b>VIRAL LOAD</b></label>
                                            <div class="col-lg-4">
                                                <input  type="number" class="form-control" placeholder=" copies/ml" name="txtOIViralLoad" >
                                            </div>
                                            <label class="col-lg-3 control-label"><b>VIRAL LOAD TEST DATE :</b></label>
                                            <div class="col-lg-3">
                                                <input  type="date" class="form-control" placeholder="VL test date" name="txtOIViralLoadTestDate" >
                                            </div>
                                        </div>
                                        <div class="form-group" style="color: blue;">
                                            <label class="col-lg-2 control-label"><b>VIRAL LOAD RECEIVED AT FACILITY DATE</b></label>
                                            <div class="col-lg-4">
                                                <input  type="date" class="form-control" placeholder=" VL Received Date" name="txtOIVLReceivedAtFacility" >
                                            </div>
                                            <label class="col-lg-3 control-label"><b>VIRAL LOAD DATE CLIENT RECEIVED RESULTS :</b></label>
                                            <div class="col-lg-3">
                                                <input  type="date" class="form-control" placeholder="VL Date Given to Client" name="txtOIVLDateRecievedByClient" >
                                            </div>
                                        </div>
                                        <div class="form-group"style="color: blue;">
                                            <label class="col-lg-2 control-label"><b>ALT:</b></label>
                                            <div class="col-lg-4">
                                                <input  type="text" class="form-control" placeholder="mmol/L" name="txtOIATL">
                                            </div>
                                            <label class="col-lg-3 control-label"><b>CREATININE :</b></label>
                                            <div class="col-lg-3">
                                                <input  type="text" class="form-control" placeholder="creatinine" name="txtOICreatinine">
                                            </div>
                                        </div>
                                        <div class="form-group" style="color: blue;">
                                            <label class="col-lg-2 control-label"><b>OTHER DIAGNOSIS:</b></label>
                                            <div class="col-lg-4">
                                                <input  type="text" class="form-control" placeholder=" other diagnosis" name="txtOIOtherDiagnosis">
                                            </div>

                                        </div><hr>
                                    </div>

                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend> Followup & Outcome </legend>
                                    <div style="background-color: grey">
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
                                            <label class="col-lg-2 control-label"><b>Visit status:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcOIVisitStatus" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="visitstat" items="${visitstatus}">
                                                        <option value="${visitstat.visitstatuscode}">${visitstat.visitstatusdescription}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <<br><br>
                                            <label class="col-lg-2 control-label"><b>Follow up Status:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcFollowUpStatus" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="followupstat" items="${followupstatus}">
                                                        <option value="${followupstat.statusCode}">${followupstat.status}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Name of clinician:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcClinician" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="clinician" items="${clinicians}">
                                                        <option value="${clinician.staffId}">${clinician.staffSurname}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                            <br><br>
                                            <label class="col-lg-2 control-label"><b>Name of pharmacy Dispenser:</b></label>
                                            <div class="col-lg-4">
                                                <select name="slcPharmacyDispenser" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="dispenser" items="${dispensers}">
                                                        <option value="${dispenser.dispenserId}">${dispenser.dispenserSurname}</option>
                                                    </c:forEach>

                                                </select>

                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <input type="submit" class="finish btn btn-danger"  value="Finish"/>
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
        if (elem.value == 'Yes') {
        document.getElementById('div2a').style.display = "block";
                document.getElementById('div2b').style.display = "block";
        } else if (elem.value == 'No') {
        document.getElementById('div2a').style.display = "none";
                document.getElementById('div2b').style.display = "none";
        } else {
        document.getElementById('div2a').style.display = "none";
                document.getElementById('div2b').style.display = "none";
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
        document.getElementById('div4').style.display = "block";
        } else if (elem.value == 'IS') {
        document.getElementById('div4').style.display = "block";
        } 
        
        else {
        document.getElementById('div4').style.display = "none";
        }
        }
        function showDiv5(elem) {
        if (elem.value == 'P') {
        document.getElementById('visitVal1').style.display = "block";
        } else if (elem.value == 'D') {

        document.getElementById('visitVal1').style.display = "none";
        }

        else if (elem.value == 'E'){
        document.getElementById('visitVal1').style.display = "none";
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
        }

        else{
        document.getElementById('visitclinical').style.display = "none";
                document.getElementById('visitrefill').style.display = "none";
        }
        }
    </script>
</body>

</html>
