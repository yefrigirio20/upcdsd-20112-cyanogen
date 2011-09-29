package com.venta.pasajes.service;

import javax.jws.WebService;

import com.venta.pasajes.dao.UsuarioDao;
import com.venta.pasajes.dao.UsuarioDaoImpl;
import com.venta.pasajes.model.Usuario;

@WebService(endpointInterface="com.venta.pasajes.service.UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDao usuarioDao= new UsuarioDaoImpl();

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		return usuarioDao.registrarUsuario(usuario);
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		usuarioDao.eliminarUsuario(usuario);
	}

	@Override
	public Usuario buscarUsuario(String codUsuario, String password) {
		return usuarioDao.buscarUsuario(codUsuario, password);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		usuarioDao.actualizarUsuario(usuario);
		
	}
}
