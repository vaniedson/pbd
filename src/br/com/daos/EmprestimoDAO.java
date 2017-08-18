package br.com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.beans.Emprestimo;

public class EmprestimoDAO {
	private static EmprestimoDAO instance;
	protected EntityManager entityManager;

	public static EmprestimoDAO getInstance() {
		if (instance == null) {
			instance = new EmprestimoDAO();
		}
		return instance;
	}

	private EmprestimoDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(ConfigDAO.unidadePersistencia);
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Emprestimo getById(final int id) {
		return entityManager.find(Emprestimo.class, id);
	}
	
	public Emprestimo getByIdLocatarioAndIdLivro(final long idLocatario,final long idLivro ) {
		return (Emprestimo) (entityManager.createQuery("FROM " + Emprestimo.class.getName() + " WHERE locatario_id = " + idLocatario + " AND livroEmprestado_id = " + idLivro).getResultList().get(0));
	}

	/*public Emprestimo getByEmprestimo(final Emprestimo emprestimo) {
		
		return (Emprestimo) (entityManager.createQuery("FROM " + Emprestimo.class.getName() + " WHERE locatario_id = " + emprestimo.getLocatario().getId() + " AND livroEmprestado_id = " + emprestimo.getLivroEmprestado().getId()).getResultList().get(0));
		
	}*/
	
	
	

	@SuppressWarnings("unchecked")
	public List<Emprestimo> findAll() {
		return entityManager.createQuery("FROM " + Emprestimo.class.getName()).getResultList();
	}

	public void persist(Emprestimo emprestimo) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(emprestimo);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Emprestimo emprestimo) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(emprestimo);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Emprestimo emprestimo) {
		try {
			entityManager.getTransaction().begin();
			emprestimo = entityManager.find(Emprestimo.class, emprestimo.getId());
			entityManager.remove(emprestimo);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Emprestimo emprestimo = getById(id);
			remove(emprestimo);
		} catch (Exception ex) {
//			ex.printStackTrace();
		}
	}

}

