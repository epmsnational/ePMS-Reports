<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>Update Patient Status</title>
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
                        OI/ART Visit
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            Updating follow up status for <a href="#" class="alert-link"><c:out value="${patient.firstName}" />  <c:out value="${patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${patient.patientId}" /></a>

                        </header>
                        <div class="panel-body">

                            <div class="stepy-tab">
                                <ul id="default-titles" class="stepy-titles clearfix">
                                    <li id="default-title-0" class="current-step">
                                        <div>Step 1</div>
                                    </li>

                                </ul>
                            </div>
                            <form class="form-horizontal" name="followUpForm" id="default" action="ArtUpdateFolloUpStatus" method="POST">

                                <fieldset title="Step 1" class="step" id="default-step-1" >
                                    <legend>Update follow up status</legend>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label"><b>Follow up Status:</b></label>
                                        <div class="col-lg-4">
                                            <select name="slcFollowUpStatus" class="form-control" onchange="showDiv(this)">
                                                <option> </option>
                                                <c:forEach var="followupstat" items="${followupstatus}">
                                                    <option value="${followupstat.statusCode}">${followupstat.status}</option>
                                                </c:forEach>

                                            </select>

                                        </div>
                                        <div id ="div9" style="display: none;"> 

                                            <label class="col-lg-2 control-label"><b>Transfer out Facility:</b></label>
                                            <div class="col-lg-4">

                                                <select name="slcOITransferredTo" class="form-control">
                                                    <option> </option>
                                                    <c:forEach var="facility" items="${failitylist}">
                                                        <option value="${facility.provinceCode}-${facility.districtCode}-${facility.facilityCode}">${facility.facilityName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label"><b>Notes:</b></label>
                                        <div class="col-lg-4">
                                            <input  type="text" class="form-control"  name="txtNotes">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color:black">Status Date </label>
                                        <div class="col-lg-2">
                                            <input style="color: blue;" type="date" class="form-control" placeholder="date" name="txtDate" required="required" >
                                        </div>

                                    </div>                                      
                                    <input type="submit" name="action" onclick="return validate()" class="finish btn btn-danger"  value="Save"/>

                                </fieldset>    

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

     //step wizard

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

    <script language="javascript">
        window.onload = function () {
            document.forms[0].reset();
            placeFocus();
        }
        function placeFocus() {
            document.forms[0].elements[0].focus(); // assuming the first element
        }
    </script>
    <script language="javascript">
        function showDiv(elem) {
            if (elem.value == 'TO') {
                document.getElementById('div9').style.display = "block";
            }

            else {
                document.getElementById('div9').style.display = "none";
            }
        }
    </script>
</body>

</html>
