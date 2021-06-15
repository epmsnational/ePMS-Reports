<%-- 
    Document   : visualisation
    Created on : Jul 5, 2019, 1:02:03 PM
    Author     : DevOOP
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Data Visualization</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">

            google.load('visualization', '1.0', {
                'packages': ['corechart']
            });

            google.setOnLoadCallback(drawChart);

            function drawChart() {

                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Year');
                data.addColumn('number', 'Asia');
                data.addColumn('number', 'Europe');

                data.addRows([
            <c:forEach items="${barDataList}" var="entry">
                    [ '${entry.year}', ${entry.asia}, ${entry.europe}],

            </c:forEach>
                ]);
                /*    
                 var data = google.visualization.arrayToDataTable([
                 ['Year', 'Asia', 'Europe'],
                 <c:forEach items="${barDataList}" var="entry">
                 [ '${entry.year}', ${entry.asia}, ${entry.europe}],
                 
                 </c:forEach>
                 ]);
                 */
                var options = {title: 'Population (in millions)'};

                // Instantiate and draw the chart.
                var chart = new google.visualization.BarChart(document.getElementById('container'));
                chart.draw(data, options);
            }
        </script>
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
                                        <span> <h3> Visualization </h3></span> 
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
                                    Case Base Surveillance
                                </header>
                                <div class="panel-body">
                                    <table class="columns">
                                        <tr>
                                            <td><div id="container" style="width: 45%; height: 300px;display: inline-block;"></div></td> 
                                            <td><div id="container" style="width: 45%; height: 300px;display: inline-block;"></div><br/></td>
                                            <td><div id="container" style="width: 45%; height: 300px;display: inline-block;"></div></td>
                                            <td><div id="container" style="width: 45%; height: 300px;display: inline-block;"></div></td>
                                        </tr>
                                    </table>
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

