package com.venta.pasajes.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.venta.pasajes.model.Usuario;

@WebService
public interface UsuarioServicio {
	public void registrarUsuario(@WebParam(name = "usuario")Usuario usuario);
	public void eliminarUsuario(@WebParam(name = "usuario")Usuario usuario);
	public Usuario buscarUsuario(@WebParam(name = "dni")String dni);
	public void actualizarUsuario(@WebParam(name = "usuario")Usuario usuario);
	
}
