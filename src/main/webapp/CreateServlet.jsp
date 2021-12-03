<%--
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
	<div class="all">
		<h1 class="title">CREATE SERVLET</h1>
		<div class="center-fixed">
			<form id="frmCadastro">
				<label for="txtNome">Nome</label><br>
				<input type="text" id="txtNome" placeholder="Nome"><br>

				<label for="dtpDataNascimento">Data de Nascimento</label><br>
				<input type="date" id="dtpDataNascimento" value="1990-08-29" required>

				<fieldset>
					<legend>Sexo</legend>
					<input type="radio" name="genero" value="male" id="rdoMasculino" checked>
					<label for="rdoMasculino">Masculino</label><br>

					<input type="radio" name="genero" value="female" id="rdoFeminino">
					<label for="rdoFeminino">Feminino</label>
				</fieldset>

				<input type="submit" name="" id="btnCadastrarSalvar" value="Cadastrar">
			</form>
		</div>
		<table>
			<caption><h2>Tabela</h2></caption>
			<thead>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>Nascimento</th>
					<th>Sexo</th>
					<th>Ultima Atualização</th>
				</tr>
			</thead>
			<tbody id="tbodyResultados"></tbody>
<tfoot></tfoot>
</table>
</div>
</body>
</html>
