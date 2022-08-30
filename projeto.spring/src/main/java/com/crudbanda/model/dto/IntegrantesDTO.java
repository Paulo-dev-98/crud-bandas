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
public class IntegrantesDTO {
   
	private Integer id;
	private String nome;
	private String dataEntrada;
	private String dataSaida;
	private String instrumento;
	private String breveHistoria;
	private BandaDTO bandaDto;
	
}
