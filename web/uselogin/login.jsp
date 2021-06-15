<%-- 
    Document   : login
    Created on : May 13, 2014, 9:00:31 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="vmmcresources/fonts/normalize.min.css">
        <link rel="stylesheet" href="vmmcresources/fonts/style.css">
        <script src="vmmcresources/fonts/prefixfree.min.js"></script>
    </head>

    <body>
        <div class="program">
            <h1>HIV/AIDS AND TB</h1>
        </div>
        <div class="title">
            <h1>Electronic Patient Monitoring System</h1>
        </div>
        <p>
        <div class="login">
            <form action="j_security_check" method="post">
                <input type="text" name="j_username" placeholder="Username" required="required" />
                <input type="password" name="j_password" placeholder="Password" required="required" />
                <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
            </form>
        </div>
        <!-- partial -->
        <script  src="vmmcresources/fonts/script.js"></script>

    </body>


    <!--
       <body class="login-body">
   
           <div class="container">
   
               <form class="form-signin" action="j_security_check" method="post">
                   <h2 class="form-signin-heading">sign in now</h2>
                   <div class="login-wrap">
                       <input type="text" class="form-control" placeholder="User ID"  name="j_username"autofocus>
                       <input class="form-control" placeholder="Password" name="j_password" type="password" value="">
                       <label class="checkbox">
                           <input type="checkbox" value="remember-me"> Remember me
                           <span class="pull-right">
                               <a data-toggle="modal" href="#myModal"> Forgot Password?</a>
   
                           </span>
                       </label>
                       <button class="btn btn-lg btn-login btn-block" type="submit">Sign in</button>
   
   
                   </div>
   
                   
                   <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
                       <div class="modal-dialog">
                           <div class="modal-content">
                               <div class="modal-header">
                                   <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                   <h4 class="modal-title">Forgot Password ?</h4>
                               </div>
                               <div class="modal-body">
                                   <p>Enter your e-mail address below to reset your password.</p>
                                   <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
   
                               </div>
                               <div class="modal-footer">
                                   <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                   <button class="btn btn-success" type="button">Submit</button>
                               </div>
                           </div>
                       </div>
                   </div>
   
               </form>
        
           </div>
    <%@include file="/vmmcincludes_js/flatbethemejs.jsp" %>
</body
    -->
</html>
