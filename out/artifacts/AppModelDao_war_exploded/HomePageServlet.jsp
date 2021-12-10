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
    <title>Página Inicial</title>
</head>
<body>

<%
    List<Department> departments = (List<Department>) request.getAttribute("deps");
%>

<h1>Página Inicial!</h1>
<p>Seja bem-vindo a página inicial!</p>

<a href="">cadastrar</a>
<br/>
<table>
    <% for (Department d: departments){ %>
    <tr>
        <td><%= d.getId()%></td>
        <td><%= d.getName()%></td>
    </tr>
  <%  } %>
</table>


</body>
</html>
