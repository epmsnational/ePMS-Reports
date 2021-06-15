<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : test
    Created on : Oct 20, 2015, 4:29:43 AM
    Author     : System Devoloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            
        
            <c:forEach var="reason" items="${lstCircumReasons}">
                <li>${reason.circumcisionReasonName}</li>
            </c:forEach>
        </ul>
    </body>
</html>
