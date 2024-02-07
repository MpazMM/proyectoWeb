package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
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
	Map<String,List<Mobiliario>> mapa = new HashMap<String,List<Mobiliario>>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobiliarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		String estilo = request.getParameter("estilo");
		String color = request.getParameter("color");
		int potencia = Integer.parseInt(request.getParameter("estilo"));
		
		if(estilo!=null) {
			Mesa mesa = new Mesa(nombre,precio,estilo);
			muebles.add(mesa);
		}else if (color!=null){
			Sofa sofa = new Sofa(nombre,precio,color);
			muebles.add(sofa);
		}else {
			Lampara lampara = new Lampara(nombre,precio,potencia);
			muebles.add(lampara);
		}
		
		mapa.put("Listado de muebles", muebles);
		
		request.setAttribute("listadoMuebles", mapa);
		RequestDispatcher rd = request.getRequestDispatcher("ejerciciomobiliario/listadomobiliario.jsp"); 
		rd.forward(request, response);
	}

}
