package dao.mobiliario;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import pojos.mobiliario.Mobiliario;
import utils.JpaUtil;

public class MobiliarioDAO {

	private static EntityManager em  = JpaUtil.getEntityManager();


	public List<Mobiliario> getMobiliario() {
		
		List<Mobiliario> muebles = em.createQuery("from Mobiliario", Mobiliario.class).getResultList();
		
		return muebles;
	}


	public Mobiliario getByPK(long id) {
		
		Mobiliario mueble;
		Query query = em.createQuery(
				"from Mobiliario mb where mb.id=?1", 
				Mobiliario.class);
		
		query.setParameter(1, id);
		mueble = (Mobiliario)query.getSingleResult();
		
		return mueble;
	}


	public void insert(Mobiliario mueble) {
		this.em.getTransaction().begin();
		try {
			em.persist(mueble);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			this.em.getTransaction().rollback();
		}
		
	}

//TODO más tarde
//	public void updateById(long id,Mobiliario muebleModificado) {
//		TypedQuery<Mobiliario> query = em.createQuery(
//				"from Mobiliario where id=?1",
//				Mobiliario.class);
//		query.setParameter(1, id);
//		
//		try {
//			Mobiliario mueble = query.getSingleResult();
//			em.getTransaction().begin();
//			mueble.setNombre(muebleModificado.getNombre());
//			mueble.setPrecio(muebleModificado.getPrecio());
//
//			mueble.setFechaAlta(muebleModificado.getFechaAlta());
//
//			em.merge(mueble);
//			
//			em.getTransaction().commit();
//		}catch (NoResultException nre) {
//			System.out.println("ID "+ id + " no encontrado");
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			em.getTransaction().rollback();
//		}
//		
//	}
		


	public void deleteById(long id) {
		 em.getTransaction().begin();
		 try {
			Mobiliario mobiliario = getByPK(id);
            	em.remove(mobiliario);
            em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
		
	}

}
