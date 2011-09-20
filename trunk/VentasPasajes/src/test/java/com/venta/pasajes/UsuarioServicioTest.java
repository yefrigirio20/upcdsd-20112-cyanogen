package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.service.UsuarioServicio;
import com.venta.pasajes.service.UsuarioServicioImpl;

public class UsuarioServicioTest {

	@Test
	public void buscarUsuarioTest(){
		Usuario usuario= null;
		UsuarioServicio usuarioServicio = new UsuarioServicioImpl();
		usuario = usuarioServicio.buscarUsuario("JROA","123456");
		Assert.assertEquals("42364208", usuario.getNumDocumento());
	}

}
