package com.venta.pasajes.service;

import com.venta.pasajes.model.Usuario;



public class UsuarioServicioImpl implements UsuarioServicio {

	public String findNameUser(String user) {	
		Usuario usu= new Usuario();
		usu.setUser("DGOMEZ");
		usu.setNombre("David");
		return usu.getNombre();
	}

}
