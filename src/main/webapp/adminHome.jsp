<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
<link rel="stylesheet" href="styles/adminhome.css">

</head>
<body>




    <div class="topnav" id="myTopnav">
        <a href="home.jsp">Home</a>
        <a href="#">Manage User</a>
        <a href="#">Manage Exams</a>
        <a href="#">Manage Questions</a>
        <a href="#adminHome">Manage Results</a>
        <a href="#">Contact Us</a>
        <a href="#">About Us</a>  
            
        <button onclick="location.href = 'Start.jsp'; " style="margin-right: 20px; float: right;" class="navButton"> Sign Out </button>
        <button onclick="myAccount.jsp" style="margin-right: 20px; float: right;" class="navButton"> My Account </button>
        
    </div>
  
 





<h1>Manage Students Results</h1>
<div class="pbox" align="center">
<div >
<a href="allResults.jsp" class="btn1">All Results</a>
</div>
 <br>  <br> 
<div >
<a href="adminSearch.jsp" class="btn1">Search Results</a>
</div>  

 <br>  <br> 
<div >
<a href="insertResults.jsp" class="btn1">Insert Results</a>
</div>  

 <br>  <br> 
<div>
<a href="findUpdate.jsp" class="btn1">Update Results</a>
</div>  

 <br>  <br> 
<div>
<a href="findDelete.jsp" class="btn1">Delete Results</a>
</div> 


 <br>  <br> 
<div>
<a href="findManegeResults.jsp" class="btn1">Update/Delete</a>
</div> 


</div> 



<br><br>

<div align="center">
<table>
<tr>
<td>
<div>
<a href="home.jsp" class="btn2">Back</a>
</div> 
</td>

<td>
<div>
<a href="home.jsp" class="btn2">Home</a>
</div> 
</td>
</tr>

</table>
</div>
 

</body>
</html>