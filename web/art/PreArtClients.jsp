<%-- 
    Document   : PreArtClients
    Created on : Aug 6, 2020, 4:43:20 PM
    Author     : chihw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pre ART Clients</title>
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
                                        <span><h3>All Pre ART Clients</h3></span> 
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
                                    OI/ART MODULE
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table">
                                        <div id="rotatorLoader" class="col-md-12"></div>
                                        <div id="contentLoader">
                                            <table  class="display table table-bordered table-striped" id="example">
                                                <thead>
                                                    <tr>
                                                       
                                                        <th>PATIENT ID</th>
                                                        <th>VISIT DATE</th>
                                                        <th>TB STATUS</th>
                                                        <th>TPT REASON CODE</th>
                                                        <th>TPT ELIGIBILITY</th>
                                                        <th>TPT STATUS CODE</th>
                                                        <th>ARV REASON CODE</th>
                                                        <th></th>
                                                    </tr>
                                                </thead>
                                                <c:forEach var="visits" items="${visits}">
                                                    <tr class="gradeX">
                                                        <td>${visits.id.patientId}</td>
                                                        <td>${visits.id.visitDate}</td>
                                                        <td>${visits.tbstatusCode}</td>
                                                        <td>${visits.iptreasonCode}</td>
                                                        <td>${visits.isIpteligibility}</td>
                                                        <td>${visits.iptstatusCode}</td>
                                                        <td>${visits.arvreasonCode}</td>
                                                        <td><a href="PreArtClientMedication?${visits.id.patientId}">
                                                                View</a></td>
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

