<%@ page import="models.Department" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: superior
  Date: 02/12/2021
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="EstilosaDemais.css" />

    <title>Create Servlet</title>
</head>
<body>

<h1>Cadastro de Departamentos!</h1>
<p>Insira abaixo os dados: </p>

<form action="savedepartment" method="post">
    <input type="text" name="field_name_department">
    <input type="submit" value="Salvar">
</form>

<br/>

<button><a href="center">Página inicial</a></button>

</body>
</html>
