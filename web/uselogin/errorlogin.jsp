<%-- 
    Document   : errorlogin
    Created on : May 13, 2014, 9:04:12 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login Error</title>
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
                <h2 class="form-signin-heading" style="color: red;">Incorrect Username or password</h2>
                <input type="text" name="j_username" placeholder="Username" required="required" />
                <input type="password" name="j_password" placeholder="Password" required="required" />
                <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
            </form>
        </div>
        
        <script  src="vmmcresources/fonts/script.js"></script>
                 <div class="container">
     
    </body>
</html>
