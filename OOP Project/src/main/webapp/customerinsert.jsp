<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	
	<form action="CustomerInsert" method="post">
		Full Name <input type="text" name="fname"><br>
		User Name <input type="text" name="uname"><br>
		Email <input type="text" name="email"><br>
		Phone Number <input type="text" name="phone"><br>
		Password <input type="password" name="password"><br>
		
		<input type="submit" name="submit" value="Create Customer">
	</form>
</body>
</html>