<%@page import="entidades.Dogsons"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Atualizar Dogson</title>
	</head>
		<% Dogsons d = (Dogsons)request.getAttribute("dogson"); %>
	<body>
		<h1>Atualizar Dogson</h1>
<%if(d != null) {%>
		<form action="AtualizarDogson" method="post">
			<input name="id" type="hidden" value="<%= d.getId() %>"/>
			<label>IdDono:</label> <input type="text" name="idDono" placeholder="3" value="<%= d.getIdDono() %>" required/> <br/>
			<label>Nome:&nbsp;&nbsp;</label> <input type="text" name="nome" placeholder="Rufus" value="<%= d.getNome() %>" required/> <br/>
			<label>Raça:&nbsp;&nbsp;&nbsp;&nbsp;</label> <input type="text" name="raca" placeholder="Bulldog" value="<%= d.getRaca() %>" required/> <br/>
			<label>Idade:&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="number" name="idade" min="1" max="20" value="<%= d.getIdade() %>" required/><br/>
			<label>Peso:</label><br/>
			<input type="number" name="peso" min="1" max="100" value="<%= d.getPeso() %>" required/><br/>
			<label>Sexo:</label><br/>
		 <%if(d.isSexo() == true) { %>
			<input type="radio" name="sexo" value="true" checked="checked" required/><label>Macho</label>
			<input type="radio" name="sexo" value="false"/><label>Fêmea</label><br/>
		<%}else {%>
			<input type="radio" name="sexo" value="true" required/><label>Macho</label>
			<input type="radio" name="sexo" value="false" checked="checked"/><label>Fêmea</label><br/>
			<%}%>
			<label>Castrado:</label><br/>
		<%if(d.isCastrado() == true) { %>
			<input type="radio" name="castrado" value="true" checked="checked" required/><label>Sim</label>
			<input type="radio" name="castrado" value="false"/><label>Não</label>
		<%}else {%>
			<input type="radio" name="castrado" value="true" required/><label>Sim</label>
			<input type="radio" name="castrado" value="false" checked="checked"/><label>Não</label>
			<%}%>
			<br/><input type="submit" value="Criar"/>
		</form>
<%}else {%>
		<p>Ops! Um erro ocorreu.</p>
<%}%>
	</body>
</html>