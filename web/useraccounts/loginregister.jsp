<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : loginregister
    Created on : May 31, 2014, 9:51:47 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Register</title>
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
                            Register System User
                        </h1>
                    </section>

                    <!-- /.col-lg-12 -->
                    <diV style="width: 60%;margin-left: auto; margin-right: auto;">
                        <form class="form-horizontal" role="form" action="RegisterUser" method="Post">
                            <fieldset>
                                <div class="panel panel-info">
                                    <div class="panel-heading">
                                        <h3 class="panel-title" style="text-align: center;">Sign up</h3>
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
                                     
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label" for="textinput">User Name</label>
                                            <div class="col-sm-9">
                                                <input type="text" placeholder="User Name" name="username" class="form-control" required="required">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label" for="textinput">Password</label>
                                            <div class="col-sm-9">
                                                <input type="password" placeholder="Password" name="Password" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label" for="textinput">Confirm Password</label>
                                            <div class="col-sm-9">
                                                <input type="password" placeholder="Confirm Password" name="ConfirmPassword" class="form-control">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label" for="textinput">Role</label>
                                            <div class="col-sm-9">

                                                <select class="form-control" name="role">
                                                    <c:forEach var="role" items="${roles}">
                                                        <option>${role.roleId}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>                                    

                                        <div class="panel-footer panel-heading">
                                            <div class="row">
                                                <div class="col-lg-2 col-lg-offset-7">
                                                    <a href="UserList" class="btn btn-warning ">
                                                        <span class="glyphicon glyphicon-circle-arrow-left  icon-white"></span>
                                                        Cancel
                                                    </a>
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
