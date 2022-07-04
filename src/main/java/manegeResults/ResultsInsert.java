 package manegeResults;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResultsInsert")
public class ResultsInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sid = request.getParameter("stid");
		String sname = request.getParameter("name");
		String eid = request.getParameter("eid");
		String oop = request.getParameter("oop");
		String se = request.getParameter("se");
		String dbms = request.getParameter("dbms");
		String ics = request.getParameter("ics");
		String ossa = request.getParameter("ossa");
		
		boolean isTrue;
		
		isTrue = ResultDBUtil.insertresults(sid, sname, eid, oop, se, dbms, ics, ossa);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
