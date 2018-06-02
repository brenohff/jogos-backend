package com.brenohff.projetoJogos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Breno Henrique
 *
 */
@Entity
public class Jogador implements Serializable{
	private static final long serialVersionUID = -5698022913968205528L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cor_pino;
	
	public Jogador(String nome, String cor_pino) {
		super();
		this.nome = nome;
		this.cor_pino = cor_pino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor_pino() {
		return cor_pino;
	}

	public void setCor_pino(String cor_pino) {
		this.cor_pino = cor_pino;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
