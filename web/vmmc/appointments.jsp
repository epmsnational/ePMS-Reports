<%-- 
    Document   : vmmcVisitPlan
    Created on : Oct 15, 2015, 6:35:34 PM
    Author     : Trevor
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>


    <head>
        <title> Appointments </title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
    <section id="container" class="">
        <%@include file="../vmmcheader.jsp" %>         

        <%@include file="../leftsidebar.jsp" %>
    
            <!-- Content Wrapper. Contains page content -->
            <br/>
            <br/>
            <br/>
            <div class="content-wrapper" style="min-height: 900px; width: 65%; margin-left: auto;margin-right: auto;margin-top: 10px;">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        APPOINTMENTS
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
                    <!-- Default box -->       
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        IF ADVERSE EVENTS CLIENT SHOULD BE GIVEN ADDITIONAL VISIT
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <section class="panel panel-primary">
                        <header class="panel-heading">
                            SCHEDULE FOR APPOINTMENTS AND ADDITIONAL VISITS
                        </header>   
     
                          <div class="panel-body">
                              <form class="form-horizontal" role="form" action="AdditionalVisit" method="POST">
                                  <div class="form-group">
                                      <label for="appointmentMade" class="col-lg-2 col-sm-2 control-label">Date of Appointment Made:</label>
                                      <div class="col-lg-3">
                                          <input type="date" class="form-control"  placeholder="Date of Appointment Made" name="txtDateMade" required="required">
              
                                      </div>
                                      <br>
                                      <label for="appointmentGiven" class="col-lg-2 col-sm-1 control-label">Date of Appointment Given:</label>
                                        <div class="col-lg-3">
                                          <input type="date" class="form-control"  placeholder="Date of Appointment Given" name="txtDateGiven" required="required">
              
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="notes" class="col-lg-2 col-sm-2 control-label">NOTES :</label>
                                      <div class="col-lg-5 col-sm-10">
                                          <input type="text" class="form-control" placeholder="write notes here...." name="notes">
                                      </div>
                                  </div>
                                   <div class="form-group">
                                      <label for="Authority" class="col-lg-2 col-sm-2 control-label">Authority :</label>
                                      <div class="col-lg-10">
                                          <select name="authority">
                                              <option></option>
                                              <option>Doctor</option>
                                              <option>Nurse</option>
                                          </select>
                                      </div>
                                  </div>
                                
                                  <div class="form-group">
                                      <div class="col-lg-offset-2 col-lg-10">
                                          <button type="submit" class="btn btn-primary">Schedule Appointment</button>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="col-lg-offset-2 col-lg-10">
                                          <button type="submit" class="btn btn-danger">Cancel Appointment</button>
                                      </div>
                                  </div>
                              </form>
                          </div>
                      </section>
         
                    </section>
                </section>
            </div><!-- /.content-wrapper -->
            <%@include file="../footer.jsp" %>
        </div><!-- ./wrapper -->
        <%@include file="../scripts.jsp" %> 

        <c:url value="/resources/flexslider/js/jquery.flexslider.js" var="url" />
        <script src="${url}" type="text/javascript"></script>                                                    
        <c:url value="/resources/flexslider/assets/bxslider/jquery.bxslider.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/js/jquery.parallax-1.1.3.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/js/jquery.easing.min.js" var="url" />
        <script src="${url}" type="text/javascript"></script>                                                    
        <c:url value="/resources/flexslider/assets/fancybox/source/jquery.fancybox.pack.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/assets/revolution_slider/rs-plugin/js/jquery.themepunch.plugins.min.js" var="url" />
        <script src="${url}" type="text/javascript"></script>                                                    
        <c:url value="/resources/flexslider/assets/revolution_slider/rs-plugin/js/jquery.themepunch.revolution.min.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/js/common-scripts.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/js/revulation-slide.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/js/jquery.stepy.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        <c:url value="/resources/flexslider/js/link-hover.js" var="url" />
        <script src="${url}" type="text/javascript"></script>
        
        <!-- page-container -->




        <script type="text/javascript">
            RevSlide.initRevolutionSlider();
            $(window).load(function() {
                $('[data-zlname = reverse-effect]').mateHover({
                    position: 'y-reverse',
                    overlayStyle: 'rolling',
                    overlayBg: '#fff',
                    overlayOpacity: 0.7,
                    overlayEasing: 'easeOutCirc', rollingPosition: 'top', popupEasing: 'easeOutBack', popup2Easing: 'easeOutBack'});
            });
            $(window).load(function() {
                $('.flexslider').flexslider({animation: "slide", start: function(slider) {
                        $('body').removeClass('loading');
                    }});
            });
        </script>
       
        <script type="text/javascript">
            jQuery(document).ready(function() {

            });
        </script>
    </body>
</html>

