package com.reservavuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservavuelos.model.Vuelo;
import com.reservavuelos.repository.VueloRepository;

@Service
public class VueloService {

	@Autowired
	VueloRepository vueloRepository;
	
	public List<Vuelo> getVuelo() {
		return vueloRepository.findAll();
	}
	
	public Vuelo getVueloById(long idvuelo) {
		return vueloRepository.findById(idvuelo).get();
	}
	
	public Vuelo createVuelo(Vuelo vuelo) {
		return vueloRepository.save(vuelo);
	}
	
	public Vuelo updateVuelo(Vuelo vuelo) {
		return vueloRepository.save(vuelo);
	}
	
	public void deleteVuelo(long idvuelo){  
		vueloRepository.deleteById(idvuelo);
	} 

}
