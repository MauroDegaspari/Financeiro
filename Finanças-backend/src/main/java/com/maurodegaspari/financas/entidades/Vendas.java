package com.maurodegaspari.financas.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

// MAPEAMENTO ENTITADE RELACIONAL
@Entity
@Table(name ="tb_vendas")
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@JsonIgnore
	private Long id;
	
	private double venda;
	private double soma;
	
	@ManyToOne
	@JoinColumn(name ="id_vendedor")
	private Vendedor vendedor;
	
	
	// CONTRUTORES
	public Vendas() {
		
	}

	public Vendas(Long id, double venda, double soma, Vendedor vendedor) {
		this.id = id;
		this.venda = venda;
		this.soma = soma;
		this.vendedor = vendedor;
	}
	
	//GETS & SETS
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
