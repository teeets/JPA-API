package be.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import be.com.fiap.entity.Bebida;

//Remove obj do banco, NECESSARIO PASSAR A CHAVE
public class RemoveTeste {

	public static void main(String[] args) {


		// TODO Auto-generated method stub


		//Criar Entity Managet
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		EntityManager em = fabrica.createEntityManager();


		//Buscar uma bebida
		Bebida bebida = em.find(Bebida.class, 21);


		//Remover uma bebida
		em.remove(bebida);

		em.getTransaction().begin();
		em.getTransaction().commit();


		em.close();
		fabrica.close();
	}
}