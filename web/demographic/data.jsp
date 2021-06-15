<data>
    <table  class="display table table-bordered table-striped" id="example">
        <thead>
            <tr>
                <th>OPD NUMBER</th>

                <th>FIRST NAME</th>
                <th class="hidden-phone">LAST NAME</th>
                <th class="hidden-phone">NATIONAL ID</th>
                <th>DATE REGISTERED</th>
                <th>Activity</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="patient" items="${patients}">
            <tr class="gradeX">
                <td>${patient.opdnumber}</td>
                <td>${patient.firstName}</td>
                <td class="center hidden-phone">${patient.lastName}</td>
                <td class="center hidden-phone">${patient.nationalId}</td>
                <td>${patient.registrationDate}</td>
                <td><form action="ProgReferred" method="GET"><select name="prog"><option>VMMC</option><option>TB</option><option>HTS</option></select><input type="hidden" name="opdnum" value="${patient.opdnumber}"/><input type="submit" value="Refer"></form></td>
            </tr>
        </c:forEach>
    </table>
</data>


                                            

                                        