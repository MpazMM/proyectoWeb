package usuario.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import usuario.entities.Cuenta;
import utils.JpaUtils;

public class UsuarioDAO {
	private EntityManager em = JpaUtils.getEntityManager();

	
	public List<Cuenta> getCuentas() {
		List<Cuenta> cuentas = em.createQuery("from Cuenta").getResultList();
		return cuentas;
	}

	public Cuenta getPorId(long id) {
		Cuenta cuenta;
		Query query = em.createQuery(
				"from Cuenta cu where cu.id=?1", 
				Cuenta.class);
		
		query.setParameter(1, id);
		cuenta = (Cuenta)query.getSingleResult();
		
		return cuenta;
	}
	
	public void insert(Cuenta cuenta) {
		this.em.getTransaction().begin();
		try {
			em.persist(cuenta);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			this.em.getTransaction().rollback();
		}	
	}
	
	public void update(Cuenta cuenta) {
		
	}
	
	public void delete(Cuenta cuenta) {
		
	}
	
}
