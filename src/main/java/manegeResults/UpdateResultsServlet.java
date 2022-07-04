 package manegeResults;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateResultsServlet")
public class UpdateResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("iid");
		String sid = request.getParameter("ssid");
		String sname = request.getParameter("nname");
		String eid = request.getParameter("eeid");
		String ooc = request.getParameter("ooop");
		String se = request.getParameter("sse");
		String dbms = request.getParameter("ddbms");
		String ics = request.getParameter("iics");
		String ossa = request.getParameter("oossa");
		//String tot = request.getParameter("ttot");
		//String avg = request.getParameter("aavg");
		//String gpa = request.getParameter("ggpa");
		
		
		
		float tot;
		float avg;
		float gpa;
    	int o = Integer.parseInt(ooc);
    	int s = Integer.parseInt(se);
    	int d = Integer.parseInt(dbms);
    	int i = Integer.parseInt(ics);
    	int os = Integer.parseInt(ossa);
    	tot = o+s+d+i+os;
    	avg = tot/5;
    	gpa = tot/125;
    	
    	
		
		boolean isTrue;
		
		isTrue = ResultDBUtil.updateresults(id, sid, sname, eid, ooc, se, dbms, ics, ossa, tot, avg, gpa);
		
		if(isTrue == true) {
			
			List<Results> rDetails = ResultDBUtil.getResultsDetails(id);
			request.setAttribute("rDetails", rDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("manegeResults.jsp");
			dis.forward(request, response);
		}
		else {
 
			List<Results> rDetails = ResultDBUtil.getResultsDetails(id);
			request.setAttribute("rDetails", rDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("manegeResults.jsp");
			dis.forward(request, response);
		}
	}


}
