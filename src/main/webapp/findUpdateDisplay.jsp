<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Update </title>
	<link rel="stylesheet" href="styles/new.css">
	
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
</head>
<body>
    <h1 align="center">Update Results</h1>

	<table align="center" cellpadding="5" cellspacing="5" border="1">
	<c:forEach var="r" items="${rDetails}">
	
	<c:set var="id" value="${r.id}"/>
	<c:set var="sid" value="${r.sid}"/>
	<c:set var="name" value="${r.name}"/>
	<c:set var="eid" value="${r.eid}"/>
	<c:set var="oop" value="${r.oop}"/>
	<c:set var="se" value="${r.se}"/>
	<c:set var="dbms" value="${r.dbms}"/>
    <c:set var="ics" value="${r.ics}"/>
	<c:set var="ossa" value="${r.ossa}"/>
	<c:set var="tot" value="${r.tot}"/>
	<c:set var="avg" value="${r.avg}"/>
	<c:set var="gpa" value="${r.gpa}"/>
	
	<tr>
		<td bgcolor="yellow"> ID</td>
		<td bgcolor="#A4DE02">${r.id}</td>
	</tr>
	<tr>
		<td bgcolor="yellow">Student ID</td>
		<td bgcolor="#A4DE02">${r.sid}</td>
	</tr>
	<tr>
		<td bgcolor="yellow">Student Name</td>
		<td bgcolor="#A4DE02">${r.name}</td>
	</tr>
	<tr>
		<td bgcolor="yellow">Exam ID</td>
		<td bgcolor="#A4DE02">${r.eid}</td>
	</tr>
	<tr>
		<td bgcolor="yellow">OOP</td>
		<td bgcolor="#A4DE02">${r.oop}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">SE</td>
		<td bgcolor="#A4DE02">${r.se}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">DBMS</td>
		<td bgcolor="#A4DE02">${r.dbms}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">ICS</td>
		<td bgcolor="#A4DE02">${r.ics}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">OSSA</td>
		<td bgcolor="#A4DE02">${r.ossa}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">Total</td>
		<td bgcolor="#A4DE02">${r.tot}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">Average</td>
		<td bgcolor="#A4DE02">${r.avg}</td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">GPA</td>
		<td bgcolor="#A4DE02">${r.gpa}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updateResults.jsp" var="rupdate">
 
 	<c:param name="id" value="${id}"/>
	<c:param name="sid" value="${sid}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="eid" value="${eid}"/>
	<c:param name="oop" value="${oop}"/>
	<c:param name="se" value="${se}"/>
	<c:param name="dbms" value="${dbms}"/>
    <c:param name="ics" value="${ics}"/>
	<c:param name="ossa" value="${ossa}"/>
	<c:param name="tot" value="${tot}"/>
	<c:param name="avg" value="${avg}"/>
	<c:param name="gpa" value="${gpa}"/>
		
		
		
	</c:url>
	
	<a href="${rupdate}">
	<input type="button" name="update" class="btn2" value="Update">
	</a>
	
	
	
 
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>