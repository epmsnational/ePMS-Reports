<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Case Based Surveillance: Paeds</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue" onload="checkCookies()">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">
                <section class="content-header">
                    <h1>
                        CBS Data Capturing < 2years
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
                                        You are about to fill and notify through CBS <a href="#" class="alert-link"><c:out value="${patient.firstName}" />  <c:out value="${patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            CBS MODULE < 2 YEARS
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
                                    <li id="default-title-7" class="">
                                        <div>Step 7</div>
                                    </li>
                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="NotificationAdults" method="post">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend>Reporting source & Site Info</legend>
                                    <div class="form-group" style="color:blue">
                                        <label class="col-lg-2 control-label">HTS Number :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="htc number" name="txtCBSHtcNo" value="<c:out value="${patient.htsId}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color:blue">Date form completed:</label>
                                        <div class="col-lg-4">
                                            <input type="date" required="required" class="form-control" placeholder="Date form completed" id="CBSDateCompleted" name="txtCBSDateComplete">
                                        </div>
                                    </div>
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
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend>Newly Diagnosed Case</legend>


                                    <div class="form-group">

                                        <label class="col-lg-2 control-label">Last name :</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control"  name="txtCBSSurname" value="${patient.lastName}" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label">First Name</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder=" name" name="txtCBSName" value="${patient.firstName}" readonly="readonly">
                                        </div>
                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label">Middle name :</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="middle name" name="txtMidlleName" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" national id" name="txtCBSNatId" value="<c:out value="${patient.nationalId}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" >Nationality </label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control"  name="txtCBSNationality">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="date of birth"  name="txtCBSDob" value="<c:out value="${patient.dob}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">Sex</label>
                                        <div class="col-lg-4">

                                            <input type="text" readonly="readonly" id="txtCBSGender" name="txtCBSGender" class="form-control" value="<c:out value="${patient.sex}"/>" >
                                        </div>
                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label">Religion</label>
                                        <div class="col-lg-4">

                                            <select class="form-control" name="txtcbsReligion">
                                                <option></option>
                                                <option value="apostolic">apostolic</option>
                                                <option value="pentecostal">pentecostal</option>
                                                <option value="catholic">catholic</option>
                                                <option value="protestant">protestant</option>
                                                <option value="traditional">traditional</option> 
                                                <option value="other specify">other specify</option>
                                            </select>
                                        </div>
                                    </div>                                       
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">District of residence</label>
                                        <div class="col-lg-4">
                                            <input type="text"  name="txtCBSDistrict" class="form-control" >
                                        </div>
                                        <label class="col-lg-2 control-label">Address:</label>
                                        <div class="col-lg-4">

                                            <input type="text"  name="txtCBSAddress" class="form-control" >
                                        </div>


                                    </div>


                                    <div class="form-group" id="part1" style="display: none;">
                                        <label class="col-lg-2 control-label">Pregnant Status</label>
                                        <div class="col-lg-4">
                                            <select  class="form-control" name="txtCBSPregnantStatus" >
                                                <option></option>
                                                <option value="yes">Yes</option>
                                                <option value="no">No</option>
                                                <option value="unknown">Unknown</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label" >Breastfeeding </label>
                                        <div class="col-lg-4">
                                            <select class="form-control"  name="txtCBSBreastfeeding" >
                                                <option></option>
                                                <option value="yes">Yes</option>
                                                <option value="no">No</option>
                                                <option value="unknown">Unknown</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Deceased at point of notification</label>
                                        <div class="col-lg-4">
                                            <select class="form-control" name="txtCBSDeceased" onchange="showDiv1(this)">
                                                <option></option>
                                                <option value="yes">Yes</option>
                                                <option value="no">No</option>

                                            </select>
                                        </div>
                                        <div id="part2a" style="display: none;">
                                            <label class="col-lg-2 control-label" >Date of Death </label>

                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="txtCBSDateOfDeath">
                                            </div>
                                        </div>
                                    </div>
                                    <div  id="part2b" style="display: none;">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Cause of death</label>
                                            <div class="col-lg-4">
                                                <input type="text" name="txtCauseOfDeath" class="form-control">
                                            </div>
                                            <label class="col-lg-2 control-label" >Is death HIV/AIDS related? </label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="txtDeathHIVRelated">
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-2">
                                    <legend>HIV Tests Performed</legend>
                                    <h3>Infant details</h3>
                                    <div class="form-group">
                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Type of Delivery: </label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbstypeofdelivery">
                                                    <option></option>
                                                    <option value="nvd">NVD</option>
                                                    <option value="csection">C-SECTION</option>
                                                    <option value="instrument used">INSTRUMENT USED</option>
                                                    <option value="unknown">UNKNOWN</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Place of Delivery: </label>
                                            <div class="col-lg-3">
                                                <select class="form-control" name="txtcbsplaceofdelivery">
                                                    <option></option>
                                                    <option value="private facility">PRIVATE FACILITY</option>
                                                    <option value="public facility">PUBLIC FACILITY</option>
                                                    <option value="bba">BBA</option>
                                                    <option value="home">HOME</option>
                                                    <option value="unknown">UNKNOWN</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Delivered By: </label>
                                            <div class="col-lg-3">
                                                <select class="form-control" name="txtcbsdeliverylevel" onchange="showDivX2(this)">
                                                    <option></option>
                                                    <option value="unskilled">UNSKILLED HEALTH WORKER</option>
                                                    <option value="skilled">SKILLED HEALTH WORKER</option>
                                                </select>
                                            </div>
                                            <div id="weightga" style="display: none;">
                                                <label class="control-label col-xs-3" > Birth Weight: </label>

                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control"  name="txtcbsinfantweight">
                                                </div>
                                                <label class="control-label col-xs-3" > GA at Delivery: </label>

                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control"  name="txtcbsinfantgaatdelivery">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Feeding Method (First 6 Months):</label>
                                            <div class="col-lg-3">
                                                <select class="form-control" name="txtCBSInfantFeeding" onchange="showFeed(this)">
                                                    <option></option>
                                                    <option value="exclusive BF">Exclusive Breast Feeding</option>
                                                    <option value="mixed">Mixed</option>
                                                    <option value="exclusive FF">Exclusive Formula Feeding</option>
                                                </select>

                                            </div>
                                            <div id="duration" style="display: none;">
                                                <label class="control-label col-xs-3" > Duration (Months): </label>

                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control"  name="txtcbsfeedingduration">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Currently Breast Feeding:</label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbsbreastfeeding" onchange="showDivX(this)">
                                                    <option></option>
                                                    <option value="yes">YES</option>
                                                    <option value="no">NO</option>
                                                </select>

                                            </div>
                                            <div id="agestop" style="display: none;">
                                                <label class="control-label col-xs-3" > Age Ceased: </label>

                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control"  name="txtcbsfeedingstopped">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Infant Prophylaxis:</label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbsinfantprophylaxis" onchange="showDivX1(this)">
                                                    <option></option>
                                                    <option value="none">NONE</option>
                                                    <option value="nvp">NVP</option>
                                                    <option value="nvp-azt">NVP & AZT</option>
                                                    <option value="azt-3tc-nvp">AZT & 3TC & NVP</option>
                                                    <option value="unknown">UNKNOWN</option>
                                                </select>

                                            </div>
                                            <div id="prophylaxis" style="display: none;">
                                                <label class="control-label col-xs-3" > Duration: </label>

                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control"  name="txtcbsprophylaxisduration">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-xs-3">Ever Tested Before? :</label>
                                            <label class="control-label col-xs-3"><input type="radio" id="PreviousTest" name="txtcbstestedbefore" value="yes" onchange="showTesting(this)"> YES</label>
                                            <label class="control-label col-xs-3"><input type="radio" id="PreviousTest" name="txtcbstestedbefore" value="no" onchange="showTesting(this)"> NO</label><br>
                                        </div>

                                        <div class="form-group" id ="testing" style="display: none;">
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
                                                            <option value="inconclussive">Inconclussive</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>


                                            <div class="form-group">
                                                <label class="control-label col-xs-3"><input  type="checkbox"  id="ThirdTest" name="TEST3" value="yes" onchange="showTest3(this)">  Test 3</label>
                                            </div>
                                            <div class="form-group" id="test3" style="display: none;">
                                                <label class="control-label col-xs-3">Method</label>
                                                <div class="col-lg-2">
                                                    <select class="form-control" name="txtcbstest3" onchange="showTestX2(this)">
                                                        <option></option>
                                                        <option value="dna-pcr">DNA PCR</option>
                                                        <option value="rdt">RDT</option>
                                                    </select>
                                                </div>
                                                <div id="test3Result" style="display: none;">
                                                    <label class="control-label col-xs-3">Result</label>
                                                    <div class="col-lg-2">
                                                        <select class="form-control" name="txtcbstest3Result">
                                                            <option></option>
                                                            <option value="positive">Positive</option>
                                                            <option value="negative">Negative</option>
                                                            <option value="unknown">Unknown</option>
                                                            <option value="inconclussive">Inconclussive</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div >
                                                <label class="control-label col-xs-3">Initiated on ART</label>
                                                <div class="col-lg-2">
                                                    <select class="form-control" name="txtcbsinfantartinitiation" >
                                                        <option></option>
                                                        <option value="yes">YES</option>
                                                        <option value="no">NO</option>
                                                    </select>

                                                </div>
                                            </div>
                                            <div >
                                                <label class="control-label col-xs-3"> CD4 % at Notification: </label>

                                                <div class="col-lg-2">
                                                    <input type="text" class="form-control"  name="txtcbscd4notification">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset title="Step 4" class="step" id="default-step-3">
                                    <legend>Mother</legend>
                                    <div class="form-group form-group-lg">

                                        <label class="control-label col-xs-3">Is biological mother alive: </label>
                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbsmomalive" onchange="showMom(this)">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>
                                            </select>
                                        </div>
                                        <div id="mom" style="display: none;">
                                            <label class="control-label col-xs-3" > OI/ART number: </label>

                                            <div class="col-lg-2">
                                                <input type="text"   name="txtCBSMomARTNumber" class="form-control creditCardText" placeholder="PP-DD-SS-YYYY-A-SSSSS" maxlength="21">
                                            </div>
                                        </div>
                                        <div id="mom1" style="display: none;">
                                            <label class="control-label col-xs-3" > Is there a surrogate mother: </label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbsmomsurrodate">
                                                    <option></option>
                                                    <option value="yes">YES</option>
                                                    <option value="no">NO</option>
                                                </select>
                                            </div>
                                        </div>
                                        <label class="control-label col-xs-3">Marital Status</label>
                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbsmaritalstatus">
                                                <option></option>
                                                <option value="NeverMarried">Never Married</option>
                                                <option value="SeparatedDivorced">Separated/Divorced</option>
                                                <option value="Widowed">Widowed</option>
                                                <option value="Married">Married</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3" >ANC Booking :</label>

                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbsANCBooking">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>
                                            </select>
                                        </div>
                                        <label class="control-label col-xs-3" >GA at booking : </label>

                                        <div class="col-lg-2">
                                            <input type="text" class="form-control"  name="txtCBSGA">
                                        </div>
                                        <label class="control-label col-xs-3" >Parity at booking :</label>

                                        <div class="col-lg-2">
                                            <input type="text" class="form-control"  name="txtCBSParity">
                                        </div>
                                        <label class="control-label col-xs-3" >Number of ANC visits :</label>

                                        <div class="col-lg-2">
                                            <input type="text" class="form-control"  name="txtCBSancnumber">
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3">HIV testing</label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsHIVTesting">
                                                <option></option>
                                                <option value="knownbeforepregnancy">Known positive before this pregnancy</option>
                                                <option value="nevertestedduringpregnancy">Never tested during this pregnancy (offer HTS!)</option>
                                                <option value="testedpositiveinthispregnanct">Tested positive during this pregnancy</option>
                                                <option value="unknown">Unknown (offer HTS!)</option>
                                                <option value="testedpositiveduringld">Tested positive during L&D</option>
                                                <option value="negative">Negative (offer HTS!)</option>
                                                <option value="positivepostdelivery">Tested positive post-delivery</option>
                                            </select>
                                        </div>
                                        <label class="control-label col-xs-3">ART  Status</label>
                                        <div class="col-lg-4">

                                            <select class="form-control" name="txtcbsARTStatus" onchange="showMom1(this)">
                                                <option></option>
                                                <option value="beforePregnancy">Before this pregnancy</option>
                                                <option value="postDelivery">Post-delivery</option>
                                                <option value="pregnancy≥8weeksbeforedelivery">during this pregnancy ≥ 8 weeks before delivery</option>
                                                <option value="never">Never on ART</option>
                                                <option value="pregnancy<8weeksbeforedelivery">during this pregnancy < 8 weeks before delivery</option>
                                                <option value="stopped">Stopped ART</option>
                                                <option value="onART">On ART</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="mom2" style="display: none;">
                                            <label class="control-label col-xs-3" >Date Stopped: </label>

                                            <div class="col-lg-2">
                                                <input type="text" class="form-control"  name="txtCBSARTdateStopped">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="mom3" style="display: none;">
                                            <label class="control-label col-xs-3" >Regimen: </label>

                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtCBSMomRegimen" onchange="showMom2(this)">
                                                    <option></option>
                                                    <option value="tle">TLE</option>
                                                    <option value="tln">TLN</option>
                                                    <option value="other">Other</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="mom4" style="display: none;">
                                            <label class="control-label col-xs-3" >Specify </label>

                                            <div class="col-lg-2">
                                                <input type="text" class="form-control"  name="txtCBSRegimenOther">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3">Poor adherence during pregnancy/ breastfeeding </label>
                                        <div class="col-lg-2">

                                            <select class="form-control" name="txtcbsadherence">
                                                <option></option>
                                                <option value="yes">YES</option>
                                                <option value="no">NO</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <label class="control-label col-xs-3">Viral Load : Test 1</label>
                                        <div class="col-lg-2">
                                            <select class="form-control" name="txtcbsviralload1" onchange="showMom3(this)">
                                                <option></option>
                                                <option value="notdone">Not Done</option>
                                                <option value="done">Done</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="mom5" style="display: none;">
                                            <label class="control-label col-xs-3" >Result</label>

                                            <div class="col-lg-2">
                                                <input type="text" class="form-control"  name="txtCBSViralLoadresult1" placeholder="Copies/mls" >
                                            </div>
                                            <label class="control-label col-xs-3" >Date</label>

                                            <div class="col-lg-2">
                                                <input type="date" class="form-control" name="txtCBSViralLoadDate">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="momX" style="display: none;">
                                            <label class="control-label col-xs-3">Viral Load : Test 2</label>
                                            <div class="col-lg-2">
                                                <select class="form-control" name="txtcbsviralload2" onchange="showMom4(this)">
                                                    <option></option>
                                                    <option value="notdone">Not Done</option>
                                                    <option value="done">Done</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-group-lg">
                                        <div id="mom6" style="display: none;">
                                            <label class="control-label col-xs-3" >Result</label>

                                            <div class="col-lg-2">
                                                <input type="text" class="form-control"  name="txtCBSViralLoadresult2" placeholder="Copies/mls" >
                                            </div>
                                            <label class="control-label col-xs-3" >Date</label>

                                            <div class="col-lg-2">
                                                <input type="date" class="form-control" name="txtCBSViralLoadDate1">
                                            </div>
                                        </div>
                                        <div class="form-group form-group-lg">
                                            <label class="control-label col-xs-3">Other Risk Factors</label>
                                            <div class="col-lg-4">

                                                <select class="form-control" name="txtcbsotherriskfactors">
                                                    <option></option>
                                                    <option value="whostage3/4">WHO clinical stage 3/4</option>
                                                    <option value="prolongedlabor">Prolonged labour</option>
                                                    <option value="raptmembraine">Ruptured membrane in L&D</option>
                                                    <option value="nipplefissures">Nipple fissures</option>
                                                </select>
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
        function showMom(elem) {

            if (elem.value == 'yes') {
                document.getElementById('mom').style.display = "block";
                document.getElementById('mom1').style.display = "none";

            } else if (elem.value == 'no') {
                document.getElementById('mom1').style.display = "block";
                document.getElementById('mom').style.display = "none";
            } else {
                document.getElementById('mom').style.display = "none";
                document.getElementById('mom1').style.display = "none";

            }

        }
        function showMom1(elem) {

            if (elem.value == 'stopped') {
                document.getElementById('mom2').style.display = "block";
                document.getElementById('mom3').style.display = "none";

            } else if (elem.value == 'onART') {
                document.getElementById('mom3').style.display = "block";
                document.getElementById('mom2').style.display = "none";
            } else {
                document.getElementById('mom2').style.display = "none";
                document.getElementById('mom3').style.display = "none";

            }

        }
        function showMom2(elem) {

            if (elem.value == 'other') {
                document.getElementById('mom4').style.display = "block";

            } else {
                document.getElementById('mom4').style.display = "none";

            }

        }
        function showMom3(elem) {

            if (elem.value == 'done') {
                document.getElementById('mom5').style.display = "block";
                document.getElementById('momX').style.display = "block";

            } else if (elem.value == 'notdone') {
                document.getElementById('mom5').style.display = "none";
                document.getElementById('momX').style.display = "none";
            } else {
                document.getElementById('mom5').style.display = "none";
                document.getElementById('momX').style.display = "none";

            }

        }
        function showMom4(elem) {

            if (elem.value == 'done') {
                document.getElementById('mom6').style.display = "block";

            } else {
                document.getElementById('mom6').style.display = "none";

            }

        }
        function showFeed(elem) {

            if (elem.value == 'exclusive BF') {
                document.getElementById('duration').style.display = "block";

            } else if (elem.value == 'exclusive FF') {
                document.getElementById('duration').style.display = "block";
            } else if (elem.value == 'mixed') {
                document.getElementById('duration').style.display = "block";
            } else {
                document.getElementById('duration').style.display = "none";

            }

        }
        function showDivX(elem) {

            if (elem.value == 'yes') {
                document.getElementById('agestop').style.display = "none";

            } else if (elem.value == 'no') {
                document.getElementById('agestop').style.display = "block";
            } else {
                document.getElementById('agestop').style.display = "none";

            }

        }
        function showDivX1(elem) {

            if (elem.value == 'none') {
                document.getElementById('prophylaxis').style.display = "none";

            } else if (elem.value == 'nvp') {
                document.getElementById('prophylaxis').style.display = "block";
            } else if (elem.value == 'nvp-azt') {
                document.getElementById('prophylaxis').style.display = "block";
            } else if (elem.value == 'azt-3tc-nvp') {
                document.getElementById('prophylaxis').style.display = "block";
            } else {
                document.getElementById('prophylaxis').style.display = "none";

            }

        }
        function showDivX2(elem) {

            if (elem.value == 'skilled') {
                document.getElementById('weightga').style.display = "block";

            } else if (elem.value == 'unskilled') {
                document.getElementById('weightga').style.display = "block";
            } else {
                document.getElementById('weightga').style.display = "none";

            }

        }
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


    </script>

</body>
</html>
