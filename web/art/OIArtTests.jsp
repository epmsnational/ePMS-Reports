<%-- 
    Document   : OIArtTests
    Created on : Jul 19, 2019, 9:34:29 PM
    Author     : Mohcc-ATP
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>All OI/ART Tests</title>
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
                                        <span><h3> OI/ART Most recent ${testtype} Tests</h3></span> 
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
                                    OI/ART Most recent ${testtype} Tests
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table">
                                        <div id="rotatorLoader" class="col-md-12"></div>
                                        <div id="contentLoader">
                                            <table  class="display table table-bordered table-striped" id="example">
                                                <thead>
                                                    <tr>
                                                        <th>PATIENT ID</th>
                                                        <th>TEST TYPE</th>
                                                        <th>TEST DATE </th>
                                                        <th class="hidden-phone">RESULT DATE</th>
                                                        <th class="hidden-phone">RESULT</th>
                                                        <th class="hidden-phone">NOTES</th>
                                                        <th class="hidden-phone">RECEIVED DATE</th>
                                                        <th class="hidden-phone">VISIT DATE</th>

                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="test" items="${epmtylist}">
                                                        <tr class="gradeX">
                                                            <td class="center hidden-phone">${test.tblpatients.patientId}</td>     
                                                            <td class="center hidden-phone">${test.testTypeId}</td>
                                                            <td class="center hidden-phone">${test.testDate}</td>
                                                            <td class="center hidden-phone">${test.resultDate}</td>
                                                            <td class="center hidden-phone">${test.resultNumeric}</td>
                                                            <td class="center hidden-phone">${test.resultNotes}</td>
                                                            <td class="center hidden-phone">${test.recievedDate}</td>
                                                            <td class="center hidden-phone">${test.visitDate}</td>



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

