<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de Crédito</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">
</head>
<body>
<div class="container">
    <h1>Resultado de Crédito</h1>
    <table>
        <tr>
            <th>Cliente</th>
            <td>${cliente.nombre}</td>
        </tr>
        <tr>
            <th>Sexo</th>
            <td>${cliente.sexo}</td>
        </tr>
        <tr>
            <th>Edad</th>
            <td>${cliente.edad}</td>
        </tr>
        <tr>
            <th>Sueldo Mensual</th>
            <td>${cliente.sueldoMensual}</td>
        </tr>
        <tr>
            <th>Monto del Crédito</th>
            <td>${credito.monto}</td>
        </tr>
        <tr>
            <th>Plazo</th>
            <td>${credito.plazo} meses</td>
        </tr>
        <tr>
            <th>Total</th>
            <td>${credito.monto * (1 + credito.interes)}</td>
        </tr>
        <tr>
            <th>Pagos Mensuales</th>
            <td>${credito.pagoMensual}</td>
        </tr>
    </table>
    <p>¿Desea calcular otro monto? <a href="index.jsp">S</a> / <a href="index.jsp">N</a></p>
</div>
</body>
</html>
