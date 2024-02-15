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
	        String action = request.getParameter("action");
	        if ("edit".equals(action)) {
	            // Editar alumno
	            long id = Long.parseLong(request.getParameter("id"));
	            AlumnoFormulario alumno = alumnos.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
	            request.setAttribute("alumno", alumno);
	            RequestDispatcher rd = request.getRequestDispatcher("jsp/formularioAlumno.jsp");
	            rd.forward(request, response);
	        } else {
	            // Listar alumnos
	            request.setAttribute("alumnoListado", alumnos);
	            RequestDispatcher rd = request.getRequestDispatcher("jsp/alumnoListado.jsp");
	            rd.forward(request, response);
	        }
	    }

	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Obtener datos del formulario
	        String nombre = request.getParameter("nombre");
	        String apellidos = request.getParameter("apellidos");
	        String sexo = request.getParameter("sexo");
	        String asignatura = request.getParameter("lista_de_asignaturas");
	        String areaTexto = request.getParameter("area_de_texto");
	        // Crear o actualizar alumno
	        AlumnoFormulario alumno;
//	        if (strId != null && !strId.isEmpty()) {
//	            long id = Long.parseLong(strId);
//	            alumno = alumnos.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
//	            if (alumno != null) {
//	                alumno.setNombre(nombre);
//	                alumno.setApellidos(apellidos);
//	                alumno.setSexo(sexo);
//	                alumno.setAsignatura(asignatura);
//	                alumno.setAreaTexto(areaTexto);
//	            }
//	        } else {
//	            long id = alumnos.size() > 0 ? alumnos.get(alumnos.size() - 1).getId() + 1 : 1;
//	            alumno = new AlumnoFormulario(id, nombre, apellidos, sexo, asignatura, areaTexto);
//	            alumnos.add(alumno);
//	        }
//	        doGet(request, response);
	    }
	
	

}
