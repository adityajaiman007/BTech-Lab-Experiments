<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome JSP</title>
</head>
<body>
    <h2>Welcome!</h2>
    <%
        String username = request.getParameter("username");
        if (username != null && !username.trim().isEmpty()) {
    %>
        <p>Hello, <%= username %>!</p>
    <%
        } else {
    %>
        <p>Please enter your name in the HTML form.</p>
    <%
        }
    %>
</body>
</html>
