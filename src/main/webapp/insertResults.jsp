 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Results</title>
<link rel="stylesheet" href="styles/insert.css">
</head>
<body>
	<div class="regform"> <h1>ADD RESULTS </h1></div>
	<div class="main">
	<form action="insert" method="post">
	
	
	<h2 class="name">Student ID</h2>
	
		 <input class="int" type="text" name="stid"><br>
		 
		
		<h2 class="name">Student Name</h2>
		
		 <input type="text" class="int" name="name"><br>
		 
		
		<h2 class="name">Exam ID</h2>
		
		 <input type="text" class="int" name="eid"><br>
		
		<h2 class="name">OOP</h2>
		
		 <input type="text" class="int" name="oop"><br>
		
		<h2 class="name">SE</h2>
		
		<input type="text" class="int" name="se"><br>
		
		<h2 class="name">DBMS</h2>
		
	    <input type="text" class="int" name="dbms"><br>
	    
	    <h2 class="name">ICS</h2>
	    
	 <input type="text" class="int" name="ics"><br>
		
		<h2 class="name">OSSA</h2>
		
	 <input type="text" class="int" name="ossa"><br>
		
		<input type="submit" name="submit" value="Add Marks">
	</form>
	
	
<div>
<a href="adminHome.jsp" class="btn2">Home</a>
</div> 
	
	</div>


</body>
</html>