<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Add From</title>
</head>
<body>
	<p>Language: <a href="?locale=en">English</a> <span><a href="?locale=np">Nepali</a></span></p>
	
	<div class="container">
		  <h2>Add Customer</h2>
		  <form:form modelAttribute = "newCustomer" method = "post">
		  <table>
		  		<tr>
                    <td><spring:message code = "addCustomer.form.username.label"></spring:message></td>
                    <td><form:input path = "username" class = "form-control"/></td>
                    <td><form:errors path=  "username" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><spring:message code = "addCustomer.form.address.label"></spring:message></td>
                    <td><form:input path = "address" class = "form-control"/></td>
                    <td><form:errors path= "address" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><spring:message code = "addCustomer.form.dateOfBirth.label"></spring:message></td>
                    <td><form:input path = "dateOfBirth" class = "form-control"/></td>
                    <td><form:errors path= "dateOfBirth" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><spring:message code = "addCustomer.form.password.label"></spring:message></td>
                    <td><form:password path = "password" class = "form-control"/></td>
                    <td><form:errors path= "password" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><spring:message code = "addCustomer.form.sex.label"></spring:message></td>
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