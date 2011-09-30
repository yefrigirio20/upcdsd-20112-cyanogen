package com.venta.pasajes.service;

import com.venta.pasajes.model.Usuario;

public interface UsuarioServiceClient {
	public Usuario registrarUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
	public Usuario buscarUsuario(String codUsuario, String password);
	public void actualizarUsuario(Usuario usuario);
}
