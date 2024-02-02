package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojos.AlumnoFormulario;

/**
 * Servlet implementation class AlumnoServlet
 */
public class AlumnoServlet extends HttpServlet {
	
	private List<AlumnoFormulario> alumnos = new ArrayList<AlumnoFormulario>();
	
	private static final long serialVersionUID = 1L;


	public AlumnoServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		String texto = config.getInitParameter("textook");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
	    if ("edit".equals(action)) {
	        String nombre = (request.getParameter("nombre"));
	        AlumnoFormulario alumno = alumnos.get(nombre);
	        request.setAttribute("alumno", alumno);
	        request.setAttribute("nombre", nombre); 
	        RequestDispatcher rd = request.getRequestDispatcher("jsp/formularioAlumno.jsp");
	        rd.forward(request, response);   
	        } else {
		request.setAttribute("alumnoListado", alumnos);
		RequestDispatcher rd = request.getRequestDispatcher("jsp/alumnoListado.jsp");
		rd.forward(request, response); 
	        }
	}


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
