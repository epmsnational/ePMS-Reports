<%-- 
    Document   : vmmcPostProcedureVisit
    Created on : Oct 20, 2015, 6:35:34 PM
    Author     : Trevor
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>VMMC:: Post Procedure Visit</title>
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
                        Post Procedure
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
                                        Post-Circumcision visit <a href="#" class="alert-link"><c:out value="${client.p.firstName}" />  <c:out value="${client.p.lastName}" /></a> VMMC NUMBER <a href="#" class="alert-link"><c:out value="${client.p.vmmcId}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            <h3>
                                ${plan.visitPlanDescri} [${plan.visitPlanDate}]
                            </h3>
                        </header>

                        <div id="page-heading">
                            <ol class="breadcrumb">
                                <li class='active'><a href="dashboard/dashboard">Home</a></li>
                            </ol>


                            <div class="options">
                                <div class="btn-toolbar">


                                    <a href="#" class="btn btn-muted hidden-xs"><i class="icon-cog"></i></a>
                                </div>
                            </div>
                        </div>

                        <form class="form-horizontal" id="default" action="VmmcPostProcedure" method="post"> 
                            <div class="container">
                                <div class="col-md-6">
                                    <div class="panel gray">
                                        <div class="panel-heading">
                                            <h4></h4>
                                            <div class="options">
                                                <a href="javascript:;"><i class="icon-cog"></i></a>
                                                <a href="javascript:;"><i class="icon-wrench"></i></a> 
                                                <a href="javascript:;" class="panel-collapse"><i class="icon-chevron-down"></i></a>
                                            </div>
                                        </div>
                                        <div class="panel-body collapse in">
                                            <div class="table-responsive" style="overflow-x:auto">
                                                <table class="table">

                                                    <tbody class="selects">
                                                        <tr>
                                                            <td>Date:&nbsp;&nbsp;&nbsp;</td>
                                                            <td><input type="date" name="txtVisitDate"></td>
                                                            <td></td>

                                                        </tr>
                                                        <tr>
                                                            <td>Visit Interval:</td>
                                                            <td>
                                                                <c:choose>
                                                                    <c:when test="${checking=='late'}">
                                                                        <input type="radio" name="rdIsInterval" value="Late" checked="true">Late (LT) &nbsp;&nbsp;
                                                                    </c:when>
                                                                    <c:when test="${checking=='ontime'}">
                                                                        <input type="radio" name="rdIsInterval" value="On Time" checked="true" >On Time (OT)&nbsp;&nbsp;
                                                                    </c:when>
                                                                    <c:when test="${checking=='before'}">
                                                                        <input type="radio" name="rdIsInterval" value="Before" checked="true">Before (BF)
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                    </c:otherwise>
                                                                </c:choose>

                                                                
                                                            </td>
                                                            <td><input type="hidden" name="pId" value="${plan.vpId}"</td>

                                                        </tr>
                                                        <tr>
                                                            <td>Name of nurse/ doctor</td>
                                                            <td><select name="slctUserName" class="form-control">
                                                                     <option> </option>
                                                                    <c:forEach items="${Setupstaff}" var="setupstaff">
                                                                        <option id="slctUserName" value="${setupstaff.userName}"> ${setupstaff.userName}</option> 
                                                                    </c:forEach>

                                                                </select></td>
                                                            <td></td>

                                                        </tr>
                                                        <tr>
                                                            <td>Any adverse Event at this visit?</td>
                                                            <td><input type="radio" name="rdIsAdverse" value="Yes" onchange="showDiv(this)">Yes&nbsp;&nbsp;<input type="radio" name="rdIsAdverse" value="No" onchange="showDiv(this)">No</td>
                                                            <td></td>

                                                        </tr>
                                                        <tr>
                                                            <td><div id ="part1" style="display: none;">If Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AE code:</div></td>
                                                            <td><div id ="part1a" style="display: none;"><select name="slctAdverseEvent" class="form-control">
                                                                         <option> </option>
                                                                        <c:forEach items="${Adverseeventtype}" var="adverseeventtype">
                                                                            <option id="slctAdverseEvent" value="${adverseeventtype.adverseEventName}"> ${adverseeventtype.adverseEventName}</option> 
                                                                        </c:forEach>

                                                                    </select></div></td>
                                                            <td></td>

                                                        </tr>
                                                        <tr>
                                                            <td><div id ="part1b" style="display: none;">Severity</div></td>
                                                            <td><div id ="part1c" style="display: none;"><input type="radio" name="rdIsSeverity" value="Mild">Mild&nbsp;&nbsp;<input type="radio" name="rdIsSeverity" value="Moderate">Moderate&nbsp;&nbsp;<input type="radio" name="rdIsSeverity" value="Severe">Severe</div></td>
                                                            <td></td>
                                                            <td></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Wound healing complete?</td>
                                                            <td><input type="radio" name="rdIsWound" value="woundYes"  onchange="showDiv1(this)">Yes&nbsp;&nbsp;<input type="radio" name="rdIsWound"  value="woundNo" onchange="showDiv1(this)">No</td>


                                                        </tr>
                                                        <tr>
                                                            <td><div id ="part2" style="display: none;">&nbsp;&nbsp;&nbsp;If No, additional visit date:&nbsp;&nbsp;&nbsp;</div></td>
                                                            <td><div id ="part2a" style="display: none;"><a href="AdditionalVisit">  <span class="btn btn-danger">Additional Visit</span></a></div></td>


                                                        </tr>
                                                       

                                                    </tbody>

                                                </table> 

                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="panel gray">
                                        <div class="panel-heading">
                                            <h4></h4>
                                            <div class="options">
                                                <a href="javascript:;"><i class="icon-cog"></i></a>
                                                <a href="javascript:;"><i class="icon-wrench"></i></a> 
                                                <a href="javascript:;" class="panel-collapse"><i class="icon-chevron-down"></i></a>
                                            </div>
                                        </div>
                                        <div class="panel-body collapse in">
                                            <div class="table-responsive" style="overflow-x:auto" id ="part2b" style="display: none;">
                                                
                                                <table class="table">

                                                    <tbody class="selects">
                                                         <tr>
                                                            <td>Resumed sexual activity &nbsp;&nbsp;<input type="radio" name="rdIsResumedSA" value="resumedYes"onchange="showDiv2(this)">Yes<input type="radio" name="rdIsResumedSA" value="resumedNo" onchange="showDiv2(this)">No</td>


                                                        </tr>
                                                        <tr>
                                                            <td><div id ="part3" style="display: none;">If Yes, number of weeks:</div></td>
                                                            <td><div id ="part3a" style="display: none;"><input type="text" name="txtResumedSA"></div></td>


                                                        </tr>

                                                        <tr>
                                                            <td>Counseled to reduce sexual risk:&nbsp;&nbsp;<input type="radio" name="rdIsCounseled" value="counseledYes" onchange="showDiv3(this)">Yes&nbsp;&nbsp;<input type="radio" name="rdIsCounseled" value="counseledNo" onchange="showDiv3(this)">No</td>



                                                        </tr>
                                                        <tr>
                                                            <td><div id ="part4" style="display: none;">&nbsp;&nbsp;If Yes, Risk reduction plan (Tick all applicable)</div></td>


                                                        </tr>
                                                    </tbody>

                                                </table> 
                                                <table class="table">
                                                    
                                                    <tbody class="selects">
                                                    
                                                        <tr>
                                                    <div class="form-group col-sm-6"id ="part4a" style="display: none;">
                                                        <div class="checkbox">                                                                                

                                                            <c:forEach items="${Riskreductionplantype}" var="riskreductionplantype">
                                                                <label>
                                                                    <input type="checkbox" id="ckRefferals" name="ckRiskreductionplantype" value="${riskreductionplantype.id}"> ${riskreductionplantype.riskReductionName}
                                                                </label>
                                                            </c:forEach>
                                                            <input type="text" class="form-control" placeholder="Other Specify" name="txtSpecifyReferral">
                                                        </div>
                                                    </div>
                                                    </tr>
                                                    
                                                    </tbody>
                                                    
                                                </table> 

                                            </div>
                                        </div>
                                    </div>
                                </div>
                                 <input type="submit" class="finish btn btn-danger" value="Finish"/>
                            </div>
                           
                        </form>




                    </section>
                </section>
            </div><!-- /.content-wrapper -->
            <%@include file="../footer.jsp" %>
        <!-- ./wrapper -->
        <%@include file="../scripts.jsp" %> 

        
        <!-- page-container -->

        <!--
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
        
        <script>!window.jQuery && document.write(unescape('%3Cscript src="assets/js/jquery-1.10.2.min.js"%3E%3C/script%3E'))</script>
        <script type="text/javascript">!window.jQuery.ui && document.write(unescape('%3Cscript src="assets/js/jqueryui-1.10.3.min.js'))</script>
        -->




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
                if (elem.value == 'Yes') {
                    document.getElementById('part1').style.display = "block";
                    document.getElementById('part1a').style.display = "block";
                    document.getElementById('part1b').style.display = "block";
                    document.getElementById('part1c').style.display = "block";
                }

                else {
                    document.getElementById('part1').style.display = "none";
                    document.getElementById('part1a').style.display = "none";
                    document.getElementById('part1b').style.display = "none";
                    document.getElementById('part1c').style.display = "none";

                }
            }
            function showDiv1(elem) {
                if (elem.value == 'woundYes') {
                    document.getElementById('part2').style.display = "none";
                    document.getElementById('part2a').style.display = "none";
                    document.getElementById('part2b').style.display = "block";
                }

                else {

                    document.getElementById('part2').style.display = "block";
                    document.getElementById('part2a').style.display = "block";
                    document.getElementById('part2b').style.display = "none";
                }
            }
            function showDiv2(elem) {
                if (elem.value == 'resumedYes') {

                    document.getElementById('part3').style.display = "block";
                    document.getElementById('part3a').style.display = "block";

                }

                else {
                    document.getElementById('part3').style.display = "none";
                    document.getElementById('part3a').style.display = "none";

                }
            }
            function showDiv3(elem) {
                if (elem.value == 'counseledYes') {

                    document.getElementById('part4').style.display = "block";
                    document.getElementById('part4a').style.display = "block";

                }

                else {
                    document.getElementById('part4').style.display = "none";
                    document.getElementById('part4a').style.display = "none";

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

