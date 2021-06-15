<%-- 
    Document   : AllVmmcs
    Created on : Nov 8, 2015, 10:06:05 PM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   

    <head>
        <title>All Clients</title>
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
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                       All Registered Clients
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
                                    PATIENT MODULE
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table">
                                        <table  class="display table table-bordered table-striped" id="example">
                                            <thead>
                                                <tr>
                                                    <th>OPD NUMBER</th>

                                                    <th>FIRST NAME</th>
                                                    <th class="hidden-phone">LAST NAME</th>
                                                    <th class="hidden-phone">NATIONAL ID</th>
                                                    <th>DATE REGISTERED</th>
                                                    <th>Activity</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="patient" items="${patients}">
                                                    <tr class="gradeX">
                                                        <td>
                                                            <a href="PatientCard?${patient.opdnumber}">
                                                                ${patient.opdnumber}
                                                            </a>
                                                        </td>
                                                        <td>${patient.firstName}</td>
                                                        <td class="center hidden-phone">${patient.lastName}</td>
                                                        <td class="center hidden-phone">${patient.nationalId}</td>
                                                        <td>${patient.registrationDate}</td>
                                                        <td><form action="ProgReferred" method="GET"><select name="prog"><option>VMMC</option><option>TB</option><option>HTS</option></select><input type="hidden" name="opdnum" value="${patient.opdnumber}"/><input type="submit" value="Refer"></form></td>
                                                    </tr>
                                                </c:forEach>


                                        </table>
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
