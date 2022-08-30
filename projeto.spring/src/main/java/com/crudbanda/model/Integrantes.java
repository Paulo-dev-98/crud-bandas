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
public class Integrantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	@Column(name = "data_entrada")
	private String dataEntrada;
	
	@Column(name = "data_saida")
	private String dataSaida;

	private String instrumento;
	
	@Column(name = "breve_historia")
	private String breveHistoria;
	
	@ManyToOne
	@JoinColumn(name = "banda_id")
	private Banda banda;

}
