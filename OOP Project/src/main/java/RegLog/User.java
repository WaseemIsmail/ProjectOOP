package RegLog;


public class User {
	
	private String fname,uname,email,phone,password;
	
	public User() {
		super();
	}

	public User(String fname, String uname, String email, String phone, String password) {
		super();
		this.fname = fname;
		this.uname = uname;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	

}
