package com.maurodegaspari.financas.DTO;

import java.io.Serializable;

import com.maurodegaspari.financas.entidades.Vendedor;

public class SomatorioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String NomeVendedor;
	private double soma;
	
	public SomatorioDTO(){
		
	}
	
	public SomatorioDTO(Vendedor vendedor, double soma){
		this.NomeVendedor = vendedor.getNome();
		this.soma = soma;
	}

		// Getters & Setters
	public String getNomeVendedor() {
		return NomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		NomeVendedor = nomeVendedor;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	
	
}
