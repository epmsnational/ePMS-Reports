<%-- 
    Document   : AllVmmcs
    Created on : Nov 8, 2015, 10:06:05 PM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit OI/ART Client</title>
        <%@include file="/vmmcincludes_css/flatbedtheme.jsp" %>
        <style>
            #rotatorLoader{
                width:100%;
                height:100%;
                position: absolute;
                z-index:9999;
                background:url("img/725.gif") no-repeat center center rgba(0,0,0,0)
            }
        </style>
    </head>

    <body class="skin-blue">
        <section id="container" class="">
            <%@include file="../vmmcheader.jsp" %>         

            <%@include file="../leftsidebar.jsp" %>

            <section id="main-content">
                <section class="wrapper site-min-height">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <div class="alert alert-success">
                                        <span><h3>Edit OI/ART Clients</h3></span> 
                                    </div>
                                </div><!-- /.box-header -->
                            </div>
                        </div>
                    </div>
                    <!-- page start--> 
                    <div class="row">

                        <div class="col-lg-12">
                            <section class="panel">
                                <header class="panel-heading">
                                    OI/ART MODULE
                                </header>
                                <div class="panel-body">
                                    <div class="adv-table">  
                                        <form class="form-horizontal" id="default" action="OIARTEdit" method="post">
                                            <fieldset>
                                                <legend>Edit OI/ART NUMBER</legend>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">OLD OI/ART NUMBER :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control"  name="txtartnumberold" value="<c:out value="${pmodel.patient.patientId}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">FIRST NAME</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder=" name" name="txtfame" value="<c:out value="${pmodel.patient.firstName}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">LAST NAME :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder="middle name" name="txtlastame" value ="<c:out value="${pmodel.patient.lastName}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">NATIONAL ID :</label>
                                                    <div class="col-lg-4">
                                                        <input readonly="readonly" type="text" class="form-control" placeholder=" national id" name="txtnatId" value="<c:out value="${pmodel.patient.nationalId}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label" >REGISTRATION DATE </label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control"  name="txtregdate" value="<c:out value="${pmodel.patient.registrationDate}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label" >OPD NUMBER </label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control"  name="txtopdnumber" value="<c:out value="${pmodel.patient.opdnumber}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label"> NEW OI/ART NUMBER :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control"  name="txtartnumber" value="<c:out value="${pmodel.patient.patientId}"/>">
                                                    </div>
                                                </div>
                                            </fieldset>  
                                    </div> 
                                    <div class="text-center">
                                            <input type="submit" class="finish btn btn-success" value="Edit"/>
                                    </div> 
                                    </form>
                                </div>
                        </div>
                </section>
                </div>
                </div>
            </section>
        </section>
    </section>
    <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
    <script type="text/javascript" charset="utf-8">
        $(document).ready(function () {
            $('#example').dataTable({
                "aaSorting": [[4, "desc"]]
            });
        });
        document.onreadystatechange = function () {
            var state = document.readyState;
            if (state === 'interactive') {
                document.getElementById('contentLoader').style.visibility = "hidden";
            } else if (state === 'complete') {
                setTimeout(function () {
                    document.getElementById('interactive');
                    document.getElementById('rotatorLoader').style.visibility = "hidden";
                    document.getElementById('contentLoader').style.visibility = "visible";
                }, 1000);
            }
        };
    </script>


</body>
</html>
