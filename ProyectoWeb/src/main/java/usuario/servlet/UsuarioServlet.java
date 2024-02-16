package usuario.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.muebles.Mueble;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import usuario.dao.UsuarioDAO;
import usuario.entities.Administrador;
import usuario.entities.Cuenta;
import usuario.entities.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
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
		System.out.println("Entrando doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando doPost");
		String tipo = request.getParameter("tipo");
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		
		
		UsuarioDAO cdao = new UsuarioDAO();
		Cuenta cuenta = null;
		if(tipo.equals("ADMIN")) {
			String estilo = request.getParameter("estilo");
			cuenta = new Administrador (nombre, apellidos, dni, sexo, fechaNacimiento, email, telefono, idCuenta, contrasenia, tlfCorp, emailCorp);
		}else if(tipo.equals("USUARIO")) {
			double potencia = Double.parseDouble(request.getParameter("potencia"));
			cuenta = new Usuario (nombre, apellidos, dni, sexo, fechaNacimiento, email, telefono, idCuenta, contrasenia, invitado);
		}

		cdao.insert(cuenta);
		
		//Obtenemos los muebles de la base de datos
		List<Cuenta> cuentas =  cdao.getCuentas();
		
		//TODO hay que revisar el web.xml con los Servlets (también las anotaciones) y hacer los jsp y sincronizarlos.
		Map<String,Object> datos = new HashMap<String,Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoCuentas", cuentas);
		
//		request.setAttribute("subtitulo", subtitulo);
//		request.setAttribute("listadoMuebles", muebles);
		
		request.setAttribute("mapa", datos);
		RequestDispatcher rd =  request.getRequestDispatcher("ejercicioMueblesHerencia/listadoMuebles.jsp");
		
		rd.forward(request, response);
	}

}
