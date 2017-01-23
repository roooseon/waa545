<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ADD CUSTOMER</title>
</head>
<body>
	<form:form method = "POST" modelAttribute = "newCustomer" action = "customer">
		<table>
			<tr>
				<td>Country: </td>
				<td><form:select path ="country" >
					<form:option value = "NONE" label  = "---SELECT---"></form:option>
					<form:options items = "${countries}"></form:options>
				</form:select></td>
			</tr>
			
			<tr>
				<td>Java Skills: </td>
				<td><form:select path = "javaSkill" items = "${javaSkills}"  multiple = "true" ></form:select></td>
			</tr>
			<tr>
				<td colspan = "3"><input type = "submit" value = "Add Customer"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>