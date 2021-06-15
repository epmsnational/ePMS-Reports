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
        <title>OI/ART Report::ePMS</title>
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
                        OI/ART Report
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            
                        </header>
                        <div class="panel-body">

                           
                            <form class="form-horizontal"  name="reportOIART" id="default" action="TestRpt"  method="POST" ">
                                
                                    <legend> Choose The Desired Period</legend>

                                    <div style="background-color: grey">
                                        <hr>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-2" style="color: blue;"><b>START DATE :</b></div>
                                            <div class="col-lg-3">
                                                <input style="color: blue;" type="date" class="form-control" placeholder="start date" id="txtRptStartDate" name="txtRptStartDate">
                                            </div>
                                            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                            <div class="col-lg-1" style="color: blue;"><b> END DATE:</b></div>
                                             <div class="col-lg-3">
                                                <input style="color: blue;" type="date" class="form-control" placeholder="end date" id="txtRptEndDate" name="txtRptEndDate">
                                            </div>

                                        </div>

                                        
                                    </div>

                               
                               

                                <input type="submit" class="finish btn btn-danger"  value="Generate Report" />
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
                                        
       
</body>

</html>

