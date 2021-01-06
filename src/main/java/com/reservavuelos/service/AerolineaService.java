package com.reservavuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservavuelos.model.Aerolinea;
import com.reservavuelos.repository.AerolineaRepository;

@Service
public class AerolineaService {
	
	@Autowired
	AerolineaRepository aerolineaRepository;
	
	public List<Aerolinea> getAerolinea() {
		return aerolineaRepository.findAll();
	}
	
	public Aerolinea getAerolineaById(long idaerolinea) {
		return aerolineaRepository.findById(idaerolinea).get();
	}
	
	public Aerolinea createAerolinea(Aerolinea aerolinea) {
		return aerolineaRepository.save(aerolinea);
	}
	
	public Aerolinea updateAerolinea(Aerolinea aerolinea) {
		return aerolineaRepository.save(aerolinea);
	}
	
	public void deleteAerolinea(long idaerolinea){  
		aerolineaRepository.deleteById(idaerolinea);
	} 

}
