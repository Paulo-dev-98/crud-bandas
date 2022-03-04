package com.crudbanda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "integrantes")
public class Integrantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_entrada")
	private String dataEntrada;
	
	@Column(name = "data_saida")
	private String dataSaida;
	
	@Column(name = "instrumento")
	private String Instrumento;
	
	@Column(name = "breve_historia")
	private String breveHistoria;
	
	@ManyToOne
	@JoinColumn(name = "banda_id")
	private Banda banda;

}
