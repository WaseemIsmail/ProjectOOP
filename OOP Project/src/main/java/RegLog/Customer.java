package RegLog;

public class Customer {
	private int cid;
	private String fname;
	private String uname;
	private String email;
	private String phone;
	private String password;
	
	public Customer(int cid, String fname, String uname, String email, String phone,String password) {
		
		this.cid = cid;
		this.fname = fname;
		this.uname = uname;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
		

	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
		
	}

	

