package com.crudbanda.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.crudbanda.model.Albuns;
import com.crudbanda.model.dto.AlbunsDTO;

@Mapper(componentModel = "spring")
public interface AlbunsMapper {
	
	// metodo usado para converter um DTO para uma entidade
	Albuns converterAlbunsDtoParaEntity(AlbunsDTO albunsDto);
	
	// metodo usado para converter uma entidade para um DTO
	AlbunsDTO converterAlbunsEntityParaDto(Albuns albuns);
	
	// metodo declarado para o uso do mapstruc, ele esta convertendo uma lista para uma entidade
	List<Albuns> converterAlbunsListDtoParaEntity(List<AlbunsDTO> albunsDto);

}
