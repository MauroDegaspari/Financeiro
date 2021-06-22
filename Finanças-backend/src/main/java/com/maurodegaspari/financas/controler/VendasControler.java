package com.maurodegaspari.financas.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.financas.entidades.Vendas;
import com.maurodegaspari.financas.servicos.VendasServico;

@RestController
@RequestMapping(value= "/vendas")
public class VendasControler {

	@Autowired
	public VendasServico servico;
	
	@GetMapping
	public ResponseEntity<List<Vendas>> trazerServico(){
		List<Vendas> lista =  servico.acharTudo();
		return ResponseEntity.ok(lista);
	}
	
}
