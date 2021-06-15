<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : userpassword
    Created on : Jul 22, 2014, 9:42:47 PM
    Author     : TajmanniaA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../mysegements/cssheader.jsp"/>
        <title>Change Password</title>
    </head>
    <body>
        <div class="container">
           <jsp:include page="../headersnippets/mainheadernav.jsp"/>
            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <div class="row">
                        <div class="medium-12 columns">
                            <div class="panel" style="text-align: center;">
                                <h3> My Header</h3>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <ul class="nav nav-tabs">
                            <li ><a href="CustomeUserAccountSetting">Personal Details</a></li>
                            <li class="active"><a href="#">Change Password</a></li>
                            <li><a href="UserOrder">Product Orders</a></li>
                            <li><a href="Messages">Messages</a></li>
                        </ul>
                    </div><br>
                    <div class="row">
                        <div class="col-md-12">
                            <form id="tab2" class="form-horizontal" role="form"
                                  action="ChangePassword" method="post">
                                <div class="row">
                                    <div class="col-md-8 col-md-offset-2"> 
                                        <div class="panel panel-warning">
                                            <div class="panel-heading">

                                                <!-- Form Name -->
                                                Password Details
                                            </div>
                                            <div class="panel-body">
                                                <input type="hidden" name="userid" value="${loggeduser.userid}">
                                                <!-- Text input-->
                                                <div class="row">
                                                    <div class="col-sm-8 col-lg-offset-4 text-danger">
                                                        ${pswderr}
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label " for="textinput">Old Password</label>
                                                    <div class="col-sm-7">
                                                        <input type="password" name="oldPassword" placeholder="Old Password" class="form-control">
                                                    </div>
                                                </div>

                                                <!-- Text input-->

                                                <div class="row">
                                                    <div class="col-sm-7 col-lg-offset-4 text-danger">
                                                        ${confrimpasserr}
                                                    </div>
                                                </div>
                                                <!-- Text input-->
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label" for="textinput">New Password</label>
                                                    <div class="col-sm-7">
                                                        <input type="password" name="newpassword" placeholder="New Password" class="form-control">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label" for="textinput">Confirm Password</label>
                                                    <div class="col-sm-7">
                                                        <input type="password" name="confirmPassword" placeholder="confirm password" class="form-control">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="panel-footer">
                                                <div class="form-group">
                                                    <div class="col-sm-offset-2 col-sm-9">
                                                        <div class="pull-right">
                                                            <button type="submit" class="btn btn-default">Cancel</button>
                                                            <button type="submit" class="btn btn-warning">Save</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>



                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>

                </div>

            </div>
        </div>
    </body>
</html>
