<%-- 
    Document   : ajaxPatients
    Created on : Apr 1, 2016, 2:55:06 PM
    Author     : Developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <title>All Clients</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <script src="../vmmcresources/js/jquery-1.8.3.min.js" type="text/javascript"></script>

    </head>
    <body class="skin-blue">
        <button id="save">Load User</button>
        <div id="loading"></div>

        <script>

            $(function () {
                // add loading image to div

                //$('#loading').html('<img src="../img/725.gif" alt=""/>Loading all clients...');
                console.log('Mamhinga');
                // run ajax request
                $.ajax({
                    type: "GET",
                    dataType: "xml",
                    url: "../AjaxPatientsJsonController",
                    beforeSend: function () {
                        $('#ajaxTable').html('<img src="../img/725.gif" alt=""/>Loading all clients...');
                    },
                    success: function (responseXml) {
                        $("#ajaxTable").html($(responseXml).find("data").html());





                        // replace div's content with returned data

                        //var $div = $("#ajaxTable"); // Create HTML <table> element and append it to HTML DOM element with ID "somediv".
                        //$.each(responseJson, function (index, patient) {    // Iterate over the JSON array.
                        //console.log(patient.firstName);
                        //$($div).append("<tr><td>" + patient.opdnumber + "</td><td>" + patient.firstName + "</td><td>" + patient.lastName + "</td><td>" + patient.nationalId + "</td><td>" + patient.registrationDate + "</td><td><form action=\"../ProgReferred\" method=\"GET\"><select name=\"prog\"><option>VMMC</option><option>TB</option><option>HTS</option></select><input type=\"hidden\" name=\"opdnum\" value=" + patient.opdnumber + "><input type=\"submit\" value=\"Refer\"></form></td></tr>") ;
                        //});


                        // $('#loading').html(d);
                    }

                });
            });
        </script>
        <section id="container" class="">
            <%@include file="../vmmcheader.jsp" %>         

            <%@include file="../leftsidebar.jsp" %>

            <section id="main-content">
                <section class="wrapper site-min-height">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        All Registered Clients
                                        <button id="load" class="btn-danger" value="Ajax Load data">Ajax Load data</button>
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <!-- page start--> 
                    <div class="row">
                        <div id="loadingk">


                        </div> 
                        <div class="col-lg-12">
                            <section class="panel">
                                <header class="panel-heading">
                                    PATIENT MODULE
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table" id="ajaxTable">
                                        <%@include file="/demographic/data.jsp" %>
                                    </div>
                                </div>
                            </section>
                        </div>
                    </div>
                </section>
            </section>

        </section>
        <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
        <script type="text/javascript" charset="utf-8">
            $(document).ready(function () {
                $('#example').dataTable({
                    "aaSorting": [[4, "desc"]]
                });
            });
        </script>




    </body>
</html>
