package usuario.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import usuario.dao.UsuarioDAO;
import usuario.entities.Administrador;
import usuario.entities.Cuenta;
import usuario.entities.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String subtitulo;

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
		subtitulo = config.getInitParameter("subtitle");
		System.out.println("Entrando init con subtitulo " + subtitulo);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entrando doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entrando doPost");

		String nombreUsuario = request.getParameter("nombreUsuario");
		String apellidosUsuario = request.getParameter("apellidosUsuario");
		String dniUsuario = request.getParameter("dniUsuario");
		String sexoUsuario = request.getParameter("sexoUsuario");

		if (sexoUsuario.equals("Masculino")) {
			sexoUsuario = "Masculino";
		} else if (sexoUsuario.equals("Femenino")) {
			sexoUsuario = "Femenino";
		} else if (sexoUsuario.equals("Otro")) {
			sexoUsuario = "Otro";
		}

		String fechaNacimientoStr = request.getParameter("fechaNacimiento");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaNacimiento = null;
		try {
			fechaNacimiento = format.parse(fechaNacimientoStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String emailUsuario = request.getParameter("emailUsuario");
		int tlfUsuario = Integer.parseInt(request.getParameter("telefono"));
		String tipoUsuario = request.getParameter("tipoUsuario");
		String idCuenta = request.getParameter("idCuenta");
		String contrasenia = request.getParameter("contrasenia");

		UsuarioDAO cdao = new UsuarioDAO();
		Cuenta cuenta = null;
		if (tipoUsuario.equals("ADMIN")) {
			int tlfCorp = Integer.parseInt(request.getParameter("tlfCorp"));
			String emailCorp = request.getParameter("emailCorp");
			cuenta = new Administrador(nombreUsuario, apellidosUsuario, dniUsuario, sexoUsuario, fechaNacimiento,
					emailUsuario, tlfUsuario, idCuenta, contrasenia, tlfCorp, emailCorp);
		} else if (tipoUsuario.equals("USUARIO")) {
			String perfilUsuario = request.getParameter("perfilUsuario");
			cuenta = new Usuario(nombreUsuario, apellidosUsuario, dniUsuario, sexoUsuario, fechaNacimiento,
					emailUsuario, tlfUsuario, idCuenta, contrasenia, perfilUsuario);
		}

		cdao.insert(cuenta);

		List<Cuenta> cuentas = cdao.getCuentas();

		Map<String, Object> datos = new HashMap<String, Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoCuentas", cuentas);

		request.setAttribute("mapa", datos);
		RequestDispatcher rd = request.getRequestDispatcher("Proyecto/listadoCuentas.jsp");

		rd.forward(request, response);
	}

}
