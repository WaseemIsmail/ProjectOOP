package RegLog;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao {
	
	 private String dbUrl = "jdbc:mysql://localhost:3306/lmanagementdb";
	 private String dbUname = "root";
	 private String dbPassword = "wa2567686";
	 private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbdriver)
	{
		try {
			Class.forName(dbdriver);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(User customer_details)
	{
		loadDriver(dbDriver);
	    Connection con = getConnection();
		String result = "Data entered succesfully";
		
		String sql = "insert into customer_details values(0,?,?,?,?,?)";
		
		PreparedStatement ps;
		try {
	    ps = con.prepareStatement(sql);
		ps.setString(1, customer_details.getFname());
		ps.setString(2, customer_details.getUname());
		ps.setString(3, customer_details.getEmail());
		ps.setString(4, customer_details.getPhone());
		ps.setString(5, customer_details.getPassword());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
			
		}
		return result;
	}
}
