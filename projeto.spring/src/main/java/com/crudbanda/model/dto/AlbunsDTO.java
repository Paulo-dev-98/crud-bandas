package com.crudbanda.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbunsDTO {
	
	private Integer id;
	private String nome;
	private String dataLancamento;
	private String faixaPrincipal;
	private BandaDTO bandaDto;

}
