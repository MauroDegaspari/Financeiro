package com.maurodegaspari.financas.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.financas.entidades.Vendedor;
import com.maurodegaspari.financas.servicos.VendedorServico;
import com.maurodegaspari.financas.vendedorDTO.VendedorDTO;

@RestController
@RequestMapping(value="/vendedor")
public class VendedorContoler {

	@Autowired
	private VendedorServico servico;
	
	@GetMapping
	public ResponseEntity<List<VendedorDTO>> trazerServico(){
		List<VendedorDTO> lista =  servico.AcharVendedor();
		return ResponseEntity.ok(lista);
	}
	
}
