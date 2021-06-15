<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : userorders
    Created on : May 31, 2014, 10:30:03 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../mysegements/cssheader.jsp"/>
        <title>My Orders</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="../headersnippets/mainheadernav.jsp"/>


            <div class="row">
                <div class="col-md-10 col-md-offset-1">

                    <div class="row">
                        <div class="medium-12 columns">
                            <div class="panel" style="text-align: center;">
                                <h3> My Orders</h3>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <ul class="nav nav-tabs">
                            <li ><a href="#">Personal Details</a></li>
                            <li><a href="ChangePassword">Change Password</a></li>
                            <li class="active"><a href="#">Product Orders</a></li>
                            <li><a href="Messages">Messages</a></li>
                        </ul>
                    </div><br>
                    <div class="row">
                        <div class=" col-sm-8 navbar navbar-default">
                            <ul class="nav navbar-nav">
                                <li><div class="navbar-brand"> Search Options</div></li>
                                <li><a href="#ordernumbermodal" data-toggle="modal">By Order#</a></li>
                                <li><a  href="#danger" data-toggle="modal">Search By Dates</a></li>
                                <li><a href="#">Back</a></li>
                            </ul>
                        </div>
                        <div class="col-lg-3 col-lg-offset-1">
                            <!-- Controls -->
                            <div class="controls pull-right hidden-xs">
                                <a class="left glyphicon glyphicon-chevron-left btn btn-warning" href="UserOrder?page=${prev}&search=${search}" data-slide="prev"></a>
                                <a class="right glyphicon glyphicon-chevron-right btn btn-warning" href="UserOrder?page=${next}&search=${search}" data-slide="next"></a>
                            </div>
                        </div>
                    </div>
                    <div class="table-responsive">


                        <table id="mytable" class=" col-lg-12  table table-bordred table-hover table-striped ">

                            <thead class="text-center">

                                <tr class="text-center">
                                    <th class="text-center">Order reference #</th>
                                    <th class="text-center">Total</th>
                                    <th class="text-center">Date</th>
                                    <th class="text-center">Status</th>
                                    <th class="text-center">View Order Details</th>
                                </tr></thead>
                            <tbody >

                                <c:forEach var="l" items="${orderList}">

                                    <tr class="text-center">
                                        <td>${l.orderid}</td>
                                        <th>$ ${l.totalcost}</th>
                                        <td>${l.dateString} </td>
                                        <td>${l.orderstatus}</td>
                                        <td><a href="UserOrderView?oriderid=${l.orderid}" class="btn btn-warning btn-sm"> 
                                                <i class=" glyphicon glyphicon-list-alt"> </i>    </a></td>
                                    </tr>
                                </c:forEach>


                            </tbody>

                        </table>

                        <div class="clearfix"></div>
                        <div class="col-lg-3 col-lg-offset-9">
                            <!-- Controls -->
                            <div class="controls pull-right hidden-xs">
                                <a class="left glyphicon glyphicon-chevron-left btn btn-warning" href="UserOrder?page=${prev}&search=${search}" data-slide="prev"></a>
                                <a class="right glyphicon glyphicon-chevron-right btn btn-warning" href="UserOrder?page=${next}&search=${search}" data-slide="next"></a>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="row">
                    <form class="form-horizontal" role="form" action="UserOrder" method="post">
                        <input type="hidden" name="searchType" value="datesearch"/> 
                        <fieldset>
                            <div class="modal fade" id="danger" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header modal-header-danger ">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                            <h3>Search Order using dates</h3>
                                        </div>
                                        <div class="modal-body">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input type="hidden" name="userid" value="${loggeduser.userid}"/>

                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">Start Date</label>
                                                        <div class="col-sm-9">
                                                            <div class="input-group date">
                                                                <input type="text" name="startdate" class="form-control datepicker" placeholder="Date Format yyyy-mm-dd"><span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                                            </div> 
                                                        </div>
                                                    </div>

                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">End Date</label>
                                                        <div class="col-sm-9">
                                                            <div class="input-group date">
                                                                <input type="text" name="finishdate" class="form-control datepicker" placeholder="Date Format yyyy-mm-dd"><span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                                            </div> 
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-3 text-center " >Order Status</label>
                                                        <div class="col-sm-9">
                                                            <select name="orderStats" class="form-control" id="showprice">
                                                                <option value="All">All</option>
                                                                <option value="Processed">Processed</option>
                                                                <option value="Pending">Pending</option>
                                                            </select>   
                                                        </div>
                                                    </div>




                                                </div><!-- /.col-lg-12 -->
                                            </div>
                                        </div>

                                        <div class="modal-footer">

                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <a href="#" class="btn btn-default btn-lg "  style="width:100%;" data-dismiss="modal">back</a>
                                                </div>

                                                <div class="col-lg-6">
                                                    <button type="submit" class="btn btn-warning btn-lg" style="width:100%;">
                                                        Search 
                                                    </button>
                                                </div>
                                            </div>


                                        </div>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal-dialog -->
                        </fieldset>
                    </form>
                </div>



                <div class="row">
                    <form class="form-horizontal" role="form"  action="UserOrder" method="post">
                        <input type="hidden" name="searchType" value="ordernumber"/> 
                        <fieldset>
                            <div class="modal fade" id="ordernumbermodal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header modal-header-danger ">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                            <h3>Search Order using Order Number</h3>
                                        </div>
                                        <div class="modal-body">
                                            <div class="row">
                                                <div class="col-md-12">

                                                    <!-- Text input-->
                                                    <div class="form-group">
                                                        <label class="col-sm-3 control-label" for="textinput">Order Number</label>
                                                        <div class="col-sm-9">
                                                            <input type="text" name="orderid" class="form-control" placeholder="Order number">
                                                            <input type="hidden" name="userid" value="${loggeduser.userid}"/>
                                                            <input type="hidden" name="searchType" value="ordernumber"/>
                                                        </div>
                                                    </div>


                                                </div><!-- /.col-lg-12 -->
                                            </div>
                                        </div>

                                        <div class="modal-footer">

                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <a href="#" class="btn btn-default btn-lg "  style="width:100%;" data-dismiss="modal">back</a>
                                                </div>

                                                <div class="col-lg-6">
                                                    <button type="submit" class="btn btn-warning btn-lg" style="width:100%;">
                                                        Search 
                                                    </button>
                                                </div>
                                            </div>


                                        </div>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal-dialog -->
                        </fieldset>
                    </form>
                </div>
            </div>



            <script type='text/javascript'>//<![CDATA[ 
                $(window).load(function() {
                    $('.datepicker').datepicker({
                        autoclose: true,
                        format: 'yyyy-mm-dd'
                    });
                });//]]>  

            </script>      
        </div>
    </body>
</html>
