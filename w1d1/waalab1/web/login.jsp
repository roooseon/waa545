<%-- 
    Document   : login
    Created on : Jan 16, 2017, 4:45:14 PM
    Author     : ramesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
    </head>
    <body>
        <form method = "POST" action = "LoginServlet">
            Username: <input type = "text" name = "username" required> <br />
            Password: <input type = "password" name = "password" required> <br />
            <input type = "submit" value = "Login">
        </form>
        <div style="color: #FF0000;">${errorMessage}</div>
    
</html>
