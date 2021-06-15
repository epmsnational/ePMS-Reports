<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>New Exposed Infant Client</title>
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
                                        Registering new Exposed infant <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            Exposed Infant  Module
                        </header>
                        <div class="panel-body">

                            <div class="stepy-tab">
                                <ul id="default-titles" class="stepy-titles clearfix">
                                    <li id="default-title-0" class="current-step">
                                        <div>Step 1</div>
                                    </li>
                                    
                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="ExposedInfantPatient" method="POST">

                                <fieldset title="Step 1" class="step" id="default-step-0">
                                    <legend> Personal Details</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Mother OI ART Number</label>
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control" placeholder="OI ART Number" name="txtMotherOINumber" value="${patient.patientId}" readonly="readonly" >
                                        </div>
                                        <label class="col-lg-2 control-label">Infant Number C0:</label>
                                        <div class="col-lg-1">
                                            <input required="true" type="number" class="form-control"   name="txtInfantNumber"min="1" max="10"/>
                                        </div>
                                
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Mother Name</label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" placeholder=" name" name="txtMotherName" value="${patient.firstName}" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label">Mother Surname :</label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" placeholder="surname" name="txtMotherSurname" value="${patient.lastName}" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Child Name :</label>
                                        <div class="col-lg-3">
                                            <input  required="true" type="text" class="form-control" placeholder=" child name"  name="txtChildName" />
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Registration Date:</label>
                                        <div class="col-lg-3">
                                            <input required="true" type="date" class="form-control" placeholder="Date of registration" name="txtRegDate">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Child Date of birth</label>
                                        <div class="col-lg-3">
                                            <input  required="true" type="date" class="form-control" placeholder="date of birth"  name="txtChildDob" />
                                        </div>
                                        <label class="col-lg-2 control-label">Child Birth weight </label>
                                        <div class="col-lg-2">
                                            <input required="true" type="number" class="form-control" placeholder="birth weight" name="txtWeight" min="0.1" max="7" >
                                        </div>
                                    </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Gender </label>
                                        <div class="col-lg-2">
                                            <select class="form control"  name="txtGender" required="true">
                                                <option value=""> </option>
                                                <option value="male">Male</option>
                                                <option value="female">Female</option>
                                                
                                            </select>
                                         </div>
                                            
                                        </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Place of Delivery</label>
                                        <div class="col-lg-3" >

                                            <select class="form control"  name="txtPlaceOfDelivery" required="true">
                                                <option value=""> </option>
                                                <option value="Clinic">clinic</option>
                                                <option value="Home">Home</option>
                                                <option value="In Transit">In Transit</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label">Mode Of Delivery</label>
                                        <div class="col-lg-3">

                                            <select class="form control" name="txtModeOfdelivery" required="true">
                                                <option value=""> </option>
                                                <option value="Normal Vigina Delivery">Normal Vagina Delivery</option>
                                                <option value="Vacuum Extraction Delivery">Vacuum Extraction Delivery</option>
                                                <option value="Forceps Delivery">Forceps Delivery</option>
                                                <option value="Caesarean Section">Caesarean Section</option>
                                                <option value="Other">Other Specify</option>
                                            </select>
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