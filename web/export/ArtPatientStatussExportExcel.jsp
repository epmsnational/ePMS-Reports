<%-- 
    Document   : exportExcel
    Created on : Jul 11, 2019, 8:32:07 PM
    Author     : Mohcc-ATP
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vmmc.entities.Tblstatus"%>
<html>
    <head>
        <title>Export Patient Status</title>
    </head>
    <body>
        <h3>Export Patient Status</h3>
        <table cellpadding="1" cellspacing="1" border="1" bordercolor="gray">
            <tr>
                <td>Patient Id</td>
                <td>Status Date</td>
                <td>Status</td>
                <td>Notes</td>
            </tr>
            <%
                List<Tblstatus> apps = (List<Tblstatus>) request.getAttribute("statuses");
                if (apps != null) {
                    response.setContentType("application/vnd.ms-excel");
                    response.setHeader("Content-Disposition", "inline; filename="
                            + "PatientStatussReport.xls");
                }
                for (Tblstatus app : apps) {
            %>
            <tr>
                <td><%=app.getId().getPatientId()%></td>
                <td><%=app.getId().getStatusDate()%></td>
                <td><%=app.getStatus()%></td>
                <td><%=app.getNotes()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>