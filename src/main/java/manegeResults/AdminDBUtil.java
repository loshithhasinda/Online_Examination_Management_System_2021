package manegeResults;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminDBUtil {
	
	private static boolean Success;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	public static boolean validate(String uname,String pass) {
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin_table where user_name ='"+uname+"' and password='"+pass+"'";
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

}
