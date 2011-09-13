package com.venta.pasajes.service;


import javax.jws.WebService;

@WebService(endpointInterface="com.venta.pasajes.service.UsuarioServicio")
public interface UsuarioServicio {
	
	
	public String findNameUser(String user);
	
}
