<%@page import="entidades.Dogsons"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Listar Dogsons</title>
	</head>
	<body>
		<form action="AdicionarDogson" method="post">
			<label>IdDono:</label> <input type="text" name="idDono" placeholder="3" required/> <br/>
			<label>Nome:&nbsp;&nbsp;</label> <input type="text" name="nome" placeholder="Rufus" required/> <br/>
			<label>Raça:&nbsp;&nbsp;&nbsp;&nbsp;</label> <input type="text" name="raca" placeholder="Bulldog" required/> <br/>
			<label>Idade:&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="number" name="idade" min="1" max="20" required/><br/>
			<label>Peso:</label><br/>
			<input type="number" name="peso" min="1" max="100" required/><br/>
			<!--
			<input type="radio" name="peso" value="5"/><label>Até 5KG</label>
			<input type="radio" name="peso" value="5-10"/><label>5 a 10KG</label>
			<input type="radio" name="peso" value="10-20"/><label>10 a 20KG</label>
			<input type="radio" name="peso" value="20-40"/><label>20 a 40KG</label>
			<input type="radio" name="peso" value="40+"/><label>40KG +</label> <br/>
			-->
			<label>Sexo:</label><br/>
			<input type="radio" name="sexo" value="true" required/><label>Macho</label>
			<input type="radio" name="sexo" value="false"/><label>Fêmea</label><br/>
			<label>Castrado:</label><br/>
			<input type="radio" name="castrado" value="true" required/><label>Sim</label>
			<input type="radio" name="castrado" value="false"/><label>Não</label>
			<br/><input type="submit" value="Criar"/>
		</form>
	<% List<Dogsons> dog = (ArrayList<Dogsons>)request.getAttribute("dogsons"); 
if(dog != null) { %>
		<table>
		<tr>
			<th>Nome Dono</th>
			<th>ID Dono</th>
			<th>Nome</th>
			<th>Raça</th>
			<th>Peso</th>
			<th>Sexo</th>
			<th>Idade</th>
			<th>Castrado</th>
			<th>Editar</th>
			<th>Remover</th>
		</tr>
	<%
	for( Dogsons d : dog) { %>
			<tr>
				<td><%= d.getNomeDono() %></td>
				<td><%= d.getIdDono() %></td>
				<td><%= d.getNome() %></td>
				<td><%= d.getRaca() %></td>
				<td><%= d.getPeso() %></td>
			<%if(d.isSexo() == true) {%>
				<td>Macho</td>
			<%}else {%>
				<td>Femea</td>
			<%}%>
				<td><%= d.getIdade() %></td>
			<%if(d.isCastrado() == true) { %>
				<td>Sim</td>
			<%}else { %>
				<td>Não</td>
			<%} %>
				<td><a href=AtualizarDogson?id=<%= d.getId()%>>Editar</a></td>
				<td><a href=RemoverDogson?id=<%= d.getId()%>>Remover</a></td>
			</tr>
			
	<% }
}else {%>
			<p>Ops, um erro ocorreu!</p>
<%}%>
		</table>
	</body>
</html>