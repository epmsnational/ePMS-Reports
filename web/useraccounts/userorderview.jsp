<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : userorderview
    Created on : May 31, 2014, 11:35:45 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../mysegements/cssheader.jsp"/>
        <title> My Order</title>  
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
                            <li ><a href="#">Change Password</a></li>
                            <li ><a href="UserOrder">Product Orders</a></li>
                        </ul>
                    </div><br>
                    <div class="row">
                        <div class="col-md-12">
                            
                                <div class="row">
                                    <div class="well col-xs-10 col-sm-10 col-md-6 ">
                                        <div class="row">
                                            <div class="col-xs-6 col-sm-6 col-md-6">
                                                <address>
                                                    <strong>${b.firstname} ${b.lastname}</strong>
                                                    <br>
                                                    ${b.idnumber}
                                                    <br>
                                                    ${b.address1}
                                                    <br>
                                                    ${b.address2}
                                                    <br>
                                                    ${b.address3}
                                                    <br>
                                                    <abbr title="Phone">Contact Number :</abbr> ${b.cnumber}
                                                    <br>

                                                    <abbr title="Email" >${b.emailaddress}</abbr>
                                                    <br>
                                                </address>
                                            </div>
                                            <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                                                <p>
                                                    <em>Date: ${o.dateString}</em>
                                                </p>
                                                <p>
                                                    <em>Order #: ${o.orderid}</em>
                                                </p>
                                                <p>
                                                    <em>Order status: <strong>${o.orderstatus}</strong></em>
                                                </p>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="text-center">
                                                <h1>Receipt</h1>
                                            </div>
                                            </span>
                                            <table class="table table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>Product</th>
                                                        <th class="col-md-1 text-center " >#</th>
                                                        <th class="col-md-2 text-center">Price</th>
                                                        <th class="col-md-2 text-center">Total</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="p" items="${orderItems}">
                                                        <tr>
                                                            <td class="col-md-6"><em>${p.productname}</em></h4></td>
                                                            <td class="col-md-1 text-center"> ${p.quantity} </td>
                                                            <td class="col-md-2 text-center">$ ${p.priceperunit}</td>
                                                            <td class="col-md-2 text-center">$ ${p.totalprice}</td>
                                                        </tr>
                                                    </c:forEach>

                                                    <tr>
                                                        <td>   </td>
                                                        <td>   </td>
                                                        <td class="text-center"><h4><strong>Total: </strong></h4></td>
                                                        <td class="text-center text-danger"><h4><strong>$ ${totalPrice}</strong></h4></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <div class="row">
                                                <div class="col-lg-4 col-md-offset-1">
                                                    <a href="#" class="btn btn-warning btn-block " style="width:100%;">Download Soft Copy</a>
                                                </div>
                                                <div class="col-lg-4 col-md-offset-2">
                                                    <a href="UserOrder" class="btn btn-warning btn-block " style="width:100%;">Back</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-md-6">
                                        <form action="SaveMessage" method="post" class="form-horizontal" role="form">
                                            <div class="panel panel-warning">
                                            <div class="panel-heading text-center">
                                                <input type="hidden" name="oriderid" value="${o.orderid}"/>
                                                <!-- Form Name -->
                                                Query Message
                                            </div>
                                            <div class="panel-body">
                                                 <div class="form-group">
                                                       <div class="col-sm-12">
                                                    <label class="col-sm-12  text-center text-success" for="textinput">${msg}</label>
                                                       </div>
                                                 </div>
                                                 <div class="form-group">
                                                       <div class="col-sm-12">
                                                    <label class="col-sm-12  text-center" for="textinput">Message Subject</label>
                                                       </div>
                                                 </div>
                                                <!-- Text input-->
                                                <div class="form-group">
                                                    <div class="col-sm-12">
                                                        <input type="text" class="form-control" name="msgsubject" placeholder="message body" />
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                       <div class="col-sm-12">
                                                    <label class="col-sm-12  text-center" for="textinput">Message Body</label>
                                                       </div>
                                                 </div>
                                                <!-- Text input-->
                                                <div class="form-group">
                                                    <div class="col-sm-12">
                                                       <textarea name="messagebody" class="form-control" id="Message" cols="45" rows="5" placeholder="Message Body"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="panel-footer">
                                                <div class="form-group">
                                                    <div class="col-sm-offset-3 col-sm-9">
                                                        <div class="pull-right">
                                                            <button type="submit" class="btn btn-default">Cancel</button>
                                                            <button type="submit" class="btn btn-warning">Save</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>



                                        </div>
                                        </form>
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
