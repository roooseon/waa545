<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/main.css" rel="stylesheet">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Login Form</title>
</head>
<body>
	  <div class="container">
		  <h2>User Login form</h2>
		  <form class="form-horizontal" method="post" action="login">
		    <div class="form-group">
		      <label class="control-label col-sm-2" for="email">Username:</label>
		      <div class="col-sm-6">
		        <input type="text" class="form-control" name="username" placeholder="Enter username" value = "${user}">
		      </div>
		    </div>
		    <div class="form-group">
		      <label class="control-label col-sm-2" for="pwd">Password:</label>
		      <div class="col-sm-6">          
		        <input type="password" class="form-control" name="password" placeholder="Enter password" >
		      </div>
		    </div>
		    <div class="form-group">        
		      <div class="col-sm-offset-2 col-sm-10">
		        <div class="checkbox">
		          <label><input type="checkbox"  name="rememberMe" value ="1" ${checked}> Remember me</label>
		        </div>
		      </div>
		    </div>
		    <div class="form-group">        
		      <div class="col-sm-offset-2 col-sm-10">
		        <button type="submit" class="btn btn-default">Login</button>
		      </div>
		    </div>
	    </form>
	</div>
</body>
</html>