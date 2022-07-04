package manegeResults;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class findUpdateServlet
 */
@WebServlet("/findUpdateServlet")
public class findUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String stid= request.getParameter("stid");

		boolean isTrue;
		
		isTrue = ResultDBUtil.validate(stid);

		if (isTrue == true) {
			List<Results> rDetails = ResultDBUtil.getResults(stid);
			request.setAttribute("rDetails", rDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("findUpdateDisplay.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Student ID is incorrect');");
			out.println("location='findUpdate.jsp'");
			out.println("</script>");
			
 
		}	
		
		
		
	}

}
