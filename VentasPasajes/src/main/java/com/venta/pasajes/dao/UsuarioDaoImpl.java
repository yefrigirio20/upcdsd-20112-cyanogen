package com.venta.pasajes.dao;

import com.venta.pasajes.model.Usuario;


public class UsuarioDaoImpl implements UsuarioDao{

	@Override
	public void registrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarUsuario(int idUsuario) {
		Usuario usuario= null;
		usuario = new Usuario();
		usuario.setNumDocumento("42364208");
		return usuario;
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
