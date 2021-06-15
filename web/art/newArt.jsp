<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>ART Client</title>
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
                        ART Data Capturing
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
                                        You are about to fill ART section A and B information <a href="#" class="alert-link"><c:out value="${patient.firstName}" />  <c:out value="${patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${patient.opdnumber}" /><c:out value="${oiNum}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            OI/ART MODULE
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                SECTION A
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
                                    <li id="default-title-5" class="">
                                        <div>Step 7</div>
                                    </li>
                                </ul>
                            </div>
                            <% String oiNum=(String)request.getSession().getAttribute("oinumber");%>
                            <form class="form-horizontal" id="default" action="ARTPatient" method="post">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend>Demographics</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">OI/ART Number :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control"  name="txtARTNum" placeholder="ATR Number was generated">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color:blue">Date Enrolled into HIV care:</label>
                                        <div class="col-lg-4">
                                            <input type="date" required="required" class="form-control" placeholder="Date enrolled into care" name="txtDateEnrolled">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">First Name</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtOIName" value="<c:out value="${patient.firstName}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Surname :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtOISurname" value="<c:out value="${patient.lastName}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtOINationalId" value="<c:out value="${patient.nationalId}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtDob" value="<c:out value="${patient.dob}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Age </label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtAge" value="<c:out value="${patient.age}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Gender</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtGender" value="<c:out value="${patient.sex}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Marital Status </label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" name="txtMaritalStatus" value="<c:out value="${patient.maritalStatus}"/>">
                                        </div>
                                    </div>  
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color:blue">Orphan Status</label>
                                        <div class="col-lg-4">

                                            <select name="slctOrphan" class="form-control">
                                                <option> </option>
                                                <c:forEach var="ophanstatus" items="${ophanstatuses}">
                                                    <option value="${ophanstatus.orphanStatusId}">${ophanstatus.orphanStatus}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Educational Level</label>
                                        <div class="col-lg-4">
                                            <input type="text" readonly="readonly" disabled name="slctEducation" class="form-control" value="<c:out value="${patient.educationalLevel}"/>">

                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend>Status Tracing</legend>
                                    <div class="col-sm-12">
                                        <div class="form-group col-sm-6">
                                            <table>
                                                <th style="color: red">1. Personal tracing</th>
                                                <tr><td>Fullname:<input type="text" class="form-control" name="txtOIPersonalTracingFullname"></td></tr>
                                                <tr><td>Date:<input type="date" class="form-control" name="txtOIPersonalTracingDate"></td></tr>
                                                <tr><td></td></tr>
                                                <th style="color: red">2. Index-case Testing followup</th>
                                                <tr><td>Fullname:<input type="text" class="form-control" name="txtOIIndexTestingFullname"></td></tr>
                                                <tr><td>Date:<input type="date" class="form-control" name="txtOIIndexTestingdate"></td></tr>
                                                <tr><td></td></tr>
                                            </table>

                                        </div> 
                                        <div class="form-group col-sm-6">

                                            <table>
                                                <th>1. Disclosure of HIV Status</th>
                                                <tr><td><input type="radio" name="rdIsOIDisclosed" id="optDisclosureYes" value="Yes" onchange="showDiv(this)">Yes&nbsp;<input type="radio" name="rdIsOIDisclosed" id="optDisclosureYes" value="No" onchange="showDiv(this)">No</td><td></td></tr>
                                                <tr><td></td></tr>

                                                <th><div id ="part1" style="display: none;">2. If yes to whom?(State relation)</div></th>
                                                <tr><td><div id ="part2" style="display: none;">Fullname:<input type="text" class="form-control" name="txtOIStatusDisclosureFullname"></div></td></tr>

                                                <tr><td></td></tr>

                                                <th><div id ="part3" style="display: none;">3. If No in (2)above state the reason for none-disclosure</div></th>
                                                <tr><td><div id ="part4" style="display: none;">Reason for None disclosure<input type="text" class="form-control" name="txtOINoneDisclosureReason"></div></td></tr>

                                                <tr><td></td></tr>
                                                <th><div id ="part5" style="display: none;">4. State date of disclosure</div></th>
                                                <tr><td><div id ="part6" style="display: none;">Disclosure Date:<input type="date" class="form-control" name="txtOIFinalDisclosureDate"></div></td></tr>
                                                <tr><td><div id ="part7" style="display: none;">To whom?<input type="text" class="form-control" name="txtOIStatusDisclosureFullname"></div></td></tr>
                                                <tr><td><div id ="part8" style="display: none;">State Relation<input type="text" class="form-control" name="txtOIStatusDisclosureRelation"></div></td></tr>

                                                <tr><td></td></tr>
                                            </table>
                                        </div> 

                                    </div>
                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-2">
                                    <legend>Linkages</legend>
                                    <div class="col-sm-12">  
                                        
                                        <div class="form-group col-sm-2">
                                         <div><input type="radio" name="rdIsOINew" id="optNewClient" value="NewClient" onchange="showDiv(this)">Yes&nbsp;<input type="radio" name="rdIsOINew" id="optNewClient" value="TranferIn" onchange="showDiv(this)">Transfer In</div>
                                        </div>
                                        <div class="form-group col-sm-6">
                                            <table cellpadding="2">


                                                <tr>
                                                    <td><label>Linkage from(if number is not available name of referring institution must be written) </label></td>
                                                </tr><tr>
                                                    <td colspan="2">
                                                        <select class="form-control" id="linkagefrom" name="slcOILinkageFrom" onchange="showDiv1(this)">
                                                            <option> </option>
                                                            <option value="eid">EID</option >
                                                            <option value="hts">HTS</option>
                                                            <option value="pmtct">PMTCT</option >
                                                            <option value="sti">STI</option>
                                                            <option value="tb">TB Program</option >
                                                            <option value="vmmc">VMMC</option>
                                                            <option value="other">Other</option>
                                                        </select>
                                                    </td>

                                                </tr>



                                            </table>
                                        </div>
                                        <div class="form-group col-sm-6" style="text-align: left; padding-left: 10%;">

                                            <div id ="div1a" style="display: none;"> <label>EID</label> <input type="text" class="form-control" name="txtOIEIDNumber"></div>
                                            <div id ="div1b" style="display: none;"> <label>HTS</label> <input type="text" class="form-control" name="txtOIHTSNumber"></div>
                                            <div id ="div1c" style="display: none;"><label>PMTCT</label> <input type="text" class="form-control" name="txtOIPMTCTNumber"></div>
                                            <div id ="div1d" style="display: none;"><label>STI</label> <input type="text" class="form-control" name="txtOISTINumber"></div>
                                            <div id ="div1e" style="display: none;"><label>TB PROGRAM</label> <input type="text" class="form-control" name="txtOITBNumber"></div>
                                            <div id ="div1f" style="display: none;"><label>VMMC</label> <input type="text" class="form-control" name="txtOIVMMCNumber"></div>
                                            <div id ="div1g" style="display: none;"><label>OTHER</label> <input type="text" class="form-control" name="txtOIOtherProgNum"></div>

                                        </div>                                        
                                    </div>
                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend>Confirmatory test</legend>
                                    <div class="col-sm-12">
                                        <div class="form-group col-sm-6">
                                            <table>
                                                <th colspan="2">Testing</th>
                                                <tr>
                                                    <td>Date of first confirmed HIV Test</td>
                                                    <td colspan="2">
                                                        <input type="date" class="form-control" placeholder="1st HIV test Date" name="txtOIDateFirstConfirmedHIVPos"/>
                                                    </td>
                                                </tr>
                                                <tr><td><label></label></td></tr>
                                                <tr>
                                                    <td>Name of institution(add VCT/PMTCT number if available)</td>
                                                    <td colspan="2">
                                                        <input type="text" class="form-control" placeholder="instutution" name="txtOIInstitution"/>
                                                    </td>
                                                </tr>
                                                <tr><td></td></tr>
                                                <tr>
                                                    <td>HIV Test Used</td>
                                                    <td colspan="2">
                                                        <input type="radio" name="rdOITestUsed" id="optAB" value="A">Antibody&nbsp;<input type="radio" name="rdOITestUsed" id="optAB" value="P">P.C.R

                                                    </td>
                                                </tr>

                                                <tr><td></td></tr>
                                                <tr>
                                                    <td>Reasons for HIV Test when first confirmed HIV Positive(tick the appropriate)</td>

                                                    <td><div class="checkbox">                                                                                
                                                            <label style="color: red; text-align: center;">Reasons for Test :</label>
                                                            <c:forEach items="${hivtestreasons}" var="hivtestreason">
                                                                <label>                                                       
                                                                    <input type="checkbox" id="ckHivtestreasons[]" name="chkOIReasonsTest" value="${hivtestreason.hivtestReasonId}" onchange="showDiv12(this)"> ${hivtestreason.hivtestReason} 
                                                                </label> 
                                                            </c:forEach>

                                                            <div id ="div12" style="display: none;"> <input type="text" class="form-control" name="txtOISpecifyOtherReasonsTest"></div>
                                                        </div></td></tr>

                                                <tr>
                                                    <td><label></label></td>

                                                </tr>
                                                <tr>
                                                    <td>Is Patient on ART?</td>
                                                    <td>
                                                        <select id="isPatientOnART" class="form-control" name="slcOIIsOnART" onchange="showDiv2(this)">
                                                            <option> </option>
                                                            <option value="No">No</option>
                                                            <option value="Yes">Yes</option>
                                                        </select>
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <td><div id="div2a" style = "Display : none;">Re-tested for ART initiation?</div></td>
                                                    <td><div id="div2b" style = "Display : none;">
                                                            <select id ="RetestedForARTInitiation" class="form-control" name="slcOIRetestedForARTInitiation" onchange="showDiv3(this)">
                                                                <option> </option>
                                                                <option value="No">No</option>
                                                                <option value="Yes">Yes</option>
                                                            </select>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><div id="div3a" style = "Display : none;">Date of HIV Re-test</td>
                                                    <td colspan="2">
                                                        <div id="div3b" style = "Display : none;">
                                                            <input type="date" class="form-control" placeholder="HIV re-test date" name="txtOIHIVRetestDate"/>
                                                        </div></td>
                                                </tr>



                                            </table>
                                        </div>

                                    </div>
                                </fieldset>
                                <fieldset title="Step 5" class="step" id="default-step-4" >
                                    <legend>History at Enrollment</legend>
                                    <div class="col-sm-12">
                                        <div class="col-sm-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Symptoms at Enrolment in HIV care</label>
                                                <c:forEach items="${enrolmentsymptoms}" var="enrolmentsymptom">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckPatientproblems[]" name="chkOISymptomsAtEnrolment" value="${enrolmentsymptom.problemAcronym}" onchange="showDiv13(this)"> ${enrolmentsymptom.problemDescription} 
                                                    </label> 
                                                </c:forEach>
                                                <div id="div13" style = "Display : none;"><input type="text" class="form-control" name="txtSpecifyOISymptomsAtEnrolment"></div>
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Signs at HIV Care enrolment</label>
                                                <c:forEach items="${enrolmentsigns}" var="enrolmentsign">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckPatientproblems[]" name="chkOISignsAtEnrolment" value="${enrolmentsign.problemAcronym}" onchange="showDiv14(this)"> ${enrolmentsign.problemDescription} 
                                                    </label> 
                                                </c:forEach>
                                                <div id="div14" style = "Display : none;"> <input type="text" class="form-control" name="txtSpecifyOISignAtEnrolment">
                                                </div></div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Past Medical History</label>
                                                <c:forEach items="${pastmedicalhistories}" var="pastmedicalhistory">
                                                    <label>                                                       
                                                        <input type="checkbox" id="ckPatientproblems[]" name="chkOIPastmedicalHistory" value="${pastmedicalhistory.problemAcronym}" onchange="showDiv15(this)"> ${pastmedicalhistory.problemDescription} 
                                                    </label> 
                                                </c:forEach>
                                                <div id="div15" style = "Display : none;"> <input type="text" class="form-control" name="txtOISpecifyPastMedical">
                                                </div> </div>  
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 6" class="step" id="default-step-5">
                                    <legend>Drug alleges </legend>
                                    <div class="form-group col-sm-12">

                                        <table width="100%" border="0">
                                            <tr>

                                                <td>Drug Allergies</td>
                                                <td colspan="0">
                                                    <input type="radio" name="rdOIDrugAllegies" id="optOIDrugAllegies" value="Yes" onchange="showDiv4(this)">Yes&nbsp;<input type="radio" name="rdOIDrugAllegies" id="optOIDrugAllegies" value="No" onchange="showDiv4(this)">No
                                                </td>

                                                <td><div id ="div4a" style="display: none;">If yes State Allergy</div></td>

                                                <td colspan="1"><div id ="div4b" style="display: none;">
                                                        <input type="text" class="form-control" placeholder="Drug Allegies" name="txtOIDrugAllegies"/>
                                                    </div>
                                                </td>


                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>
                                                <td>Drug History/Prophylaxis</td>
                                                <td colspan="1">
                                                    <input type="radio" name="rdOIDrugHistory" id="optOIDrugHistory" value="DrugHistory" onchange="showDiv5(this)">Yes&nbsp;<input type="radio" name="rdOIDrugHistory" id="optOIDrugHistory" value="NoDrugHistory" onchange="showDiv5(this)">No
                                                </td>
                                                <td><div id ="div5a" style="display: none;">If yes Date started</div></td>

                                                <td colspan="1"><div id ="div5b" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="Date started" name="txtOIDrugHistoryYesDateStarted"/>
                                                    </div>
                                                </td>
                                                &nbsp;
                                                <td><div id ="div5c" style="display: none;">Date last taken </div></td>
                                                <td colspan="0"><div id ="div5d" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="Date started" name="txtOIDrugHistoryYesDateCompleted"/>
                                                    </div>
                                                </td>

                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>

                                                <td>Prior ARV Exposure</td>
                                                <td colspan="0">
                                                    <input type="radio" name="rdOIARVExp" id="optOIARVExp" value="ARV" onchange="showDiv6(this)">Yes&nbsp;<input type="radio" name="rdOIARVExp" id="optOIARVExp" value="No" onchange="showDiv6(this)">No
                                                </td>
                                                <td><div id ="div6a" style="display: none;">If yes Regimen:</div></td>
                                                <td colspan="0"><div id ="div6b" style="display: none;">
                                                        <input type="checkbox"  name="chksNVP" value="sNVP">sNVP&nbsp;<input type="checkbox" name="chkAZT" value="AZT">AZT&nbsp;<input type="checkbox" name="chk3TC" value="3TC">3TC
                                                    </div>
                                                </td>



                                                <td colspan="0"><div id ="div6c" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="Date started" name="txtOIARVExpDateStarted "/>
                                                    </div> </td>

                                                <td colspan="0"><div id ="div6d" style="display: none;">
                                                        <input type="date"  class="form-control" placeholder="Date completed" name="txtOIARVExpDateCompleted"/>
                                                    </div></td>
                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>
                                                <td>Prior PMTCT Exposure</td>
                                                <td colspan="1">
                                                    <input type="radio" name="rdOIPMTCTExp" id="optOIPMTCTExp" value="PPG" onchange="showDiv7(this)">Yes&nbsp;<input type="radio" name="rdOIPMTCTExp" id="optOIPMTCTExp" value="No" onchange="showDiv7(this)">No
                                                </td>
                                                <td><div id ="div7a" style="display: none;">If yes dose:</div></td>
                                                <td colspan="0"><div id ="div7b" style="display: none;">
                                                        <input type="text" class="form-control" placeholder="dose in mgs" name="txtOIPMTCTExpYesDose"/>
                                                    </div></td>

                                                <td colspan="0"><div id ="div7c" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="date started" name="txtOIPMTCTExpYesDateStarted"/>
                                                    </div> </td>
                                                <td colspan="0"><div id ="div7d" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="date completed" name="txtOIPMTCTExpYesDateCompleted"/>
                                                    </div></td>
                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>
                                                <td>Cotrimoxazole</td>
                                                <td colspan="1">
                                                    <input type="radio" name="rdOICotrimoxazole" id="optOICotrimoxazole" value="COT" onchange="showDiv8(this)">Yes&nbsp;<input type="radio" name="rdOICotrimoxazole" id="optOICotrimoxazole" value="No" onchange="showDiv8(this)">No
                                                </td>
                                                <td><div id ="div8a" style="display: none;">If yes dose:</div></td>
                                                <td colspan="0"><div id ="div8b" style="display: none;">
                                                        <input type="text" class="form-control" placeholder="dose in mgs" name="txtOICotrimoxazoleYesDose"/>
                                                    </div></td>

                                                <td colspan="0"><div id ="div8c" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="date started" name="txtOICotrimoxazoleYesDateStarted"/>
                                                    </div></td>
                                                <td colspan="0"><div id ="div8d" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="date completed" name="txtOICotrimoxazoleYesDateCompleted"/>
                                                    </div> </td>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>
                                                <td>Fluconazole</td>
                                                <td colspan="1">
                                                    <input type="radio" name="rdOIFluconazole" id="optOIFluconazole" value="FLU" onchange="showDiv9(this)">Yes&nbsp;<input type="radio" name="rdOIFluconazole" id="optOIFluconazole" value="No" onchange="showDiv9(this)">No
                                                </td>
                                                <td><div id ="div9a" style="display: none;">If yes dose:</div></td>
                                                <td colspan="0"><div id ="div9b" style="display: none;">
                                                        <input type="text" class="form-control" placeholder="dose in mgs" name="txtOIFluconazoleYesDose"/>
                                                    </div></td>

                                                <td colspan="0"><div id ="div9c" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="date started" name="txtOIFluconazoleYesDateStarted"/>
                                                    </div></td>
                                                <td colspan="0"><div id ="div9d" style="display: none;">
                                                        <input type="date" class="form-control" placeholder="date completed" name="txtOIFluconazoleYesDateCompleted"/>
                                                    </div></td>
                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>
                                                <td>Current TB therapy</td>
                                                <td colspan="0">
                                                    <input type="radio" name="rdOICurrentTBTherapy" id="optOICurrentTBTherapy" value="TB1" onchange="showDiv10(this)">Yes&nbsp;<input type="radio" name="rdOICurrentTBTherapy" id="optOICurrentTBTherapy" value="No" onchange="showDiv10(this)">No
                                                </td>
                                                <td><div id ="div10a" style="display: none;">If yes Category:</div></td>
                                                <td colspan="0"><div id ="div10b" style="display: none;">
                                                        <input type="radio" name="rdOITBCategory" id="optOITBCategory" value="1">1&nbsp;&nbsp;&nbsp; Or&nbsp;&nbsp;&nbsp; <input type="radio" name="rdOITBCategory" id="optOITBCategory" value="2">2
                                                    </div></td>


                                                <td> 



                                                <td>&nbsp;</td>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <tr><td>&nbsp;</td></tr>
                                            <tr>
                                                <td>Other(Specify)</td>
                                                <td colspan="0">
                                                    <input type="radio" name="rdOtherSpecify" id="otherspecify" value="OTH" onchange="showDiv11(this)">Yes&nbsp;<input type="radio" name="rdOtherSpecify" id="otherspecify" value="No" onchange="showDiv11(this)">No
                                                </td>
                                                <td colspan="0"><div id ="div11a" style="display: none;">
                                                        <input type="text" class="form-control" placeholder="Other specify" name="txtOISpecifyAllegies"/>
                                                    </div></td>
                                            </tr>

                                        </table>
                                        <p>&nbsp;</p>

                                    </div>
                                </fieldset>
                                <fieldset title="Step 7" class="step" id="default-step-5">
                                    <legend>Lab Results</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">CD4 Count Result :</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="cd4" name="chkcd4" value="Yes" onchange="showDiv17(this)"> 
                                        </label> 
                                        <div id ="div17" style="display: none;">
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control" placeholder="cell/mm3" name="txtOICDCountResult">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color:blue">CD4 Count Date:</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" placeholder="CD4 Count date" name="txtOICDCountDate">
                                        </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">CD4 % result</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="cd4p" name="chkcd4p" value="Yes" onchange="showDiv18(this)"> 
                                        </label>
                                        <div id ="div18" style="display: none;">
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control" placeholder=" name" name="txtOICDPercResult" >
                                        </div>
                                        <label class="col-lg-2 control-label">CD4 % Date :</label>
                                        <div class="col-lg-3">
                                            <input  type="date" class="form-control" placeholder="CD4% date" name="txtOICDPercDate" >
                                        </div>
                                    </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">HB Result:</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="hb" name="chkhb" value="Yes" onchange="showDiv19(this)"> 
                                        </label>
                                        <div id ="div19" style="display: none;">
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control" placeholder=" g/dl" name="txtOIHBResult">
                                        </div>
                                        <label class="col-lg-2 control-label">HB Result Date :</label>
                                        <div class="col-lg-3">
                                            <input  type="date" class="form-control" placeholder="HB result Date" name="txtOIHBDate">
                                        </div>
                                    </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">ALT Result</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="atl" name="chkatl" value="Yes" onchange="showDiv20(this)"> 
                                        </label>
                                        <div id ="div20" style="display: none;">
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control" placeholder="mmol/L" name="txtOIALTResult" >
                                        </div>
                                        <label class="col-lg-2 control-label">ALT Result date </label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control" placeholder="ATL Result Date" name="txtOIALTDate">
                                        </div>
                                    </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">WBC Result</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="wbc" name="chkwbc" value="Yes" onchange="showDiv21(this)"> 
                                        </label>
                                        <div id ="div21" style="display: none;">
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control" placeholder="cells/uL" name="txtOIWBCResult">
                                        </div>
                                        <label class="col-lg-2 control-label">WBC Result date </label>
                                        <div class="col-lg-3">
                                            <input  type="date" class="form-control" placeholder="WBC Result date" name="txtOIWBCDate">
                                        </div>
                                    </div>
                                    </div>  
                                    
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">CREATININE</label>
                                            <label class="col-lg-1 control-label">                                                       
                                                <input type="checkbox" id="creatin" name="chkcreatin" value="Yes" onchange="showDiv22(this)"> 
                                            </label>
                                            <div id ="div22" style="display: none;">
                                            <div class="col-lg-3">
                                                <input  type="text" class="form-control" placeholder="creatinine" name="txtOICreatinineResult">
                                            </div>
                                            <label class="col-lg-2 control-label">CREATININE Result date </label>
                                            <div class="col-lg-3">
                                                <input  type="date" class="form-control" placeholder="creatinine result date" name="txtOICreatinineDate">
                                            </div>
                                        </div>
                                </div>

                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">VIRAL LOAD</label>
                                            <label class="col-lg-1 control-label">                                                       
                                                <input type="checkbox" id="vl" name="chkvl" value="Yes" onchange="showDiv23(this)"> 
                                            </label>
                                            <div id ="div23" style="display: none;">
                                            <div class="col-lg-3">
                                                <input  type="text" class="form-control" placeholder="copies/ml" name="txtOIVLResult">
                                            </div>
                                            <label class="col-lg-2 control-label">VIRAL LOAD Result date </label>
                                            <div class="col-lg-3">
                                                <input  type="date" class="form-control" placeholder="Viral load result date" name="txtOIVLDate">
                                            </div>
                                        </div> 
                                </div>

                                </fieldset>
                                <fieldset title="Step 8" class="step" id="default-step-5">
                                    <legend>Baseline </legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Weight :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="kg" name="txtOIWeight">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color:blue">Height:</label>
                                        <div class="col-lg-4">
                                            <input type="text"  class="form-control" placeholder="cm" name="txtOIHeight">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">BP</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder=" syst/Dyst(mmHg)" name="txtOIBloodPressure" >
                                        </div>
                                        <label class="col-lg-2 control-label">Temperature :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="0C" name="txtOITemperature" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Pulse:</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder=" Bpm" name="txtOIPulse">
                                        </div>
                                        <label class="col-lg-2 control-label">Respiration Rate :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="breaths/minute" name="txtOIRespirationRate">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="checkbox">                                                                                
                                            <label style="color: red; text-align: center;">Examinations</label>
                                            <c:forEach items="${examinations}" var="examination">
                                                <label>                                                       
                                                    <input type="checkbox" id="ckPatientproblems[]" name="chkOIExaminations" value="${examination.problemAcronym}" onchange="showDiv16(this)"> ${examination.problemDescription} 
                                                </label> 
                                            </c:forEach>
                                            <div id ="div16" style="display: none;"> <input type="text" class="form-control" name="txtOISpecifyExaminations">
                                            </div> </div>  
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
            if (elem.value == 'Yes') {
                document.getElementById('part1').style.display = "none";
                document.getElementById('part2').style.display = "none";
                document.getElementById('part3').style.display = "none";
                document.getElementById('part4').style.display = "none";
                document.getElementById('part5').style.display = "block";
                document.getElementById('part6').style.display = "block";
                document.getElementById('part7').style.display = "block";
                document.getElementById('part8').style.display = "block";
            } else if (elem.value == 'No') {
                document.getElementById('part1').style.display = "none";
                document.getElementById('part2').style.display = "none";
                document.getElementById('part3').style.display = "block";
                document.getElementById('part4').style.display = "block";
                document.getElementById('part5').style.display = "none";
                document.getElementById('part6').style.display = "none";
                document.getElementById('part7').style.display = "none";
                document.getElementById('part8').style.display = "none";
            }
        }

        function showDiv1(elem) {
            if (elem.value == 'eid') {
                document.getElementById('div1a').style.display = "block";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "none";


            } else if (elem.value == 'hts') {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "block";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "none";
            } else if (elem.value == 'pmtct') {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "block";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "none";
            } else if (elem.value == 'sti') {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "block";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "none";
            } else if (elem.value == 'tb') {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "block";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "none";
            } else if (elem.value == 'vmmc') {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "block";
                document.getElementById('div1g').style.display = "none";
            } else if (elem.value == 'other') {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "block";
            } else {
                document.getElementById('div1a').style.display = "none";
                document.getElementById('div1b').style.display = "none";
                document.getElementById('div1c').style.display = "none";
                document.getElementById('div1d').style.display = "none";
                document.getElementById('div1e').style.display = "none";
                document.getElementById('div1f').style.display = "none";
                document.getElementById('div1g').style.display = "none";

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
            if (elem.value == 'Yes') {
                document.getElementById('div3a').style.display = "block";
                document.getElementById('div3b').style.display = "block";

            } else if (elem.value == 'No') {

                document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
            } else {

                document.getElementById('div3a').style.display = "none";
                document.getElementById('div3b').style.display = "none";
            }
        }
        function showDiv4(elem) {
            if (elem.value == 'Yes') {
                document.getElementById('div4a').style.display = "block";
                document.getElementById('div4b').style.display = "block";

            } else if (elem.value == 'No') {

                document.getElementById('div4a').style.display = "none";
                document.getElementById('div4b').style.display = "none";
            } else {

                document.getElementById('div4a').style.display = "none";
                document.getElementById('div4b').style.display = "none";
            }
        }
        function showDiv5(elem) {
            if (elem.value == 'DrugHistory') {
                document.getElementById('div5a').style.display = "block";
                document.getElementById('div5b').style.display = "block";
                document.getElementById('div5c').style.display = "block";
                document.getElementById('div5d').style.display = "block";

            } else if (elem.value == 'NoDrugHistory') {
                document.getElementById('div5a').style.display = "none";
                document.getElementById('div5b').style.display = "none";
                document.getElementById('div5c').style.display = "none";
                document.getElementById('div5d').style.display = "none";
            } else {
                document.getElementById('div5a').style.display = "none";
                document.getElementById('div5b').style.display = "none";
                document.getElementById('div5c').style.display = "none";
                document.getElementById('div5d').style.display = "none";
            }
        }
        function showDiv6(elem) {
            if (elem.value == 'ARV') {
                document.getElementById('div6a').style.display = "block";
                document.getElementById('div6b').style.display = "block";
                document.getElementById('div6c').style.display = "block";
                document.getElementById('div6d').style.display = "block";

            } else if (elem.value == 'No') {
                document.getElementById('div6a').style.display = "none";
                document.getElementById('div6b').style.display = "none";
                document.getElementById('div6c').style.display = "none";
                document.getElementById('div6d').style.display = "none";
            } else {
                document.getElementById('div6a').style.display = "none";
                document.getElementById('div6b').style.display = "none";
                document.getElementById('div6c').style.display = "none";
                document.getElementById('div6d').style.display = "none";
            }
        }

        function showDiv7(elem) {
            if (elem.value == 'PPG') {
                document.getElementById('div7a').style.display = "block";
                document.getElementById('div7b').style.display = "block";
                document.getElementById('div7c').style.display = "block";
                document.getElementById('div7d').style.display = "block";

            } else if (elem.value == 'No') {
                document.getElementById('div7a').style.display = "none";
                document.getElementById('div6b').style.display = "none";
                document.getElementById('div7c').style.display = "none";
                document.getElementById('div7d').style.display = "none";
            } else {
                document.getElementById('div7a').style.display = "none";
                document.getElementById('div7b').style.display = "none";
                document.getElementById('div7c').style.display = "none";
                document.getElementById('div7d').style.display = "none";
            }
        }
        function showDiv8(elem) {
            if (elem.value == 'COT') {
                document.getElementById('div8a').style.display = "block";
                document.getElementById('div8b').style.display = "block";
                document.getElementById('div8c').style.display = "block";
                document.getElementById('div8d').style.display = "block";

            } else if (elem.value == 'No') {
                document.getElementById('div8a').style.display = "none";
                document.getElementById('div8b').style.display = "none";
                document.getElementById('div8c').style.display = "none";
                document.getElementById('div8d').style.display = "none";
            } else {
                document.getElementById('div8a').style.display = "none";
                document.getElementById('div8b').style.display = "none";
                document.getElementById('div8c').style.display = "none";
                document.getElementById('div8d').style.display = "none";
            }
        }
        function showDiv9(elem) {
            if (elem.value == 'FLU') {
                document.getElementById('div9a').style.display = "block";
                document.getElementById('div9b').style.display = "block";
                document.getElementById('div9c').style.display = "block";
                document.getElementById('div9d').style.display = "block";

            } else if (elem.value == 'No') {
                document.getElementById('div9a').style.display = "none";
                document.getElementById('div9b').style.display = "none";
                document.getElementById('div9c').style.display = "none";
                document.getElementById('div9d').style.display = "none";
            } else {
                document.getElementById('div9a').style.display = "none";
                document.getElementById('div9b').style.display = "none";
                document.getElementById('div9c').style.display = "none";
                document.getElementById('div9d').style.display = "none";
            }
        }

        function showDiv10(elem) {
            if (elem.value == 'TB1') {
                document.getElementById('div10a').style.display = "block";
                document.getElementById('div10b').style.display = "block";

            } else if (elem.value == 'No') {

                document.getElementById('div10a').style.display = "none";
                document.getElementById('div10b').style.display = "none";
            } else {

                document.getElementById('div10a').style.display = "none";
                document.getElementById('div10b').style.display = "none";
            }
        }

        function showDiv11(elem) {
            if (elem.value == 'OTH') {
                document.getElementById('div11a').style.display = "block";

            } else if (elem.value == 'No') {

                document.getElementById('div11a').style.display = "none";

            } else {

                document.getElementById('div11a').style.display = "none";

            }
        }
        function showDiv12(elem) {
            if (elem.value == 'X') {if (elem.checked) {
                    document.getElementById('div12').style.display = "block";
                }
                else {

                    document.getElementById('div12').style.display = "none";

                }
            } 
        }
        function showDiv13(elem) {
            if (elem.value == 'OTC') {

                if (elem.checked) {
                    document.getElementById('div13').style.display = "block";
                }
                else {

                    document.getElementById('div13').style.display = "none";

                }

            }
        }
        function showDiv14(elem) {
            if (elem.value == 'OTS') {
                if (elem.checked) {
                    document.getElementById('div14').style.display = "block";
                }
                else {

                    document.getElementById('div14').style.display = "none";

                }

            }

            
        }
        function showDiv15(elem) {
            if (elem.value == 'OTP') {
                if (elem.checked) {
                    document.getElementById('div15').style.display = "block";
                }
                else {

                    document.getElementById('div15').style.display = "none";

                }
            }
        }
        function showDiv16(elem) {
            if (elem.value == 'OTE') {
                if (elem.checked) {
                    document.getElementById('div16').style.display = "block";
                }
                else {

                    document.getElementById('div16').style.display = "none";

                }
        }
    }
    
    function showDiv17(elem) {
            if (elem.value == 'Yes') {
                if (elem.checked) {
                    document.getElementById('div17').style.display = "block";
                }
                else {

                    document.getElementById('div17').style.display = "none";

                }
        }
    }
    
    function showDiv18(elem) {
            if (elem.value == 'Yes') {
                if (elem.checked) {
                    document.getElementById('div18').style.display = "block";
                }
                else {

                    document.getElementById('div18').style.display = "none";

                }
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
    function showDiv23(elem) {
            if (elem.value == 'Yes') {
                if (elem.checked) {
                    document.getElementById('div23').style.display = "block";
                }
                else {

                    document.getElementById('div23').style.display = "none";

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
