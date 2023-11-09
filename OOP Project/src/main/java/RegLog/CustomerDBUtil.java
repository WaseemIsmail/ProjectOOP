package RegLog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CustomerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String uname, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer_details where uname='"+uname+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Customer> getcustomer_details(String uname) {
		
		ArrayList<Customer> customer_details = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer_details where uname='"+uname+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int cid = rs.getInt(1);
				String fname = rs.getString(2);
				String unamee = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String password = rs.getString(6);
				
				Customer cus = new Customer(cid,fname,unamee,email,phone,password);
				customer_details.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return customer_details;	
	}
    
    public static boolean insertcustomer_details(String fname,String uname, String email, String phone,String password) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into customer_details values (0,'"+fname+"','"+uname+"','"+email+"','"+phone+"','"+password+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    public static boolean updatecustomer_details(String cid, String fname, String uname, String email, String phone, String password) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update customer_details set fname='"+fname+"',uname='"+uname+"',email='"+email+"',phone='"+phone+"',password='"+password+"'"
    				+ "where cid='"+cid+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    public static List<Customer> getcusDetails(String cid) {
    	
    	int convertedID = Integer.parseInt(cid);
    	
    	ArrayList<Customer> cus = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from customer_details where cid='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int cidd = rs.getInt(1);
				String fname = rs.getString(2);
				String uname = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String password = rs.getString(6);
    			
    			Customer c = new Customer(cidd,fname,uname,email,phone,password);
    			cus.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return cus;	
    }
    
    
    public static boolean deleteCustomer(String cid) {
    	
    	int convId = Integer.parseInt(cid);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from customer_details where cid='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
 
    
}
