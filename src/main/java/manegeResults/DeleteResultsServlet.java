package manegeResults;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteResultsServlet")
public class DeleteResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("iid");
		boolean isTrue;
		
		isTrue = ResultDBUtil.deleteResults(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("insertResults.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Results> rDetails = ResultDBUtil.getResultsDetails(id);
			request.setAttribute("rDetails", rDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("manegeResults.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}


}
