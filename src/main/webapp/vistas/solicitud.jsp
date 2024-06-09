<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Solicitud de Crédito</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">
</head>
<body>
<div class ="container">
<h1>Solicitud de Crédito</h1>
<form action="${pageContext.request.contextPath}/ServletCliente" method="post">
    <label>Nombre: </label><input type="text" name="nombre" required /><br/>
    <label>Sexo: </label><input type="text" name="sexo" required /><br/>
    <label>Edad: </label><input type="number" name="edad" required /><br/>
    <label>Sueldo Mensual: </label><input type="number" name="sueldoMensual" required /><br/>
    <input type="submit" value="Enviar" />
</form>
</div>
</body>
</html>
