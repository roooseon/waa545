<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Entry Form</title>
<link href="<c:url value="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
	<div class="container">
		  <h2>Add Customer</h2>
		  <form:form modelAttribute = "newCustomer" method = "post">
		  <table>
		  		<tr>
                    <td><form:label path = "username">User Name</form:label></td>
                    <td><form:input path = "username" class = "form-control"/></td>
                    <td><form:errors path=  "username" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><form:label path = "address">Address</form:label></td>
                    <td><form:input path = "address" class = "form-control"/></td>
                    <td><form:errors path= "address" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><form:label path = "birthdate">Birth Date</form:label></td>
                    <td><form:input path = "birthdate" class = "form-control"/></td>
                    <td><form:errors path= "birthdate" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><form:label path = "password">Password</form:label></td>
                    <td><form:password path = "password" class = "form-control"/></td>
                    <td><form:errors path= "password" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><form:label path = "sex">condition</form:label></td>
                    <td>
	                    <form:radiobutton path= "sex" value="male"/>Male
	                    <form:radiobutton path= "sex" value="female"/>Female
	                    <form:errors path= "sex" cssStyle="color: red"/>
                    </td>
                </tr>  
          </table>   
          <input type="submit" value="Add Customer"/>   
		      
	    </form:form>
	</div>
</body>
</html>