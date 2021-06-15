<%-- 
    Document   : AllVmmcs
    Created on : Nov 8, 2015, 10:06:05 PM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>All HTS Registered Clients</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <style>
            #rotatorLoader{
                width:100%;
                height:100%;
                position: absolute;
                z-index:9999;
                background:url("img/725.gif") no-repeat center center rgba(0,0,0,0)
            }
        </style>
    </head>

    <body class="skin-blue">
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
                                        <span><h3>All HIV Positive Clients</h3></span> 
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <!-- page start--> 
                    <div class="row">

                        <div class="col-lg-12">
                            <section class="panel">
                                <header class="panel-heading">
                                    HTS MODULE
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table">
                                        <div id="rotatorLoader" class="col-md-12"></div>
                                        <div id="contentLoader">
                                            <table  class="display table table-bordered table-striped" id="example">
                                                <thead>
                                                    <tr>
                                                        <th>OPD NUMBER</th>
                                                        <th>HTS NUMBER</th>
                                                        <th>COUNSELLING RECEIVED</th>
                                                        <th class="hidden-phone">HIV RESULT</th>
                                                        <th class="hidden-phone">SERVICES</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="patient" items="${patients}">
                                                        <tr class="gradeX">
                                                            <td>${patient.opdnumber}</td>
                                                            <td>
                                                                <a href="HtsPatientCard?${patient.htcnumber}&${patient.opdnumber}">
                                                                    ${patient.htcnumber}
                                                                </a>
                                                            </td>

                                                            <td>${patient.counselingRecieved}</td>
                                                            <td class="center hidden-phone">${patient.finalResultType}</td>
                                                            <td>
                                                                <form action="ProgReferred" method="GET">
                                                                    <select name="prog">
                                                                        <option>ART</option>
                                                                        <option>CBS</option>
                                                                    </select>
                                                                    <input type="hidden" name="opdnum" value="${patient.opdnumber}"/>
                                                                    <input type="submit" value="Refer"></form>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>

                                            </table>
                                        </div>
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
            document.onreadystatechange = function () {
                var state = document.readyState;
                if (state === 'interactive') {
                    document.getElementById('contentLoader').style.visibility = "hidden";
                } else if (state === 'complete') {
                    setTimeout(function () {
                        document.getElementById('interactive');
                        document.getElementById('rotatorLoader').style.visibility = "hidden";
                        document.getElementById('contentLoader').style.visibility = "visible";
                    }, 1000);
                }
            };
        </script>


    </body>
</html>
