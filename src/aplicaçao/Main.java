package aplicaçao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.view.Tela_Inicio;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pbdPU");
		EntityManager em = emf.createEntityManager();
		
	}

}
