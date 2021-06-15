<%-- 
    Document   : newEidPatient
    Created on : Jul 20, 2017, 12:49:32 PM
    Author     : Trevor
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Under 2 EID and Rapid Tests: Paeds</title>
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
                        HIV Tests <2years
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
                            <2 HIV testing module
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                Testing
                            </div>
                            <div class="stepy-tab">
                                <ul id="default-titles" class="stepy-titles clearfix">
                                    <li id="default-title-0" class="current-step">
                                        <div>Step 1</div>
                                    </li>
                                    <li id="default-title-1" class="">
                                        <div>Step 2</div>
                                    </li>

    
                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="EidPatient" method="post">
                               
                                <fieldset title="Step 1" class="step" id="default-step-0">
                                    <legend>Client Details</legend>


                                    <div class="form-group">

                                        <label class="col-lg-2 control-label">Last name :</label>
                                         <div class="col-lg-4">
                                            <input input type="text" id= "creditCardText" class="form-control"  name="txtID" placeholder="PP-DD-FF-A-YYYY-00000" maxlength="21">
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
                                    
                                </fieldset>                                  
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend>HIV Tests</legend>
                                    <h3>Tests and results</h3>
                    

                                    <div class="form-group">
                                        <div class="col-lg-1">
                                            <input  type="checkbox"  id="FirstPCR" name="PCR1" value="yes" onchange="showDiv3(this)">  First PCR<br>
                                        </div>
                                        <div id ="part3" style="display: none;">
                                            <div class="col-lg-3">
                                                <input type="text" class="form-control" placeholder="Age when first PCR was taken" name="txtCBSAge" >
                                            </div>
                                            <label class="col-lg-1 control-label">Date specimen collected</label>
                                            <div class="col-lg-2">
                                                <input type="date" class="form-control" id="CBSDateSpecimenCollected" name="txtCBSDateSpecimenCollected" onchange="Valdate1a()">
                                            </div>
                                            <label class="col-lg-1 control-label">Test Result</label>
                                            <div class="col-lg-1">
                                                <select class="form-control" name="txtCBSResult" >
                                                    <option></option>
                                                    <option value="positive">Positive</option>
                                                    <option value="negative">Negative</option>
                                                    <option value="unknown">Unknown</option>
                                                </select>

                                            </div>
                                            <label class="col-lg-1 control-label">Test Result Date</label>
                                            <div class="col-lg-2">
                                                <input type="date" class="form-control"  id="CBSResultDate" name="txtCBSResultDate"  onchange="Valdate1b()">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-1">
                                            <input  type="checkbox"  ID="SecondPCR"  name="PCR2" value="yes" onchange="showDiv4(this)"> Second PCR<br>
                                        </div>
                                        <div id ="part4" style="display: none;">
                                            <div class="col-lg-3">
                                                <input type="text" class="form-control" placeholder="Age in months when 2nd PCR was taken"  name="txtCBSAge2" >
                                            </div>
                                            <label class="col-lg-1 control-label">Date specimen collected</label>
                                            <div class="col-lg-2">
                                                <input type="date" class="form-control" id="CBSDateSpecimenCollected2" name="txtCBSDateSpecimenCollected2" onchange="Valdate2a()" >
                                            </div>
                                            <label class="col-lg-1 control-label">Test Result</label>
                                            <div class="col-lg-1">
                                                <select class="form-control" name="txtCBSResult2" >
                                                    <option></option>
                                                    <option value="positive">Positive</option>
                                                    <option value="negative">Negative</option>
                                                    <option value="unknown">Unknown</option>
                                                </select>

                                            </div>
                                            <label class="col-lg-1 control-label">Test Result Date</label>
                                            <div class="col-lg-2">
                                                <input type="date" class="form-control" id="CBSResultDate2" name="txtCBSResultDate2" onchange="Valdate2b()" >
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-1">
                                            <input  type="checkbox"  id="RapidAfter6weeks"  name="PAPID6WEEKS" value="yes" onchange="showDiv5(this)"> Rapid test After 6 weeks cessation of BF<br>
                                        </div>
                                        <div id ="part5" style="display: none;">
                                            <div class="col-lg-3">
                                                <input type="text" class="form-control" placeholder=" HIV Rapid Test after 6 wks Cessation of Breastfeeding" name="" >
                                            </div>
                                            <label class="col-lg-1 control-label">Date specimen collected</label>
                                            <div class="col-lg-2">
                                                <input type="date" class="form-control"  id="txtCBSDateSpecimenCollected3" name="txtCBSDateSpecimenCollected3" onchange="Valdate3a()" >
                                            </div>
                                            <label class="col-lg-1 control-label">Test Result</label>
                                            <div class="col-lg-1">
                                                <select class="form-control" name="txtCBSResult3" >
                                                    <option></option>
                                                    <option value="positive">Positive</option>
                                                    <option value="negative">Negative</option>
                                                    <option value="unknown">Unknown</option>
                                                </select>

                                            </div>
                                            <label class="col-lg-1 control-label">Test Result Date</label>
                                            <div class="col-lg-2">
                                                <input type="date" class="form-control" id="CBSResultDate3" name="txtCBSResultDate3" onchange="Valdate3b()">
                                            </div>
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
    <script>
    function format(input, format, sep) {
    var output = "";
    var idx = 0;
    for (var i = 0; i < format.length && idx < input.length; i++) {
        output += input.substr(idx, format[i]);
        if (idx + format[i] < input.length) output += sep;
        idx += format[i];
    }

    output += input.substr(idx);

    return output;
}

$('#creditCardText').keyup(function() {
    var foo = $(this).val().replace(/-/g, ""); 
    if (foo.length > 0) {
        foo = format(foo, [2, 2, 2, 1,  4, 5], "-");
    }
  
    
    $(this).val(foo);
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
            }
            else {

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
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate2a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSDateSpecimenCollected2").value;
            val3 = document.getElementById("CBSResultDate2").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate3a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("txtCBSDateSpecimenCollected3").value;
            val3 = document.getElementById("CBSResultDate3").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate4a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType1DateCollected").value;
            val3 = document.getElementById("CBSType1ResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate5a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType2DateCollected").value;
            val3 = document.getElementById("CBSType2ResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate6a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSType3DateCollected").value;
            val3 = document.getElementById("CBSType3ResultDate").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate7a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSSyphilisDateCollected1").value;
            val3 = document.getElementById("CBSSyphilisResultDate1").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
                alert("Error");
            }

        }

        function Valdate8a() {
            val1 = document.getElementById("CBSDateCompleted").value;
            val2 = document.getElementById("CBSSyphilisDateCollected2").value;
            val3 = document.getElementById("CBSSyphilisResultDate2").value;
            if (val1.value == "") {
                alert("PLEASE ENTER FORM COMPLETION DATE IN STEP 1");
            }
            else if (val1.value != "")
            {
                if (val2 > val1) {
                    alert("Date of specimen collection cannot be after form completion date");

                }
                else {

                }
            }
            else {
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

                }
                else {

                }
            }
            else {
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
                }
                else {

                    document.getElementById('part3').style.display = "none";

                }
            }
        }
        function showDiv4(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part4').style.display = "block";
                }
                else {

                    document.getElementById('part4').style.display = "none";

                }
            }
        }
        function showDiv5(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part5').style.display = "block";
                }
                else {

                    document.getElementById('part5').style.display = "none";

                }
            }
        }
        function showDiv6(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part6').style.display = "block";
                }
                else {

                    document.getElementById('part6').style.display = "none";

                }
            }
        }
        function showDiv7(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part7').style.display = "block";
                }
                else {

                    document.getElementById('part7').style.display = "none";

                }
            }
        }
        function showDiv8(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part8').style.display = "block";
                }
                else {

                    document.getElementById('part8').style.display = "none";

                }
            }
        }
        function showDiv9(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part9').style.display = "block";
                }
                else {

                    document.getElementById('part9').style.display = "none";

                }
            }
        }
        function showDiv10(elem) {
            if (elem.value == 'yes') {
                if (elem.checked) {
                    document.getElementById('part10').style.display = "block";
                }
                else {

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
                     }
        
        else {
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
                     }
        
        else {
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
                     }
        
        else {
        document.getElementById('part13a').style.display = "none";
                document.getElementById('part13b').style.display = "none";
                }
        }

    </script>

</body>
</html>
