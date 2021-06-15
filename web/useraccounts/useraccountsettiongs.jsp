<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : useraccountsettiongs
    Created on : May 31, 2014, 4:18:01 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Settings</title>
        <meta charset="UTF-8"> 
        <jsp:include page="../mysegements/cssheader.jsp"/>

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
                            <li class="active"><a href="#">Personal Details</a></li>
                            <li><a href="ChangePassword">Change Password</a></li>
                            <li><a href="UserOrder">Product Orders</a></li>
                            <li><a href="Messages">Messages</a></li>
                        </ul>
                    </div><br>
                    <div class="row">
                        <div class="col-md-12">
                               <form action="UserPersonalDetails" method="post" 
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
                    </div>

                </div>

            </div>
        </div>
    </body>
</html>
