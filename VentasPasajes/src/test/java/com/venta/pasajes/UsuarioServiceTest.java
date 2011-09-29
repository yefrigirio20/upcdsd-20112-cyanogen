package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.service.UsuarioService;
import com.venta.pasajes.service.UsuarioServiceImpl;

public class UsuarioServiceTest {

	@Test
	public void buscarUsuarioTest(){
		Usuario usuario= null;
		UsuarioService usuarioServicio = new UsuarioServiceImpl();
		usuario = usuarioServicio.buscarUsuario("JROA","123456");
		Assert.assertEquals("42364208", usuario.getNumDocumento());
	}

}
