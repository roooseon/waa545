<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Contact Form</title>
</head>
<body>
	<div class="container">
		  <h2>Add Customer</h2>
		  <form:form modelAttribute = "newContact" method = "post">
		  <table>
		  		<tr>
                    <td><spring:message code = "addContact.form.firstname.label"></spring:message></td>
                    <td><form:input path = "firstname" class = "form-control"/></td>
                    <td><form:errors path=  "firstname" cssStyle="color: red"/></td>
                </tr>
                <tr>
                    <td><spring:message code = "addContact.form.lastname.label"></spring:message></td>
                    <td><form:input path = "lastname" class = "form-control"/></td>
                    <td><form:errors path= "lastname" cssStyle="color: red"/></td>
                </tr>
          </table>   
          <input type="submit" value="Add Contact"/>   
	    </form:form>
	</div>
</body>
</html>