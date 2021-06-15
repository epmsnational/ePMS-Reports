<%-- 
    Document   : errors
    Created on : Jul 9, 2019, 12:08:04 PM
    Author     : DevOOP
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

                            <div class="col-lg-5">

                                <h3>Patient Already Notified</h3>
                            </div>
                </section>
            </section>
        </section>
        <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>


    </body>
</html>