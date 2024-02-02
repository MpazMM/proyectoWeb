<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, java.util.ArrayList, pojos.AlumnoFormulario, servlets.AlumnoServlet "%>
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
	long id =0;
	%>
	<table>
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
		    <input type="hidden" name="id" value="${alumno.id}"/>
			<td><%=alumno.getNombre()%></td>
			<td><%=alumno.getApellidos()%></td>
			<td><%=alumno.getSexo()%></td>
			<td><%=alumno.getAsignatura()%></td>
			<td><%=alumno.getAreaTexto()%></td>
			<td><a href="/ProyectoWeb/altaalumno.html"><button type="submit" action="edit">Modificar</button></a></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="/ProyectoWeb/altaalumno.html"><button type="submit">Añadir</button></a>
	
</body>
</html>