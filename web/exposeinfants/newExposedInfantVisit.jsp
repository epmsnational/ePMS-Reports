<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>Exposed Infant Visit</title>
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
                        Exposed Infant Visit
                    </h2>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            New Exposed Infant Visit::You are about to fill visit for <a href="#" class="alert-link"><c:out value="${client.p.fullName}" />  </a> : with Exposed Infant Number <a href="#" class="alert-link"><c:out value="${client.p.exposedInfantId}" /></a>

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

                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="ExposedInfantVisit" method="POST">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend> Follow Up Visit</legend>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b>DATE OF VISIT:</b></div>
                                        <div class="col-lg-3">
                                            <input style="color: blue;" type="date" class="form-control" placeholder="review date" name="txtEIDateOfReview" required="true">
                                        </div>

                                        <div class="col-lg-2" style="color: blue;"><b> VISIT TYPE:</b></div>
                                        <div class="col-lg-3">
                                            <select name="txtEIVisitType" required="true" class="form-control" onchange="showDiv(this)">
                                                <option> </option>
                                                <option value="IM">IM:Infant And Mother  </option>
                                                <option value="IO">IO:Infant With Other Care Giver </option>
                                                <option value="T">Transit(Write Other Clinic Name) </option>


                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group" id ="part" style="display: none;" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b> Specify clinic name:</b></div>
                                        <div class="col-lg-3">
                                            <input style="color: blue;" type="text" class="form-control" placeholder="clinic name" name="txtEITransitClinicName" >
                                        </div>

                                    </div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b> INFANTS FEEDING TYPE:</b></div>
                                        <div class="col-lg-3">

                                            <select name="txtEIFeedingType" required="true" class="form-control" onchange="showDiv1(this)" >
                                                <option> </option>
                                                <option value="EBF">Exclusive Breast Feeding </option>
                                                <option value="EHTBM">Exclusive Heat Treated Breast Milk </option>
                                                <option value="ECIF">Exclusive Commercial Infant Formula </option>
                                                <option value="EMAM">Exclusive Modified Animal Milk </option>
                                                <option value="MF">Mixed Feeding </option>
                                                <option value="Other">Other </option>

                                            </select>
                                        </div>
                                        <div class="form-group" id ="part1" style="display: none;" style="color: blue;">
                                            <div class="col-lg-2" style="color: blue;"><b>Specify Feeding type:</b></div>
                                            <div class="col-lg-3">
                                                <input style="color: blue;" type="text" class="form-control" placeholder="other" name="txtEIOtherFeedingType" >
                                            </div>
                                        </div>


                                    </div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b> WEIGHT:</b></div>
                                        <div class="col-lg-3">
                                            <input style="color: blue;" type="number" class="form-control" placeholder="weight in kgs" name="txtEIWeight" >
                                        </div>
                                        <div class="col-lg-2" style="color: blue;"><b> IMMUNIZATION STATUS:</b></div>
                                        <div class="col-lg-3">

                                            <select name="txtEIImmunizationStatus" class="form-control" >
                                                <option> </option>
                                                <option value="1">Up To Date </option>
                                                <option value="-1">Not Up To Date </option>
                                            </select>
                                        </div>

                                    </div>

                                </fieldset>

                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>Prescriptions & Dispensing</legend>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" style="color: blue;"><b> COTRIMOXAZOLE SUPPLIED:</b></div>
                                        <div class="col-lg-3">
                                            <select style="color: blue; " name="txtEICotrimoxazoleSupplied" class="form-control" >
                                                <option> </option>
                                                <option value="Yes">Yes </option>
                                                <option value="No">No </option>
                                            </select>

                                        </div>
                                        <div class="col-lg-2" ><b> NVP SUPPLIED:</b>                                                    
                                        </div>
                                        <div class="col-lg-3">
                                            <select style="color: blue; " name="txtEINVP" class="form-control" >
                                                <option> </option>
                                                <option value="Yes">Yes </option>
                                                <option value="No">No </option>
                                            </select>

                                        </div>
                                    </div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" ><b> Type Of HIV Test Code:</b></div>
                                        <div class="col-lg-3">

                                            <select name="txtEIHIVTestCode" class="form-control" >
                                                <option> </option>
                                                <option value="V">Virological </option>
                                                <option value="A">Anti Body </option>
                                            </select>
                                        </div>
                                        <div class="col-lg-2" ><b>  HIV Test Result:</b></div>
                                        <div class="col-lg-3">
                                            <select style="color: blue;" name="txtEIHIVTestResult" class="form-control">
                                                <option> </option>
                                                <option value="Negative">Negative </option>
                                                <option value="Positive">Positive </option>
                                            </select>

                                        </div>
                                    </div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" ><b>  HIV Result Issued:</b>
                                        </div><div class="col-lg-3">
                                            <select name="txtEIHIVResultIssued" class="form-control" onchange="showDiv1(this)">
                                                <option> </option>
                                                <option value="Yes">Yes </option>
                                                <option value="No">No </option>
                                            </select>
                                        </div>
                                        <div class="col-lg-2" >
                                            <b> Next Review date</b>                                                    
                                        </div>
                                        <div class="col-lg-3">
                                            <input type="date"  style="color: blue; " class="form-control"  name="txtEINextReviewDate" />
                                        </div>
                                    </div>
                                    <div class="form-group" style="color: blue;">
                                        <div class="col-lg-2" ><b>  Exposed infant number</b>
                                        </div>
                                        <div class="col-lg-3">
                                            <div>
                                                <input type ="text" readonly="true" name="txtEINUmber" value="${EIID}">
                                            </div>
                                        </div>
                                        <div class="col-lg-2" ><b> COMMENTS:</b>                                                    
                                        </div>
                                        <div class="col-lg-3">
                                            <textarea  style="color: blue; " type="text" class="form-control" placeholder="PLEASE WRITE YOUR COMMENT" name="txtEIComment" ></textarea>
                                        </div>
                                    </div>

                                </fieldset>
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

    <script>
                $(function () {
                $('#default').stepy({
                backLabel: 'Previous',
                        block: true,
                        nextLabel: 'Next',
                        titleClick: true,
                        titleTarget: '.stepy-tab'});
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


    <script language="Javascript" type="text/javascript">
                function showDiv(elem) {
                if (elem.value == 'T') {
                document.getElementById('part').style.display = "block";
                } else {
                document.getElementById('part').style.display = "none";
                }
                }
        function showDiv1(elem) {
        if (elem.value == 'Other') {
        document.getElementById('part1').style.display = "block";
        } else {
        document.getElementById('part1').style.display = "none";
        }
        }


    </script>
</body>

</html>
