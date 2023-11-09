 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="RegLog.Customer"  %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
	
	
</head>
<body>

	<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	
	
	<tr>
		<td>Customer ID</td>
		<td>${cus.cid}</td>
	</tr>
	<tr>
		<td>Customer Name</td>
		<td>${cus.fname}</td>
	</tr>
	<tr>
		<td>Customer User Name</td>
		<td>${cus.uname}</td>
	</tr>
	<tr>
		<td>Customer Email</td>
		<td>${cus.email}</td>
	</tr>
	<tr>
		<td>Customer Phone</td>
		<td>${cus.phone}</td>
	</tr>
	<tr>
		<td>Customer Password</td>
		<td>${cus.password}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updatecustomer.jsp" var="cusupdate">
		
		<c:param name="cid" value="${cid}"/>
		<c:param name="fname" value="${fname}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="password" value="${password}"/>
		
	</c:url>
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<c:url value="deletecustomer.jsp" var="cusdelete">
		<c:param name="cid" value="${cid}"/>
		<c:param name="fname" value="${fname}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="password" value="${password}"/>
		
	</c:url>
	<a href="${cusdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	
	
	
	

</body>
</html>