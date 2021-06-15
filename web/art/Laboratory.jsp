<%-- 
    Document   : Laboratory
    Created on : Jun 22, 2020, 11:39:06 AM
    Author     : chihw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Laboratory Results</title>
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
                            Laboratory Tests
                        </h1>
                    </section>

                    <!-- Main content -->
                    <section class="content">
                        <section class="panel panel-primary">
                            <header class="panel-heading">
                                LABORATORY MODULE
                            </header>
                            <div class="panel-body">
                                <div class="panel-heading " style="font-size: medium; font-weight: 900">
                                    Lab Results FORM
                                </div>
                                <div class="stepy-tab">
                                    <ul id="default-titles" class="stepy-titles clearfix">
                                        <li id="default-title-0" class="current-step">
                                            <div>Step 1</div>
                                        </li>
                                    </ul>
                                </div>
                                <form class="form-horizontal" id="default" action="ArtLaboratory" method="post">

                                    <fieldset title="Step 1" class="step" id="default-step-0">
                                        <legend>OUTCOME</legend>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Patient ID :</label>
                                            <div class="col-lg-4">
                                                <input readonly="readonly" type="text" class="form-control"  name="Resultpatientid" value="<c:out value="${patient.patientId}"/>">
                                            </div>

                                            <label class="col-lg-2 control-label" >Test Type</label>
                                            <div class="col-lg-4">
                                                <select class="form-control"  name="Resultteststype" >
                                                    <option></option>
                                                    <option value="VRL">Viral Load</option>
                                                    <option value="CD4">CD4 Count</option>
                                                    <option value="CD%">CD4 Percentage</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-xs-3">Test Date :</label>
                                            <div class="col-lg-3">
                                                <input type="date" class="form-control"  name="testDate" >
                                            </div>
                                            <label class="col-lg-2 control-label">Facility Received Date :</label>
                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="facreceivedDate" >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-xs-3">Patient Received Date :</label>
                                            <div class="col-lg-3">
                                                <input type="date" class="form-control"  name="patreceivedDate" >
                                            </div>
                                            <label class="col-lg-2 control-label">Result :</label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="result" >
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

    </body>
</html>


