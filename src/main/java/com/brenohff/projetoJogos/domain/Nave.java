package com.brenohff.projetoJogos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Nave implements Serializable{
	private static final long serialVersionUID = -9154413863984812593L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Integer valor_vida;
	private Integer valor_ataque;	
	private String link_gif;
	private String status;
	private boolean escolhido;
	
	public Nave(String nome, Integer valor_vida, Integer valor_ataque, String link_gif, String status,
			boolean escolhido) {
		super();
		this.nome = nome;
		this.valor_vida = valor_vida;
		this.valor_ataque = valor_ataque;
		this.link_gif = link_gif;
		this.status = status;
		this.escolhido = escolhido;
	}

	public Nave() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getValor_vida() {
		return valor_vida;
	}
	public void setValor_vida(Integer valor_vida) {
		this.valor_vida = valor_vida;
	}
	public Integer getValor_ataque() {
		return valor_ataque;
	}
	public void setValor_ataque(Integer valor_ataque) {
		this.valor_ataque = valor_ataque;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLink_gif() {
		return link_gif;
	}

	public void setLink_gif(String link_gif) {
		this.link_gif = link_gif;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isEscolhido() {
		return escolhido;
	}

	public void setEscolhido(boolean escolhido) {
		this.escolhido = escolhido;
	}	
		
}
