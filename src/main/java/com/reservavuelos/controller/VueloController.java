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

import com.reservavuelos.model.Vuelo;
import com.reservavuelos.service.VueloService;

@RestController
public class VueloController {

	@Autowired
	VueloService vueloService;
	
	@GetMapping("/vuelo")
	public List<Vuelo> getVuelo() {
		return vueloService.getVuelo();
	}
	
	@GetMapping("/vuelo/{idvuelo}")
	public Vuelo getVueloById(@PathVariable long idvuelo) {
		return vueloService.getVueloById(idvuelo);
	}
	
	@PostMapping("/vuelo")
	public Vuelo createVuelo(@RequestBody Vuelo vuelo) {
		return vueloService.createVuelo(vuelo);
	}
	
	@PutMapping("/vuelo")
    public Vuelo updateVuelo(@RequestBody Vuelo vuelo) {
		return vueloService.updateVuelo(vuelo);
	}

	@DeleteMapping("/vuelo/{idvuelo}")
	public void deleteVuelo(@PathVariable long idvuelo){
		vueloService.deleteVuelo(idvuelo);
	}
	
	
	
}
