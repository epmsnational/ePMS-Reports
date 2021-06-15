<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
    <title>HTS System</title>

    <spring:url value="/static/core/css/hello.css" var="coreCss" />
    <spring:url value="/static/core/css/bootstrap.min.css"
                var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${coreCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/new" var="urlAddPatient" />
<spring:url value="/plist" var="urlPatientList" />
<spring:url value="/user/list" var="urlUserList" />
<spring:url value="/hts/list" var="urlHTSList" />
<spring:url value="/user/logout" var="logout" />

<nav class="navbar navbar-inverse ">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${urlHome}">Ministry of health and child care</a>
        </div>
        
        <div id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="${urlHome}">Home</a></li>
                <li class="active"><a href="${urlAddPatient}">Add Patient</a></li>
                 <li class="active"><a href="${urlPatientList}">Patient List</a></li>
                 <li class="active"><a href="${urlHTSList}">HTS List</a></li>
                 <li class="active"><a href="${urlUserList}">User List</a></li>
                 <li class="active"><a href="${logout}">Log OUT</a></li>
            </ul>
        </div>
       
</div>
</nav>