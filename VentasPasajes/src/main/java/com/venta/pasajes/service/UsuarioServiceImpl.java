package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.venta.pasajes.dao.UsuarioDao;
import com.venta.pasajes.model.Usuario;

@WebService(endpointInterface="com.venta.pasajes.service.UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public boolean registrarUsuario(Usuario usuario) {
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

	@Override
	public List<Usuario> getLista() {
		return usuarioDao.getLista();
	}
}
