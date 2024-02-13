<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List,java.util.Collection,java.util.HashMap,java.util.Map,java.util.Map.Entry,java.util.Set,pojos.mobiliario.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Map<String, Object> mapa = (Map<String, Object>)request.getAttribute("mapa");
	List<Mobiliario> muebles = (List<Mobiliario>)mapa.get("listadoMuebles");
%>


<h1><%=mapa.get("subtitulo")  %></h1>

<h2>Mesas</h2>
<% 
	for (Mobiliario mueble : muebles){
		if (mueble instanceof Mesa){ 
		Mesa mesa = (Mesa)mueble; %>
		
		<p><%=mesa.getNombre()%> <%=mesa.getPrecio()%> <%=mesa.getEstilo()%></p>
	   <a href="/ProyectoWeb/ejerciciomobiliario/
				mobiliario.jsp?id=<%=mesa.getId()%>"><input onclick="">Modificar</a>
<%		}  
	} %>


				
<h2>Sofás</h2>
<% 
	for (Mobiliario mueble : muebles){
		if (mueble instanceof Sofa){ 
		Sofa sofa = (Sofa)mueble; %>
		
		<p><%=sofa.getNombre()%> <%=sofa.getPrecio()%> <%=sofa.getColor()%></p>
		<a href="/ProyectoWeb/ejerciciomobiliario/
				mobiliario.jsp?id=<%=sofa.getId()%>"><input onclick="">Modificar</a>
	
<%		}  
	} %>
	
<h2>Lámparas</h2>
<% 
	for (Mobiliario mueble : muebles){
		if (mueble instanceof Lampara){ 
			Lampara lampara = (Lampara)mueble; %>
		
		<p><%=lampara.getNombre()%> <%=lampara.getPrecio()%> <%=lampara.getPotencia()%></p>
	<a href="/ProyectoWeb/ejerciciomobiliario/
				mobiliario.jsp?id=<%=lampara.getId()%>"><input onclick="">Modificar</a>
<%		}  
	} %>


</body>
</html>
