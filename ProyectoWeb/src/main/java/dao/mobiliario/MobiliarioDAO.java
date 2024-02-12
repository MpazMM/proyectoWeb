package dao.mobiliario;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import pojos.mobiliario.Mobiliario;
import utils.JpaUtil;

public class MobiliarioDAO {

	private static EntityManager em;

	protected void iniciaOperacion() {
		em = JpaUtil.getEM("hibernateMySQL");
	}

	protected void terminaOperacion() {
	}


	public static void almacenaEntidad(Mobiliario mobiliario) throws HibernateException {
		MobiliarioDAO dummy = new MobiliarioDAO() {
		};

		try {
			em = JpaUtil.getEM("hibernateMySQL");
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(mobiliario);
			transaction.commit();

		} catch (HibernateException he) {
			System.err.println("Error " + he.getMessage());
		}
	}

	public static <T> T getEntidad(Serializable id, Class<T> claseEntidad) throws HibernateException {
		MobiliarioDAO dummy = new MobiliarioDAO() {
		};

		T objetoRecuperado = null;

		try {
			dummy.iniciaOperacion();
			objetoRecuperado = (T) em.find(claseEntidad, id);
		} catch (HibernateException he) {

		}

		return objetoRecuperado;
	}

	public static <T> List<T> getListaEntidades(Class<T> claseEntidad) throws HibernateException {
		MobiliarioDAO dummy = new MobiliarioDAO() {
		};

		List<T> listaResultado = null;

		try {
			dummy.iniciaOperacion();
			listaResultado = em.createQuery("FROM " + claseEntidad.getSimpleName()).getResultList();
		} catch (HibernateException he) {

		}
		return listaResultado;
	}
}
