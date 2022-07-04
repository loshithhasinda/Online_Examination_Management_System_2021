package manegeResults;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HomeSearchDBUtil {
	
	
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

}
