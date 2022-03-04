package com.crudbanda.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntegrantesDTO {
   
	private Integer id;
	private String nome;
	private String dataEntrada;
	private String dataSaida;
	private String instrumento;
	private String breveHistoria;
	private BandaDTO bandaDto;
	
}
