<%-- 
    Document   : errors
    Created on : 15-Jan-2016, 03:10:17
    Author     : System Developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Error</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
        <section id="container" class="">
            <%@include file="../vmmcheader.jsp" %>         

            <%@include file="../leftsidebar.jsp" %>

            <section id="main-content">
                <section class="wrapper site-min-height">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary"  style="background-color: red;">
                                
                                <h3> System has generated a warning</h3>
                                 
                            </div>
                        </div>
                    </div>
                    <!-- page start--> 
                    <div class="row">

                        <div class="col-lg-12">
                            <c:choose>
                                <c:when test="${errorvmmc eq 'f'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3>FEMALES CANNOT BE REFERRED TO VMMC MODULE!</h3>
                                            <a href="AllClients" class="btn btn-shadow btn-danger"><h3>Click here to go back</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'existOI'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> CLIENT ALREADY REGISTERED FOR OI/ART SERVICES!</h3>
                                            <a href="OIARTSingleClientDashboard?${patient.patientId}" class="btn btn-shadow btn-shadow"><h3> Click to view profile or add New Visit</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'existReg'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> CLIENT ALREADY IN SYSTEM!</h3>
                                            <a href="PatientCard?${patient.opdnumber}" class="btn btn-shadow btn-shadow"><h3> Click to view profile</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'existCBS'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> CLIENT ALREADY NOTIFIED!</h3>
                                            <a href="CbsPatientCard?${patient.opdnumber}" class="btn btn-shadow btn-shadow"><h3> Click to view profile</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'gothroughHTS'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> CLIENT NOT ELIGIBLE FOR DBS, AND SHOULD GO THROUGH HTS MODULE</h3>
                                            <a href="HtsPatient?${patient.patientId}" class="btn btn-shadow btn-shadow"><h3> HTS Module</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'reg0'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> Client Demographics Name , surname , DOB and Sex have matched an existing client please probe for national ID</h3>
                                            <a href="AddPatientServlet? " class="btn btn-shadow btn-shadow"><h3> ADD PATIENT</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'reg1'}">
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> Client Demographics Name , surname and DOB  have matched an existing client please probe for national ID</h3>
                                            <a href="AddPatientServlet? " class="btn btn-shadow btn-shadow"><h3> ADD PATIENT</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'reg2'}">
                                    <div style="width:30%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> Client National ID have matched an existing client please probe for another national ID</h3>
                                            <a href="AddPatientServlet? " class="btn btn-shadow btn-shadow"><h3> ADD PATIENT</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:when test="${errorvmmc eq 'reg3'}">
                                    <div style="width:30%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3> There is NO Client Date of Birth or Registration Date in the Personal Details section </h3>
                                            <a href="AddPatientServlet? " class="btn btn-shadow btn-shadow"><h3> ADD PATIENT</h3></a>
                                        </span>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div style="width: 50%; margin-left: auto; margin-right: auto;">
                                        <span class="btn btn-shadow btn-warning">
                                            <h3>CLIENT ALREADY REGISTERED OF VMMC SERVICES!</h3>
                                            <a href="VmmcSingleClientDashboard?${patient.vmmcId}" class="btn btn-shadow btn-danger"><h3>VIEW PROFILE</h3></a>
                                        </span>
                                    </div>
                                </c:otherwise>
                                
                                
                            </c:choose>


                        </div>
                    </div>
                </section>
            </section>
        </section>
        <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
     

    </body>
</html>
