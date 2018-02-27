package be.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import be.com.fiap.entity.Bebida;

public class BuscaTeste {
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager();
		
		Bebida bebida = em.find(Bebida.class, 1); //Passar a classe Bebida e o ID;
		
		System.out.println("A bebida é: " + bebida.getNome() + "Tipo "+ bebida.getTipo());
		
		em.close();
		fabrica.close();
	}

}
