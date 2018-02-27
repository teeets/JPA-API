package br.com.fiap.dao;

import be.com.fiap.entity.Bebida;

public interface BebidaDAO {

	Bebida cadastrar(Bebida bebida);
	Bebida atualizar(Bebida bebida);
	Bebida buscar(int coodigo);
	void remover(int codigo);
	
	
}
