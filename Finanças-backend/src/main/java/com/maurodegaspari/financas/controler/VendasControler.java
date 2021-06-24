package com.maurodegaspari.financas.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.financas.DTO.SomatorioDTO;
import com.maurodegaspari.financas.DTO.VendasDTO;
import com.maurodegaspari.financas.servicos.VendasServico;

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
	
	@GetMapping(value ="/somatorio")
	public ResponseEntity<List<SomatorioDTO>> trazerServicoFuncionadarioSoma(){
		List<SomatorioDTO> lista = servico.somaFuncReposirotioServico();
		return ResponseEntity.ok(lista);
	}
}
