<%-- 
    Document   : manageuser
    Created on : Feb 24, 2016, 12:57:22 PM
    Author     : Developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <title>Remove Role</title>
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
                            Manage System User
                        </h1>
                    </section>

                    <!-- /.col-lg-12 -->
                    <div style="width: 80%;margin-left: auto; margin-right: auto;">
                       <section class="panel">
                          <header class="panel-heading">
                              Removing Role of userId ${username}
                          </header>
                          <div class="panel-body">
                              <c:forEach var="role" items="${roles}">
                                  <span  class="btn btn-shadow btn-success">${role.roleId}</span>
                              </c:forEach>
                             
                          </div>
                      </section>
                        <form class="form-horizontal" role="form" action="AssignRoles" method="Post">
                            <fieldset>
                                <div class="panel panel-info">
                                    <div class="panel-heading">
                                        <h3 class="panel-title" style="text-align: center;">Select Roles to assign to user</h3>
                                    </div>
                                    
                                    <div class="panel-body">
                                        <input type="hidden" value="${username}" name="hdusername" >
                                        <c:forEach var="role" items="${allRoles}">

                                            <input type =checkbox name="chkRoles" value="${role.name}" >&nbsp; ${role.name} <br>
                                        </c:forEach>

                                        
                                                 <hr>
                             <input type="submit"  class="btn btn-shadow btn-warning" value="Assign"/>
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
