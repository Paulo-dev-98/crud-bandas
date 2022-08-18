package com.crudbanda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudbanda.model.dto.BandaDTO;
import com.crudbanda.service.BandaService;

@RestController
@RequestMapping("/api/bandas")
public class BandaController {
	
	@Autowired
	private BandaService bandaService;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<BandaDTO>> buscarTodos(){
		return ResponseEntity.ok(bandaService.buscarTodos());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BandaDTO> buscarBandaPorId(@PathVariable("id") Integer id){
		return ResponseEntity.ok(bandaService.buscarBandaPorId(id));
	}
	
//	public ResponseEntity<List<BandaDTO>> buscarBandasPorAlbuns(@PathVariable("albunsId") Integer albunsId){
//		return ResponseEntity.ok(bandaService.buscarBandasPorAlbuns(albunsId));
//	}
	
	@PostMapping(value = "/new")
	public ResponseEntity<BandaDTO> salvarBanda(@RequestBody BandaDTO banda){
		return ResponseEntity.ok(bandaService.salvarBanda(banda));
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<BandaDTO> atualizarBanda(@RequestBody BandaDTO banda){
		return ResponseEntity.ok(bandaService.atualizarBanda(banda));
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<BandaDTO> deletarBanda(@PathVariable("id") Integer id){
		bandaService.deletarBandaPorId(id);
		return ResponseEntity.ok().build();
	}

}
