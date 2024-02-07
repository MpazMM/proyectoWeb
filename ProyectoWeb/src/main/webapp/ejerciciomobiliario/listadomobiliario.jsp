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
    
        for (Mobiliario mueble : mobiliario) {%>
            <%if(mueble instanceof Sofa) {%>
                <p>Sofás</p>
            <%   Sofa sofa1 = ((Sofa)mueble);%>
                <p><%=sofa1.getNombre() + " - " + sofa1.getPrecio() + " - " + sofa1.getColor()%></p>
            <% }else if (mueble instanceof Mesa) {%>
            	<p>Mesa</p>
            <%     Mesa mesa1 = ((Mesa)mueble);%>
                <p><%=mesa1.getNombre() + " - " + mesa1.getPrecio() + " - " + mesa1.getEstilo()%></p>
            <% }else if (mueble instanceof Lampara) {%>
            	<p>Lampara</p>
           	<%     Lampara lampara1 = ((Lampara)mueble);%>
                <p><%=lampara1.getNombre() + " - " + lampara1.getPrecio() + " - " + lampara1.getPotencia()%></p>
                 <% } %>
        <% } %>
    <% } %>
</body>
</html>
