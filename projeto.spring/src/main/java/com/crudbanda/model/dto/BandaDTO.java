package com.crudbanda.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class BandaDTO {
	
	private Integer id;
	private String nome;
	private String dataFormacao;
	private List<AlbunsDTO> albunsDto;
	private List<IntegrantesDTO> integrantesDto;
	
}
