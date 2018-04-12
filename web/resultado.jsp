<%-- 
    Document   : resultado
    Created on : 14/03/2018, 09:35:10
    Author     : dante
--%>

<%@page import="com.dec.operaciones.suma"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1 align="center">Resultado</h1>
        <p align="center">
            <%
                out.println(new suma().getDato());
            %>
        </p>

        <form method="POST" action="suma">
            <p align="center">
                <input type="submit" value="Volver" autofocus="Volver">
            </p>
        </form>

    </body>
</html>


