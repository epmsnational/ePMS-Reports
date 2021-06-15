<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Syphilis Exposed Infant</title>
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
                                        You are about to fill new Syphilis Exposed Infant <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            Syphilis Exposed Infant
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
                            <form class="form-horizontal" id="default" action="STIcSExposedInfant" method="POST">
                                <fieldset title="Step 1" class="step" id="default-step-0">
                                    <legend> Infant Details</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label"  style="color: blue">Patient Number</label>
                                        <div class="col-lg-4">
                                            <input  type="hidden" class="form-control"  name="txtOPDNumber" value="<c:out value="${patient.opdnumber}"/>" readonly="readonly">
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Infant Number</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="Infant Number" name="txtInfantNumber">
                                        </div>

                                    </div>  
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Mother</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="MotherOPDNumber" name="txtMotherOPDNumber">
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend> Examinations</legend>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label"  style="color: blue">Infant/Child Examination</label>
                                        <div class="col-lg-2">                           
                                            <select name="txtChildExamination" class="form-control" onchange="showDiv(this)">

                                                <<option > </option>
                                                <option value="Placenta"> Placenta</option>
                                                <option value="Umbilical Cord">Umbilical Cord</option>
                                                <option value="Not Done">Not Done</option>
                                            </select>
                                        </div>
                                        <div id="div1a" style = "Display : none;">
                                            <label class="col-lg-1 control-label"  style="color: blue">Examination</label>
                                            <div class="col-lg-2">                           
                                                <select name="txtExamination" class="form-control" onchange="showDiv1(this)">

                                                    <<option > </option>
                                                    <option value="Darkfield"> Darkfield</option>
                                                    <option value="DFA">DFA</option>
                                                    <option value="SpecialStains"> Special Stains</option>

                                                </select>
                                            </div>
                                            <div id="div3a" style = "Display : none;">
                                                <label class="col-lg-1 control-label" style="color: blue">Result</label>
                                                <div class="col-lg-2">                                               
                                                    <select name="txtExaminationResult" class="form-control">
                                                        <option > </option>
                                                        <option value="Positive"> Positive</option>
                                                        <option value="Negative">Negative</option>
                                                        <option value="Unknown"> Unknown</option>
                                                    </select>

                                                </div>
                                            </div>
                                        </div> </div>  

                                    <div class="form-group" id="div1b" style = "Display : none;">
                                        <label class="col-lg-2 control-label" style="color: blue">Infant Non treponemal Test Result</label>
                                        <div class="col-lg-2">                                              
                                            <select name="txtNonTreponemaltest" class="form-control" onchange="showDiv2(this)">
                                                <option > </option>
                                                <option value="Reactive">Reactive</option>
                                                <option value="NonReactive">Non-Reactive</option>
                                                <option value="Unknown">Unknown</option>
                                            </select>

                                        </div>
                                        <div id="div2a" style = "Display : none;">
                                            <label class="col-lg-2 control-label" style="color: blue">Does the Infant have any of the following </label>
                                            <div class="col-lg-4">

                                                <div class="checkbox">                                                                                

                                                    <c:forEach items="${cssignlist}" var="sign">
                                                        <label>
                                                            <input type="checkbox" id="cksign" name="chkSignsOfCongenitalSyphilis" value="${sign.description}"> ${sign.description}
                                                        </label>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-1 control-label" style="color: blue">Final Outcome</label>
                                        <div class="col-lg-3">                                              
                                            <select name="txtFinalOutcome" class="form-control">
                                                <option > </option>
                                                <option value="ProbableCase">Probable Case</option>
                                                <option value="NotACase">Not A Case</option>
                                                <option value="Confirmed Case">Confirmed Case</option>

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

            });
        </script>



        <script language="Javascript" type="text/javascript">

            function showDiv(elem) {
                if (elem.value == 'Placenta') {

                    document.getElementById('div1a').style.display = "block";
                    document.getElementById('div1b').style.display = "none";
                } else if (elem.value == 'Umbilical Cord') {
                    document.getElementById('div1a').style.display = "block";
                    document.getElementById('div1b').style.display = "none";


                } else if (elem.value == 'Not Done') {
                    document.getElementById('div1a').style.display = "none";
                    document.getElementById('div1b').style.display = "block";


                } else {
                    document.getElementById('div1a').style.display = "none";
                    document.getElementById('div1b').style.display = "none";
                }
            }
            function showDiv1(elem) {
                if (elem.value == 'Darkfield') {

                    document.getElementById('div3a').style.display = "block";

                } else if (elem.value == 'DFA') {
                    document.getElementById('div3a').style.display = "block";
                } else if (elem.value == 'SpecialStains') {
                    document.getElementById('div3a').style.display = "block";
                } else {
                    document.getElementById('div3a').style.display = "none";
                }
            }

            function showDiv2(elem) {

                if (elem.value == ' ') {
                    document.getElementById('=div2a').style.display = "none";

                } else if (elem.value == 'Reactive') {
                    document.getElementById('div2a').style.display = "block";
                }
                else if (elem.value == 'NonReactive') {
                    document.getElementById('div2a').style.display = "none";
                }
                else if (elem.value == 'Unknown') {
                    document.getElementById('div2a').style.display = "none";
                }
                else {
                    document.getElementById('div2a').style.display = "none";
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

