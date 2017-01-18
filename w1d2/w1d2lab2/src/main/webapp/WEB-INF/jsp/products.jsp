<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Product List</title>
</head>
	<body>
		<table class="table table-striped">
			  <thead>
			    <tr>
			      <th>Product ID</th>
			      <th>Product Name</th>
			      <th>Unit Price</th>
			      <th>Description</th>
			      <th>Manufacture</th>
			      <th>Category</th>
			      <th>Unit Stock</th>
			      <th>Units In Order</th>
			      <th>Discontinue</th>
			      <th>Continue</th>
			      <th>Remove</th>
			    </tr>
			  </thead>
			  <tbody>
			   <c:forEach items = "${products}" var = "product">
			    <tr>
			      <th><a href = "product/${product.getProductId()}">Product Id: ${product.getProductId()}</a></th>
			      <td>${product.getName()}</td>
			      <td>${product.getUnitPrice()}</td>
			      <td>${product.getDescription()}</td>
			      <td>${product.getManufacturer()}</td>
			      <td>${product.getCategory()}</td>
			      <td>${product.getUnitsInStock()}</td>
			      <td>${product.getUnitsInOrder()}</td>
			      <td>${product.isDiscontinued()}</td>
			      <td>${product.getCondition()}</td>
			      <td><a href = "order/${product.getProductId()}/5">Remove 5 </a></td>
			    </tr>
			   </c:forEach> 
			  </tbody>
	    </table>
		
	</body>
</html>