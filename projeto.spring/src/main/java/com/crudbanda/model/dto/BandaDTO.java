package com.crudbanda.model.dto;

import java.util.List;

import com.crudbanda.model.Albuns;
import com.crudbanda.model.Integrantes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BandaDTO {
	
	private Integer id;
	private String nome;
	private String dataFormacao;
	private List<Albuns> albuns;
	private List<Integrantes> integrantes;
	
	public List<Albuns> getAlbuns(){
		return albuns;
	}
	
	public List<Integrantes> getIntegrantes(){
		return integrantes;
	}
}
