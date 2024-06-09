<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.maicol.mvc.pruebamvc.modelo.Cliente" %>
<%
    Cliente cliente = (Cliente) session.getAttribute("cliente");
    if (cliente == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Solicitud de Crédito</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">
</head>
<body>
<div class="container">
<h1>Solicitud de Crédito</h1>
<form action="${pageContext.request.contextPath}/ServletCredito" method="post">
    <label>Monto del Crédito: </label><input type="number" name="monto" required /><br/>
    <label>Plazo: </label>
    <select name="plazo">
        <option value="12">12 meses</option>
        <option value="24">24 meses</option>
        <option value="36">36 meses</option>
        <option value="60">60 meses</option>
    </select><br/>
    <input type="submit" value="Calcular" />
</form>
</div>
</body>
</html>
