<%-- 
    Document   : visitplans
    Created on : Nov 12, 2015, 5:18:02 AM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>


    <head>
        <title>STI:: Treatment Schedule</title>
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
                                ALL CLIENT TREATMENT SCHEDULED 
                            </h1>
                        </section>
                        <hr>
                        <div class="col-md-12">
                            <section class="panel tasks-widget">
                                <header class="panel-heading">
                                    <h3>SCHEDULED VISITS FOR: ${client.p.firstName}&nbsp; ${client.p.lastName} <span style="color:red">[${client.p.vmmcId}]</span> </h3>
                                </header>
                                <div class="panel-body">

                                    <div class="task-content">

                                        <ul class="task-list">
                                            <c:forEach var="vplan" items="${client.visitPlans}">
                                                <li>

                                                    <div class="task-title">
                                                        <span class="task-title-sp" style="font-size: medium; font-weight: bold">${vplan.visitPlanDescri} &nbsp;&nbsp;</span>
                                                        <span class="task-title-sp" style="font-size: medium; font-weight: bold; color:purple">[${vplan.visitPlanDate}]</span>
                                                        <c:if test="${vplan.isDone eq true}">
                                                            <span class="badge badge-sm label-success" style="font-size: medium; font-weight: bold">Visit Done</span>
                                                        </c:if>
                                                        <c:if test="${vplan.isDone eq false}">
                                                            <span class="badge badge-sm label-danger" style="font-size: medium; font-weight: bold">Pending visit...</span>
                                                        </c:if>

                                                        <div class="pull-right hidden-phone">
                                                            <button class="btn btn-success btn-xs"><i class=" fa fa-check" ></i></button>
                                                            <a href="VmmcPostProcedure?${vplan.vpId}"> <button class="btn btn-primary btn-xs"><i class="fa fa-pencil" > </i></button></a>
                                                            <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
                                                        </div>
                                                    </div>
                                                </li>
                                                <hr>
                                            </c:forEach>

                                        </ul>
                                    </div>

                                    <div class=" add-task-row">
                                        <a class="btn btn-success btn-sm pull-left" href="#">PRINT VISITS</a>
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
