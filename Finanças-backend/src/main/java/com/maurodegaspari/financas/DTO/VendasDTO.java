package com.maurodegaspari.financas.DTO;

import com.maurodegaspari.financas.entidades.Vendas;

public class VendasDTO {

	private Long id;	
	private double venda;
	private double soma;
	
	private VendedorDTO vendedor;
	
	public VendasDTO() {}

	public VendasDTO(Long id, double venda, double soma, VendedorDTO vendedor) {
		this.id = id;
		this.venda = venda;
		this.soma = soma;
		this.vendedor = vendedor;
	}
	
	public VendasDTO(Vendas entity) {
		id = entity.getId();
		venda = entity.getVenda();
		soma = entity.getSoma();
		vendedor = new VendedorDTO(entity.getVendedor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public VendedorDTO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorDTO vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
