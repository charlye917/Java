<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Ejercicio Hola mundo JSPs</h1>
        <ul>
            <li>Hola mundo con HTML
            <li><%out.print("Hola mundo con Scriptlets");%>
            <li>${"Hola mundo con Expresiones Language (EL)"}
            <li><c:out value="Hola mundo con JSTL"/>
        </ul>
        <ul>
            <li>Hola: <%= new java.util.Date()%>
            <li>Nombre del contexto de la aplicacion:
                <%=request.getContextPath()%>
            <li>Valor del parametro x:
                <%=request.getParameter("x")%>
        </ul>
    </body>
</html>
