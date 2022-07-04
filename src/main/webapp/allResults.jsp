<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "oems";
String userId = "root";
String password = "kishara";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>All Students Results</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#28c9ac">
<td><b>Id</b></td>
<td><b>Student Id</b></td>
<td><b>Student Name</b></td>
<td><b>Exam ID</b></td>
<td><b>OOP</b></td>
<td><b>SE</b></td>
<td><b>DBMS</b></td>
<td><b>ICS</b></td>
<td><b>OSSA</b></td>
<td><b>Total</b></td>
<td><b>Average</b></td>
<td><b>GPA</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM results_table";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="yellow">

<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("student_id") %></td>
<td><%=resultSet.getString("student_name") %></td>
<td><%=resultSet.getString("exam_id") %></td>
<td><%=resultSet.getString("ooc") %></td>
<td><%=resultSet.getString("se") %></td>
<td><%=resultSet.getString("dbms") %></td>
<td><%=resultSet.getString("ics") %></td>
<td><%=resultSet.getString("ossa") %></td>
<td><%=resultSet.getString("total") %></td>
<td><%=resultSet.getString("average") %></td>
<td><%=resultSet.getString("gpa") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>