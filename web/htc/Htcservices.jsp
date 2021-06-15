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
                                        <label class="col-lg-2 control-label">HTC Number</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder="htc number" name="txtHtcNo" value="<c:out value="${htsnum}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Registration Date:</label>
                                        <div class="col-lg-4">
                                            <input type="date" class="form-control" placeholder="Date of registration" name="txtHtcRegDate">
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
                                        <label class="col-lg-2 control-label">National ID :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control" placeholder=" national id" readonly="readonly" name="txtNatId" value="<c:out value="${patient.nationalId}"/>">
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
                                        <label class="col-lg-2 control-label" style="color: blue">Coupled to </label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="coupled to" name="txtCoupledTo">
                                        </div>
                                    </div>
                                </fieldset>


                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>Referral Information</legend>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Referred from </label>
                                        <div class="col-lg-2">

                                            <select name="txtReferred" class="form-control">
                                                <option> </option>
                                                <c:forEach var="refer" items="${referrals}">
                                                    <option value="${refer.id}">${refer.referredFromName}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">HTC Approach</label>
                                        <div class="col-lg-2">
                                            <select name="txtHtcApproach" class="form-control">
                                                <option> </option>
                                                <c:forEach var="approach" items="${htcapproach}">
                                                    <option value = "${approach.description}">${approach.description}</option>
                                                </c:forEach>    
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label">HTC Model </label>
                                        <div class="col-lg-2">
                                            <select name="txtHtcModel" class="form-control">
                                                <option> </option>
                                                <c:forEach var="hmodel" items="${htcmodel}">
                                                    <option value="${hmodel.id}">${hmodel.description}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Purpose of Testing </label>
                                        <div class="col-lg-2">
                                            <select name="txtPurposeOfTest" class="form-control">
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
                                        <label class="col-lg-2 control-label"> Counselling Received </label>
                                        <div class="col-lg-2">
                                            <select name="txtCounsellingreceived" class="form-control">
                                                <option> </option>
                                                <option>Group education</option>
                                                <option>Individual Pre-Test Information</option>                                                  
                                            </select>


                                        </div>


                                        <label class="col-lg-2 control-label"> Opted out</label>
                                        <div class="col-lg-1">

                                            <select id="optOut" name="txtOptOut"  onchange="showDiv1(this)">
                                                <option> </option>
                                                <option>No</option>
                                                <option>Yes</option>                                                  
                                            </select>
                                        </div>
                                    </div>


                                    <div class="form-group" id ="part1" style="display: none;" >
                                        <label class="col-lg-2 control-label"> Tested before</label>
                                        <div class="col-lg-2">

                                            <select id="testedBefore" name="txtTestedBefore"  onchange="showDiv2(this)">
                                                <option> </option>
                                                <option>No</option>
                                                <option>Yes</option>                                                  
                                            </select>
                                        </div>
                                        <div class="form-group" id="part2" style="display: none;">
                                            <div id="beforetestdate" class="non">
                                                <label class="col-lg-1 control-label">Date Tested</label>
                                                <div class="col-lg-2">
                                                    <input type="date" class="form-control" placeholder="date tested" name="txtDateTestedBefore">
                                                </div>
                                            </div>
                                            <c:if test="${patient.sex == 'Female'}" var="opopop">
                                                <label class="col-lg-2 control-label"> The current Pregnancy or Lactation </label>
                                                <div class="col-lg-1">

                                                    <select name="txtCurrentPreg" >
                                                        <option> </option>
                                                        <option>No</option>
                                                        <option>Yes</option>                                                  
                                                    </select>
                                                </div>
                                            </c:if>



                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Name of counsellor / person who collected Blood</label>
                                        <div class="col-lg-2">
                                            <input type="text" class="form-control" placeholder="councellor name" name="txtCounsellor">
                                        </div>
                                    </div>




                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-3" >
                                    <legend> HIV Testing </legend>
                                    <div>
                                        <table width="100%">
                                            <tr><th style="width: 20%;font-size:16px;">Test</th><th style="width: 20%;font-size:16px;">Test Kit</th><th style="width: 20%;font-size:16px;">Lot Number</th><th style="width: 20%;font-size:16px;">Expire Date</th><th style="width: 20%;font-size:16px;">Result</th></tr>
                                        </table>
                                        <div>
                                            <table width="100%">
                                                <tr><td style="width: 20%;">First Test </td><td>
                                                        <label>Determine</label>

                                                        <!--   <select name="txtKit1TestKit" >
                                                               <option>  </option>
                                                               <option> Determine</option>
                                                               <option>First respond</option>
                                                               <option>Other</option>                                                  
                                                           </select>-->
                                                    </td><td><input type="text" name="txtKit1LotNumber"/></td><td><input type="date" name="txtKit1ExpiryDate"/></td><td>
                                                        <select id="kit1Result" name="txtKit1Result" onchange="showDiv3(this)">
                                                            <option> </option>
                                                            <option>Negative</option>
                                                            <option>Positive</option>                                                  
                                                        </select></td></tr>
                                            </table>
                                        </div>
                                        <div id ="part3a" style="display: none;">
                                            <table width="100%">
                                                <tr><td style="width: 20%;">Second Test</td><td>
                                                        <label>First Respond&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>

                                                        <!--<select name="txtKit2TestKit" >
                                                            <option> </option>
                                                            <option>Determine</option>
                                                            <option>First respond</option>
                                                            <option>Other</option>                                                  
                                                        </select>-->
                                                    </td><td><input type="text" name="txtKit2LotNumber"/></td><td><input type="date" name="txtKit2ExpiryDate"/></td><td>
                                                        <select id="kit2result" name="txtKit2Result" onchange="showDiv4(this)"  >
                                                            <option> </option>

                                                            <option>Negative</option>
                                                            <option>Positive</option>                                                  
                                                        </select></td></tr>
                                            </table>
                                        </div>
                                        <div id ="part3b" style="display: none;">
                                            <table width="100%">
                                                <tr><td style="width: 20%;">Tiebreaker</td><td>
                                                        <label>CHAMBIO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>

                                                        <!-- <select name="txtTieBrTestKit" >
                                                         <option> </option>
                                                           <option> Determine</option>
                                                           <option>First respond</option>
                                                           <option>Other</option>                                                  
                                                       </select>-->
                                                    </td><td><input type="text" name="txtTieBrLotNumber"/></td><td><input type="date" name="txtTieBrExpiryDate"/></td><td>
                                                        <select id="txtTieBrResult" name="txtTieBrResult" onchange="showDiv5(this)"/>
                                                <option> </option>

                                                <option>Negative</option>
                                                <option>Positive</option>                                                  
                                                </select></td></tr>
                                            </table>
                                        </div>

                                    </div>
                                    <hr>
                                    <div id ="part3c" style="display: none;">
                                        <table width="100%">
                                            <tr><td style="width: 20%; color:red; font-weight: 16px;">Final Result</td><td><input readonly="readonly" type="text" id="txtFinalResult" name="txtFinalResult"/></td><td></td><td></td><td></td></tr>
                                        </table>
                                    </div>
                                    <hr>

                                    <div>
                                        <table width="100%">
                                            <tr><td style="width: 20%;">Test Performed by:</td><td><input type="text" name="txtTestPerformedBy"/></td><td></td><td></td><td></td></tr>
                                        </table>
                                    </div>







                                </fieldset>
                                <fieldset title="Step 5" class="step" id="default-step-4" >
                                    <legend> HIV Test Result</legend>


                                    <div class="form-group">
                                        <label class="col-lg-3 control-label"> Received Result</label>
                                        <div class="col-lg-1">

                                            <select name="txtReceivedResult" >
                                                <option> </option>
                                                <option>No</option>
                                                <option>Yes</option>                                                  
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Post test counselled </label>
                                        <div class="col-lg-1">

                                            <select name="txtPostTestCounselling" onchange="showDiv6(this)"  >
                                                <option> </option>
                                                <option>No</option>
                                                <option>Yes</option>                                                  
                                            </select>
                                        </div>
                                        <div id ="part4" style="display: none;">
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">Date Post Test performed</label>
                                                <div class="col-lg-2">
                                                    <input type="date" class="form-control" placeholder="Post test date" name="txtPostTestDate">

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label"> Referred To </label>
                                        <div class="col-lg-1">

                                            <select name="txtReferredTo" class="form-control">
                                                <option> </option>
                                                <c:forEach var="pp" items="${referredTo}">
                                                    <option value="${pp.id}">${pp.description}</option>
                                                </c:forEach>                    
                                            </select>
                                        </div>

                                        <div class="form-group">

                                            <input type="submit" class=" col-lg-1" value="Print result"/>
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

            });
        </script>
        <script>
            $(document).ready(function ()
            {
                $('#kit2Result').change(function (event) {
                    var result = $('#kit2Result').val();

                    $('#txtFinalResult').val(result);
                });

            });


        </script>
        <script>
            $(document).ready(function ()
            {
                $('#txtTieBrResult').change(function (event) {
                    var result = $('#txtTieBrResult').val();

                    $('#txtFinalResult').val(result);
                });


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
            function showDiv1(elem) {
                if (elem.value == 'No') {
                    document.getElementById('part1').style.display = "block";

                } else if (elem.value == 'Yes') {
                    document.getElementById('part1').style.display = "none";

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

                } else if (elem.value == 'Positive') {
                    document.getElementById('part3a').style.display = "block";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "none";
                } else {
                    document.getElementById('part3a').style.display = "block";
                    document.getElementById('part3b').style.display = "none";
                    document.getElementById('part3c').style.display = "none";

                }
            }

            function showDiv4(elem) {
                if (elem.value == 'Negative') {

                    document.getElementById('part3b').style.display = "block";
                    document.getElementById('part3c').style.display = "none";

                } else if (elem.value == 'Positive') {

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

        </script>
    </body>
</html>