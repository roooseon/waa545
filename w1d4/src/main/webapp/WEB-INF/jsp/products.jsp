<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class = "products">
		<c:forEach items = "${products}" var = "product">
			      <p><a href = "product/${product.getProductId()}">Product Id: ${product.getProductId()}</a></p>
			      <p>${product.getName()}</p>
			      <p>${product.getUnitPrice()}</p>
			      <p>${product.getDescription()}</p>
			      <p>${product.getManufacturer()}</p>
			      <p>${product.getCategory()}</p>
			      <p>${product.getUnitsInStock()}</p>
			      <p>${product.getUnitsInOrder()}</p>
			      <p>${product.isDiscontinued()}</p>
			      <p>${product.getCondition()}</p>
	</c:forEach>		 
	</div>
</body>
</html>