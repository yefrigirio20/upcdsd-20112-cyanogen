package com.venta.pasajes.service;

import javax.jws.WebService;

import com.venta.pasajes.model.Usuario;


@WebService(endpointInterface="com.venta.pasajes.service.UsuarioServicio")
public class UsuarioServicioImpl implements UsuarioServicio {

	public String findNameUser(String user) {	
		Usuario usu= new Usuario();
		usu.setUser("DGOMEZ");
		usu.setNombre("David");
		return usu.getNombre();
	}

}
