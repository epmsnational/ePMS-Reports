<%-- 
    Document   : setupstaff
    Created on : Sep 16, 2020, 10:24:31 AM
    Author     : chihw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Setup Staff</title>
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
                            Register Staff
                        </h1>
                    </section>

                    <!-- /.col-lg-12 -->
                    <diV style="width: 60%;margin-left: auto; margin-right: auto;">
                        <form class="form-horizontal" role="form" action="RegisterStaff" method="Post">
                            <fieldset>
                                <div class="panel panel-info">
                                    <div class="panel-heading">
                                        <h3 class="panel-title" style="text-align: center;">Register</h3>
                                    </div>
                                    <div class="panel-body">

                                        <!-- Form Name -->
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label" for="textinput">First Name</label>
                                            <div class="col-sm-9">
                                                <input type="text" placeholder="First Name" name="fname" class="form-control">
                                            </div>
                                        </div>
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label" for="textinput">Last Name</label>
                                            <div class="col-sm-9">
                                                <input type="text" placeholder="Last Name" name="lname" class="form-control">
                                            </div>
                                        </div>
                                        
                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Initials</label>
                                            <div class="col-sm-9">
                                                <input type="text" name="initials" class="form-control">
                                            </div>
                                        </div>

                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Role </label>
                                            <div class="col-sm-9">
                                                <select class="form-control" name="role">
                                                    <option></option>
                                                    <option value="Doctor">Doctor</option>
                                                    <option value="Nurse">Nurse</option>
                                                    <option value="Counselor">Counselor</option>
                                                    <option value="Dispenser">Pharmacy Dispenser</option>
                                                </select>
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
