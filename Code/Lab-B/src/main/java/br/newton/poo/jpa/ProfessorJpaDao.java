package br.newton.poo.jpa;

import br.newton.poo.dao.Dao;
import br.newton.poo.model.Professor;

import java.util.*;
import java.util.function.Consumer;
import javax.persistence.*;

public class ProfessorJpaDao implements Dao<Professor> {

	public final EntityManager entityManager;

	public ProfessorJpaDao(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	public Optional<Professor> getId(long id) {

		return Optional.ofNullable(entityManager.find(Professor.class, id));

	}

	@Override
	public List<Professor> getAll() {
       return null;
	}

	@Override
	public void save(Professor t) {
		executeInsideTransaction(entityManager -> entityManager.persist(t));
	}

	@Override
	public void update(Professor t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Professor t) {
		executeInsideTransaction(entityManager -> entityManager.remove(t));
	}

	private void executeInsideTransaction(Consumer<EntityManager> action) {
		EntityTransaction tx = entityManager.getTransaction();
		try {
			tx.begin();
			action.accept(entityManager);
			tx.commit();
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
	}

}
