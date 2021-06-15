<%-- 
    Document   : exportExcel
    Created on : Jul 11, 2019, 8:32:07 PM
    Author     : Mohcc-ATP
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vmmc.entities.Tblappointments"%>
<html>
<head>
<title>Export Appointments</title>
</head>
<body>
<h3>List of Appointments from ${startDate} to ${endDate}</h3>
<table cellpadding="1" cellspacing="1" border="1" bordercolor="gray">
        <tr>
                <td>Patient Id</td>
                <td>Date of Appointment</td>
                <td>Date appointment given</td>
                <td>Appointment Canceled</td>
                <td>Appointment Notes</td>
        </tr>
        <%
        List<Tblappointments> apps = (List<Tblappointments>) request.getAttribute("epmtylist");
                if (apps != null) {
                        response.setContentType("application/vnd.ms-excel");
                        response.setHeader("Content-Disposition", "inline; filename="
                                        + "AppointmentsReport.xls");
                }
                for (Tblappointments app  : apps) {
        %>
        <tr>
                <td><%=app.getId().getPatientId()%></td>
                <td><%=app.getId().getDateOfAppointment()%></td>
                <td><%=app.getDateAppointmentGiven()%></td>
                <td><%=app.getCancelled()%></td>
                <td><%=app.getNotes()%></td>
        </tr>
        <%
                }
        %>
</table>
</body>
</html>