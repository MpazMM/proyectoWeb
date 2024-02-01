<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de alumnos</title>
</head>
<body>
	<h1>LISTADO ALUMNOS</h1>
	
	<table>
		<caption>Alumnos</caption>
		<tr>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Sexo</th>
			<th>Asignatura</th>
			<th>Area de texto</th>
		</tr>
		<tr>
			<td>uno</td>
			<td>dos</td>
			<td>tres</td>
		</tr>
		<tr>
			<td>cuatro</td>
			<td>cinco</td>
			<td>seis</td>
		</tr>
	</table>
	
	
	
	<%
	List<Alumno> alumnos = (List<Alumno>)request.getAttribute("listaAlumnos");
	for (Alumno alumno: colores){
%>
	<p><%= color. %></p>
<%} %>

</body>
</html>