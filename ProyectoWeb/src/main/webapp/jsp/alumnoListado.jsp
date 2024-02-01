<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, java.util.ArrayList, pojos.AlumnoFormulario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de alumnos</title>
</head>
<body>
	<h1>LISTADO ALUMNOS</h1>

	<%
	List<AlumnoFormulario> alumnos = (List<AlumnoFormulario>)request.getAttribute("alumnoListado");
	%>
	<table>
		<caption>Alumnos</caption>
		<tr>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Sexo</th>
			<th>Asignatura</th>
			<th>Area de texto</th>
		</tr>

		<%
		for (AlumnoFormulario alumno : alumnos) {
		%><tr>
			<td><%=alumno.getNombre()%></td>
			<td><%=alumno.getApellidos()%></td>
			<td><%=alumno.getSexo()%></td>
			<td><%=alumno.getAsignatura()%></td>
			<td><%=alumno.getAreaTexto()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>