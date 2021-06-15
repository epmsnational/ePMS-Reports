<%-- 
    Document   : directAdults
    Created on : Jul 5, 2020, 2:18:26 PM
    Author     : devoop
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Case Based Surveillance: > 15 years</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue" onload="checkCookies()">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">
                <section class="content-header">
                    <h2>
                        CBS Data Capturing
                    </h2>
                </section>

                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        You are about to fill and notify through CBS <a href="#" class="alert-link"><c:out value="${patient.firstName}" />  <c:out value="${patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            CBS MODULE > 15 YEARS
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                NOTIFICATION
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
                                    <li id="default-title-6" class="">
                                        <div>Step 7</div>
                                    </li>
                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="DirectAdults" method="post">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend>Demographic</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">HTS Number :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="htc number" name="txtCBSHtcNo" value="<c:out value="${patient.htsId}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">HTS Facility</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="HTS Facility" name="txthtsfacility" value="<c:out value="${facilityName}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">District</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="HTS District" name="txthtsdistrict" value="<c:out value="${districtName}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">HTS Province</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="HTS Province" name="txthtsprovince" value="<c:out value="${provinceName}"/>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color:blue">Date:</label>
                                        <div class="col-lg-4">
                                            <input type="date" required="required" class="form-control" placeholder="Date" id="CBSDateCompleted" name="txtCBSDateComplete">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Last name :</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control"  name="txtCBSSurname" value="${patient.lastName}" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label">First Name</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder=" name" name="txtCBSName" value="${patient.firstName}" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="date of birth"  name="txtCBSDob" value="<c:out value="${patient.dob}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Sex</label>
                                        <div class="col-lg-4">
                                            <input type="text" readonly="readonly" id="txtCBSGender" name="txtCBSGender" class="form-control" value="<c:out value="${patient.sex}"/>" >
                                        </div>
                                        <label class="col-lg-2 control-label">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" national id" name="txtCBSNatId" value="<c:out value="${patient.nationalId}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Unique ID(pseudo-ID) :</label>
                                        <div class="col-lg-2">
                                            <input type="text" name="txtcbsUniqueId" class="form-control">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Mother's Name</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="Mother's Name" name="txtmothername">
                                        </div>
                                        <label class="col-lg-2 control-label">District/Country of Birth</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="District of Birth" name="txtmotherbirthplace" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Physical Address</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="Physical Address" name="txtmotheraddress">
                                        </div>
                                    </div>

                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend>HIV Diagnosis</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of HIV diagnosis</label>
                                        <div class="col-lg-4">
                                            <input type="Date" class="form-control" placeholder="date of HIV Diagnosis"  name="txtdateofhivdiagnosis">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-xs-3"><input  type="checkbox"  id="FirstTest" name="TEST1" value="yes" onchange="showTest1(this)">Test 1</label>
                                    </div>
                                    <div class="form-group" id ="test1" style="display: none;">
                                        <label class="control-label col-xs-3">Method</label>
                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbstest1" onchange="showTestX(this)">
                                                <option></option>
                                                <option value="dna-pcr">DNA PCR</option>
                                                <option value="rdt">RDT</option>
                                            </select>
                                        </div>
                                        <div id="test1Result" style="display: none;">
                                            <label class="control-label col-xs-3">Result</label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbstest1Result">
                                                    <option></option>
                                                    <option value="positive">Positive</option>
                                                    <option value="negative">Negative</option>
                                                    <option value="unknown">Unknown</option>
                                                    <option value="inconclussive">Inconclussive</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label col-xs-3"><input  type="checkbox"  id="SecondText" name="TEST2" value="yes" onchange="showTest2(this)">Test 2</label>
                                    </div>
                                    <div class="form-group" id="test2" style="display: none;">
                                        <label class="control-label col-xs-3">Method</label>
                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbstest2" onchange="showTestX1(this)">
                                                <option></option>
                                                <option value="dna-pcr">DNA PCR</option>
                                                <option value="rdt">RDT</option>
                                            </select>
                                        </div>
                                        <div id="test2Result" style="display: none;">
                                            <label class="control-label col-xs-3">Result</label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbstest2Result">
                                                    <option></option>
                                                    <option value="positive">Positive</option>
                                                    <option value="negative">Negative</option>
                                                    <option value="unknown">Unknown</option>
                                                    <option value="inconclussive">Inconclusive</option>
                                                </select>
                                            </div>
                                        </div>

                                </fieldset> 
                                <fieldset title="Step 3" class="step" id="default-step-2">
                                    <legend>Baseline Info</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Self Identified Gender</label>
                                        <div class="col-lg-3">
                                            <select class="form-control" name="txtselfidentifiedgender">
                                                <option></option>
                                                <option value="M">Male</option>
                                                <option value="F">Female</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group" style="display: none" >
                                        <label class="col-lg-2 control-label">Status</label>
                                        <div class="col-lg-6">
                                            <label for="cb"><input id="cb" type="checkbox" value="pregnant" onclick="female(this);">Pregnant</label>
                                            <div class="form-group" id="gestation" style="display: none;">
                                                <label class="col-lg-4 control-label">Gestation in Weeks</label>
                                                <div class="col-lg-4">
                                                    <input type="text" class="form-control" placeholder="Gestation (weeks)" name="txtgestation">
                                                </div>
                                            </div>
                                            <label for="cb1"><input  id="cb1" type="checkbox" value="breastfeeding" onclick="female(this);">Breastfeeding</label>
                                            <div class="form-group" id="postdelivery" style="display: none;">
                                                <label class="col-lg-4 control-label">Post Delivery</label>
                                                <div class="col-lg-4">
                                                    <input type="text" class="form-control" placeholder="Post Delivery (months)" name="txtmotheraddress">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="cb2"><input  id="cb2" type="checkbox" value="none" onclick="female(this);">Not Pregnant or Breastfeeding</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Marital Status</label>
                                        <div class="col-lg-3">
                                            <select  name="txtcbsMarital" class="form-control" >
                                                <option></option>
                                                <option value="married">married</option>
                                                <option value="never married">never married</option>
                                                <option value="divorced">divorced</option>
                                                <option value="widowed">widowed</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Education Level</label>
                                        <div class="col-lg-3">
                                            <select class="form-control" name="txtcbseducationlevel">
                                                <option></option>
                                                <option value="none">None</option>
                                                <option value="primary">Primary</option>
                                                <option value="secondary">Secondary</option>
                                                <option value="tertiary">Tertiary</option>
                                                <option value="unknown">Unknown</option>
                                                <option value="not applicaple">Not Applicable</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Religion</label>
                                        <div class="col-lg-3">
                                            <select class="form-control" name="txtcbsReligion">
                                                <option></option>
                                                <option value="apostolic">apostolic</option>
                                                <option value="pentecostal">pentecostal</option>
                                                <option value="catholic">catholic</option>
                                                <option value="protestant">protestant</option>
                                                <option value="traditional">traditional</option> 
                                                <option value="christianity">other christian</option>
                                                <option value="muslim">muslim</option>
                                                <option value="other specify">other specify</option>
                                            </select>
                                        </div>
                                    </div>                                       
                                    <div class="form-group">
                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Sexually Active</label>
                                            <div class="col-lg-2">

                                                <select class="form-control" name="txtcbsSexualActive">
                                                    <option></option>
                                                    <option value="yes">YES</option>
                                                    <option value="no">NO</option>

                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg" id="risk2">
                                        <label class="control-label col-xs-3">Contact of Index Case</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsCaseIndex" onchange="showBlock1(this)">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>

                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="risk3" style="display: none;">
                                            <div class="form-group form-group-lg">
                                                <label class="control-label col-xs-2" >Index Case Details </label>
                                            </div>
                                            <div class="form-group form-group-lg">
                                                <label class="control-label col-xs-2">HTS Number</label>
                                                <div class="col-lg-2">
                                                    <input type="text" name="txtbsHtcNumber" class="form-control creditCardText" placeholder="PP-DD-SS-YYYY-H-SSSSS" maxlength="21">
                                                </div>
                                                <label class="control-label col-xs-2" >OI/ART Number </label>
                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control creditCardText"  name="txtcbsArtNumber" placeholder="PP-DD-SS-YYYY-A-SSSSS" maxlength="21">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend>Risks past 12 months</legend>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Victim suspected of sexual abuse :</label>
                                        <div class="col-lg-7">
                                            <input style="color: blue;" type="radio"  name="victimissexualabused" value="YES"> Yes
                                            <input style="color: blue;" type="radio"  name="victimissexualabused" value="NO"> No
                                            <input style="color: blue;" type="radio"  name="victimissexualabused" value="REFUSED"> Refused
                                        </div>
                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Unprotected Sex (Without a Condom) :</label>
                                        <div class="col-lg-7">
                                            <input style="color: blue;" type="radio"  name="unprotectedsexwithoutcondom" value="YES"> Yes
                                            <input style="color: blue;" type="radio"  name="unprotectedsexwithoutcondom" value="NO"> No
                                            <input style="color: blue;" type="radio"  name="unprotectedsexwithoutcondom" value="REFUSED"> Refused
                                        </div>
                                    </div>

                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Unprotected sex with a male partner :</label>
                                        <div class="col-lg-7">
                                            <input style="color: blue;" type="radio"  name="ishaveunprotectedsexmale" value="YES"> Yes
                                            <input style="color: blue;" type="radio"  name="ishaveunprotectedsexmale" value="NO"> No
                                            <input style="color: blue;" type="radio"  name="ishaveunprotectedsexmale" value="REFUSED"> Refused
                                        </div>
                                    </div>
                                    <div style="color: blue;" class="form-group">
                                        <label class="col-lg-5 control-label">Unprotected sex with a female partner :</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="ishaveunprotectedsexfemale" value="YES"> Yes
                                            <input type="radio"  name="ishaveunprotectedsexfemale" value="NO"> No
                                            <input type="radio"  name="ishaveunprotectedsexfemale" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Sex with a sex worker:</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="issexwithsexworker" value="YES"> Yes
                                            <input type="radio"  name="issexwithsexworker" value="NO"> No                                           
                                            <input type="radio"  name="issexwithsexworker" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label  style="color: blue;" class="col-lg-5 control-label">Sex for money or other material possessions:</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="ishavesexformoney" value="YES"> Yes
                                            <input type="radio"  name="ishavesexformoney" value="NO"> No                                           
                                            <input type="radio"  name="ishavesexformoney" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Been in prison :</label>
                                        <div class="col-lg-7">

                                            <input type="radio"  name="iseverbeeninprison" value="YES"> Yes
                                            <input type="radio"  name="iseverbeeninprison" value="NO"> No                                           
                                            <input type="radio"  name="iseverbeeninprison" value="REFUSED"> Refused

                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Received any medical injections :</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="ismedicalinjections" value="YES"> Yes
                                            <input type="radio"  name="ismedicalinjections" value="NO"> No                                           
                                            <input type="radio"  name="ismedicalinjections" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Injected heroin or other ILICIT drugs :</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="isinjectedheroin" value="YES"> Yes
                                            <input type="radio"  name="isinjectedheroin" value="NO"> No                                           
                                            <input type="radio"  name="isinjectedheroin" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Received a blood transfusion :</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="isbloodtransfusion" value="YES"> Yes
                                            <input type="radio"  name="isbloodtransfusion" value="NO"> No                                           
                                            <input type="radio"  name="isbloodtransfusion" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">History of STI :</label>
                                        <div class="col-lg-7">
                                            <input type="radio"  name="ishistoryofsti" value="YES"> Yes
                                            <input type="radio"  name="ishistoryofsti" value="NO"> No                                           
                                            <input type="radio"  name="ishistoryofsti" value="REFUSED"> Refused
                                        </div>

                                    </div>
                                    <div style="color: blue;" class="form-group">

                                        <label class="col-lg-5 control-label">Tattooed with unsterilized instruments :</label>
                                        <div class="col-lg-7">
                                            <input style="color: blue;" type="radio"  name="istatooedwithunsterilized" value="YES"> Yes
                                            <input style="color: blue;" type="radio"  name="istatooedwithunsterilized" value="NO"> No
                                            <input style="color: blue;" type="radio"  name="istatooedwithunsterilized" value="REFUSED"> Refused

                                        </div>
                                        <div style="color: blue;" class="form-group">

                                        </div>
                                        <div style="color: blue;" class="form-group">
                                            <label class="col-lg-5 control-label">Others(Specify)</label>
                                            <div class="col-lg-5">
                                                <input type="text" class="form-control"  id="CBSType3ResultDate" name="txtotherroute" onchange="Valdate6b()">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">

                                        <label class="control-label col-xs-3">Date of Most Recent HIV Negative :</label>
                                        <div class="col-lg-2">
                                            <input type="date" class="form-control"  name="txtCBSrecentNegativeResult" >
                                        </div>
                                        <label class="control-label col-xs-3">If not remember, about how many months ago? :</label>
                                        <div class="col-lg-2">
                                            <input type="text" class="form-control"  name="txtCBSrecentNegativeResultMonths" >
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3">Ever Been on PrEP</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsbeenonPrEP">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>

                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3">Ever Been on any ARV/ART(excluding PrEP)</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsbeenonanyART">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>

                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3">Currently on ART</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbscurrentlyonart">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>

                                            </select>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset title="Step 5" class="step" id="default-step-4" >
                                    <legend>Recency Testing</legend>
                                    <div class="form-group form-group-lg">

                                        <label class="control-label col-xs-3">Rapid Test for HIV Infection Code: </label>
                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbsrtri" onchange="rtri(this)">
                                                <option></option>
                                                <option value="Done">DONE</option>
                                                <option value="Not Done">NOT DONE</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-1g">
                                        <div id="recent" style="display: none;">
                                            <label class="control-label col-xs-3" > Test Name: </label>

                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtCBSrecenttestername">
                                                    <option></option>
                                                    <option value="Asante">ASANTE</option>
                                                    <option value="Other">Other Specify</option>
                                                </select>
                                            </div>

                                            <label class="control-label col-xs-3" > Test Date: </label>

                                            <div class="col-lg-2">
                                                <input type="Date" class="form-control"  name="txtCBSrecenttestdate">
                                            </div>

                                            <label class="control-label col-xs-3" > Result: </label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbsrecenttestresult">
                                                    <option></option>
                                                    <option value="recent">RECENT</option>
                                                    <option value="long term">LONG TERM</option>
                                                    <option value="inconclussive">INCONCLUSIVE</option>
                                                    <option value="rtri negative">RTRI NEGATIVE</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div id="recent1" style="display: none;">
                                            <label class="control-label col-xs-3" > Reason Not Done: </label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbsrecenttestreason">
                                                    <option></option>
                                                    <option value="refused">CLIENT REFUSED</option>
                                                    <option value="no test kit">NO TEST KIT</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset title="Step 6" class="step" id="default-step-5" >
                                    <legend>HIV Clinical Info</legend>
                                    <div class="form-group form-group-lg" id="viralLoadConfirm">
                                        <label class="control-label col-xs-3">Assessment of WHO Clinical staging at notification :</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsadultwhostage" onchange="vlConfirm(this)">
                                                <option></option>
                                                <option value="yes">DONE</option>
                                                <option value="no">NOT DONE</option>

                                            </select>
                                        </div>
                                        <div class="form-group form-group-lg">
                                            <div id="yesConfirmed" style="display: none;">
                                                <div class="form-group form-group-lg">
                                                    <label class="control-label col-xs-3" >Result Stage</label>

                                                    <div class="col-lg-2">
                                                        <select class="form-control" name="txtcbsadultwhostageresult">
                                                            <option></option>
                                                            <option value="1">Stage 1</option>
                                                            <option value="2">Stage 2</option>
                                                            <option value="3">Stage 3</option>
                                                            <option value="4">Stage 4</option>

                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg" id="viralLoadConfirm">
                                        <label class="control-label col-xs-3">CD4 Count Test :</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsadultcd4count" onchange="vlConfirm1(this)">
                                                <option></option>
                                                <option value="yes">DONE</option>
                                                <option value="no">NOT DONE</option>

                                            </select>
                                        </div>
                                        <div class="form-group form-group-lg">
                                            <div id="yesConfirmed1" style="display: none;">
                                                <div class="form-group form-group-lg">
                                                    <label class="control-label col-xs-3" >Result</label>
                                                    <div class="col-lg-2">
                                                        <input type="text" class="form-control"  name="txtcbsadultcd4countresult">
                                                    </div>
                                                </div>
                                                <div class="form-group form-group-lg">
                                                    <label class="control-label col-xs-3" >Percentage</label>
                                                    <div class="col-lg-3">
                                                        <input type="text" class="form-control"  name="txtcbsadultcd4countpercentage">
                                                    </div>
                                                </div>
                                                <div class="form-group form-group-lg">
                                                    <label class="control-label col-xs-3" >Date</label>
                                                    <div class="col-lg-3">
                                                        <input type="Date" class="form-control"  name="txtcbsadultcd4countresultdate">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group form-group-lg" id="initiatedART">
                                            <label class="control-label col-xs-3">Initiated On ART</label>
                                            <div class="col-lg-2">

                                                <select class="form-control" name="txtcbsadultInitiatedonart" onchange="artInitiate(this)">
                                                    <option></option>
                                                    <option value="yes">YES</option>
                                                    <option value="no">NO</option>

                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group form-group-lg">
                                            <div id="yesInitiated" style="display: none;">
                                                <div class="form-group form-group-lg">
                                                    <label class="control-label col-xs-2">Date of Initiation</label>
                                                    <div class="col-lg-2">
                                                        <input type="date" name="txtcbdadultinitiationdate" class="form-control">
                                                    </div>
                                                    <label class="control-label col-xs-2" >OI/ART Number </label>
                                                    <div class="col-lg-2">
                                                        <input type="text" class="form-control creditCardText"  name="txtcbsadultoiartumber" placeholder="PP-DD-SS-YYYY-A-SSSSS" maxlength="21">
                                                    </div>
                                                    <label class="control-label col-xs-2">ART Regimen</label>
                                                    <div class="col-lg-2">
                                                        <input type="text" name="txtcbsadultartregimen" class="form-control">
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 
                                        <div class="form-group form-group-lg">
                                            <div id="noInitiated" style="display: none;">
                                                <div class="form-group form-group-lg">
                                                    <label class="control-label col-xs-3">Reason</label>
                                                    <div class="col-lg-2">
                                                        <select class="form-control" name="txtCBSadultnotinitiated">
                                                            <option></option>
                                                            <option value="in counselling">In Counselling</option>
                                                            <option value="Deffered">Deffered</option>
                                                            <option value="Reffered">Reffered</option>
                                                        </select>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                </fieldset>
                                <fieldset title="Step7" class="step" id="default-step-6">
                                    <legend>Site and Info</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Name of staff member reporting</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="Staff member reporting" name="txtCBSMemberReporting" >
                                        </div>
                                        <label class="col-lg-2 control-label">Telephone # of reporter :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="Staff member telephone" name="txtCBSStaffTelephone" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Email address of reporter :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control" placeholder="reporter email" name="txtCBSReporterEmail" >
                                        </div>

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

        function checkCookies() {
            val1 = document.getElementById("txtCBSGender").value;

            if (val1 == "Male") {

                document.getElementById('part1').style.display = "none";
            } else {

                document.getElementById('part1').style.display = "block";
            }


        }

        function isValidDate(d) {
            if (Object.prototype.toString.call(d) !== "[object Date]")
                return false;
            return !isNaN(d.getTime());
        }
        function Valdate1a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSDateSpecimenCollected").value;
            val3 = document.getElementById("CBSResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate1b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSDateSpecimenCollected").value;
            val3 = document.getElementById("CBSResultDate").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate2a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSDateSpecimenCollected2").value;
            val3 = document.getElementById("CBSResultDate2").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate2b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSDateSpecimenCollected2").value;
            val3 = document.getElementById("CBSResultDate2").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate3a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("txtCBSDateSpecimenCollected3").value;
            val3 = document.getElementById("CBSResultDate3").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate3b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("txtCBSDateSpecimenCollected3").value;
            val3 = document.getElementById("CBSResultDate3").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate4a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType1DateCollected").value;
            val3 = document.getElementById("CBSType1ResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate4b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType1DateCollected").value;
            val3 = document.getElementById("CBSType1ResultDate").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate5a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType2DateCollected").value;
            val3 = document.getElementById("CBSType2ResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate5b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType2DateCollected").value;
            val3 = document.getElementById("CBSType2ResultDate").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate6a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType3DateCollected").value;
            val3 = document.getElementById("CBSType3ResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate6b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType3DateCollected").value;
            val3 = document.getElementById("CBSType3ResultDate").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate7a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSSyphilisDateCollected1").value;
            val3 = document.getElementById("CBSSyphilisResultDate1").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate7b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSSyphilisDateCollected1").value;
            val3 = document.getElementById("CBSSyphilisResultDate1").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }

        function Valdate8a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSSyphilisDateCollected2").value;
            val3 = document.getElementById("CBSSyphilisResultDate2").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            } else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                } else {

                }
            } else {
                alert("Error");
            }
        }
        function Valdate8b() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSSyphilisDateCollected2").value;
            val3 = document.getElementById("CBSSyphilisResultDate2").value;
            if (val2.value != "")
            {
                if (val3 < val2) {
                    alert("Date of test results cannot be before specimen collection, and result date cannot be after form completion date ");

                } else {

                }
            } else {
                alert("Error");
            }

        }


        function showDiv1(elem) {

            if (elem.value == 'yes') {
                document.getElementById('part2a').style.display = "block";
                document.getElementById('part2b').style.display = "block";

            } else if (elem.value == 'no') {
                document.getElementById('part2a').style.display = "none";
                document.getElementById('part2b').style.display = "none";
            } else {
                document.getElementById('part2a').style.display = "none";
                document.getElementById('part2b').style.display = "none";

            }
        }
        function showDiv3(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part3').style.display = "block";
                } else {

                    document.getElementById('part3').style.display = "none";

                }
            }
        }
        function showDiv4(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part4').style.display = "block";
                } else {

                    document.getElementById('part4').style.display = "none";

                }
            }
        }
        function showDiv5(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part5').style.display = "block";
                } else {

                    document.getElementById('part5').style.display = "none";

                }
            }
        }
        function showDiv6(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part6').style.display = "block";
                } else {

                    document.getElementById('part6').style.display = "none";

                }
            }
        }
        function showDiv7(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part7').style.display = "block";
                } else {

                    document.getElementById('part7').style.display = "none";

                }
            }
        }
        function showDiv8(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part8').style.display = "block";
                } else {

                    document.getElementById('part8').style.display = "none";

                }
            }
        }
        function showDiv9(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part9').style.display = "block";
                } else {

                    document.getElementById('part9').style.display = "none";

                }
            }
        }
        function showDiv10(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part10').style.display = "block";
                } else {

                    document.getElementById('part10').style.display = "none";

                }
            }
        }
        function showDiv11(elem) {
            if (elem.value == 'Weeks of gestation') {
                document.getElementById('part11a').style.display = "block";
                document.getElementById('part11b').style.display = "none";

            } else if (elem.value == 'Weeks after Delivery') {
                document.getElementById('part11a').style.display = "none";
                document.getElementById('part11b').style.display = "block";
            } else {
                document.getElementById('part11a').style.display = "none";
                document.getElementById('part11b').style.display = "none";
            }
        }
        function showDiv12(elem) {
            if (elem.value == 'Weeks of gestation') {
                document.getElementById('part12a').style.display = "block";
                document.getElementById('part12b').style.display = "none";

            } else if (elem.value == 'Weeks after Delivery') {
                document.getElementById('part12a').style.display = "none";
                document.getElementById('part12b').style.display = "block";
            } else {
                document.getElementById('part12a').style.display = "none";
                document.getElementById('part12b').style.display = "none";
            }
        }
        function showDiv13(elem) {
            if (elem.value == 'Weeks of gestation') {
                document.getElementById('part13a').style.display = "block";
                document.getElementById('part13b').style.display = "none";

            } else if (elem.value == 'Weeks after Delivery') {
                document.getElementById('part13a').style.display = "none";
                document.getElementById('part13b').style.display = "block";
            } else {
                document.getElementById('part13a').style.display = "none";
                document.getElementById('part13b').style.display = "none";
            }
        }
        function showBlock(elem) {

            if (elem.value == 'yes') {
                document.getElementById('risk1').style.display = "block";

            } else if (elem.value == 'no') {
                document.getElementById('risk1').style.display = "none";
            } else {
                document.getElementById('risk1').style.display = "none";

            }

        }
        function showBlock1(elem) {

            if (elem.value == 'yes') {
                document.getElementById('risk3').style.display = "block";

            } else if (elem.value == 'no') {
                document.getElementById('risk3').style.display = "none";
            } else {
                document.getElementById('risk3').style.display = "none";

            }
        }
        function rtri(elem) {

            if (elem.value == 'Done') {
                document.getElementById('recent').style.display = "block";
                document.getElementById('recent1').style.display = "none";

            } else if (elem.value == 'Not Done') {
                document.getElementById('recent1').style.display = "block";
                document.getElementById('recent').style.display = "none";
            } else {
                document.getElementById('recent').style.display = "none";
                document.getElementById('recent1').style.display = "none";

            }

        }
        function artInitiate(elem) {

            if (elem.value == 'yes') {
                document.getElementById('yesInitiated').style.display = "block";
                document.getElementById('noInitiated').style.display = "none";

            } else if (elem.value == 'no') {
                document.getElementById('noInitiated').style.display = "block";
                document.getElementById('yesInitiated').style.display = "none";
            } else {
                document.getElementById('yesInitiated').style.display = "none";
                document.getElementById('noInitiated').style.display = "none";

            }

        }
        function vlConfirm(elem) {

            if (elem.value == 'yes') {
                document.getElementById('yesConfirmed').style.display = "block";

            } else {
                document.getElementById('yesConfirmed').style.display = "none";
            }

        }
        function vlConfirm1(elem) {

            if (elem.value == 'yes') {
                document.getElementById('yesConfirmed1').style.display = "block";

            } else {
                document.getElementById('yesConfirmed1').style.display = "none";
            }

        }

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

        $('.creditCardText').keyup(function () {
            var foo = $(this).val().replace(/-/g, "");
            if (foo.length > 0) {
                foo = format(foo, [2, 2, 2, 4, 1, 5], "-");
            }


            $(this).val(foo);
        });
        function showTest1(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('test1').style.display = "block";
                } else {

                    document.getElementById('test1').style.display = "none";

                }
            }
        }
        function showTest2(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('test2').style.display = "block";
                } else {

                    document.getElementById('test2').style.display = "none";

                }
            }
        }
        function showTest3(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('test3').style.display = "block";
                } else {

                    document.getElementById('test3').style.display = "none";

                }
            }
        }
        function showTestX(elem) {
            if (elem.value == 'dna-pcr') {
                document.getElementById('test1Result').style.display = "block";

            } else if (elem.value == 'rdt') {
                document.getElementById('test1Result').style.display = "block";
            } else {
                document.getElementById('test1Result').style.display = "none";

            }
        }
        function showTestX1(elem) {
            if (elem.value == 'dna-pcr') {
                document.getElementById('test2Result').style.display = "block";

            } else if (elem.value == 'rdt') {
                document.getElementById('test2Result').style.display = "block";
            } else {
                document.getElementById('test2Result').style.display = "none";

            }
        }
        function showTestX2(elem) {
            if (elem.value == 'dna-pcr') {
                document.getElementById('test3Result').style.display = "block";

            } else if (elem.value == 'rdt') {
                document.getElementById('test3Result').style.display = "block";
            } else {
                document.getElementById('test3Result').style.display = "none";

            }
        }
        function showTesting(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('testing').style.display = "block";
                } else {

                    document.getElementById('testing').style.display = "none";
                }
            }
            if (elem.value == 'no') {
                if (elem.checked) {
                    document.getElementById('testing').style.display = "none";
                }
            }
        }

        function female(elem) {

            if (elem.value == 'pregnant') {
                document.getElementById('gestation').style.display = "block";
                document.getElementById('postdelivery').style.display = "none";

            }
            else if (elem.value == 'breastfeeding') {
                document.getElementById('gestation').style.display = "none";
                document.getElementById('postdelivery').style.display = "block";

            } else {
                document.getElementById('gestation').style.display = "none";
                document.getElementById('postdelivery').style.display = "none";
            }

        }


    </script>

</body>
</html>

