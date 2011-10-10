package com.venta.pasajes.service;

import java.util.List;

import com.venta.pasajes.model.Usuario;

public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public boolean registrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarUsuario(String codUsuario, String password) {
		Usuario usuario = null;

		if(codUsuario.equals("JROA") && password.equals("123456"))
		{
			usuario = new Usuario();
			usuario.setCodUsuario("JROA");
			usuario.setNomUsuario("JONATHAN");
			usuario.setApepatUsuario("ROA");
			usuario.setApematUsuario("CANSAYA");
			usuario.setTipoDocumento(1);
			usuario.setNumDocumento("42364208");
			usuario.setSexo(1);
			usuario.setEmail("jroa_3000@hotmail.com");
			usuario.setPassword("123456");
		}
		return usuario;
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> getLista() {
		// TODO Auto-generated method stub
		return null;
	}
}
