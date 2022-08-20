package com.crudbanda.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.crudbanda.model.Integrantes;
import com.crudbanda.model.dto.IntegrantesDTO;

@Mapper(componentModel = "spring")
public interface IntegrantesMapper {
	
	Integrantes converterIntegrantesDtoParaEntity(IntegrantesDTO integrantesDto);
	
	IntegrantesDTO converterIntegrantesEntityParaDto(Integrantes integrantes);

	List<Integrantes> converterIntegrantesListDtoParaEntity (List<IntegrantesDTO> integrantesDto);

}
