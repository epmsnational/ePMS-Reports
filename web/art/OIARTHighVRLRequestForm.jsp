<%-- 
    Document   : OIARTHighVRLRequestForm
    Created on : Dec 4, 2019, 8:34:52 AM
    Author     : devoop
--%>

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
                    <h2>
                        HIGH VIRAL Data Capturing
                    </h2>
                </section>

                <!-- Main content -->
                <section class="content">
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            HIGH VIRAL MODULE
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                HIGH Viral FORM
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
                            <form class="form-horizontal" id="default" action="ARTHighVRLForm" method="post">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend>Enhanced Adherence Counselling (EAC) </legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">OI/ART Number :</label>
                                        <div class="col-lg-4">
                                            <input readonly="readonly" type="text" class="form-control"  name="artNumber" value="<c:out value="${patientID.patientId}"/>">
                                        </div>
                                        <label class="col-lg-2 control-label">First Session</label>
                                        <div class="col-lg-4">
                                            <select class="form-control" name="txtfirstSession" onchange="showDiv(this)">
                                                <option></option>
                                                <option value="1">Done</option>
                                                <option value="0">Not Done</option>

                                            </select>
                                        </div>     
                                    </div>
                                    <br> <br>
                                    <div class="form-group" id="part1" style="display: none;">
                                        <div class="form-group">
                                            <label class="col-lg-4 control-label">FIRST COUNSELLING</label>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Date of First Session :</label>
                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="firstSessionDate" >
                                            </div>

                                            <label class="col-lg-2 control-label" >Summary </label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="firstSessionSummary">
                                            </div>

                                            <label class="col-lg-2 control-label" >ARV intake demonstration by Patient</label>
                                            <div class="col-lg-4">
                                                <select class="form-control"  name="arvIntake" >
                                                    <option></option>
                                                    <option value="yes">Yes</option>
                                                    <option value="no">No</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Second Session</label>
                                            <div class="col-lg-4">
                                                <select class="form-control" name="secondSession" onchange="showDiv(this)">
                                                    <option></option>
                                                    <option value="2">Done</option>
                                                    <option value="0">Not Done</option>

                                                </select>
                                            </div> 
                                        </div>
                                    </div>
                                    <br> <br>
                                    <div class="form-group" id="part2" style="display: none;">
                                        <div class="form-group">
                                            <label class="col-lg-4 control-label">SECOND COUNSELLING</label>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Date of Second(2nd) Session :</label>
                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="secondSessionDate" >
                                            </div>
                                            <label class="col-lg-2 control-label" >Summary </label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="secondSessionSummary">
                                            </div>
                                            <label class="col-lg-2 control-label" >ARV intake demonstration by Patient</label>
                                            <div class="col-lg-4">
                                                <select class="form-control"  name="arvIntake2" >
                                                    <option></option>
                                                    <option value="yes">Yes</option>
                                                    <option value="no">No</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Extra Session</label>
                                            <div class="col-lg-4">
                                                <select class="form-control" name="extraSession" onchange="showDiv(this)">
                                                    <option></option>
                                                    <option value="3">Done</option>
                                                    <option value="0">Not Done</option>

                                                </select>
                                            </div>   
                                        </div>
                                    </div>
                                    <br> <br>
                                    <div class="form-group" id="part3" style="display: none;">
                                        <div class="form-group">
                                            <label class="col-lg-4 control-label">EXTRA COUNSELLING</label>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Date of Extra Session :</label>
                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="extraSessionDate" >
                                            </div>

                                            <label class="col-lg-2 control-label" >Summary </label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="extraSessionSummary">
                                            </div>

                                            <label class="col-lg-2 control-label" >ARV intake demonstration by Patient</label>
                                            <div class="col-lg-4">
                                                <select class="form-control"  name="arvIntake3" >
                                                    <option></option>
                                                    <option value="yes">Yes</option>
                                                    <option value="no">No</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Date of Collection of Repeated VL :</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control"  name="repeatedVlDate" >
                                        </div>
                                        <label class="col-lg-2 control-label">Name of Counsellor :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control"  name="counsellorName" >
                                        </div>

                                        <label class="col-lg-3 control-label">Date of Assessment :</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control"  name="assessmentDate" >
                                        </div>

                                    </div>
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend>OUTCOME</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Repeat Viral Load Result :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control"  name="viralLoadResult" >
                                        </div>

                                        <label class="col-lg-2 control-label" >Regarding ARV regimen, what is the Plan?</label>
                                        <div class="col-lg-4">
                                            <select class="form-control"  name="arvRegimenValuation" >
                                                <option></option>
                                                <option value="continue">Continue current regimen</option>
                                                <option value="refer to doctor">Refer to Doctor for further management</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Name of Nurse :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control"  name="nurseName" >
                                        </div>

                                        <label class="control-label col-xs-3">Date of Assessment :</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control"  name="nurseAssessmentDate" >
                                        </div>
                                    </div>
                                </fieldset>    
                                <fieldset title="Step 3" class="step" id="default-step-2">
                                    <legend>OUTCOME (Persistent Higher Viral)</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" >What is the Plan for this Patient?</label>
                                        <div class="col-lg-4">
                                            <select class="form-control"  name="RegimenValuation" >
                                                <option></option>
                                                <option value="New regimen">Patient is suitable for Second line Regimen</option>
                                                <option value="Extend">Extend Adherence Session before new Viral Load(2-3 months)</option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label">Comment :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control"  name="comment" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Name of Doctor :</label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control"  name="doctorName" >
                                        </div>
                                        <label class="control-label col-xs-3">Date :</label>
                                        <div class="col-lg-3">
                                            <input type="date" class="form-control"  name="doctorDate" >
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
        function showDiv(elem) {
            if (elem.value == '1') {
                document.getElementById('part1').style.display = "block";
                document.getElementById('part1a').style.display = "block";
                document.getElementById('part2').style.display = "none";
                document.getElementById('part3').style.display = "none";
            } else if (elem.value == '2') {
                document.getElementById('part1').style.display = "block";
                document.getElementById('part2').style.display = "block";
                document.getElementById('part1a').style.display = "block";
                document.getElementById('part3').style.display = "none";
            }
            else if (elem.value == '3') {
                document.getElementById('part1').style.display = "block";
                document.getElementById('part2').style.display = "block";
                document.getElementById('part3').style.display = "block";
                document.getElementById('part1a').style.display = "block";
            }
            else {
                document.getElementById('part1').style.display = "none";
                document.getElementById('part2').style.display = "none";
                document.getElementById('part3').style.display = "none";
                document.getElementById('part1a').style.display = "none";
            }
        }


    </script>

</body>
</html>

