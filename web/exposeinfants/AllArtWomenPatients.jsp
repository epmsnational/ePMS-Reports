<%-- 
    Document   : AllVmmcs
    Created on : Nov 8, 2015, 10:06:05 PM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HIV Positive women</title>
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
                                        <span><h3>All HIV Positive Women</h3></span> 
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
                                    HIV Positive women
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table">
                                        <div id="rotatorLoader" class="col-md-12"></div>
                                        <div id="contentLoader">
                                            <table  class="display table table-bordered table-striped" id="example">
                                                <thead>
                                                    <tr>
                                                        <th>OPD NUMBER</th>
                                                        <th>NAME</th>
                                                        <th>SURNAME</th>
                                                        <th>OI/ART NUMBER</th>
                                                        <th class="hidden-phone">DOB</th>
                                                        <th class="hidden-phone">Services</th>

                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="patient" items="${patients}">
                                                        <tr class="gradeX">
                                                            <td>${patient.opdnumber}</td>
                                                            <td>${patient.firstName}</td>
                                                            <td>${patient.lastName}</td>
                                                            <td>
                                                                <a href="ARTPatientCard?${patient.patientId}&${patient.opdnumber}">
                                                                    ${patient.patientId}
                                                                </a>
                                                            </td>

                                                            <td>${patient.dob}</td>

                                                            <td> <form action="ProgReferred" method="GET">
                                                                    <select name="prog">
                                                                        <option value></option>
                                                                        <option>VMMC</option>
                                                                        <option>ART</option>
                                                                        <option value="EI">Exposed Infant</option>
                                                                    </select>
                                                                    <input type="hidden" name="opdnum" value="${patient.opdnumber}"/>
                                                                    <input type="submit" value="Refer">
                                                                </form>
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
