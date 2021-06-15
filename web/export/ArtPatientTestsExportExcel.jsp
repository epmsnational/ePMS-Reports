<%-- 
    Document   : exportExcel
    Created on : Jul 11, 2019, 8:32:07 PM
    Author     : Mohcc-ATP
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vmmc.entities.Tbltests"%>
<html>
<head>
<title>Export Tests</title>
</head>
<body>
<h3>List of${testtype} Tests from ${startDate} to ${endDate}</h3>
<table cellpadding="1" cellspacing="1" border="1" bordercolor="gray">
        <tr>
                <td>Patient Id</td>
                <td>Test Type</td>
                <td>Test Date</td>
                <td>Result Date</td>
                <td>Test Result</td>
                <td>Test Notes</td>
                <td>Date Test Received by Patient</td>
                 <td>Visit Date</td>
        </tr>
        <%
        List<Tbltests> tests = (List<Tbltests>) request.getAttribute("epmtylist");
                if (tests != null) {
                        response.setContentType("application/vnd.ms-excel");
                        response.setHeader("Content-Disposition", "inline; filename="
                                        + "TestsReport.xls");
                }
                for (Tbltests test  : tests) {
        %>
        <tr>
                <td><%=test.getTblpatients().getPatientId()%></td>
                <td><%=test.getTestTypeId()%></td>
                <td><%=test.getTestDate()%></td>
                <td><%=test.getResultDate()%></td>
                <td><%=test.getResultNumeric()%></td>
                <td><%=test.getResultNotes()%></td>
                <td><%=test.getRecievedDate()%></td>
                <td><%=test.getVisitDate()%></td>
                
        </tr>
        <%
                }
        %>
</table>
</body>
</html>