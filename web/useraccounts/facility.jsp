<%-- 
    Document   : facility
    Created on : Sep 17, 2020, 9:30:20 AM
    Author     : chihw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Setup Facility</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
    </head>

    <body class="skin-blue">
        <section id="container" class="">
            <%@include file="../vmmcheader.jsp" %>         

            <%@include file="../leftsidebar.jsp" %>
            <!--main content start-->
            <section id="main-content" >
                <section class="wrapper">
                    <section class="content-header" style="text-align: center;">
                        <h1>
                            Setup Facility
                        </h1>
                    </section>

                    <!-- /.col-lg-12 -->
                    <diV style="width: 60%;margin-left: auto; margin-right: auto;">
                        <form class="form-horizontal" role="form" action="SetupFacility" method="Post">
                            <fieldset>
                                <div class="panel panel-info">
                                    <div class="panel-heading">
                                        <h3 class="panel-title" style="text-align: center;">Setup</h3>
                                    </div>
                                    <div class="panel-body">

                                        <!-- Form Name -->
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Province Code</label>
                                            <div class="col-sm-9">
                                                <input type="text"name="provincecode" class="form-control" required="required" value="<c:out value="${siteCode.provinceId}"/>">
                                            </div>
                                        </div>
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">District Code</label>
                                            <div class="col-sm-9">
                                                <input type="text" name="districtcode" class="form-control" required="required" value="<c:out value="${siteCode.districtId}"/>">
                                            </div>
                                        </div>
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Facility Code</label>
                                            <div class="col-sm-9">
                                                <input type="text" name="facilitycode" class="form-control" required="required" value="<c:out value="${siteCode.facilityId}"/>">
                                            </div>
                                        </div>
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Facility Name</label>
                                            <div class="col-sm-9">
                                                <input type="text" name="facilityname" class="form-control" required="required">
                                            </div>
                                        </div>

                                        <div class="col-lg-2">
                                            <button type="submit" class="btn btn-warning">Save</button>
                                        </div>
                                    </div>
                                </div>

                            </fieldset>
                        </form>
                    </diV>

                </section>
            </section>
        </section>


        <!-- ./wrapper -->
        <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
        <script src="vmmcresources/js/count.js"></script>
    </body>
</html>

