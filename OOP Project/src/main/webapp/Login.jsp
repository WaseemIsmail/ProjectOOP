<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	</style>
</head>
<body>
	<form action="LoginSerlet"  method="post">
		User Name <input type="text" name="uname" placeholder="Enter your username"><br>
		Password <input type="password" name="password" placeholder="Enter your password"><br>
		
		<input type="submit" name="submit" value="Login">
		
	
	</form>

</body>
</html>