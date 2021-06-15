<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>All Clients</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>
    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         
        <%@include file="../leftsidebar.jsp" %>
        <jsp:include page="../header.jsp" />
        <section id="main-content">
            <section class="wrapper">
                <section class="content-header" style="text-align: center;">
                    <h2>MINISTRY OF HEALTH AND CHILD CARE 
                    </h2>
                </section>
                <div class="row">
                    <div class="col-lg-12" style="margin-top: 50px;">
                        <div class="panel panel-primary" style="margin-left: auto; margin-right: auto">
                            <div class="panel-heading">
                                Service Basket
                            </div>
                            <div class="col-lg-12" style="margin-left: auto; margin-right: auto; margin-top: 30px;">
                                <div class="row">
                                    <div class="col-lg-3">
                                        <div class="panel panel-danger">
                                            <div class="panel-heading">
                                                ALL Patients On ART
                                            </div>
                                           
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <a href="AllOIARTServ">
                                              <img src="static/zimepms/img/art.jpg" alt="" height="150" width="200" /></a>
                                                <span style="color: red">${art}</span>
                                            </div>
                                            <div class="panel-footer">
                                                ALL Registered ART Patients <br/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3">
                                        <div class="panel panel-primary">
                                            <div class="panel-heading">
                                                All HIV Positive Women
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <a href="AllHivPosWomen">
                                                    <img src="static/zimepms/img/htc1.jpg" alt="" height="150" width="200" /></a>
                                                <span style="color: red">${women}</span>
                                            </div>
                                            <div class="panel-footer">
                                                 HIV Positive Women in care
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3">
                                        <div class="panel panel-success">
                                            <div class="panel-heading">
                                               HIV Exposed Infants Registered
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <a href="AllExposedInfants">
                                                    <img src="static/zimepms/img/art.jpg" alt="" height="150" width="200" /></a>
                                                <span style="color: red">${expossed}</span>
                                            </div>
                                            
                                            <div class="panel-footer">
                                               List of all HIV Exposed infant
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3">
                                        <div class="panel panel-warning">
                                            <div class="panel-heading">
                                                OPTED IN & TESTED HIV
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <img src="static/zimepms/img/vmmc.jpg" alt="" height="150" width="200" />
                                                50
                                            </div>
                                            <div class="panel-footer">
                                                ALL PATIENTS WHO OPTED IN FOR HIV TESTING & THEIR HIV STATUS IS KNOWN
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3">
                                        <div class="panel panel-danger">
                                            <div class="panel-heading">
                                                NEWLY DIAGNOSED CASES
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <img src="static/zimepms/img/pmtc1.jpg" alt="" height="150" width="200" />
                                                30
                                            </div>
                                            <div class="panel-footer">
                                                CLIENT WHO TEST HIV POSITIVE FOR THE FIRST TIME
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3">
                                        <div class="panel panel-warning">
                                            <div class="panel-heading">
                                                HIV RE-TEST CASES
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <img src="static/zimepms/img/tb1.jpg" alt="" height="150" width="200" />
                                                20
                                            </div>
                                            <div class="panel-footer">
                                                CLIENTS WHO HAVE A RE-TEST
                                                <br/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3">
                                        <div class="panel panel-success">
                                            <div class="panel-heading">
                                                REFERRED FOR HIV CARE
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <img src="static/zimepms/img/sti.jpg" alt="" height="150" width="200" />

                                            </div>
                                            <div class="panel-footer">
                                                CLIENTS WHO TESTED HIV POSITIVE AND WERE REFERRED TO ART PROGRAM
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3">
                                        <div class="panel panel-warning">
                                            <div class="panel-heading">
                                                REFERRED FOR TB CARE
                                            </div>
                                            <div class="panel-body"style="margin-left: auto;margin-right: auto;">
                                                <img src="static/zimepms/img/fp1.jpg" alt="" height="150" width="200" />
                                                10
                                            </div>
                                            <div class="panel-footer">
                                                CLIENTS WHO TESTED HIV POSITIVE AND WERE REFERRED TO TB PROGRAM<br/>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>


                        </div>
                    </div>

                </div>
            </section>

        </section>
    </section>
    <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
    <script src="vmmcresources/js/count.js"></script>
</body>
</html>
