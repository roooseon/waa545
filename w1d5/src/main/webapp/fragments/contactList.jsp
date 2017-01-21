<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact List</title>
</head>
<body>
	<h2>All Contacts</h2>
	<table border="1">
	<c:forEach var="contact" items="${contactList}">
		<tr>
			<td>${contact.firstname}</td>
			<td>${contact.lastname}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>