<%-- 
    Document   : Search
    Created on : Dec 13, 2020, 5:41:14 PM
    Author     : ignatious
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Search ART Client</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">
                <section class="content-header">
                    <h2>
                        Search ART Client
                    </h2>
                </section>

                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->  
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        ART Client Data
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>

                    <hr>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            ART Client
                        </header>
                        <div class="panel-body">
                            <div class="container">
                                <div class="col-xs-6" style="background-color: grey;width: 100%">
                                    <form class="form-horizontal" action="SingleArtClient"  method="POST">

                                        <legend> Enter Patient ART Number</legend>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-4" style="color: blue;"><b>PATIENT ID:</b></div>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="txtARTNum" id="artNumtxt"placeholder="PP-DD-FF-YYYY-A-SSSSS" maxlength="21">
                                            </div>
                                        </div>
                                        <div style="margin: 0 auto;width: 100px">
                                            <input type="submit" class="finish btn btn-info"  value="Go To Visits" />
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="panel-body">
                                <div class="container">
                                <div class="col-xs-6" style="background-color: grey;width: 100%">
                                    <form class="form-horizontal" action="singleArtPatientSearchByName"  method="POST">

                                        <legend> Search by Patient Name</legend>
                                        <div class="form-group" style="color: blue;">
                                            <div class="col-lg-4" style="color: blue;"><b>PATIENT NAME:</b></div>
                                            <div class="col-lg-4">
                                                <input type="text" class="form-control"  name="txtARTName" id="artNumtxt"placeholder="Name Surname" maxlength="25">
                                            </div>
                                        </div>
                                        <div style="margin: 0 auto;width: 100px">
                                            <input type="submit" class="finish btn btn-info"  value="Go To Patient List" />
                                        </div>
                                    </form>
                                </div>
                            </div>
                            </div>

                        </div>
                    </section>
                </section>
            </section>
        </section>
    </section>
    <%@include file="../footer.jsp" %>
    <%@include file="/vmmcwizardjs.jsp" %>
    <%@include file="../footer.jsp" %>



    <!--script for this page-->
    <script>
        function format(input, format, sep) {
            var output = "";
            var idx = 0;
            for (var i = 0; i < format.length && idx < input.length; i++) {
                output += input.substr(idx, format[i]);
                if (idx + format[i] < input.length)
                    output += sep;
                idx += format[i];
            }

            output += input.substr(idx);

            return output;
        }
        $('#artNumtxt').keyup(function () {
            var foo = $(this).val().replace(/-/g, "");
            if (foo.length > 0) {
                foo = format(foo, [2, 2, 2, 4, 1, 5], "-");
            }


            $(this).val(foo);
        });
    </script>

    <script type="text/javascript">
        jQuery(document).ready(function () {

        });
    </script>

</body>
</html>

