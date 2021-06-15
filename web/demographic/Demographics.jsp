<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>Recording New Client</title>
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
                    <h2>
                        Demographic Data Capturing
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
                                        New Client Form for Demographic Data
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            New Client
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                Collect All Demographic  Data
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
                 
                                </ul>
                            </div>
                            <form class="form-horizontal"  name="demoForm" id="default" action="AddPatientServlet" method="POST">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend> Personal Details</legend>
                                    <div class="form-group" id="NewClient" >
                                        <label class="col-lg-2 control-label"tabindex="1">OPD Number :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" tabindex="1"type="text" class="form-control"  name="txtOpdNum" value="<c:out value="${opdnum}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label" >Registration Date:</label>
                                        <div class="col-lg-4">
                                            <input type="date"tabindex="2" class="form-control" placeholder="Date of registration" name="txtRegDate" required="required" >
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" >First Name</label>
                                        <div class="col-lg-4">
                                            <input type="text" tabindex="3"class="form-control" placeholder=" First Name" name="txtName" required="required">
                                        </div>
                                        <label class="col-lg-2 control-label" >Surname :</label>
                                        <div class="col-lg-4">
                                            <input type="text" tabindex="4"class="form-control" placeholder="Surname" name="txtSurname" required="required">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Source Type:</label>
                                        <div class="col-lg-4">
                                            <select name="txtType" tabindex="5" class="form-control">
                                                <option> </option>
                                                <option>National ID</option>                                                  
                                                <option>Passport</option>                                                 
                                                <option>Driver license</option>  
                                                <option>Birth Certificate</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Number ID:</label>
                                        <div class="col-lg-4">
                                            <input type="text" tabindex="5" class="form-control" placeholder=" Number" name="txtNatId">
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of birth</label>
                                        <div class="col-lg-4">
                                            <input type="date" tabindex="6"class="form-control" id="dob" placeholder="Date of Birth" name="txtDob" required="required">
                                        </div>
                                        <label class="col-lg-2 control-label">Age </label>
                                        <div class="col-lg-4">

                                            <input readonly="readonly"   class="form-control" id="theAge"  name="txtAge">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Gender</label>
                                        <div class="col-lg-4">

                                            <select name="txtGender" tabindex="7"class="form-control" required="required">
                                                <option> </option>
                                                <option>Male</option>
                                                <option>Female</option>                                                  
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Marital Status</label>
                                        <div class="col-lg-4">

                                            <select name="txtMarital" tabindex="8"class="form-control">
                                                <option> </option>
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

                                            <select name="txtOrphan" tabindex="9"class="form-control">
                                                <option> </option>
                                                <option>Single</option>
                                                <option>Double</option>                                                  
                                                <option>N/A</option>                                                  
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Nationality</label>
                                            <div class="col-lg-4">
                                                <select name="txtNational" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="national" items="${nations}">
                                                        <option>${national.name}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div> 

                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"> Functional Status</label>
                                            <div class="col-lg-4">
                                                <select name="txtFuncStatus" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="functional" items="${functions}">
                                                        <option value="${functional.id}">${functional.description}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div> 


                                        <label class="col-lg-2 control-label">Educational Level</label>
                                        <div class="col-lg-4">

                                            <select name="txtEducation" tabindex="10" class="form-control">
                                                <option> </option>
                                                <option>None</option>                                                  
                                                <option>Primary</option>                                                 
                                                <option>Secondary</option>  
                                                <option>Tertiary</option>
                                            </select>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Occupation</label>
                                        <div class="col-lg-4">
                                            <input type="text" tabindex="11"class="form-control" placeholder="Occupation" name="txtOccupation">

                                            </fieldset>
                                            <fieldset title="Step 2" class="step" id="default-step-1" >
                                                <legend>Contact Details</legend>

                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Address :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Home Addreess" name="txtAddress">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Telephone No:</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder=" Telephone Number" name="txtTelNo">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Mobile</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder=" Phone Number" name="txtMobile">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">School:</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Nearest School" name="txtSchool">
                                                    </div>
                                                </div>                                      
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Village</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Village " name="txtVillage">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Kraal</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Kraal " name="txtKraal">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Chief</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Chief " name="txtChief">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Clinic</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Nearest Clinic " name="txtClinic">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Alternative Address :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Alternative address " name="txtAlternativeAdd">
                                                    </div>
                                                </div>
                                            </fieldset>                                  
                                            <fieldset title="Step 3" class="step" id="default-step-2" >
                                                <legend> Family Information</legend>
                                                <div>
                                                    <p style="color: green">Enter Next Of Kin Details</p>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label"> First Name</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Next of Kin Name" name="txtKinName">
                                                    </div>
                                                    <label class="col-lg-2 control-label">Surname </label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Surname" name="txtKinSurname">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label"> Gender</label>
                                                    <div class="col-lg-4">

                                                        <select name="txtKinGender" class="form-control">
                                                            <option> </option>
                                                            <option>MALE</option>
                                                            <option>FEMALE</option>                                                  
                                                        </select>
                                                    </div>
                                                    <label class="col-lg-2 control-label">Occupation</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Occupation of Next of Kin" name="txtKinOccupation">
                                                    </div>
                                                </div>


                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Address :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Home Addreess" name="txtKinAddress">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Telephone No:</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder=" Telephone Number" name="txtKinTelNo">
                                                    </div>
                                                    <label class="col-lg-2 control-label">Mobile</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder=" Phone Number" name="txtKinMobile">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">School</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Nearest School" name="txtKinSchool">
                                                    </div>
                                                    <label class="col-lg-2 control-label">Village</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Village " name="txtKinVillage">
                                                    </div>
                                                </div>


                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Kraal</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Kraal " name="txtKinKraal">
                                                    </div>
                                                    <label class="col-lg-2 control-label">Chief</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Chief " name="txtKinChief">
                                                    </div>
                                                </div>


                                            </fieldset>

<!--                                            <fieldset title="Step 4" class="step" id="default-step-3" >
                                                <legend> Medical Insurance</legend>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Insurance Name :</label>
                                                    <div class="col-lg-4">

                                                        <select class="form-control" name="txtInsuranceName">
                                                            <option> </option>
                                                            <c:forEach var="society" items="${societies}">
                                                                <option>${society.medicalAidName}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Insurance Scheme</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Insurance Scheme " name="txtInsScheme">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Insurance No :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Insurance Number " name="txtInsuranceNo">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">Principal Member's name :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="Principal member name " name="txtPrincipalMemberName">
                                                    </div>
                                                </div>
                                            </fieldset>-->
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
                                            });
                                        </script>
                                        </body>

                                        </html>
