package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Usuario;

@WebService
public interface UsuarioServicio {
	public String findNameUser(String user);
	
	public boolean RegistrarUsuario(Usuario usuario);
	
	public List<Usuario> ListarUsuario();
	
	public boolean ModificarUsuario(Usuario usuario);
	
	
}
