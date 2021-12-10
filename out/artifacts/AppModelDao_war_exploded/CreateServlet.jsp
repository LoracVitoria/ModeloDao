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
    <title>Create Servlet</title>
    <link rel="stylesheet" type="text/css" href="EstilosaDemais.css" />
</head>
<body>

<%
    List<Department> departments = (List<Department>) request.getAttribute("deps");
%>
<table>
    <% for (Department d: departments){ %>
    <tr>
        <td><%= d.getId()%></td>
        <td><%= d.getName()%></td>
    </tr>
    <%  } %>
</table>

<h1>Cadastro de Departamentosl!</h1>
<p>Insira abaixo os dados: </p>

<a href="">salvar</a>
<br/>


</body>
</html>
