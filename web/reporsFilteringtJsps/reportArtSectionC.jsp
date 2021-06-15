<%-- 
    Document   : reportOIART
    Created on : Jul 11, 2019, 12:32:59 PM
    Author     : Mohcc-ATP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>OI/ART Reports::ePMS</title>
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
                        Section C HIV/TB COLLABORATION
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">

                        </header>
                        <div class="container" style="margin-left: 15%">
                            <div class="row">
                                <div class="col-xs-6" style="background-color: grey;width: 100%">
                                    <form class="form-horizontal" id="default" action="ArtSectionCReport"  method="POST">

                                        <legend> Choose The Desired Period</legend>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-4" style="color: blue;"><b>CHOOSE REPORTING PERIOD:</b></div>
                                            <div class="col-lg-4">
                                                <input style="color: blue;" type="date" class="form-control" placeholder="start date" id="txtRptStartDate" name="txtRptStartDate" >
                                            </div>

                                        </div>
                                        <div style="margin: 0 auto;width: 100px">
                                            <input type="submit" class="finish btn btn-info"  value="Generate" />
                                        </div>
                                    </form>
                                </div>
                            </div>
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

</body>

</html>

