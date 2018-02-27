package br.com.fiap.dao.impl;



import javax.persistence.EntityManager;

import be.com.fiap.entity.Bebida;
import br.com.fiap.dao.BebidaDAO;

public class BebidaDAOImpl implements BebidaDAO{

	private EntityManager em;
	
		
	public BebidaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Bebida cadastrar(Bebida bebida) {
		em.persist(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
		return bebida;
		
	}

	@Override
	public Bebida atualizar(Bebida bebida) {
		em.merge(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
		return bebida;
	}

	@Override
	public Bebida buscar(int coodigo) {
		return em.find(Bebida.class, coodigo);
	}

	@Override
	public void remover(int codigo) {
		Bebida bebida = buscar (codigo);
		em.remove(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
	}
	

}
