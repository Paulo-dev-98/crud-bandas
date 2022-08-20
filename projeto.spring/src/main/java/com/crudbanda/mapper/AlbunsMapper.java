package com.crudbanda.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.crudbanda.model.Albuns;
import com.crudbanda.model.dto.AlbunsDTO;

@Mapper(componentModel = "spring")
public interface AlbunsMapper {
	
	Albuns converterAlbunsDtoParaEntity(AlbunsDTO albunsDto);
	
	AlbunsDTO converterAlbunsEntityParaDto(Albuns albuns);
	
	List<Albuns> converterAlbunsListDtoParaEntity(List<AlbunsDTO> albunsDto);

}
