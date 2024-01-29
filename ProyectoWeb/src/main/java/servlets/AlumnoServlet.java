package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlumnoServlet
 */
public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AlumnoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost FormularioServlet");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String sexo = "";
			if(request.getParameter("sexo1") != null ) {
				sexo = "Hombre";
			}else if(request.getParameter("sexo2") != null ) {
				sexo = "Mujer";
			}else {
				sexo = "Otro";
			}
		String asignatura = request.getParameter("apellidos");
		String areaTexto = request.getParameter("area_de_texto");
		response.setContentType("text/html");
		response.getWriter().append("<H2>Resultado: "+nombre+ " " + apellidos + " " + 
				sexo + " " + asignatura + " " + areaTexto + "</H2>");
		doGet(request, response);
	}

}
