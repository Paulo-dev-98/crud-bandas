package com.crudbanda.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.crudbanda.mapper.BandaMapper;
import com.crudbanda.model.Banda;
import com.crudbanda.model.dto.BandaDTO;
import com.crudbanda.repository.BandaRepository;
import com.crudbanda.service.BandaService;


@Service
public class BandaServiceImpl implements BandaService{
	
	private final BandaRepository bandaRepository;
	private final BandaMapper bandaMapper;
	
	public BandaServiceImpl(BandaRepository bandaRepository, BandaMapper bandaMapper) {
		this.bandaRepository = bandaRepository;
		this.bandaMapper = bandaMapper;
	}
	
	

	@Override
	public List<BandaDTO> buscarTodos() {
		
		return this.bandaRepository
				.findAll()
				.stream()
				.map(e -> bandaMapper.converterBandaEntityParaBandaDto(e))
				.collect(Collectors.toList());

	}



	@Override
	public BandaDTO salvarBanda(BandaDTO banda) {
       Banda entity = bandaMapper.converterBandaDtoParaEntity(banda);
       entity.getAlbuns().stream().forEach(e -> e.setBanda(entity));
       entity.getIntegrantes().stream().forEach(e -> e.setBanda(entity));
       bandaRepository.save(entity);
       return banda;
	}

}
