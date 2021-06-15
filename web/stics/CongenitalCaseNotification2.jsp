<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Congenital Case Notification</title>
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
                                        You are about to fill new Congenital Case Notification Form <a href="#" class="alert-link"><c:out value="${Patient.firstName}" />  <c:out value="${Patient.lastName}" /></a> : with OPD Number <a href="#" class="alert-link"><c:out value="${Patient.opdnumber}" /></a>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            Congenital Syphilis Case Report
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
                                    <li id="default-title-2" class="">
                                        <div>Step 3</div>
                                    </li>
                                    <li id="default-title-3" class="">
                                        <div>Step 4</div>
                                    </li>
                                    <li id="default-title-4" class="">
                                        <div>Step 5</div>
                                    </li> 
                                    <li id="default-title-5" class="">
                                        <div>Step 6</div>
                                    </li> 
                                </ul>
                            </div>
                            <form class="form-horizontal" id="default" action="STICS" method="POST">
                                <fieldset title="Step 1" class="step" id="default-step-0">
                                    <legend> Facility Details</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label"  style="color: blue">Report date to health dept.</label>
                                        <div class="col-lg-4">
                                            <input  type="date" class="form-control"  name="txtDateofReport" >
                                        </div>
                                        <label class="col-lg-2 control-label" style="color: blue">Reporting Facility</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" placeholder="ReportingFacility" name="txtReportingFacility">
                                        </div>
                                    </div>  
                                </fieldset>
                                <fieldset title="Step 2" class="step" id="default-step-1" >
                                    <legend>   Maternal Information</legend>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Mother's Name</label>
                                            <div class="col-lg-4">
                                                <input  type="text" class="form-control"  name="txtMothersName" >
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">Mother's Physical Address</label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control" placeholder="MothersAddress" name="txtMothersAddress">
                                            </div>
                                        </div>                
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Mother's Date of birth</label>
                                            <div class="col-lg-4">
                                                <input  type="date" class="form-control"  name="txtMothersDOB" >
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">Mother's Obstetric history(Gravida)</label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control" placeholder="MothersObsHistoryGravida" name="txtMothersObsHistoryGravida">
                                            </div>
                                        </div>                
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Mother's Obstetric history(Parity)</label>
                                            <div class="col-lg-4">
                                                <input  type="text" class="form-control" placeholder="MothersObsHistoryParity" name="txtMothersObsHistoryParity" >
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">LMP Before Delivery Date</label>
                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="txtLMPBeforeDelivery">
                                            </div>
                                        </div>                
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Mother's Religion</label>
                                            <div class="col-lg-4">
                                                <input  type="text" class="form-control" placeholder="Mothers Religion" name="txtMothersReligion" >
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">Date of first prenatal visit</label>
                                            <div class="col-lg-4">
                                                <input type="date" class="form-control"  name="txtFirstPrenatalVisit">
                                            </div>
                                        </div>                
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Trimester of first prenatal Visit</label>
                                            <div class="col-lg-4">                           
                                                <select name="txtTrimesterFirstPrenatalVisit" class="form-control">
                                                    <option> </option>
                                                    <option value="1st"> 1st Trimester</option>
                                                    <option value="2nd">2nd Trimester </option>
                                                    <option value="3rd"> 3rd Trimester</option>
                                                    <option value="unk">Unknown</option>
                                                </select>
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">Mother HIV status during Pregnancy</label>
                                            <div class="col-lg-4">                                               
                                                <select name="txtMotherHIVStatusDuriPreg" class="form-control">
                                                    <option > </option>
                                                    <option value="P"> Positive</option>
                                                    <option value="N">Negative </option>
                                                    <option value="X"> Patient Not Tested</option>
                                                    <option value="U">Unknown</option>
                                                </select>
                                            </div>
                                        </div>                
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Mother's Marital Status</label>
                                            <div class="col-lg-4">         
                                                <select name="txtMothersMaritalStatus" class="form-control">
                                                    <option > </option>
                                                    <option value="1"> Single never married</option>
                                                    <option value="2">Married </option>
                                                    <option value="3">Separated Divorced</option>
                                                    <option value="4">Widow</option>
                                                    <option value="8"> Other</option>
                                                    <option value="9">Unknown</option>
                                                </select>
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">:Time of Receiving Benzathine Penicillin</label>
                                            <div class="col-lg-4">                                               
                                                <select name="txtPeriodReceivingBenzathinePenicillin" class="form-control">
                                                    <option > </option>
                                                    <option value="Before Pregnancy"> Before Pregnancy</option>
                                                    <option value="1st Trimester">1st Trimester</option>
                                                    <option value="2nd Trimester">2nd Trimester</option>
                                                    <option value="3rd Trimester">3rd Trimester</option>
                                                    <option value="No Treatment">No Treatment</option>
                                                    <option value="Unknown">Unknown</option>
                                                </select>
                                            </div>
                                        </div>                
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Mother Received Benzathine Penicillin Date</label>
                                            <div class="col-lg-4">
                                                <input  type="date" class="form-control" placeholder="Mother Received Benzathine Penicilin Date" name="txtReceivedBenzathinePenicilinDate" >
                                            </div>


                                            <label class="col-lg-2 control-label"  style="color: blue">Mother's  Syphilis Treatment</label>
                                            <div class="col-lg-4">                                               
                                                <select name="txtTreatmentReceivedBenzathinePenicillin" class="form-control">
                                                    <option > </option>
                                                    <option value="2.4 units benzathine penicillin"> 2.4 units benzathine penicillin</option>
                                                    <option value="Procaine penicillin">Procaine penicillin</option>
                                                    <option value="Other">Other</option>                                  
                                                    <option value="Unknown">Unknown</option>
                                                </select>
                                            </div>
                                        </div>
                                </fieldset> 
                                <fieldset title="Step 3" class="step" id="default-step-1" >
                                    <legend>Infant/Child Information</legend>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Date Of Delivery</label>
                                            <div class="col-lg-4">
                                                <input  type="date" class="form-control" placeholder="Date Of Delivery" name="txtDateOfDelivery" >
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">Vital Status</label>
                                            <div class="col-lg-4">                                              
                                                <select name="txtVitalStatus" class="form-control">
                                                    <option > </option>
                                                    <option value="Alive">Alive </option>
                                                    <option value="Born Alive,then died">Born Alive,then died</option>
                                                    <option value="Stillborn">Stillborn</option>                                  
                                                    <option value="Unknown">Unknown</option>
                                                </select>
                                            </div>
                                        </div>                
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"  style="color: blue">Date of Death</label>
                                            <div class="col-lg-4">
                                                <input  type="date" class="form-control" placeholder="Date of Death" name="txtDateOfDeath" >
                                            </div>
                                            <label class="col-lg-2 control-label" style="color: blue">:Birth Weight (grams)</label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control" placeholder="Birth Weight" name="txtBirthWeight">
                                            </div>
                                        </div>                
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="form-group">            
                                            <label class="col-lg-2 control-label" style="color: blue">Gestational Age (weeks)</label>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control" placeholder="Gestational Age" name="txtGestationalAge">
                                            </div>
                                        </div>                
                                    </div>


                                </fieldset> 
                                <fieldset title="Step 4" class="step" id="default-step-1" >
                                    <legend>Infant Tests</legend>

                                    <div class="form-group">
                                        <label class="col-lg-1 control-label" style="color: blue">Non treponemal Test Done(VDRL/RPR)</label>
                                        <div class="col-lg-3">                                              
                                            <select name="txtNonTreponemaltest" class="form-control">
                                                <option > </option>
                                                <option value="Yes">Yes </option>
                                                <option value="No">No</option>
                                                <option value="No Test">No Test</option>                                  
                                                <option value="Unknown">Unknown</option>
                                            </select>
                                        </div>

                                        <label class="col-lg-1 control-label"  style="color: blue">Date of Non treponemal Test</label>
                                        <div class="col-lg-3">
                                            <input  type="date" class="form-control"  name="txtDateOfNonTreponemalTest" >
                                        </div>
                                        <label class="col-lg-1 control-label"  style="color: blue"> Titer of  Infant Non treponemal Test</label>
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control"  name="txtTiterOfNonTreponemalTest" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" style="color: blue">Treponemal Test Done:</label>
                                        <div class="col-lg-4">                                              
                                            <select name="txtTreponemaltestDone" class="form-control">
                                                <option > </option>
                                                <option value="Yes">Yes </option>
                                                <option value="No">No</option>
                                                <option value="No Test">No Test</option>                                  
                                                <option value="Unknown">Unknown</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-2 control-label"  style="color: blue">Date of treponemal Test</label>
                                        <div class="col-lg-4">
                                            <input  type="date" class="form-control"  name="txtDateOfNonTreponemalTest" >
                                        </div>
                                    </div>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Darkield Exam </label>
                                        <div class="col-lg-4">
                                            <select name="txtDarkiedExam" class="form-control">
                                                <option> </option>
                                                <option value="Yes,Positive">Yes,Positive </option>
                                                <option value="Yes,Negative">Yes,Negative</option>
                                                <option value="No Test">No Test </option>
                                                <option value="No lesions & no tissue to test">No lesions & no tissue to test </option>
                                                <option value="Unknown">Unknown</option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">Signs of Congenital Syphilis</label>
                                        <div class="col-lg-4">

                                           <div class="checkbox">                                                                                
                                                <label style="color: red; text-align: center;">Signs of Congenital Syphilis(Tick all that apply)</label>
                                                <c:forEach items="${stihistory}" var="history">
                                                    <label>
                                                        <input type="checkbox" id="ckhistory" name="chkSignsOfCongenitalSyphilis" value="${history.history}"> ${history.history}
                                                    </label>
                                                </c:forEach>
                                                <label for="txtSpecifyHistory">Others specify:</label><input type="text" class="form-control" placeholder="specifyhistory" name="txtSpecifyHistory">
                                            </div>

                                        </div>
                                    </div>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Bone X-Ray </label>
                                        <div class="col-lg-4">
                                            <select name="txtBoneXRay" class="form-control">
                                                <option> </option>
                                                <option value="Yes,changes consistent with CS"> Yes,changes consistent with CS</option>
                                                <option value="Yes,No signs of CS">Yes,No signs of CS </option>
                                                <option value="No X-Ray"> No X-Ray</option>
                                                <option value="Unknown">Unknown</option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">CSF-VDRL</label>
                                        <div class="col-lg-4">
                                            <select name="txtCSFVDRL" class="form-control" >
                                                <option> </option>
                                                <option value="Yes,reactive"> Yes,reactive</option>
                                                <option value="Yes,non-reactive"> Yes,non-reactive</option>
                                                <option value="No test"> No test</option>
                                                <option value="Unknown"> Unknown</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">CSF Protein /CSF WBC</label>
                                        <div class="col-lg-4">
                                            <select name="txtCSFProteinCSFWBC" class="form-control">
                                                <option> </option>
                                                <option value="Yes,CSF WBC count elevated"> Yes,CSF WBC count elevated</option>
                                                <option value="Yes,CSF Protein elevated">Yes,CSF Protein elevated </option>
                                                <option value="Both test elevated"> Both test elevated</option>
                                                <option value="Neither test elevated">Neither test elevated</option>
                                                <option value="No test"> No test</option>
                                                <option value="Unknown"> Unknown</option>
                                            </select>
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">Infant  Congenital Syphilis treatment</label>
                                        <div class="col-lg-4">
                                            <select name="txtInfantCongenitalSyphilistreatment" class="form-control" >
                                                <option> </option>
                                                <option value="Yes,with Acqueous/Procanine for 10 days"> Yes,with Acqueous/Procanine for 10 days</option>
                                                <option value="Yes,with benzathine penicilin *1 4"> Yes,with benzathine penicilin *1 4</option>
                                                <option value="Yes,with other treatment">Yes,with other treatment</option>
                                                <option value="No Treatment"> No Treatment</option>
                                                <option value="Unknown"> Unknown</option>
                                            </select>
                                        </div>
                                    </div>
                                </fieldset> 


                                <fieldset title="Step 5" class="step" id="default-step-1" >
                                    <legend>Congenital Case Classification</legend>
                                    <div class="form-group" id ="part5maina" >


                                        <div class="form-group">

                                            <label class="col-lg-2 control-label" style="color: blue"> CS Classification </label>
                                            <div class="col-lg-2">
                                                <select name="txtCSClassification" class="form-control">
                                                    <option> </option>
                                                    <option value="Not a case"> Not a case</option>
                                                    <option value="Confirmed Case">Confirmed Case </option>
                                                    <option value="Confirmed Case"> Syphilitic Stillbirth</option>
                                                    <option value="Probable Case">Probable Case </option>
                                                </select>
                                            </div>                         
                                        </div>
                                    </div> 
                                </fieldset>
                                <fieldset title="Step 6" class="step" id="default-step-1" >
                                    <legend>Mother Tests During Pregnancy & Delivery</legend>                                    
                                    <div class="form-group">
                                        <label class="col-lg-1 control-label"  style="color: blue">Date of Non treponemal Test Mother Recent</label>
                                        <div class="col-lg-3">
                                            <input  type="date" class="form-control"  name="txtDateOfNonTreponemalTestMotherRecent" >
                                        </div>

                                        <label class="col-lg-1 control-label" style="color: blue"> Result of Non treponemal Test Mother Recent</label>
                                        <div class="col-lg-3">
                                            <select name="txtResultOfNonTreponemalTestMotherRecent" class="form-control" >
                                                <option> </option>
                                                <option value="reactive"> reactive</option>
                                                <option value="non reactive"> non reactive</option>           
                                                <option value="Unknown"> Unknown</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-1 control-label"  style="color: blue">Titer of Non treponemal Test Mother Recent</label>
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control"  name="txtTiterOfNonTreponemalTestMotherRecent" >
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-1 control-label"  style="color: blue">Date of Non treponemal Test Mother First</label>
                                        <div class="col-lg-3">
                                            <input  type="date" class="form-control"  name="txtDateOfNonTreponemalTestMotherRecenFirst" >
                                        </div>

                                        <label class="col-lg-1 control-label" style="color: blue"> Result of Non treponemal Test Mother First</label>
                                        <div class="col-lg-3">
                                            <select name="txtResultOfNonTreponemalTestMotherFirst" class="form-control" >
                                                <option> </option>
                                                <option value="reactive"> reactive</option>
                                                <option value="non reactive"> non reactive</option>           
                                                <option value="Unknown"> Unknown</option>
                                            </select>
                                        </div>
                                        <label class="col-lg-1 control-label"  style="color: blue">Titer of Non treponemal Test Mother First</label>
                                        <div class="col-lg-3">
                                            <input  type="text" class="form-control"  name="txtTiterOfNonTreponemalTestMotherFirst" >
                                        </div>
                                    </div>
                                    <div class="form-group">

                                        <label class="col-lg-2 control-label" style="color: blue">Date of Positive Treponemal Test Recent</label>
                                        <div class="col-lg-4">
                                            <input  type="date" class="form-control"  name="txtDateOfPositiveTreponemalTestRecent" >   
                                        </div>

                                        <label class="col-lg-2 control-label" style="color: blue">Date of Positive Treponemal Test First</label>
                                        <div class="col-lg-4">
                                            <input  type="date" class="form-control"  name="txtDateOfPositiveTreponemalTestFirst" >  
                                            
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">First Prenatal Visit</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="cd4" name="chkcd4" value="Yes" > 
                                        </label> 
                                        <div class="col-lg-3">
                                            <select name="txtFirstPrenatalVisitTreponemalNontreponemal" class="form-control" >
                                                <option> </option>
                                                <option> Yes</option>
                                                <option> No</option>           
                                                <option> Unknown</option>
                                            </select>
                                        </div>

                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">28-32 weeks gestation</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="cd4" name="chkcd4" value="Yes" > 
                                        </label> 
                                        <div class="col-lg-3">
                                            <select name="txt2832weeksgestationTreponemalNontreponemal" class="form-control" >
                                                <option> </option>
                                                <option> Yes</option>
                                                <option> No</option>           
                                                <option> Unknown</option>
                                            </select>
                                        </div>

                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Delivery</label>
                                        <label class="col-lg-1 control-label">                                                       
                                            <input type="checkbox" id="cd4" name="chkcd4" value="Yes" > 
                                        </label> 
                                        <div class="col-lg-3">
                                            <select name="txtDeliveryTreponemalNontreponemal" class="form-control" >
                                                <option> </option>
                                                <option> Yes</option>
                                                <option> No</option>           
                                                <option> Unknown</option>
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

        <script>
            $(document).ready(function ()
            {
                var sex = document.getElementById("psex").value;

                if (sex == 'Male') {
                    document.getElementById('part2b').style.display = "block";
                    document.getElementById('part2c').style.display = "block";
                    document.getElementById('part3a').style.display = "block";
                    document.getElementById('part4a').style.display = "block";
                    document.getElementById('part4d').style.display = "block";

                } else if (sex == 'Female') {

                    document.getElementById('part2a').style.display = "block";
                    document.getElementById('part2d').style.display = "block";
                    document.getElementById('part3b').style.display = "block";
                    document.getElementById('part4b').style.display = "block";
                    document.getElementById('part4c').style.display = "block";

                }

            });
        </script>
        <script language="Javascript" type="text/javascript">

            function showDiv5a(elem) {
                if (elem.value == 'Yes') {

                    document.getElementById('part5a').style.display = "block";

                } else if (elem.value == 'No') {
                    document.getElementById('part5a').style.display = "none";
                } else {
                    document.getElementById('part5a').style.display = "none";
                }
            }

            function showDiv5b(elem) {
                if (elem.value == 'Post delivery') {

                    document.getElementById('part5b').style.display = "block";

                } else if (elem.value == ' ') {
                    document.getElementById('part5b').style.display = "none";
                } else {
                    document.getElementById('part5b').style.display = "none";
                }
            }

            function showDiv5c(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part5c1').style.display = "block";
                    document.getElementById('part5c2').style.display = "block";
                } else if (elem.value == 'no') {
                    document.getElementById('part5c1').style.display = "none";
                    document.getElementById('part5c2').style.display = "none";
                } else {
                    document.getElementById('part5c1').style.display = "none";
                    document.getElementById('part5c2').style.display = "none";
                }
            }



            function showDiv5d(elem) {
                if (elem.value == 'pos') {

                    document.getElementById('part5d').style.display = "block";

                } else if (elem.value == 'neg') {
                    document.getElementById('part5d').style.display = "none";

                } else {
                    document.getElementById('part5d').style.display = "none";

                }
            }
            function showDiv5f(elem) {
                if (elem.value == 'pos') {

                    document.getElementById('part5f').style.display = "block";

                } else if (elem.value == 'neg') {
                    document.getElementById('part5f').style.display = "none";

                } else {
                    document.getElementById('part5f').style.display = "none";

                }
            }
            function showDiv5e(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part5e').style.display = "block";

                } else if (elem.value == 'no') {
                    document.getElementById('part5e').style.display = "none";

                } else {
                    document.getElementById('part5e').style.display = "none";

                }
            }

            function showDiv7(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part7').style.display = "block";

                } else if (elem.value == 'no') {
                    document.getElementById('part7').style.display = "none";

                } else {
                    document.getElementById('part7').style.display = "none";

                }
            }
            function showDiv8(elem) {
                if (elem.value == 'yes') {

                    document.getElementById('part8').style.display = "block";

                } else if (elem.value == 'no') {
                    document.getElementById('part8').style.display = "none";

                } else {
                    document.getElementById('part8').style.display = "none";

                }
            }
            function showDiv(elem) {
                if (elem.value == 1) {

                    document.getElementById('part5maina').style.display = "none";
                    document.getElementById('part5mainb').style.display = "block";

                } else if (elem.value == 2) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 3) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 4) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 5) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 6) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 7) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 8) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 9) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 10) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 11) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else if (elem.value == 12) {
                    document.getElementById('part5maina').style.display = "block";
                    document.getElementById('part5mainb').style.display = "none";

                } else {
                    document.getElementById('part5maina').style.display = "none";
                    document.getElementById('part5mainb').style.display = "none";

                }
            }


        </script>
    </body>
</html>
