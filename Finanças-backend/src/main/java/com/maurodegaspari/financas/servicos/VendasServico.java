package com.maurodegaspari.financas.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.financas.entidades.Vendas;
import com.maurodegaspari.financas.repositorio.VendasRepositorio;

@Service
public class VendasServico {
	
	@Autowired
	private VendasRepositorio repo;
	
	public List<Vendas> acharTudo(){
		 	return repo.findAll();
		   
	}
}
