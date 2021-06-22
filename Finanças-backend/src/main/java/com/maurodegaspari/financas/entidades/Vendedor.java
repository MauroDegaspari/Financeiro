package com.maurodegaspari.financas.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//MAPEAMENTO ENTITADE RELACIONAL
@Entity
@Table(name ="tb_vendedor")
public class Vendedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@JsonIgnore
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy = "vendedor")
	private List<Vendas> vendas = new ArrayList<>();
	
	public Vendedor() {
		
	}

	public Vendedor(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Vendas> getVendas() {
		return vendas;
	}
	
	
	 
}