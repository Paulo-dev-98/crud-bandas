package com.crudbanda.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class AlbunsDTO {
	
	private Integer id;
	private String nome;
	private String dataLancamento;
	private String faixaPrincipal;
	private BandaDTO bandaDto;

}
