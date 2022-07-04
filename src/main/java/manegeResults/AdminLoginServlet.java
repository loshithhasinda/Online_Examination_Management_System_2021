package manegeResults;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	String uname= request.getParameter("username");
	String pass= request.getParameter("password");

	boolean isTrue;
	
	isTrue = AdminDBUtil.validate(uname,pass);

	if (isTrue == true) {
		
		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
		
	} else {
		out.println("<script type='text/javascript'>");
		out.println("alert('Your User Name or Password is incorrect');");
		out.println("location='AdminLogin.jsp'");
		out.println("</script>");
		
		 
	}	
	
	}
	

}
