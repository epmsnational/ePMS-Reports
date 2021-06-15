<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : usersidebar
    Created on : May 31, 2014, 9:16:47 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <div class="panel panel-warning">
        <div class="panel-heading">
            <h4 class="panel-title">
                Account Options   <span class="glyphicon glyphicon-cog pull-right  text-warning"></span>
            </h4>
        </div>
        <div id="collapseOne" class="panel-collapse collapse in">
            <div class="panel-body">
                <table class="table">
                    <tbody><tr>
                            <td>
                                <a href="UserPersonalDetails">My Details</a>   <span class="glyphicon glyphicon-user pull-right  text-warning"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="UserOrder?userid=${loggeduser.userid}">All My Orders</a>   <span class="glyphicon glyphicon pull-right  text-warning"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="http://www.jquery2dotnet.com/">Processed Orders</a>   <span class="glyphicon glyphicon-shopping-cart pull-right  text-warning"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="http://www.jquery2dotnet.com/">Un-Processed Orders</a>   <span class="glyphicon glyphicon-shopping-cart pull-right  text-warning"></span>
                            </td>
                        </tr>
                    </tbody></table>
            </div>
        </div>
    </div>

