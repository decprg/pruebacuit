<%-- 
    Document   : index
    Created on : 14/03/2018, 08:54:36
    Author     : dante
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comprobar datos</title>
    </head>
    <body>
        <h1 align="center">Escriba el cuit</h1>
        <form method="GET" action="suma">
            <p align="center">
                <input type="text" name="num1" autofocus="text">
                <%--input type="text" name="num2"--%>
                <input type="submit" value="Verificar">
            </p>
        </form>
    </body>
</html>
