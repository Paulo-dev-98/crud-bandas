package com.crudbanda.service;

import java.util.List;

import com.crudbanda.model.dto.BandaDTO;

public interface BandaService {
	List<BandaDTO> buscarTodos();
	
	BandaDTO salvarBanda(BandaDTO banda);
	
	BandaDTO atualizarBanda(BandaDTO banda);
	
	BandaDTO buscarBandaPorId(Integer id);
	
	void deletarBandaPorId(Integer id);
	
//	List<BandaDTO> buscarBandasPorAlbuns(Integer albumId);
}
