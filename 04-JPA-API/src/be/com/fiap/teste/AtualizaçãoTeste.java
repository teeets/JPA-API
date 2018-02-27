package be.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import be.com.fiap.entity.Bebida;
import be.com.fiap.entity.TIpo;

public class AtualizaçãoTeste {
	
		
		public static void main(String[] args) {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
			
			EntityManager em = fabrica.createEntityManager();
			
			Bebida bebida = //em.find(Bebida.class, 1); //Passar a classe Bebida e o ID;
					new Bebida(TIpo.CERVEJA, "Heiniken", new GregorianCalendar(2020, Calendar.JANUARY,2), null, true);
			bebida.setCodigo(21);
			
			
			
			em.merge(bebida);//Merge atualiza caso exista o ID ou salva caso nâo exista
			em.getTransaction().begin();
			em.getTransaction().commit();
			
			em.close();
			fabrica.close();
		}

	}
