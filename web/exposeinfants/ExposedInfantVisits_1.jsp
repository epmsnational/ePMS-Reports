<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <title>Exposed Infant Visit::ePMS</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>

        <link href="vmmcresources/assets/jquery-ui/jquery-ui-1.10.1.custom.min.css" rel="stylesheet"/>
        <link href="vmmcresources/css/jquery.alerts.css" rel="stylesheet" type="text/css"/>
        <script src="jquery-ui-1.10.2/jquery-1.9.1.js" type="text/javascript"></script>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>

        <section id="main-content">
            <section class="wrapper site-min-height">
                <section class="content-header">
                    <h1>
                        Exposed Infant Visit
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       

                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            New Exposed Infant Visit::You are about to fill visit for <a href="#" class="alert-link"><c:out value="${client.p.fullName}" />  </a> : with Exposed Infant Number <a href="#" class="alert-link"><c:out value="${client.p.exposedInfantId}" /></a>

                        </header>
                        <div class="panel-body">


                            <table>
                                <thead>
                                    <tr>

                                        <th>Infant ID</th>
                                        <th>Visit Date</th>
                                        <th>Visit type</th>
                                        <th>Weight</th>
                                        <th>Feeding Practice</th>
                                        <th>Immunisation</th>
                                        <th>Next Visit Date</th>
                                        <th>Cotri Supplied</th>
                                        <th>NVP Supplied</th>
                                        <th>Type of HIV Test</th>
                                        <th>HIV result</th>
                                        <th>HIV Results issued</th>
                                        <th>Comments</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${eivisits}" var="viz">
                                        <tr>
                                            <td><c:out value="${viz.id.exposedInfantId}" /></td>
                                            <td><c:out value="${viz.id.visitDate}" /></td>
                                            <td><c:out value="${viz.visitTypeCode}" /></td>
                                            <td><c:out value="${viz.weight}" /></td>
                                            <td><c:out value="${viz.feedingPracticeId}" /></td>
                                            <td><c:out value="${viz.immunizationsUpToDate}" /></td>
                                            <td<td><c:out value="${viz.nextVisitDate}" />
                                            </td>><c:out value="${viz.cotriSupplied}" /></td>
                                            </td>><c:out value="${viz.nvpsupplied}" /></td>
                                            </td>><c:out value="${viz.typeOfHivtestCode}" /></td>
                                            </td>><c:out value="${viz.hivtestResult}" /></td>
                                            </td>><c:out value="${viz.hivresultIssued}" /></td>
                                            </td>><c:out value="${viz.comments}" /></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>

                    </section>
                </section>
            </section>
        </section>
    </section>
    <%@include file="/vmmcwizardjs.jsp" %>

    <script src="vmmcresources/js/sliders.js" type="text/javascript"></script>
    <script src="vmmcresources/js/jquery.alerts.js" type="text/javascript"></script>
    <%@include file="../footer.jsp" %>



    <!--script for this page-->
    <!--Ajaxfy the post of this form-->
    <script>
        /* jConfirm('Sure ?', 'Yes dude', 'Nope', function(confirmed){
         if(confirmed){
         }else{ }*/
        $(document).on("submit", "#default", function(event) {
        var $form = $(this);
                jConfirm('Are you sure to save?', 'Save', 'Cancel', function(r){
                if (r == true)
                {
                $.post($form.attr("action"), $form.serialize(), function(response) {
                }
                });
                        // ...

                });
                        // alert('I got this far');
                        event.preventDefault(); // Important! Prevents submitting the form.
                });</script>

    <script>

                //step wizard

                $(function () {
                $('#default').stepy({
                backLabel: 'Previous',
                        block: true,
                        nextLabel: 'Next',
                        titleClick: true,
                        titleTarget: '.stepy-tab'});
                });</script>
    <script>
                $(document).ready(function()
        {
        $('#dob').focusout(function(event){
        var computedAge = $('#dob').val();
                $.get('AddPatientServlet', {dob:computedAge}, function(responseText)
                {
                $('#theAge').val(responseText);
                });
        });
        });
                $(document).ready(function()
        {
        $('#theAge').focusout(function(event){
        var computeDob = $('#theAge').val();
                $.get('AddPatientServlet', {dobAge:computeDob}, function(responseText)
                {
                $('#dob').val(responseText);
                });
        });
        });</script>

    <script type="text/javascript">
                RevSlide.initRevolutionSlider();
                $(window).load(function () {
        $('[data-zlname = reverse-effect]').mateHover({
        position: 'y-reverse', overlayStyle: 'rolling',
                overlayBg: '#fff',
                overlayOpacity: 0.7,
                overlayEasing: 'easeOutCirc', rollingPosition: 'top', popupEasing: 'easeOutBack', popup2Easing: 'easeOutBack'});
        });
                $(window).load(function () {
        $('.flexslider').flexslider({animation: "slide", start: function (slider) {
        $('body').removeClass('loading');
        }});
        });</script>                                        


    <script language="Javascript" type="text/javascript">
                function showDiv(elem) {
                if (elem.value == 'T') {
                document.getElementById('part').style.display = "block";
                } else {
                document.getElementById('part').style.display = "none";
                }
                }
        function showDiv1(elem) {
        if (elem.value == 'Other') {
        document.getElementById('part1').style.display = "block";
        } else {
        document.getElementById('part1').style.display = "none";
        }
        }


    </script>
</body>

</html>
