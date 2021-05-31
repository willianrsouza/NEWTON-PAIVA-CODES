package br.newton.poo.jpa;

import java.util.List;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;

public class AbstractFunction {

	private static final String PU = "meuPU";

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU);
	private static EntityManager em = emf.createEntityManager();

	protected static <T> T buscarPorId(Class<T> entityClass, Integer id) {

		try {
			var objeto = em.find(entityClass, id);

			return objeto;

		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {
			em.close();
		}
		return null;

	}

	protected static <T> List<T> Listar(Class<T> entityClass) {

		var lista = em.createQuery("select a from " + entityClass.getSimpleName() + " a", entityClass).getResultList();

		System.out.println(entityClass.getSimpleName() + " - " + lista.size());

		for (var item : lista) {
			System.out.println("---");
			System.out.println(item);
			System.out.println("---");
		}

		return lista;
	}

	protected static void persisirDadosDb(Object objetoGenerico) {

		try {
			em.getTransaction().begin();
			em.persist(objetoGenerico);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {

			em.close();
			emf.close();
		}

	}

	protected static void atualizarDadosDb(Object objetoGenerico) {

		try {
			em.getTransaction().begin();
			em.merge(objetoGenerico);
			em.getTransaction().commit();

		} catch (Exception e) {

			em.getTransaction().rollback();

		} finally {

			em.close();
		}

	}

	protected static void delete(Object objetoGenerico) {
		try {

			em.getTransaction().begin();
			em.remove(objetoGenerico);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {
			em.close();
		}

	}

}
