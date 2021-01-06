package com.reservavuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservavuelos.model.Usuario;
import com.reservavuelos.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> getUsuario() {
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuarioById(long idusuario) {
		return usuarioRepository.findById(idusuario).get();
	}
	
	public Usuario createUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deleteUsuario(long idusuario){  
		usuarioRepository.deleteById(idusuario);
	} 

	
}
