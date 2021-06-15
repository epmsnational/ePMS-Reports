<%-- 
    Document   : vmmcProcedure1
    Created on : Oct 15, 2015, 6:35:34 PM
    Author     : Trevor
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>New VMMC Client</title>
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
                        VMMC Module
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
                                        You are about to fill Procedures for Patient <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.oPDNumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            VMMC CLIENT REGISTER
                        </header>
                        <div class="panel-body">
                            <div class="panel-heading " style="font-size: medium; font-weight: 900;">
                                Procedures
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
                                    <li id="default-title-3" class="">
                                        <div>Step 4</div>
                                    </li>
                                    <li id="default-title-4" class="">
                                        <div>Step 5</div>
                                    </li>
                                </ul>
                            </div>

                            <form class="form-horizontal" id="default" action="VmmcProcedure" method="post">
                                <fieldset title="Step1" class="step" id="default-step-0">
                                    <legend>Date & Personnel</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Date of Procedure:</label>
                                        <div class="col-lg-4">
                                            <input type="date" class="form-control" placeholder="enter date" name="txtDateOfProcedure">
                                            <input type="hidden" name ="txtVmmcId" value="${vmmcid}"/>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Circumciser's Name</label>
                                        <div class="col-lg-4">
                                            <select name="slctUserName" class="form-control">
                                                 <option> </option>
                                                <c:forEach items="${Setupstaff}" var="setupstaff">
                                                    <option id="slctUserName" value="${setupstaff.userName}"> ${setupstaff.userName}</option> 
                                                </c:forEach>

                                            </select>




                                            <%--<input type="text" class="form-control" placeholder=" enter circumciser's name" name="txtCircumcisersName">
                                            --%>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Assistant's Name :</label>
                                        <div class="col-lg-4">
                                            <select name="slctAssName" class="form-control">
                                                 <option> </option>
                                                <c:forEach items="${Setupstaff}" var="setupstaff">
                                                    <option id="slctAssName" value="${setupstaff.userName}"> ${setupstaff.userName}</option> 
                                                </c:forEach>

                                            </select>
                                        </div>
                                    </div>



                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1">
                                    <legend>For Surgical Method</legend>
                                    <legend></legend>
                                    <div class="form-group col-sm-12">


                                        <div class="col-sm-6">

                                            <table>
                                                <tr><td><label>Procedure Type:</label></td><td></td></tr>
                                                <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="rdForcepsGuided" id="rdForceps" value="ForcepsGuided" onchange="showDiv3(this)"/>Forceps guided&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="rdForcepsGuided" id="dorsalSlit" value="DorsalSlit" onchange="showDiv3(this)"/>Dorsal slit</td><td></td></tr>
                                                <tr><td><div  id="part1a" style = "Display : block;">&nbsp;&nbsp;&nbsp;&nbsp;Other specify&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="txtOtherSurgical"/></div></td></tr>
                                                <tr><td><label>Anaesthesia</label></td><td></td></tr>
                                                <tr><td>Local Anaesthetic (Fill in dose)</td><td></td></tr>
                                                <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;1% lignocaine&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="txt1Lignocaine"/>ml</td><td></td></tr>
                                                <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;2% lignocaine&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <input type="text" name="txt2Lignocaine"/>ml</td><td></td></tr>
                                                <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;0.5% Bupivacaine<input type="text" name="txtBupivacaine"/>ml</td><td></td></tr>
                                                <tr><td>Diathermy used&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="rdIsDiathermy" id="optYes" value="Yes" onchange="showDiv(this)">Yes<input type="radio" name="rdIsDiathermy" id="optNo" value="No" onchange="showDiv(this)">No</td><td>
                                                    </td></tr>
                                                <tr><td><div id="part1" style = "Display : none;">If Yes: Settings&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="txtDiathermySetting"/></div></td> <td></td> </tr>
                                                
                                            </table>

                                        </div>
                                        <div class="col-sm-6">
                                            <table>
                                                <tr><td></td></tr>
                                                <tr><td>Procedure start time:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="txtStartTime"/></td></tr>
                                                <tr><td></td></tr>
                                                <tr><td>Procedure end time:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="txtEndTime"/></td></tr>
                                                <tr><td>Clinical Notes:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
                                                <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="txtClinicalNotes" rows="8" cols="30" ></textarea></td></tr>
                                            </table>
                                        </div>

                                    </div>
                                </fieldset>                                  
                                <fieldset title="Step 3" class="step" id="default-step-1">
                                    <legend>Adverse Events(AEs)</legend>
                                    <legend></legend>
                                    <div class="col-sm-12">
                                        <table>
                                            <tr><td><input type="radio" id ="NoAdverse" value="NoAdverse" name="chkAdverse" onchange="showDiv2(this)"/></td><td>Client had NO adverse events diagonised during MC procedure/ placement visit (skip to post-procedure assessment)</td></tr>
                                            <tr><td><input type="radio" id ="Adverse" value="Adverse" name="chkAdverse"onchange="showDiv2(this)"/></td><td>Client had adverse event(s) diagonised during MC procedure/ placement visit (prior to discharge):</td></tr>
                                        </table>
                                         <div id="part3" style = "Display : none;">
                                        <table>
                                            <tr><td></td><td>Mild&nbsp;&nbsp;</td><td>Moderate&nbsp;&nbsp;</td><td>Severe&nbsp;&nbsp;</td></tr>
                                            <tr><td>Pain (A-PA)</td><td><input type="radio" name="rdIsPain" id="optMild" value="Mild"/></td><td><input type="radio" name="rdIsPain" id="optModerate" value="Moderate"/></td><td><input type="radio" name="rdIsPain" id="optSevere" value="Severe"/></td></tr>
                                            <tr><td>Bleeding (A-BL)</td><td><input type="radio" name="rdIsBleeding" id="optMild1" value="Mild"/></td><td><input type="radio" name="rdIsBleeding" id="optModerate" value="Moderate"/></td><td><input type="radio" name="rdIsBleeding" id="optSevere" value="Severe"/></td></tr>
                                            <tr><td>Anaesthetic-related problem(A-AN)</td><td><input type="radio" name="rdIsAnaesthetic" id="optMild2" value="Mild"/></td><td><input type="radio" name="rdIsAnaesthetic" id="optModerate" value="Moderate"/></td><td><input type="radio" name="rdIsrdIsAnaesthetic" id="optSevere" value="Severe"/></td></tr>
                                            <tr><td>Damage of penis (A-SD)</td><td><input type="radio" name="rdIsDamage" id="optMild3" value="Mild"/></td><td><input type="radio" name="rdIsDamage" id="optModerate" value="Moderate"/></td><td><input type="radio" name="rdIsDamage" id="optSevere" value="Severe"/></td></tr>
                                            <tr><td>Excess skin removal (A-SD)</td><td><input type="radio" name="rdIsSkinRemoval" id="optMild4" value="Mild"/></td><td><input type="radio" name="rdIsSkinRemoval" id="optModerate" value="Moderate"/></td><td><input type="radio" name="rdIsSkinRemoval" id="optSevere" value="Severe"/></td></tr>

                                        </table>
                                         </div>
                                    </div>
                                </fieldset>
                                <fieldset title="Step 4" class="step" id="default-step-1">
                                    <legend>Post Procedural Assessment</legend>

                                    <div class="col-sm-12">
                                        <div class="form-group col-sm-6">
                                            <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: left;">Vital signs</label>

                                                <table>

                                                    <tr><td>Blood Pressure&nbsp;&nbsp;&nbsp;<input type="text" name="txtBloodPressure" placeholder="mmHg"/></td></tr>
                                                    <tr><td>Pulse&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="txtPulse" placeholder="b/min"/></td></tr>

                                                    <tr><td>Appropriately Dressed:<input type="radio" name="rdIsDressed" id="optYes" value="Yes">Yes&nbsp;<input type="radio" name="rdIsDressed" id="optNo" value="No">No</td><td></td></tr>
                                                    <tr><td></td><td></td></tr>
                                                    <tr><td>Client provided post-procedure written instructions:<input type="radio" name="rdIsInstructions" id="optYes" value="Yes">Yes&nbsp;<input type="radio" name="rdIsInstructions" id="optNo" value="No">No</td><td></td></tr>
                                                    <tr><td></td><td></td></tr>
                                                    <tr><td>Client given MC card & instructed to return for next followup visit:<input type="radio" name="rdIsCard" id="optYes" value="Yes">Yes&nbsp;<input type="radio" name="rdIsCard" id="optNo" value="No">No</td><td></td></tr>
                                                    <tr><td></td><td></td></tr>

                                                </table>
                                            </div>
                                        </div> 
                                        <div class="form-group col-sm-6">
                                            <div class="checkbox">                                                                                

                                                <table>
                                                    <tr><td><label></label></td><td></td></tr>
                                                    <tr><td>Analgesia given:<input type="radio" name="rdIsAnalgesia" id="optYes" value="Yes" onchange="showDiv1(this)">Yes<input type="radio" name="rdIsAnalgesia" id="optNo" value="No" onchange="showDiv1(this)"/>No</td><td><div id ="part2" style="display: none;"><input type="text" name="txtAnalgesia" placeholder="Specify Drug "/></div></td></tr>
                                                    <tr><td><td></td></tr>
                                                    <tr><td>General condition:</td><td><input type="text" name="txtGeneralCondition"/></td></tr>
                                                   
                                                    <tr><td>Discharged by</td><td><input type="text" name="txtDischargedBy"/></td></tr>

                                                </table>

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
        <%@include file="/vmmcwizardjs.jsp" %>



        <%@include file="../footer.jsp" %>



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
            $(function () {
                $('#default').stepy({backLabel: 'Previous', block: true, nextLabel: 'Next', titleClick: true, titleTarget: '.stepy-tab'});
            });
        </script>
         <script type="text/javascript">
             
             function showDiv(elem){
	   if(elem.value == 'Yes'){
		  document.getElementById('part1').style.display = "block";
                  
                    }
                 
                  else{
                      document.getElementById('part1').style.display = "none";
                       
                    }
	} 
             function showDiv1(elem){
	   if(elem.value == 'Yes'){
		  document.getElementById('part2').style.display = "block";
                          }        
           else{
                      document.getElementById('part2').style.display = "none";
                    }
	} 
        function showDiv2(elem){
	   if(elem.value == 'Adverse'){
		  document.getElementById('part3').style.display = "block";
                          }        
           else{
                      document.getElementById('part3').style.display = "none";
                    }
	}
        
        function showDiv3(elem){
	   if(elem.value == 'ForcepsGuided'){
		  document.getElementById('part1a').style.display = "none";
                  
                    }
                 
                  else if(elem.value == 'DorsalSlit')
                  {
                      document.getElementById('part1a').style.display = "none";
                       
                    }
                    else{
                      document.getElementById('part1a').style.display = "block";
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

