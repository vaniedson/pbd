package br.com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.beans.Livro;

public class LivroDAO {

	private static LivroDAO instance;
	protected EntityManager entityManager;

	public static LivroDAO getInstance() {
		if (instance == null) {
			instance = new LivroDAO();
		}
		return instance;
	}

	private LivroDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(ConfigDAO.unidadePersistencia);
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Livro getById(final int id) {
		return entityManager.find(Livro.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Livro> findAll() {
		return entityManager.createQuery("FROM " + Livro.class.getName()).getResultList();
	}

	public void persist(Livro livro) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(livro);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Livro livro) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(livro);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Livro livro) {
		try {
			entityManager.getTransaction().begin();
			livro = entityManager.find(Livro.class, livro.getId());
			entityManager.remove(livro);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Livro livro = getById(id);
			remove(livro);
		} catch (Exception ex) {
//			ex.printStackTrace();
		}
	}

}
