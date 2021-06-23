package com.maurodegaspari.financas.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.financas.servicos.VendasServico;
import com.maurodegaspari.financas.vendedorDTO.VendasDTO;

@RestController
@RequestMapping(value= "/vendas")
public class VendasControler {

	@Autowired
	public VendasServico servico;
	
	@GetMapping
	public ResponseEntity<Page<VendasDTO>> trazerServico(Pageable pageable){
		Page<VendasDTO> lista =  servico.acharTudo(pageable);
		return ResponseEntity.ok(lista);
	}
	
}
