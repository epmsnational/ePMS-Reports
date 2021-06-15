<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : personaldetails
    Created on : May 31, 2014, 9:13:03 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../mysegements/cssheader.jsp"/>
        <title>Personal Details</title>
    </head>
    <body>
        <div class="container">

            <jsp:include page="../../headersnippets/mainheadernav.jsp"/>

            <div class="row">
                <div class="col-sm-3 col-md-3">
                    <jsp:include page="usersidebar.jsp"/>
                </div>
                <div class="col-md-9">
                    <div class="row">
                        <div class="medium-12 columns">
                            <div class="panel" style="text-align: center;">
                                <h3> My Header</h3>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#home" data-toggle="tab">Personal Details</a></li>
                            <li class=""><a href="#profile" data-toggle="tab">Password</a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">

                            <div class="tab-pane active" id="home">
                                <br>
                                <form id="tab" action="UserPersonalDetails" method="post" 
                                      class="form-horizontal" role="form">
                                    <div class="row">
                                        <div class="col-md-8 col-md-offset-2"> 
                                            <div class="panel panel-warning">
                                                <div class="panel-heading">

                                                    <!-- Form Name -->
                                                    Personal Details
                                                </div>

                                                <div class="panel-body">
                                                    <input type="hidden" name="userid" value="${loggeduser.userid}">
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">First Name</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="First Name" name="fname" class="form-control" value="${loggeduser.firstName}">
                                                        </div>
                                                    </div>
                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">Last Name</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="Last Name" name="lname" class="form-control" value="${loggeduser.lastName}">
                                                        </div>
                                                    </div>
                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">National Id #</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="National Id number" name="natid" class="form-control" value="${loggeduser.nationalId}">
                                                        </div>
                                                    </div>
                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">Contact </label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="Contact Number" name="pnumber" class="form-control" value="${loggeduser.contactNumber}">
                                                        </div>
                                                    </div>


                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">Street Address</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="Street Address" name="streetaddress" class="form-control" value="${loggeduser.address1}">
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">State</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="State" name="stateprovince" class="form-control" value="${loggeduser.address2}">
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">ZIP code</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="ZIP code" name="zipcode" class="form-control" value="${loggeduser.zipCode}">
                                                        </div>
                                                    </div>


                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">Country</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" placeholder="Country" name="country" class="form-control" value="${loggeduser.address3}">
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

                            <div class="tab-pane" id="profile">
                                <br>
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

        </div>
    </body>
</html>
