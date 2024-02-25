<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta de usuario</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
	function actualizarCampos() {
		var seleccion = document.getElementById("tipoUsuario").value;

		// Oculta todos los campos primero
		document.getElementById("tlfCorp").style.display = "none";
		document.getElementById("emailCorp").style.display = "none";
		document.getElementById("perfilUsuario").style.display = "none";

		// Muestra los campos basados en la selecci�n
		switch (seleccion) {
		case "ADMIN":
			document.getElementById("tlfCorp").style.display = "block";
			document.getElementById("emailCorp").style.display = "block";
			break;
		case "USUARIO":
			document.getElementById("perfilUsuario").style.display = "block";
			break;
		}
	}
</script>
</head>
<body>
	<div class="ml-3">
		<form action="/ProyectoWeb/Usuario" method="post">
			<fieldset>
				<legend>Datos personales:</legend>
				Nombre: <br> <input id="nombreUsuario" type="text"
					name="nombreUsuario"><br> Apellidos: <br> <input
					id="apellidosUsuario" type="text" name="apellidosUsuario"><br>
				DNI: <br> <input id="dniUsuario" type="text" name="dniUsuario"><br>
				Sexo: <br> <input id="sexoUsuario" type="text"
					name="sexoUsuario"><br><br> 
					<select id="sexoUsuario" name="sexoUsuario">
					<option value="0">Indique su sexo</option>
					<option value="Masculino">Masculino</option>
					<option value="Femenino">Femenino</option>
					<option value="Otro">Otro</option>
				</select><br>
				Fecha de nacimiento: <br>
				<input id="fechaNacimiento" type="date" name="fechaNacimiento">

			</fieldset>

			<fieldset>
				<legend>Datos de contacto:</legend>
				Email: <br> <input id="emailUsuario" type="text"
					name="emailUsuario"><br> Tel�fono: <br> <input
					id="telefono" type="number" name="telefono" maxlength="9">
			</fieldset>

			<fieldset>
			<legend>Usuario:</legend>
				<select id="tipoUsuario" name="tipo" onchange="actualizarCampos();">
					<option value="0">Tipo de usuario</option>
					<option value="ADMIN">Administrador</option>
					<option value="USUARIO">Usuario</option>
				</select>
				<div id="tlfCorp" style="display: none;">
					Tel�fono Corporativo: <input type="text" name="estilo"
						placeholder="Introduce el tel�fono corporativo"><br>
				</div>
				<div id="emailCorp" style="display: none;">
					Email corporativo: <input type="text" name="emailCorp"
						placeholder="Introduce el email corporativo"><br>
				</div>
				<div id="perfilUsuario" style="display: none;">
					<label for="perfilUsuario">Elija su perfil</label> 
						<input type="radio" name="perfilUsuario" value="profesional">Profesional
						<input type="radio" name="perfilUsuario" value="reciente">Reciente
						<input type="radio" name="perfilUsuario" value="invitado">Invitado
				</div><br>
				Usuario: <br> <input id="idCuenta" type="text" name="idCuenta"><br>
				Contrase�a: <br> <input id="contrasenia" type="password"
					name="contrasena"><br>
				<br>
				<button type="submit">Enviar</button>
			</fieldset>
		</form>
	</div>

</body>
</html>