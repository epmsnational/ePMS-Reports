<%-- 
    Document   : exportExcel
    Created on : Jul 11, 2019, 8:32:07 PM
    Author     : Mohcc-ATP
--%>

<%@page import="com.vmmc.entities.CbsTests"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<html>
    <head>
        <title>Export CBS</title>
    </head>
    <body>
        <h3>List of Recency Tested from ${startDate} to ${endDate}</h3>
        <table cellpadding="1" cellspacing="1" border="1" bordercolor="gray">
            <tr>
                <td>Hts Number</td>
                <td>Recency Test Status</td>
                <td>Test Date</td>
                <td>Test Result</td>
                <td>Tester Name</td>
                <td>Reason Test Not Done</td>

            </tr>
            <%
                List<CbsTests> cbs = (List<CbsTests>) request.getAttribute("epmtylist");
                if (cbs != null) {
                    response.setContentType("application/vnd.ms-excel");
                    response.setHeader("Content-Disposition", "inline; filename="
                            + "Recency Testingt.xls");
                }
                for (CbsTests cb : cbs) {
            %>
            <tr>
                 <td><%=cb.getHtcnumber()%></td>
                <td><%=cb.getRecencyTesting()%></td>
                <td><%=cb.getRecencyTestingDate()%></td>
                <td><%=cb.getRecencyTestingResult()%></td>
                <td><%=cb.getRecencyTesterName()%></td>
                <td><%=cb.getRecencyTestingNotDone()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>