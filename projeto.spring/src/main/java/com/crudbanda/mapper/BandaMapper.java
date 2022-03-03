package com.crudbanda.mapper;

import org.mapstruct.Mapper;

import com.crudbanda.model.Banda;
import com.crudbanda.model.dto.BandaDTO;

@Mapper(componentModel = "spring")
public interface BandaMapper {

	Banda converterBandaDtoParaEntity(BandaDTO bandaDto);
	BandaDTO converterBandaEntityParaBandaDto(Banda banda);
	
}
