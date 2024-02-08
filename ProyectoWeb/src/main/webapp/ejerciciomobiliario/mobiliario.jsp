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
        document.getElementById("estilo").style.display = "none";
        document.getElementById("color").style.display = "none";
        document.getElementById("potencia").style.display = "none";

        // Muestra los campos basados en la selección
        switch(seleccion) {
            case "M":
                document.getElementById("estilo").style.display = "block";
                break;
            case "S":
                document.getElementById("color").style.display = "block";
                break;
            case "L":
                document.getElementById("potencia").style.display = "block";
                break;
        }
    }
</script>
</head>
<body>
	<h1>MOBILIARIO</h1>
	<form action="/ProyectoWeb/mobiliarioservlet" method="post" id="MobiliarioForm">
		<select id="mueble" name="tipo" onchange="actualizarCampos();">
			<option value="0">Seleccione una opción</option>
			<option value="M">Mesa</option>
			<option value="S">Sofá</option>
			<option value="L">Lámpara</option>
		</select><br> <br> 
		Nombre <input type="text" name="nombre" placeholder="Introduce el nombre"><br><br> 
		Precio <input type="text" name="precio" placeholder="Introduce precio"><br><br> 
		
		 <div id="estilo" style="display:none;">
            Estilo: <input type="text" name="estilo" placeholder="Introduce el estilo"><br>
        </div>
        <div id="color" style="display:none;">
            Color: <input type="text" name="color" placeholder="Introduce color"><br>
        </div>
        <div id="potencia" style="display:none;">
            Potencia: <input type="text" name="potencia" placeholder="Introduce potencia"><br>
        </div>
		<br> <input id="guardar" type="submit" value="Guardar">

	</form>
</body>
</html>