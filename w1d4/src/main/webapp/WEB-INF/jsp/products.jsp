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
				  <p><a href="<c:url value="/product/${product.getProductId()}" />">${product.getProductId()}</a></p>
			      <p>${product.getName()}</p>
			      <p>${product.getUnitPrice()}</p>
			      <p>${product.getDescription()}</p>
			      <p>${product.getManufacturer()}</p>
			      <p>${product.getCategory()}</p>
			      <p>${product.getUnitsInOrder()}</p>
			      <p>${product.getCondition()}</p>
			      <p><a href="<c:url value="/product/delete/${product.getProductId()}" />">DELETE</a></p>
	</c:forEach>		 
	</div>
</body>
</html>