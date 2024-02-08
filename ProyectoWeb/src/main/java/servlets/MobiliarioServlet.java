package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojos.mobiliario.Lampara;
import pojos.mobiliario.Mesa;
import pojos.mobiliario.Mobiliario;
import pojos.mobiliario.Sofa;

/**
 * Servlet implementation class MobiliarioServlet
 */
public class MobiliarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Mobiliario> muebles;
	private String subtitulo;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobiliarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		subtitulo = config.getInitParameter("subtitle");
		System.out.println("Entrando init con subtitulo "+ subtitulo);
		muebles = new ArrayList<Mobiliario>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Entrando doPost");
		String tipo = request.getParameter("tipo");
		String nombre = request.getParameter("nombre");
		String precios = request.getParameter("precio");
		
		double precio = Double.parseDouble(precios);
		
		if(tipo.equals("M")) {
			String estilo = request.getParameter("estilo");
			Mesa mesa = new Mesa (nombre,precio,estilo);
			muebles.add(mesa);
		}else  if(tipo.equals("S")) {
			String color = request.getParameter("color");
			Sofa sofa = new Sofa(nombre,precio,color);
			muebles.add(sofa);
		}else if(tipo.equals("L")) {
			double potencia = Double.parseDouble(request.getParameter("potencia"));
			Lampara lampara = new Lampara(nombre,precio,potencia);
			muebles.add(lampara);
		}
		
		Map<String,Object> datos = new HashMap<String,Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoMuebles", muebles);
		
		request.setAttribute("mapa", datos);
		RequestDispatcher rd = request.getRequestDispatcher("ejerciciomobiliario/listadomobiliario.jsp"); 
		rd.forward(request, response);
	}

}
