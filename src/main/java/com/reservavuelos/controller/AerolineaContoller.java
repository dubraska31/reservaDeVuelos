package com.reservavuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservavuelos.model.Aerolinea;
import com.reservavuelos.service.AerolineaService;

@RestController
public class AerolineaContoller {

	@Autowired
	AerolineaService aerolineaService;
	
	@GetMapping("/aerolinea")
	public List<Aerolinea> getAerolinea() {
		return aerolineaService.getAerolinea();
	}
	
	@GetMapping("/aerolinea/{idaerolinea}")
	public Aerolinea getAerolineaById(@PathVariable long idaerolinea) {
		return aerolineaService.getAerolineaById(idaerolinea);
	}
	
	@PostMapping("/aerolinea")
	public Aerolinea createAerolinea(@RequestBody Aerolinea aerolinea) {
		return aerolineaService.createAerolinea(aerolinea);
	}
	
	@PutMapping("/aerolinea")
    public Aerolinea updateAerolinea(@RequestBody Aerolinea aerolinea) {
		return aerolineaService.updateAerolinea(aerolinea);
	}

	@DeleteMapping("/aerolinea/{idaerolinea}")
	public void deleteAerolinea(@PathVariable long idaerolinea){
		aerolineaService.deleteAerolinea(idaerolinea);
	}
	
	
}
