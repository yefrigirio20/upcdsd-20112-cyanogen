package com.venta.pasajes.service;

import javax.jws.WebService;

import com.venta.pasajes.dao.UsuarioDao;
import com.venta.pasajes.dao.UsuarioDaoImpl;
import com.venta.pasajes.model.Usuario;

@WebService(endpointInterface="com.venta.pasajes.service.UsuarioServicio")
public class UsuarioServicioImpl implements UsuarioServicio {


	private UsuarioDao usuarioDao= new UsuarioDaoImpl();

	@Override
	public void registrarUsuario(Usuario usuario) {
		usuarioDao.registrarUsuario(usuario);
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		usuarioDao.eliminarUsuario(usuario);
	}

	@Override
	public Usuario buscarUsuario(int idUsuario) {
		return usuarioDao.buscarUsuario(idUsuario);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		usuarioDao.actualizarUsuario(usuario);
		
	}
}
