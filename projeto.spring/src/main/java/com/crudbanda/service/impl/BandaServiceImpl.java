package com.crudbanda.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudbanda.exception.ResourceNotFoundException;
import com.crudbanda.mapper.BandaMapper;
import com.crudbanda.model.Banda;
import com.crudbanda.model.dto.BandaDTO;
import com.crudbanda.repository.BandaRepository;
import com.crudbanda.service.BandaService;

@Service
public class BandaServiceImpl implements BandaService{
	
	@Autowired
	private BandaRepository bandaRepository;
	
	@Autowired
	private BandaMapper bandaMapper;
	
	@Override
	public List<BandaDTO> buscarTodos() {
		
		return this.bandaRepository
				.findAll()
				.stream()
				.map(e -> bandaMapper.converterBandaEntityParaBandaDto(e))
				.collect(Collectors.toList());

	}
	
	@Override
	public BandaDTO buscarBandaPorId(Integer id) {
		try {
			Banda banda = bandaRepository.findById(id).get();
			return bandaMapper.converterBandaEntityParaBandaDto(banda);
		} catch (Exception e) {
			throw new RuntimeException("id não encontrado");
		}
	}

	@Override
	public BandaDTO salvarBanda(BandaDTO bandaDto) {
       Banda entity = bandaMapper.converterBandaDtoParaEntity(bandaDto);
       bandaRepository.save(entity);
       return bandaMapper.converterBandaEntityParaBandaDto(entity);
	}

	@Override
	public BandaDTO atualizarBanda(BandaDTO bandaDto) {
		Banda entity = bandaRepository.save(bandaMapper.converterBandaDtoParaEntity(bandaDto));
		return bandaMapper.converterBandaEntityParaBandaDto(entity);
	}
	
	@Override
	public void deletarBandaPorId(Integer id) {
		Banda entity = bandaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("id não encontrado"));
		bandaRepository.delete(entity);	
	}
}
