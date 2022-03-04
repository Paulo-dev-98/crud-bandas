package com.crudbanda.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.crudbanda.model.Integrantes;
import com.crudbanda.model.dto.IntegrantesDTO;

@Mapper(componentModel = "spring")
public interface IntegrantesMapper {
	
	// metodo usado para converter um DTO para uma entidade
	Integrantes converterIntegrantesDtoParaEntity(IntegrantesDTO integrantesDto);
	
	// metodo usado para converter uma entidade para um DTO
	IntegrantesDTO converterIntegrantesEntityParaDto(Integrantes integrantes);
	
	// metodo declarado para o uso do mapstruc, ele esta convertendo uma lista para uma entidade
	List<Integrantes> converterIntegrantesListDtoParaEntity (List<IntegrantesDTO> integrantesDto);

}
