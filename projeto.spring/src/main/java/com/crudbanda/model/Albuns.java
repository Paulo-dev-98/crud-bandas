package com.crudbanda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Albuns {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	@Column(name = "data_lancamento")
	private String dataLancamento;
	
	@Column(name = "faixa_principal")
	private String faixaPrincipal;
	
	@ManyToOne
	@JoinColumn(name = "banda_id")
	private Banda banda;
	
}
