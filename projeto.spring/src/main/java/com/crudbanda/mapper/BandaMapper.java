package com.crudbanda.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.crudbanda.model.Banda;
import com.crudbanda.model.dto.BandaDTO;

@Mapper(componentModel = "spring", uses = {AlbunsMapper.class, IntegrantesMapper.class})
public interface BandaMapper {

	@Mappings({
		@Mapping(source = "albunsDto", target = "albuns"), 
		@Mapping(source = "integrantesDto", target = "integrantes")
		})
	Banda converterBandaDtoParaEntity(BandaDTO bandaDto);
	
	@Mappings({
		@Mapping(source = "albuns", target = "albunsDto"),
		@Mapping(source = "integrantes", target = "integrantesDto")
	})
	BandaDTO converterBandaEntityParaBandaDto(Banda banda);

	@AfterMapping
	default void after(final @MappingTarget Banda banda) {
		if(banda.getAlbuns() != null) {
			banda.getAlbuns().forEach(e -> e.setBanda(banda));
		}
		if(banda.getIntegrantes() != null) {
			banda.getIntegrantes().forEach(e -> e.setBanda(banda));
		}
	}

}
