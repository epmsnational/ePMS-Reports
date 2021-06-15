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
                                    <div class="alert alert-success" >
                                        <span><h3>All Registered Clients</h3></span>
                                      <a href="http://localhost:8080/HtsSystem"></a>
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
                                    <div class="adv-table col-md-12">
                                        <div id="rotatorLoader" class="col-md-12"></div>
                                        <div id="contentLoader">                                        
                                            <table  class="display table table-bordered table-striped" id="example">
                                                <thead>
                                                    <tr>
                                                        
                                                        <th>FIRST NAME</th>
                                                        <th>LAST NAME</th>
                                                        <th class="hidden-phone">NATIONAL ID</th>
                                                        <th class="hidden-phone">DATE OF BIRTH</th>
                                                        <th>SEX</th>
                                                        <th>Date Of Registration</th>
                                                        <th>Services</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="patient" items="${patients}">
                                                        <tr class="gradeX">
                                                            
                                                            <td>${patient.firstName}</td>
                                                            <td>${patient.lastName}</td>
                                                            <td class="center hidden-phone">${patient.nationalId}</td>
                                                            <td class="center hidden-phone">${patient.dob}</td>
                                                            <td>${patient.sex}</td>
                                                            <td>
                                                                <a href="PatientCard?${patient.opdnumber}">
                                                                    ${patient.registrationDate}
                                                                </a>
                                                            </td>
                                                            <td><form action="ProgReferred" method="GET"><select name="prog"><option value="TT"> </option><!-- <option value="CBSCIF">CBS (No CIF)</option>--><option value="VMMC">VMMC</option><option value="ART">ART</option><option value="HTS">HTS</option><option value="STI">STI</option><option value="CS">Congenital Syphilis </option><option value="EID">EID</option><option value="TB">TB</option></select><input type="hidden" name="opdnum" value="${patient.opdnumber}"/><input type="submit" value="Offer service"></form></td>
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
