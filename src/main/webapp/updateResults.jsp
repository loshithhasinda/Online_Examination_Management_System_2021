<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Update Results</title>
	<link rel="stylesheet" href="styles/new.css">
	<style type="text/css">
		table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 1px solid black;
		}
	</style>
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
	
	
	<form action="update" method="post">
	
	<h1 align="center">Update</h1>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>
			<td bgcolor="yellow">ID</td>
			<td><input type="text" name="iid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td bgcolor="yellow">Student ID</td>
			<td><input type="text" name="ssid" value="<%= sid %>"></td>
		</tr>
		<tr>
		<td bgcolor="yellow">Student Name</td>
		<td><input type="text" name="nname" value="<%= name %>"></td>
	</tr>
	<tr>
		<td bgcolor="yellow">Exam ID</td>
		<td><input type="text" name="eeid" value="<%= eid %>"></td>
	</tr>
	<tr>
		<td bgcolor="yellow">OOP</td>
		<td><input type="text" name="ooop" value="<%= oop %>"></td>
	</tr>
	<tr>
		<td bgcolor="yellow">SE</td>
		<td><input type="text" name="sse" value="<%= se %>"></td>
	</tr>
	<tr>
		<td bgcolor="yellow">DBMS</td>
		<td><input type="text" name="ddbms" value="<%= dbms %>"></td>
	</tr>
	<tr>
		<td bgcolor="yellow">ICS</td>
		<td><input type="text" name="iics" value="<%= ics %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">OSSA</td>
		<td><input type="text" name="oossa" value="<%= ossa %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">Total</td>
		<td><input type="text" name="ttot" value="<%= tot %>"></td>
	</tr>	

	<tr>
		<td bgcolor="yellow">Average</td>
		<td><input type="text" name="aavg" value="<%= avg %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="yellow">GPA</td>
		<td><input type="text" name="ggpa" value="<%= gpa %>"></td>
	</tr>		
	
			
	</table>
	<br>
	<input type="submit" name="submit" class="btn2" value="Update">
	</form>

</body>
</html>