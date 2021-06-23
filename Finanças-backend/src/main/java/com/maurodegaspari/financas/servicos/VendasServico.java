package com.maurodegaspari.financas.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.maurodegaspari.financas.entidades.Vendas;
import com.maurodegaspari.financas.repositorio.VendasRepositorio;
import com.maurodegaspari.financas.vendedorDTO.VendasDTO;

@Service
public class VendasServico {
	
	@Autowired
	private VendasRepositorio repo;
	
	public Page<VendasDTO> acharTudo(Pageable pageable){
		Page<Vendas> resultado = repo.findAll(pageable);
		return resultado.map(x -> new VendasDTO(x));
		   
	}
}
