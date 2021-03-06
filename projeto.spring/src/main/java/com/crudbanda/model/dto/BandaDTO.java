package com.crudbanda.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BandaDTO {
	
	private Integer id;
	private String nome;
	private String dataFormacao;
	private List<AlbunsDTO> albunsDto;
	private List<IntegrantesDTO> integrantesDto;
	
}
