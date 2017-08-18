package br.com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.beans.Departamento;

public class DepartamentoDAO {

	private static DepartamentoDAO instance;
	protected EntityManager entityManager;

	public static DepartamentoDAO getInstance() {
		if (instance == null) {
			instance = new DepartamentoDAO();
		}
		return instance;
	}

	private DepartamentoDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(ConfigDAO.unidadePersistencia);
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Departamento getById(final int id) {
		return entityManager.find(Departamento.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Departamento> findAll() {
		return entityManager.createQuery("FROM " + Departamento.class.getName()).getResultList();
	}

	public void persist(Departamento departamento) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(departamento);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Departamento departamento) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(departamento);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Departamento departamento) {
		try {
			entityManager.getTransaction().begin();
			departamento = entityManager.find(Departamento.class, departamento.getId());
			entityManager.remove(departamento);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Departamento departamento = getById(id);
			remove(departamento);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
