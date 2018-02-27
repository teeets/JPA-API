package be.com.fiap.teste;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import be.com.fiap.entity.Bebida;

//Atualiza o obj com os dados do banco
public class RefreshTeste {

	
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		//Criar o EntityManager
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager(); 
		
		//BUscar uma Bebida
		Bebida bebida = em.find(Bebida.class, 1);
				
		//Exibir o nome
		System.out.println("Código da bebida: "  + bebida.getNome());
				
		//Mudar o nome da bebida no java
		bebida.setNome("Corona");
		
		//Exibir o nome
		System.out.println(bebida.getNome());
		
		
		//Fazer refresh
		em.refresh(bebida); //Volta para o dado do java, nao cadastra no banco
		
		//Exibir o nome
		System.out.println(bebida.getNome());
		
		em.close();
		fabrica.close();
	}
	
}
