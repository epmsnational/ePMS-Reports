<%-- 
    Document   : reportArtCbs
    Created on : Jun 15, 2021, 9:37:01 AM
    Author     : ignatious
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>CBS Reports::ePMS</title>
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
                        CASE BASE SURVEILLANCE REPORT
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">

                        </header>
                        <div class="container" style="margin-left: 15%">
                            <div class="row">
                                <div class="col-xs-6" style="background-color: grey;width: 100%">
                                    <form class="form-horizontal" name="txtDate" id="default" action="ArtSectionDReport"  method="POST">

                                        <legend> Choose The Desired Period</legend>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-4" style="color: blue;"><b>CHOOSE REPORTING PERIOD:</b></div>
                                            <div class="col-lg-4">
                                                <input style="color: blue;" type="date" class="form-control" placeholder="start date" id="txtRptStartDate" name="txtRptStartDate" >
                                            </div>

                                        </div>
                                        <div style="margin: 0 auto;width: 100px">
                                            <input type="submit" class="finish btn btn-info"  value="Generate" />
                                        </div>
                                    </form>
                                </div>
                            </div>
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
        $(document).on("submit", "#default", function (event) {
        var $form = $(this);
                jConfirm('Are you sure to save?', 'Save', 'Cancel', function (r) {
                if (r == true)
                {
                $.post($form.attr("action"), $form.serialize(), function (response) {
                document.getElementById("default").reset();
                        return false;
                }
                });
                        // ...

                }
                );
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
                $(document).ready(function ()
        {
        $('#dob').focusout(function (event) {
        var computedAge = $('#dob').val();
                $.get('AddPatientServlet', {dob: computedAge}, function (responseText)
                {
                $('#theAge').val(responseText);
                });
        });
        });
                $(document).ready(function ()
        {
        $('#theAge').focusout(function (event) {
        var computeDob = $('#theAge').val();
                $.get('AddPatientServlet', {dobAge: computeDob}, function (responseText)
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
        } else {
        document.getElementById('div4').style.display = "none";
        }
        }
        function showDiv5(elem) {
        if (elem.value == 'P') {
        document.getElementById('visitVal1').style.display = "block";
        } else if (elem.value == 'D') {

        document.getElementById('visitVal1').style.display = "none";
        }

        else if (elem.value == 'E') {
        document.getElementById('visitVal1').style.display = "none";
        }
        else {
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

        else {
        document.getElementById('visitclinical').style.display = "none";
                document.getElementById('visitrefill').style.display = "none";
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
                document.getElementById('div24').style.display = "block";
                document.getElementById('div25').style.display = "block";
        }
        else {

        document.getElementById('div23').style.display = "none";
                document.getElementById('div24').style.display = "none";
                document.getElementById('div25').style.display = "none";
        }
        }
        }
        function showDiv8(elem) {
        if (elem.value == 'TO') {
        document.getElementById('div9').style.display = "block";
        }

        else {
        document.getElementById('div9').style.display = "none";
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





    <script>
        function validate(){

        var OIARVQuantityPrescribed = document.visitForm.txtOIARVQuantityPrescribed.value;
                var OIARVQuantityDispensed = document.visitForm.txtOIARVQuantityDispensed.value;
                //var whostagging = document.visitForm.slcOIWhoClinicalStage.value;
                // var prevarvstatus = document.visitForm.txtPrevARVStaus.value;
                //var prevarvregimen = document.visitForm.txtPrevARVRegimen.value;
                //var prevwhostagging = document.visitForm.txtPrevWHOStage.value;

                if (OIARVQuantityPrescribed == OIARVQuantityDispensed){
        alert("The right procures were followed");
                document.visitForm.txtOIARVQuantityDispensed.focus();
                return false;
        } else{
        alert("The medication prescribed does not match the Quantity dispensed");
                return true;
        }
    </script>

</script>
</body>

</html>

