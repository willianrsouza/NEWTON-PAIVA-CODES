package br.newton.poo.teste;

import javax.persistence.*;

public abstract class AbstractFunction {

	public static void recuperarId() {
      
	}

	public static void persistirDados(Object T) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(T);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
	
	

}
