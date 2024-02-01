package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

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
	
	private List<AlumnoFormulario> alumnos = new ArrayList<AlumnoFormulario>();
	
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
		String texto = config.getInitParameter("textook");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet AlumnoServlet");
		List<String> alumnos = new ArrayList();

		System.out.println(alumnos.size());
		request.setAttribute("alumnoListado", alumnos);
		RequestDispatcher red = request.getRequestDispatcher("alumnoListado.jsp");
		red.forward(request, response); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost FormularioServlet");
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String sexo = request.getParameter("sexo");
		String asignatura = request.getParameter("lista_de_asignaturas");
		String areaTexto = request.getParameter("area_de_texto");
//		response.setContentType("text/html");
//		response.getWriter().append("<H2>Resultado: " + nombre + " " + apellidos + " " + sexo + " " 
//				+ asignatura + " " + areaTexto + "</H2>");
		AlumnoFormulario alumno = new AlumnoFormulario (nombre,apellidos,sexo,asignatura,areaTexto);
		alumnos.add(alumno);
		response.setContentType("text/html");
		for (AlumnoFormulario alumnoFormulario : alumnos) {	
			response.getWriter().append("<p>Alumno " + alumnoFormulario.getNombre() + " " + alumnoFormulario.getApellidos() + " " 
					+alumnoFormulario.getSexo() + " " + alumnoFormulario.getAsignatura() + " " + alumnoFormulario.getAreaTexto() + "</p><br>");
		}
		
		doGet(request, response);
	}

}
