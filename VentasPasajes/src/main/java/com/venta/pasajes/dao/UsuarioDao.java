package com.venta.pasajes.dao;

import com.venta.pasajes.model.Usuario;

public interface UsuarioDao {
	public void registrarUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
	public Usuario buscarUsuario(int idUsuario);
	public void actualizarUsuario(Usuario usuario);

}
