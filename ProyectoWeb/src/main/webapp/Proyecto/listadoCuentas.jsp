<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.Map, java.util.List, usuario.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Map<String, Object> mapa = (Map<String, Object>) request.getAttribute("mapa");
	List<Cuenta> cuentas = (List<Cuenta>) mapa.get("listadoCuentas");
	%>


	<h1><%=mapa.get("subtitulo")%></h1>

	<h2>Admin</h2>
	<%
	for (Cuenta cuenta : cuentas) {
		if (cuenta instanceof Administrador) {
			Administrador admin = (Administrador) cuenta;
	%>

	<p><%=admin.getNombre()%>
		<%=admin.getApellidos()%>
		<%=admin.getDni()%>
		<%=admin.getIdCuenta()%>
		</p>

	<%
	}
	}
	%>


	<h2>Usuario</h2>
	<%
	for (Cuenta cuenta : cuentas) {
		if (cuenta instanceof Usuario) {
			Usuario usuario = (Usuario) cuenta;
	%>

	<p><%=usuario.getNombre()%>
		<%=usuario.getApellidos()%>
		<%=usuario.getDni()%>
		<%=usuario.getPerfilUsuario()()%></p>

	<%
	}
	}
	%>

	<h2>Lámparas</h2>
	<%
	for (Mueble mueble : muebles) {
		if (mueble instanceof Lampara) {
			Lampara lampara = (Lampara) mueble;
	%>

	<p><%=lampara.getNombre()%>
		<%=lampara.getPrecio()%>
		<%=lampara.getPotencia()%></p>

	<%
	}
	}
	%>






</body>
</html>