package br.com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.beans.Autores;

public class AutoresDAO {

	private static AutoresDAO instance;
	protected EntityManager entityManager;

	public static AutoresDAO getInstance() {
		if (instance == null) {
			instance = new AutoresDAO();
		}
		return instance;
	}

	private AutoresDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(ConfigDAO.unidadePersistencia);
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Autores getById(final int id) {
		return entityManager.find(Autores.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Autores> findAll() {
		return entityManager.createQuery("FROM " + Autores.class.getName()).getResultList();
	}

	public void persist(Autores autor) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(autor);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Autores autor) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(autor);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Autores autor) {
		try {
			entityManager.getTransaction().begin();
			autor = entityManager.find(Autores.class, autor.getId());
			entityManager.remove(autor);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Autores autor = getById(id);
			remove(autor);
		} catch (Exception ex) {
//			ex.printStackTrace();
		}
	}

}

