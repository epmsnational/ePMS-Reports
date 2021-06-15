<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>New VMMC Client</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">
                <section class="content-header">
                    <h1>
                        VMMC Data Capturing
                    </h1>
                </section>
                
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        You are about to fill new Client Form for Demographic Data <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            Registration Details
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                Register New VMMC Client
                            </div>
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
                            <form class="form-horizontal" id="default" action="VmmcPatient" method="post">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend></legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">VMMC Number :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="enter vmmc number" name="txtvmmcNum" value="<c:out value="${vmmcnum}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Registration Date:</label>
                                        <div class="col-lg-4">
                                            <input type="date" class="form-control" placeholder="Date of registration" name="txtRegDate"required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">First Name</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" name" name="txtName" value="<c:out value="${Patient.firstName}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Surname :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="surname" name="txtSurname" value="<c:out value="${Patient.lastName}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" national id" name="txtNatId" value="<c:out value="${Patient.nationalId}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="date of birth" name="txtDob" value="<c:out value="${Patient.dob}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Age </label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="age" name="txtAge" value="<c:out value="${Patient.age}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Gender</label>
                                        <div class="col-lg-4">
                                            <select readonly="readonly" disabled name="txtGender" class="form-control">
                                                <option>Male</option>
                                                <option>Female</option>                                                  
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Marital Status</label>
                                        <div class="col-lg-4">
                                            <select readonly="readonly" disabled name="txtMarital" class="form-control">
                                                <option>Single</option>
                                                <option>Married</option> 
                                                <option>Divorced</option>
                                                <option>Widowed</option>
                                            </select>
                                        </div>
                                    </div>   
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Orphan Status</label>
                                        <div class="col-lg-4">
                                            <select readonly="readonly" disabled name="slctOrphan" class="form-control">
                                                <option>Single</option>
                                                <option>Double</option>                                                  
                                                <option>N/A</option>                                                  
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Educational Level</label>
                                        <div class="col-lg-4">
                                            <select readonly="readonly" disabled name="slctEducation" class="form-control">
                                                <option>None</option>                                                  
                                                <option>Primary</option>                                                 
                                                <option>Secondary</option>  
                                                <option>Tertiary</option>
                                            </select>
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend></legend>
                                    <div class="col-sm-12">
                                        <div class="form-group col-sm-6">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">How did client learn about the service? (Tick all that apply)</label>
                                                <c:forEach items="${vmmcServices}" var="vmmcservices">
                                                    <label>
                                                        <input type="checkbox" id="ckServices" name="ckvmmcServices" value="${vmmcservices.id}"> ${vmmcservices.vmmcserviceName}
                                                    </label>
                                                </c:forEach>
                                                <label for="txtSpecifyService">Others specify:</label><input type="text" class="form-control" placeholder="service" name="txtSpecifyService">
                                            </div>
                                        </div> 
                                        <div class="form-group col-sm-6">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Referred from (Tick all that apply)</label>
                                                <c:forEach items="${ReferredFroms}" var="refferals">
                                                    <label>
                                                        <input type="checkbox" id="ckRefferals" name="ckRefferals" value="${refferals.id}"> ${refferals.referredFromName}
                                                    </label>
                                                </c:forEach>
                                                <label class="control-label">Others specify:</label> <input type="text" class="form-control" placeholder="specify" name="txtSpecifyReferral">
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-2">
                                    <legend></legend>
                                    <div class="col-sm-12">                                        
                                        <div class="form-group col-sm-6">
                                            <table cellpadding="2">
                                                <tr>
                                                    <td style="width: 50%;">
                                                        <label> Has Client been tested for HIV before?</label>
                                                    </td>
                                                    <td colspan="2">
                                                        Yes<input type="radio" name="rdIsTested" id="optYes" value="Yes" onchange="showDiv2(this)">
                                                        No<input type="radio" name="rdIsTested" id="optNo" value="No" onchange="showDiv2(this)"> 
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div id ="part2" style="display: none;"><label> If Yes, when?</label></div>
                                                    </td>
                                                    <td><div id ="part2a" style="display: none;"> -Recently, less than one month ago</div></td>
                                                    <td>
                                                        <div id ="part2b" style="display: none;">
                                                            <select id="lessthanoneM" class="form-control" name="txtHIVTestOne" onchange="showDiv9(this)">
                                                                <option value="Yes">No</option >
                                                                <option value="No">Yes</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part3" style="display: none;"><label> </label></div></td>
                                                    <td><div id ="part3a" style="display: none;"> -Between 1 month and 3 months ago</div></td>
                                                    <td>
                                                        <div id ="part3b" style="display: none;">
                                                            <select id = "btwn1n3M"class="form-control" name="txtHIVTestOneThree" onchange="showDiv10(this)">
                                                               <option > </option>
                                                                <option value="No">No</option>
                                                                <option value="Yes">Yes</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part4" style="display: none;"><label> </label></div></td>
                                                    <td><div id ="part4a" style="display: none;"> -More than 3 months ago</div></td>
                                                    <td>
                                                        <div id ="part4b" style="display: none;">
                                                            <select id = "morethan3M"class="form-control" name="txtHIVTestThreeMore" onchange="showDiv11(this)">
                                                                <option value="No">No</option>
                                                                <option value="Yes">Yes</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part5" style="display: none;"><label> </label></div></td>
                                                    <td><div id ="part5a" style="display: none;"> -Other, indicate </div></td>
                                                    <td>
                                                        <div id ="part5b" style="display: none;">
                                                            <input type="text" class="form-control" name="txtHIVTestSpecify">
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part6" style="display: none;"><label> If tested before, What was the result:</label></div></td>
                                                    <td colspan="2">
                                                        <div id ="part6a" style="display: none;">
                                                            <select class="form-control" name="txtTestedResult">
                                                                <option value="Pos">Pos</option>
                                                                <option value="Neg">Neg</option>
                                                                <option value="Unk">Unk</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part7" style="display: none;"><label>If tested before, provide Referral Form/ Proof of test</label></div></td>
                                                    <td  colspan="2">
                                                        <div id ="part7a" style="display: none;">
                                                            <select class="form-control" name="txtHIVTestedProof">
                                                                <option value="No">No</option>
                                                                <option value="Yes">Yes</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><label>HIV test done for VMMC </label></td>
                                                    <td colspan="2">
                                                        <select class="form-control" name="txtHIVTestedVMMC" >
                                                            <option value="No">No</option >
                                                            <option value="Yes">Yes</option>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><label>HIV test result:</label></td>
                                                    <td colspan="2">

                                                        <select id ="testresults" class="form-control" name="txtHIVTestedVMMCResult" onchange="showDiv(this)">
                                                            <option value="Pos">Pos</option>
                                                            <option value="Neg">Neg</option>
                                                            <option value="Unk">Unk</option>
                                                        </select>

                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part12" style="display: none;"> <label>If HIV test positive: WHO clinical stage</label></div></td>
                                                    <td colspan="2"><div id ="part12a" style="display: none;">
                                                            <select class="form-control" name="txtHIVTestedWHO">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id ="part13" style="display: none;"><label>If HIV test positive: CD4 cell count, if known</label></div></td>
                                                    <td colspan="2">
                                                        <div id ="part13a" style="display: none;">
                                                            <input type="text" class="form-control" name="txtHIVTestedCD4" />
                                                        </div>
                                                    </td>
                                                </tr>
                                            </table>
                                        </div>
                                        <div class="form-group col-sm-6" style="text-align: left; padding-left: 10%;">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Primary reason for circumcision (Tick all that apply)</label>
                                                <c:forEach items="${CircumcisionReasons}" var="circumcisionreasons">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckCircumcisionReasons[]" name="ckCircumcisionReasons" value="${circumcisionreasons.id}"> ${circumcisionreasons.circumcisionReasonName} 
                                                    </label> 
                                                </c:forEach>                                                
                                            </div> 
                                            <label>Others specify:</label> <input type="text" class="form-control" name="txtSpecifyCircumcisionReason">
                                        </div>                                        
                                    </div>
                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend></legend>
                                    <div class="col-sm-12">
                                        <div class="form-group col-sm-6">
                                            <table>
                                                <th colspan="2">Vital Signs</th>
                                                <tr>
                                                    <td colspan="2">
                                                        <input type="text" class="form-control" placeholder="Weight (kg)" name="txtVitalWeight"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td colspan="2">
                                                        <input type="text" class="form-control" placeholder="Temperature" name="txtVitalTemp"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td colspan="2">
                                                        <input type="text" class="form-control" placeholder="Blood Pressure (mm/Hg)" name="txtVitalBP"/>
                                                    </td>
                                                </tr>
                                                <td colspan="2">
                                                    <input type="text" class="form-control" placeholder="Pulse (b/min)" name="txtVitalPulse">
                                                </td>
                                                </tr>
                                                <tr>
                                                    <td>Any known allergies</td>
                                                    <td>
                                                        <select id =" allergies" class="form-control" name="txtAnyAllergies" onchange="showDiv4(this)">
                                                            <option value="No">No</option>
                                                            <option value="Yes">Yes</option>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id="part8" style = "Display : none;">specify allergies </div></td>
                                                    <td>
                                                        <div id="part8a" style = "Display : none;">
                                                            <input type="text" class="form-control" name="txtSpecifyAllergies" />  </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>Are you currently taking any medications?</td>
                                                    <td>
                                                        <select id="anymedication"class="form-control" name="txtAnyMedications" onchange="showDiv5(this)">
                                                            <option value="No">No</option>
                                                            <option value="Yes">Yes</option>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id="part9" style = "Display : none;">specify medication</div></td>
                                                    <td>
                                                        <div id="part9a" style = "Display : none;">
                                                            <input type="text" class="form-control" name="txtSpecifyMedications" /> 
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>Have you ever had an operation?</td>
                                                    <td>
                                                        <select id ="anyoperation" class="form-control" name="txtAnyOperations" onchange="showDiv6(this)">
                                                            <option value="No">No</option>
                                                            <option value="Yes">Yes</option>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id="part10" style = "Display : none;">specify operation</div></td>
                                                    <td>
                                                        <div id="part10a" style = "Display : none;">
                                                            <input type="text" class="form-control" name="txtSpecifyOperations" /> 
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>Family history of abnormal bleeding/ known clotting disorder</td>
                                                    <td>
                                                        <select id="anyfamilyabnormal" class="form-control" name="txtAbnormalBleeding" onchange="showDiv7(this)">
                                                            <option value="No">No</option>
                                                            <option value="Yes">Yes</option>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id="part11" style = "Display : none;">specify abnormal</div></td>
                                                    <td>
                                                        <div id="part11a" style = "Display : none;">
                                                            <input type="text" class="form-control" name="txtSpecifyAbnormalBleeding" />  
                                                        </div>
                                                    </td>
                                                </tr>
                                            </table>
                                        </div>
                                        <div class="form-group col-sm-6" style="padding-left: 10%;">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Have you ever been diagnosed with any of the following? (Tick all that apply)</label>
                                                <c:forEach items="${Diagnoses}" var="diagnosis">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckDiagnoses[]" name="ckVmmcDiagnoses" value="${diagnosis.id}"> ${diagnosis.diagnosisName} 
                                                    </label> 
                                                </c:forEach>
                                                <label>Others specify:</label> <input type="text" class="form-control" name="txtSpecifyDiagnosis">
                                            </div>  
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 5" class="step" id="default-step-4" >
                                    <legend></legend>
                                    <div class="col-sm-12">
                                        <div class="col-sm-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">General Condition:</label>
                                                <c:forEach items="${GeneralConditions}" var="generalcondition">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckGeneralConditions[]" name="ckGeneralConditions" value="${generalcondition.id}"> ${generalcondition.generalConditionName} 
                                                    </label> 
                                                </c:forEach>
                                                <label>Others specify:</label> <input type="text" class="form-control" name="txtSpecifyGeneralConditions">
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Do you have any of the following complaints:</label>
                                                <c:forEach items="${Complains}" var="complain">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckComplains[]" name="ckComplains" value="${complain.id}"> ${complain.complaintName} 
                                                    </label> 
                                                </c:forEach>
                                                <label>Others specify:</label> <input type="text" class="form-control" name="txtSpecifyComplains">
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Genital Exam: Any of the following</label>
                                                <c:forEach items="${GenitalExamples}" var="genitalexample">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckGenitalExamples[]" name="ckGenitalExamples" value="${genitalexample.id}"> ${genitalexample.genitalExamName} 
                                                    </label> 
                                                </c:forEach>
                                                <label>Others specify:</label> <input type="text" class="form-control" name="txtSpecifyGenitalExamples">
                                            </div>  
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 6" class="step" id="default-step-5">
                                    <legend></legend>
                                    <div class="form-group col-sm-12">
                                        <table style="width: 100%;">
                                            <tr>
                                                <td colspan="4" style="text-align: left;"><label>For adults ages 18 and over:</label></td>
                                            </tr>
                                            <tr>
                                                <td>Informed Consent Granted</td>
                                                <td> 
                                                    Yes<input type="radio" name="rdInformedConsent" id ="1yes" value="Yes" onchange="showDiv3(this)">
                                                    No<input type="radio" name="rdInformedConsent" id ="1no" value="No" onchange="showDiv3(this)"> 
                                                </td>
                                                <td><div id ="part14" style="display: none;">Clinician's Initials</div></td>
                                                <td>
                                                    <div id ="part14a" style="display: none;"><select class="form-control">
                                                            <option>1</option>
                                                            <option>2</option>
                                                            <option>3</option>
                                                            <option>4</option>
                                                        </select>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="4"><label>For minors under age 18:</label></td>
                                            </tr>
                                            <tr>
                                                <td><div id ="par1" >Parental/ guardian signature</div></td>
                                                <td> <div id ="par1a" >
                                                        Yes<input type="radio" name="rdParentalSign" id = "2yes"value="Yes" onchange="showDiv8(this)">
                                                        No<input type="radio" name="rdParentalSign" id = "2no"value="No" onchange="showDiv8(this)"> 
                                                    </div>
                                                </td>
                                                <td><div id ="part15" style="display: none;">Clinician's Initials</div></td>
                                                <td>
                                                    <div id ="part15a" style="display: none;">
                                                        <select class="form-control">
                                                            <option>1</option>
                                                            <option>2</option>
                                                            <option>3</option>
                                                            <option>4</option>
                                                        </select>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="4"><div id ="part16" style="display: none;"><label>How was verification of consent with parent obtained?</label></div></td>
                                            </tr>
                                            <tr>

                                                <td colspan="2">
                                                    <div id ="part16a" style="display: none;">
                                                        <input type="checkbox" name="ckConsentObt" value ="Telephone">Telephone                                                        
                                                        <input type="checkbox" name="ckConsentObt "value = "Visit">Visit
                                                        <input type="checkbox" name="ckConsentObt" value = "Mail">Mail
                                                        <label>Other (Specify) :</label>
                                                        <input type="text" class="form-control" placeholder=" " name="txtConsentObtSpecify">
                                                    </div>
                                                </td>
                                                <td style="font-size: medium">Clinician' Initials</td>
                                                <td>
                                                    <select class="form-control">
                                                        <option>1</option>
                                                        <option>2</option>
                                                        <option>3</option>
                                                        <option>4</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="4"><label>Client is eligible for which circumcision method (Tick all applicable)</label></td>
                                            </tr>
                                            <tr>
                                                <td colspan="4">                                                       
                                                    <input type="checkbox" name="ckEligible" value="Surgical">Surgical circumcision
                                                    <input type="checkbox" name="ckEligible" value="Prepex">PrePex circumcision
                                                    <label>Other (Specify) :</label>
                                                    <input type="text" class="form-control" placeholder=" " name="txtEligibleSpecify">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="4"><label>Of the appropriate methods, the circumcision method chosen by client</label></td>
                                            </tr>
                                            <tr>
                                                <td colspan="4">
                                                    <input type="radio" name="rdChosenMethod" id = "2yes"value="Surgical">Surgical circumcision
                                                    <input type="radio" name="rdChosenMethod" id = "2no"value="Prepex">PrePex circumcision

                                                    <label>Other (Specify) :</label>
                                                    <input type="text" class="form-control" placeholder="Other" name="txtChosenSpecify">
                                                </td>
                                            </tr>
                                            <tr><td>Diagnosis Note::&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
                                            <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="txtDiagnosisNote" rows="8" cols="30" ></textarea></td></tr>
    </table>
                                        </table>  
                                    </div>
                                </fieldset>
                                <input type="submit" class="finish btn btn-danger" value="Finish"/>
                            </form>
                        </div>
                    </section>
                </section>
            </section>
        </section>
    </section>
    <%@include file="../footer.jsp" %>
    <%@include file="/vmmcwizardjs.jsp" %>
    <%@include file="../footer.jsp" %>



    <!--script for this page-->



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
        });
    </script>
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
        });
    </script>
   
    <script type="text/javascript">
        jQuery(document).ready(function () {

        });
    </script>
    <script language="Javascript" type="text/javascript">
        function showDiv(elem) {
            if (elem.value == 'Pos') {
                document.getElementById('part12').style.display = "block";
                document.getElementById('part12a').style.display = "block";

                document.getElementById('part13').style.display = "block";
                document.getElementById('part13a').style.display = "block";
            }
            else if (elem.value == 'Neg') {
                document.getElementById('part12').style.display = "none";
                document.getElementById('part12a').style.display = "none";

                document.getElementById('part13').style.display = "none";
                document.getElementById('part13a').style.display = "none";
            }
            else {
                document.getElementById('part12').style.display = "none";
                document.getElementById('part12a').style.display = "none";

                document.getElementById('part13').style.display = "none";
                document.getElementById('part13a').style.display = "none";
            }
        }
        function showDiv3(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part14').style.display = "block";
                document.getElementById('part14a').style.display = "block";
                document.getElementById('par1').style.display = "none";
                document.getElementById('par1a').style.display = "none";
            } else {
                document.getElementById('part14').style.display = "none";
                document.getElementById('part14a').style.display = "none";

            }
        }

        function showDiv2(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part2').style.display = "block";
                document.getElementById('part2a').style.display = "block";
                document.getElementById('part2b').style.display = "block";

                document.getElementById('part3').style.display = "block";
                document.getElementById('part3a').style.display = "block";
                document.getElementById('part3b').style.display = "block";

                document.getElementById('part4').style.display = "block";
                document.getElementById('part4a').style.display = "block";
                document.getElementById('part4b').style.display = "block";

                document.getElementById('part5').style.display = "block";
                document.getElementById('part5a').style.display = "block";
                document.getElementById('part5b').style.display = "block";

                document.getElementById('part6').style.display = "block";
                document.getElementById('part6a').style.display = "block";
                document.getElementById('part7').style.display = "block";
                document.getElementById('part7a').style.display = "block";
            } else {
                document.getElementById('part2').style.display = "none";
                document.getElementById('part2a').style.display = "none";
                document.getElementById('part2b').style.display = "none";

                document.getElementById('part3').style.display = "none";
                document.getElementById('part3a').style.display = "none";
                document.getElementById('part3b').style.display = "none";

                document.getElementById('part4').style.display = "none";
                document.getElementById('part4a').style.display = "none";
                document.getElementById('part4b').style.display = "none";

                document.getElementById('part5').style.display = "none";
                document.getElementById('part5a').style.display = "none";
                document.getElementById('part5b').style.display = "none";

                document.getElementById('part6').style.display = "none";
                document.getElementById('part6a').style.display = "none";
                document.getElementById('part7').style.display = "none";
                document.getElementById('part7a').style.display = "none";
            }
        }

        function showDiv4(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part8').style.display = "block";
                document.getElementById('part8a').style.display = "block";
            } else {
                document.getElementById('part8').style.display = "none";
                document.getElementById('part8a').style.display = "none";
            }
        }
        function showDiv5(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part9').style.display = "block";
                document.getElementById('part9a').style.display = "block";
            } else {
                document.getElementById('part9').style.display = "none";
                document.getElementById('part9a').style.display = "none";
            }
        }

        function showDiv6(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part10').style.display = "block";
                document.getElementById('part10a').style.display = "block";
            } else {
                document.getElementById('part10').style.display = "none";
                document.getElementById('part10a').style.display = "none";
            }
        }

        function showDiv7(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part11').style.display = "block";
                document.getElementById('part11a').style.display = "block";
            } else {
                document.getElementById('part11').style.display = "none";
                document.getElementById('part11a').style.display = "none";
            }
        }

        function showDiv8(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part15').style.display = "block";
                document.getElementById('part15a').style.display = "block";
                document.getElementById('part16').style.display = "block";
                document.getElementById('part16a').style.display = "block";
            } else {
                document.getElementById('part15').style.display = "none";
                document.getElementById('part15a').style.display = "none";
                document.getElementById('part16').style.display = "none";
                document.getElementById('part16a').style.display = "none";
            }
        }

        function showDiv9(elem) {
            if (elem.value == 'No') {
                document.getElementById('part3').style.display = "none";
                document.getElementById('part3a').style.display = "none";
                document.getElementById('part3b').style.display = "none";

                document.getElementById('part4').style.display = "none";
                document.getElementById('part4a').style.display = "none";
                document.getElementById('part4b').style.display = "none";

                document.getElementById('part5').style.display = "none";
                document.getElementById('part5a').style.display = "none";
                document.getElementById('part5b').style.display = "none";
            }
            else
            {
                document.getElementById('part3').style.display = "block";
                document.getElementById('part3a').style.display = "block";
                document.getElementById('part3b').style.display = "block";

                document.getElementById('part4').style.display = "block";
                document.getElementById('part4a').style.display = "block";
                document.getElementById('part4b').style.display = "block";

                document.getElementById('part5').style.display = "block";
                document.getElementById('part5a').style.display = "block";
                document.getElementById('part5b').style.display = "block";
            }
        }

        function showDiv10(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part2').style.display = "none";
                document.getElementById('part2a').style.display = "none";
                document.getElementById('part2b').style.display = "none";

                document.getElementById('part4').style.display = "none";
                document.getElementById('part4a').style.display = "none";
                document.getElementById('part4b').style.display = "none";

                document.getElementById('part5').style.display = "none";
                document.getElementById('part5a').style.display = "none";
                document.getElementById('part5b').style.display = "none";
            }
            else
            {
                document.getElementById('part2').style.display = "block";
                document.getElementById('part2a').style.display = "block";
                document.getElementById('part2b').style.display = "block";

                document.getElementById('part4').style.display = "block";
                document.getElementById('part4a').style.display = "block";
                document.getElementById('part4b').style.display = "block";

                document.getElementById('part5').style.display = "block";
                document.getElementById('part5a').style.display = "block";
                document.getElementById('part5b').style.display = "block";
            }
        }

        function showDiv11(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('part2').style.display = "none";
                document.getElementById('part2a').style.display = "none";
                document.getElementById('part2b').style.display = "none";

                document.getElementById('part3').style.display = "none";
                document.getElementById('part3a').style.display = "none";
                document.getElementById('part3b').style.display = "none";

                document.getElementById('part5').style.display = "none";
                document.getElementById('part5a').style.display = "none";
                document.getElementById('part5b').style.display = "none";
            }
            else
            {
                document.getElementById('part2').style.display = "block";
                document.getElementById('part2a').style.display = "block";
                document.getElementById('part2b').style.display = "block";

                document.getElementById('part3').style.display = "block";
                document.getElementById('part3a').style.display = "block";
                document.getElementById('part3b').style.display = "block";

                document.getElementById('part5').style.display = "block";
                document.getElementById('part5a').style.display = "block";
                document.getElementById('part5b').style.display = "block";
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
