<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/main.css" rel="stylesheet">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Welcome page</title>
</head>
<body>
	<div class="container">
	<div class="row">
	  <div class="col-sm-12">
		<!-- Section Title -->
		<div class="section-title">
			<h1>Welcome ${user.getUsername()}</h1>
			<div class="divider"></div>
			<p>The ModelAttribute on a method argument indicates the argument
				should be retrieved from the model. If not present in the model, the argument should be 
				instantiated first and then added to the model.</p>
		</div>
	</div>
	</div>
 </div>
 <div class = "logout">
			<p><a href = "logout">Logout</a></p>
		</div>
	
</body>
</html>