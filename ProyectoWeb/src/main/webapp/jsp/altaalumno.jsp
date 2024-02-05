<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, java.util.ArrayList, pojos.AlumnoFormulario, servlets.AlumnoServlet "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario alta alumno</title>
 <style>
		body {
			font-family:verdana;
			font-size:18px;
		}
	</style>
</head>
<body>
	<form action="/ProyectoWeb/alumnoservlet" method="post">
		Nombre: <input type="text" required="true" name="nombre" placeholder="Introduce tu nombre"
			size="30" maxlength="10"><br>
		Apellidos: <input type="text" required="true" name="apellidos" placeholder="Introduce tus apellidos"
			size="30" maxlength="30"><br><br>
	 <label for="sexo">Indique el sexo</label><br>
   		Hombre <input type="radio" name="sexo" value="hombre">
        Mujer <input type="radio" name="sexo" value="mujer">
        Otro <input type="radio" name="sexo" value="otro"><br>
		<br>Seleccione una asignatura<br>
		<select name="lista_de_asignaturas">
			<option value="0">Seleccione una opción</option>
			<option value="java" name="java">JAVA</option>
			<option value="python" name="python">Python</option>
			<option value="php" name="php">PHP</option>
		</select>
		<br>
		<br> Descripción alumno: <br>
		<textarea name="area_de_texto" rows="7" cols="60" maxlength="600" placeholder="CuÃ©ntanos quÃ© esperas del curso"></textarea>
		<br>
		<br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>