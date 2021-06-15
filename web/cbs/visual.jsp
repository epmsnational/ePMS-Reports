<%-- 
    Document   : visual
    Created on : Jul 5, 2019, 2:54:26 PM
    Author     : DevOOP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title>Data Visualization</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">

            google.load('visualization', '1.0', {
                'packages': ['corechart']
            });


            google.setOnLoadCallback(drawChart1);
            google.setOnLoadCallback(drawChart2);
            google.setOnLoadCallback(drawChart3);
            google.setOnLoadCallback(drawChart0);
            google.setOnLoadCallback(drawChart5);
            
            

            function drawChart0() {
                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Year');
                data.addColumn('number', 'Male');
                data.addColumn('number', 'Female');

                data.addRows([
            <c:forEach items="${lineBarList}" var="line">
                    [ '${line.year}', ${line.male}, ${line.female}],

            </c:forEach>
                ]);

                var options = {
                    title: 'Male - Female Comparisons',
                    curveType: 'function',
                    legend: {position: 'bottom'}
                };

                var chart = new google.visualization.LineChart(document.getElementById('container0'));
                chart.draw(data, options);
            }
            function drawChart1() {

                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Year');
                data.addColumn('number', 'Male');
                data.addColumn('number', 'Female');

                data.addRows([
            <c:forEach items="${stackedBarList}" var="stacking">
                    [ '${stacking.year}', ${stacking.male}, ${stacking.female}],

            </c:forEach>
                ]);

                var options = {title: 'Population (in millions)', isStacked: true};

                var chart = new google.visualization.BarChart(document.getElementById('container1'));
                chart.draw(data, options);
            }
            function drawChart2() {


                // Create the data table.
                //var data = new google.visualization.DataTable();
                //data.addColumn('string', 'Year');
                //data.addColumn('number', 'Male');
                //data.addColumn('number', 'Female');
                /*data.addRows([
                 <c:forEach items="${pieDataList}" var="entry">
                 [ '${entry.key}', ${entry.value} ],
                 </c:forEach>
                 ]);*/

                var data = google.visualization.arrayToDataTable([
                    ['Country', 'Area(square km)'],
            <c:forEach items="${pieDataList}" var="entry">
                    [ '${entry.key}', ${entry.value} ],
            </c:forEach>
                ]);

                // Set chart options
                var options = {
                    'title': 'Route of infections by Numbers', //title which will be shown right above the Google Pie Chart
                    is3D: true, //render Google Pie Chart as 3D
                    pieSliceText: 'label', //on mouse hover show label or name of the Country
                    tooltip: {showColorCode: true}, // whether to display color code for a Country on mouse hover
                    'width': 500, //width of the Google Pie Chart
                    'height': 500 //height of the Google Pie Chart
                };

                // Instantiate and draw our chart, passing in some options.
                var chart = new google.visualization.PieChart(document.getElementById('container2'));
                chart.draw(data, options);
            }
            function drawChart3() {

                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Year');
                data.addColumn('number', 'Male');
                data.addColumn('number', 'Female');

                data.addRows([
            <c:forEach items="${barDataList}" var="entry">
                    [ '${entry.year}', ${entry.asia}, ${entry.europe}],

            </c:forEach>
                ]);

                var options = {title: 'Population'};

                // Instantiate and draw the chart.
                var chart = new google.visualization.BarChart(document.getElementById('container3'));
                chart.draw(data, options);
            }
            
            function drawChart5() {
                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Points');
                data.addColumn('number', 'Frequency');

                data.addRows([
            <c:forEach items="${barList}" var="lists">
                    ['${lists.pointName}', ${lists.count}],
            </c:forEach>
                ]);
                var view = new google.visualization.DataView(data);
               
                var options = {
                    title: "CBS Cascade",
                    width: 500,
                    height: 500,
                    bar: {groupWidth: "80%"},
                    legend: {position: "none"},
                };
                var chart = new google.visualization.ColumnChart(document.getElementById("container4"));
                chart.draw(view, options);
            }
           
        </script>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">
                <section class="content-header" style="text-align: center;">
                    <h1>
                        Data Visualization 
                    </h1>
                    <div id="container3" style="width: 500px; height: 500px;display: inline-block;"></div> 
                    <div id="container2" style="width: 500px; height: 500px;display: inline-block;"></div>
                    <div id="container1" style="width: 500px; height: 500px;display: inline-block;"></div>
                    <div id="container0" style="width: 500px; height: 500px;display: inline-block;"></div>
                    <div id="container4" style="width: 500px; height: 500px;display: inline-block;"></div>
                    
                </section>
                <!--main content end-->
            </section>
            <!-- ./wrapper -->
            <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
            <script src="vmmcresources/js/count.js"></script>


            <script type="text/javascript">
            RevSlide.initRevolutionSlider();
            $(window).load(function () {
                $('[data-zlname = reverse-effect]').mateHover({
                    position: 'y-reverse',
                    overlayStyle: 'rolling',
                    overlayBg: '#fff',
                    overlayOpacity: 0.7,
                    overlayEasing: 'easeOutCirc', rollingPosition: 'top', popupEasing: 'easeOutBack', popup2Easing: 'easeOutBack'});
            });
            $(window).load(function () {
                $('.flexslider').flexslider({animation: "slide", start: function (slider) {
                        $('body').removeClass('loading');
                    }});
            });
            </script>

            <script type="text/javascript">
                jQuery(document).ready(function () {

                });
            </script>
            </body>
            </html>
