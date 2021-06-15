<%-- 
    Document   : CongenitalExportExcel
    Created on : Dec 16, 2019, 10:10:18 PM
    Author     : devoop
--%>


<%@page import="com.vmmc.entities.StiCs"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vmmc.entities.Cbs"%>
<html>
    <head>
        <title>Export STI Congenital Case</title>
    </head>
    <body>
        <h3>List of STI from ${startDate} to ${endDate}</h3>
        <table cellpadding="1" cellspacing="1" border="1" bordercolor="gray">
            <tr>
                <td>Stinumber</td>
                <td>Opdnumber</td>
                <td>DateofReport</td>
                <td>ReportingFacility</td>
                <td>MotherId</td>
                <td>MothersAddress</td>
                <td>MothersObsHistoryGravida</td>
                <td>MothersObsHistoryParity</td>
                <td>LmpbeforeDelivery</td>
                <td>MothersReligion</td>
                <td>FirstPrenatalVisit</td>
                <td>TrimesterFirstPrenatalVisit</td>
                <td>MotherHivstatusDuriPreg</td>
                <td>MothersMaritalStatus</td>
                <td>PeriodReceivingBenzathinePenicillin</td>
                <td>DateReceivingBenzathinePenicillin</td>
                <td>MotherSyphilisTreatment</td>
                <td>DateOfDelivery</td>
                <td>VitalStatus</td>
                <td>DateOfDeath</td>
                <td>BirthWeight</td>
                <td>GestationalAge</td>
                <td>NonTreponemaltest</td>
                <td>TiterOfNonTreponemalTest</td>
                <td>TreponemaltestDone</td>
                <td>TreponemaltestDoneDate</td>
                <td>DateOfNonTreponemalTest</td>              
                <td>DarkiedExam</td>
                <td>SignsOfCongenitalSyphilis</td>
                <td>BoneXray</td>
                <td>Csfvdrl</td>
                <td>CsfproteinCsfwb</td>
                <td>InfantCongenitalSyphilistreatment</td>
                <td>Csclassification</td>
                <td>IsNonTreponemalTestFirstVisit</td>
                <td>IsNonTreponemalTestWeeksGest</td>
                <td>IsNonTreponemalTestDelivery</td>
                <td>DateOfNonTreponemalTestMotherRecent</td>              
                <td>ResultOfNonTreponemalTestMotherRecent</td>
                <td>TiterOfNonTreponemalTestMotherRecent</td>
                <td>DateOfNonTreponemalTestMotherRecenFirst</td>
                <td>ResultOfNonTreponemalTestMotherFirst</td>
                <td>iterOfNonTreponemalTestMotherFirst</td>
                <td>DateOfPositiveTreponemalTestRecent</td>
                <td>DateOfPositiveTreponemalTestFirst</td>



            </tr>
            <%
                List<StiCs> stic = (List<StiCs>) request.getAttribute("stic");
                if (stic != null) {
                    response.setContentType("application/vnd.ms-excel");
                    response.setHeader("Content-Disposition", "inline; filename="
                            + "STICsReport.xls");
                }
                for (StiCs cs : stic) {
            %>
            <tr>
                <td><%=cs.getStinumber()%></td>
                <td><%=cs.getOpdnumber()%></td>
                <td><%=cs.getDateofReport()%></td>
                <td><%=cs.getReportingFacility()%></td>
                <td><%=cs.getMotherId()%></td>
                <td><%=cs.getMothersAddress()%></td>
                <td><%=cs.getMothersObsHistoryGravida()%></td>
                <td><%=cs.getMothersObsHistoryParity()%></td>
                <td><%=cs.getLmpbeforeDelivery()%></td>
                <td><%=cs.getMothersReligion()%></td>
                <td><%=cs.getFirstPrenatalVisit()%></td>
                <td><%=cs.getTrimesterFirstPrenatalVisit()%></td>
                <td><%=cs.getMotherHivstatusDuriPreg()%></td>
                <td><%=cs.getMothersMaritalStatus()%></td>
                <td><%=cs.getPeriodReceivingBenzathinePenicillin()%></td>
                <td><%=cs.getDateReceivingBenzathinePenicillin()%></td>
                <td><%=cs.getMotherSyphilisTreatment()%></td>
                <td><%=cs.getDateOfDelivery()%></td>
                <td><%=cs.getVitalStatus()%></td>
                <td><%=cs.getDateOfDeath()%></td>
                <td><%=cs.getBirthWeight()%></td>
                <td><%=cs.getGestationalAge()%></td>
                <td><%=cs.getNonTreponemaltest()%></td>
                <td><%=cs.getTiterOfNonTreponemalTest()%></td>
                <td><%=cs.getTreponemaltestDone()%></td>
                <td><%=cs.getTreponemaltestDoneDate()%></td>
                <td><%=cs.getDateOfNonTreponemalTest()%></td>              
                <td><%=cs.getDarkiedExam()%></td>
                <td><%=cs.getSignsOfCongenitalSyphilis()%></td>
                <td><%=cs.getBoneXray()%></td>
                <td><%=cs.getCsfvdrl()%></td>
                <td><%=cs.getCsfproteinCsfwb()%></td>
                <td><%=cs.getInfantCongenitalSyphilistreatment()%></td>
                <td><%=cs.getCsclassification()%></td>
                <td><%=cs.getIsNonTreponemalTestFirstVisit()%></td>
                <td><%=cs.getIsNonTreponemalTestWeeksGest()%></td>
                <td><%=cs.getIsNonTreponemalTestDelivery()%></td>
                <td><%=cs.getDateOfNonTreponemalTestMotherRecent()%></td>              
                <td><%=cs.getResultOfNonTreponemalTestMotherRecent()%></td>
                <td><%=cs.getTiterOfNonTreponemalTestMotherRecent()%></td>
                <td><%=cs.getDateOfNonTreponemalTestMotherRecenFirst()%></td>
                <td><%=cs.getResultOfNonTreponemalTestMotherFirst()%></td>
                <td><%=cs.getTiterOfNonTreponemalTestMotherFirst()%></td>
                <td><%=cs.getDateOfPositiveTreponemalTestRecent()%></td>
                <td><%=cs.getDateOfPositiveTreponemalTestFirst()%></td>

            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>