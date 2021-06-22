package com.maurodegaspari.financas.servicos;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.financas.entidades.Vendedor;
import com.maurodegaspari.financas.repositorio.VendedorRepositorio;
import com.maurodegaspari.financas.vendedorDTO.VendedorDTO;

@Service
public class VendedorServico {

	@Autowired
	private VendedorRepositorio repo;
	
	public List<VendedorDTO> AcharVendedor(){
		List<Vendedor> resultado = repo.findAll();
		return resultado.stream().map(x -> new VendedorDTO(x)).collect(Collectors.toList());
	}
	
}
