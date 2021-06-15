<%-- 
    Document   : StiExportExcel
    Created on : Dec 16, 2019, 8:59:01 PM
    Author     : devoop
--%>


<%@page import="com.vmmc.entities.Sti"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vmmc.entities.Cbs"%>
<html>
    <head>
        <title>Export STI</title>
    </head>
    <body>
        <h3>List of STI from ${startDate} to ${endDate}</h3>
        <table cellpadding="1" cellspacing="1" border="1" bordercolor="gray">
            <tr>
                <td>StI Number</td>
                <td>OPD number</td>
                <td>Date Of Registration</td>
                <td>Complaints</td>
                <td>Sti syndrome</td>
                <td>Examinations</td>
                <td>Tested For Syphilis</td>
                <td>Purpose Of Syphilis Testing</td>
                <td>Syphilis Result</td>
                <td>Treatment</td>
                <td>Tested For Hiv</td>
                <td>Sti Contact Slip Issued</td>
                <td>Sti Contact Slip Received</td>
                <td>Syphilis Result /td>
                <td>Screened For Syphilis</td>
                <td>Syphilis Treated </td>
                <td>Hiv Test Result</td>
                <td>Anc Tested During Pregnancy</td>
                <td>Condoms Issued</td>
                <td>Comments</td>
                <td>Entry Point</td>
                <td>Delivery Outcome</td>
                <td>Anc Booking Time</td>
                <td>Anc Tested For Syphilis</td>
                <td>Anc Syphilis Test Results</td>
                <td>Condom Information Given</td>
                <td>Anc Tested During Pregnancy</td>              
                <td>Anc Date Tested Syph Duri Preg</td>
                <td>Anc Syph Tested Before Result</td>
                <td>Anc Syph Treated Before</td>
                <td>Anc Delivery Date</td>
                <td>Sti Infection Type</td>
                <td>Anc Syphilis Result</td>
                <td>Hiv tested Before</td>
                <td>Hiv tested Before Result</td>


            </tr>
            <%
                List<Sti> sti = (List<Sti>) request.getAttribute("sti");
                if (sti != null) {
                    response.setContentType("application/vnd.ms-excel");
                    response.setHeader("Content-Disposition", "inline; filename="
                            + "STIReport.xls");
                }
                for (Sti st : sti) {
            %>
            <tr>
                <td><%=st.getStinumber()%></td>
                <td><%=st.getOpdnumber()%></td>
                <td><%=st.getDateOfRegistration()%></td>
                <td><%=st.getComplaints()%></td>
                <td><%=st.getStisyndrome()%></td>
                <td><%=st.getExaminations()%></td>
                <td><%=st.getTestedForSyphilis()%></td>
                <td><%=st.getPurposeOfSyphilisTesting()%></td>
                <td><%=st.getSyphilisResult()%></td>
                <td><%=st.getTreatment()%></td>
                <td><%=st.getTestedForHiv()%></td>
                <td><%=st.getStiContactSlipIssued()%></td>
                <td><%=st.getStiContactSlipReceived()%></td>
                <td><%=st.getSyphilisResult()%></td>
                <td><%=st.getScreenedForSyphilis()%></td>
                <td><%=st.getSyphilisTreated()%></td>
                <td><%=st.getHivTestResult()%></td>
                <td><%=st.getAncTestedDuringPregnancy()%></td>
                <td><%=st.getCondomsIssued()%></td>
                <td><%=st.getComments()%></td>
                <td><%=st.getEntryPoint()%></td>
                <td><%=st.getDeliveryOutcome()%></td>
                <td><%=st.getAncBookingTime()%></td>
                <td><%=st.getAncTestedForSyphilis()%></td>
                <td><%=st.getAncSyphilisTestResults()%></td>
                <td><%=st.getCondomInformationGiven()%></td>
                <td><%=st.getAncTestedDuringPregnancy()%></td>              
                <td><%=st.getAncDateTestedSyphDuriPreg()%></td>
                <td><%=st.getAncSyphTestedBeforeResult()%></td>
                <td><%=st.getAncSyphTreatedBefore()%></td>
                <td><%=st.getAncDeliveryDate()%></td>
                <td><%=st.getStiInfectionType()%></td>
                <td><%=st.getAncSyphilisResult()%></td>
                <td><%=st.getHivtestedBefore()%></td>
                <td><%=st.getHivtestedBeforeResult()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>