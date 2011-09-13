package com.venta.pasajes.service;

import javax.jws.WebService;

@WebService
public interface UsuarioServicio {
	public String findNameUser(String user);
}
