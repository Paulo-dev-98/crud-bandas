package com.crudbanda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudbanda.model.dto.BandaDTO;
import com.crudbanda.service.BandaService;

@RestController
@RequestMapping("/api/bandas")
public class BandaController {
	
	private final BandaService bandaService;
	
	public BandaController(BandaService bandaService) {
		this.bandaService = bandaService;
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<BandaDTO>> buscarTodos(){
		return ResponseEntity.ok(bandaService.buscarTodos());
	}
	
	@PostMapping(value = "/new")
	public ResponseEntity<BandaDTO> salvarBanda(@RequestBody BandaDTO banda){
		return ResponseEntity.ok(bandaService.salvarBanda(banda));
	}

}
