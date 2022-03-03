package com.crudbanda.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "banda")
@NoArgsConstructor
public class Banda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_formacao")
	private String dataFormacao;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Albuns> albuns;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Integrantes> integrantes;

}
