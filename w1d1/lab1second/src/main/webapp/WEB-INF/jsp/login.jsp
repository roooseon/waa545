<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Page</title>
</head>
<body>
	<body>
        <form method = "POST" action="login">
            User Name: <input type = "text" name = "username" required> <br />
            Password: <input type = "password" name = "password" required> <br />
            <input type = "submit" value = "Login">
        </form>
        <div style="color: #FF0000;">${errorMessage}</div>
    </body>  
</html>