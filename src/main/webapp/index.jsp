<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Prueba MVC</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">
</head>
<body>
<div class ="container">
<h1><%= "Prueba con MVC" %></h1>
    <ul>
    <li><a href="${pageContext.request.contextPath}/ServletCliente">Solicitud</a></li>
    <li><a href="${pageContext.request.contextPath}/ServletCredito">Credito</a></li>
    </ul>
</div>
</body>
</html>