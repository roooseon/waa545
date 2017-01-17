<%-- 
    Document   : welcome
    Created on : Jan 16, 2017, 4:17:45 PM
    Author     : ramesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Hello <%=(String) request.getSession().getAttribute("username")%> </h1>
    </body>
</html>
