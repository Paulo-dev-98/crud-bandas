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
	
	
   //lista todas as bandas
	@Override
	public List<BandaDTO> buscarTodos() {
		
		return this.bandaRepository
				.findAll()
				.stream()
				.map(e -> bandaMapper.converterBandaEntityParaBandaDto(e))
				.collect(Collectors.toList());

	}
	
	// buscando banda por id
	@Override
	public BandaDTO buscarBandaPorId(Integer id) {
		try {
			Banda banda = bandaRepository.findById(id).get();
			return bandaMapper.converterBandaEntityParaBandaDto(banda);
		} catch (Exception e) {
			throw new RuntimeException("id não encontrado");
		}
	}
	
//	public List<BandaDTO> buscarBandasPorAlbuns(Integer albumId){
//		return this.bandaRepository
//				.findByAlbuns(Arrays.asList(new Albuns(albumId)), true)
//				.Stream()
//				.map(this.bandaMapper::converterBandaEntityParaBandaDto)
//				.collect(Collectors.toList());
//	}


    // salva banda
	@Override
	public BandaDTO salvarBanda(BandaDTO bandaDto) {
       Banda entity = bandaMapper.converterBandaDtoParaEntity(bandaDto);
       bandaRepository.save(entity);
       return bandaMapper.converterBandaEntityParaBandaDto(entity);
	}
	
	// atualizar dados
	public BandaDTO atualizarBanda(BandaDTO bandaDto) {
		Banda entity = bandaRepository.save(bandaMapper.converterBandaDtoParaEntity(bandaDto));
		return bandaMapper.converterBandaEntityParaBandaDto(entity);
	}
}
