package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 
	private static EntityManager em;
	
	public static EntityManager getEntityManager() {
	
		return getEntityManager("hibernateMySQL");
		
	}
	
	
	public static EntityManager getEntityManager(String persitenceUnit) {
		
		if (em==null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory(persitenceUnit);
			em = emf.createEntityManager();
		}

		return em;
		
	}

}

