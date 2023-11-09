<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<div class = "container">
		<div class="title">Registration</div>
		<form action="Register" method="post">
		<div class="user-deatils">
			<div class="input-box">
				<span class = "details">Full Name</span>
				<input type="text" name="fname" placeholder="Enter your name" required>
			</div>
			<div class="input-box">
				<span class = "details">Username</span>
				<input type="text" name="uname" placeholder="Enter your username" required>
			</div>
			<div class="input-box">
				<span class = "details">Email</span>
				<input type="text" name="email" placeholder="Enter your email" required>
			</div>
			<div class="input-box">
				<span class = "details">Phone Number</span>
				<input type="text" name="phone" placeholder="Enter your phone number" required>
			</div>
			<div class="input-box">
				<span class = "details">Password</span>
				<input type="password" name="password" placeholder="Enter your password" required>
			</div>
		</div>
		<div class="button">
			<input type="submit" value="register">
		</div>
		
		</form>
		
	
	</div>


</body>
</html>