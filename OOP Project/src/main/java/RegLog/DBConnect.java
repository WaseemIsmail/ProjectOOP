package RegLog;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String dbUrl = "jdbc:mysql://localhost:3306/lmanagementdb";
	private static String dbUname = "root";
	private static String dbPassword = "wa2567686";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
		    con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	}
}
