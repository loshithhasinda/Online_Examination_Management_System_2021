<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Delete Marks</title>
	<link rel="stylesheet" href="styles/new.css">
</head>
<body>

	<%
	String id = request.getParameter("id");
	String sid = request.getParameter("sid");
	String name = request.getParameter("name");
	String eid = request.getParameter("eid");
	String oop = request.getParameter("oop");
	String se = request.getParameter("se");
	String dbms = request.getParameter("dbms");
	String ics = request.getParameter("ics");
	String ossa = request.getParameter("ossa");
	String tot = request.getParameter("tot");
	String avg = request.getParameter("avg");
	String gpa = request.getParameter("gpa");
	%>


	<form action="delete" method="post">
	
	<h1 align="center">Delete</h1>
	
	 
	 <table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>
			<td bgcolor="yellow">ID</td>
			<td><input type="text" name="iid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td bgcolor="yellow">Student ID</td>
			<td><input type="text" name="ssid" value="<%= sid %>" readonly></td>
		</tr>
		<tr>
		<td bgcolor="yellow">Student Name</td>
		<td><input type="text" name="nname" value="<%= name %>" readonly></td>
	</tr>
	<tr>
		<td bgcolor="yellow">Exam ID</td>
		<td><input type="text" name="eeid" value="<%= eid %>" readonly></td>
	</tr>
	<tr>
		<td bgcolor="yellow">OOP</td>
		<td><input type="text" name="ooop" value="<%= oop %>" readonly></td>
	</tr>
	<tr>
		<td bgcolor="yellow">SE</td>
		<td><input type="text" name="sse" value="<%= se %>" readonly></td>
	</tr>
	<tr>
		<td bgcolor="yellow">DBMS</td>
		<td><input type="text" name="ddbms" value="<%= dbms %>" readonly></td>
	</tr>
	<tr>
		<td bgcolor="yellow">ICS</td>
		<td><input type="text" name="iics" value="<%= ics %>" readonly></td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">OSSA</td>
		<td><input type="text" name="oossa" value="<%= ossa %>" readonly></td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">Total</td>
		<td><input type="text" name="ttot" value="<%= tot %>" readonly></td>
	</tr>	

	<tr>
		<td bgcolor="yellow">Average</td>
		<td><input type="text" name="aavg" value="<%= avg %>" readonly></td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">GPA</td>
		<td><input type="text" name="ggpa" value="<%= gpa %>" readonly></td>
	</tr>		
	
			
	</table>
	<br>
	 
	 
	 
	<input type="submit" name="submit" class="btn2" value="Delete">
	</form>

</body>
</html>