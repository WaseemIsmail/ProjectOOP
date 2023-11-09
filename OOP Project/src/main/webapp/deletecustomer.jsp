<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String cid = request.getParameter("cid");
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
	%>


	<form action="delete" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="cid" value="<%= cid %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="fname" value="<%= fname %>"></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="<%= email %>"></td>
	</tr>
	<tr>
		<td>Phone number</td>
		<td><input type="text" name="phone" value="<%= phone %>"></td>
	</tr>
	<tr>
		<td>User name</td>
		<td><input type="text" name="uname" value="<%= uname %>"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" value="<%= password %>"></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Update My Account">
	</form>
	

</body>
</html>