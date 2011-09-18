package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Usuario;


@WebService(endpointInterface="com.venta.pasajes.service.UsuarioServicio")
public class UsuarioServicioImpl implements UsuarioServicio {

	@Override
	public String findNameUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int RegistrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public List<Usuario> ListarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ModificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
/*
	public String findNameUser(String user) {	
		Usuario usu= new Usuario();
		usu.setUser("DGOMEZ");
		usu.setNombre("David");
		return usu.getNombre();
	}
*/
}
