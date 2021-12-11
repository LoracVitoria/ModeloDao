<%@ page import="models.Department" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: superior
  Date: 02/12/2021
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="EstilosaDemais.css" />

    <title>Update Servlet</title>
</head>
<h1>Insira os dados!</h1>
<form action="updatedepartment" method="get">
    <p>Id:</p>
    <input type="text" name="field_id_department">
    <br/>
    <p>Nome:</p>
    <input type="text" name="field_name_department">
    <br/>
    <input type="submit" value="Salvar">
</form>
<br/>
<br/>
<br/>

<button><a href="center">Página inicial</a></button>
</body>
</html>
