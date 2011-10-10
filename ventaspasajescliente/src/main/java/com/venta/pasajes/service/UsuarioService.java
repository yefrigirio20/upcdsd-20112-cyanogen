package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.venta.pasajes.model.Usuario;

@WebService
public interface UsuarioService {
	public boolean registrarUsuario(@WebParam(name = "usuario")Usuario usuario);
	public void eliminarUsuario(@WebParam(name = "usuario")Usuario usuario);
	public Usuario buscarUsuario(@WebParam(name = "codUsuario")String codUsuario, @WebParam(name = "password") String password);
	public void actualizarUsuario(@WebParam(name = "usuario")Usuario usuario);
	public List<Usuario> getLista();
}
