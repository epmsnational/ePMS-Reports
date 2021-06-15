<%-- 
    Document   : ArtVisitsEdit
    Created on : Mar 16, 2021, 1:19:23 PM
    Author     : ignatious
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
                                        <span><h3>Edit OI/ART Visit</h3></span> 
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
                                        <form class="form-horizontal" id="default" action="ArtEditVisit" method="post">
                                            <fieldset>
                                                <legend>Edit Visit</legend>
                                                <div class="form-group">
                                                    <label class="col-lg-2 control-label">PATIENT ID :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" name="txtpatientid" value="<c:out value="${pmodel.oiartvisit.id.patientId}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">VISIT DATE :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control"  name="txtvisitdate" value="<c:out value="${pmodel.oiartvisit.id.visitDate}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">VISIT TYPE :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" name="txtvisittype" value="<c:out value="${pmodel.oiartvisit.visitType}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">WHO STAGE :</label>
                                                    <div class="col-lg-4">
                                                        <input type="number" class="form-control"  name="txtwhostage" value="<c:out value="${pmodel.oiartvisit.whostage}"/>">
                                                    </div>
                                                    <label class="col-lg-2 control-label">ARV CODE</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" placeholder=" name" name="txtoldarvcode" value="<c:out value="${pmodel.oiartvisit.arvcode}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">ARV STATUS</label>
                                                    <div class="col-lg-4">
                                                        <input type="number" class="form-control" placeholder=" name" name="txtarvreason" value="<c:out value="${pmodel.oiartvisit.arvstatusCode}"/>">
                                                    </div>
                                                    <label class="col-lg-2 control-label">ARV REASON</label>
                                                    <div class="col-lg-4">
                                                        <input type="number" class="form-control" placeholder=" name" name="txtarvstatus" value="<c:out value="${pmodel.oiartvisit.arvreasonCode}"/>">
                                                    </div>
                                                    <label class="col-lg-2 control-label">ART REGIMEN :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control" value ="<c:out value="${regimen}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">CURRENT ART COMBINATION :</label>
                                                    <div class="col-lg-4">
                                                        <input type="text" class="form-control"  value ="<c:out value="${description}"/>" readonly="readonly">
                                                    </div>
                                                    <label class="col-lg-2 control-label">NEW ART COMBINATION :</label>
                                                    <div class="col-lg-4">
                                                        <select name="txtnewarvcode" class="form-control">
                                                            <option> </option>
                                                            <c:forEach var="arvregimen" items="${arvregimens}">
                                                                <option value="${arvregimen.arvcode}">${arvregimen.v2code} - ${arvregimen.arvdescription}</option>
                                                            </c:forEach>

                                                        </select>
                                                    </div>
                                                </div>
                                            </fieldset>  
                                    </div> 
                                    <div style="margin: 0 auto;width: 100px">
                                        <input type="submit" class="finish btn btn-success" value="Edit"/>
                                    </div> 
                                    </form>
                                    <div class=" add-task-row">
                                        <a class="btn btn-default btn-sm pull-right" href="OIARTSingleClientDashboard?${pmodel.oiartvisit.id.patientId}">GO BACK</a>
                                    </div>
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
