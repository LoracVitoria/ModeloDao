<%@ page import="java.util.List" %>
<%@ page import="models.Department" %><%--
  Created by IntelliJ IDEA.
  User: superior
  Date: 02/12/2021
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="EstilosaDemais.css" />

    <title>Home Page</title>
</head>
<body>

<%
    List<Department> departments = (List<Department>) request.getAttribute("deps");
%>

<h1>Página Inicial!</h1>
<p>Seja bem-vindo a página inicial!</p>


<br/>
<table>
    <th>Id</th>
    <th>Nome</th>
    <% for (Department d: departments){ %>
    <tr>
        <td><%= d.getId()%></td>
        <td><%= d.getName()%></td>
    </tr>
  <%  } %>
</table>
<br/>
<br/>
<br/>

<button><a href="create">Cadastrar</a></button>

<button><a href="update">Atualizar</a></button>

<button><a href="find">Procurar</a></button>

<button><a href="delete">Excluir</a></button>

<br/>

</body>
</html>
