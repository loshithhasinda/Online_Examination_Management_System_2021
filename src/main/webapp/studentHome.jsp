<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
<link rel="stylesheet" href="styles/searchresults.css">
</head>
<body>
<div class="box">
<h1>Enter Your Student ID</h1>
<form action="search" method="post">
<input type="text" name="stid" placeholder="Type.....">

<input type="submit" name="submit" value="Check Results">

</form>
<br>

<div>
<a href="allResults.jsp" class="btn1">All Results</a>   
</div>

<br>

<div>
<a href="shome.jsp" class="btn1">Back</a>   
</div>



</div>
</body>
</html>