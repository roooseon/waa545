<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Page</title>
</head>
<body>
			<form:form modelAttribute = "newUser" method = "POST">
			<table>
				<tr>
					<td><spring:message code = "addUser.login.form.username.label"></spring:message></td>
					<td><form:input path = "username"></form:input></td>
					<td><form:errors path = "username" cssStyle="color: red"></form:errors></td>
				</tr>
				<tr>
					<td><spring:message code = "addUser.login.form.password.label"></spring:message></td>
					<td><form:password path = "password"></form:password></td>
				</tr>
				<tr>
					<td><spring:message code  = "addUser.login.form.address.label"></spring:message></td>
					<td><form:input path = "address"></form:input></td>
				</tr>
			</table>
				<input type = "submit" value = "Login">	
			</form:form>
</body>
</html>