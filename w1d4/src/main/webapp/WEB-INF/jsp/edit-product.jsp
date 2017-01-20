<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />" rel="stylesheet">
<title>Edit Product Page</title>
</head>
<body>
	<div class="container">
		  <h2>Edit Product</h2>
		  <form:form modelAttribute = "product" method = "post">
		  <form:errors path  ="*" elemenet = "div"></form:errors>
		  <table>
		  		<tr>
                    <td><form:label path = "productId">Product ID</form:label></td>
                    <td><form:input path = "productId" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "name">Name</form:label></td>
                    <td><form:input path = "name" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "unitPrice">unit Price</form:label></td>
                    <td><form:input path = "unitPrice" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "description">Description</form:label></td>
                    <td><form:textarea path = "description" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "manufacturer">Manufacturer</form:label></td>
                    <td><form:input path = "manufacturer" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "category">Category</form:label></td>
                    <td><form:input path = "category" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "unitsInStock">Units In Stock</form:label></td>
                    <td><form:input path = "unitsInStock" class = "form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path = "condition">condition</form:label></td>
                    <td>
	                    <form:radiobutton path="condition" value="New"/>New
	                    <form:radiobutton path="condition" value="Old"/>Old
	                    <form:radiobutton path="condition" value="Refurbished"/>Refurbished
                    </td>
                </tr>  
          </table>   
          <input type="submit" value="Edit Product"/>   
		      
	    </form:form>
	</div>
</body>
</html>