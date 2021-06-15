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
                           
<h3> Make sure Opted In/Out is selected</h3>

                        </div>
                    </div>
                </section>
            </section>
        </section>
        <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
     

    </body>
</html>
