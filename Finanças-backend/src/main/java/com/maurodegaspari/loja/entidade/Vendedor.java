package com.maurodegaspari.loja.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//MAPEAMENTO ENTITADE RELACIONAL
@Entity
@Table(name ="tb_vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
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