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

import com.reservavuelos.model.Usuario;
import com.reservavuelos.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/usuario")
	public List<Usuario> getUsuario() {
		return usuarioService.getUsuario();
	}
	
	@GetMapping("/usuario/{idusuario}")
	public Usuario getUsuarioById(@PathVariable long idusuario) {
		return usuarioService.getUsuarioById(idusuario);
	}
	
	@PostMapping("/usuario")
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioService.createUsuario(usuario);
	}
	
	@PutMapping("/usuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
		return usuarioService.updateUsuario(usuario);
	}

	@DeleteMapping("/usuario/{idusuario}")
	public void deleteUsuario(@PathVariable long idusuario){
		usuarioService.deleteUsuario(idusuario);
	}
	
	
}
