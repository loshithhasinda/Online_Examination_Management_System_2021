package manegeResults;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResultDBUtil {
	
	private static boolean Success;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

    
	public static boolean validate(String stid) {
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from results_table where student_id ='"+stid+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				Success = true;
			} else {
				Success = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Success;
	}
	
	public static List<Results> getResults(String stid) {
		
		ArrayList<Results> results = new ArrayList<>();
		
		try {
			
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from results_table where student_id ='"+stid+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String sid = rs.getString(2);
				String name = rs.getString(3);
				String eid = rs.getString(4);
				String oop = rs.getString(5);
				String se = rs.getString(6);
				String dbms = rs.getString(7);
				String ics = rs.getString(8);
				String ossa = rs.getString(9);
				String tot = rs.getString(10);
				String avg = rs.getString(11);
				String gpa = rs.getString(12);
				
				Results r = new Results(id,sid,name,eid,oop,se,dbms,ics,ossa,tot,avg,gpa);
				results.add(r);
			}
			
		} catch (Exception e) {
			
		}
		
		return results;	
	}
	

    public static boolean insertresults(String sid, String name, String eid, String oop, String se, String dbms, String ics, String ossa) {
    	
    	boolean Success = false;
    	float tot;
    	float avg;
    	float gpa;
    	
    	int o = Integer.parseInt(oop);
    	int s = Integer.parseInt(se);
    	int d = Integer.parseInt(dbms);
    	int i = Integer.parseInt(ics);
    	int os = Integer.parseInt(ossa);
    	tot = o+s+d+i+os;
    	avg = tot/5;
    	gpa = tot/125;
    	
    	
    	try {
    		con = connectDB.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into results_table values (0,'"+sid+"','"+name+"','"+eid+"','"+oop+"','"+se+"','"+dbms+"','"+ics+"','"+ossa+"','"+tot+"','"+avg+"','"+gpa+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			Success = true;
    		} else {
    			Success = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return Success;
    }
    
    
    
   public static boolean updateresults(String id, String sid, String name, String eid, String ooc, String se, String dbms, String ics, String ossa, float tot, float avg, float gpa) {
    	
    	try {
    		
    		con = connectDB.getConnection();
    		stmt = con.createStatement();
    		String sql = "update results_table set student_id='"+sid+"' ,student_name='"+name+"' ,exam_id='"+eid+"' ,ooc='"+ooc+"',se='"+se+"' ,dbms='"+dbms+"' ,ics='"+ics+"' ,ossa='"+ossa+"' ,total='"+tot+"' ,average='"+avg+"' ,gpa='"+gpa+"'"
    				+ "where student_id='"+sid+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			Success = true;
    		}
    		else {
    			Success = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return Success;
    }
   
   
 
   public static List<Results> getResultsDetails(String Id) {
   	
   	int ctdID = Integer.parseInt(Id);
   	
   	ArrayList<Results> res = new ArrayList<>();
   	
   	try {
   		
   		con = connectDB.getConnection();
   		stmt = con.createStatement();
   		String sql = "select * from results_table where id='"+ctdID+"'";
   		rs = stmt.executeQuery(sql);
   		
   		while(rs.next()) {
   			
			int Iid = rs.getInt(1);
			String sid = rs.getString(2);
			String name = rs.getString(3);
			String eid = rs.getString(4);
			String ooc = rs.getString(5);
			String se = rs.getString(6);
			String dbms = rs.getString(7);
			String ics = rs.getString(8);
			String ossa = rs.getString(9);
			String tot = rs.getString(10);
			String avg = rs.getString(11);
			String gpa = rs.getString(12);
 
   			
   			Results r = new Results(Iid,sid,name,eid,ooc,se,dbms,ics,ossa,tot,avg,gpa);
   			res.add(r);
   		}
   		
   	}
   	catch(Exception e) {
   		e.printStackTrace();
   	}	
   	return res;	
   }

 
 
   public static boolean deleteResults(String id) {
   	
   	int cId = Integer.parseInt(id);
   	
   	try {
   		
   		con = connectDB.getConnection();
   		stmt = con.createStatement();
   		String sql = "delete from results_table where id='"+cId+"'";
   		int r = stmt.executeUpdate(sql);
   		
   		if (r > 0) {
   			Success = true;
   		}
   		else {
   			Success = false;
   		}
   		
   	}
   	catch (Exception e) {
   		e.printStackTrace();
   	}
   	
   	return Success;
   }  
   
   
}
