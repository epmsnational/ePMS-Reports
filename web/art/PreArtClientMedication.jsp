<%-- 
    Document   : PreArtClientMedication
    Created on : Aug 6, 2020, 6:50:32 PM
    Author     : chihw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>


    <head>
        <title>Pre ART Client Medication History: </title>
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
                               <span style="color:red">MEDICATION HISTORY FOR</span>&nbsp; ${patient.firstName} &nbsp; ${patient.lastName}
                            </h1>
                        </section>
                        <hr>
                        <div class="col-md-12">
                            <section class="panel tasks-widget">
                                <header class="panel-heading">
                                    <h3><span style="color:red">OI/ART NUMBER: </span>&nbsp;${patient.patientId} </h3>
                                </header>
                                <div class="panel-body">

                                    <div class="task-content">

                                        <ul class="task-list">
                                            <c:forEach var="med" items="${medlst}">
                                                <div>
                                                    <a class="btn btn-block btn-flat pull-center"> </a>
                                                </div>
                                                <div class ="skin-blue">
                                                    <a class="btn btn-info btn-default pull-center" style="color: blue">
                                                        <span style="color:red">Visit Date :</span> ${med.id.visitDate}&nbsp; 
                                                        <span style="color:red">Medication :</span>  ${med.id.drugTypeId}&nbsp; 
                                                        <span style="color:red">Quantity Prescribed :  </span>${med.quantityPrescribed}&nbsp;
                                                        <span style="color:red">Quantity Dispensed :  </span>${med.quantityDisp}
                                                    </a>
                                                    <div>
                                                        <a class="btn btn-block btn-flat pull-center"> </a>
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </ul>
                                    </div>

                                    <div class=" add-task-row">
                                        <a class="btn btn-success btn-sm pull-left" href="#">PRINT VISITS</a>
                                        <a class="btn btn-default btn-sm pull-right" href="PreArtClients">GO BACK</a>
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

