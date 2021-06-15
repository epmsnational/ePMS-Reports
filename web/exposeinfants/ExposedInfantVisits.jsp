<%-- 
    Document   : visitplans
    Created on : Nov 12, 2015, 5:18:02 AM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>


    <head>
        <title>Exposed infant Visits:: </title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
        <section id="container" class="">
            <%@include file="../vmmcheader.jsp" %>         

            <%@include file="../leftsidebar.jsp" %>

            <!--main content start-->
            <section id="main-content">
                <div style="width:80%;margin-left: auto;margin-right: auto; min-height: 700px;">

                    <section class="wrapper">
                        <section class="content-header" style="text-align: center;">
                            <h1>
                                ALL VISITS for ${client.p.fullName}
                            </h1>
                        </section>
                        <hr>
                        <div class="col-md-12">
                            <section class="panel tasks-widget">
                                <header class="panel-heading">
                                    
                                    <h3> Viewing Exposed Infant Visits for: ${client.p.fullName}&nbsp} <span style="color:red">[${client.p.exposedInfantId}]</span> </h3>
                                </header>
                              
                                <div class="panel-body">

                                    <div class="task-content">

                                        <table>
                                            <thead>
                                                <tr>
                                                    <th>List of Visits</th>

                                                </tr>
                                            </thead>
                                            <tbody>


                                                <c:forEach items="${eivisits}" var="viz">
                                                    <tr>

                                                        <td>
                                                            <div>
                                                                <a class="btn btn-block btn-flat pull-center"> </a>
                                                            </div>
                                                            <div class ="skin-blue">
                                                                <a class="btn btn-info btn-default pull-center" href="exposedInfantVisitsCard?${viz.id.visitDate}&${viz.id.exposedInfantId}" >
                                                                    ${viz.id.visitDate}
                                                                </a>
                                                            </div>
                                                            <div>
                                                                <a class="btn btn-block btn-flat pull-center"> </a>
                                                            </div>
                                                        </td>


                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>


                                    </div>

                                    <div class=" add-task-row">
                                        <a class="btn btn-success btn-sm pull-center " href="#">PRINT VISITS</a>
                                        <a class="btn btn-default btn-sm pull-right" href="#">GO BACK</a>
                                    </div>
                                </div>
                                <%--<div class="tab-pane" id="chartjs">
                            <div class="col-lg-6">
                                <section class="panel">
                                    <header class="panel-heading">
                                        Pie
                                    </header>
                                    <div class="panel-body text-center">
                                        <canvas id="pie" height="300" width="400"></canvas>
                                    </div>
                                </section>
                            </div>
</div> --%>
                            </section>
                        </div>




                    </section> 
                </div>
            </section>
            <!--main content end-->
        </section>

        <%@include file="../footer.jsp" %>

        <!-- ./wrapper -->
        <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
        <!--common script for all pages-->
        <script src="vmmcresources/js/tasks.js" type="text/javascript"></script>
        <script src="vmmcresources/assets/chart-master/Chart.js"></script>

        <!-- script for this page only-->
        <script src="vmmcresources/js/all-chartjs.js"></script>

        <script>
            jQuery(document).ready(function () {
                TaskList.initTaskWidget();
            });

            $(function () {
                $("#sortable").sortable();
                $("#sortable").disableSelection();
            });

        </script>
    </body>
</html>
