<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Individual Product</title>
</head>
<body>
		<div class = "boxed">
		   <p>Product Id:     ${product.getProductId()}</p> 
		   <p>Product Name:   ${product.getName()}</p>
		   <p>Unit Price:     ${product.getUnitPrice()}</p>
		   <p>Description:    ${product.getDescription()}</p>
		   <p>Manufacture:    ${product.getManufacturer()}</p>
		   <p>Category:       ${product.getCategory()}</p>
		   <p>Unit Stock:     ${product.getUnitsInStock()}</p>
		   <p>Units In Order: ${product.getUnitsInOrder()} </p>
		   <p>Discontinue:    ${product.isDiscontinued()}</p>
		   <p>Continue:       ${product.getCondition()}</p>
		</div>
</body>
</html>