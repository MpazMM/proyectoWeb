<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,pojos.mobiliario.Mobiliario,pojos.mobiliario.Mesa,pojos.mobiliario.Lampara,pojos.mobiliario.Sofa,java.util.Collection,java.util.HashMap,java.util.Map,java.util.Map.Entry,java.util.Set"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	Map<String, List<Mobiliario>> mapa = (Map<String, List<Mobiliario>>) request.getAttribute("listadoMuebles");

	Set<Entry <String, List<Mobiliario>>> entries = mapa.entrySet();
	for (Entry<String, List<Mobiliario>> entry : entries) {%>
		<h1><%=entry.getKey() %></h1>
	<% 
	
	List<Mobiliario> mobiliario = entry.getValue();
	}
	for (List<Mobiliario> listaMobiliario : mobiliario) {
		for (Mobiliario mueble : listaMuebles) {%>
			<p>Sofás</p>
			<%if(mueble instanceof Sofa) {
				Sofa sofa1 = ((Sofa)mueble);%>
				<p><%=sofa1.getNombre() + "" + sofa1.getPrecio()%></p>
			<% } %>
			
			<%
		}
	}
	%>



</body>
</html>