<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobiliario Ejercicio</title>
<script>
    function actualizarCampos() {
        var seleccion = document.getElementById("mueble").value;

        // Oculta todos los campos primero
        document.getElementById("campoEstilo").style.display = "none";
        document.getElementById("campoColor").style.display = "none";
        document.getElementById("campoPotencia").style.display = "none";

        // Muestra los campos basados en la selección
        switch(seleccion) {
            case "Mesa":
                document.getElementById("campoEstilo").style.display = "block";
                break;
            case "Sofa":
                document.getElementById("campoColor").style.display = "block";
                break;
            case "Lampara":
                document.getElementById("campoPotencia").style.display = "block";
                break;
        }
    }
</script>
</head>
<body>
	<h1>MOBILIARIO</h1>
	<form action="/ProyectoWeb/mobiliarioservlet" method="post" id="MobiliarioForm">
		<select id="mueble" name="asignatura" onclick="actualizarCampos();">
			<option value="0">Seleccione una opción</option>
			<option value="Mesa">Mesa</option>
			<option value="Sofa">Sofá</option>
			<option value="Lampara">Lámpara</option>
		</select><br> <br> 
		Nombre <input type="text" name="nombre" placeholder="Introduce el nombre"><br><br> 
		Precio <input type="text" name="apellidos" placeholder="Introduce precio"><br><br> 
		
		 <div id="campoEstilo" style="display:none;">
            Estilo: <input type="text" name="estilo" placeholder="Introduce el estilo"><br>
        </div>
        <div id="campoColor" style="display:none;">
            Color: <input type="text" name="color" placeholder="Introduce color"><br>
        </div>
        <div id="campoPotencia" style="display:none;">
            Potencia: <input type="text" name="potencia" placeholder="Introduce potencia"><br>
        </div>
		<br> <input id="guardar" type="submit" value="Guardar">

	</form>
</body>
</html>