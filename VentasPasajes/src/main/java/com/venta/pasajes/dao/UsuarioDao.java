package com.venta.pasajes.dao;

import java.util.List;

import com.venta.pasajes.model.Usuario;

public interface UsuarioDao {
	public boolean registrarUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
	public Usuario buscarUsuario(String codUsuario,String password);
	public void actualizarUsuario(Usuario usuario);
	public List<Usuario> getLista();
	public Usuario buscarUsuario(String codUsuario);
}
