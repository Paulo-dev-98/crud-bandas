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

	// essa anotação vai jogar albunsDto dentro de albuns
	@Mappings({
		@Mapping(source = "albunsDto", target = "albuns"), 
		@Mapping(source = "integrantesDto", target = "integrantes")
		})
	Banda converterBandaDtoParaEntity(BandaDTO bandaDto);
	
	// essa anotação vai jogar albuns dentro de albunsDto
	@Mappings({
		@Mapping(source = "albuns", target = "albunsDto"),
		@Mapping(source = "integrantes", target = "integrantesDto")
	})
	BandaDTO converterBandaEntityParaBandaDto(Banda banda);

	/* esse metodo funciona depois do mapeamento, ele confere se albuns e diferente de null, se essa
	 * condição for verdadeira, para cada album ele seta uma banda */ 
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
